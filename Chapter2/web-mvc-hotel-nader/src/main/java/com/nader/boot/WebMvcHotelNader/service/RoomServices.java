package com.nader.boot.WebMvcHotelNader.service;

import com.nader.boot.WebMvcHotelNader.model.Room;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Richard Nader Jr. <heelyskidrj@gmail.com>
 */
@Service
public class RoomServices {
    
    private static List<Room> rooms = new ArrayList<>();
    
    static {
        for(int i = 0; i<10; i++) {
            rooms.add(new Room(i, "Room " + i, "R" + i, "Q"));
        }
    }
    
    public List<Room> getAllRooms() {
        return rooms;
    }
    
}
