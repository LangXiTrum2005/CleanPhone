package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class pj0 extends AppOpenAd.AppOpenAdLoadCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f18695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ vj0 f18696b;

    public pj0(vj0 vj0Var, String str) {
        this.f18695a = str;
        Objects.requireNonNull(vj0Var);
        this.f18696b = vj0Var;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f18696b.y1(vj0.B1(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        String str = this.f18695a;
        this.f18696b.x1(appOpenAd, str);
    }
}
