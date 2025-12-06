package com.project.fasttrack.controller; // Use your own package name

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DeliveryController {

    /**
     * This method handles requests to the "/delivery" URL.
     * It returns the string "delivery", which tells Spring Boot
     * to find and render the 'delivery.html' file from the 'templates' folder.
     */
    @GetMapping("/delivery")
    public String showDeliveryPage() {
        return "delivery"; // This matches 'delivery.html'
    }
}