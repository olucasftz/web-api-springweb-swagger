package com.firstwebapi.repository;

import com.firstwebapi.handler.BusinessException;
import com.firstwebapi.handler.FieldMandatoryException;
import com.firstwebapi.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User user){
        if(user.getLogin()==null )
            throw new FieldMandatoryException("login");

        if(user.getPassword()==null)
            throw new FieldMandatoryException("password");

        if(user.getId()==null)
            System.out.println("SAVE - Getting the user in the repository layer");
        else
            System.out.println("UPDATE - Getting the user in the repository layer");

        System.out.println(user);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Getting the id: %d to delete a user", id));
        System.out.println(id);
    }
    public List<User> findAll(){
        System.out.println("LIST - Listing system users");
        List<User> Users = new ArrayList<>();
        Users.add(new User("gleyson","password"));
        Users.add(new User("Lucas","irineu"));
        return Users;
    }
    public User findById(Integer id){
        System.out.println(String.format("FIND/id - Getting the id: %d to find a user", id));
        return new User("gleyson","password");
    }
    public User findByUsername(String username){
        System.out.println(String.format("FIND/username - Getting the username: %s to find a user", username));
        return new User("gleyson","password");
    }
}
