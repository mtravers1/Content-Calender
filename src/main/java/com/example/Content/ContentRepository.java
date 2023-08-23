package com.example.Content;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import jakarta.annotation.PostConstruct;

@Repository
public class ContentRepository {
    private final List<ContentModel> contentList=new ArrayList<>();
    public ContentRepository(){

    }
    public List<ContentModel> findAll(){
        return contentList;
    }

    public Optional<ContentModel> findByid(Integer id){
        return contentList.stream().filter(c->c.id().equals(id)).findFirst();
    }  
    @PostConstruct
    public void init(){
        ContentModel c = new ContentModel(
            1,
            "title",
            "blah blah blah",
            Status.IN_PROGRESS,
            Type.VIDEO,
            "/dfdsfadf/df/.con"
        );

        contentList.add(c);
    }

    public void save(ContentModel content){
        contentList.removeIf(c->c.id().equals(content.id()));
        
       contentList.add(content);
    }

    public void delete(Integer id){
        contentList.removeIf(c->c.id().equals(id));
    }
}
