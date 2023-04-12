package com.example.buffmonitor.utils;

import cn.hutool.core.thread.ExecutorBuilder;
import com.example.buffmonitor.contains.ThreadPoolConstant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author zky
 * @ClassName ThreadUtils
 * @Description 线程池初始化
 * @date 2023/4/12 22:11
 */
@Slf4j
@Configuration
public class ThreadUtils {


    /**
     * 业务：实现pending队列的单线程池
     * 配置：核心线程可以被回收，当线程池无被引用且无核心线程数，应当被回收
     * 动态线程池且被Spring管理：false
     */
    @Bean("ThreadUtils")
    public static ExecutorService getPendingSingleThreadPool() {
        log.info("线程成初始化>>核心线程数[{}],最大线程数[{}],等待队列size[{}],回收机制开启,线程活动时间[{} {}]",
                ThreadPoolConstant.SINGLE_CORE_POOL_SIZE,ThreadPoolConstant.SINGLE_MAX_POOL_SIZE,
                ThreadPoolConstant.BIG_BLOCKING_QUEUE.size(),ThreadPoolConstant.SMALL_KEEP_LIVE_TIME, TimeUnit.SECONDS);
        return ExecutorBuilder.create()
                .setCorePoolSize(ThreadPoolConstant.SINGLE_CORE_POOL_SIZE)
                .setMaxPoolSize(ThreadPoolConstant.SINGLE_MAX_POOL_SIZE)
                .setWorkQueue(ThreadPoolConstant.BIG_BLOCKING_QUEUE)
                .setHandler(new ThreadPoolExecutor.CallerRunsPolicy())
                .setAllowCoreThreadTimeOut(true)
                .setKeepAliveTime(ThreadPoolConstant.SMALL_KEEP_LIVE_TIME, TimeUnit.SECONDS)
                .build();
    }
}
