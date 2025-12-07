package com.example.project2.controller;

import com.example.project2.Object.Time;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    @RequestMapping("/api/Object")
    class controllerTime {
        @GetMapping ("")
        public ResponseEntity<Integer> getTimeHours () {
            Time t = new Time();
            return ResponseEntity.ok(t.getHours());
        }
    }





