package com.example.cricard.player;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/players")
public class PlayerController {

    @GetMapping
    public List<Player> getAllPlayers(){
        List<Player> players = Arrays.asList(
                new Player(1L,
                        "Anudeep",
                        "basavarajuanudeep@gmail.com",
                        23,
                        Gender.MALE,
                        "0894412925"),
                new Player(2L,
                        "Siri",
                        "siri@gmail.com",
                        23,
                        Gender.FEMALE,
                        "0894412925")

        );
        return players;
    }
}
