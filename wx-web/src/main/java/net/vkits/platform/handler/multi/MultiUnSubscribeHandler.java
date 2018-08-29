package net.vkits.platform.handler.multi;


import net.vkits.platform.config.WxConfig;
import net.vkits.platform.handler.UnsubscribeHandler;
import org.springframework.stereotype.Component;

@Component
public class MultiUnSubscribeHandler extends UnsubscribeHandler {

  private WxConfig wxConfig;

  @Override
  protected WxConfig getWxConfig() {
    return this.wxConfig;
  }

  public void setWxConfig(WxConfig wxConfig) {
    this.wxConfig = wxConfig;
  }
}
