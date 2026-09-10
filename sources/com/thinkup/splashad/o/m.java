package com.thinkup.splashad.o;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m implements com.thinkup.core.common.n.o {
    private String mRequestId;
    private volatile boolean mHasReturn = false;
    private volatile boolean isAdTimeout = false;
    private final com.thinkup.core.common.o0n.o timeOutHandler = com.thinkup.core.common.o0n.o0.o();
    private final com.thinkup.core.common.o0n.m timeoutRunnable = new com.thinkup.core.common.o0n.m() { // from class: com.thinkup.splashad.o.m.1
        @Override // java.lang.Runnable
        public final void run() {
            if (m.this.mHasReturn) {
                return;
            }
            m.this.isAdTimeout = true;
            m mVar = m.this;
            mVar.onTimeout(mVar.mRequestId);
        }
    };

    @Override // com.thinkup.core.common.n.o
    public void onAdLoadFail(AdError adError) {
        this.timeOutHandler.o(this.timeoutRunnable);
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onNoAdError(this.mRequestId, adError);
    }

    @Override // com.thinkup.core.common.n.o
    public void onAdLoaded() {
        this.timeOutHandler.o(this.timeoutRunnable);
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onAdLoaded(this.mRequestId, this.isAdTimeout);
    }

    public abstract void onAdLoaded(String str, boolean z2);

    public abstract void onNoAdError(String str, AdError adError);

    public abstract void onTimeout(String str);

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void startCountDown(int i2) {
        this.timeOutHandler.o(this.timeoutRunnable, i2, false);
    }
}
