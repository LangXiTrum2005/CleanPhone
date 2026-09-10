package com.applovin.sdk;

import com.ironsource.mediationsdk.j;
import defpackage.e;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppLovinAdSize {
    public static final int SPAN = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f10424b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f10425c;
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, j.f29553a);
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(300, 250, "MREC");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");

    private AppLovinAdSize(int i10, int i11, String str) {
        this.f10424b = i10;
        this.f10425c = i11;
        this.f10423a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if (j.f29553a.equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException(e.n("Unknown Ad Size: ", str));
    }

    public int getHeight() {
        return this.f10425c;
    }

    public String getLabel() {
        return this.f10423a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f10424b;
    }

    public String toString() {
        return getLabel();
    }
}
