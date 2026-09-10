package com.thinkup.core.n.m;

import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBiddingListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class n implements TUBiddingListener {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected TUBaseAdAdapter f42401n;

    public n(TUBaseAdAdapter tUBaseAdAdapter) {
        this.f42401n = tUBaseAdAdapter;
    }

    private void o() {
        this.f42401n = null;
    }
}
