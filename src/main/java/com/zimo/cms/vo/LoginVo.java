package com.zimo.cms.vo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginVo extends BaseVo{

    private String token;
    private String refreshToken;
}
