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
import com.smartdigimkt.y4.e;

/* JADX INFO: loaded from: classes6.dex */
public class SDMInterstitialAd extends j implements SDMAdHandler {
    protected Context mContext;
    private SDMInterstitialListener mDevListener;
    protected String mPlacementId;
    private i mSdmAdLoadManager;
    private volatile boolean isLoading = false;
    private k mLoadListener = new a();

    public class a implements k<com.smartdigimkt.y4.c> {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMInterstitialAd$a$a, reason: collision with other inner class name */
        public class RunnableC0587a implements Runnable {
            public RunnableC0587a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMInterstitialAd.this.mDevListener != null) {
                    SDMInterstitialAd.this.mDevListener.onAdLoaded();
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
                if (SDMInterstitialAd.this.mDevListener != null) {
                    SDMInterstitialAd.this.mDevListener.onAdLoadFail(this.val$adError);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            SDMInterstitialAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "fail", adError != null ? adError.getErrorInfo() : "", adError);
            synchronized (((j) SDMInterstitialAd.this).mLock) {
                SDMInterstitialAd.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new b(adError));
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(com.smartdigimkt.y4.c cVar) {
            synchronized (((j) SDMInterstitialAd.this).mLock) {
                SDMInterstitialAd.this.isLoading = false;
                ((j) SDMInterstitialAd.this).mCacheAd = cVar;
            }
            SDMInterstitialAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "success", "");
            com.smartdigimkt.l7.b.a().e(new RunnableC0587a());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class c implements f {
        public c() {
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(com.smartdigimkt.f5.j jVar) {
            SDMInterstitialAd.this.printAdStatusLog("click", "success", "");
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdClick();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            SDMInterstitialAd.this.printAdStatusLog("close", "success", "");
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdClose();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(com.smartdigimkt.f5.j jVar) {
            SDMInterstitialAd.this.printAdStatusLog("impression", "success", "");
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdShow();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            SDMInterstitialAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.j, z2 ? "success" : "fail", "");
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onRewarded() {
            SDMInterstitialAd.this.printAdStatusLog("rewarded", "success", "");
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            SDMInterstitialAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36795l, "fail", hVar != null ? hVar.c() : "", new com.smartdigimkt.v7.a(hVar != null ? hVar.a() : "", strB));
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, strB));
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayEnd() {
            SDMInterstitialAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.g, "success", "");
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdVideoEnd();
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayStart() {
            SDMInterstitialAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f, "success", "");
            if (SDMInterstitialAd.this.mDevListener != null) {
                SDMInterstitialAd.this.mDevListener.onAdVideoStart();
            }
        }
    }

    public SDMInterstitialAd(Context context, String str) {
        this.mPlacementId = str;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new i(3, str);
    }

    @Override // com.smartdigimkt.q8.j
    public int getFormat() {
        return 3;
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

    public void setListener(SDMInterstitialListener sDMInterstitialListener) {
        this.mDevListener = sDMInterstitialListener;
    }

    public void show(Activity activity) {
        if (!checkReady(false)) {
            SDMInterstitialListener sDMInterstitialListener = this.mDevListener;
            if (sDMInterstitialListener != null) {
                sDMInterstitialListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail without ad cache"));
                return;
            }
            return;
        }
        notifyShow();
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        if (cVar instanceof e) {
            cVar.a(new c());
            printApiLog("show", "start", "");
            ((e) this.mCacheAd).a(activity);
        } else {
            SDMInterstitialListener sDMInterstitialListener2 = this.mDevListener;
            if (sDMInterstitialListener2 != null) {
                sDMInterstitialListener2.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail by " + this.mCacheAd));
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
