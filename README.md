# dubbo-demo
集成dubbo实例，探究dubbo调用流程及provider测试方案

新业务线要使用dubbo，写个demo感受下。
1. dubbo服务治理应用dubbo-admin地址为：https://github.com/apache/dubbo-admin
2. 下载后分别启动server和ui就可以访问了，README.md中有详细的说明。
3. 配置注册中心我使用的Nacos，使用Docker安装也很简单
   ```javascript
   docker run -d --restart=always --name nacos -e MODE=standalone -p 8848:8848 --privileged=true nacos/nacos-server:2.0.0
   ```
4. 然后用就行，运行测试结果如下：
