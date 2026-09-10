package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzr;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f20105c;

    public t0() {
        this.f20103a = 0;
        this.f20104b = 0;
        this.f20105c = 0;
    }

    public static t0 a(zzr zzrVar) {
        if (zzrVar.zzd) {
            return new t0(3, 0, 0);
        }
        if (zzrVar.zzi) {
            return new t0(2, 0, 0);
        }
        return zzrVar.zzh ? new t0(0, 0, 0) : new t0(1, zzrVar.zzf, zzrVar.zzc);
    }

    public boolean b() {
        return this.f20103a == 3;
    }

    public t0(int i10, int i11, int i12) {
        this.f20103a = i10;
        this.f20105c = i11;
        this.f20104b = i12;
    }

    public /* synthetic */ t0(int i10, int i11, int i12, boolean z10) {
        this.f20103a = i10;
        this.f20104b = i11;
        this.f20105c = i12;
    }
}
