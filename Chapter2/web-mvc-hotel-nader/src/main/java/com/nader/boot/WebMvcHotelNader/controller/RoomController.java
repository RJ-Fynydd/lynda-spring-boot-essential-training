package com.nader.boot.WebMvcHotelNader.controller;

import com.nader.boot.WebMvcHotelNader.service.RoomServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Richard Nader Jr. <heelyskidrj@gmail.com>
 */
@Controller
@RequestMapping("/rooms")
public class RoomController {
    
    private RoomServices roomServices;
    
    @Autowired
    public RoomController(RoomServices roomServices) {
        super();
        this.roomServices = roomServices;
    }
    
    @GetMapping
    public String getAllRooms(Model model) {
        model.addAttribute("rooms", roomServices.getAllRooms());
        return "rooms";
    }
    
}
