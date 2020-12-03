package com.project.work.controller;

import com.project.work.deviceservice.DeviceService;
import com.project.work.model.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AppController {

    @Autowired
    private DeviceService deviceService;

    public ResponseEntity getDevices(){
        List<Device> devices = deviceService.getAllDevices();
        return new ResponseEntity(devices, HttpStatus.OK);
    }
}
