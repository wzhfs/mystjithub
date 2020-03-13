package org.qdbdjx.testjithub.tjwy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.crypto.Data;
import java.util.Date;

@RestController

public class jtwy1 {
    @RequestMapping("/hi")
    public String sayHi(){

        return " hi now is :" +   new Date().toString();
    }
}
