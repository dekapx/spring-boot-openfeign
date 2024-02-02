package com.dekapx.apps.controller;

import com.dekapx.apps.client.CreditScoreClient;
import com.dekapx.apps.model.CreditScore;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dekapx.apps.common.ResourceUrls.BASE_URL;
import static com.dekapx.apps.common.ResourceUrls.INFO_URL;
import static com.dekapx.apps.common.ResourceUrls.SCORE_BY_PPS_URL;

@Slf4j
@RestController
@RequestMapping(BASE_URL)
public class CreditScoreClientController {
    @Autowired
    private CreditScoreClient creditScoreClient;

    @GetMapping(INFO_URL)
    public String getInfo() {
        String response = this.creditScoreClient.getInfo();
        log.info(response);
        return response;
    }

    @GetMapping(SCORE_BY_PPS_URL)
    public CreditScore getScore(@PathVariable String ppsn) {
        log.info("Credit Score request for PPSN {}", ppsn);
        return this.creditScoreClient.getScore(ppsn);
    }
}
