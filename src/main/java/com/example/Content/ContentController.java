package com.example.Content;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;



@Controller
@RestController
@RequestMapping("/home")
public class ContentController {
    private final ContentRepository contentRepository;

    @Autowired

    public ContentController(ContentRepository contentRepository){
        this.contentRepository=contentRepository;

    }


    @GetMapping
    public List<ContentModel> findAll(){
        return contentRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<ContentModel> findById(@PathVariable Integer id){
        return contentRepository.findByid(id);
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public void create(@RequestBody ContentModel content){
         contentRepository.save(content);
    }
}
