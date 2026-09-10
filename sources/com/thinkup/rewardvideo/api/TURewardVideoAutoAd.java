package com.thinkup.rewardvideo.api;

import android.app.Activity;
import android.content.Context;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUAdRevenueListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.core.common.ooo.nn;
import com.thinkup.rewardvideo.o.n;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class TURewardVideoAutoAd {
    public static void addPlacementId(String... strArr) {
        addPlacementId(null, strArr);
    }

    public static TUAdStatusInfo checkAdStatus(String str) {
        return n.o().n(str);
    }

    public static List<TUAdInfo> checkValidAdCaches(String str) {
        return n.o().o0(str);
    }

    public static void entryAdScenario(String str, String str2) {
        n.o();
        n.o(str, str2, null);
    }

    public static void init(Context context, String[] strArr, TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener) {
        init(context, strArr, tURewardVideoAutoLoadListener, null);
    }

    public static boolean isAdReady(String str) {
        return n.o().m(str);
    }

    public static void removePlacementId(String... strArr) {
        n.o();
        n.o(strArr);
    }

    public static void setAutoLoadListener(TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener) {
        n.o().o(tURewardVideoAutoLoadListener);
    }

    public static void setLocalExtra(String str, Map<String, Object> map) {
        n.o();
        n.o(str, map);
    }

    public static void setNativeAdCustomRender(TUNativeAdCustomRender tUNativeAdCustomRender) {
        n.o().o(tUNativeAdCustomRender);
    }

    public static void show(Activity activity, String str, TURewardVideoAutoEventListener tURewardVideoAutoEventListener) {
        show(activity, str, "", tURewardVideoAutoEventListener);
    }

    public static void addPlacementId(TUAdRequest tUAdRequest, String... strArr) {
        n.o().o(tUAdRequest, strArr);
    }

    public static void entryAdScenario(String str, String str2, Map<String, Object> map) {
        n.o();
        n.o(str, str2, map);
    }

    public static void init(Context context, String[] strArr, TURewardVideoAutoLoadListener tURewardVideoAutoLoadListener, TUAdRequest tUAdRequest) {
        n.o().o(context, strArr, tURewardVideoAutoLoadListener, tUAdRequest);
    }

    @Deprecated
    public static void show(Activity activity, String str, String str2, TURewardVideoAutoEventListener tURewardVideoAutoEventListener) {
        show(activity, str, nn.oo(str2), tURewardVideoAutoEventListener);
    }

    public static void show(Activity activity, String str, TUShowConfig tUShowConfig, TURewardVideoAutoEventListener tURewardVideoAutoEventListener) {
        show(activity, str, tUShowConfig, tURewardVideoAutoEventListener, null);
    }

    public static void show(Activity activity, String str, TUShowConfig tUShowConfig, TURewardVideoAutoEventListener tURewardVideoAutoEventListener, TUAdRevenueListener tUAdRevenueListener) {
        n.o().o(activity, str, tUShowConfig, tURewardVideoAutoEventListener, tUAdRevenueListener);
    }
}
