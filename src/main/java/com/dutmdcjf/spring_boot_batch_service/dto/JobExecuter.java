package com.dutmdcjf.spring_boot_batch_service.dto;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class JobExecuter {
    private String name;
    @Singular("parameter")
    private Map<String, Object> parameter = new HashMap<>();
}
