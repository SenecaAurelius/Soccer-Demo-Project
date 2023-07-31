package com.example.SoccerDemoProject.controllers;

import com.example.SoccerDemoProject.data.PlayerRepository;
import com.example.SoccerDemoProject.models.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("players")
public class HomeController {

    @Autowired
    private PlayerRepository playerRepository;


    Player crystalDunn = new Player("Crystal Dunn", 5, "images/580_DUNN_CRYSTAL_4323.jpg");
    Player kelleyOHara = new Player("Kelley O'Hara", 2, "/images/580OHARAKELLEY4623.jpg");
    Player alexMorgan = new Player("Alex Morgan", 20, "/images/580_MORGAN_ALEX_4323.jpg");
    Player roseLavelle = new Player("Rose Lavelle", 6, "images/580_LAVELLE_ROSE_4323.jpg");
    Player crystalDunn1 = new Player("Crystal Dunn", 5, "images/580_DUNN_CRYSTAL_4323.jpg");
    Player kelleyOHara1 = new Player("Kelley O'Hara", 2, "/images/580OHARAKELLEY4623.jpg");
    Player alexMorgan1 = new Player("Alex Morgan", 20, "/images/580_MORGAN_ALEX_4323.jpg");
    Player roseLavelle1 = new Player("Rose Lavelle", 6, "images/580_LAVELLE_ROSE_4323.jpg");
    Player crystalDunn2 = new Player("Crystal Dunn", 5, "images/580_DUNN_CRYSTAL_4323.jpg");
    Player kelleyOHara2 = new Player("Kelley O'Hara", 2, "/images/580OHARAKELLEY4623.jpg");
    Player alexMorgan2 = new Player("Alex Morgan", 20, "/images/580_MORGAN_ALEX_4323.jpg");
    Player roseLavelle2 = new Player("Rose Lavelle", 6, "images/580_LAVELLE_ROSE_4323.jpg");
    Player crystalDunn12 = new Player("Crystal Dunn", 5, "images/580_DUNN_CRYSTAL_4323.jpg");
    Player kelleyOHara12 = new Player("Kelley O'Hara", 2, "/images/580OHARAKELLEY4623.jpg");
    Player alexMorgan12 = new Player("Alex Morgan", 20, "/images/580_MORGAN_ALEX_4323.jpg");
    Player roseLavelle12 = new Player("Rose Lavelle", 6, "images/580_LAVELLE_ROSE_4323.jpg");
    List<Player> players = new ArrayList<Player>(Arrays.asList(crystalDunn, kelleyOHara, alexMorgan, roseLavelle, crystalDunn1, kelleyOHara1, alexMorgan1, roseLavelle1,
            crystalDunn2, kelleyOHara2, alexMorgan2, roseLavelle2, crystalDunn12, kelleyOHara12, alexMorgan12, roseLavelle12));

//    players.put(crystalDunn);

    @GetMapping
    public String displayPlayers(Model model){
        model.addAttribute("players", players);

        return "index";
    }
}
