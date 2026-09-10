package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzglt implements zzgls {
    private final zzija zza;
    private final zzgnc zzb;
    private final long zzc;

    public zzglt(zzija zzijaVar, zzgnc zzgncVar, zzfzm zzfzmVar, long j) {
        this.zza = zzijaVar;
        this.zzb = zzgncVar;
        this.zzc = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final boolean zza(zzgcs zzgcsVar) {
        if (zzgcsVar == null || zzgcsVar.equals(zzgcs.zzg())) {
            this.zzb.zzb(15104);
            return true;
        }
        if (zzgcsVar.zzc() != this.zza.zzb()) {
            this.zzb.zzb(15105);
            return true;
        }
        boolean z2 = (zzgcsVar.zza().zzc() * 1000) - System.currentTimeMillis() <= this.zzc;
        if (z2) {
            this.zzb.zzb(15106);
        }
        return z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgls
    public final boolean zzb(zzgcs zzgcsVar) {
        if (zzgcsVar == null || zzgcsVar.equals(zzgcs.zzg())) {
            this.zzb.zzb(15102);
            return false;
        }
        if (zzgcsVar.zzc() == this.zza.zzb()) {
            return true;
        }
        this.zzb.zzb(15103);
        return false;
    }
}
