package com.collabdocs.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("version")
public class VersionController {

    @GetMapping()
    String getVersion(){
        return "<h1>collab-docs-v1.0.0<h1>";
    }
}
