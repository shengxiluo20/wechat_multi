package net.vkits.platform.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import net.vkits.platform.dto.WxMultiConfigDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author chi  2017-08-29 19:18
 **/
@Service
public class WxMultiConfigWebServiceImpl implements WxMultiConfigWebService {

    @Value(value = "classpath:programs.json")
    private Resource resource;

    /**
     * 获得所有的多商户列表,demo使用programs.json获取,实际业务中可使用数据库配置
     *
     * @return
     */
    public List<WxMultiConfigDto> getAllWxConfig() {
        String defaultString = "";
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(resource.getInputStream()));
            StringBuilder message = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                message.append(line);
            }
            defaultString = message.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        JSONArray objects = JSONObject.parseArray(defaultString);
        List<WxMultiConfigDto> list = new ArrayList<>();
        for (Object object : objects) {
            String s = JSONObject.toJSONString(object);
            list.add(JSONObject.parseObject(s, WxMultiConfigDto.class));
        }
        return list;
    }
}
