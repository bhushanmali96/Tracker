package io.tracker.coronavirustracker.controllers;

import io.tracker.coronavirustracker.models.LocationStats;
import io.tracker.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/home")
    public String home(Model model) {
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        model.addAttribute("locationStats", allStats);
        return "home";
    }
}
