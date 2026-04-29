package com.jojoldu.book.springboot.web.controller;

import com.jojoldu.book.springboot.domain.posts.PostsRepository;
import com.jojoldu.book.springboot.service.posts.PostsService;
import com.jojoldu.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final PostsService postsService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("posts",postsService.findAllDesc());
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsave() {
        return "posts_save";
    }

    @GetMapping("/posts/update/{id}")
    public String postsupdate(@PathVariable Long id, Model model) {
        PostsResponseDto dto= postsService.findById(id);
        model.addAttribute("posts",dto);
        return "posts_update";
    }
    @GetMapping("/posts/detail/{id}")
    public String postsDetail(@PathVariable Long id,Model model){
        PostsResponseDto dto = postsService.findById(id);
        model.addAttribute("posts",dto);
        return "posts_detail";
    }
}