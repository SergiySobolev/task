package cosi.service.impl;

import cosi.service.CalcService;
import cosi.util.CalcUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CalcServiceImpl implements CalcService {
    @Override
    public Double calc(Double x1, Double x2) {
        log.debug("Begin calculation for input parameters: x1=[{}], x2=[{}]", x1, x2);
        Double result = CalcUtil.calc(x1, x2);
        log.info("Calculation result=[{}]", result);
        return result;
    }
}
