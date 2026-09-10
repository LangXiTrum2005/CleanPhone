package com.thinkup.banner.api;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.banner.o.n;
import com.thinkup.banner.o.o0;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdMultipleLoadedListener;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUCustomContentResult;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TURequestingInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.basead.adx.api.TUAdxBidFloorInfo;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0m;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.on.ono;
import com.thinkup.core.common.oo0.m0;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.m.m;
import com.thinkup.core.common.ooo.m0m;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.core.common.ooo.o.om;
import com.thinkup.core.common.ooo.o0o;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.core.oo.n0;
import com.thinkup.core.oo.nm;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class TUBannerView extends FrameLayout implements n {
    private final String TAG;
    com.thinkup.core.common.n.o adLoadListener;
    public TUAdMultipleLoadedListener adMultipleLoadedListener;
    private TUAdxBidFloorInfo adxBidFloorInfo;
    private boolean canRenderBanner;
    boolean hasTouchWindow;
    com.thinkup.core.common.ooo.o.n impressionTracker;
    boolean isShowCall;
    private com.thinkup.banner.o.o mAdLoadManager;
    private TUAdRequest mAdRequest;
    com.thinkup.core.common.n.n mAdSourceEventListener;
    private com.thinkup.banner.m.o mBannerRefreshTimer;
    CustomBannerAdapter mCustomBannerAd;
    TUAdSourceStatusListener mDeveloperStatusListener;
    TUEventInterface mDownloadListener;
    private o0 mInnerBannerListener;
    boolean mIsRefresh;
    private com.thinkup.core.common.mn.oo.o.n mLastShowBannerView;
    private TUBannerListener mListener;
    private TUAdMultipleLoadedListener mMultipleLoadedListener;
    private String mPlacementId;
    private TUAdRevenueListener mRevenueListener;
    private String mScenario;
    private String mShowCustomExt;
    Map<String, Object> mTKExtraMap;
    private TUCustomContentResult mTUCustomContentResult;
    private TUNativeAdCustomRender nativeAdCustomRender;
    om.m visibilityChecker;

    public static class o {
        static final int AD_LOADED = 0;
        static final int AUTO_REFRESH = 1;
        static final int ON_ATTACH_TO_WINDOW = 2;
        static final int ON_VISIBILITY_CHANGED = 3;
        static final int ON_WINDOW_FOCUS_CHANGED = 4;

        private o() {
        }
    }

    public TUBannerView(Context context) {
        super(context);
        this.TAG = "TUBannerView";
        this.mScenario = "";
        this.mShowCustomExt = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new o0() { // from class: com.thinkup.banner.api.TUBannerView.1
            @Override // com.thinkup.banner.o.o0
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView.this.mListener.onBannerClicked(mn.o(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView.this.mListener.onBannerClose(mn.o(customBannerAdapter));
                        }
                    }
                });
                if (TUAdxSetting.getInstance().isAdxNetworkMode(TUBannerView.this.mPlacementId)) {
                    return;
                }
                TUBannerView.this.canRenderBanner = true;
                TUBannerView tUBannerView = TUBannerView.this;
                tUBannerView.loadAd(1, tUBannerView.mAdRequest);
            }

            @Override // com.thinkup.banner.o.o0
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        mn mnVarO = mn.o(customBannerAdapter);
                        if (TUBannerView.this.mRevenueListener != null) {
                            TUBannerView.this.mRevenueListener.onAdRevenuePaid(mnVarO);
                        }
                        if (TUBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z2) {
                                TUBannerView.this.mListener.onBannerShow(mnVarO);
                            } else {
                                TUBannerView.this.mListener.onBannerAutoRefreshed(mnVarO);
                            }
                        }
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !(TUBannerView.this.mListener instanceof TUBannerExListener)) {
                            return;
                        }
                        ((TUBannerExListener) TUBannerView.this.mListener).onDeeplinkCallback(TUBannerView.this.mIsRefresh, mn.o(customBannerAdapter), z2);
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !(TUBannerView.this.mListener instanceof TUBannerExListener)) {
                            return;
                        }
                        ((TUBannerExListener) TUBannerView.this.mListener).onDownloadConfirm(context2, mn.o(customBannerAdapter), tUNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new com.thinkup.core.common.n.o() { // from class: com.thinkup.banner.api.TUBannerView.2
            @Override // com.thinkup.core.common.n.o
            public void onAdLoadFail(final AdError adError) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !TUBannerView.this.canRenderBanner) {
                            return;
                        }
                        TUBannerView tUBannerView = TUBannerView.this;
                        if (tUBannerView.mIsRefresh) {
                            tUBannerView.mListener.onBannerAutoRefreshFail(adError);
                        } else {
                            tUBannerView.mListener.onBannerFailed(adError);
                        }
                    }
                });
                if (TUBannerView.this.mAdLoadManager == null || !TUBannerView.this.isInView() || TUBannerView.this.mBannerRefreshTimer.o()) {
                    return;
                }
                String unused = TUBannerView.this.TAG;
                TUBannerView.this.mBannerRefreshTimer.m();
            }

            @Override // com.thinkup.core.common.n.o
            public void onAdLoaded() {
                TUBannerView.this.isShowCall = true;
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            o0n.m();
                        } catch (Throwable unused) {
                        }
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView tUBannerView = TUBannerView.this;
                            if (!tUBannerView.mIsRefresh) {
                                tUBannerView.mListener.onBannerLoaded();
                            }
                        }
                        TUBannerView.this.controlShow(0);
                    }
                });
            }
        };
        this.adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.banner.api.TUBannerView.3
            @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
            public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mMultipleLoadedListener != null) {
                            TUBannerView.this.mMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                        }
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.thinkup.banner.m.o(this);
    }

    private boolean checkVisibilityPercent() {
        if (this.visibilityChecker == null) {
            this.visibilityChecker = new om.m(1);
        }
        if (getParent() != null) {
            return this.visibilityChecker.o((View) getParent(), this, 80, 0);
        }
        return false;
    }

    public static void entryAdScenario(String str, String str2) {
        entryAdScenario(str, str2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.thinkup.core.common.on.o getBannerCache(boolean z2) {
        ono cacheCheckInfo = getCacheCheckInfo(this.mTKExtraMap);
        com.thinkup.banner.o.o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(getContext(), z2, cacheCheckInfo);
        }
        return null;
    }

    private ono getCacheCheckInfo(Map<String, Object> map) {
        ono onoVar = new ono();
        onoVar.o(map);
        onoVar.o(this.mAdRequest);
        return onoVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isInView() {
        if (this.hasTouchWindow && isShown()) {
            return this.mCustomBannerAd == null || checkVisibilityPercent();
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isRefreshOpen() {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
            return false;
        }
        n0 n0VarO = nm.o(getContext().getApplicationContext()).o(this.mPlacementId);
        return n0VarO != null && n0VarO.o00o() == 1;
    }

    private boolean isShowToReload() {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
            return false;
        }
        n0 n0VarO = nm.o(getContext().getApplicationContext()).o(this.mPlacementId);
        if (n0VarO == null) {
            return false;
        }
        int iM0 = n0VarO.m0();
        return -1 == iM0 || 1 == iM0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerImpression(final Context context, final TUBaseAdAdapter tUBaseAdAdapter, final boolean z2) {
        final com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapter.getTrackingInfo();
        m.o().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.7
            @Override // java.lang.Runnable
            public void run() {
                com.thinkup.core.common.ooo.n.o().o(tUBaseAdAdapter);
                trackingInfo.o(tUBaseAdAdapter.getInternalNetworkInfoMap());
                omn.o(trackingInfo, mo.o0m.f41901n, mo.o0m.no, "");
                m0m.m(trackingInfo, tUBaseAdAdapter);
                com.thinkup.core.common.oo0.n.o(context).o(4, trackingInfo, tUBaseAdAdapter.getUnitGroupInfo());
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.7.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            mn mnVarO = mn.o(tUBaseAdAdapter);
                            if (mnVarO != null && mnVarO.getNetworkFirmId() == -1) {
                                m0.o("Banner", tUBaseAdAdapter, null);
                            }
                            if (TUBannerView.this.mRevenueListener != null) {
                                TUBannerView.this.mRevenueListener.onAdRevenuePaid(mnVarO);
                            }
                            AnonymousClass7 anonymousClass7 = AnonymousClass7.this;
                            if (z2) {
                                TUBannerView.this.mListener.onBannerAutoRefreshed(mnVarO);
                            } else {
                                TUBannerView.this.mListener.onBannerShow(mnVarO);
                            }
                        }
                    }
                });
            }
        }, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyBannerShow(final Context context, final com.thinkup.core.common.on.o oVar, final boolean z2) {
        final TUBaseAdAdapter tUBaseAdAdapterOo = oVar.oo();
        final com.thinkup.core.common.on.n0 trackingInfo = tUBaseAdAdapterOo.getTrackingInfo();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m.o().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.6
            @Override // java.lang.Runnable
            public final void run() {
                if (trackingInfo != null) {
                    m0m.o(TUBannerView.this.getContext(), trackingInfo);
                    com.thinkup.core.common.o.o().o(context.getApplicationContext(), oVar);
                    com.thinkup.core.common.oo0.n.o(context).o(13, trackingInfo, tUBaseAdAdapterOo.getUnitGroupInfo(), jCurrentTimeMillis);
                    if (tUBaseAdAdapterOo.supportImpressionCallback()) {
                        return;
                    }
                    TUBannerView.this.notifyBannerImpression(context, tUBaseAdAdapterOo, z2);
                }
            }
        }, 2);
    }

    private void registerDelayShow(View view, final Context context, final com.thinkup.core.common.on.o oVar, CustomBannerAdapter customBannerAdapter, final boolean z2) {
        if (view == null) {
            view = this;
        }
        com.thinkup.core.common.ooo.o.n nVar = this.impressionTracker;
        if (nVar != null) {
            nVar.o(view, new com.thinkup.core.common.ooo.o.o() { // from class: com.thinkup.banner.api.TUBannerView.4
                @Override // com.thinkup.core.common.ooo.o.o, com.thinkup.core.common.ooo.o.m
                public final int getImpressionMinPercentageViewed() {
                    return 50;
                }

                @Override // com.thinkup.core.common.ooo.o.o, com.thinkup.core.common.ooo.o.m
                public final int getImpressionMinTimeViewed() {
                    return 0;
                }

                @Override // com.thinkup.core.common.ooo.o.o, com.thinkup.core.common.ooo.o.m
                public final void recordImpression(View view2) {
                    TUBannerView.this.notifyBannerShow(context, oVar, z2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0017, B:11:0x001d, B:13:0x0023, B:20:0x0037, B:24:0x003f, B:25:0x0042, B:27:0x0048, B:28:0x004f, B:30:0x0067, B:32:0x006e, B:34:0x0074, B:36:0x007a, B:37:0x0083, B:39:0x0094, B:41:0x00c8, B:42:0x00d7, B:44:0x00dd), top: B:81:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0067 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0017, B:11:0x001d, B:13:0x0023, B:20:0x0037, B:24:0x003f, B:25:0x0042, B:27:0x0048, B:28:0x004f, B:30:0x0067, B:32:0x006e, B:34:0x0074, B:36:0x007a, B:37:0x0083, B:39:0x0094, B:41:0x00c8, B:42:0x00d7, B:44:0x00dd), top: B:81:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0017, B:11:0x001d, B:13:0x0023, B:20:0x0037, B:24:0x003f, B:25:0x0042, B:27:0x0048, B:28:0x004f, B:30:0x0067, B:32:0x006e, B:34:0x0074, B:36:0x007a, B:37:0x0083, B:39:0x0094, B:41:0x00c8, B:42:0x00d7, B:44:0x00dd), top: B:81:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c8 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0017, B:11:0x001d, B:13:0x0023, B:20:0x0037, B:24:0x003f, B:25:0x0042, B:27:0x0048, B:28:0x004f, B:30:0x0067, B:32:0x006e, B:34:0x0074, B:36:0x007a, B:37:0x0083, B:39:0x0094, B:41:0x00c8, B:42:0x00d7, B:44:0x00dd), top: B:81:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00dd A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:4:0x0003, B:6:0x000b, B:9:0x0017, B:11:0x001d, B:13:0x0023, B:20:0x0037, B:24:0x003f, B:25:0x0042, B:27:0x0048, B:28:0x004f, B:30:0x0067, B:32:0x006e, B:34:0x0074, B:36:0x007a, B:37:0x0083, B:39:0x0094, B:41:0x00c8, B:42:0x00d7, B:44:0x00dd), top: B:81:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00f0 A[Catch: all -> 0x0187, TryCatch #1 {all -> 0x0187, blocks: (B:46:0x00ea, B:48:0x00fd, B:50:0x0107, B:51:0x0110, B:53:0x0119, B:58:0x0125, B:60:0x012b, B:64:0x0135, B:66:0x0149, B:67:0x0152, B:69:0x015e, B:72:0x0173, B:73:0x0176, B:75:0x017c, B:77:0x0182, B:47:0x00f0, B:68:0x0156), top: B:83:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0107 A[Catch: all -> 0x0187, TryCatch #1 {all -> 0x0187, blocks: (B:46:0x00ea, B:48:0x00fd, B:50:0x0107, B:51:0x0110, B:53:0x0119, B:58:0x0125, B:60:0x012b, B:64:0x0135, B:66:0x0149, B:67:0x0152, B:69:0x015e, B:72:0x0173, B:73:0x0176, B:75:0x017c, B:77:0x0182, B:47:0x00f0, B:68:0x0156), top: B:83:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x0119 A[Catch: all -> 0x0187, TryCatch #1 {all -> 0x0187, blocks: (B:46:0x00ea, B:48:0x00fd, B:50:0x0107, B:51:0x0110, B:53:0x0119, B:58:0x0125, B:60:0x012b, B:64:0x0135, B:66:0x0149, B:67:0x0152, B:69:0x015e, B:72:0x0173, B:73:0x0176, B:75:0x017c, B:77:0x0182, B:47:0x00f0, B:68:0x0156), top: B:83:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0120  */
    /* JADX WARN: Code duplicated, block: B:57:0x0124  */
    /* JADX WARN: Code duplicated, block: B:60:0x012b A[Catch: all -> 0x0187, TryCatch #1 {all -> 0x0187, blocks: (B:46:0x00ea, B:48:0x00fd, B:50:0x0107, B:51:0x0110, B:53:0x0119, B:58:0x0125, B:60:0x012b, B:64:0x0135, B:66:0x0149, B:67:0x0152, B:69:0x015e, B:72:0x0173, B:73:0x0176, B:75:0x017c, B:77:0x0182, B:47:0x00f0, B:68:0x0156), top: B:83:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0133  */
    /* JADX WARN: Code duplicated, block: B:63:0x0134  */
    /* JADX WARN: Code duplicated, block: B:66:0x0149 A[Catch: all -> 0x0187, TryCatch #1 {all -> 0x0187, blocks: (B:46:0x00ea, B:48:0x00fd, B:50:0x0107, B:51:0x0110, B:53:0x0119, B:58:0x0125, B:60:0x012b, B:64:0x0135, B:66:0x0149, B:67:0x0152, B:69:0x015e, B:72:0x0173, B:73:0x0176, B:75:0x017c, B:77:0x0182, B:47:0x00f0, B:68:0x0156), top: B:83:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0156 A[Catch: all -> 0x0187, TryCatch #1 {all -> 0x0187, blocks: (B:46:0x00ea, B:48:0x00fd, B:50:0x0107, B:51:0x0110, B:53:0x0119, B:58:0x0125, B:60:0x012b, B:64:0x0135, B:66:0x0149, B:67:0x0152, B:69:0x015e, B:72:0x0173, B:73:0x0176, B:75:0x017c, B:77:0x0182, B:47:0x00f0, B:68:0x0156), top: B:83:0x0092 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Multi-variable type inference failed */
    public void renderBannerView(com.thinkup.core.common.on.o oVar, boolean z2) {
        CustomBannerAdapter customBannerAdapter;
        CustomBannerAdapter customBannerAdapter2;
        boolean z3;
        com.thinkup.core.common.mn.oo.o.n nVar;
        final com.thinkup.core.common.on.o oVar2;
        View viewO;
        TUBannerView tUBannerView;
        com.thinkup.core.common.on.n0 trackingInfo;
        long jCurrentTimeMillis;
        TUBannerView tUBannerView2;
        o0m o0mVarN;
        int i2;
        int i3;
        int i4;
        if (oVar != null) {
            try {
                if (oVar.oo() instanceof CustomBannerAdapter) {
                    customBannerAdapter = (CustomBannerAdapter) oVar.oo();
                } else {
                    customBannerAdapter = null;
                }
                customBannerAdapter2 = this.mCustomBannerAd;
                if (customBannerAdapter2 != null || customBannerAdapter2.getUnitGroupInfo() == null) {
                    z3 = false;
                } else {
                    z3 = customBannerAdapter2.getUnitGroupInfo().nm() == 11;
                }
                if (customBannerAdapter != null && this.mAdLoadManager != null) {
                    if (customBannerAdapter2 != null && !z3) {
                        customBannerAdapter2.internalDestory();
                    }
                    nVar = this.mLastShowBannerView;
                    if (nVar instanceof com.thinkup.core.common.mn.oo.o.o0) {
                        ((com.thinkup.core.common.mn.oo.o.o0) nVar).destroyNativeAd();
                        this.mLastShowBannerView = null;
                    }
                    oVar2 = oVar;
                    viewO = this.mAdLoadManager.o(getContext(), oVar2, customBannerAdapter, new com.thinkup.banner.o.m(this.mInnerBannerListener, customBannerAdapter, z2), this.nativeAdCustomRender);
                    if (viewO instanceof com.thinkup.core.common.mn.oo.o.n) {
                        this.mLastShowBannerView = (com.thinkup.core.common.mn.oo.o.n) viewO;
                    }
                    if (viewO != 0 && viewO.getParent() != null && viewO.getParent() != this) {
                        ((ViewGroup) viewO.getParent()).removeView(viewO);
                    }
                    this.mCustomBannerAd = customBannerAdapter;
                    m.o().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.8
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.thinkup.core.common.o.o().o(oVar2);
                        }
                    }, 2);
                    try {
                        if (viewO != 0) {
                            trackingInfo = this.mCustomBannerAd.getTrackingInfo();
                            trackingInfo.omo = this.mAdLoadManager.o();
                            trackingInfo.m0o = this.mScenario;
                            trackingInfo.omm(this.mShowCustomExt);
                            m0m.o(this.mTKExtraMap, trackingInfo);
                            m0m.o(this.mPlacementId, trackingInfo);
                            o0o.o(this.mTUCustomContentResult, trackingInfo);
                            jCurrentTimeMillis = System.currentTimeMillis();
                            if (TextUtils.isEmpty(trackingInfo.omm())) {
                                trackingInfo.nm(nn.o(trackingInfo.oon0(), trackingInfo.mon(), jCurrentTimeMillis));
                            }
                            if (isInView()) {
                                tUBannerView2 = this;
                                notifyBannerShow(getContext().getApplicationContext(), oVar2, z2);
                            } else {
                                TUBannerView tUBannerView3 = this;
                                CustomBannerAdapter customBannerAdapter3 = customBannerAdapter;
                                tUBannerView3.registerDelayShow(viewO, getContext().getApplicationContext(), oVar2, customBannerAdapter3, z2);
                                oVar2 = oVar2;
                                customBannerAdapter = customBannerAdapter3;
                                tUBannerView2 = tUBannerView3;
                            }
                            o0mVarN = o0n.m().n();
                            if (o0mVarN != null) {
                                customBannerAdapter.setAdDownloadListener(o0mVarN.createDataFetchListener(customBannerAdapter, null, tUBannerView2.mDownloadListener));
                            }
                            removeAllViews();
                            if (viewO.getLayoutParams() != null) {
                                i2 = viewO.getLayoutParams().width;
                            } else {
                                i2 = 0;
                            }
                            i3 = -2;
                            if (i2 == 0) {
                                i2 = -2;
                            }
                            i4 = viewO.getLayoutParams() != null ? viewO.getLayoutParams().height : 0;
                            if (i4 <= 0) {
                                i3 = i4;
                            }
                            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i3);
                            layoutParams.gravity = 17;
                            viewO.setLayoutParams(layoutParams);
                            if (viewO.getParent() instanceof ViewGroup) {
                                ((ViewGroup) viewO.getParent()).removeView(viewO);
                            }
                            addView(viewO, layoutParams);
                            tUBannerView = tUBannerView2;
                        } else {
                            TUBannerView tUBannerView4 = this;
                            Log.e(tUBannerView4.TAG, "Network's banner view = null. Did you call destroy()?");
                            tUBannerView = tUBannerView4;
                        }
                        tUBannerView.mAdLoadManager.o(oVar2);
                        tUBannerView.mBannerRefreshTimer.o(tUBannerView.mCustomBannerAd);
                        tUBannerView.mBannerRefreshTimer.m();
                        if (customBannerAdapter2 != null && z3) {
                            customBannerAdapter2.internalDestory();
                        }
                        if (isRefreshOpen() || !isShowToReload()) {
                        }
                        loadAd(1, tUBannerView.mAdRequest);
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable unused2) {
            }
        } else {
            customBannerAdapter = null;
            customBannerAdapter2 = this.mCustomBannerAd;
            if (customBannerAdapter2 != null) {
                z3 = false;
            } else {
                z3 = false;
            }
            if (customBannerAdapter != null) {
                if (customBannerAdapter2 != null) {
                    customBannerAdapter2.internalDestory();
                }
                nVar = this.mLastShowBannerView;
                if (nVar instanceof com.thinkup.core.common.mn.oo.o.o0) {
                    ((com.thinkup.core.common.mn.oo.o.o0) nVar).destroyNativeAd();
                    this.mLastShowBannerView = null;
                }
                oVar2 = oVar;
                viewO = this.mAdLoadManager.o(getContext(), oVar2, customBannerAdapter, new com.thinkup.banner.o.m(this.mInnerBannerListener, customBannerAdapter, z2), this.nativeAdCustomRender);
                if (viewO instanceof com.thinkup.core.common.mn.oo.o.n) {
                    this.mLastShowBannerView = (com.thinkup.core.common.mn.oo.o.n) viewO;
                }
                if (viewO != 0) {
                    ((ViewGroup) viewO.getParent()).removeView(viewO);
                }
                this.mCustomBannerAd = customBannerAdapter;
                m.o().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.8
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.thinkup.core.common.o.o().o(oVar2);
                    }
                }, 2);
                if (viewO != 0) {
                    trackingInfo = this.mCustomBannerAd.getTrackingInfo();
                    trackingInfo.omo = this.mAdLoadManager.o();
                    trackingInfo.m0o = this.mScenario;
                    trackingInfo.omm(this.mShowCustomExt);
                    m0m.o(this.mTKExtraMap, trackingInfo);
                    m0m.o(this.mPlacementId, trackingInfo);
                    o0o.o(this.mTUCustomContentResult, trackingInfo);
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (TextUtils.isEmpty(trackingInfo.omm())) {
                        trackingInfo.nm(nn.o(trackingInfo.oon0(), trackingInfo.mon(), jCurrentTimeMillis));
                    }
                    if (isInView()) {
                        TUBannerView tUBannerView5 = this;
                        CustomBannerAdapter customBannerAdapter4 = customBannerAdapter;
                        tUBannerView5.registerDelayShow(viewO, getContext().getApplicationContext(), oVar2, customBannerAdapter4, z2);
                        oVar2 = oVar2;
                        customBannerAdapter = customBannerAdapter4;
                        tUBannerView2 = tUBannerView5;
                    } else {
                        tUBannerView2 = this;
                        notifyBannerShow(getContext().getApplicationContext(), oVar2, z2);
                    }
                    o0mVarN = o0n.m().n();
                    if (o0mVarN != null) {
                        customBannerAdapter.setAdDownloadListener(o0mVarN.createDataFetchListener(customBannerAdapter, null, tUBannerView2.mDownloadListener));
                    }
                    removeAllViews();
                    if (viewO.getLayoutParams() != null) {
                        i2 = viewO.getLayoutParams().width;
                    } else {
                        i2 = 0;
                    }
                    i3 = -2;
                    if (i2 == 0) {
                        i2 = -2;
                    }
                    if (viewO.getLayoutParams() != null) {
                    }
                    if (i4 <= 0) {
                        i3 = i4;
                    }
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i3);
                    layoutParams2.gravity = 17;
                    viewO.setLayoutParams(layoutParams2);
                    if (viewO.getParent() instanceof ViewGroup) {
                        ((ViewGroup) viewO.getParent()).removeView(viewO);
                    }
                    addView(viewO, layoutParams2);
                    tUBannerView = tUBannerView2;
                } else {
                    TUBannerView tUBannerView6 = this;
                    Log.e(tUBannerView6.TAG, "Network's banner view = null. Did you call destroy()?");
                    tUBannerView = tUBannerView6;
                }
                tUBannerView.mAdLoadManager.o(oVar2);
                tUBannerView.mBannerRefreshTimer.o(tUBannerView.mCustomBannerAd);
                tUBannerView.mBannerRefreshTimer.m();
                if (customBannerAdapter2 != null) {
                    customBannerAdapter2.internalDestory();
                }
                if (isRefreshOpen()) {
                }
            }
        }
    }

    public TUAdStatusInfo checkAdStatus() {
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(this.TAG, "SDK init error!");
            return new TUAdStatusInfo(false, false, null);
        }
        com.thinkup.banner.o.o oVar = this.mAdLoadManager;
        if (oVar == null) {
            Log.e(this.TAG, "PlacementId is empty!");
            return new TUAdStatusInfo(false, false, null);
        }
        TUAdStatusInfo tUAdStatusInfoO = oVar.o(getContext(), this.mTKExtraMap);
        omn.m(this.mPlacementId, mo.o0m.o00, mo.o0m.ono, tUAdStatusInfoO.toString(), "");
        return tUAdStatusInfoO;
    }

    public List<TUAdInfo> checkValidAdCaches() {
        com.thinkup.banner.o.o oVar = this.mAdLoadManager;
        if (oVar != null) {
            return oVar.o(getContext());
        }
        return null;
    }

    public void controlShow(int i2) {
        if (this.mAdLoadManager == null) {
            return;
        }
        final boolean z2 = this.mIsRefresh;
        m.o().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.5
            /* JADX WARN: Code duplicated, block: B:31:0x0083  */
            @Override // java.lang.Runnable
            public void run() {
                synchronized (TUBannerView.this.mAdLoadManager) {
                    try {
                        if (TUBannerView.this.canRenderBanner) {
                            boolean z3 = true;
                            final com.thinkup.core.common.on.o bannerCache = TUBannerView.this.getBannerCache(true);
                            if (bannerCache != null) {
                                if (TUBannerView.this.isInView()) {
                                    bannerCache.o(bannerCache.n() + 1);
                                    TUBannerView.this.canRenderBanner = false;
                                    o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.5.1
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            AnonymousClass5 anonymousClass5 = AnonymousClass5.this;
                                            TUBannerView.this.renderBannerView(bannerCache, z2);
                                        }
                                    });
                                    z3 = false;
                                } else {
                                    TUBannerView tUBannerView = TUBannerView.this;
                                    if (!tUBannerView.hasTouchWindow || !tUBannerView.isShown()) {
                                        z3 = false;
                                    }
                                    String unused = TUBannerView.this.TAG;
                                }
                            } else if (!TUBannerView.this.isRefreshOpen() || TUBannerView.this.mAdLoadManager == null || TUBannerView.this.mAdLoadManager.m()) {
                                z3 = false;
                            } else {
                                TUBannerView tUBannerView2 = TUBannerView.this;
                                tUBannerView2.loadAd(1, tUBannerView2.mAdRequest);
                                TUBannerView tUBannerView3 = TUBannerView.this;
                                if (!tUBannerView3.hasTouchWindow || !tUBannerView3.isShown()) {
                                    z3 = false;
                                }
                            }
                            if (z3 && TUBannerView.this.mBannerRefreshTimer != null) {
                                TUBannerView.this.mBannerRefreshTimer.m();
                            }
                        } else {
                            String unused2 = TUBannerView.this.TAG;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }, 2);
    }

    public void destroy() {
        removeAllViews();
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        if (customBannerAdapter != null) {
            customBannerAdapter.internalDestory();
        }
        com.thinkup.banner.m.o oVar = this.mBannerRefreshTimer;
        if (oVar != null) {
            oVar.n();
        }
        com.thinkup.core.common.ooo.o.n nVar = this.impressionTracker;
        if (nVar != null) {
            nVar.o();
        }
        if (this.mAdLoadManager != null) {
            com.thinkup.banner.o.o.o(this.mPlacementId);
        }
        com.thinkup.core.common.mn.oo.o.n nVar2 = this.mLastShowBannerView;
        if (nVar2 instanceof com.thinkup.core.common.mn.oo.o.o0) {
            ((com.thinkup.core.common.mn.oo.o.o0) nVar2).destroyNativeAd();
            this.mLastShowBannerView = null;
        }
    }

    public void loadAd() {
        loadAd(null);
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
            controlShow(3);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            controlShow(4);
        }
    }

    public void setAdDownloadListener(TUEventInterface tUEventInterface) {
        o0m o0mVarN;
        this.mDownloadListener = tUEventInterface;
        if (this.mCustomBannerAd == null || (o0mVarN = o0n.m().n()) == null) {
            return;
        }
        CustomBannerAdapter customBannerAdapter = this.mCustomBannerAd;
        customBannerAdapter.setAdDownloadListener(o0mVarN.createDataFetchListener(customBannerAdapter, null, this.mDownloadListener));
    }

    public void setAdMultipleLoadedListener(TUAdMultipleLoadedListener tUAdMultipleLoadedListener) {
        this.mMultipleLoadedListener = tUAdMultipleLoadedListener;
    }

    public void setAdRevenueListener(TUAdRevenueListener tUAdRevenueListener) {
        this.mRevenueListener = tUAdRevenueListener;
    }

    public void setAdSourceStatusListener(TUAdSourceStatusListener tUAdSourceStatusListener) {
        if (this.mAdSourceEventListener == null) {
            this.mAdSourceEventListener = new com.thinkup.core.common.n.n();
        }
        this.mDeveloperStatusListener = tUAdSourceStatusListener;
        this.mAdSourceEventListener.setAdSourceStatusListener(tUAdSourceStatusListener);
    }

    @Deprecated
    public void setAdxBidFloorInfo(TUAdxBidFloorInfo tUAdxBidFloorInfo) {
        this.adxBidFloorInfo = tUAdxBidFloorInfo;
    }

    public void setBannerAdListener(TUBannerListener tUBannerListener) {
        this.mListener = tUBannerListener;
    }

    public void setLocalExtra(Map<String, Object> map) {
        if (TextUtils.isEmpty(this.mPlacementId)) {
            Log.e(this.TAG, "You must set unit Id first.");
        } else {
            ooo.o().o(this.mPlacementId, map);
        }
    }

    public void setNativeAdCustomRender(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.nativeAdCustomRender = tUNativeAdCustomRender;
    }

    public void setPlacementId(String str) {
        this.mAdLoadManager = com.thinkup.banner.o.o.o(getContext(), str);
        this.mPlacementId = str;
        this.mBannerRefreshTimer.o(str);
        if (this.impressionTracker == null) {
            getContext();
            this.impressionTracker = new com.thinkup.core.common.ooo.o.n();
        }
    }

    @Deprecated
    public void setScenario(String str) {
        setShowConfig(nn.oo(str));
    }

    public void setShowConfig(TUShowConfig tUShowConfig) {
        if (tUShowConfig != null) {
            this.mScenario = tUShowConfig.getScenarioId();
            this.mShowCustomExt = tUShowConfig.getShowCustomExt();
            this.mTUCustomContentResult = tUShowConfig.getTUCustomContentResult();
        }
    }

    public void setTKExtra(Map<String, Object> map) {
        if (this.mTKExtraMap == null) {
            this.mTKExtraMap = new ConcurrentHashMap();
        }
        this.mTKExtraMap.clear();
        this.mTKExtraMap.putAll(map);
    }

    @Override // com.thinkup.banner.o.n
    public void timeUpRefreshView() {
        this.isShowCall = true;
        this.canRenderBanner = true;
        if (isShowToReload()) {
            controlShow(1);
        } else {
            loadAd(1, this.mAdRequest);
        }
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        o0n.m().o(str, str2, "2", map);
    }

    public void loadAd(TUAdRequest tUAdRequest) {
        loadAd(0, tUAdRequest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadAd(int i2, TUAdRequest tUAdRequest) {
        omn.o(this.mPlacementId, mo.o0m.o00, mo.o0m.omo, mo.o0m.nn, "", true);
        if (this.adxBidFloorInfo != null) {
            if (tUAdRequest == null) {
                tUAdRequest = new TUAdRequest.Builder().setTUAdxBidFloorInfo(this.adxBidFloorInfo).build();
            } else if (tUAdRequest.getTUAdxBidFloorInfo() == null) {
                tUAdRequest.setAdxBidFloorInfo(this.adxBidFloorInfo);
            }
        }
        TUAdRequest tUAdRequest2 = tUAdRequest;
        this.mAdRequest = tUAdRequest2;
        this.mIsRefresh = i2 == 1;
        if (i2 == 0) {
            this.canRenderBanner = true;
        }
        com.thinkup.banner.o.o oVar = this.mAdLoadManager;
        if (oVar != null) {
            oVar.o(getContext(), i2, this.adLoadListener, this.mAdSourceEventListener, this.adMultipleLoadedListener, this.mTKExtraMap, tUAdRequest2);
            return;
        }
        com.thinkup.core.common.n.o oVar2 = this.adLoadListener;
        if (oVar2 != null) {
            oVar2.onAdLoadFail(ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId maybe is null"));
        }
    }

    public TUBannerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.TAG = "TUBannerView";
        this.mScenario = "";
        this.mShowCustomExt = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new o0() { // from class: com.thinkup.banner.api.TUBannerView.1
            @Override // com.thinkup.banner.o.o0
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView.this.mListener.onBannerClicked(mn.o(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView.this.mListener.onBannerClose(mn.o(customBannerAdapter));
                        }
                    }
                });
                if (TUAdxSetting.getInstance().isAdxNetworkMode(TUBannerView.this.mPlacementId)) {
                    return;
                }
                TUBannerView.this.canRenderBanner = true;
                TUBannerView tUBannerView = TUBannerView.this;
                tUBannerView.loadAd(1, tUBannerView.mAdRequest);
            }

            @Override // com.thinkup.banner.o.o0
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        mn mnVarO = mn.o(customBannerAdapter);
                        if (TUBannerView.this.mRevenueListener != null) {
                            TUBannerView.this.mRevenueListener.onAdRevenuePaid(mnVarO);
                        }
                        if (TUBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z2) {
                                TUBannerView.this.mListener.onBannerShow(mnVarO);
                            } else {
                                TUBannerView.this.mListener.onBannerAutoRefreshed(mnVarO);
                            }
                        }
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !(TUBannerView.this.mListener instanceof TUBannerExListener)) {
                            return;
                        }
                        ((TUBannerExListener) TUBannerView.this.mListener).onDeeplinkCallback(TUBannerView.this.mIsRefresh, mn.o(customBannerAdapter), z2);
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !(TUBannerView.this.mListener instanceof TUBannerExListener)) {
                            return;
                        }
                        ((TUBannerExListener) TUBannerView.this.mListener).onDownloadConfirm(context2, mn.o(customBannerAdapter), tUNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new com.thinkup.core.common.n.o() { // from class: com.thinkup.banner.api.TUBannerView.2
            @Override // com.thinkup.core.common.n.o
            public void onAdLoadFail(final AdError adError) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !TUBannerView.this.canRenderBanner) {
                            return;
                        }
                        TUBannerView tUBannerView = TUBannerView.this;
                        if (tUBannerView.mIsRefresh) {
                            tUBannerView.mListener.onBannerAutoRefreshFail(adError);
                        } else {
                            tUBannerView.mListener.onBannerFailed(adError);
                        }
                    }
                });
                if (TUBannerView.this.mAdLoadManager == null || !TUBannerView.this.isInView() || TUBannerView.this.mBannerRefreshTimer.o()) {
                    return;
                }
                String unused = TUBannerView.this.TAG;
                TUBannerView.this.mBannerRefreshTimer.m();
            }

            @Override // com.thinkup.core.common.n.o
            public void onAdLoaded() {
                TUBannerView.this.isShowCall = true;
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            o0n.m();
                        } catch (Throwable unused) {
                        }
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView tUBannerView = TUBannerView.this;
                            if (!tUBannerView.mIsRefresh) {
                                tUBannerView.mListener.onBannerLoaded();
                            }
                        }
                        TUBannerView.this.controlShow(0);
                    }
                });
            }
        };
        this.adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.banner.api.TUBannerView.3
            @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
            public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mMultipleLoadedListener != null) {
                            TUBannerView.this.mMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                        }
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.thinkup.banner.m.o(this);
    }

    public TUBannerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.TAG = "TUBannerView";
        this.mScenario = "";
        this.mShowCustomExt = "";
        this.hasTouchWindow = false;
        this.mIsRefresh = false;
        this.mInnerBannerListener = new o0() { // from class: com.thinkup.banner.api.TUBannerView.1
            @Override // com.thinkup.banner.o.o0
            public void onBannerClicked(final CustomBannerAdapter customBannerAdapter) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView.this.mListener.onBannerClicked(mn.o(customBannerAdapter));
                        }
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onBannerClose(final CustomBannerAdapter customBannerAdapter) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView.this.mListener.onBannerClose(mn.o(customBannerAdapter));
                        }
                    }
                });
                if (TUAdxSetting.getInstance().isAdxNetworkMode(TUBannerView.this.mPlacementId)) {
                    return;
                }
                TUBannerView.this.canRenderBanner = true;
                TUBannerView tUBannerView = TUBannerView.this;
                tUBannerView.loadAd(1, tUBannerView.mAdRequest);
            }

            @Override // com.thinkup.banner.o.o0
            public void onBannerShow(final CustomBannerAdapter customBannerAdapter, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        mn mnVarO = mn.o(customBannerAdapter);
                        if (TUBannerView.this.mRevenueListener != null) {
                            TUBannerView.this.mRevenueListener.onAdRevenuePaid(mnVarO);
                        }
                        if (TUBannerView.this.mListener != null) {
                            if (customBannerAdapter == null || !z2) {
                                TUBannerView.this.mListener.onBannerShow(mnVarO);
                            } else {
                                TUBannerView.this.mListener.onBannerAutoRefreshed(mnVarO);
                            }
                        }
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onDeeplinkCallback(final CustomBannerAdapter customBannerAdapter, final boolean z2) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !(TUBannerView.this.mListener instanceof TUBannerExListener)) {
                            return;
                        }
                        ((TUBannerExListener) TUBannerView.this.mListener).onDeeplinkCallback(TUBannerView.this.mIsRefresh, mn.o(customBannerAdapter), z2);
                    }
                });
            }

            @Override // com.thinkup.banner.o.o0
            public void onDownloadConfirm(final Context context2, final CustomBannerAdapter customBannerAdapter, final TUNetworkConfirmInfo tUNetworkConfirmInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.1.5
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !(TUBannerView.this.mListener instanceof TUBannerExListener)) {
                            return;
                        }
                        ((TUBannerExListener) TUBannerView.this.mListener).onDownloadConfirm(context2, mn.o(customBannerAdapter), tUNetworkConfirmInfo);
                    }
                });
            }
        };
        this.adLoadListener = new com.thinkup.core.common.n.o() { // from class: com.thinkup.banner.api.TUBannerView.2
            @Override // com.thinkup.core.common.n.o
            public void onAdLoadFail(final AdError adError) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.2.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mListener == null || !TUBannerView.this.canRenderBanner) {
                            return;
                        }
                        TUBannerView tUBannerView = TUBannerView.this;
                        if (tUBannerView.mIsRefresh) {
                            tUBannerView.mListener.onBannerAutoRefreshFail(adError);
                        } else {
                            tUBannerView.mListener.onBannerFailed(adError);
                        }
                    }
                });
                if (TUBannerView.this.mAdLoadManager == null || !TUBannerView.this.isInView() || TUBannerView.this.mBannerRefreshTimer.o()) {
                    return;
                }
                String unused = TUBannerView.this.TAG;
                TUBannerView.this.mBannerRefreshTimer.m();
            }

            @Override // com.thinkup.core.common.n.o
            public void onAdLoaded() {
                TUBannerView.this.isShowCall = true;
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            o0n.m();
                        } catch (Throwable unused) {
                        }
                        if (TUBannerView.this.mListener != null) {
                            TUBannerView tUBannerView = TUBannerView.this;
                            if (!tUBannerView.mIsRefresh) {
                                tUBannerView.mListener.onBannerLoaded();
                            }
                        }
                        TUBannerView.this.controlShow(0);
                    }
                });
            }
        };
        this.adMultipleLoadedListener = new TUAdMultipleLoadedListener() { // from class: com.thinkup.banner.api.TUBannerView.3
            @Override // com.thinkup.core.api.TUAdMultipleLoadedListener
            public void onAdMultipleLoaded(final TURequestingInfo tURequestingInfo) {
                o0n.m().m(new Runnable() { // from class: com.thinkup.banner.api.TUBannerView.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (TUBannerView.this.mMultipleLoadedListener != null) {
                            TUBannerView.this.mMultipleLoadedListener.onAdMultipleLoaded(tURequestingInfo);
                        }
                    }
                });
            }
        };
        this.mBannerRefreshTimer = new com.thinkup.banner.m.o(this);
    }
}
