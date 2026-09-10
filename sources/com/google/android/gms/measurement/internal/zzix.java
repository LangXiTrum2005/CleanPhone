package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzix implements Runnable {
    final /* synthetic */ zzir zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zziz zzc;

    public zzix(zziz zzizVar, zzir zzirVar, long j) {
        this.zzc = zzizVar;
        this.zza = zzirVar;
        this.zzb = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zzB(this.zza, false, this.zzb);
        zziz zzizVar = this.zzc;
        zzizVar.zza = null;
        zzizVar.zzt.zzt().zzG(null);
    }
}
