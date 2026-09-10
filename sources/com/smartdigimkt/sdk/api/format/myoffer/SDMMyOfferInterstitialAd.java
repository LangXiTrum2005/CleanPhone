package com.smartdigimkt.sdk.api.format.myoffer;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.f5.f;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.h5.d;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.q8.l;
import com.smartdigimkt.q8.m;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMInterstitialListener;
import com.smartdigimkt.v3.h;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMMyOfferInterstitialAd extends m {
    protected Context mContext;
    private SDMInterstitialListener mDevListener;
    protected String mPlacementId;
    private l mSdmAdLoadManager;
    private volatile boolean isLoading = false;
    private k mLoadListener = new a();

    public class a implements k<com.smartdigimkt.h5.c> {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferInterstitialAd$a$a, reason: collision with other inner class name */
        public class RunnableC0594a implements Runnable {
            public RunnableC0594a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                    SDMMyOfferInterstitialAd.this.mDevListener.onAdLoaded();
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
                if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                    SDMMyOfferInterstitialAd.this.mDevListener.onAdLoadFail(this.val$adError);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            if (adError != null) {
                adError.getErrorInfo();
            }
            synchronized (((m) SDMMyOfferInterstitialAd.this).mLock) {
                SDMMyOfferInterstitialAd.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new b(adError));
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(com.smartdigimkt.h5.c cVar) {
            synchronized (((m) SDMMyOfferInterstitialAd.this).mLock) {
                SDMMyOfferInterstitialAd.this.isLoading = false;
                ((m) SDMMyOfferInterstitialAd.this).mCacheAd = cVar;
            }
            com.smartdigimkt.l7.b.a().e(new RunnableC0594a());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class c implements f {
        public c() {
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(j jVar) {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdClick();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdClose();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(j jVar) {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdShow();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onRewarded() {
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, strB));
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayEnd() {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdVideoEnd();
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayStart() {
            if (SDMMyOfferInterstitialAd.this.mDevListener != null) {
                SDMMyOfferInterstitialAd.this.mDevListener.onAdVideoStart();
            }
        }
    }

    public SDMMyOfferInterstitialAd(Context context, String str) {
        this.mPlacementId = str;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new l(3, str);
    }

    public Map<String, Object> getExtraInfoMap() {
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        if (cVar != null) {
            return com.smartdigimkt.m3.c.a(cVar);
        }
        return null;
    }

    @Override // com.smartdigimkt.q8.m
    public int getFormat() {
        return 3;
    }

    @Override // com.smartdigimkt.q8.m
    public String getPlacementId() {
        return this.mPlacementId;
    }

    public void load() {
        load(null);
    }

    public void setListener(SDMInterstitialListener sDMInterstitialListener) {
        this.mDevListener = sDMInterstitialListener;
    }

    public void show(Activity activity) {
        show(activity, null);
    }

    public void load(SDMAdRequest sDMAdRequest) {
        synchronized (this.mLock) {
            try {
                if (this.isLoading) {
                    com.smartdigimkt.l7.b.a().e(new b());
                } else if (checkReady()) {
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

    public void show(Activity activity, Map<String, Object> map) {
        if (!checkReady()) {
            SDMInterstitialListener sDMInterstitialListener = this.mDevListener;
            if (sDMInterstitialListener != null) {
                sDMInterstitialListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail without ad cache"));
                return;
            }
            return;
        }
        notifyShow();
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        if (cVar instanceof d) {
            ((d) cVar).a(new c());
            ((d) this.mCacheAd).a(activity);
            return;
        }
        SDMInterstitialListener sDMInterstitialListener2 = this.mDevListener;
        if (sDMInterstitialListener2 != null) {
            sDMInterstitialListener2.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail by " + this.mCacheAd));
        }
    }
}
