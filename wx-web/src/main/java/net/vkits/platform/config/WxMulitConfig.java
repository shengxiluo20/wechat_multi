package net.vkits.platform.config;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

/**
 * @description: 多商户的配置信息
 * @author: chi
 * @Date: 11:52 2017/10/11/011
 */

@AllArgsConstructor
@NoArgsConstructor
@Builder
public class WxMulitConfig extends WxConfig {

    private String clientId;

    private String token;

    private String appid;

    private String appsecret;

    private String aesKey;

    //自定义业务字段
    private String templateId;
    //自定义业务字段
    private String billTemplateId;

    @Override
    public String getToken() {
        return null;
    }

    @Override
    public String getAppid() {
        return null;
    }

    @Override
    public String getAppsecret() {
        return null;
    }

    @Override
    public String getAesKey() {
        return null;
    }

    @Override
    public WxAccountEnum getWxAccountEnum() {
        return null;
    }
}
