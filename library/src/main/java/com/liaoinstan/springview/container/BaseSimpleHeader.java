package com.liaoinstan.springview.container;

import com.liaoinstan.springview.widget.SpringView;

/**
 * Create by liaoinstan 2019/12/9
 * 默认头部的简单封装，主要把摩擦系数和type设置封装在内部，如果继承该类，则可直接调用 header.setType(..)，header.setMovePara(..) 来改变type类型，和摩擦系数
 */
public abstract class BaseSimpleHeader extends BaseHeader {

    private float movePara = 2.0f;
    private SpringView.Type type = SpringView.Type.FOLLOW;

    @Override
    public SpringView.Type getType() {
        return type;
    }

    @Override
    public float getMovePara() {
        return movePara;
    }

    public BaseSimpleHeader setType(SpringView.Type type) {
        this.type = type;
        return this;
    }

    public BaseSimpleHeader setMovePara(float movePara) {
        this.movePara = movePara;
        return this;
    }
}
