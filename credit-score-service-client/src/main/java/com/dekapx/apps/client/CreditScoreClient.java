package com.dekapx.apps.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.dekapx.apps.common.ResourceUrls.BASE_URL;
import static com.dekapx.apps.common.ResourceUrls.CREDIT_SCORE_SERVICE_URL;
import static com.dekapx.apps.common.ResourceUrls.INFO_URL;

@FeignClient(name = "CreditScoreClient", url = CREDIT_SCORE_SERVICE_URL, path = BASE_URL)
public interface CreditScoreClient {
    @GetMapping(INFO_URL)
    String getInfo();
}
