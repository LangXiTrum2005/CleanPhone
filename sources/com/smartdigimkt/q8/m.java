package com.smartdigimkt.q8;

/* JADX INFO: loaded from: classes6.dex */
public abstract class m {
    public static final long DEFAULT_SPLASH_TIMEOUT_TIME = 10000;
    protected com.smartdigimkt.h5.c mCacheAd;
    protected final Object mLock = new Object();

    public boolean checkReady() {
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        boolean zIsReady = cVar != null ? cVar.isReady() : false;
        if (!zIsReady) {
            this.mCacheAd = null;
        }
        return zIsReady;
    }

    public void destroy() {
        synchronized (this.mLock) {
            try {
                com.smartdigimkt.h5.c cVar = this.mCacheAd;
                if (cVar != null) {
                    cVar.c();
                    this.mCacheAd = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract int getFormat();

    public abstract String getPlacementId();

    public boolean isAdReady() {
        return checkReady();
    }

    public void notifyShow() {
    }
}
