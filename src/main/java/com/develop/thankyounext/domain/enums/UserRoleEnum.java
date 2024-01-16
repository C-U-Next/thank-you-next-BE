package com.develop.thankyounext.domain.enums;

public enum UserRoleEnum {
    ADMIN(Authority.ADMIN),
    USER(Authority.USER),
    MENTO(Authority.MENTO);
    private final String authority;
    UserRoleEnum(String authority){
        this.authority = authority;
    }
    public String getAuthority(){
        return this.authority;
    }
    public static class Authority{
        public static final String USER = "ROLE_USER";
        public static final String ADMIN = "ROLE_ADMIN";
        public static final String MENTO = "ROLE_MENTO";
    }
}
