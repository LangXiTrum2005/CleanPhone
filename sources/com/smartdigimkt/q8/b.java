package com.smartdigimkt.q8;

import com.smartdigimkt.sdk.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b<T> implements k<T> {
    private String mRequestId;
    private volatile boolean mHasReturn = false;
    private volatile boolean isAdTimeout = false;
    private final com.smartdigimkt.h7.a timeOutHandler = com.smartdigimkt.h7.e.c();
    private final com.smartdigimkt.h7.b timeoutRunnable = new a();

    public class a implements com.smartdigimkt.h7.b {
        public a() {
        }

        @Override // com.smartdigimkt.h7.b
        public boolean a() {
            return false;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (b.this.mHasReturn) {
                return;
            }
            b.this.isAdTimeout = true;
            b bVar = b.this;
            bVar.onTimeout(bVar.mRequestId);
        }
    }

    @Override // com.smartdigimkt.q8.k
    public void onAdLoadFail(AdError adError) {
        this.timeOutHandler.a(this.timeoutRunnable);
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onAdLoadFail(this.mRequestId, adError);
    }

    public abstract void onAdLoadFail(String str, AdError adError);

    @Override // com.smartdigimkt.q8.k
    public void onAdLoaded(T t) {
        this.timeOutHandler.a(this.timeoutRunnable);
        if (this.mHasReturn) {
            return;
        }
        this.mHasReturn = true;
        onAdLoaded(this.mRequestId, this.isAdTimeout, t);
    }

    public abstract void onAdLoaded(String str, boolean z2, T t);

    public abstract void onTimeout(String str);

    public void setRequestId(String str) {
        this.mRequestId = str;
    }

    public void startCountDown(long j) {
        this.timeOutHandler.a(this.timeoutRunnable, j);
    }
}
