package redis;

import redis.clients.jedis.Jedis;
import util.TestUtil;

public class RedisTest {
    private static Jedis jedis;
    public static void main(String[] args) {
        jedis = new Jedis(TestUtil.getConfig("redis.url"),
                Integer.parseInt(TestUtil.getConfig("redis.port" )));

        System.out.println(jedis.get("name"));
    }
}