package com.thinkup.core.api;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public abstract class TUIBiddingResultListener {
    private boolean isNeedWait = false;

    public final boolean isNeedWait() {
        return this.isNeedWait;
    }

    public abstract void reportFailed(int i2, String str, Map<String, Object> map);

    public abstract void reportSuccess(Map<String, Object> map);

    public final void setNeedWait(boolean z2) {
        this.isNeedWait = z2;
    }
}
