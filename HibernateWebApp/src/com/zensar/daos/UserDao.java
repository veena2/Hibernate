package com.zensar.daos;

import java.util.List;

import com.zensar.entities.User;

/**
 * @author Veena Kumari
 * @version1.0
 * @creation_date 21/sep/2019 5.30pm
 * @modification_date 21/sep/2019 5.30pm
 * @copyright Zensar Technologies, India. All rights reserved
 * @description It is data acess object interface
 * 				
 * 				
 */
public interface UserDao {
void insert(User user);
void update(User user);
void delete(User user);
User getByUsername(String username);
List<User> getAll();

}
