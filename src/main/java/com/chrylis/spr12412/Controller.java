package com.chrylis.spr12412;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final Collection<String> values;

    @Autowired
    public Controller(@Qualifier("foo") Collection<String> values) {
        this.values = values;
    }

    @RequestMapping("/foo")
    public Collection<String> getValues() {
        return values;
    }
}
