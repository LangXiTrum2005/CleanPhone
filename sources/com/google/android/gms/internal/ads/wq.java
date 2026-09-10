package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class wq implements oq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vj0 f21582a;

    public wq(vj0 vj0Var) {
        this.f21582a = vj0Var;
    }

    public static final Bundle a(Map map) {
        Bundle bundle = new Bundle();
        bundle.putString("request_origin", "inspector_ooct");
        if (map.containsKey("networkExtras")) {
            try {
                JSONObject jSONObject = new JSONObject((String) map.get("networkExtras"));
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    Object obj = jSONObject.get(next);
                    if (obj instanceof String) {
                        bundle.putString(next, (String) obj);
                    } else if (obj instanceof Integer) {
                        bundle.putInt(next, ((Integer) obj).intValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(next, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(next, ((Float) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(next, ((Double) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(next, ((Long) obj).longValue());
                    }
                }
            } catch (JSONException e10) {
                zzt.zzh().d("OutOfContextTestingGmsgHandler.generateNetworkExtras", e10);
            }
        }
        return bundle;
    }

    public static final ArrayList c(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                arrayList.add(jSONArray.getString(i10));
            }
            return arrayList;
        } catch (JSONException e10) {
            zzt.zzh().d("OutOfContextTestingGmsgHandler.stringArrayToList.".concat(str2), e10);
            return new ArrayList();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        VideoOptions videoOptionsBuild;
        NativeAdOptions nativeAdOptionsBuild;
        HashMap map2;
        Object obj2;
        AdRequest adRequestBuild;
        if (((Boolean) zzba.zzc().a(am.Ta)).booleanValue()) {
            AdSize adSize = AdSize.BANNER;
            Bundle bundle = new Bundle();
            bundle.putString("request_origin", "inspector_ooct");
            AdRequest adRequestBuild2 = new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
            String str = (String) map.get("adUnitId");
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            String str2 = (String) map.get("format");
            String str3 = TextUtils.isEmpty(str2) ? "" : str2;
            boolean z10 = false;
            Activity activityZzj = null;
            if (((Boolean) zzba.zzc().a(am.Va)).booleanValue()) {
                if (map.containsKey("isGamRequest") && ((String) map.get("isGamRequest")).equals("1")) {
                    z10 = true;
                }
                if (z10) {
                    AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it = c((String) map.get("keywords"), "keywords").iterator();
                        while (it.hasNext()) {
                            builder.addKeyword((String) it.next());
                        }
                    }
                    builder.addNetworkExtrasBundle(AdMobAdapter.class, a(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                builder.addCustomTargeting(next, jSONObject.getString(next));
                            }
                        } catch (JSONException e10) {
                            zzt.zzh().d("OutOfContextTestingGmsgHandler.generateAdManagerAdRequest", e10);
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        builder.setContentUrl((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder.setNeighboringContentUrls(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder.setRequestAgent((String) map.get("requestAgent"));
                    }
                    if (map.containsKey("publisherProvidedId")) {
                        builder.setPublisherProvidedId((String) map.get("publisherProvidedId"));
                    }
                    if (map.containsKey("categoryExclusions")) {
                        Iterator it2 = c((String) map.get("categoryExclusions"), "categoryExclusions").iterator();
                        while (it2.hasNext()) {
                            builder.addCategoryExclusion((String) it2.next());
                        }
                    }
                    adRequestBuild = builder.build();
                } else {
                    AdRequest.Builder builder2 = new AdRequest.Builder();
                    if (map.containsKey("keywords")) {
                        Iterator it3 = c((String) map.get("keywords"), "keywords").iterator();
                        while (it3.hasNext()) {
                            builder2.addKeyword((String) it3.next());
                        }
                    }
                    builder2.addNetworkExtrasBundle(AdMobAdapter.class, a(map));
                    if (map.containsKey("customTargeting")) {
                        try {
                            JSONObject jSONObject2 = new JSONObject((String) map.get("customTargeting"));
                            Iterator<String> itKeys2 = jSONObject2.keys();
                            while (itKeys2.hasNext()) {
                                String next2 = itKeys2.next();
                                builder2.addCustomTargeting(next2, jSONObject2.getString(next2));
                            }
                        } catch (JSONException e11) {
                            zzt.zzh().d("OutOfContextTestingGmsgHandler.generateAdMobAdRequest", e11);
                        }
                    }
                    if (map.containsKey("contentUrl") && !TextUtils.isEmpty((CharSequence) map.get("contentUrl"))) {
                        builder2.setContentUrl((String) map.get("contentUrl"));
                    }
                    if (map.containsKey("neighboringContentUrlStrings")) {
                        builder2.setNeighboringContentUrls(c((String) map.get("neighboringContentUrlStrings"), "neighboringContentUrlStrings"));
                    }
                    if (map.containsKey("requestAgent")) {
                        builder2.setRequestAgent((String) map.get("requestAgent"));
                    }
                    adRequestBuild = builder2.build();
                }
                adRequestBuild2 = adRequestBuild;
                String str4 = (String) map.get("width");
                String str5 = (String) map.get("height");
                if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
                    adSize = AdSize.BANNER;
                } else {
                    try {
                        adSize = new AdSize(Integer.parseInt(str4), Integer.parseInt(str5));
                    } catch (NumberFormatException e12) {
                        zzt.zzh().d("OutOfContextTestingGmsgHandler.generateAdSize", e12);
                        adSize = AdSize.BANNER;
                    }
                }
                if (map.containsKey("clickToExpandRequested") || map.containsKey("customControlsRequested") || map.containsKey("startMuted")) {
                    VideoOptions.Builder builder3 = new VideoOptions.Builder();
                    if (map.containsKey("startMuted")) {
                        builder3.setStartMuted(((String) map.get("startMuted")).equals("1"));
                    }
                    if (map.containsKey("customControlsRequested")) {
                        builder3.setCustomControlsRequested(((String) map.get("customControlsRequested")).equals("1"));
                    }
                    if (map.containsKey("clickToExpandRequested")) {
                        builder3.setClickToExpandRequested(((String) map.get("clickToExpandRequested")).equals("1"));
                    }
                    videoOptionsBuild = builder3.build();
                } else {
                    videoOptionsBuild = null;
                }
                if (map.containsKey("customMuteThisAdRequested") || map.containsKey("disableImageLoading") || map.containsKey("mediaAspectRatio") || map.containsKey("preferredAdChoicesPosition") || map.containsKey("shouldRequestMultipleImages") || (videoOptionsBuild != null && str3.equals("NATIVE"))) {
                    NativeAdOptions.Builder builder4 = new NativeAdOptions.Builder();
                    if (map.containsKey("disableImageLoading")) {
                        builder4.setReturnUrlsForImageAssets(((String) map.get("disableImageLoading")).equals("1"));
                    }
                    if (map.containsKey("mediaAspectRatio")) {
                        String str6 = (String) map.get("mediaAspectRatio");
                        if (!TextUtils.isEmpty(str6)) {
                            try {
                                builder4.setMediaAspectRatio(Integer.parseInt(str6));
                            } catch (NumberFormatException e13) {
                                zzt.zzh().d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.mediaAspectRatio", e13);
                            }
                        }
                    }
                    if (map.containsKey("shouldRequestMultipleImages")) {
                        builder4.setRequestMultipleImages(((String) map.get("shouldRequestMultipleImages")).equals("1"));
                    }
                    if (map.containsKey("preferredAdChoicesPosition")) {
                        String str7 = (String) map.get("preferredAdChoicesPosition");
                        if (!TextUtils.isEmpty(str7)) {
                            try {
                                builder4.setAdChoicesPlacement(Integer.parseInt(str7));
                            } catch (NumberFormatException e14) {
                                zzt.zzh().d("OutOfContextTestingGmsgHandler.generateNativeAdOptionsBuilder.preferredAdChoicesPosition", e14);
                            }
                        }
                    }
                    if (map.containsKey("customMuteThisAdRequested")) {
                        builder4.setRequestCustomMuteThisAd(((String) map.get("customMuteThisAdRequested")).equals("1"));
                    }
                    if (videoOptionsBuild != null) {
                        builder4.setVideoOptions(videoOptionsBuild);
                    }
                    nativeAdOptionsBuild = builder4.build();
                } else {
                    nativeAdOptionsBuild = null;
                }
            } else {
                videoOptionsBuild = null;
                nativeAdOptionsBuild = null;
            }
            String str8 = (String) map.get("action");
            if (TextUtils.isEmpty(str8) || TextUtils.isEmpty(str)) {
                return;
            }
            if (!str8.equals("load") || TextUtils.isEmpty(str3)) {
                if (str8.equals("show")) {
                    vj0 vj0Var = this.f21582a;
                    synchronized (vj0Var) {
                        try {
                            oj0 oj0Var = vj0Var.f21186d;
                            b30 b30Var = oj0Var.f18284d;
                            if (b30Var != null && !b30Var.l()) {
                                activityZzj = oj0Var.f18284d.zzj();
                            }
                            if (activityZzj != null && (obj2 = (map2 = vj0Var.f21183a).get(str)) != null) {
                                ul ulVar = am.Ua;
                                if (!((Boolean) zzba.zzc().a(ulVar)).booleanValue() || (obj2 instanceof AppOpenAd) || (obj2 instanceof InterstitialAd) || (obj2 instanceof RewardedAd) || (obj2 instanceof RewardedInterstitialAd)) {
                                    map2.remove(str);
                                }
                                vj0Var.z1(vj0.B1(obj2));
                                if (obj2 instanceof AppOpenAd) {
                                    ((AppOpenAd) obj2).show(activityZzj);
                                    return;
                                }
                                if (obj2 instanceof InterstitialAd) {
                                    ((InterstitialAd) obj2).show(activityZzj);
                                    return;
                                }
                                if (obj2 instanceof RewardedAd) {
                                    ((RewardedAd) obj2).show(activityZzj, tc0.f20292j);
                                    return;
                                }
                                if (obj2 instanceof RewardedInterstitialAd) {
                                    ((RewardedInterstitialAd) obj2).show(activityZzj, tc0.f20291i);
                                    return;
                                }
                                if (((Boolean) zzba.zzc().a(ulVar)).booleanValue() && ((obj2 instanceof AdView) || (obj2 instanceof NativeAd))) {
                                    Intent intent = new Intent();
                                    Context contextA1 = vj0Var.A1();
                                    intent.setClassName(contextA1, OutOfContextTestingActivity.CLASS_NAME);
                                    intent.putExtra("adUnit", str);
                                    zzt.zzc();
                                    zzs.zzY(contextA1, intent);
                                    return;
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                return;
            }
            vj0 vj0Var2 = this.f21582a;
            synchronized (vj0Var2) {
                try {
                    switch (str3.hashCode()) {
                        case -1999289321:
                            if (str3.equals("NATIVE")) {
                                AdLoader.Builder builder5 = new AdLoader.Builder(vj0Var2.A1(), str);
                                builder5.forNativeAd(new md0(21, vj0Var2, str));
                                builder5.withAdListener(new uj0(vj0Var2));
                                if (((Boolean) zzba.zzc().a(am.Va)).booleanValue() && nativeAdOptionsBuild != null) {
                                    builder5.withNativeAdOptions(nativeAdOptionsBuild);
                                }
                                builder5.build().loadAd(adRequestBuild2);
                                return;
                            }
                            break;
                        case -1372958932:
                            if (str3.equals("INTERSTITIAL")) {
                                InterstitialAd.load(vj0Var2.A1(), str, adRequestBuild2, new rj0(vj0Var2, str));
                            }
                            break;
                        case -428325382:
                            if (str3.equals("APP_OPEN_AD")) {
                                AppOpenAd.load(vj0Var2.A1(), str, adRequestBuild2, new pj0(vj0Var2, str));
                                return;
                            }
                            break;
                        case 543046670:
                            if (str3.equals("REWARDED")) {
                                RewardedAd.load(vj0Var2.A1(), str, adRequestBuild2, new sj0(vj0Var2, str));
                                return;
                            }
                            break;
                        case 1854800829:
                            if (str3.equals("REWARDED_INTERSTITIAL")) {
                                RewardedInterstitialAd.load(vj0Var2.A1(), str, adRequestBuild2, new tj0(vj0Var2, str));
                                return;
                            }
                            break;
                        case 1951953708:
                            if (str3.equals(com.ironsource.mediationsdk.j.f29553a)) {
                                ul ulVar2 = am.Va;
                                BaseAdView adManagerAdView = (((Boolean) zzba.zzc().a(ulVar2)).booleanValue() && z10) ? new AdManagerAdView(vj0Var2.A1()) : new AdView(vj0Var2.A1());
                                adManagerAdView.setAdSize(adSize);
                                adManagerAdView.setAdUnitId(str);
                                adManagerAdView.setAdListener(new qj0(vj0Var2, str, adManagerAdView));
                                if (((Boolean) zzba.zzc().a(ulVar2)).booleanValue() && z10 && videoOptionsBuild != null) {
                                    ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsBuild);
                                }
                                adManagerAdView.loadAd(adRequestBuild2);
                                return;
                            }
                            break;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
