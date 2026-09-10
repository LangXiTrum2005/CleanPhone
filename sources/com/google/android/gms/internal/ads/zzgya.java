package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzgya extends zzgxo {
    private zzgxz zza;

    public zzgya(zzgsz zzgszVar, boolean z2, Executor executor, Callable callable) {
        super(zzgszVar, z2, false);
        this.zza = new zzgxy(this, callable, executor);
        zze();
    }

    @Override // com.google.android.gms.internal.ads.zzgxo
    public final void zzA(int i2) {
        super.zzA(i2);
        if (i2 == 1) {
            this.zza = null;
        }
    }

    public final /* synthetic */ void zzD(zzgxz zzgxzVar) {
        this.zza = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgxf
    public final void zzi() {
        zzgxz zzgxzVar = this.zza;
        if (zzgxzVar != null) {
            zzgxzVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgxo
    public final void zzw(int i2, Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzgxo
    public final void zzx() {
        zzgxz zzgxzVar = this.zza;
        if (zzgxzVar != null) {
            zzgxzVar.zze();
        }
    }
}
