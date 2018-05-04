package com.alibaba.dubbo.performance.demo.agent.registry;

import java.net.InetAddress;

public class IpHelper {

    public static String getHostIp() throws Exception {
        return InetAddress.getLocalHost().getHostAddress();
    }
}
