package com.smartdigimkt.sdk.api.format;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.f5.f;
import com.smartdigimkt.q8.g;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.q8.j;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.v3.h;

/* JADX INFO: loaded from: classes6.dex */
public class SDMRewardedVideoAd extends j implements SDMAdHandler {
    protected Context mContext;
    private SDMRewardVideoListener mDevListener;
    protected String mPlacementId;
    private final i mSdmAdLoadManager;
    private volatile boolean isLoading = false;
    private final k mLoadListener = new a();

    public class a implements k<com.smartdigimkt.y4.c> {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMRewardedVideoAd$a$a, reason: collision with other inner class name */
        public class RunnableC0589a implements Runnable {
            public RunnableC0589a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMRewardedVideoAd.this.mDevListener != null) {
                    SDMRewardedVideoAd.this.mDevListener.onAdLoaded();
                }
            }
        }

        public class b implements Runnable {
            final /* synthetic */ AdError val$adError;

            public b(AdError adError) {
                this.val$adError = adError;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMRewardedVideoAd.this.mDevListener != null) {
                    SDMRewardedVideoAd.this.mDevListener.onAdLoadFail(this.val$adError);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            SDMRewardedVideoAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "fail", adError != null ? adError.getErrorInfo() : "", adError);
            synchronized (((j) SDMRewardedVideoAd.this).mLock) {
                SDMRewardedVideoAd.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new b(adError));
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(com.smartdigimkt.y4.c cVar) {
            synchronized (((j) SDMRewardedVideoAd.this).mLock) {
                SDMRewardedVideoAd.this.isLoading = false;
                ((j) SDMRewardedVideoAd.this).mCacheAd = cVar;
            }
            SDMRewardedVideoAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "success", "");
            com.smartdigimkt.l7.b.a().e(new RunnableC0589a());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class c implements f {
        public c() {
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(com.smartdigimkt.f5.j jVar) {
            SDMRewardedVideoAd.this.printAdStatusLog("click", "success", "");
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdClick();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            SDMRewardedVideoAd.this.printAdStatusLog("close", "success", "");
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdClose();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(com.smartdigimkt.f5.j jVar) {
            SDMRewardedVideoAd.this.printAdStatusLog("impression", "success", "");
            SDMRewardedVideoAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f, "success", "");
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdPlayStart();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            SDMRewardedVideoAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.j, z2 ? "success" : "fail", "");
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onRewarded() {
            SDMRewardedVideoAd.this.printAdStatusLog("rewarded", "success", "");
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdReward();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            SDMRewardedVideoAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36795l, "fail", hVar != null ? hVar.c() : "", new com.smartdigimkt.v7.a(hVar != null ? hVar.a() : "", strB));
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdPlayFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, strB));
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayEnd() {
            SDMRewardedVideoAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.g, "success", "");
            if (SDMRewardedVideoAd.this.mDevListener != null) {
                SDMRewardedVideoAd.this.mDevListener.onAdPlayEnd();
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayStart() {
        }
    }

    public SDMRewardedVideoAd(Context context, String str) {
        this.mPlacementId = str;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new i(1, str);
    }

    @Override // com.smartdigimkt.q8.j
    public int getFormat() {
        return 1;
    }

    @Override // com.smartdigimkt.q8.j
    public String getPlacementId() {
        return this.mPlacementId;
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public SDMAd getSDMAd() {
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        if (cVar != null) {
            return g.a(cVar);
        }
        return null;
    }

    public void load() {
        load(null);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyLoss(SDMLossInfo sDMLossInfo) {
        sendLoss(sDMLossInfo);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyWin(SDMWinInfo sDMWinInfo) {
        sendWin(sDMWinInfo);
    }

    public void setListener(SDMRewardVideoListener sDMRewardVideoListener) {
        this.mDevListener = sDMRewardVideoListener;
    }

    public void show(Activity activity) {
        if (!checkReady(false)) {
            SDMRewardVideoListener sDMRewardVideoListener = this.mDevListener;
            if (sDMRewardVideoListener != null) {
                sDMRewardVideoListener.onAdPlayFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail without ad cache"));
                return;
            }
            return;
        }
        notifyShow();
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        if (cVar instanceof com.smartdigimkt.y4.g) {
            cVar.a(new c());
            printApiLog("show", "start", "");
            ((com.smartdigimkt.y4.g) this.mCacheAd).a(activity);
        } else {
            SDMRewardVideoListener sDMRewardVideoListener2 = this.mDevListener;
            if (sDMRewardVideoListener2 != null) {
                sDMRewardVideoListener2.onAdPlayFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail by " + this.mCacheAd));
            }
        }
    }

    public void load(SDMAdRequest sDMAdRequest) {
        synchronized (this.mLock) {
            try {
                if (this.isLoading) {
                    com.smartdigimkt.l7.b.a().e(new b());
                } else if (checkReady(false)) {
                    this.mLoadListener.onAdLoaded(this.mCacheAd);
                } else {
                    this.isLoading = true;
                    this.mSdmAdLoadManager.a(this.mContext, this.mLoadListener, sDMAdRequest);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
