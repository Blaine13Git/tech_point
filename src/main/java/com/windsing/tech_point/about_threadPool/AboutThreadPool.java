package com.windsing.tech_point.about_threadPool;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AboutThreadPool {

    /**
     * 线程池工作原理：
     * <p>
     * corePoolSize ：线程池中核心线程数的最大值
     * maximumPoolSize ：线程池中能拥有最多线程数
     * keepAliveTime ：表示空闲线程的存活时间，当一个线程无事可做，超过一定的时间（keepAliveTime）时，线程池会判断，如果当前运行的线程数大于 corePoolSize，那么这个线程就被停掉。所以线程池的所有任务完成后，它最终会收缩到 corePoolSize 的大小。
     * TimeUnit unit ：表示keepAliveTime的单位
     * BlockingQueue workQueue：用于缓存任务的阻塞队列
     * 1）有界队列：
     * SynchronousQueue ：一个不存储元素的阻塞队列，每个插入操作必须等到另一个线程调用移除操作，否则插入操作一直处于 阻塞状态，吞吐量通常要高于LinkedBlockingQueue，静态工厂方法 Executors.newCachedThreadPool 使用了这个队列。
     * ArrayBlockingQueue：一个由数组支持的有界阻塞队列。此队列按 FIFO（先进先出）原则对元素进行排序。一旦创建了这样的缓存区，就不能再增加其容量。试图向已满队列中放入元素会导致操作受阻塞；试图从空队列中提取元素将导致类似阻塞。
     * 2）无界队列：
     * LinkedBlockingQueue：基于链表结构的无界阻塞队列，它可以指定容量也可以不指定容量（实际上任何无限容量的队列/栈都是有容量的，这个容量就是Integer.MAX_VALUE）
     * PriorityBlockingQueue：是一个按照优先级进行内部元素排序的无界阻塞队列。队列中的元素必须实现 Comparable 接口，这样才能通过实现compareTo()方法进行排序。优先级最高的元素将始终排在队列的头部；PriorityBlockingQueue 不会保证优先级一样的元素的排序。
     * <p>
     * 当调用线程池execute() 方法添加一个任务时，线程池会做如下判断：
     * 如果有空闲线程，则直接执行该任务；
     * 如果没有空闲线程，且当前运行的线程数少于corePoolSize，则创建新的线程执行该任务；
     * 如果没有空闲线程，且当前的线程数等于corePoolSize，同时阻塞队列未满，则将任务入队列，而不添加新的线程；
     * 如果没有空闲线程，且阻塞队列已满，同时池中的线程数小于maximumPoolSize ，则创建新的线程执行任务；
     * 如果没有空闲线程，且阻塞队列已满，同时池中的线程数等于maximumPoolSize ，则根据构造函数中的 handler 指定的策略来拒绝新的任务。
     */
    public static void main(String[] args) {

        // 自定义线程池
        Executor executor = new ThreadPoolExecutor(10, 50, 3, // 空闲的、非corePoolSize内的线程存活时间
                TimeUnit.SECONDS, // keepAliveTime 的时间单位
                new LinkedBlockingQueue<>(10), // 定义等待队列的大小
                new NameTreadFactory(), // 定义创建线程的规则
                new ThreadPoolExecutor.AbortPolicy() // 定义无法获取线程的处理策略
        );

        // 使用线程池的线程执行任务代码
        executor.execute(() -> {
            // 任务代码
        });

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool(); // 无界线程池，可以进行自动线程回收
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10); // 固定大小线程池
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(); // 单个线程
    }

    static class NameTreadFactory implements ThreadFactory {

        private final AtomicInteger mThreadNum = new AtomicInteger(1);

        @Override
        public Thread newThread(Runnable r) {
            Thread t = new Thread(r, "my-thread-" + mThreadNum.getAndIncrement());
            System.out.println(t.getName() + " has been created");
            return t;
        }
    }

}
