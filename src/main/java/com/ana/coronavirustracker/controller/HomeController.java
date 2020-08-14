package com.ana.coronavirustracker.controller;

import com.ana.coronavirustracker.models.LocationStats;
import com.ana.coronavirustracker.services.CoronaVirusDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author Ana on 8/11/2020
 */

@Controller
public class HomeController {

    @Autowired
    CoronaVirusDataService coronaVirusDataService;

    @GetMapping("/")
    public String home(Model model){
        List<LocationStats> allStats = coronaVirusDataService.getAllStats();
        int totalCases = allStats.stream().mapToInt(stat -> stat.getLatestTotalCases()).sum();
        int newCases = allStats.stream().mapToInt(stat -> stat.getNewCasesPerLastDay()).sum();
        model.addAttribute("stats", allStats);
        model.addAttribute("totalReportedCases", totalCases);
        model.addAttribute("newCases", newCases);
        return "home";
    }
}
