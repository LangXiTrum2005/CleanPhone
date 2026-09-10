package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.ironsource.O6;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class es0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f14062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f14064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14066f;

    public es0(String str, int i10, int i11, int i12, boolean z10, int i13) {
        this.f14061a = str;
        this.f14062b = i10;
        this.f14063c = i11;
        this.f14064d = i12;
        this.f14065e = z10;
        this.f14066f = i13;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f14061a;
        rb0.r(bundle, O6.R0, str, !TextUtils.isEmpty(str));
        int i10 = this.f14062b;
        rb0.x(bundle, "cnt", i10, i10 != -2);
        bundle.putInt("gnt", this.f14063c);
        bundle.putInt("pt", this.f14064d);
        Bundle bundleB = rb0.b(bundle, X3.i.G);
        bundle.putBundle(X3.i.G, bundleB);
        Bundle bundleB2 = rb0.b(bundleB, "network");
        bundleB.putBundle("network", bundleB2);
        bundleB2.putInt("active_network_state", this.f14066f);
        bundleB2.putBoolean("active_network_metered", this.f14065e);
    }
}
