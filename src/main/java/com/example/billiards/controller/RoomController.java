package com.example.billiards.controller;

import com.example.billiards.model.Room;
import com.example.billiards.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/room")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @PostMapping("/create")
    public Room createRoom(@RequestBody Room room) {
        return roomService.createRoom(room);
    }

    @GetMapping
    public List<Room> getAllRooms() {
        return roomService.getAllRooms();
    }

    @GetMapping("/{roomId}")
    public Room getRoomById(@PathVariable Long roomId) {
        return roomService.getRoomById(roomId);
    }
}
