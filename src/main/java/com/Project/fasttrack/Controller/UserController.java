package com.Project.fasttrack.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.fasttrack.model.users;

@RestController

@RequestMapping("/api/users")
public class UserController {



@GetMapping
    public List <users> getusers()
    {
        return Arrays.asList(new users(1l,"John Doe","aBc6o@example.com"),new users(2l,"John Doe","aBc6o@example.com"));
    }

}
