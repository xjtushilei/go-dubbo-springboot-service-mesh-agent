package com.alibaba.dubbo.performance.demo.agent.registry;

import java.util.List;

public interface IRegistry {

    // 注册服务
    void register(String serviceName, int port, String scale) throws Exception;

    List<String> find(String serviceName) throws Exception;
}
