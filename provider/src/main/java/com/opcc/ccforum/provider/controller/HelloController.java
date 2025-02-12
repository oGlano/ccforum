package com.opcc.ccforum.provider.controller;

import com.opcc.ccforum.provider.bean.request.CommonRequest;
import com.opcc.ccforum.provider.bean.response.CommonResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ------------------------------------------------
 * Class HelloController
 *
 * @author Glan
 * @apiNote  描述内容
 * @date 2022-03-28
 * ------------------------------------------------
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping("/world")
    public CommonResponse world(CommonRequest commonRequest) {
        
        return CommonResponse.success();
    }


}
