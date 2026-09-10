package com.scwang.smart.refresh.layout.api;

import android.view.View;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.constant.SpinnerStyle;
import com.scwang.smart.refresh.layout.listener.OnStateChangedListener;

/* JADX INFO: loaded from: classes5.dex */
public interface RefreshComponent extends OnStateChangedListener {
    boolean autoOpen(int i2, float f, boolean z2);

    SpinnerStyle getSpinnerStyle();

    View getView();

    boolean isSupportHorizontalDrag();

    int onFinish(RefreshLayout refreshLayout, boolean z2);

    void onHorizontalDrag(float f, int i2, int i3);

    void onInitialized(RefreshKernel refreshKernel, int i2, int i3);

    void onMoving(boolean z2, float f, int i2, int i3, int i4);

    void onReleased(RefreshLayout refreshLayout, int i2, int i3);

    void onStartAnimator(RefreshLayout refreshLayout, int i2, int i3);

    @Override // com.scwang.smart.refresh.layout.listener.OnStateChangedListener, com.scwang.smart.refresh.layout.api.RefreshFooter
    /* synthetic */ void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2);

    void setPrimaryColors(int... iArr);
}
