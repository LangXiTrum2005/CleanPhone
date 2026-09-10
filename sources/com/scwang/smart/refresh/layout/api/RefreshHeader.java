package com.scwang.smart.refresh.layout.api;

import com.scwang.smart.refresh.layout.constant.RefreshState;

/* JADX INFO: loaded from: classes5.dex */
public interface RefreshHeader extends RefreshComponent {
    @Override // com.scwang.smart.refresh.layout.api.RefreshComponent, com.scwang.smart.refresh.layout.listener.OnStateChangedListener, com.scwang.smart.refresh.layout.api.RefreshFooter
    /* synthetic */ void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2);
}
