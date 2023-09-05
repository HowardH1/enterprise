package com.myplantdiary.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantDiaryController {
    /**
     * Handles the root (/) endpoint and return a start page
     * @return
     */
    @RequestMapping("/")
    public String Index()
    {
        return "start";
    }
}
