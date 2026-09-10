package com.smartdigimkt.sdk.api.format;

import android.content.Context;
import android.view.ViewGroup;
import com.smartdigimkt.q8.g;
import com.smartdigimkt.q8.i;
import com.smartdigimkt.q8.j;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.y4.h;
import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMSplashAd extends j implements SDMAdHandler {
    private volatile boolean isLoading;
    protected Context mContext;
    private SDMSplashListener mDevListener;
    protected long mFetchAdTimeout;
    protected String mPlacementId;
    private i mSdmAdLoadManager;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onAdLoaded(false);
            }
        }
    }

    public class c implements Runnable {
        final /* synthetic */ SDMAdRequest val$adRequest;

        public class a extends com.smartdigimkt.q8.b<com.smartdigimkt.y4.c> {

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMSplashAd$c$a$a, reason: collision with other inner class name */
            public class RunnableC0590a implements Runnable {
                final /* synthetic */ boolean val$isTimeout;

                public RunnableC0590a(boolean z2) {
                    this.val$isTimeout = z2;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SDMSplashAd.this.mDevListener != null) {
                        SDMSplashAd.this.mDevListener.onAdLoaded(this.val$isTimeout);
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
                    if (SDMSplashAd.this.mDevListener != null) {
                        SDMSplashAd.this.mDevListener.onAdLoadFail(this.val$adError);
                    }
                }
            }

            /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMSplashAd$c$a$c, reason: collision with other inner class name */
            public class RunnableC0591c implements Runnable {
                public RunnableC0591c() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (SDMSplashAd.this.mDevListener != null) {
                        SDMSplashAd.this.mDevListener.onAdLoadTimeout();
                    }
                }
            }

            public a() {
            }

            @Override // com.smartdigimkt.q8.b
            public void onAdLoadFail(String str, AdError adError) {
                SDMSplashAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "fail", adError != null ? adError.getErrorInfo() : "", adError);
                synchronized (((j) SDMSplashAd.this).mLock) {
                    SDMSplashAd.this.isLoading = false;
                }
                com.smartdigimkt.l7.b.a().e(new b(adError));
            }

            @Override // com.smartdigimkt.q8.b
            public void onTimeout(String str) {
                SDMSplashAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "timeout", "");
                com.smartdigimkt.l7.b.a().e(new RunnableC0591c());
            }

            @Override // com.smartdigimkt.q8.b
            public void onAdLoaded(String str, boolean z2, com.smartdigimkt.y4.c cVar) {
                synchronized (((j) SDMSplashAd.this).mLock) {
                    SDMSplashAd.this.isLoading = false;
                    ((j) SDMSplashAd.this).mCacheAd = cVar;
                }
                SDMSplashAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36790b, "success", "");
                com.smartdigimkt.l7.b.a().e(new RunnableC0590a(z2));
            }
        }

        public c(SDMAdRequest sDMAdRequest) {
            this.val$adRequest = sDMAdRequest;
        }

        @Override // java.lang.Runnable
        public void run() {
            long j = SDMSplashAd.this.mFetchAdTimeout;
            if (j <= 0) {
                j = 10000;
            }
            a aVar = new a();
            aVar.startCountDown(j);
            SDMSplashAd.this.mSdmAdLoadManager.a(SDMSplashAd.this.mContext, aVar, this.val$adRequest);
        }
    }

    public class d implements com.smartdigimkt.f5.a {
        final /* synthetic */ WeakReference val$finalCacheSplash;

        public d(WeakReference weakReference) {
            this.val$finalCacheSplash = weakReference;
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(com.smartdigimkt.f5.j jVar) {
            SDMSplashAd.this.printAdStatusLog("click", "success", "");
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onAdClick();
            }
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0038  */
        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            int i2;
            h hVar;
            Map<String, Object> mapE;
            SDMSplashAd.this.printAdStatusLog("close", "success", "");
            WeakReference weakReference = this.val$finalCacheSplash;
            if (weakReference == null || (hVar = (h) weakReference.get()) == null || (mapE = hVar.e()) == null) {
                i2 = 0;
            } else {
                try {
                    int iA = com.smartdigimkt.n8.h.a(mapE, "close_scene", 1);
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
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onAdClose(new SDMSplashAdExtraInfo(i2));
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(com.smartdigimkt.f5.j jVar) {
            SDMSplashAd.this.printAdStatusLog("impression", "success", "");
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onAdShow();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            SDMSplashAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.j, z2 ? "success" : "fail", "");
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(com.smartdigimkt.v3.h hVar) {
            String strB = hVar != null ? hVar.b() : "";
            SDMSplashAd.this.printAdStatusLog(com.smartdigimkt.m6.a.r.f36795l, "fail", hVar != null ? hVar.c() : "", new com.smartdigimkt.v7.a(hVar != null ? hVar.a() : "", strB));
            if (SDMSplashAd.this.mDevListener != null) {
                SDMSplashAd.this.mDevListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, strB));
            }
        }
    }

    public SDMSplashAd(Context context, String str) {
        this(context, str, 0L);
    }

    @Override // com.smartdigimkt.q8.j
    public int getFormat() {
        return 4;
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

    public boolean isSupportCustomSkipView() {
        com.smartdigimkt.y4.c cVar = this.mCacheAd;
        if (cVar == null || !(cVar instanceof h)) {
            return false;
        }
        return ((h) cVar).p();
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

    public void setListener(SDMSplashListener sDMSplashListener) {
        this.mDevListener = sDMSplashListener;
    }

    public void show(ViewGroup viewGroup) {
        if (!checkReady(false)) {
            SDMSplashListener sDMSplashListener = this.mDevListener;
            if (sDMSplashListener != null) {
                sDMSplashListener.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail without ad cache"));
                return;
            }
            return;
        }
        notifyShow();
        if (this.mCacheAd instanceof h) {
            this.mCacheAd.a(new d(new WeakReference((h) this.mCacheAd)));
            printApiLog("show", "start", "");
            ((h) this.mCacheAd).a(viewGroup);
            return;
        }
        SDMSplashListener sDMSplashListener2 = this.mDevListener;
        if (sDMSplashListener2 != null) {
            sDMSplashListener2.onAdShowFail(com.smartdigimkt.v7.b.a(com.smartdigimkt.v7.b.f39191l, "show fail by " + this.mCacheAd));
        }
    }

    public SDMSplashAd(Context context, String str, long j) {
        this.isLoading = false;
        this.mPlacementId = str;
        this.mFetchAdTimeout = j;
        if (context != null) {
            this.mContext = context.getApplicationContext();
        }
        this.mSdmAdLoadManager = new i(4, str);
    }

    public void load(SDMAdRequest sDMAdRequest) {
        synchronized (this.mLock) {
            try {
                if (this.isLoading) {
                    com.smartdigimkt.l7.b.a().e(new a());
                } else if (checkReady(false)) {
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
