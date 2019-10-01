package com.zensar.hibernate.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Movie;
import com.zensar.entities.Song;

public class OneToManyMappingDemo {

	public static void main(String[] args)
	{

		Configuration c=new Configuration().configure();
		SessionFactory f=c.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();

		Movie m = new Movie();
		m.setTitle("Anabelle");
		m.setReleaseDate(LocalDate.of(2010,06,12));
	
		Song s1=new Song("la la la la");
		Song s2=new Song("tara tara tara");
		Song s3=new Song("na na na na");
	
		s1.setMovie(m);
		s2.setMovie(m);
		s3.setMovie(m);

		List<Song> songs = new ArrayList<Song>();
		songs.add(s1);
		songs.add(s2);
		songs.add(s3);

		m.setSongs(songs);
		s.save(m);

		s.save(s1);
		s.save(s2);
		s.save(s3);

    
        t.commit();
		s.close();
		System.exit(0);
	}


}