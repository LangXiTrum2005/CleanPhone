package com.thinkup.network.gtm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashHandler;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.smartdigimkt.o1.b;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.splashad.unitgroup.api.CustomSplashAdapter;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUSplashAdapter extends CustomSplashAdapter {
    private static final String nm = "GTMTUSplashAdapter";
    String o;
    int m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f42573n = 1;
    boolean o0 = true;
    String oo = "";
    String om = "";
    String on = "";
    String m0 = "";
    int mo = 0;
    int mm = 0;
    int mn = 0;
    int n0 = 0;
    MBSplashHandler no = null;

    /* JADX INFO: renamed from: com.thinkup.network.gtm.GTMTUSplashAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements MBSplashLoadListener {
        public AnonymousClass2() {
        }

        @Override // com.mbridge.msdk.out.MBSplashLoadListener
        public final void isSupportZoomOut(MBridgeIds mBridgeIds, boolean z2) {
        }

        @Override // com.mbridge.msdk.out.MBSplashLoadListener
        public final void onLoadFailed(MBridgeIds mBridgeIds, String str, int i2) {
            if (((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.mbridge.msdk.out.MBSplashLoadListener
        public final void onLoadSuccessed(MBridgeIds mBridgeIds, int i2) {
            if (!GTMTUSplashAdapter.this.isAdReady()) {
                GTMTUSplashAdapter.this.postOnMainThreadDelayed(new Runnable() { // from class: com.thinkup.network.gtm.GTMTUSplashAdapter.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (GTMTUSplashAdapter.this.isAdReady()) {
                            if (((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener != null) {
                                ((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
                            }
                        } else if (((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener != null) {
                            ((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener.onAdLoadError("", "gtm Splash Ad is not ready.");
                        }
                    }
                }, 10L);
            } else if (((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener.onAdCacheLoaded(new BaseAd[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.gtm.GTMTUSplashAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements MBSplashShowListener {
        public AnonymousClass3() {
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onAdClicked(MBridgeIds mBridgeIds) {
            if (((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdClicked();
            }
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onAdTick(MBridgeIds mBridgeIds, long j) {
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onDismiss(MBridgeIds mBridgeIds, int i2) {
            if (((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener != null) {
                if (i2 == 1) {
                    GTMTUSplashAdapter.oo0(GTMTUSplashAdapter.this);
                    ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                } else if (i2 == 2) {
                    GTMTUSplashAdapter.oom(GTMTUSplashAdapter.this);
                    ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                } else if (i2 != 3) {
                    ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                } else {
                    GTMTUSplashAdapter.om0(GTMTUSplashAdapter.this);
                    ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
                }
            }
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onShowFailed(MBridgeIds mBridgeIds, String str) {
            Log.e(GTMTUSplashAdapter.nm, "onShowFailed: ".concat(String.valueOf(str)));
            GTMTUSplashAdapter.no(GTMTUSplashAdapter.this);
            if (((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdShowFail(ErrorCode.getErrorCode(ErrorCode.adShowError, "", str));
                ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdDismiss();
            }
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onShowSuccessed(MBridgeIds mBridgeIds) {
            try {
                GTMTUInitManager.getInstance().o(GTMTUSplashAdapter.this.getTrackingInfo().omm(), new WeakReference(GTMTUSplashAdapter.this.no));
            } catch (Throwable unused) {
            }
            if (((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener != null) {
                ((CustomSplashAdapter) GTMTUSplashAdapter.this).mImpressionListener.onSplashAdShow();
            }
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onZoomOutPlayFinish(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.MBSplashShowListener
        public final void onZoomOutPlayStart(MBridgeIds mBridgeIds) {
        }
    }

    public static /* synthetic */ int no(GTMTUSplashAdapter gTMTUSplashAdapter) {
        gTMTUSplashAdapter.mDismissType = 99;
        return 99;
    }

    public static /* synthetic */ int om0(GTMTUSplashAdapter gTMTUSplashAdapter) {
        gTMTUSplashAdapter.mDismissType = 4;
        return 4;
    }

    public static /* synthetic */ int oo0(GTMTUSplashAdapter gTMTUSplashAdapter) {
        gTMTUSplashAdapter.mDismissType = 2;
        return 2;
    }

    public static /* synthetic */ int oom(GTMTUSplashAdapter gTMTUSplashAdapter) {
        gTMTUSplashAdapter.mDismissType = 3;
        return 3;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
        MBSplashHandler mBSplashHandler = this.no;
        if (mBSplashHandler != null) {
            mBSplashHandler.onPause();
            this.no.onDestroy();
            this.no = null;
        }
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.om = GTMTUInitManager.getStringByMap(map, "unitid");
        GTMTUInitManager.getInstance().o(context, map, map2, 5, tUBidRequestInfoListener);
    }

    @Override // com.thinkup.core.api.TUBaseAdInternalAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        HashMap map = new HashMap();
        map.put(0, GTMTUAdapter.class);
        map.put(3, GTMTUInterstitialAdapter.class);
        return map;
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter
    public TUInitMediation getMediationInitManager() {
        return GTMTUInitManager.getInstance();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkName() {
        return GTMTUInitManager.getInstance().getNetworkName();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return this.om;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return GTMTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public boolean isAdReady() {
        if (this.no == null) {
            return false;
        }
        if (m()) {
            return this.no.isReady(this.o);
        }
        return this.no.isReady();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, final Map<String, Object> map, Map<String, Object> map2) {
        try {
            if (map.containsKey("appid")) {
                this.oo = map.get("appid").toString();
            }
            if (map.containsKey("unitid")) {
                this.om = map.get("unitid").toString();
            }
            if (map.containsKey("placement_id")) {
                this.m0 = map.get("placement_id").toString();
            }
            if (map.containsKey("appkey")) {
                this.on = map.get("appkey").toString();
            }
            if (map.containsKey("payload")) {
                this.o = map.get("payload").toString();
            }
            this.mo = TUInitMediation.getIntFromMap(map2, GTMTUConst.NOTCH_SCREEN_LEFT, 0);
            this.mm = TUInitMediation.getIntFromMap(map2, GTMTUConst.NOTCH_SCREEN_RIGHT, 0);
            this.mn = TUInitMediation.getIntFromMap(map2, GTMTUConst.NOTCH_SCREEN_TOP, 0);
            this.n0 = TUInitMediation.getIntFromMap(map2, GTMTUConst.NOTCH_SCREEN_BOTTOM, 0);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (TextUtils.isEmpty(this.oo) || TextUtils.isEmpty(this.om) || TextUtils.isEmpty(this.on)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "gtm appid ,unitid or sdkkey is empty.");
                return;
            }
            return;
        }
        if (map.containsKey(b.l3)) {
            this.m = Integer.parseInt(map.get(b.l3).toString());
        }
        if (map.containsKey("allows_skip")) {
            this.o0 = Integer.parseInt(map.get("allows_skip").toString()) == 1;
        }
        if (map.containsKey("orientation")) {
            this.f42573n = TextUtils.equals(map.get("orientation").toString(), "2") ? 2 : 1;
        }
        GTMTUInitManager.getInstance().initSDK(context.getApplicationContext(), map, new MediationInitCallback() { // from class: com.thinkup.network.gtm.GTMTUSplashAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str) {
                if (((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTUSplashAdapter.this).mLoadListener.onAdLoadError("", str);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() {
                GTMTUSplashAdapter.o(GTMTUSplashAdapter.this, map);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return GTMTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    @Override // com.thinkup.splashad.unitgroup.api.CustomSplashAdapter
    public void show(Activity activity, ViewGroup viewGroup) {
        int i2 = this.mo;
        if (i2 != 0 || this.mm != 0 || this.mn != 0 || this.n0 != 0) {
            this.no.setNotchScreenParameter(i2, this.mn, this.mm, this.n0);
        }
        if (this.no != null) {
            if (m()) {
                this.no.show(viewGroup, this.o);
            } else {
                this.no.show(viewGroup);
            }
        }
    }

    private boolean m() {
        return !TextUtils.isEmpty(this.o);
    }

    private void o(Map<String, Object> map) {
        MBSplashHandler mBSplashHandler = new MBSplashHandler(this.m0, this.om, this.o0, this.m, this.f42573n, 0, 0);
        this.no = mBSplashHandler;
        mBSplashHandler.setLoadTimeOut(this.mFetchAdTimeout / 1000);
        this.no.setSplashLoadListener(new AnonymousClass2());
        this.no.setSplashShowListener(new AnonymousClass3());
        if (m()) {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            this.no.preLoadByToken(this.o);
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            this.no.preLoad();
        }
        this.no.onResume();
    }

    public static /* synthetic */ void o(GTMTUSplashAdapter gTMTUSplashAdapter, Map map) {
        MBSplashHandler mBSplashHandler = new MBSplashHandler(gTMTUSplashAdapter.m0, gTMTUSplashAdapter.om, gTMTUSplashAdapter.o0, gTMTUSplashAdapter.m, gTMTUSplashAdapter.f42573n, 0, 0);
        gTMTUSplashAdapter.no = mBSplashHandler;
        mBSplashHandler.setLoadTimeOut(gTMTUSplashAdapter.mFetchAdTimeout / 1000);
        gTMTUSplashAdapter.no.setSplashLoadListener(gTMTUSplashAdapter.new AnonymousClass2());
        gTMTUSplashAdapter.no.setSplashShowListener(gTMTUSplashAdapter.new AnonymousClass3());
        if (gTMTUSplashAdapter.m()) {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            gTMTUSplashAdapter.no.preLoadByToken(gTMTUSplashAdapter.o);
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            gTMTUSplashAdapter.no.preLoad();
        }
        gTMTUSplashAdapter.no.onResume();
    }
}
