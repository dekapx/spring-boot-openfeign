package com.dekapx.apps.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static com.dekapx.apps.common.ResourceUrls.INFO_URL;

@FeignClient(name = "creditScoreClient", url = "${feign.client.config.creditScoreClient.url}")
public interface CreditScoreClient {
    @GetMapping(INFO_URL)
    String getInfo();
}

