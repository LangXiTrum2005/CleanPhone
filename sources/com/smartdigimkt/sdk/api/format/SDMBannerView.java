package com.smartdigimkt.sdk.api.format;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.n8.n;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.q8.p;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;

/* JADX INFO: loaded from: classes6.dex */
public class SDMBannerView extends FrameLayout implements com.smartdigimkt.q8.e, SDMAdHandler {
    private final String TAG;
    private boolean canRenderBanner;
    boolean hasTouchWindow;
    com.smartdigimkt.k7.c impressionTracker;
    private volatile boolean isLoading;
    boolean isShowCall;
    private final com.smartdigimkt.q8.d mAdCallbackHandler;
    private com.smartdigimkt.q8.c mBannerRefreshTimer;
    private com.smartdigimkt.y4.b mCacheAd;
    private SDMBannerListener mDevListener;
    private com.smartdigimkt.q8.f mInnerBannerListener;
    boolean mIsRefresh;
    private com.smartdigimkt.y4.b mLastPresentCacheAd;
    private SDMAdRequest mLastSdmAdRequest;
    private k mLoadListener;
    private final Object mLock;
    private String mPlacementId;
    private com.smartdigimkt.y4.b mRefreshCacheAd;
    private boolean mRequestConfigRefresh;
    private com.smartdigimkt.q8.i mSdmAdLoadManager;
    com.smartdigimkt.k7.f.c visibilityChecker;

    public class a implements com.smartdigimkt.q8.f {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMBannerView$a$a, reason: collision with other inner class name */
        public class RunnableC0585a implements Runnable {
            public RunnableC0585a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMBannerView.this.mDevListener != null) {
                    SDMBannerView.this.mDevListener.onAdClick();
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMBannerView.this.mDevListener != null) {
                    SDMBannerView.this.mDevListener.onAdShow();
                }
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMBannerView.this.mDevListener != null) {
                    SDMBannerView.this.mDevListener.onAdClose();
                }
            }
        }

        public class d implements Runnable {
            final /* synthetic */ boolean val$isSuccess;

            public d(boolean z2) {
                this.val$isSuccess = z2;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMBannerView.this.mDevListener != null) {
                    SDMBannerView.this.mDevListener.onDeeplinkCallback(this.val$isSuccess);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.f
        public void onBannerClicked() {
            SDMBannerView.this.onAdStatus("click", "success");
            com.smartdigimkt.l7.b.a().e(new RunnableC0585a());
        }

        @Override // com.smartdigimkt.q8.f
        public void onBannerClose() {
            SDMBannerView.this.onAdStatus("close", "success");
            com.smartdigimkt.l7.b.a().e(new c());
        }

        @Override // com.smartdigimkt.q8.f
        public void onBannerShow(boolean z2) {
            SDMBannerView.this.onAdStatus("impression", "success");
            com.smartdigimkt.l7.b.a().e(new b());
        }

        @Override // com.smartdigimkt.q8.f
        public void onDeeplinkCallback(boolean z2) {
            SDMBannerView.this.onAdStatus(com.smartdigimkt.m6.a.r.j, z2 ? "success" : "fail");
            com.smartdigimkt.l7.b.a().e(new d(z2));
        }
    }

    public class b implements k<com.smartdigimkt.y4.c> {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMBannerView.this.mDevListener != null) {
                    SDMBannerView.this.mDevListener.onAdLoaded();
                }
                SDMBannerView.this.controlShow();
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.SDMBannerView$b$b, reason: collision with other inner class name */
        public class RunnableC0586b implements Runnable {
            final /* synthetic */ AdError val$adError;

            public RunnableC0586b(AdError adError) {
                this.val$adError = adError;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMBannerView.this.mDevListener == null || !SDMBannerView.this.canRenderBanner) {
                    return;
                }
                SDMBannerView sDMBannerView = SDMBannerView.this;
                if (sDMBannerView.mIsRefresh) {
                    return;
                }
                sDMBannerView.mDevListener.onAdLoadFail(this.val$adError);
            }
        }

        public b() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            SDMBannerView.this.onAdStatus(com.smartdigimkt.m6.a.r.f36790b, "fail", adError);
            synchronized (SDMBannerView.this.mLock) {
                SDMBannerView.this.isLoading = false;
            }
            if (SDMBannerView.this.mIsRefresh) {
                return;
            }
            com.smartdigimkt.l7.b.a().e(new RunnableC0586b(adError));
            if (SDMBannerView.this.mSdmAdLoadManager == null || !SDMBannerView.this.isInView() || SDMBannerView.this.mBannerRefreshTimer.a()) {
                return;
            }
            SDMBannerView.this.mBannerRefreshTimer.d();
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(com.smartdigimkt.y4.c cVar) {
            synchronized (SDMBannerView.this.mLock) {
                try {
                    SDMBannerView.this.isLoading = false;
                    if (cVar instanceof com.smartdigimkt.y4.b) {
                        SDMBannerView sDMBannerView = SDMBannerView.this;
                        if (sDMBannerView.mIsRefresh) {
                            sDMBannerView.mRefreshCacheAd = (com.smartdigimkt.y4.b) cVar;
                        } else {
                            sDMBannerView.mCacheAd = (com.smartdigimkt.y4.b) cVar;
                        }
                    }
                    SDMBannerView.this.onAdStatus(com.smartdigimkt.m6.a.r.f36790b, "success");
                } catch (Throwable th) {
                    throw th;
                }
            }
            SDMBannerView sDMBannerView2 = SDMBannerView.this;
            sDMBannerView2.isShowCall = true;
            if (sDMBannerView2.mIsRefresh) {
                return;
            }
            com.smartdigimkt.l7.b.a().e(new a());
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMBannerView.this.mDevListener != null) {
                SDMBannerView.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10001", "Please call setPlacementId(placementId) first."));
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMBannerView.this.mDevListener != null) {
                SDMBannerView.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMBannerView.this.mDevListener != null) {
                SDMBannerView.this.mDevListener.onAdLoaded();
            }
        }
    }

    public class f extends com.smartdigimkt.k7.a {
        final /* synthetic */ com.smartdigimkt.y4.b val$adCacheInfo;
        final /* synthetic */ Context val$context;
        final /* synthetic */ boolean val$isRefresh;

        public f(Context context, com.smartdigimkt.y4.b bVar, boolean z2) {
            this.val$context = context;
            this.val$adCacheInfo = bVar;
            this.val$isRefresh = z2;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public int getImpressionMinPercentageViewed() {
            return 50;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public int getImpressionMinTimeViewed() {
            return 0;
        }

        @Override // com.smartdigimkt.k7.a, com.smartdigimkt.k7.b
        public void recordImpression(View view) {
            SDMBannerView.this.notifyBannerShow(this.val$context, this.val$adCacheInfo, this.val$isRefresh);
        }
    }

    public class g implements Runnable {
        final /* synthetic */ boolean val$currentRefreshStatus;

        public class a implements Runnable {
            final /* synthetic */ com.smartdigimkt.y4.b val$adCacheInfo;

            public a(com.smartdigimkt.y4.b bVar) {
                this.val$adCacheInfo = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                SDMBannerView.this.renderBannerView(this.val$adCacheInfo, gVar.val$currentRefreshStatus);
            }
        }

        public g(boolean z2) {
            this.val$currentRefreshStatus = z2;
        }

        /* JADX WARN: Code duplicated, block: B:35:0x0081 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:4:0x0007, B:6:0x000f, B:8:0x0018, B:10:0x0021, B:13:0x002a, B:15:0x0030, B:21:0x003a, B:33:0x0079, B:35:0x0081, B:36:0x008a, B:24:0x0042, B:25:0x0054, B:27:0x005c, B:29:0x0064, B:31:0x0073, B:38:0x008c, B:39:0x0091), top: B:43:0x0007 }] */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (SDMBannerView.this.mSdmAdLoadManager) {
                try {
                    if (!SDMBannerView.this.canRenderBanner) {
                        String unused = SDMBannerView.this.TAG;
                        return;
                    }
                    com.smartdigimkt.y4.b bannerCache = SDMBannerView.this.getBannerCache();
                    boolean z2 = true;
                    if (bannerCache != null) {
                        if (bannerCache != SDMBannerView.this.mRefreshCacheAd || SDMBannerView.this.isInView()) {
                            SDMBannerView.this.canRenderBanner = false;
                            com.smartdigimkt.l7.b.a().e(new a(bannerCache));
                        } else {
                            SDMBannerView sDMBannerView = SDMBannerView.this;
                            if (!sDMBannerView.hasTouchWindow || !sDMBannerView.isShown()) {
                                z2 = false;
                            }
                            String unused2 = SDMBannerView.this.TAG;
                            if (z2) {
                                if (SDMBannerView.this.mBannerRefreshTimer != null) {
                                    SDMBannerView.this.mBannerRefreshTimer.d();
                                }
                            }
                        }
                    } else if (SDMBannerView.this.isRefreshOpen() && SDMBannerView.this.mSdmAdLoadManager != null) {
                        SDMBannerView sDMBannerView2 = SDMBannerView.this;
                        sDMBannerView2.load(1, sDMBannerView2.mLastSdmAdRequest);
                        SDMBannerView sDMBannerView3 = SDMBannerView.this;
                        if (sDMBannerView3.hasTouchWindow && sDMBannerView3.isShown()) {
                            if (SDMBannerView.this.mBannerRefreshTimer != null) {
                                SDMBannerView.this.mBannerRefreshTimer.d();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public class h implements Runnable {
        final /* synthetic */ com.smartdigimkt.y4.b val$adCacheInfo;

        public h(com.smartdigimkt.y4.b bVar) {
            this.val$adCacheInfo = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.smartdigimkt.y4.b bVar = this.val$adCacheInfo;
            if (bVar != null) {
                bVar.o();
            }
            com.smartdigimkt.i7.c.a(com.smartdigimkt.m6.b.p().k()).a(13, this.val$adCacheInfo.f());
        }
    }

    public class i implements com.smartdigimkt.f5.a {
        final /* synthetic */ boolean val$currentRefreshStatus;

        public i(boolean z2) {
            this.val$currentRefreshStatus = z2;
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(j jVar) {
            if (SDMBannerView.this.mInnerBannerListener != null) {
                SDMBannerView.this.mInnerBannerListener.onBannerClicked();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            if (SDMBannerView.this.mInnerBannerListener != null) {
                SDMBannerView.this.mInnerBannerListener.onBannerClose();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(j jVar) {
            if (SDMBannerView.this.mInnerBannerListener != null) {
                SDMBannerView.this.mInnerBannerListener.onBannerShow(this.val$currentRefreshStatus);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            if (SDMBannerView.this.mInnerBannerListener != null) {
                SDMBannerView.this.mInnerBannerListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(com.smartdigimkt.v3.h hVar) {
            SDMBannerView.this.onAdStatus(com.smartdigimkt.m6.a.r.f36795l, "fail", new com.smartdigimkt.v7.a(hVar != null ? hVar.a() : "", hVar != null ? hVar.b() : ""));
        }
    }

    public SDMBannerView(Context context) {
        super(context);
        this.TAG = "SDMBannerView";
        this.mLock = new Object();
        this.mAdCallbackHandler = new com.smartdigimkt.q8.a();
        this.isLoading = false;
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mRequestConfigRefresh = true;
        this.mInnerBannerListener = new a();
        this.mLoadListener = new b();
        this.mBannerRefreshTimer = new com.smartdigimkt.q8.c(this);
    }

    private boolean checkVisibilityPercent() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.smartdigimkt.y4.b getBannerCache() {
        com.smartdigimkt.y4.b bVar = this.mRefreshCacheAd;
        if (bVar != null && bVar.m()) {
            return this.mRefreshCacheAd;
        }
        com.smartdigimkt.y4.b bVar2 = this.mCacheAd;
        if (bVar2 == null || !bVar2.m()) {
            return null;
        }
        return this.mCacheAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInView() {
        return this.hasTouchWindow && isShown() && checkVisibilityPercent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRefreshOpen() {
        com.smartdigimkt.l8.e eVarA;
        return this.mRequestConfigRefresh && (eVarA = com.smartdigimkt.k8.c.a().a(this.mPlacementId)) != null && eVarA.m() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerShow(Context context, com.smartdigimkt.y4.b bVar, boolean z2) {
        System.currentTimeMillis();
        com.smartdigimkt.l7.b.a().g(new h(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdStatus(String str, String str2) {
        onAdStatus(str, str2, null);
    }

    private void printReadyLog(com.smartdigimkt.y4.c cVar, boolean z2) {
        if (!z2 || cVar == null) {
            n.a(this.mPlacementId, com.smartdigimkt.n8.f.a(String.valueOf(2)), com.smartdigimkt.m6.a.r.x, String.valueOf(false), "");
        } else if (cVar.h() != null) {
            n.a(this.mPlacementId, com.smartdigimkt.n8.f.a(String.valueOf(2)), com.smartdigimkt.m6.a.r.x, String.valueOf(true), "");
        }
        com.smartdigimkt.n8.d.a(cVar, "isAdReady");
    }

    private void registerDelayShow(View view, Context context, com.smartdigimkt.y4.b bVar, boolean z2) {
        if (view == null) {
            view = this;
        }
        com.smartdigimkt.k7.c cVar = this.impressionTracker;
        if (cVar != null) {
            cVar.a(view, new f(context, bVar, z2));
        }
    }

    private void releaseExpireCache() {
        notifyLoss(new SDMLossInfo(SDMLossInfo.LOSS_REASON.LOSS_TO_EXPIRE, 0.0d));
        destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBannerView(com.smartdigimkt.y4.b bVar, boolean z2) {
        if (bVar != null) {
            bVar.a(new i(z2));
            View viewP = bVar.p();
            if (viewP != null && viewP.getParent() != null && viewP.getParent() != this) {
                ((ViewGroup) viewP.getParent()).removeView(viewP);
            }
            com.smartdigimkt.y4.b bVar2 = this.mLastPresentCacheAd;
            if (bVar2 != null) {
                bVar2.c();
            }
            this.mLastPresentCacheAd = bVar;
            if (viewP != null) {
                if (isInView()) {
                    notifyBannerShow(getContext().getApplicationContext(), bVar, z2);
                } else {
                    registerDelayShow(viewP, getContext().getApplicationContext(), bVar, z2);
                }
                removeAllViews();
                int i2 = viewP.getLayoutParams() != null ? viewP.getLayoutParams().width : 0;
                if (i2 == 0) {
                    i2 = -2;
                }
                int i3 = viewP.getLayoutParams() != null ? viewP.getLayoutParams().height : 0;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3 != 0 ? i3 : -2);
                layoutParams.gravity = 17;
                viewP.setLayoutParams(layoutParams);
                addView(viewP, layoutParams);
            } else {
                Log.e(this.TAG, "Network's banner view = null. Did you call destroy()?");
            }
            this.mBannerRefreshTimer.d();
            if (isRefreshOpen()) {
                load(1, this.mLastSdmAdRequest);
            }
        }
    }

    public boolean checkReady(boolean z2) {
        boolean zA;
        int i2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.smartdigimkt.y4.b bVar = this.mCacheAd;
        if (bVar != null) {
            int iK = bVar.k();
            zA = this.mCacheAd.a(iK);
            if (iK == 1) {
                releaseExpireCache();
            }
            i2 = iK;
        } else {
            zA = false;
            i2 = 0;
        }
        if (z2) {
            com.smartdigimkt.i7.d.a(zA, this.mPlacementId, this.mCacheAd, System.currentTimeMillis() - jCurrentTimeMillis, i2);
            printReadyLog(this.mCacheAd, zA);
        }
        if (!zA) {
            this.mCacheAd = null;
        }
        return zA;
    }

    public void controlShow() {
        com.smartdigimkt.l7.b.a().g(new g(this.mIsRefresh));
    }

    public void destroy() {
        synchronized (this.mLock) {
            try {
                removeAllViews();
                synchronized (this.mLock) {
                    try {
                        com.smartdigimkt.y4.b bVar = this.mCacheAd;
                        if (bVar != null) {
                            bVar.c();
                            this.mCacheAd = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                com.smartdigimkt.y4.b bVar2 = this.mRefreshCacheAd;
                if (bVar2 != null) {
                    bVar2.c();
                    this.mRefreshCacheAd = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        com.smartdigimkt.q8.c cVar = this.mBannerRefreshTimer;
        if (cVar != null) {
            cVar.c();
        }
        com.smartdigimkt.k7.c cVar2 = this.impressionTracker;
        if (cVar2 != null) {
            cVar2.a();
        }
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public SDMAd getSDMAd() {
        com.smartdigimkt.y4.b bVar = this.mCacheAd;
        if (bVar != null) {
            return com.smartdigimkt.q8.g.a(bVar);
        }
        return null;
    }

    public boolean isAdReady() {
        return checkReady(true);
    }

    public void load() {
        load(null);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyLoss(SDMLossInfo sDMLossInfo) {
        p.d(this.mCacheAd, sDMLossInfo);
    }

    @Override // com.smartdigimkt.sdk.api.format.SDMAdHandler
    public void notifyWin(SDMWinInfo sDMWinInfo) {
        p.d(this.mCacheAd, sDMWinInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.hasTouchWindow = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.hasTouchWindow = false;
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i2) {
        super.onVisibilityChanged(view, i2);
        if (i2 == 0) {
            controlShow();
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            controlShow();
        }
    }

    public void setListener(SDMBannerListener sDMBannerListener) {
        this.mDevListener = sDMBannerListener;
    }

    public void setPlacementId(String str) {
        this.mSdmAdLoadManager = new com.smartdigimkt.q8.i(2, str);
        this.mPlacementId = str;
        this.mBannerRefreshTimer.a(str);
        if (this.impressionTracker == null) {
            this.impressionTracker = new com.smartdigimkt.k7.c(1, getContext(), 50);
        }
    }

    @Override // com.smartdigimkt.q8.e
    public void timeUpRefreshView() {
        this.isShowCall = true;
        this.canRenderBanner = true;
        controlShow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onAdStatus(String str, String str2, AdError adError) {
        this.mAdCallbackHandler.a(this.mCacheAd);
        com.smartdigimkt.q8.a.a(this.mAdCallbackHandler, str, str2, adError);
        com.smartdigimkt.y4.b bVar = this.mCacheAd;
        com.smartdigimkt.a7.a aVarF = null;
        com.smartdigimkt.a7.a aVarF2 = bVar != null ? bVar.f() : null;
        if (aVarF2 == null) {
            com.smartdigimkt.y4.b bVar2 = this.mRefreshCacheAd;
            if (bVar2 != null) {
                aVarF = bVar2.f();
            }
        } else {
            aVarF = aVarF2;
        }
        n.a(aVarF, str, str2, adError != null ? adError.getErrorInfo() : "");
    }

    public void load(SDMAdRequest sDMAdRequest) {
        load(0, sDMAdRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void load(int i2, SDMAdRequest sDMAdRequest) {
        if (this.mSdmAdLoadManager != null && !TextUtils.isEmpty(this.mPlacementId)) {
            this.mIsRefresh = i2 == 1;
            if (i2 == 0) {
                this.canRenderBanner = true;
            }
            if (sDMAdRequest != null) {
                this.mRequestConfigRefresh = sDMAdRequest.getBannerRefresh();
            }
            this.mLastSdmAdRequest = sDMAdRequest;
            synchronized (this.mLock) {
                try {
                    if (this.isLoading) {
                        com.smartdigimkt.l7.b.a().e(new d());
                        return;
                    }
                    if (!this.mIsRefresh && this.mCacheAd != null && checkReady(false)) {
                        com.smartdigimkt.l7.b.a().e(new e());
                        return;
                    } else {
                        this.isLoading = true;
                        this.mSdmAdLoadManager.a(getContext(), this.mLoadListener, sDMAdRequest, i2);
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.smartdigimkt.l7.b.a().e(new c());
    }

    public SDMBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "SDMBannerView";
        this.mLock = new Object();
        this.mAdCallbackHandler = new com.smartdigimkt.q8.a();
        this.isLoading = false;
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mRequestConfigRefresh = true;
        this.mInnerBannerListener = new a();
        this.mLoadListener = new b();
        this.mBannerRefreshTimer = new com.smartdigimkt.q8.c(this);
    }

    public SDMBannerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.TAG = "SDMBannerView";
        this.mLock = new Object();
        this.mAdCallbackHandler = new com.smartdigimkt.q8.a();
        this.isLoading = false;
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mRequestConfigRefresh = true;
        this.mInnerBannerListener = new a();
        this.mLoadListener = new b();
        this.mBannerRefreshTimer = new com.smartdigimkt.q8.c(this);
    }
}
