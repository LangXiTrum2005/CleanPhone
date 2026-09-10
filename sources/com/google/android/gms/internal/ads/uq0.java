package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class uq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20862b;

    public uq0(double d10, boolean z10) {
        this.f20861a = d10;
        this.f20862b = z10;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle bundleB = rb0.b(bundle, X3.i.G);
        bundle.putBundle(X3.i.G, bundleB);
        Bundle bundleB2 = rb0.b(bundleB, "battery");
        bundleB.putBundle("battery", bundleB2);
        bundleB2.putBoolean("is_charging", this.f20862b);
        bundleB2.putDouble("battery_level", this.f20861a);
    }
}
