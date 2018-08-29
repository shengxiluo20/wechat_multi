package net.vkits.platform.controller;

import net.vkits.platform.dto.WxMultiConfigDto;
import net.vkits.platform.wxService.MulitConfigService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.annotation.Resource;

/**
 * @author chi  2018-01-30 11:34
 **/
@Controller
public class WxMultiConfigController {

    @Resource
    private MulitConfigService mulitConfigService;

    /**
     * 增加或修改微信号配置
     * @param wxMultiConfigDto
     * @return
     */
    @PostMapping("/wx_mulit_config")
    public ResponseEntity addWxMulitConfig(@RequestBody WxMultiConfigDto wxMultiConfigDto) {
        mulitConfigService.generateWxMulitConfig(wxMultiConfigDto);
        return new ResponseEntity<>("增加微信配置成功", HttpStatus.OK);
    }
}
