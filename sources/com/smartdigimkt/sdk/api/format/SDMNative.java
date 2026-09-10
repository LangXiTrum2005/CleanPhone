package com.smartdigimkt.sdk.api.format;

import android.content.Context;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.q8.j;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.q8.o;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.y4.c;
import com.smartdigimkt.y4.f;

/* JADX INFO: loaded from: classes6.dex */
public class SDMNative extends j {
    protected Context mContext;
    private SDMNativeLoadListener mDevListener;
    private o mNativeAdImp;
    protected String mPlacementId;
    private i mSdmAdLoadManager;
    private volatile boolean isLoading = false;
    private k mLoadListener = new a();

    public class a implements k<c> {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMNative$a$a, reason: collision with other inner class name */
        public class RunnableC0588a implements Runnable {
            final /* synthetic */ c val$ownBaseAd;

            public RunnableC0588a(c cVar) {
                this.val$ownBaseAd = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (!(this.val$ownBaseAd instanceof f)) {
                    if (SDMNative.this.mDevListener != null) {
                        SDMNative.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("20001", "Ad is loaded but not match type."));
                    }
                } else if (SDMNative.this.mDevListener != null) {
                    SDMNative.this.mNativeAdImp = new o((f) this.val$ownBaseAd);
                    SDMNative.this.mDevListener.onAdLoaded(SDMNative.this.mNativeAdImp);
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
                if (SDMNative.this.mDevListener != null) {
                    SDMNative.this.mDevListener.onAdLoadFail(this.val$adError);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            SDMNative.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "fail", adError != null ? adError.getErrorInfo() : "", adError);
            synchronized (((j) SDMNative.this).mLock) {
                SDMNative.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new b(adError));
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(c cVar) {
            SDMNative.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "success", "");
            synchronized (((j) SDMNative.this).mLock) {
                SDMNative.this.isLoading = false;
            }
            com.smartdigimkt.l7.b.a().e(new RunnableC0588a(cVar));
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMNative.this.mDevListener != null) {
                SDMNative.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public SDMNative(Context context, String str) {
        this.mPlacementId = str;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new i(0, str);
    }

    @Override // com.smartdigimkt.q8.j
    public int getFormat() {
        return 0;
    }

    public SDMNativeAd getNativeAd() {
        return this.mNativeAdImp;
    }

    @Override // com.smartdigimkt.q8.j
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
