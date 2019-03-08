package com.aaa.ssm.util;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

import java.util.HashSet;
import java.util.Set;

public class TestRedisCluCon {
    public static void main(String[] args){
        Set<HostAndPort> hps = new HashSet();
        hps.add(new HostAndPort("192.168.152.25",7001));
        hps.add(new HostAndPort("192.168.152.25",7002));
        hps.add(new HostAndPort("192.168.152.25",7003));
        hps.add(new HostAndPort("192.168.152.26",7004));
        hps.add(new HostAndPort("192.168.152.26",7005));
        hps.add(new HostAndPort("192.168.152.26",7006));

        JedisCluster jedisCluster = new JedisCluster(hps);
        //System.out.println(jedisCluster.ping());
        jedisCluster.set("eee","fff");
        String eee = jedisCluster.get("eee");
        System.out.println(eee);

    }

}