package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zi0 implements gc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bundle f22628a = new Bundle();

    @Override // com.google.android.gms.internal.ads.gc0
    public final synchronized void a(String str, String str2) {
        this.f22628a.putInt(str, 3);
    }

    @Override // com.google.android.gms.internal.ads.gc0
    public final synchronized void b(String str) {
        this.f22628a.putInt(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.gc0
    public final synchronized void zza(String str) {
        this.f22628a.putInt(str, 1);
    }

    @Override // com.google.android.gms.internal.ads.gc0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.gc0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.gc0
    public final void f(String str) {
    }
}
