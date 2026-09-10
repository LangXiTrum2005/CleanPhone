package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ez {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzg f14115a;

    public ez(zzg zzgVar) {
        this.f14115a = zzgVar;
    }

    public final void a(int i10, long j10) {
        if (((Boolean) zzba.zzc().a(am.f12204j1)).booleanValue()) {
            return;
        }
        zzg zzgVar = this.f14115a;
        if (j10 - zzgVar.zzF() < 0) {
            zze.zza("Receiving npa decision in the past, ignoring.");
            return;
        }
        if (((Boolean) zzba.zzc().a(am.f12220k1)).booleanValue()) {
            zzgVar.zzE(i10);
            zzgVar.zzG(j10);
        } else {
            zzgVar.zzE(-1);
            zzgVar.zzG(j10);
        }
    }
}
