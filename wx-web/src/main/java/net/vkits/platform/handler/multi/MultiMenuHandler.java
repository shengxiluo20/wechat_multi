package net.vkits.platform.handler.multi;

import net.vkits.platform.config.WxConfig;
import net.vkits.platform.handler.MenuHandler;
import org.springframework.stereotype.Component;

@Component
public class MultiMenuHandler extends MenuHandler {

  private WxConfig wxConfig;

  @Override
  protected WxConfig getWxConfig() {
    return this.wxConfig;
  }

  public void setWxConfig(WxConfig wxConfig) {
    this.wxConfig = wxConfig;
  }
}
