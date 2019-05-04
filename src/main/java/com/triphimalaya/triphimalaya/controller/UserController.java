package com.triphimalaya.triphimalaya.controller;

import com.triphimalaya.triphimalaya.core.user.entity.User;
import com.triphimalaya.triphimalaya.core.user.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping("user/")
public class UserController {
    private UserService userService;
    private String imagePath = null;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PutMapping(value = "save")
    public ResponseEntity<?> saveUser(@RequestBody User user){
        if(imagePath != null){
            user.setImagePath(imagePath);
            imagePath = null;
        }
        return new ResponseEntity(userService.save(user), HttpStatus.OK);
    }

    @PostMapping(value = "/uploadImage")
    public void saveUserImage(@RequestParam("file") MultipartFile multipartFile) {
        if (multipartFile.isEmpty()) {
            System.out.println("Select Signature Image");
        }

        try {
            byte[] bytes = multipartFile.getBytes();
            SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");//dd/MM/yyyy
            Date now = new Date();
            String strDate = sdfDate.format(now);
            Path path = Paths.get("classpath/images/"+strDate);
            imagePath = path.toString();
            System.out.println(imagePath);
            Files.write(path, bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
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
