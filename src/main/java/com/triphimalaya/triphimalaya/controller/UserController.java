package com.triphimalaya.triphimalaya.controller;

import com.triphimalaya.triphimalaya.core.user.entity.User;
import com.triphimalaya.triphimalaya.core.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("user/")
@AllArgsConstructor
public class UserController {
    private UserService userService;

    @PutMapping(value = "save")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        return new ResponseEntity(userService.save(user), HttpStatus.OK);
    }

    @GetMapping(value = "getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(value = "delete")
    public ResponseEntity<?> delete(@RequestBody User user){
        return new ResponseEntity(userService.delete(user), HttpStatus.OK);
    }

}
