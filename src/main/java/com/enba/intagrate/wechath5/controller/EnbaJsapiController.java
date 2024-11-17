package com.enba.intagrate.wechath5.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: enba
 * @description: 恩爸整合JSAPI
 */
@RequestMapping("/enba-jsapi")
@RestController
@Slf4j
public class EnbaJsapiController {

  @GetMapping("/index")
  public String index() {
    return "index";
  }
}
