### dubbo springboot
Dubbo官网：http://dubbo.apache.org/ 官网讲的比较全


###集成方式 一般情况 
- spring容器 加上xml配置 加载
- springboot 注解 javaConfig方式 加载

###demo结构
- dubbo-parent demo工程
    - dubbo-app-api 公共模块
    - xxx-provider 提供者
    - xxx-comsumer 消费者
- dubbo-admin dubbo管理界面 
    
- dubbo-monitor 简易监控中心
    - dubbo-monitor/dubbo-monitor-simple-2.0.0/assembly.bin 启动脚本
    
###dubbo扩展（dubbo提供了spi扩展机制）
http://dubbo.apache.org/zh/docs/v2.7/dev/impls/exporter-listener/
    - 关于默认filter  https://www.jianshu.com/p/c5ebe3e08161

