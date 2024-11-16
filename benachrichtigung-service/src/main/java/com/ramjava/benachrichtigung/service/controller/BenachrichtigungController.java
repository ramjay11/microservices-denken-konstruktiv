package com.ramjava.benachrichtigung.service.controller;

import com.ramjava.benachrichtigung.service.model.Benachrichtigungen;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BenachrichtigungController {

    @GetMapping()
    public Benachrichtigungen getNotifications(@PathVariable("notificationId") String notificationId) {
        var notificationOne = new Benachrichtigungen(notificationId, "Benachrichtigungen Details " + notificationId);
        return notificationOne;
    }

}
