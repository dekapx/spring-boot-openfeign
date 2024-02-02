package com.dekapx.apps.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreditScore {
    private String ppsn;
    private String firstName;
    private String lastName;
    private Integer score;
}
