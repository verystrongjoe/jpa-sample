package org.test.skeleton;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.test.skeleton.entity.User;
import org.test.skeleton.repository.MessageDao;
import org.test.skeleton.repository.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@Transactional
@ActiveProfiles("test")
public class ApplicationTests 
{
	
	@Autowired UserDao userDao;
	@Autowired MessageDao messageDao;
	
	@Test
	public void insert() throws Exception {
		User user = new User();
		
		String email="test@gmail.com";;
		String firstName="Christ";
		String lastName="Jejus";
		String password = "kkk";
		long id = 5;
		
		user.setId(id);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setPassword(password);
		user.setEmail(email);
		
		User savedUser = userDao.save(user);
		
		assertNotNull(userDao.findOne(savedUser.getId()));
		
	}

	@Test
	public void read() {
		List<User> list = (List<User>) userDao.findAll();
		assertTrue(list.size()>= 1);
	}


	@Test
	public void delete() {
		messageDao.deleteAll(); // delete authorize annotation for test
		assertEquals(messageDao.count(), 0);
	}
	

	@Test
	public void update() {
		List<User> list = (List<User>) userDao.findAll();
		User user = list.get(list.size()-1);
		String previousEmail = user.getEmail();
		
		user.setEmail("verystrongjoe@xxx.com");
		userDao.save(user);
		User updatedUser = userDao.findOne(user.getId());
		String recetnEmail = updatedUser.getEmail();
		
		assertTrue(!previousEmail.equals(recetnEmail));
	}
	
	
	
	


}
