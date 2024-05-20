
package com.mycompany.mycart.Dao;

import com.mycompany.mycart.entity.User;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import java.util.Scanner; 
//import spring.jpa.hibernate.ddl-auto;

public class userDao {
    private SessionFactory factory;

    public userDao(SessionFactory factory) {
        this.factory = factory;
    }

//get user by email  and password
    public User getUserByEmailAndPassword(String email, String password)
    {
        
        User user =null;
       
        try{
            String query = "from User where Email =: e and Password =: p";
            Session session = this.factory.openSession();
            Query q = session.createQuery(query);
            q.setParameter("e",email);
            q.setParameter("p", password);
            user = (User)q.uniqueResult();
//             unique result return user object

             session.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
         return user;
    }
    
}
