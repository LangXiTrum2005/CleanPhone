package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.b01;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
final class zzh implements b01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzk f11192a;

    public zzh(zzk zzkVar) {
        this.f11192a = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.b01
    public final void zza(int i10, long j10) {
        this.f11192a.f11205h.b(i10, System.currentTimeMillis() - j10);
    }

    @Override // com.google.android.gms.internal.ads.b01
    public final void zzb(int i10, long j10, String str) {
        this.f11192a.f11205h.e(i10, System.currentTimeMillis() - j10, null, null, str);
    }
}
