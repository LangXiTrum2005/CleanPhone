package com.smartdigimkt.q8;

import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.format.SDMLossInfo;
import com.smartdigimkt.sdk.api.format.SDMWinInfo;

/* JADX INFO: loaded from: classes6.dex */
public abstract class j {
    public static final long DEFAULT_SPLASH_TIMEOUT_TIME = 10000;
    protected com.smartdigimkt.y4.c mCacheAd;
    protected final Object mLock = new Object();
    private final d mAdCallbackHandler = new a();

    private void a() {
        sendLoss(new SDMLossInfo(SDMLossInfo.LOSS_REASON.LOSS_TO_EXPIRE, 0.0d));
        destroy();
    }

    public boolean checkReady(boolean z2) {
        boolean zA;
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        if (cVar != null) {
            int iK = cVar.k();
            zA = this.mCacheAd.a(iK);
            if (iK == 1) {
                a();
            }
            i2 = iK;
        } else {
            zA = false;
            i2 = 0;
        }
        if (z2) {
            com.smartdigimkt.i7.d.a(zA, getPlacementId(), this.mCacheAd, System.currentTimeMillis() - jCurrentTimeMillis, i2);
            a(this.mCacheAd, zA);
        }
        if (!zA) {
            this.mCacheAd = null;
        }
        return zA;
    }

    public void destroy() {
        synchronized (this.mLock) {
            try {
                com.smartdigimkt.y4.c cVar = this.mCacheAd;
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
        return checkReady(true);
    }

    public void notifyShow() {
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        if (cVar != null) {
            cVar.o();
        }
        com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(13, this.mCacheAd.f());
    }

    public void printAdStatusLog(String str, String str2, String str3) {
        printAdStatusLog(str, str2, str3, null);
    }

    public void printApiLog(String str, String str2, String str3) {
        com.smartdigimkt.n8.n.a(getPlacementId(), com.smartdigimkt.n8.f.a(String.valueOf(getFormat())), str, str2, str3);
    }

    public void sendLoss(SDMLossInfo sDMLossInfo) {
        p.d(this.mCacheAd, sDMLossInfo);
    }

    public void sendWin(SDMWinInfo sDMWinInfo) {
        p.d(this.mCacheAd, sDMWinInfo);
    }

    public void printAdStatusLog(String str, String str2, String str3, AdError adError) {
        this.mAdCallbackHandler.a(this.mCacheAd);
        a.a(this.mAdCallbackHandler, str, str2, adError);
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        com.smartdigimkt.n8.n.a(cVar != null ? cVar.f() : null, str, str2, str3);
    }

    private void a(com.smartdigimkt.y4.c cVar, boolean z2) {
        if (z2 && cVar != null) {
            if (cVar.h() != null) {
                com.smartdigimkt.n8.n.a(getPlacementId(), com.smartdigimkt.n8.f.a(String.valueOf(getFormat())), com.smartdigimkt.m6.a.r.x, String.valueOf(true), "");
            }
        } else {
            com.smartdigimkt.n8.n.a(getPlacementId(), com.smartdigimkt.n8.f.a(String.valueOf(getFormat())), com.smartdigimkt.m6.a.r.x, String.valueOf(false), "");
        }
        com.smartdigimkt.n8.d.a(cVar, "isAdReady");
    }
}
