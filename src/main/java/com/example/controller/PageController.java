package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *     Các bạn có thể tìm hiểu thêm  phần này tại blogs: https://levunguyen.com,
 *     blogs chuyên về lập trình và các kỹ năng mềm trong nghề lập trình
 */
@Controller
public class PageController {
   @GetMapping("/international")
   public String getInternationalPage() {
      return "international";
   }
}