package com.kevin.runner;

import com.lmax.disruptor.EventFactory;

/**
 * TODO 大哥写点注释
 *
 * @author wangyong
 * @date 2019-09-27
 */
public class LongEventFactory implements EventFactory {
    @Override
    public Object newInstance() {
        return new LongEvent();
    }
}
