package cosi.controller;

import cosi.service.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {

    @Autowired
    private CalcService calcService;

    @RequestMapping(path="/calc", method= RequestMethod.GET)
    public Double calc(Double x1, Double x2) {
        return calcService.calc(x1, x2);
    }

}
