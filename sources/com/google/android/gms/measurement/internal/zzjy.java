package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzjy implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzlj zzb;

    public zzjy(zzlj zzljVar, boolean z2) {
        this.zza = z2;
        Objects.requireNonNull(zzljVar);
        this.zzb = zzljVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzlj zzljVar = this.zzb;
        zzic zzicVar = zzljVar.zzu;
        boolean zZzB = zzicVar.zzB();
        boolean zZzA = zzicVar.zzA();
        boolean z2 = this.zza;
        zzicVar.zzz(z2);
        if (zZzA == z2) {
            zzicVar.zzaV().zzk().zzb("Default data collection state already set to", Boolean.valueOf(z2));
        }
        if (zzicVar.zzB() == zZzB || zzicVar.zzB() != zzicVar.zzA()) {
            zzicVar.zzaV().zzh().zzc("Default data collection is different than actual status", Boolean.valueOf(z2), Boolean.valueOf(zZzB));
        }
        zzljVar.zzal();
    }
}
