package com.thinkup.interstitial.api;

import android.app.Activity;
import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.interstitial.o.o0;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TUInterstitialAutoAd {
    public static void addPlacementId(String... strArr) {
        addPlacementId(null, strArr);
    }

    public static TUAdStatusInfo checkAdStatus(String str) {
        return o0.o().n(str);
    }

    public static List<TUAdInfo> checkValidAdCaches(String str) {
        o0.o();
        return o0.o0(str);
    }

    public static void entryAdScenario(String str, String str2) {
        o0.o();
        o0.o(str, str2, null);
    }

    public static void init(Context context, String[] strArr, TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener) {
        init(context, strArr, tUInterstitialAutoLoadListener, null);
    }

    public static boolean isAdReady(String str) {
        return o0.o().m(str);
    }

    public static void removePlacementId(String... strArr) {
        o0.o();
        o0.o(strArr);
    }

    public static void setAutoLoadListener(TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener) {
        o0.o().o(tUInterstitialAutoLoadListener);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        o0.o();
        o0.o(str, map);
    }

    public static void setNativeAdCustomRender(TUNativeAdCustomRender tUNativeAdCustomRender) {
        o0.o().o(tUNativeAdCustomRender);
    }

    public static void show(Activity activity, String str, TUInterstitialAutoEventListener tUInterstitialAutoEventListener) {
        show(activity, str, (TUShowConfig) null, tUInterstitialAutoEventListener);
    }

    public static void addPlacementId(TUAdRequest tUAdRequest, String... strArr) {
        o0.o().o(tUAdRequest, strArr);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        o0.o();
        o0.o(str, str2, map);
    }

    public static void init(Context context, String[] strArr, TUInterstitialAutoLoadListener tUInterstitialAutoLoadListener, TUAdRequest tUAdRequest) {
        o0.o().o(context, strArr, tUInterstitialAutoLoadListener, tUAdRequest);
    }

    @Deprecated
    public static void show(Activity activity, String str, String str2, TUInterstitialAutoEventListener tUInterstitialAutoEventListener) {
        show(activity, str, nn.oo(str2), tUInterstitialAutoEventListener);
    }

    public static void show(Activity activity, String str, TUShowConfig tUShowConfig, TUInterstitialAutoEventListener tUInterstitialAutoEventListener) {
        show(activity, str, tUShowConfig, tUInterstitialAutoEventListener, null);
    }

    public static void show(Activity activity, String str, TUShowConfig tUShowConfig, TUInterstitialAutoEventListener tUInterstitialAutoEventListener, TUAdRevenueListener tUAdRevenueListener) {
        o0.o().o(activity, str, tUShowConfig, tUInterstitialAutoEventListener, tUAdRevenueListener);
    }
}
