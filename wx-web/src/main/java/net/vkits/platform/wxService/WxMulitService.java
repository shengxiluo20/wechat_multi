package net.vkits.platform.wxService;

import net.vkits.platform.config.WxConfig;
import net.vkits.platform.config.WxMulitConfig;
import net.vkits.platform.handler.*;
import net.vkits.platform.handler.multi.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author chi  2017-08-29 18:33
 **/
@Component
@Scope("prototype")//设置为多例
public class WxMulitService extends BaseWxService {

    private WxMulitConfig wxConfig = new WxMulitConfig();

    protected WxMulitService setServerConfig(WxMulitConfig wxConfig) {
        this.wxConfig = wxConfig;
        return this;
    }

    @Resource
    private MultiLocationHandler locationHandler;

    @Resource
    private MultiMenuHandler menuHandler;

    @Resource
    private MultiMsgHandler msgHandler;

    @Resource
    private MultiUnSubscribeHandler unSubscribeHandler;

    @Resource
    private MultiSubscribeHandler subscribeHandler;
    @Resource
    private MultiScanHandler scanHandler;

    @Override
    protected WxConfig getServerConfig() {
        return this.wxConfig;
    }

    @Override
    protected MenuHandler getMenuHandler() {
        //刷新config
        this.menuHandler.setWxConfig(wxConfig);
        return this.menuHandler;
    }

    @Override
    protected SubscribeHandler getSubscribeHandler() {
        this.subscribeHandler.setWxConfig(wxConfig);
        return this.subscribeHandler;
    }

    @Override
    protected UnsubscribeHandler getUnsubscribeHandler() {
        this.unSubscribeHandler.setWxConfig(wxConfig);
        return this.unSubscribeHandler;
    }

    @Override
    protected AbstractHandler getLocationHandler() {
        this.locationHandler.setWxConfig(wxConfig);
        return this.locationHandler;
    }

    @Override
    protected MsgHandler getMsgHandler() {
        this.msgHandler.setWxConfig(wxConfig);
        return this.msgHandler;
    }

    @Override
    protected AbstractHandler getScanHandler() {
        this.scanHandler.setWxConfig(wxConfig);
        return this.scanHandler;
    }

}
