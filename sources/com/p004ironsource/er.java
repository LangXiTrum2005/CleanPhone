package com.p004ironsource;

import android.text.TextUtils;
import com.p004ironsource.mediationsdk.model.NetworkSettings;
import com.p004ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes5.dex */
public class er {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static er f24939b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, NetworkSettings> f24940a = new ConcurrentHashMap<>();

    private er() {
    }

    public static synchronized er c() {
        try {
            if (f24939b == null) {
                f24939b = new er();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f24939b;
    }

    public HashSet<String> a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.f24940a.values()) {
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
        } catch (Exception e2) {
            q9.d().a(e2);
        }
        return hashSet;
    }

    public NetworkSettings b(String str) {
        NetworkSettings networkSettings = this.f24940a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        NetworkSettings networkSettings2 = new NetworkSettings(str);
        a(networkSettings2);
        return networkSettings2;
    }

    public ConcurrentHashMap<String, NetworkSettings> d() {
        return this.f24940a;
    }

    public void a() {
        this.f24940a.clear();
    }

    public void b() {
        for (NetworkSettings networkSettings : this.f24940a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings networkSettingsB = b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.mergeJsons(networkSettings.getApplicationSettings(), networkSettingsB.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.mergeJsons(networkSettings.getInterstitialSettings(), networkSettingsB.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.mergeJsons(networkSettings.getRewardedVideoSettings(), networkSettingsB.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.mergeJsons(networkSettings.getBannerSettings(), networkSettingsB.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.mergeJsons(networkSettings.getNativeAdSettings(), networkSettingsB.getNativeAdSettings()));
            }
        }
    }

    public NetworkSettings c(String str) {
        for (NetworkSettings networkSettings : this.f24940a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    public void a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f24940a.put(networkSettings.getProviderName(), networkSettings);
    }

    public boolean a(String str) {
        return this.f24940a.containsKey(str);
    }
}
