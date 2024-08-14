package com.example.mindful_oasis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.example.mindful_oasis.model.Stress;
import com.example.mindful_oasis.model.User;
//import com.example.mindful_oasis.repository.StressRepo;
import com.example.mindful_oasis.repository.UserRepo;
//import com.example.mindful_oasis.service.StressService;
import com.example.mindful_oasis.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class UserController {
    @Autowired
    private UserService us;
    @Autowired
    private UserRepo ur;

    /*@Autowired
    Stress strs;

    @Autowired
    StressRepo strrep;

    @Autowired
    StressService strser;*/

    @PostMapping("/add")
    public User AddUser(@RequestBody User user){
        return us.postData(user);
    }
    @PostMapping("/login")
  public User loginUser(@RequestBody User loginDetails){
  User user= ur.findByEmail(loginDetails.getEmail());
     if (user != null && user.getPassword().equals(loginDetails.getPassword())) {
           return user;
        } else {
            throw new RuntimeException("Invalid login credentials");
        }
    }
     /* 
    @PostMapping("/stressadd")
    public Stress AddUsers(@RequestBody Stress user){
        return strser.postData(user);
    }
    */
}
