package com.nader.boot.WebMvcHotelNader.controller;

import com.nader.boot.WebMvcHotelNader.model.Room;
import com.nader.boot.WebMvcHotelNader.service.RoomServices;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Richard Nader Jr. <heelyskidrj@gmail.com>
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    
    private RoomServices roomServices;
    
    @Autowired
    public ApiController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }
    
    @RequestMapping("/rooms")
    public List<Room> getAllRooms() {
        return roomServices.getAllRooms();
    }
    
    
}
