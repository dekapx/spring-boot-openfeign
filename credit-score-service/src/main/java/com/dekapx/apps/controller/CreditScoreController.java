package com.dekapx.apps.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.dekapx.apps.common.HttpStatusCodes.UNAUTHORIZED;
import static com.dekapx.apps.common.HttpStatusCodes.UNAUTHORIZED_MSG;
import static com.dekapx.apps.common.ResourceUrls.BASE_URL;
import static com.dekapx.apps.common.ResourceUrls.INFO_URL;

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
        return "CreditScore Service API";
    }

}
