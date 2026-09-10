package com.smartdigimkt.sdk.api.format.myoffer;

import android.content.Context;
import android.view.ViewGroup;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.h5.g;
import com.smartdigimkt.n8.h;
import com.smartdigimkt.q8.l;
import com.smartdigimkt.q8.m;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMSplashAdExtraInfo;
import com.smartdigimkt.sdk.api.format.SDMSplashListener;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMMyOfferSplashAd extends m {
    private volatile boolean isLoading;
    protected Context mContext;
    private SDMSplashListener mDevListener;
    protected long mFetchAdTimeout;
    protected String mPlacementId;
    private l mSdmAdLoadManager;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onAdLoaded(false);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ SDMAdRequest val$adRequest;

        public class a extends com.smartdigimkt.q8.b<com.smartdigimkt.h5.c> {

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferSplashAd$c$a$a, reason: collision with other inner class name */
            public class RunnableC0597a implements Runnable {
                final /* synthetic */ boolean val$isTimeout;

                public RunnableC0597a(boolean z2) {
                    this.val$isTimeout = z2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SDMMyOfferSplashAd.this.mDevListener != null) {
                        SDMMyOfferSplashAd.this.mDevListener.onAdLoaded(this.val$isTimeout);
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
                    if (SDMMyOfferSplashAd.this.mDevListener != null) {
                        SDMMyOfferSplashAd.this.mDevListener.onAdLoadFail(this.val$adError);
                    }
                }
            }

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferSplashAd$c$a$c, reason: collision with other inner class name */
            public class RunnableC0598c implements Runnable {
                public RunnableC0598c() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SDMMyOfferSplashAd.this.mDevListener != null) {
                        SDMMyOfferSplashAd.this.mDevListener.onAdLoadTimeout();
                    }
                }
            }

            public a() {
            }

            @Override // com.smartdigimkt.q8.b
            public void onAdLoadFail(String str, AdError adError) {
                if (adError != null) {
                    adError.getErrorInfo();
                }
                synchronized (((m) SDMMyOfferSplashAd.this).mLock) {
                    SDMMyOfferSplashAd.this.isLoading = false;
                }
                com.smartdigimkt.l7.b.a().e(new b(adError));
            }

            @Override // com.smartdigimkt.q8.b
            public void onTimeout(String str) {
                com.smartdigimkt.l7.b.a().e(new RunnableC0598c());
            }

            @Override // com.smartdigimkt.q8.b
            public void onAdLoaded(String str, boolean z2, com.smartdigimkt.h5.c cVar) {
                synchronized (((m) SDMMyOfferSplashAd.this).mLock) {
                    SDMMyOfferSplashAd.this.isLoading = false;
                    ((m) SDMMyOfferSplashAd.this).mCacheAd = cVar;
                }
                com.smartdigimkt.l7.b.a().e(new RunnableC0597a(z2));
            }
        }

        public c(SDMAdRequest sDMAdRequest) {
            this.val$adRequest = sDMAdRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = SDMMyOfferSplashAd.this.mFetchAdTimeout;
            if (j <= 0) {
                j = 10000;
            }
            a aVar = new a();
            aVar.startCountDown(j);
            SDMMyOfferSplashAd.this.mSdmAdLoadManager.a(SDMMyOfferSplashAd.this.mContext, aVar, this.val$adRequest);
        }
    }

    public class d implements com.smartdigimkt.f5.a {
        final /* synthetic */ WeakReference val$finalCacheSplash;

        public d(WeakReference weakReference) {
            this.val$finalCacheSplash = weakReference;
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(j jVar) {
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onAdClick();
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x002d  */
        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            int i2;
            g gVar;
            Map<String, Object> mapD;
            WeakReference weakReference = this.val$finalCacheSplash;
            if (weakReference == null || (gVar = (g) weakReference.get()) == null || (mapD = gVar.d()) == null) {
                i2 = 0;
            } else {
                try {
                    int iA = h.a(mapD, "close_scene", 1);
                    i2 = 3;
                    if (iA != 2) {
                        if (iA == 3 || iA == 5) {
                            i2 = 99;
                        } else if (iA == 6) {
                            i2 = 4;
                        } else if (iA != 10) {
                            i2 = 2;
                        } else {
                            i2 = 99;
                        }
                    }
                } catch (Throwable unused) {
                    i2 = 0;
                }
            }
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onAdClose(new SDMSplashAdExtraInfo(i2));
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(j jVar) {
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onAdShow();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(com.smartdigimkt.v3.h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            if (SDMMyOfferSplashAd.this.mDevListener != null) {
                SDMMyOfferSplashAd.this.mDevListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, strB));
            }
        }
    }

    public SDMMyOfferSplashAd(Context context, String str) {
        this(context, str, 0L);
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
        return 4;
    }

    @Override // com.smartdigimkt.q8.m
    public String getPlacementId() {
        return this.mPlacementId;
    }

    public boolean isSupportCustomSkipView() {
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        return cVar != null && (cVar instanceof g);
    }

    public void load() {
        load(null);
    }

    public void setListener(SDMSplashListener sDMSplashListener) {
        this.mDevListener = sDMSplashListener;
    }

    public void show(ViewGroup viewGroup) {
        if (!checkReady()) {
            SDMSplashListener sDMSplashListener = this.mDevListener;
            if (sDMSplashListener != null) {
                sDMSplashListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail without ad cache"));
                return;
            }
            return;
        }
        notifyShow();
        if (this.mCacheAd instanceof g) {
            ((g) this.mCacheAd).a(new d(new WeakReference((g) this.mCacheAd)));
            ((g) this.mCacheAd).a(viewGroup);
        } else {
            SDMSplashListener sDMSplashListener2 = this.mDevListener;
            if (sDMSplashListener2 != null) {
                sDMSplashListener2.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail by " + this.mCacheAd));
            }
        }
    }

    public SDMMyOfferSplashAd(Context context, String str, long j) {
        this.isLoading = false;
        this.mPlacementId = str;
        this.mFetchAdTimeout = j;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new l(4, str);
    }

    public void load(SDMAdRequest sDMAdRequest) {
        synchronized (this.mLock) {
            try {
                if (this.isLoading) {
                    com.smartdigimkt.l7.b.a().e(new a());
                } else if (checkReady()) {
                    com.smartdigimkt.l7.b.a().e(new b());
                } else {
                    this.isLoading = true;
                    com.smartdigimkt.l7.b.a().g(new c(sDMAdRequest));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
