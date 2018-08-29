package net.vkits.platform.dto;

import com.alibaba.fastjson.JSONObject;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

/**
 * @discription: 传递微信多商户的dto
 * @author: chi
 * @Date: 19:17 2017/8/29/029
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class WxMultiConfigDto {
    /**
     * 微信的平台id,自定义即可,注意不可重复
     */
    private String clientId;

    private String token;

    private String appid;

    private String appsecret;

    private String aesKey;

    /**
     * 以下为有关业务性的字段
     */
    private String templateId;
    private String billTemplateId;

}
