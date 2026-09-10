package com.thinkup.network.gtm;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.out.MBBidNativeHandler;
import com.mbridge.msdk.out.MBMultiStateEnum;
import com.mbridge.msdk.out.MBNativeAdvancedHandler;
import com.mbridge.msdk.out.MBNativeHandler;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.out.NativeListener;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUBaseAdInternalAdapter;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class GTMTUAdapter extends CustomNativeAdapter {
    private static final String m0 = "GTMTUAdapter";
    String m;
    private String mo = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f42556n;
    String o;
    String o0;
    int om;
    int on;
    String oo;

    /* JADX INFO: renamed from: com.thinkup.network.gtm.GTMTUAdapter$2, reason: invalid class name */
    public class AnonymousClass2 implements NativeAdvancedAdListener {
        final /* synthetic */ Context m;
        final /* synthetic */ MBNativeAdvancedHandler o;

        public AnonymousClass2(MBNativeAdvancedHandler mBNativeAdvancedHandler, Context context) {
            this.o = mBNativeAdvancedHandler;
            this.m = context;
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void closeFullScreen(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void onClick(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void onClose(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void onLeaveApp(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void onLoadFailed(MBridgeIds mBridgeIds, String str) {
            if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdLoadError("", str);
            }
            this.o.setAdListener(null);
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void onLoadSuccessed(MBridgeIds mBridgeIds) {
            GTMTUExpressNativeAd gTMTUExpressNativeAd = new GTMTUExpressNativeAd(this.m, this.o, false);
            if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdCacheLoaded(gTMTUExpressNativeAd);
            }
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void onLogImpression(MBridgeIds mBridgeIds) {
        }

        @Override // com.mbridge.msdk.out.NativeAdvancedAdListener
        public final void showFullScreen(MBridgeIds mBridgeIds) {
        }
    }

    /* JADX INFO: renamed from: com.thinkup.network.gtm.GTMTUAdapter$3, reason: invalid class name */
    public class AnonymousClass3 implements NativeListener.NativeAdListener {
        final /* synthetic */ MBBidNativeHandler m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Context f42559n;
        final /* synthetic */ MBNativeHandler o;
        final /* synthetic */ String o0;
        final /* synthetic */ boolean om;
        final /* synthetic */ String oo;

        public AnonymousClass3(MBNativeHandler mBNativeHandler, MBBidNativeHandler mBBidNativeHandler, Context context, String str, String str2, boolean z2) {
            this.o = mBNativeHandler;
            this.m = mBBidNativeHandler;
            this.f42559n = context;
            this.o0 = str;
            this.oo = str2;
            this.om = z2;
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public final void onAdClick(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public final void onAdFramesLoaded(List<Frame> list) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public final void onAdLoadError(String str) {
            if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdLoadError("", str);
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public final void onAdLoaded(List<Campaign> list, int i2) {
            if (list == null || list.size() <= 0) {
                if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdLoadError("", "Request success but no Ad return!");
                }
                MBNativeHandler mBNativeHandler = this.o;
                if (mBNativeHandler != null) {
                    mBNativeHandler.setAdListener(null);
                    this.o.release();
                    return;
                }
                MBBidNativeHandler mBBidNativeHandler = this.m;
                if (mBBidNativeHandler != null) {
                    mBBidNativeHandler.setAdListener(null);
                    this.m.bidRelease();
                    return;
                }
                return;
            }
            ArrayList arrayList = new ArrayList();
            boolean z2 = false;
            for (Campaign campaign : list) {
                if (campaign != null) {
                    GTMTUNativeAd gTMTUNativeAd = new GTMTUNativeAd(this.f42559n, this.o0, this.oo, campaign, !TextUtils.isEmpty(GTMTUAdapter.this.o));
                    gTMTUNativeAd.m0 = this.om;
                    gTMTUNativeAd.oo = GTMTUAdapter.this.f42556n;
                    arrayList.add(gTMTUNativeAd);
                    z2 = true;
                }
            }
            if (z2) {
                if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdCacheLoaded((CustomNativeAd[]) arrayList.toArray(new CustomNativeAd[arrayList.size()]));
                }
            } else if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdLoadError("", "Request success but no Ad return!");
            }
            MBNativeHandler mBNativeHandler2 = this.o;
            if (mBNativeHandler2 != null) {
                mBNativeHandler2.setAdListener(null);
                this.o.release();
                return;
            }
            MBBidNativeHandler mBBidNativeHandler2 = this.m;
            if (mBBidNativeHandler2 != null) {
                mBBidNativeHandler2.setAdListener(null);
                this.m.bidRelease();
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeAdListener
        public final void onLoggingImpression(int i2) {
        }
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void destory() {
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        this.mo = GTMTUInitManager.getStringByMap(map, "unitid");
        GTMTUInitManager.getInstance().o(context, map, map2, 0, tUBidRequestInfoListener);
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
        return this.mo;
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return GTMTUInitManager.getInstance().getNetworkVersion();
    }

    @Override // com.thinkup.core.api.ITUBaseAdAdapter
    public void loadCustomNetworkAd(final Context context, final Map<String, Object> map, Map<String, Object> map2) {
        String string;
        String string2;
        String string3;
        this.mo = "";
        try {
            string3 = map.containsKey("appid") ? map.get("appid").toString() : "";
            try {
                if (map.containsKey("unitid")) {
                    this.mo = map.get("unitid").toString();
                }
                string2 = map.containsKey("placement_id") ? map.get("placement_id").toString() : "";
                try {
                    string = map.containsKey("appkey") ? map.get("appkey").toString() : "";
                    try {
                        if (map.containsKey("payload")) {
                            this.o = map.get("payload").toString();
                        }
                        if (map.containsKey("unit_type")) {
                            this.m = map.get("unit_type").toString();
                        }
                        if (map.containsKey("video_muted")) {
                            this.f42556n = map.get("video_muted").toString();
                        }
                        Boolean bool = TUSDKGlobalSetting.isGlobalMute;
                        if (bool != null) {
                            if (bool.booleanValue()) {
                                this.f42556n = "0";
                            } else {
                                this.f42556n = "1";
                            }
                        }
                        if (map.containsKey("video_autoplay")) {
                            this.o0 = map.get("video_autoplay").toString();
                        }
                        if (map.containsKey("close_button")) {
                            this.oo = map.get("close_button").toString();
                        }
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                    }
                } catch (Exception e3) {
                    e = e3;
                    string = "";
                }
            } catch (Exception e4) {
                e = e4;
                string = "";
                string2 = string;
            }
        } catch (Exception e5) {
            e = e5;
            string = "";
            string2 = string;
            string3 = string2;
        }
        if (TextUtils.isEmpty(string3) || TextUtils.isEmpty(this.mo) || TextUtils.isEmpty(string)) {
            TUCustomLoadListener tUCustomLoadListener = this.mLoadListener;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdLoadError("", "gtm appid ,unitid or sdkkey is empty.");
                return;
            }
            return;
        }
        boolean z2 = false;
        if (map.containsKey("suport_video") && "1".equals(map.get("suport_video").toString())) {
            z2 = true;
        }
        final boolean z3 = z2;
        try {
            if (map2.containsKey("key_width")) {
                this.om = Integer.parseInt(map2.get("key_width").toString());
            }
        } catch (Throwable unused) {
        }
        try {
            if (map2.containsKey("key_height")) {
                this.on = Integer.parseInt(map2.get("key_height").toString());
            }
        } catch (Throwable unused2) {
        }
        if (this.om == 0) {
            this.om = Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels);
        }
        if (this.on == 0) {
            this.on = (this.om * 3) / 4;
        }
        final String str = this.mo;
        final String str2 = string2;
        GTMTUInitManager.getInstance().initSDK(context, map, new MediationInitCallback() { // from class: com.thinkup.network.gtm.GTMTUAdapter.1
            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onFail(String str3) {
                if (((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener != null) {
                    ((TUBaseAdInternalAdapter) GTMTUAdapter.this).mLoadListener.onAdLoadError("", str3);
                }
            }

            @Override // com.thinkup.core.api.MediationInitCallback
            public final void onSuccess() throws Throwable {
                GTMTUAdapter gTMTUAdapter = GTMTUAdapter.this;
                Context context2 = context;
                Map map3 = map;
                String str3 = str2;
                String str4 = str;
                boolean z4 = z3;
                int unused3 = ((TUBaseAdInternalAdapter) gTMTUAdapter).mRequestNum;
                GTMTUAdapter.o(gTMTUAdapter, context2, map3, str3, str4, z4);
            }
        });
    }

    @Override // com.thinkup.core.api.TUBaseAdAdapter, com.thinkup.core.api.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z2, boolean z3) {
        return GTMTUInitManager.getInstance().setUserDataConsent(context, z2, z3);
    }

    private void o(Context context, Map<String, Object> map, String str, String str2, boolean z2) throws Throwable {
        boolean z3;
        MBBidNativeHandler mBBidNativeHandler;
        MBNativeHandler mBNativeHandler;
        if (map != null) {
            try {
                z3 = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
            } catch (Exception unused) {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (!TextUtils.equals(this.m, "1")) {
            Map<String, Object> nativeProperties = MBNativeHandler.getNativeProperties(str, str2);
            nativeProperties.put("ad_num", 1);
            nativeProperties.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
            nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.valueOf(z2));
            if (TextUtils.isEmpty(this.o)) {
                GTMTUInitManager.getInstance().setCustomInfo(8, map);
                mBNativeHandler = new MBNativeHandler(nativeProperties, context.getApplicationContext());
                mBBidNativeHandler = null;
            } else {
                GTMTUInitManager.getInstance().setCustomInfo(7, map);
                mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, context.getApplicationContext());
                mBNativeHandler = null;
            }
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(mBNativeHandler, mBBidNativeHandler, context, str, str2, z3);
            if (mBNativeHandler != null) {
                mBNativeHandler.setAdListener(anonymousClass3);
                mBNativeHandler.load();
                return;
            } else {
                mBBidNativeHandler.setAdListener(anonymousClass3);
                mBBidNativeHandler.bidLoad(this.o);
                return;
            }
        }
        MBNativeAdvancedHandler mBNativeAdvancedHandler = new MBNativeAdvancedHandler((Activity) context, str, str2);
        if (!TextUtils.isEmpty(this.f42556n)) {
            String str3 = this.f42556n;
            str3.getClass();
            if (str3.equals("0")) {
                mBNativeAdvancedHandler.setPlayMuteState(1);
            } else if (str3.equals("1")) {
                mBNativeAdvancedHandler.setPlayMuteState(2);
            }
        }
        if (!TextUtils.isEmpty(this.o0)) {
            String str4 = this.o0;
            str4.getClass();
            switch (str4) {
                case "1":
                    mBNativeAdvancedHandler.autoLoopPlay(1);
                    break;
                case "2":
                    mBNativeAdvancedHandler.autoLoopPlay(2);
                    break;
                case "3":
                    mBNativeAdvancedHandler.autoLoopPlay(3);
                    break;
            }
        }
        if (!TextUtils.isEmpty(this.oo)) {
            String str5 = this.oo;
            str5.getClass();
            if (str5.equals("0")) {
                mBNativeAdvancedHandler.setCloseButtonState(MBMultiStateEnum.positive);
            } else if (str5.equals("1")) {
                mBNativeAdvancedHandler.setCloseButtonState(MBMultiStateEnum.negative);
            }
        }
        mBNativeAdvancedHandler.setNativeViewSize(this.om, this.on);
        mBNativeAdvancedHandler.setAdListener(new AnonymousClass2(mBNativeAdvancedHandler, context));
        if (TextUtils.isEmpty(this.o)) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            mBNativeAdvancedHandler.load();
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            mBNativeAdvancedHandler.loadByToken(this.o);
        }
    }

    private void o(Context context, String str, String str2, Map<String, Object> map) throws Throwable {
        MBNativeAdvancedHandler mBNativeAdvancedHandler = new MBNativeAdvancedHandler((Activity) context, str, str2);
        if (!TextUtils.isEmpty(this.f42556n)) {
            String str3 = this.f42556n;
            str3.getClass();
            if (str3.equals("0")) {
                mBNativeAdvancedHandler.setPlayMuteState(1);
            } else if (str3.equals("1")) {
                mBNativeAdvancedHandler.setPlayMuteState(2);
            }
        }
        if (!TextUtils.isEmpty(this.o0)) {
            String str4 = this.o0;
            str4.getClass();
            switch (str4) {
                case "1":
                    mBNativeAdvancedHandler.autoLoopPlay(1);
                    break;
                case "2":
                    mBNativeAdvancedHandler.autoLoopPlay(2);
                    break;
                case "3":
                    mBNativeAdvancedHandler.autoLoopPlay(3);
                    break;
            }
        }
        if (!TextUtils.isEmpty(this.oo)) {
            String str5 = this.oo;
            str5.getClass();
            if (str5.equals("0")) {
                mBNativeAdvancedHandler.setCloseButtonState(MBMultiStateEnum.positive);
            } else if (str5.equals("1")) {
                mBNativeAdvancedHandler.setCloseButtonState(MBMultiStateEnum.negative);
            }
        }
        mBNativeAdvancedHandler.setNativeViewSize(this.om, this.on);
        mBNativeAdvancedHandler.setAdListener(new AnonymousClass2(mBNativeAdvancedHandler, context));
        if (TextUtils.isEmpty(this.o)) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            mBNativeAdvancedHandler.load();
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            mBNativeAdvancedHandler.loadByToken(this.o);
        }
    }

    private void o(Context context, String str, String str2, boolean z2, boolean z3, Map<String, Object> map) {
        MBBidNativeHandler mBBidNativeHandler;
        MBNativeHandler mBNativeHandler;
        Map<String, Object> nativeProperties = MBNativeHandler.getNativeProperties(str, str2);
        nativeProperties.put("ad_num", 1);
        nativeProperties.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.valueOf(z2));
        if (TextUtils.isEmpty(this.o)) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            mBNativeHandler = new MBNativeHandler(nativeProperties, context.getApplicationContext());
            mBBidNativeHandler = null;
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, context.getApplicationContext());
            mBNativeHandler = null;
        }
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(mBNativeHandler, mBBidNativeHandler, context, str, str2, z3);
        if (mBNativeHandler != null) {
            mBNativeHandler.setAdListener(anonymousClass3);
            mBNativeHandler.load();
        } else {
            mBBidNativeHandler.setAdListener(anonymousClass3);
            mBBidNativeHandler.bidLoad(this.o);
        }
    }

    public static /* synthetic */ void o(GTMTUAdapter gTMTUAdapter, Context context, Map map, String str, String str2, boolean z2) throws Throwable {
        boolean z3;
        MBBidNativeHandler mBBidNativeHandler;
        MBNativeHandler mBNativeHandler;
        if (map != null) {
            try {
                z3 = Boolean.parseBoolean(map.get(CustomNativeAd.IS_AUTO_PLAY_KEY).toString());
            } catch (Exception unused) {
                z3 = false;
            }
        } else {
            z3 = false;
        }
        if (TextUtils.equals(gTMTUAdapter.m, "1")) {
            MBNativeAdvancedHandler mBNativeAdvancedHandler = new MBNativeAdvancedHandler((Activity) context, str, str2);
            if (!TextUtils.isEmpty(gTMTUAdapter.f42556n)) {
                String str3 = gTMTUAdapter.f42556n;
                str3.getClass();
                if (str3.equals("0")) {
                    mBNativeAdvancedHandler.setPlayMuteState(1);
                } else if (str3.equals("1")) {
                    mBNativeAdvancedHandler.setPlayMuteState(2);
                }
            }
            if (!TextUtils.isEmpty(gTMTUAdapter.o0)) {
                String str4 = gTMTUAdapter.o0;
                str4.getClass();
                switch (str4) {
                    case "1":
                        mBNativeAdvancedHandler.autoLoopPlay(1);
                        break;
                    case "2":
                        mBNativeAdvancedHandler.autoLoopPlay(2);
                        break;
                    case "3":
                        mBNativeAdvancedHandler.autoLoopPlay(3);
                        break;
                }
            }
            if (!TextUtils.isEmpty(gTMTUAdapter.oo)) {
                String str5 = gTMTUAdapter.oo;
                str5.getClass();
                if (str5.equals("0")) {
                    mBNativeAdvancedHandler.setCloseButtonState(MBMultiStateEnum.positive);
                } else if (str5.equals("1")) {
                    mBNativeAdvancedHandler.setCloseButtonState(MBMultiStateEnum.negative);
                }
            }
            mBNativeAdvancedHandler.setNativeViewSize(gTMTUAdapter.om, gTMTUAdapter.on);
            mBNativeAdvancedHandler.setAdListener(gTMTUAdapter.new AnonymousClass2(mBNativeAdvancedHandler, context));
            if (TextUtils.isEmpty(gTMTUAdapter.o)) {
                GTMTUInitManager.getInstance().setCustomInfo(8, map);
                mBNativeAdvancedHandler.load();
                return;
            } else {
                GTMTUInitManager.getInstance().setCustomInfo(7, map);
                mBNativeAdvancedHandler.loadByToken(gTMTUAdapter.o);
                return;
            }
        }
        Map<String, Object> nativeProperties = MBNativeHandler.getNativeProperties(str, str2);
        nativeProperties.put("ad_num", 1);
        nativeProperties.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        nativeProperties.put(MBridgeConstans.NATIVE_VIDEO_SUPPORT, Boolean.valueOf(z2));
        if (TextUtils.isEmpty(gTMTUAdapter.o)) {
            GTMTUInitManager.getInstance().setCustomInfo(8, map);
            mBNativeHandler = new MBNativeHandler(nativeProperties, context.getApplicationContext());
            mBBidNativeHandler = null;
        } else {
            GTMTUInitManager.getInstance().setCustomInfo(7, map);
            mBBidNativeHandler = new MBBidNativeHandler(nativeProperties, context.getApplicationContext());
            mBNativeHandler = null;
        }
        AnonymousClass3 anonymousClass3 = gTMTUAdapter.new AnonymousClass3(mBNativeHandler, mBBidNativeHandler, context, str, str2, z3);
        if (mBNativeHandler != null) {
            mBNativeHandler.setAdListener(anonymousClass3);
            mBNativeHandler.load();
        } else {
            mBBidNativeHandler.setAdListener(anonymousClass3);
            mBBidNativeHandler.bidLoad(gTMTUAdapter.o);
        }
    }
}
