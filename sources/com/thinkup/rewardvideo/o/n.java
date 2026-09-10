package com.thinkup.rewardvideo.o;

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
import com.thinkup.core.api.TUBaseAdAdapter;
import com.thinkup.core.api.TUEventInterface;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.n.mn;
import com.thinkup.core.common.n.mo;
import com.thinkup.core.common.n.o0n;
import com.thinkup.core.common.oon;
import com.thinkup.core.common.ooo;
import com.thinkup.core.common.ooo.omn;
import com.thinkup.rewardvideo.api.TURewardVideoAutoEventListener;
import com.thinkup.rewardvideo.api.TURewardVideoAutoLoadListener;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class n implements com.thinkup.core.common.nn.m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile n f42645n;
    private TURewardVideoAutoLoadListener o0;
    private TUNativeAdCustomRender oo;
    String o = "RewardVideoAuto";
    TURewardVideoAutoLoadListener m = new TURewardVideoAutoLoadListener() { // from class: com.thinkup.rewardvideo.o.n.1
        @Override // com.thinkup.rewardvideo.api.TURewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoadFail(final String str, final AdError adError) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.n.1.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.o0 != null) {
                        n.this.o0.onRewardVideoAutoLoadFail(str, adError);
                    }
                }
            });
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoAutoLoadListener
        public final void onRewardVideoAutoLoaded(final String str) {
            o0n.m().m(new Runnable() { // from class: com.thinkup.rewardvideo.o.n.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (n.this.o0 != null) {
                        n.this.o0.onRewardVideoAutoLoaded(str);
                    }
                }
            });
        }
    };

    private static com.thinkup.core.common.om om(String str) {
        return com.thinkup.core.common.om.o(o0n.m().on(), str, "1");
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
        omn.m(str, mo.o0m.oon, mo.o0m.on0, String.valueOf(zIsReady), "");
        return zIsReady;
    }

    public final TUAdStatusInfo n(String str) {
        TUAdStatusInfo tUAdStatusInfo;
        if (TextUtils.isEmpty(str) || (tUAdStatusInfo = oo(str)) == null) {
            tUAdStatusInfo = new TUAdStatusInfo(false, false, null);
        }
        omn.m(str, mo.o0m.oon, mo.o0m.ono, tUAdStatusInfo.toString(), "");
        return tUAdStatusInfo;
    }

    public final List<TUAdInfo> o0(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(this.o, "PlacementId is empty.");
            return null;
        }
        com.thinkup.core.common.om omVarOm = om(str);
        if (omVarOm != null) {
            return omVarOm.o(o0n.m().mm0());
        }
        return null;
    }

    public static n o() {
        if (f42645n == null) {
            synchronized (n.class) {
                try {
                    if (f42645n == null) {
                        f42645n = new n();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f42645n;
    }

    private TURewardVideoAutoLoadListener m() {
        return this.m;
    }

    public final void o(Context context, String[] strArr, TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener, TUAdRequest tUAdRequest) {
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
        this.o0 = tURewardVideoAutoLoadListener;
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

    public final void o(Activity activity, String str, TUShowConfig tUShowConfig, TURewardVideoAutoEventListener tURewardVideoAutoEventListener, TUAdRevenueListener tUAdRevenueListener) {
        omn.m(str, mo.o0m.oon, mo.o0m.omn, mo.o0m.nn, "");
        if (TextUtils.isEmpty(str)) {
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "placementId is empty.");
            if (tURewardVideoAutoEventListener != null) {
                tURewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode, mn.o((TUBaseAdAdapter) null));
            }
            Log.e(this.o, "PlacementId is Empty!");
            return;
        }
        if (o0n.m().on() != null && !TextUtils.isEmpty(o0n.m().o00()) && !TextUtils.isEmpty(o0n.m().o0o())) {
            if (activity == null) {
                Log.e(this.o, "RewardedVideo Show Activity is null.");
            }
            o oVarO = o.o(activity, str);
            if (oVarO != null) {
                oVarO.o(activity, tUShowConfig, new m(tURewardVideoAutoEventListener, tUAdRevenueListener), (TUEventInterface) null, (Map<String, Object>) null, this.oo);
                return;
            } else {
                if (tURewardVideoAutoEventListener != null) {
                    tURewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(ErrorCode.getErrorCode(ErrorCode.exception, "", "adLoadManager is null"), mn.o((TUBaseAdAdapter) null));
                    return;
                }
                return;
            }
        }
        AdError errorCode2 = ErrorCode.getErrorCode(ErrorCode.exception, "", "sdk init error");
        if (tURewardVideoAutoEventListener != null) {
            tURewardVideoAutoEventListener.onRewardedVideoAdPlayFailed(errorCode2, mn.o((TUBaseAdAdapter) null));
        }
        Log.e(this.o, "SDK init error!");
    }

    public static void o(String str, String str2, Map<String, Object> map) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        o0n.m().o(str, str2, "1", map);
    }

    @Override // com.thinkup.core.common.nn.m
    public final void o(String str) {
        TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener = o().m;
        if (tURewardVideoAutoLoadListener != null) {
            tURewardVideoAutoLoadListener.onRewardVideoAutoLoaded(str);
        }
    }

    @Override // com.thinkup.core.common.nn.m
    public final void o(String str, AdError adError) {
        TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener = o().m;
        if (tURewardVideoAutoLoadListener != null) {
            tURewardVideoAutoLoadListener.onRewardVideoAutoLoadFail(str, adError);
        }
    }

    public final void o(TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener) {
        this.o0 = tURewardVideoAutoLoadListener;
    }

    public final void o(TUNativeAdCustomRender tUNativeAdCustomRender) {
        this.oo = tUNativeAdCustomRender;
    }
}
