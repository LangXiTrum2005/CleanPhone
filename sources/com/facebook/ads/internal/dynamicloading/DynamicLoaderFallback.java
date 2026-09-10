package com.facebook.ads.internal.dynamicloading;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
class DynamicLoaderFallback {
    private static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    public static class SimpleMethodCaptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Method f15992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InvocationHandler f15993b = new InvocationHandler() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.SimpleMethodCaptor.1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                SimpleMethodCaptor.this.f15992a = method;
                return null;
            }
        };

        public final Object a(Class cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f15993b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        return method != null && method2 != null && method.getDeclaringClass().equals(method2.getDeclaringClass()) && method.getName().equals(method2.getName()) && equalsMethodParams(method, method2);
    }

    public static DynamicLoader makeFallbackLoader() {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        final ArrayList arrayList4 = new ArrayList();
        final ArrayList arrayList5 = new ArrayList();
        final HashMap map = new HashMap();
        final HashMap map2 = new HashMap();
        SimpleMethodCaptor simpleMethodCaptor = new SimpleMethodCaptor();
        DynamicLoader dynamicLoader = (DynamicLoader) simpleMethodCaptor.a(DynamicLoader.class);
        dynamicLoader.createInterstitialAd(null, null, null);
        arrayList5.add(simpleMethodCaptor.f15992a);
        dynamicLoader.createRewardedVideoAd(null, null, null);
        arrayList5.add(simpleMethodCaptor.f15992a);
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(simpleMethodCaptor.f15992a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(simpleMethodCaptor.f15992a);
        dynamicLoader.createNativeAdApi(null, null);
        final Method method = simpleMethodCaptor.f15992a;
        dynamicLoader.createNativeBannerAdApi(null, null);
        final Method method2 = simpleMethodCaptor.f15992a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) simpleMethodCaptor.a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(simpleMethodCaptor.f15992a);
        nativeAdBaseApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.f15992a);
        nativeAdBaseApi.buildLoadAdConfig(null);
        arrayList4.add(simpleMethodCaptor.f15992a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) simpleMethodCaptor.a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(simpleMethodCaptor.f15992a);
        interstitialAdApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.f15992a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(simpleMethodCaptor.f15992a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) simpleMethodCaptor.a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(simpleMethodCaptor.f15992a);
        rewardedVideoAdApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.f15992a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(simpleMethodCaptor.f15992a);
        AdViewApi adViewApi = (AdViewApi) simpleMethodCaptor.a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(simpleMethodCaptor.f15992a);
        adViewApi.loadAd(null);
        arrayList2.add(simpleMethodCaptor.f15992a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(simpleMethodCaptor.f15992a);
        ((AdView.AdViewLoadConfigBuilder) simpleMethodCaptor.a(AdView.AdViewLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.f15992a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) simpleMethodCaptor.a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.f15992a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) simpleMethodCaptor.a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.f15992a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) simpleMethodCaptor.a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener(null);
        arrayList3.add(simpleMethodCaptor.f15992a);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{DynamicLoader.class}, new InvocationHandler() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.1
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method3, Object[] objArr) {
                HashMap map3;
                boolean zIsPrimitive = method3.getReturnType().isPrimitive();
                HashMap map4 = map;
                if (zIsPrimitive) {
                    if (!method3.getReturnType().equals(Void.TYPE)) {
                        return Array.get(Array.newInstance(method3.getReturnType(), 1), 0);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method3, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, map4))) {
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method3, (Method) it2.next()) && DynamicLoaderFallback.reportError(obj, map4)) {
                            return null;
                        }
                    }
                    return null;
                }
                if (method3.getReturnType().equals(String.class)) {
                    return "";
                }
                Object objNewProxyInstance = method3.getReturnType().equals(obj.getClass().getInterfaces()[0]) ? obj : Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method3.getReturnType()}, this);
                Iterator it3 = arrayList3.iterator();
                while (true) {
                    boolean zHasNext = it3.hasNext();
                    map3 = map2;
                    if (!zHasNext) {
                        break;
                    }
                    if (DynamicLoaderFallback.equalsMethods(method3, (Method) it3.next())) {
                        DynamicLoaderFallback.sApiProxyToAdListenersMap.put(map3.get(obj), (AdListener) objArr[0]);
                        break;
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    if (DynamicLoaderFallback.equalsMethods(method3, (Method) it4.next())) {
                        map3.put(objNewProxyInstance, obj);
                    }
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    if (DynamicLoaderFallback.equalsMethods(method3, (Method) it5.next())) {
                        for (Object obj2 : objArr) {
                            if (obj2 instanceof Ad) {
                                map4.put(objNewProxyInstance, (Ad) obj2);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method3, method)) {
                    map4.put(objArr[1], (Ad) objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method3, method2)) {
                    map4.put(objArr[1], (Ad) objArr[0]);
                }
                return objNewProxyInstance;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, Ad> map) {
        if (obj == null) {
            return false;
        }
        final AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        final Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback.2
            @Override // java.lang.Runnable
            public final void run() {
                adListener.onError(ad, new AdError(-1, "Can't load Audience Network Dex. Please, check that audience_network folder is inside of assets folder."));
            }
        }, 500L);
        return true;
    }
}
