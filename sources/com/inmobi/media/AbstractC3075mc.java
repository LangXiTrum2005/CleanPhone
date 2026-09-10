package com.inmobi.media;

import com.inmobi.unification.sdk.model.initialization.TimeoutConfigurations;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3075mc {
    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x014d  */
    public static C3100nc a(TimeoutConfigurations.MediationConfig mediationConfig, String placementType, String adTypes, String str) {
        TimeoutConfigurations.AdNonABConfig banner;
        TimeoutConfigurations.AdPreloadConfig banner2;
        TimeoutConfigurations.AdABConfig banner3;
        Intrinsics.checkNotNullParameter(mediationConfig, "mediationConfig");
        Intrinsics.checkNotNullParameter(placementType, "placementType");
        Intrinsics.checkNotNullParameter(adTypes, "adTypes");
        if (placementType.equals("AB")) {
            TimeoutConfigurations.ABConfig ab = mediationConfig.getAb();
            int iHashCode = adTypes.hashCode();
            if (iHashCode != -1396342996) {
                if (iHashCode != -1052618729) {
                    if (iHashCode != 104431) {
                        if (iHashCode == 93166550 && adTypes.equals("audio")) {
                            banner3 = ab.getAudio();
                        } else {
                            banner3 = ab.getBanner();
                        }
                    } else if (adTypes.equals("int")) {
                        banner3 = ab.getInt();
                    } else {
                        banner3 = ab.getBanner();
                    }
                } else if (adTypes.equals("native")) {
                    banner3 = ab.getNative();
                } else {
                    banner3 = ab.getBanner();
                }
            } else if (adTypes.equals("banner")) {
                banner3 = ab.getBanner();
            } else {
                banner3 = ab.getBanner();
            }
            return new C3100nc(a(str, banner3.getLoadRetryInterval()), a(str, banner3.getMaxLoadRetries()), a(str, banner3.getLoadTimeout()), (Integer) null, 24);
        }
        if (placementType.equals("Preload")) {
            TimeoutConfigurations.PreloadConfig preload = mediationConfig.getPreload();
            int iHashCode2 = adTypes.hashCode();
            if (iHashCode2 != -1396342996) {
                if (iHashCode2 != -1052618729) {
                    if (iHashCode2 != 104431) {
                        if (iHashCode2 == 93166550 && adTypes.equals("audio")) {
                            banner2 = preload.getAudio();
                        } else {
                            banner2 = preload.getBanner();
                        }
                    } else if (adTypes.equals("int")) {
                        banner2 = preload.getInt();
                    } else {
                        banner2 = preload.getBanner();
                    }
                } else if (adTypes.equals("native")) {
                    banner2 = preload.getNative();
                } else {
                    banner2 = preload.getBanner();
                }
            } else if (adTypes.equals("banner")) {
                banner2 = preload.getBanner();
            } else {
                banner2 = preload.getBanner();
            }
            return new C3100nc(a(str, banner2.getLoadRetryInterval()), a(str, banner2.getMaxLoadRetries()), a(str, banner2.getLoadTimeout()), Integer.valueOf(a(str, banner2.getMuttTimeout())), Integer.valueOf(a(str, banner2.getPreloadTimeout())));
        }
        TimeoutConfigurations.NonABConfig nonAb = mediationConfig.getNonAb();
        int iHashCode3 = adTypes.hashCode();
        if (iHashCode3 != -1396342996) {
            if (iHashCode3 != -1052618729) {
                if (iHashCode3 != 104431) {
                    if (iHashCode3 == 93166550 && adTypes.equals("audio")) {
                        banner = nonAb.getAudio();
                    } else {
                        banner = nonAb.getBanner();
                    }
                } else if (adTypes.equals("int")) {
                    banner = nonAb.getInt();
                } else {
                    banner = nonAb.getBanner();
                }
            } else if (adTypes.equals("native")) {
                banner = nonAb.getNative();
            } else {
                banner = nonAb.getBanner();
            }
        } else if (adTypes.equals("banner")) {
            banner = nonAb.getBanner();
        } else {
            banner = nonAb.getBanner();
        }
        return new C3100nc(a(str, banner.getLoadRetryInterval()), a(str, banner.getMaxLoadRetries()), a(str, banner.getLoadTimeout()), Integer.valueOf(a(str, banner.getMuttTimeout())), 16);
    }

    public static int a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject.has(str)) {
            return jSONObject.getInt(str);
        }
        return jSONObject.optInt(BuildConfig.FLAVOR, 0);
    }
}
