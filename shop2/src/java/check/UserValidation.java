/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check;

import dao.UserDao;
import model.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author Khoale123
 */
public class UserValidation implements Validator{

    @Override
    public boolean supports(Class<?> type) {
        return User.class.isAssignableFrom(type);
    }
   
    
   UserDao userDao = new UserDao();
    @Override
    public void validate(Object object, Errors errors) {
        User user = (User) object;
 
        if (user.getUserName().length() == 0) {
            errors.rejectValue("userName", "NotEmpty");
        }
 
        if (user.getUserEmail().length() == 0) {
            errors.rejectValue("userEmail", "NotEmpty"); 
 
        if (user.getUserPass().length() == 0) {
            errors.rejectValue("userPass", "NotEmpty");
        } else if (user.getUserPass().length() < 5 || user.getUserPass().length() > 20) {
            errors.rejectValue("userPass", "Error.Pass.Size");
          
        }
    }
        
        
        
    }
    
    
}
