package com.triphimalaya.triphimalaya.controller;

import com.triphimalaya.triphimalaya.core.site.entity.Site;
import com.triphimalaya.triphimalaya.core.site.service.SiteService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("site/")
@AllArgsConstructor
public class SiteController {
    private SiteService siteService;

    @PutMapping(value = "save")
    public ResponseEntity<?> saveSite(@RequestBody Site site){
        return new ResponseEntity(siteService.save(site), HttpStatus.OK);
    }

    @GetMapping(value = "getAll")
    public ResponseEntity<?> getAll(){
        return new ResponseEntity(siteService.findAll(), HttpStatus.OK);
    }

    @DeleteMapping(value = "delete")
    public ResponseEntity<?> delete(@RequestBody Site site){
        return new ResponseEntity(siteService.delete(site), HttpStatus.OK);
    }

    @GetMapping(value = "getByLocation")
    public ResponseEntity<?> getByLocation(@RequestParam String name){
        return new ResponseEntity(siteService.findAllByName(name),HttpStatus.OK);
    }
}
