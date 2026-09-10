package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class qj0 extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f19107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BaseAdView f19108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vj0 f19109c;

    public qj0(vj0 vj0Var, String str, BaseAdView baseAdView) {
        this.f19107a = str;
        this.f19108b = baseAdView;
        Objects.requireNonNull(vj0Var);
        this.f19109c = vj0Var;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f19109c.y1(vj0.B1(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        String str = this.f19107a;
        this.f19109c.x1(this.f19108b, str);
    }
}
