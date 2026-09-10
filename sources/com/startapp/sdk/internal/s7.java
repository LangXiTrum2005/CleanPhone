package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s7 implements ea {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f41471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f41472c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d0 f41473e;

    public s7(Context context, AdUnitConfig config) {
        Intrinsics.f(context, "context");
        Intrinsics.f(config, "config");
        this.f41470a = context;
        this.f41471b = config;
        this.f41472c = -1;
        this.d = -1;
    }

    public final void a() {
        int i2 = this.f41472c;
        if (i2 == -1) {
            i2 = (int) (this.f41470a.getResources().getDisplayMetrics().widthPixels / this.f41470a.getResources().getDisplayMetrics().density);
        }
        int i3 = this.d;
        AdSize inlineAdaptiveBannerAdSize = i3 != -1 ? AdSize.getInlineAdaptiveBannerAdSize(i2, i3) : AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.f41470a, i2);
        Intrinsics.c(inlineAdaptiveBannerAdSize);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : this.f41471b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest adManagerAdRequestBuild = builder.build();
        Intrinsics.e(adManagerAdRequestBuild, "build(...)");
        AdManagerAdView adManagerAdView = new AdManagerAdView(this.f41470a);
        adManagerAdView.setAdSizes(inlineAdaptiveBannerAdSize, AdSize.BANNER);
        adManagerAdView.setAdUnitId(this.f41471b.getAdUnitId());
        adManagerAdView.setAdListener(new r7(this, adManagerAdView));
        adManagerAdView.loadAd(adManagerAdRequestBuild);
    }
}
