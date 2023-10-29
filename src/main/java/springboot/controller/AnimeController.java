package springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springboot.domain.Anime;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {
    //localhost:8080/anime/list
    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("Fairy Tail"), new Anime("Ao Ashi"));
    }
}
