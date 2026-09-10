package com.google.android.gms.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public enum AdFormat {
    BANNER(0),
    INTERSTITIAL(1),
    REWARDED(2),
    REWARDED_INTERSTITIAL(3),
    NATIVE(4),
    APP_OPEN_AD(6);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10623a;

    AdFormat(int i10) {
        this.f10623a = i10;
    }

    @Nullable
    public static AdFormat getAdFormat(int i10) {
        for (AdFormat adFormat : values()) {
            if (adFormat.getValue() == i10) {
                return adFormat;
            }
        }
        return null;
    }

    public int getValue() {
        return this.f10623a;
    }
}
