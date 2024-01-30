package com.mangojelly.backend.global.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    // Global
    API_ERROR_INTERNAL_SERVER(500, "G001", "서버 오류"),
    API_ERROR_INPUT_INVALID_VALUE(409, "G002", "잘못된 입력"),
    API_ERROR_NO_AUTHORIZATION(403, "G002", "권한 없음"),

    //MEMBER
    API_ERROR_MEMBER_ALREADY_EXISTED(400,"M001","이미 등록되어있는 계정입니다."),
    API_ERROR_MEMBER_NOT_EXIST(400,"M002","존재하지 않는 회원입니다."),
    API_ERROR_GUEST_NOT_EXIST(400,"M003","존재하지 않는 참여자입니다."),

    //SCENE
    API_ERROR_SCENE_NOT_EXIST(400,"S001","존재하지 않는 씬입니다."),

    //SCRIPT
    API_ERROR_SCRIPT_NOT_EXIST(400,"SC001","존재하지 않는 스크립트입니다."),

    //MOVIE
    API_ERROR_MOVIE_NOT_EQUAL_SCRIPT(400,"MV001","선택한 스크립트와 맞지 않은 씬입니다."),


    //AUTH
    ERROR_CLIENT_BY_AUTHORIZATION_INFORMATION(400, "AUTH001", "권한 정보가 없는 토큰입니다."),
    ERROR_CLIENT_BY_JWT_SIGNATURE_INVALID(401, "AUTH002", "잘못된 서명입니다."),
    ERROR_CLINET_BY_JWT_KEY_EXPIERD(401, "AUTH003", "만료된 토큰입니다."),
    ERROR_CLIENT_BY_JWT_NOT_SUPPORT(401, "AUTH004", "지원하지 않는 토큰입니다."),
    ERROR_CLIENT_BY_JWT_KEY_INVALID(401, "AUTH005", "잘못된 토큰입니다."),
    ERROR_CLIENT_BY_AUTH_PERMISSION_TO_ACCESS_THE_REQUEST_ROLE(403, "AUTH006", "해당 기능에 대한 권한이 없습니다."),
    ERROR_CLIENT_BY_AUTHORIZATION_IS_NECESSARY(401, "AUTH007", "사용자 인증이 필요합니다."),

    //ROOM
    ERROR_CLIENT_BY_ROOM_ALREADY_EXISTED(400, "R001", "이미 생성한 방이 존재하는 회원입니다."),
    ERROR_CLIENT_BY_ROOM_ALREADY_DELETED(400, "R002", "이미 삭제된 방입니다."),
    ERROR_CLIENT_BY_ROOM_NOT_EXISTED(400, "R003", "생성된 방이 존재하지 않습니다."),
    ERROR_CLIENT_BY_ROOM_IS_NOT_YOURS(403, "R004", "생성된 방의 회원과 정보가 일치하지 않습니다."),

    //ROLE
    API_ERROR_ROLE_NOT_EXIST(403, "R004", "요청한 역할이 존재하지 않습니다.")
    ;
    private final int status;
    private final String code;
    private final String message;
}
