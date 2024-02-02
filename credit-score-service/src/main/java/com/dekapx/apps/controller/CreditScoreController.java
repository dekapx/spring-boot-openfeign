package com.dekapx.apps.controller;

import com.dekapx.apps.model.CreditScore;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dekapx.apps.common.HttpStatusCodes.UNAUTHORIZED;
import static com.dekapx.apps.common.HttpStatusCodes.UNAUTHORIZED_MSG;
import static com.dekapx.apps.common.ResourceUrls.BASE_URL;
import static com.dekapx.apps.common.ResourceUrls.INFO_URL;
import static com.dekapx.apps.common.ResourceUrls.SCORE_BY_PPS_URL;

@Slf4j
@RestController
@RequestMapping(BASE_URL)
public class CreditScoreController {
    @Operation(summary = "CreditScore Service API Info")
    @ApiResponses(value = {
            @ApiResponse(responseCode = UNAUTHORIZED,
                    description = UNAUTHORIZED_MSG,
                    content = @Content)
    })
    @GetMapping(INFO_URL)
    public String getInfo() {
        log.info("CreditScore Service API...");
        return "CreditScore Service API v1.0";
    }

    @Operation(summary = "CreditScore Service API")
    @ApiResponses(value = {
            @ApiResponse(responseCode = UNAUTHORIZED,
                    description = UNAUTHORIZED_MSG,
                    content = @Content)
    })
    @GetMapping(value = SCORE_BY_PPS_URL, produces = "application/json")
    public CreditScore getScore(@PathVariable String ppsn) {
        log.info("Credit Score request for PPSN {}", ppsn);
        return CreditScore.builder()
                .ppsn(ppsn)
                .firstName("Test")
                .lastName("User")
                .score(750)
                .build();
    }
}
