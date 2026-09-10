package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.yd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C3846yd {
    private static C3846yd b;
    private final ConcurrentHashMap<String, NetworkSettings> a = new ConcurrentHashMap<>();

    private C3846yd() {
    }

    public static synchronized C3846yd c() {
        try {
            if (b == null) {
                b = new C3846yd();
            }
        } catch (Throwable th) {
            throw th;
        }
        return b;
    }

    public void a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.a.put(networkSettings.getProviderName(), networkSettings);
    }

    public NetworkSettings b(String str) {
        NetworkSettings networkSettings = this.a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        NetworkSettings networkSettings2 = new NetworkSettings(str);
        a(networkSettings2);
        return networkSettings2;
    }

    public ConcurrentHashMap<String, NetworkSettings> d() {
        return this.a;
    }

    public void a() {
        this.a.clear();
    }

    public NetworkSettings c(String str) {
        for (NetworkSettings networkSettings : this.a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    public HashSet<String> a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
            return hashSet;
        } catch (Exception e) {
            C3631m4.d().a(e);
            return hashSet;
        }
    }

    public void b() {
        for (NetworkSettings networkSettings : this.a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings networkSettingsB = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.b(networkSettings.getApplicationSettings(), networkSettingsB.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.b(networkSettings.getInterstitialSettings(), networkSettingsB.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.b(networkSettings.getRewardedVideoSettings(), networkSettingsB.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.b(networkSettings.getBannerSettings(), networkSettingsB.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.b(networkSettings.getNativeAdSettings(), networkSettingsB.getNativeAdSettings()));
            }
        }
    }

    public boolean a(String str) {
        return this.a.containsKey(str);
    }
}
