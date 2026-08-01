package com.example.activityservice.dto;

import com.example.activityservice.model.ActivityType;
import lombok.Data;
import java.util.Map;

import java.time.LocalDateTime;

@Data
public class ActivityRequest {

    private String userId;
    private ActivityType type;
    private Integer durations;
    private Integer caloriesBurned;
    private LocalDateTime startTime;
    private Map<String,Object> additionalMetrics;


}
