package com.airbnb.lottie;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: compiled from: LottieFeatureFlags.java */
/* JADX INFO: loaded from: classes.dex */
public class polder {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final HashSet<LottieFeatureFlag> f16172attabal = new HashSet<>();

    public boolean attabal(LottieFeatureFlag lottieFeatureFlag, boolean z) {
        if (!z) {
            return this.f16172attabal.remove(lottieFeatureFlag);
        }
        if (Build.VERSION.SDK_INT >= lottieFeatureFlag.minRequiredSdkVersion) {
            return this.f16172attabal.add(lottieFeatureFlag);
        }
        utwa.beachfront.dern(String.format("%s is not supported pre SDK %d", lottieFeatureFlag.name(), Integer.valueOf(lottieFeatureFlag.minRequiredSdkVersion)));
        return false;
    }

    public boolean saneness(LottieFeatureFlag lottieFeatureFlag) {
        return this.f16172attabal.contains(lottieFeatureFlag);
    }
}
