package com.triphimalaya.triphimalaya.controller;

import com.triphimalaya.triphimalaya.core.guide.enitity.Guide;
import com.triphimalaya.triphimalaya.core.guide.service.GuideService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("guide/")
@AllArgsConstructor
public class GuideController {
    private GuideService guideService;



    @PutMapping(value = "save")
    public ResponseEntity<?> saveGuide(@RequestBody Guide guide){
        return new ResponseEntity(guideService.save(guide), HttpStatus.OK);
    }

    @GetMapping(value = "getAll")
    public ResponseEntity<?> getAll(){

        return new ResponseEntity(guideService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(value = "delete")
    public ResponseEntity<?> delete(@RequestBody Guide guide){
        return new ResponseEntity(guideService.delete(guide), HttpStatus.OK);
    }

    @GetMapping(value = "getByLocation")
    public ResponseEntity<?> getByLocation(@RequestParam String location){
        return new ResponseEntity(guideService.findByLocation(location),HttpStatus.OK);
    }

}
