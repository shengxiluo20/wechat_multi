package net.vkits.platform.handler.multi;

import me.chanjar.weixin.mp.bean.message.WxMpXmlMessage;
import me.chanjar.weixin.mp.bean.message.WxMpXmlOutMessage;
import net.vkits.platform.config.WxConfig;
import net.vkits.platform.handler.SubscribeHandler;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class MultiSubscribeHandler extends SubscribeHandler {

    private WxConfig wxConfig;

    @Resource
    private ApplicationContext applicationContext;


    @Override
    protected WxConfig getWxConfig() {
        return this.wxConfig;
    }

    public void setWxConfig(WxConfig wxConfig) {
        this.wxConfig = wxConfig;
    }


    /**
     * 处理特殊请求，比如如果是扫码进来的，可以做相应处理
     *
     * @param wxMessage
     */
    @Override
    protected WxMpXmlOutMessage handleSpecial(WxMpXmlMessage wxMessage) throws Exception {
        return null;
    }
}
