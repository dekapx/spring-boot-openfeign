package com.dekapx.apps.client;

import com.dekapx.apps.model.CreditScore;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import static com.dekapx.apps.common.ResourceUrls.INFO_URL;
import static com.dekapx.apps.common.ResourceUrls.SCORE_BY_PPS_URL;

@FeignClient(name = "creditScoreClient", url = "${feign.client.config.creditScoreClient.url}")
public interface CreditScoreClient {
    @GetMapping(INFO_URL)
    String getInfo();

    @GetMapping(SCORE_BY_PPS_URL)
    CreditScore getScore(@PathVariable String ppsn);
}

