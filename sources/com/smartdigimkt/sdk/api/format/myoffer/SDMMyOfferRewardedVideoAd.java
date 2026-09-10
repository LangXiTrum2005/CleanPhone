package com.smartdigimkt.sdk.api.format.myoffer;

import android.app.Activity;
import android.content.Context;
import com.smartdigimkt.f5.f;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.q8.l;
import com.smartdigimkt.q8.m;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMRewardVideoListener;
import com.smartdigimkt.v3.h;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMMyOfferRewardedVideoAd extends m {
    protected Context mContext;
    private SDMRewardVideoListener mDevListener;
    protected String mPlacementId;
    private final l mSdmAdLoadManager;
    private volatile boolean isLoading = false;
    private final k mLoadListener = new a();

    public class a implements k<com.smartdigimkt.h5.c> {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferRewardedVideoAd$a$a, reason: collision with other inner class name */
        public class RunnableC0596a implements Runnable {
            public RunnableC0596a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                    SDMMyOfferRewardedVideoAd.this.mDevListener.onAdLoaded();
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
                if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                    SDMMyOfferRewardedVideoAd.this.mDevListener.onAdLoadFail(this.val$adError);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            synchronized (((m) SDMMyOfferRewardedVideoAd.this).mLock) {
                SDMMyOfferRewardedVideoAd.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new b(adError));
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(com.smartdigimkt.h5.c cVar) {
            synchronized (((m) SDMMyOfferRewardedVideoAd.this).mLock) {
                SDMMyOfferRewardedVideoAd.this.isLoading = false;
                ((m) SDMMyOfferRewardedVideoAd.this).mCacheAd = cVar;
            }
            com.smartdigimkt.l7.b.a().e(new RunnableC0596a());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class c implements f {
        public c() {
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(j jVar) {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdClick();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdClose();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(j jVar) {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdPlayStart();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onRewarded() {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdReward();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdPlayFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, strB));
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayEnd() {
            if (SDMMyOfferRewardedVideoAd.this.mDevListener != null) {
                SDMMyOfferRewardedVideoAd.this.mDevListener.onAdPlayEnd();
            }
        }

        @Override // com.smartdigimkt.f5.e
        public void onVideoAdPlayStart() {
        }
    }

    public SDMMyOfferRewardedVideoAd(Context context, String str) {
        this.mPlacementId = str;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new l(1, str);
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
        return 1;
    }

    @Override // com.smartdigimkt.q8.m
    public String getPlacementId() {
        return this.mPlacementId;
    }

    public void load() {
        load(null);
    }

    public void setListener(SDMRewardVideoListener sDMRewardVideoListener) {
        this.mDevListener = sDMRewardVideoListener;
    }

    public void show(Activity activity) {
        if (!checkReady()) {
            SDMRewardVideoListener sDMRewardVideoListener = this.mDevListener;
            if (sDMRewardVideoListener != null) {
                sDMRewardVideoListener.onAdPlayFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail without ad cache"));
                return;
            }
            return;
        }
        notifyShow();
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        if (cVar instanceof com.smartdigimkt.h5.f) {
            ((com.smartdigimkt.h5.f) cVar).a(new c());
            ((com.smartdigimkt.h5.f) this.mCacheAd).a(activity);
            return;
        }
        SDMRewardVideoListener sDMRewardVideoListener2 = this.mDevListener;
        if (sDMRewardVideoListener2 != null) {
            sDMRewardVideoListener2.onAdPlayFailed(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail by " + this.mCacheAd));
        }
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
}
