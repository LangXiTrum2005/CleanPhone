package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sq0 implements as0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f20029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f20030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f20031k;

    public sq0(int i10, boolean z10, boolean z11, int i11, int i12, int i13, int i14, int i15, float f10, boolean z12, boolean z13) {
        this.f20021a = i10;
        this.f20022b = z10;
        this.f20023c = z11;
        this.f20024d = i11;
        this.f20025e = i12;
        this.f20026f = i13;
        this.f20027g = i14;
        this.f20028h = i15;
        this.f20029i = f10;
        this.f20030j = z12;
        this.f20031k = z13;
    }

    @Override // com.google.android.gms.internal.ads.as0
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) zzba.zzc().a(am.Ec)).booleanValue()) {
            bundle.putInt("muv_min", this.f20025e);
            bundle.putInt("muv_max", this.f20026f);
        }
        bundle.putFloat("android_app_volume", this.f20029i);
        bundle.putBoolean("android_app_muted", this.f20030j);
        if (this.f20031k) {
            return;
        }
        bundle.putInt("am", this.f20021a);
        bundle.putBoolean("ma", this.f20022b);
        bundle.putBoolean("sp", this.f20023c);
        bundle.putInt("muv", this.f20024d);
        bundle.putInt("rm", this.f20027g);
        bundle.putInt("riv", this.f20028h);
    }
}
