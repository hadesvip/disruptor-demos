package com.kevin.runner;


import com.lmax.disruptor.EventHandler;

/**
 * TODO 大哥写点注释
 *
 * @author wangyong
 * @date 2019-09-27
 */
public class LongEventHandler implements EventHandler<LongEvent> {

    @Override
    public void onEvent(LongEvent event, long sequence, boolean endOfBatch) throws Exception {
        System.out.println(event.getValue());
    }
}
