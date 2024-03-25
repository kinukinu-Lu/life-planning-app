package com.lifeplanning.app01

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView
import org.springframework.web.servlet.view.RedirectView

@Controller
class LifePlanningController {
    /**
     * Display the top page
     * @return top page HTML path
     */
    @GetMapping("/index")
    fun index(): ModelAndView = ModelAndView("/index")
}