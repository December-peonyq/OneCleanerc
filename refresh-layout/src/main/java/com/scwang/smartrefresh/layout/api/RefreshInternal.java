package com.scwang.smartrefresh.layout.api;

import android.support.annotation.NonNull;
import android.view.View;

import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.listener.OnStateChangedListener;


/**
 * 刷新内部组件
 * Created by SCWANG on 2017/5/26.
 */

public interface RefreshInternal extends OnStateChangedListener {
    /**
     * 获取实体视图
     */
    @NonNull
    View getView();

    /**
     * 获取变换方式
     */
    SpinnerStyle getSpinnerStyle();

    /**
     * 设置主题颜色
     * @param colors 对应Xml中配置的 srlPrimaryColor srlAccentColor
     */
    void setPrimaryColors(int... colors);

    /**
     * 尺寸定义完成 （如果高度不改变，只调用一次）
     * @param kernel RefreshKernel
     * @param height HeaderHeight or FooterHeight
     * @param extendHeight extendHeaderHeight or extendFooterHeight
     */
    void onSizeDefined(RefreshKernel kernel, int height, int extendHeight);

    /**
     * 开始动画
     * @param layout RefreshLayout
     * @param height HeaderHeight or FooterHeight
     * @param extendHeight extendHeaderHeight or extendFooterHeight
     */
    void onStartAnimator(RefreshLayout layout, int height, int extendHeight);
    /**
     * 动画结束
     * @param layout RefreshLayout
     */
    void onFinish(RefreshLayout layout);
}
