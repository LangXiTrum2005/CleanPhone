package com.smartdigimkt.sdk.api.format.myoffer;

import android.content.Context;
import com.smartdigimkt.h5.c;
import com.smartdigimkt.h5.e;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.q8.l;
import com.smartdigimkt.q8.m;
import com.smartdigimkt.q8.n;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMNativeAd;
import com.smartdigimkt.sdk.api.format.SDMNativeLoadListener;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMMyOfferNative extends m {
    protected Context mContext;
    private SDMNativeLoadListener mDevListener;
    private n mNativeAdImp;
    protected String mPlacementId;
    private l mSdmAdLoadManager;
    private volatile boolean isLoading = false;
    private k mLoadListener = new a();

    public class a implements k<c> {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferNative$a$a, reason: collision with other inner class name */
        public class RunnableC0595a implements Runnable {
            final /* synthetic */ c val$ownBaseAd;

            public RunnableC0595a(c cVar) {
                this.val$ownBaseAd = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!(this.val$ownBaseAd instanceof e)) {
                    if (SDMMyOfferNative.this.mDevListener != null) {
                        SDMMyOfferNative.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("20001", "Ad is loaded but not match type."));
                    }
                } else if (SDMMyOfferNative.this.mDevListener != null) {
                    SDMMyOfferNative.this.mNativeAdImp = new n((e) this.val$ownBaseAd);
                    SDMMyOfferNative.this.mDevListener.onAdLoaded(SDMMyOfferNative.this.mNativeAdImp);
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
                if (SDMMyOfferNative.this.mDevListener != null) {
                    SDMMyOfferNative.this.mDevListener.onAdLoadFail(this.val$adError);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            synchronized (((m) SDMMyOfferNative.this).mLock) {
                SDMMyOfferNative.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new b(adError));
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(c cVar) {
            synchronized (((m) SDMMyOfferNative.this).mLock) {
                SDMMyOfferNative.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new RunnableC0595a(cVar));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferNative.this.mDevListener != null) {
                SDMMyOfferNative.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public SDMMyOfferNative(Context context, String str) {
        this.mPlacementId = str;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new l(0, str);
    }

    public Map<String, Object> getExtraInfoMap() {
        c cVar = this.mCacheAd;
        if (cVar != null) {
            return com.smartdigimkt.m3.c.a(cVar);
        }
        return null;
    }

    @Override // com.smartdigimkt.q8.m
    public int getFormat() {
        return 0;
    }

    public SDMNativeAd getNativeAd() {
        return this.mNativeAdImp;
    }

    @Override // com.smartdigimkt.q8.m
    public String getPlacementId() {
        return this.mPlacementId;
    }

    public void load() {
        load(null);
    }

    public void setListener(SDMNativeLoadListener sDMNativeLoadListener) {
        this.mDevListener = sDMNativeLoadListener;
    }

    public void load(SDMAdRequest sDMAdRequest) {
        synchronized (this.mLock) {
            try {
                if (this.isLoading) {
                    com.smartdigimkt.l7.b.a().e(new b());
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
