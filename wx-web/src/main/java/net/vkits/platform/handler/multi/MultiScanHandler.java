package net.vkits.platform.handler.multi;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.common.session.WxSessionManager;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import net.vkits.platform.builder.TextBuilder;
import net.vkits.platform.config.WxConfig;
import net.vkits.platform.handler.ScanHandler;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class MultiScanHandler extends ScanHandler {

    WxConfig wxConfig;


    @Override
    protected WxConfig getWxConfig() {
        return this.wxConfig;
    }

    public void setWxConfig(WxConfig wxConfig) {
        this.wxConfig = wxConfig;
    }

    @Override
    public WxMpXmlOutMessage handle(WxMpXmlMessage wxMessage, Map<String, Object> context, WxMpService wxMpService, WxSessionManager sessionManager) throws WxErrorException {

        return new TextBuilder().build("content", wxMessage, null);
    }
}
