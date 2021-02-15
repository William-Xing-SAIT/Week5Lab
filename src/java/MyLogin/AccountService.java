/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLogin;

import java.io.Serializable;
import java.util.ArrayList;


/**
 *
 * @author 814545
 */
public class AccountService implements Serializable {
    
    private final ArrayList<User> users = new ArrayList<>(); 
    
    public User login(String username, String password) 

    {
        User user1 = new User("abe", "password");
        User user2 = new User("barb", "password");
        User user0 = null;
        users.add(user1);
        users.add(user2);
        
        for(int i = 0; i<users.size(); i++)
        {
            if (username.equals((users.get(i).getUsername())) && password.equals((users.get(i).getPassword()))){
                user0 = new User(username, password);
            }
            else
            {
                
            }
        }
        return user0;
    
    }
}
   
