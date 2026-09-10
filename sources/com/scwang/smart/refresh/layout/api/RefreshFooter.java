package com.scwang.smart.refresh.layout.api;

import com.scwang.smart.refresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes5.dex */
public interface RefreshFooter extends RefreshComponent {
    /* synthetic */ void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2);

    boolean setNoMoreData(boolean z2);
}
