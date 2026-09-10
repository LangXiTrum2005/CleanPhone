package com.thinkup.splashad.api;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TURequestingInfo;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on;
import com.thinkup.core.common.on.o;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.oo0.oo;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.moo;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import com.thinkup.splashad.o.m;
import com.thinkup.splashad.o.n;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TUSplashAd {
    public static final int DEFAULT_SPLASH_TIMEOUT_TIME = 10000;
    final String TAG;
    public TUAdMultipleLoadedListener adMultipleLoadedListener;
    private TUAdRequest adRequest;
    WeakReference<Activity> mActivityWeakRef;
    n mAdLoadManager;
    TUAdRevenueListener mAdRevenueListener;
    com.thinkup.core.common.n.n mAdSourceEventListener;
    Context mContext;
    TUAdSourceStatusListener mDeveloperStatusListener;
    TUEventInterface mDownloadListener;
    int mFetchAdTimeout;
    TUSplashAdListener mListener;
    TUAdMultipleLoadedListener mMultipleLoadedListener;
    private TUNativeAdCustomRender mNativeAdCustomRender;
    String mPlacementId;
    Map<String, Object> mTKExtraMap;

    /* JADX INFO: renamed from: com.thinkup.splashad.api.TUSplashAd$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ TUAdRequest val$adRequest;
        final /* synthetic */ Map val$finalTkExtraMap;
        final /* synthetic */ int val$loadType;
        final /* synthetic */ long val$startLoadTime;

        /* JADX INFO: renamed from: com.thinkup.splashad.api.TUSplashAd$2$1, reason: invalid class name */
        public class AnonymousClass1 extends m {
            boolean hasCacheWhenTimeout = false;
            final /* synthetic */ int val$finalTimeout;

            public AnonymousClass1(int i2) {
                this.val$finalTimeout = i2;
            }

            @Override // com.thinkup.splashad.o.m
            public void onAdLoaded(String str, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.2.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            o0n.m();
                        } catch (Throwable unused) {
                        }
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onAdLoaded(!anonymousClass1.hasCacheWhenTimeout && z2);
                        }
                    }
                });
            }

            @Override // com.thinkup.splashad.o.m
            public void onNoAdError(String str, final AdError adError) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.2.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onNoAdError(adError);
                        }
                    }
                });
            }

            @Override // com.thinkup.splashad.o.m
            public void onTimeout(final String str) {
                n nVar = TUSplashAd.this.mAdLoadManager;
                if (nVar != null) {
                    final on onVarO = nVar.o(str);
                    com.thinkup.core.common.o.n.o oVarM0 = onVarO != null ? onVarO.m0() : null;
                    if (oVarM0 != null) {
                        oVarM0.m();
                    }
                    ono onoVar = new ono();
                    onoVar.o(AnonymousClass2.this.val$finalTkExtraMap);
                    onoVar.o(AnonymousClass2.this.val$adRequest);
                    TUSplashAd tUSplashAd = TUSplashAd.this;
                    o oVarO = tUSplashAd.mAdLoadManager.o(tUSplashAd.mContext, onoVar);
                    if (oVarO != null) {
                        this.hasCacheWhenTimeout = true;
                        if (onVarO != null) {
                            if (oVarM0 == null || oVarM0.oo() != oVarO) {
                                String str2 = TUSplashAd.this.mPlacementId;
                                onVarO.o(9, oVarO.nn());
                            } else {
                                String str3 = TUSplashAd.this.mPlacementId;
                                onVarO.o(11, oVarO.nn());
                            }
                            oo.o(TUSplashAd.this.mPlacementId, str, onVarO.mo(), "1", oVarO, this.val$finalTimeout, AnonymousClass2.this.val$adRequest);
                            return;
                        }
                    }
                    o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.2.1.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            String str4 = TUSplashAd.this.mPlacementId;
                            String str5 = str;
                            on onVar = onVarO;
                            n0 n0VarMo = onVar != null ? onVar.mo() : null;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            oo.o(str4, str5, n0VarMo, "2", (o) null, anonymousClass1.val$finalTimeout, AnonymousClass2.this.val$adRequest);
                            TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                            if (tUSplashAdListener != null) {
                                tUSplashAdListener.onAdLoadTimeout();
                            }
                        }
                    });
                }
            }
        }

        public AnonymousClass2(int i2, Map map, TUAdRequest tUAdRequest, long j) {
            this.val$loadType = i2;
            this.val$finalTkExtraMap = map;
            this.val$adRequest = tUAdRequest;
            this.val$startLoadTime = j;
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0048  */
        /* JADX WARN: Code duplicated, block: B:21:0x004d  */
        /* JADX WARN: Code duplicated, block: B:24:0x0056  */
        /* JADX WARN: Code duplicated, block: B:25:0x005d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0062  */
        /* JADX WARN: Code duplicated, block: B:31:0x0071 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:33:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x0098  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z2;
            boolean z3;
            int i2;
            WeakReference<Activity> weakReference;
            AnonymousClass1 anonymousClass1;
            Activity activity;
            AnonymousClass1 anonymousClass2;
            TUSplashAd tUSplashAd;
            n nVar;
            int i3 = TUSplashAd.this.mFetchAdTimeout;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            n0 n0VarO = nm.o(TUSplashAd.this.mContext).o(TUSplashAd.this.mPlacementId);
            if (n0VarO == null) {
                n0VarO = nm.o(TUSplashAd.this.mContext).om(TUSplashAd.this.mPlacementId);
            }
            n0 n0Var = n0VarO;
            int iOnoo = n0Var != null ? n0Var.onoo() : -1;
            if (i3 <= 0) {
                if (iOnoo <= 0) {
                    z2 = false;
                }
                if (i3 <= 0) {
                    i3 = 10000;
                    z3 = false;
                } else {
                    z3 = z2;
                }
                i2 = i3;
                weakReference = TUSplashAd.this.mActivityWeakRef;
                anonymousClass1 = null;
                if (weakReference != null) {
                    activity = weakReference.get();
                } else {
                    activity = null;
                }
                if (this.val$loadType == 0) {
                    anonymousClass1 = new AnonymousClass1(i2);
                    anonymousClass1.startCountDown(i2);
                }
                anonymousClass2 = anonymousClass1;
                tUSplashAd = TUSplashAd.this;
                nVar = tUSplashAd.mAdLoadManager;
                if (nVar == null) {
                    o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.2.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                            if (tUSplashAdListener != null) {
                                tUSplashAdListener.onNoAdError(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"));
                            }
                        }
                    });
                    return;
                }
                if (activity == null) {
                    activity = tUSplashAd.mContext;
                }
                nVar.o(activity, anonymousClass2, tUSplashAd.adMultipleLoadedListener, i2, z3, this.val$loadType, tUSplashAd.mAdSourceEventListener, this.val$finalTkExtraMap, this.val$adRequest, this.val$startLoadTime, jElapsedRealtime);
                TUSplashAd tUSplashAd2 = TUSplashAd.this;
                oo.o(tUSplashAd2.mPlacementId, n0Var, tUSplashAd2.mFetchAdTimeout, iOnoo, i2, this.val$adRequest);
            }
            if (iOnoo > 0) {
            }
            z2 = true;
            if (i3 <= 0) {
                i3 = 10000;
                z3 = false;
            } else {
                z3 = z2;
            }
            i2 = i3;
            weakReference = TUSplashAd.this.mActivityWeakRef;
            anonymousClass1 = null;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (this.val$loadType == 0) {
                anonymousClass1 = new AnonymousClass1(i2);
                anonymousClass1.startCountDown(i2);
            }
            anonymousClass2 = anonymousClass1;
            tUSplashAd = TUSplashAd.this;
            nVar = tUSplashAd.mAdLoadManager;
            if (nVar == null) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onNoAdError(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"));
                        }
                    }
                });
                return;
            }
            if (activity == null) {
                activity = tUSplashAd.mContext;
            }
            nVar.o(activity, anonymousClass2, tUSplashAd.adMultipleLoadedListener, i2, z3, this.val$loadType, tUSplashAd.mAdSourceEventListener, this.val$finalTkExtraMap, this.val$adRequest, this.val$startLoadTime, jElapsedRealtime);
            TUSplashAd tUSplashAd3 = TUSplashAd.this;
            oo.o(tUSplashAd3.mPlacementId, n0Var, tUSplashAd3.mFetchAdTimeout, iOnoo, i2, this.val$adRequest);
            i3 = iOnoo;
            z2 = true;
            if (i3 <= 0) {
                i3 = 10000;
                z3 = false;
            } else {
                z3 = z2;
            }
            i2 = i3;
            weakReference = TUSplashAd.this.mActivityWeakRef;
            anonymousClass1 = null;
            if (weakReference != null) {
                activity = weakReference.get();
            } else {
                activity = null;
            }
            if (this.val$loadType == 0) {
                anonymousClass1 = new AnonymousClass1(i2);
                anonymousClass1.startCountDown(i2);
            }
            anonymousClass2 = anonymousClass1;
            tUSplashAd = TUSplashAd.this;
            nVar = tUSplashAd.mAdLoadManager;
            if (nVar == null) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onNoAdError(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"));
                        }
                    }
                });
                return;
            }
            if (activity == null) {
                activity = tUSplashAd.mContext;
            }
            nVar.o(activity, anonymousClass2, tUSplashAd.adMultipleLoadedListener, i2, z3, this.val$loadType, tUSplashAd.mAdSourceEventListener, this.val$finalTkExtraMap, this.val$adRequest, this.val$startLoadTime, jElapsedRealtime);
            TUSplashAd tUSplashAd4 = TUSplashAd.this;
            oo.o(tUSplashAd4.mPlacementId, n0Var, tUSplashAd4.mFetchAdTimeout, iOnoo, i2, this.val$adRequest);
        }
    }

    public TUSplashAd(Context context, String str, TUSplashAdListener tUSplashAdListener) {
        this(context, str, tUSplashAdListener, 0);
    }

    public static void entryAdScenario(String str, String str2) {
        o0n.m().o(str, str2, "4", (Map<String, Object>) null);
    }

    private TUAdStatusInfo getAdStatus() {
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(this.TAG, "SDK init error!");
            return null;
        }
        n nVar = this.mAdLoadManager;
        if (nVar != null) {
            return nVar.o(this.mContext, this.mTKExtraMap);
        }
        Log.e(this.TAG, "PlacementId is empty!");
        return new TUAdStatusInfo(false, false, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o getSplashCache() {
        n nVar = this.mAdLoadManager;
        if (nVar != null) {
            return nVar.o(this.mTKExtraMap);
        }
        return null;
    }

    public TUAdStatusInfo checkAdStatus() {
        TUAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return new TUAdStatusInfo(false, false, null);
        }
        omn.m(this.mPlacementId, mo.o0m.oo0, mo.o0m.ono, adStatus.toString(), "");
        return adStatus;
    }

    public List<TUAdInfo> checkValidAdCaches() {
        n nVar = this.mAdLoadManager;
        if (nVar != null) {
            return nVar.o(this.mContext);
        }
        return null;
    }

    public boolean isAdReady() {
        TUAdStatusInfo adStatus = getAdStatus();
        if (adStatus == null) {
            return false;
        }
        boolean zIsReady = adStatus.isReady();
        omn.m(this.mPlacementId, mo.o0m.oo0, mo.o0m.on0, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public void loadAd() {
        loadAd((TUAdRequest) null);
    }

    @Deprecated
    public void onDestory() {
    }

    public void setAdDownloadListener(TUEventInterface tUEventInterface) {
        this.mDownloadListener = tUEventInterface;
    }

    public void setAdListener(TUSplashAdListener tUSplashAdListener) {
        this.mListener = tUSplashAdListener;
    }

    public void setAdMultipleLoadedListener(TUAdMultipleLoadedListener tUAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = tUAdMultipleLoadedListener;
    }

    public void setAdRevenueListener(TUAdRevenueListener tUAdRevenueListener) {
        this.mAdRevenueListener = tUAdRevenueListener;
    }

    public void setAdSourceStatusListener(TUAdSourceStatusListener tUAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new com.thinkup.core.common.n.n();
        }
        this.mDeveloperStatusListener = tUAdSourceStatusListener;
        this.mAdSourceEventListener.setAdSourceStatusListener(tUAdSourceStatusListener);
    }

    public void setLocalExtra(Map<String, Object> map) {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
        } else {
            ooo.o().o(this.mPlacementId, map);
        }
    }

    public void setNativeAdCustomRender(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.mNativeAdCustomRender = tUNativeAdCustomRender;
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    public void show(Activity activity, ViewGroup viewGroup) {
        show(activity, viewGroup, "");
    }

    @Deprecated
    public TUSplashAd(Context context, String str, TUSplashAdListener tUSplashAdListener, int i2, String str2) {
        this(context, str, tUSplashAdListener, i2);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        o0n.m().o(str, str2, "4", map);
    }

    @Deprecated
    public void loadAd(TUAdxBidFloorInfo tUAdxBidFloorInfo) {
        loadAd(tUAdxBidFloorInfo != null ? new TUAdRequest.Builder().setTUAdxBidFloorInfo(tUAdxBidFloorInfo).build() : null);
    }

    @Deprecated
    public void show(Activity activity, ViewGroup viewGroup, String str) {
        show(activity, viewGroup, (TUSplashSkipInfo) null, nn.oo(str));
    }

    public TUSplashAd(Context context, String str, TUSplashAdListener tUSplashAdListener, int i2) {
        this.TAG = getClass().getSimpleName();
        this.adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.splashad.api.TUSplashAd.1
            @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
            public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUAdMultipleLoadedListener tUAdMultipleLoadedListener = TUSplashAd.this.mMultipleLoadedListener;
                        if (tUAdMultipleLoadedListener != null) {
                            tUAdMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                        }
                    }
                });
            }
        };
        this.mContext = context.getApplicationContext();
        this.mPlacementId = str;
        this.mListener = tUSplashAdListener;
        this.mFetchAdTimeout = i2;
        if (context instanceof Activity) {
            this.mActivityWeakRef = new WeakReference<>((Activity) context);
        }
        this.mAdLoadManager = n.o(context, str);
    }

    public void show(Activity activity, ViewGroup viewGroup, TUSplashSkipInfo tUSplashSkipInfo) {
        show(activity, viewGroup, tUSplashSkipInfo, (TUShowConfig) null);
    }

    public void loadAd(TUAdRequest tUAdRequest) {
        loadAd(tUAdRequest, 0);
    }

    @Deprecated
    public void show(Activity activity, ViewGroup viewGroup, TUSplashSkipInfo tUSplashSkipInfo, String str) {
        show(activity, viewGroup, tUSplashSkipInfo, nn.oo(str));
    }

    private void loadAd(TUAdRequest tUAdRequest, int i2) {
        HashMap map;
        if (TextUtils.isEmpty(this.mPlacementId)) {
            TUSplashAdListener tUSplashAdListener = this.mListener;
            if (tUSplashAdListener != null) {
                tUSplashAdListener.onNoAdError(ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId maybe is null"));
                return;
            }
            return;
        }
        omn.o(this.mPlacementId, mo.o0m.oo0, mo.o0m.omo, mo.o0m.nn, "", true);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.adRequest = tUAdRequest;
        if (this.mTKExtraMap != null) {
            map = new HashMap(this.mTKExtraMap);
        } else {
            map = new HashMap();
        }
        HashMap map2 = map;
        n nVar = this.mAdLoadManager;
        if (nVar != null) {
            nVar.o();
        }
        com.thinkup.core.common.ooo.m.m.o().o(new AnonymousClass2(i2, map2, tUAdRequest, jElapsedRealtime));
    }

    public void show(Activity activity, ViewGroup viewGroup, TUSplashSkipInfo tUSplashSkipInfo, TUShowConfig tUShowConfig) {
        omn.m(this.mPlacementId, mo.o0m.oo0, mo.o0m.omn, mo.o0m.nn, "");
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(this.TAG, "SDK init error!");
            return;
        }
        if (activity == null) {
            Log.e(this.TAG, "Splash Activity is null.");
        }
        if (viewGroup == null) {
            Log.e(this.TAG, "Splash Container is null.");
            return;
        }
        if (TUSDK.isNetworkLogDebug()) {
            moo.o(viewGroup);
        }
        com.thinkup.splashad.o.o oVar = new com.thinkup.splashad.o.o() { // from class: com.thinkup.splashad.api.TUSplashAd.3
            @Override // com.thinkup.splashad.o.o
            public void onAdClick(final TUAdInfo tUAdInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.3.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onAdClick(tUAdInfo);
                        }
                    }
                });
            }

            @Override // com.thinkup.splashad.o.o
            public void onAdDismiss(final TUAdInfo tUAdInfo, final TUSplashAdExtraInfo tUSplashAdExtraInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.3.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onAdDismiss(tUAdInfo, tUSplashAdExtraInfo);
                        }
                    }
                });
            }

            @Override // com.thinkup.splashad.o.o
            public void onAdShow(final TUAdInfo tUAdInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.3.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUAdRevenueListener tUAdRevenueListener = TUSplashAd.this.mAdRevenueListener;
                        if (tUAdRevenueListener != null) {
                            tUAdRevenueListener.onAdRevenuePaid(tUAdInfo);
                        }
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener != null) {
                            tUSplashAdListener.onAdShow(tUAdInfo);
                        }
                    }
                });
            }

            @Override // com.thinkup.splashad.o.o
            public void onDeeplinkCallback(final TUAdInfo tUAdInfo, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAdListener tUSplashAdListener = TUSplashAd.this.mListener;
                        if (tUSplashAdListener == null || !(tUSplashAdListener instanceof TUSplashExListener)) {
                            return;
                        }
                        ((TUSplashExListener) tUSplashAdListener).onDeeplinkCallback(tUAdInfo, z2);
                    }
                });
            }

            @Override // com.thinkup.splashad.o.o
            public void onDownloadConfirm(final Context context, final TUAdInfo tUAdInfo, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.splashad.api.TUSplashAd.3.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        TUSplashAd tUSplashAd = TUSplashAd.this;
                        TUSplashAdListener tUSplashAdListener = tUSplashAd.mListener;
                        if (tUSplashAdListener == null || !(tUSplashAdListener instanceof TUSplashExListener)) {
                            return;
                        }
                        TUSplashExListener tUSplashExListener = (TUSplashExListener) tUSplashAdListener;
                        Context context2 = context;
                        if (context2 == null) {
                            context2 = tUSplashAd.mContext;
                        }
                        tUSplashExListener.onDownloadConfirm(context2, tUAdInfo, tUNetworkConfirmInfo);
                    }
                });
            }
        };
        n nVar = this.mAdLoadManager;
        if (nVar != null) {
            nVar.o(activity, viewGroup, oVar, this.mDownloadListener, tUSplashSkipInfo, tUShowConfig, this.mTKExtraMap, this.mNativeAdCustomRender);
        }
    }
}
