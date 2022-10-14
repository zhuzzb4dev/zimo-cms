package com.zimo.cms.controller;

import com.zimo.cms.req.LoginReq;
import com.zimo.cms.vo.LoginVo;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("public")
public class PublicController {

    @PostMapping("login")
    public ResponseEntity<LoginVo> login(@RequestBody @Validated LoginReq req) {
        String email = req.getEmail();
        String password = req.getPassword();
        LoginVo vo = new LoginVo();
        if ("root".equals(email) && "1234".equals(password)) {
            vo.setToken("1234");
            return ResponseEntity.ok(vo);
        } else {
            vo.setMsg("4321");
            return ResponseEntity.badRequest().body(vo);
        }
    }
}
