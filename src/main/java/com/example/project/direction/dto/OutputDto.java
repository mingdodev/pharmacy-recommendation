package com.example.project.direction.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class OutputDto {

    private String pharmacyName; // 약국명
    private String pharmacyAddress; // 주소
    private String directionUrl; // 길안내 Uri
    private String roadViewUrl; // 로드뷰 Uri
    private String distance; // 거리
}