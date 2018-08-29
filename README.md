# wechat_mulit
微信服务的路由中转站，能实现多公众号动态可配
## 使用方法
一,启动  
1,修改项目resource下的programs.json,配置公众号相关信息  
2,直接启动 net.vkits.platform.WechatWebApplication#main() 即可   
二,动态增加公众号    
访问 /wx_mulit_config 接口

## 原理
将 net.vkits.platform.wxService.WxMulitService 配置为多例,按照公众号配置来生成相应的bean,存在一个自定义容器中(map),每次微信请求过来时从容器中取相应的WxMulitService即可,主要的逻辑在 net.vkits.platform.wxService.MulitConfigService 中

## 建议
可作为一个中转站,在mulitHandler中路由到业务服务中

#### 声明： 
本项目参考Wechat-Group/weixin-java-tools，本次是整合springBoot和多公众号配置的demo(详细见项目参考地址），另外增加了一个功能是假如公司多个公众号有相同的业务逻辑，但又独立运营的情况下的多公众号配置***

#### 基于项目
* https://github.com/Wechat-Group/weixin-java-tools
#### 参考项目
* https://github.com/binarywang/weixin-java-mp-multi-demo.git
