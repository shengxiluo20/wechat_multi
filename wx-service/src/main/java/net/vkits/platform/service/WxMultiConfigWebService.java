package net.vkits.platform.service;

import net.vkits.platform.dto.WxMultiConfigDto;
import java.util.List;

public interface WxMultiConfigWebService {
    /**
     * 获得所有的多商户列表
     * @return
     */
    List<WxMultiConfigDto> getAllWxConfig();
}
