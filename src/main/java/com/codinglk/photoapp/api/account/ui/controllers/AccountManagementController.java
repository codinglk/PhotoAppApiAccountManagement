package com.codinglk.photoapp.api.account.ui.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/account")
public class AccountManagementController {

    @GetMapping("/status/check")
    public String status(){
        return "Working";
    }

}
