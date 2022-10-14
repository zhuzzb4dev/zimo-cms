package com.zimo.cms.vo;

import com.zimo.cms.vo.base.BaseVo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginVo extends BaseVo {

    private String token;
    private String refreshToken;
}
