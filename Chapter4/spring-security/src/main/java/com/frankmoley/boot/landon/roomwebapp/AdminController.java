package com.frankmoley.boot.landon.roomwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author PotatoSauceVFX <rj@potatosaucevfx.com>
 */
@Controller
public class AdminController {

    @GetMapping("/login")
    public String getLoginPage() {
        return "login";
    }

}
