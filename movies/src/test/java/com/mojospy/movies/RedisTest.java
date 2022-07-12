package com.mojospy.movies;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
@Slf4j
@SpringBootTest
public class RedisTest {
    @Autowired
    StringRedisTemplate redisTemplate;

    @Test
    void testString() {
        ValueOperations ops = redisTemplate.opsForValue();
//        ops.set("p", "lisi");
        Object name = ops.get("name");
        log.info("结果是{}",name);
    }

    @Test
    void testHash() {
        HashOperations<String, Object, Object> ops = redisTemplate.opsForHash();
        ops.put("lisi","age", "18");
        Object o = ops.get("lisi", "age");
        log.info("哈希结果是{}",o);
    }
}
