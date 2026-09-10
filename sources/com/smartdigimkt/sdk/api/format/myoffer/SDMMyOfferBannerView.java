package com.smartdigimkt.sdk.api.format.myoffer;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.smartdigimkt.f5.j;
import com.smartdigimkt.q8.k;
import com.smartdigimkt.q8.l;
import com.smartdigimkt.sdk.api.AdError;
import com.smartdigimkt.sdk.api.SDMAdRequest;
import com.smartdigimkt.sdk.api.format.SDMBannerListener;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class SDMMyOfferBannerView extends FrameLayout implements com.smartdigimkt.q8.e {
    private final String TAG;
    private boolean canRenderBanner;
    boolean hasTouchWindow;
    com.smartdigimkt.k7.c impressionTracker;
    private volatile boolean isLoading;
    boolean isShowCall;
    private final com.smartdigimkt.q8.d mAdCallbackHandler;
    private com.smartdigimkt.q8.c mBannerRefreshTimer;
    private com.smartdigimkt.h5.c mCacheAd;
    private SDMBannerListener mDevListener;
    private com.smartdigimkt.q8.f mInnerBannerListener;
    boolean mIsRefresh;
    private com.smartdigimkt.h5.c mLastPresentCacheAd;
    private SDMAdRequest mLastSdmAdRequest;
    private k mLoadListener;
    private final Object mLock;
    private String mPlacementId;
    private boolean mRequestConfigRefresh;
    private l mSdmAdLoadManager;
    com.smartdigimkt.k7.f.c visibilityChecker;

    public class a implements com.smartdigimkt.q8.f {

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferBannerView$a$a, reason: collision with other inner class name */
        public class RunnableC0592a implements Runnable {
            public RunnableC0592a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferBannerView.this.mDevListener != null) {
                    SDMMyOfferBannerView.this.mDevListener.onAdClick();
                }
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferBannerView.this.mDevListener != null) {
                    SDMMyOfferBannerView.this.mDevListener.onAdShow();
                }
            }
        }

        public class c implements Runnable {
            public c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferBannerView.this.mDevListener != null) {
                    SDMMyOfferBannerView.this.mDevListener.onAdClose();
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
                if (SDMMyOfferBannerView.this.mDevListener != null) {
                    SDMMyOfferBannerView.this.mDevListener.onDeeplinkCallback(this.val$isSuccess);
                }
            }
        }

        public a() {
        }

        @Override // com.smartdigimkt.q8.f
        public void onBannerClicked() {
            com.smartdigimkt.l7.b.a().e(new RunnableC0592a());
        }

        @Override // com.smartdigimkt.q8.f
        public void onBannerClose() {
            com.smartdigimkt.l7.b.a().e(new c());
        }

        @Override // com.smartdigimkt.q8.f
        public void onBannerShow(boolean z2) {
            com.smartdigimkt.l7.b.a().e(new b());
        }

        @Override // com.smartdigimkt.q8.f
        public void onDeeplinkCallback(boolean z2) {
            com.smartdigimkt.l7.b.a().e(new d(z2));
        }
    }

    public class b implements k<com.smartdigimkt.h5.c> {

        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferBannerView.this.mDevListener != null) {
                    SDMMyOfferBannerView.this.mDevListener.onAdLoaded();
                }
                SDMMyOfferBannerView.this.controlShow();
            }
        }

        /* JADX INFO: renamed from: com.smartdigimkt.sdk.api.format.myoffer.SDMMyOfferBannerView$b$b, reason: collision with other inner class name */
        public class RunnableC0593b implements Runnable {
            final /* synthetic */ AdError val$adError;

            public RunnableC0593b(AdError adError) {
                this.val$adError = adError;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (SDMMyOfferBannerView.this.mDevListener == null || !SDMMyOfferBannerView.this.canRenderBanner) {
                    return;
                }
                SDMMyOfferBannerView sDMMyOfferBannerView = SDMMyOfferBannerView.this;
                if (sDMMyOfferBannerView.mIsRefresh) {
                    return;
                }
                sDMMyOfferBannerView.mDevListener.onAdLoadFail(this.val$adError);
            }
        }

        public b() {
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoadFail(AdError adError) {
            synchronized (SDMMyOfferBannerView.this.mLock) {
                SDMMyOfferBannerView.this.isLoading = false;
            }
            if (SDMMyOfferBannerView.this.mIsRefresh) {
                return;
            }
            com.smartdigimkt.l7.b.a().e(new RunnableC0593b(adError));
            if (SDMMyOfferBannerView.this.mSdmAdLoadManager == null || !SDMMyOfferBannerView.this.isInView() || SDMMyOfferBannerView.this.mBannerRefreshTimer.a()) {
                return;
            }
            SDMMyOfferBannerView.this.mBannerRefreshTimer.d();
        }

        @Override // com.smartdigimkt.q8.k
        public void onAdLoaded(com.smartdigimkt.h5.c cVar) {
            synchronized (SDMMyOfferBannerView.this.mLock) {
                try {
                    SDMMyOfferBannerView.this.isLoading = false;
                    if (cVar instanceof com.smartdigimkt.h5.b) {
                        SDMMyOfferBannerView.this.mCacheAd = (com.smartdigimkt.h5.b) cVar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            SDMMyOfferBannerView sDMMyOfferBannerView = SDMMyOfferBannerView.this;
            sDMMyOfferBannerView.isShowCall = true;
            if (sDMMyOfferBannerView.mIsRefresh) {
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
            if (SDMMyOfferBannerView.this.mDevListener != null) {
                SDMMyOfferBannerView.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10001", "Please call setPlacementId(placementId) first."));
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferBannerView.this.mDevListener != null) {
                SDMMyOfferBannerView.this.mDevListener.onAdLoadFail(com.smartdigimkt.v7.b.a("10004"));
            }
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SDMMyOfferBannerView.this.mDevListener != null) {
                SDMMyOfferBannerView.this.mDevListener.onAdLoaded();
            }
        }
    }

    public class f extends com.smartdigimkt.k7.a {
        final /* synthetic */ com.smartdigimkt.h5.b val$adCacheInfo;
        final /* synthetic */ Context val$context;
        final /* synthetic */ boolean val$isRefresh;

        public f(Context context, com.smartdigimkt.h5.b bVar, boolean z2) {
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
            SDMMyOfferBannerView.this.notifyBannerShow(this.val$context, this.val$adCacheInfo, this.val$isRefresh);
        }
    }

    public class g implements Runnable {
        final /* synthetic */ boolean val$currentRefreshStatus;

        public class a implements Runnable {
            final /* synthetic */ com.smartdigimkt.h5.b val$adCacheInfo;

            public a(com.smartdigimkt.h5.b bVar) {
                this.val$adCacheInfo = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                g gVar = g.this;
                SDMMyOfferBannerView.this.renderBannerView(this.val$adCacheInfo, gVar.val$currentRefreshStatus);
            }
        }

        public g(boolean z2) {
            this.val$currentRefreshStatus = z2;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0078 A[Catch: all -> 0x0033, TryCatch #0 {all -> 0x0033, blocks: (B:4:0x0007, B:6:0x000f, B:8:0x0018, B:10:0x0021, B:33:0x0081, B:13:0x0035, B:15:0x003b, B:19:0x0043, B:30:0x0070, B:32:0x0078, B:22:0x004b, B:24:0x0053, B:26:0x005b, B:28:0x006a, B:35:0x0083, B:36:0x0088), top: B:40:0x0007 }] */
        @Override // java.lang.Runnable
        public void run() {
            synchronized (SDMMyOfferBannerView.this.mSdmAdLoadManager) {
                try {
                    if (!SDMMyOfferBannerView.this.canRenderBanner) {
                        String unused = SDMMyOfferBannerView.this.TAG;
                        return;
                    }
                    com.smartdigimkt.h5.b bannerCache = SDMMyOfferBannerView.this.getBannerCache();
                    boolean z2 = true;
                    if (bannerCache != null) {
                        if (SDMMyOfferBannerView.this.isInView()) {
                            SDMMyOfferBannerView.this.canRenderBanner = false;
                            com.smartdigimkt.l7.b.a().e(new a(bannerCache));
                        } else {
                            SDMMyOfferBannerView sDMMyOfferBannerView = SDMMyOfferBannerView.this;
                            if (!sDMMyOfferBannerView.hasTouchWindow || !sDMMyOfferBannerView.isShown()) {
                                z2 = false;
                            }
                            String unused2 = SDMMyOfferBannerView.this.TAG;
                            if (z2) {
                                if (SDMMyOfferBannerView.this.mBannerRefreshTimer != null) {
                                    SDMMyOfferBannerView.this.mBannerRefreshTimer.d();
                                }
                            }
                        }
                    } else if (SDMMyOfferBannerView.this.isRefreshOpen() && SDMMyOfferBannerView.this.mSdmAdLoadManager != null) {
                        SDMMyOfferBannerView sDMMyOfferBannerView2 = SDMMyOfferBannerView.this;
                        sDMMyOfferBannerView2.load(1, sDMMyOfferBannerView2.mLastSdmAdRequest);
                        SDMMyOfferBannerView sDMMyOfferBannerView3 = SDMMyOfferBannerView.this;
                        if (sDMMyOfferBannerView3.hasTouchWindow && sDMMyOfferBannerView3.isShown()) {
                            if (SDMMyOfferBannerView.this.mBannerRefreshTimer != null) {
                                SDMMyOfferBannerView.this.mBannerRefreshTimer.d();
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
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public class i implements com.smartdigimkt.f5.a {
        final /* synthetic */ boolean val$currentRefreshStatus;

        public i(boolean z2) {
            this.val$currentRefreshStatus = z2;
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClick(j jVar) {
            if (SDMMyOfferBannerView.this.mInnerBannerListener != null) {
                SDMMyOfferBannerView.this.mInnerBannerListener.onBannerClicked();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdClosed() {
            if (SDMMyOfferBannerView.this.mInnerBannerListener != null) {
                SDMMyOfferBannerView.this.mInnerBannerListener.onBannerClose();
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onAdShow(j jVar) {
            if (SDMMyOfferBannerView.this.mInnerBannerListener != null) {
                SDMMyOfferBannerView.this.mInnerBannerListener.onBannerShow(this.val$currentRefreshStatus);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onDeeplinkCallback(boolean z2) {
            if (SDMMyOfferBannerView.this.mInnerBannerListener != null) {
                SDMMyOfferBannerView.this.mInnerBannerListener.onDeeplinkCallback(z2);
            }
        }

        @Override // com.smartdigimkt.f5.a
        public void onShowFailed(com.smartdigimkt.v3.h hVar) {
        }
    }

    public SDMMyOfferBannerView(Context context) {
        super(context);
        this.TAG = "SDMMyOfferBannerView";
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

    /* JADX INFO: Access modifiers changed from: private */
    public com.smartdigimkt.h5.b getBannerCache() {
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        if (cVar == null || !cVar.isReady()) {
            return null;
        }
        return (com.smartdigimkt.h5.b) this.mCacheAd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInView() {
        return this.hasTouchWindow && isShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRefreshOpen() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerShow(Context context, com.smartdigimkt.h5.b bVar, boolean z2) {
        System.currentTimeMillis();
        com.smartdigimkt.l7.b.a().g(new h());
    }

    private void registerDelayShow(View view, Context context, com.smartdigimkt.h5.b bVar, boolean z2) {
        if (view == null) {
            view = this;
        }
        com.smartdigimkt.k7.c cVar = this.impressionTracker;
        if (cVar != null) {
            cVar.a(view, new f(context, bVar, z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderBannerView(com.smartdigimkt.h5.b bVar, boolean z2) {
        if (bVar != null) {
            bVar.a(new i(z2));
            View viewH = bVar.h();
            if (viewH != null && viewH.getParent() != null && viewH.getParent() != this) {
                ((ViewGroup) viewH.getParent()).removeView(viewH);
            }
            com.smartdigimkt.h5.c cVar = this.mLastPresentCacheAd;
            if (cVar != null) {
                cVar.c();
            }
            this.mLastPresentCacheAd = bVar;
            if (viewH != null) {
                if (isInView()) {
                    notifyBannerShow(getContext().getApplicationContext(), bVar, z2);
                } else {
                    registerDelayShow(viewH, getContext().getApplicationContext(), bVar, z2);
                }
                removeAllViews();
                int i2 = viewH.getLayoutParams() != null ? viewH.getLayoutParams().width : 0;
                if (i2 == 0) {
                    i2 = -2;
                }
                int i3 = viewH.getLayoutParams() != null ? viewH.getLayoutParams().height : 0;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3 != 0 ? i3 : -2);
                layoutParams.gravity = 17;
                viewH.setLayoutParams(layoutParams);
                addView(viewH, layoutParams);
            } else {
                Log.e(this.TAG, "Network's banner view = null. Did you call destroy()?");
            }
            this.mBannerRefreshTimer.d();
            if (isRefreshOpen()) {
                load(1, this.mLastSdmAdRequest);
            }
        }
    }

    public boolean checkReady() {
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        boolean zIsReady = cVar != null ? cVar.isReady() : false;
        if (!zIsReady) {
            this.mCacheAd = null;
        }
        return zIsReady;
    }

    public void controlShow() {
        com.smartdigimkt.l7.b.a().g(new g(this.mIsRefresh));
    }

    public void destroy() {
        synchronized (this.mLock) {
            removeAllViews();
            synchronized (this.mLock) {
                try {
                    com.smartdigimkt.h5.c cVar = this.mCacheAd;
                    if (cVar != null) {
                        cVar.c();
                        this.mCacheAd = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        com.smartdigimkt.q8.c cVar2 = this.mBannerRefreshTimer;
        if (cVar2 != null) {
            cVar2.c();
        }
        com.smartdigimkt.k7.c cVar3 = this.impressionTracker;
        if (cVar3 != null) {
            cVar3.a();
        }
    }

    public Map<String, Object> getExtraInfoMap() {
        com.smartdigimkt.h5.c cVar = this.mCacheAd;
        if (cVar != null) {
            return com.smartdigimkt.m3.c.a(cVar);
        }
        return null;
    }

    public boolean isAdReady() {
        return checkReady();
    }

    public void load() {
        load(null);
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
        this.mSdmAdLoadManager = new l(2, str);
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
                    if (!this.mIsRefresh && this.mCacheAd != null && checkReady()) {
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

    public SDMMyOfferBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "SDMMyOfferBannerView";
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

    public SDMMyOfferBannerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.TAG = "SDMMyOfferBannerView";
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
