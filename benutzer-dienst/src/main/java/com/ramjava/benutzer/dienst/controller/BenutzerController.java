package com.ramjava.benutzer.dienst.controller;

import com.ramjava.benachrichtigung.service.model.Benachrichtigungen;
import com.ramjava.benutzer.dienst.model.Benutzer;
import com.ramjava.post.dienst.model.Posts;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping
public class BenutzerController {

    private final RestTemplate restTemplate;

    public static final String BENUTZER_DIENST = "benutzerDienstFallback";

    public BenutzerController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping(value = "/{userId}")
    @CircuitBreaker(name = BENUTZER_DIENST, fallbackMethod = "getBenutzer")
    public Benutzer getBenutzer(@PathVariable("userId") String userId) {
        var benutzerOne = new Benutzer(userId, "User Name" + userId, "xxxxxx" + userId);

        Posts posts = restTemplate.getForObject("http://post-service/post/1", Posts.class);
        benutzerOne.setPosts(posts);
        Benachrichtigungen benachrichtigungen = restTemplate.getForObject("http://benachrichtigung-service/post/1", Benachrichtigungen.class);
        benutzerOne.setBenachrichtigungen(benachrichtigungen);
        return benutzerOne;
    }

    public Benutzer getBenutzerFallback(Exception benutzerException) {
        return new Benutzer("1", "Benutzer One", "123456");
    }

    
}
