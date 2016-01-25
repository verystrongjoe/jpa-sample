package org.test.skeleton;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.test.skeleton.entity.User;
import org.test.skeleton.repository.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ApplicationTests 
{

	@Autowired
	UserDao userDao;

	@Test
	public void create() {

		
		User user = null;
		String email="test@gmail.com";;
		String firstName="Christ";
		String lastName="Jejus";
		String password = "kkk";
		long id = 1;
		
		try {
			boolean enabled = true;
			user = new User();
			
			user.setId(id);
			user.setFirstName(firstName);
			user.setLastName(lastName);
			user.setPassword(password);
			user.setEmail(email);
			
			
			userDao.save(user);
		}
		catch (Exception ex) {
			System.err.println("Error creating the user: " + ex.toString());
		}
		System.err.println("User succesfully created! (user = " + user.toString() + ")");
	}




	//	@Test
	//  public void insert()
	//  {
	//      SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	//      Stock stock = new Stock("C0001", "StockCode");
	//      
	//      Session session = sessionFactory.openSession();
	//      
	//      session.beginTransaction();
	//      session.save(stock);
	//      session.getTransaction().commit();
	//      System.out.println("Insert completed");
	//   
	//      session.close();
	//      sessionFactory.close();
	//  }



}
