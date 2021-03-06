package com.nader.boot.WebMvcHotelNader.service;

import com.nader.boot.WebMvcHotelNader.RoomRepository;
import com.nader.boot.WebMvcHotelNader.model.Room;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Richard Nader Jr. <heelyskidrj@gmail.com>
 */
@Service
public class RoomServices {

    private RoomRepository roomRepository;

    @Autowired
    public RoomServices(RoomRepository roomRepository) {
        super();
        this.roomRepository = roomRepository;
    }
    
    public List<Room> getAllRooms() {
        List<Room> rooms = new ArrayList<>();
        this.roomRepository.findAll().forEach(rooms::add);
        return rooms;
    }
    
}
