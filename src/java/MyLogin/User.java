/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyLogin;

/**
 *
 * @author 814545
 */
public class User{
        private String username;
        private String password;
        
        public User(String un, String pw){
            username = un;
            password = pw;
        }
        
        public void setUsername(String un){
            username = un;
        }
        
        public void setPassword(String pw){
            password = pw;
        }
        
        public String getUsername(){
        return username;
        }
        public String getPassword(){
        return password;
    }
        
        
        
    }