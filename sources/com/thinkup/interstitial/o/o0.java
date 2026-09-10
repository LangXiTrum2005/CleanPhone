package com.thinkup.interstitial.o;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.oon;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.interstitial.api.TUInterstitialAutoEventListener;
import com.thinkup.interstitial.api.TUInterstitialAutoLoadListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class o0 implements com.thinkup.core.common.nn.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile o0 f42482n;
    private TUInterstitialAutoLoadListener o0;
    private TUNativeAdCustomRender oo;
    String o = "InterstitialAuto";
    TUInterstitialAutoLoadListener m = new TUInterstitialAutoLoadListener() { // from class: com.thinkup.interstitial.o.o0.1
        @Override // com.thinkup.interstitial.api.TUInterstitialAutoLoadListener
        public final void onInterstitialAutoLoadFail(final String str, final AdError adError) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.o0.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (o0.this.o0 != null) {
                        o0.this.o0.onInterstitialAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialAutoLoadListener
        public final void onInterstitialAutoLoaded(final String str) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.interstitial.o.o0.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (o0.this.o0 != null) {
                        o0.this.o0.onInterstitialAutoLoaded(str);
                    }
                }
            });
        }
    };

    public static List<TUAdInfo> o0(String str) {
        com.thinkup.core.common.om omVarOm = om(str);
        if (omVarOm != null) {
            return omVarOm.o(o0n.m().mm0());
        }
        return null;
    }

    private static com.thinkup.core.common.om om(String str) {
        return com.thinkup.core.common.om.o(o0n.m().on(), str, "3");
    }

    private TUAdStatusInfo oo(String str) {
        if (o0n.m().on() == null || TextUtils.isEmpty(o0n.m().o00()) || TextUtils.isEmpty(o0n.m().o0o())) {
            Log.e(this.o, "SDK init error!");
            return null;
        }
        com.thinkup.core.common.om omVarOm = om(str);
        if (omVarOm != null) {
            return omVarOm.o(o0n.m().mm0(), (Map<String, Object>) null);
        }
        return null;
    }

    public final boolean m(String str) {
        boolean zIsReady = false;
        if (!TextUtils.isEmpty(str)) {
            TUAdStatusInfo tUAdStatusInfoOo = oo(str);
            if (tUAdStatusInfoOo == null) {
                return false;
            }
            zIsReady = tUAdStatusInfoOo.isReady();
        }
        omn.m(str, mo.o0m.oom, mo.o0m.on0, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public final TUAdStatusInfo n(String str) {
        TUAdStatusInfo tUAdStatusInfo;
        if (TextUtils.isEmpty(str) || (tUAdStatusInfo = oo(str)) == null) {
            tUAdStatusInfo = new TUAdStatusInfo(false, false, null);
        }
        omn.m(str, mo.o0m.oom, mo.o0m.ono, tUAdStatusInfo.toString(), "");
        return tUAdStatusInfo;
    }

    public static o0 o() {
        if (f42482n == null) {
            synchronized (o0.class) {
                try {
                    if (f42482n == null) {
                        f42482n = new o0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42482n;
    }

    private TUInterstitialAutoLoadListener m() {
        return this.m;
    }

    public final void o(Context context, String[] strArr, TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener, TUAdRequest tUAdRequest) {
        if (context == null) {
            Log.e(mo.oo0, this.o + " init failed: context = null");
            return;
        }
        if (context instanceof Activity) {
            o0n.m().o((Activity) context);
        }
        if (strArr != null) {
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    if (TUAdxSetting.getInstance().isAdxNetworkMode(str)) {
                        Log.w(mo.oo0, "Forbidden placement, this placement is in adx network mode");
                    } else if (oon.o().o(str)) {
                        Log.w(mo.oo0, "Forbidden placement");
                    } else if (!ooo.o().oo(str)) {
                        ooo.o().o(str, true);
                        com.thinkup.core.common.nn.o0 o0VarO = om(str).o();
                        if (o0VarO != null) {
                            o0VarO.o(this);
                            o0VarO.o(context, tUAdRequest, 3);
                        }
                    }
                }
            }
        }
        this.o0 = tUInterstitialAutoLoadListener;
    }

    public final void o(TUAdRequest tUAdRequest, String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                if (TUAdxSetting.getInstance().isAdxNetworkMode(str)) {
                    Log.w(mo.oo0, "Forbidden placement, this placement is in adx network mode");
                } else if (oon.o().o(str)) {
                    Log.w(mo.oo0, "Forbidden placement");
                } else if (!ooo.o().oo(str)) {
                    ooo.o().o(str, true);
                    com.thinkup.core.common.nn.o0 o0VarO = om(str).o();
                    if (o0VarO != null) {
                        o0VarO.o(this);
                        o0VarO.o(o0n.m().mm0(), tUAdRequest, 3);
                    }
                }
            }
        }
    }

    public static void o(String... strArr) {
        if (strArr == null) {
            return;
        }
        for (String str : strArr) {
            if (!TextUtils.isEmpty(str)) {
                ooo.o().o(str, false);
                com.thinkup.core.common.nn.o0 o0VarO = om(str).o();
                if (o0VarO != null) {
                    o0VarO.o((com.thinkup.core.common.nn.m) null);
                    o0VarO.o0();
                }
            }
        }
    }

    public static void o(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ooo.o().o(str, map);
    }

    public static void o(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o0n.m().o(str, str2, "3", map);
    }

    @Override // com.thinkup.core.common.nn.m
    public final void o(String str) {
        TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener = o().m;
        if (tUInterstitialAutoLoadListener != null) {
            tUInterstitialAutoLoadListener.onInterstitialAutoLoaded(str);
        }
    }

    @Override // com.thinkup.core.common.nn.m
    public final void o(String str, AdError adError) {
        TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener = o().m;
        if (tUInterstitialAutoLoadListener != null) {
            tUInterstitialAutoLoadListener.onInterstitialAutoLoadFail(str, adError);
        }
    }

    public final void o(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.oo = tUNativeAdCustomRender;
    }

    public final void o(Activity activity, String str, TUShowConfig tUShowConfig, TUInterstitialAutoEventListener tUInterstitialAutoEventListener, TUAdRevenueListener tUAdRevenueListener) {
        omn.m(str, mo.o0m.oom, mo.o0m.omn, mo.o0m.nn, "");
        if (TextUtils.isEmpty(str)) {
            Log.e(this.o, "PlacementId is Empty!");
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId is empty.");
            if (tUInterstitialAutoEventListener != null) {
                tUInterstitialAutoEventListener.onInterstitialAdVideoError(errorCode);
                return;
            }
            return;
        }
        if (o0n.m().on() != null && !TextUtils.isEmpty(o0n.m().o00()) && !TextUtils.isEmpty(o0n.m().o0o())) {
            if (activity == null) {
                Log.e(this.o, "Interstitial Show Activity is null.");
            }
            m mVarO = m.o(activity, str);
            if (mVarO != null) {
                mVarO.o(activity, tUShowConfig, new oo(tUInterstitialAutoEventListener, tUAdRevenueListener), null, null, this.oo);
                return;
            } else {
                if (tUInterstitialAutoEventListener != null) {
                    tUInterstitialAutoEventListener.onInterstitialAdVideoError(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"));
                    return;
                }
                return;
            }
        }
        Log.e(this.o, "Show error: SDK init error!");
        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
        if (tUInterstitialAutoEventListener != null) {
            tUInterstitialAutoEventListener.onInterstitialAdVideoError(errorCode2);
        }
    }

    public final void o(TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener) {
        this.o0 = tUInterstitialAutoLoadListener;
    }
}
