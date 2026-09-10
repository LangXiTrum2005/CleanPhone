package com.applovin.mediation;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.sdk.p;
import com.applovin.impl.y3;
import com.applovin.sdk.AppLovinSdkUtils;
import com.ironsource.C0594u;
import com.ironsource.mediationsdk.j;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.e;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class MaxAdFormat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f10330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10331b;
    public static final MaxAdFormat BANNER = new MaxAdFormat(j.f29553a, "Banner");
    public static final MaxAdFormat MREC = new MaxAdFormat("MREC", "MREC");
    public static final MaxAdFormat LEADER = new MaxAdFormat("LEADER", "Leader");
    public static final MaxAdFormat INTERSTITIAL = new MaxAdFormat("INTER", "Interstitial");
    public static final MaxAdFormat APP_OPEN = new MaxAdFormat("APPOPEN", "App Open");
    public static final MaxAdFormat REWARDED = new MaxAdFormat("REWARDED", "Rewarded");
    public static final MaxAdFormat NATIVE = new MaxAdFormat("NATIVE", "Native");

    @Deprecated
    public static final MaxAdFormat REWARDED_INTERSTITIAL = new MaxAdFormat("REWARDED_INTER", "Rewarded Interstitial");

    private MaxAdFormat(String str, String str2) {
        this.f10330a = str;
        this.f10331b = str2;
    }

    @Nullable
    public static MaxAdFormat formatFromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.equalsIgnoreCase("banner")) {
            return BANNER;
        }
        if (str.equalsIgnoreCase("mrec")) {
            return MREC;
        }
        if (str.equalsIgnoreCase(IronSourceConstants.EVENTS_NATIVE)) {
            return NATIVE;
        }
        if (str.equalsIgnoreCase("leaderboard") || str.equalsIgnoreCase("leader")) {
            return LEADER;
        }
        if (str.equalsIgnoreCase("interstitial") || str.equalsIgnoreCase("inter")) {
            return INTERSTITIAL;
        }
        if (str.equalsIgnoreCase("appopen") || str.equalsIgnoreCase("app_open")) {
            return APP_OPEN;
        }
        if (str.equalsIgnoreCase("rewarded") || str.equalsIgnoreCase(C0594u.f30746j)) {
            return REWARDED;
        }
        p.h("AppLovinSdk", "Unknown ad format: ".concat(str));
        return null;
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(Context context) {
        return getAdaptiveSize(-1, context);
    }

    @Deprecated
    public String getDisplayName() {
        return this.f10331b;
    }

    public String getLabel() {
        return this.f10330a;
    }

    public AppLovinSdkUtils.Size getSize() {
        if (this == BANNER) {
            return new AppLovinSdkUtils.Size(320, 50);
        }
        if (this == LEADER) {
            return new AppLovinSdkUtils.Size(728, 90);
        }
        return this == MREC ? new AppLovinSdkUtils.Size(300, 250) : new AppLovinSdkUtils.Size(0, 0);
    }

    public boolean isAdViewAd() {
        return this == BANNER || this == MREC || this == LEADER;
    }

    public boolean isBannerOrLeaderAd() {
        return this == BANNER || this == LEADER;
    }

    public boolean isFullscreenAd() {
        return this == INTERSTITIAL || this == APP_OPEN || this == REWARDED;
    }

    public String toString() {
        return e.q(this.f10330a, "'}", new StringBuilder("MaxAdFormat{label='"));
    }

    public AppLovinSdkUtils.Size getAdaptiveSize(int i10, Context context) {
        return (this == BANNER || this == LEADER) ? y3.a(i10, this, context) : getSize();
    }
}
