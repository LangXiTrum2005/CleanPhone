package com.scwang.smart.refresh.layout.simple;

import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.listener.OnMultiListener;

/* JADX INFO: loaded from: classes5.dex */
public class SimpleMultiListener implements OnMultiListener {
    @Override // com.scwang.smart.refresh.layout.listener.OnRefreshListener
    public final void a(RefreshLayout refreshLayout) {
    }

    @Override // com.scwang.smart.refresh.layout.listener.OnLoadMoreListener
    public final void b(RefreshLayout refreshLayout) {
    }

    @Override // com.scwang.smart.refresh.layout.listener.OnStateChangedListener, com.scwang.smart.refresh.layout.api.RefreshFooter
    public final void onStateChanged(RefreshLayout refreshLayout, RefreshState refreshState, RefreshState refreshState2) {
    }
}
