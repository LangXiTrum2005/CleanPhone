package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class xr0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f21979a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f21980b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f21981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f21982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f21984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f21985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f21986h;

    public xr0(boolean z10, boolean z11, String str, boolean z12, int i10, int i11, int i12, String str2) {
        this.f21979a = z10;
        this.f21980b = z11;
        this.f21981c = str;
        this.f21982d = z12;
        this.f21983e = i10;
        this.f21984f = i11;
        this.f21985g = i12;
        this.f21986h = str2;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f21981c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) zzba.zzc().a(am.M4));
        bundle.putInt("target_api", this.f21983e);
        bundle.putInt("dv", this.f21984f);
        bundle.putInt("lv", this.f21985g);
        if (((Boolean) zzba.zzc().a(am.Z6)).booleanValue()) {
            String str = this.f21986h;
            if (!TextUtils.isEmpty(str)) {
                bundle.putString("ev", str);
            }
        }
        Bundle bundleB = rb0.b(bundle, "sdk_env");
        bundleB.putBoolean("mf", ((Boolean) fn.f14469g.o()).booleanValue());
        bundleB.putBoolean("instant_app", this.f21979a);
        bundleB.putBoolean("lite", this.f21980b);
        bundleB.putBoolean("is_privileged_process", this.f21982d);
        bundle.putBundle("sdk_env", bundleB);
        Bundle bundleB2 = rb0.b(bundleB, "build_meta");
        bundleB2.putString("cl", "910357297");
        bundleB2.putString("rapid_rc", "dev");
        bundleB2.putString("rapid_rollup", "HEAD");
        bundleB.putBundle("build_meta", bundleB2);
    }
}
