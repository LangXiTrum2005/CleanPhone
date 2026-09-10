package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzajx implements zzaju {
    private final int zza;
    private final int zzb;
    private final zzer zzc;

    public zzajx(zzfv zzfvVar, zzv zzvVar) {
        zzer zzerVar = zzfvVar.zza;
        this.zzc = zzerVar;
        zzerVar.zzh(12);
        int iZzH = zzerVar.zzH();
        if ("audio/raw".equals(zzvVar.zzo)) {
            int iZzD = zzfj.zzD(zzvVar.zzI) * zzvVar.zzG;
            if (iZzH == 0 || iZzH % iZzD != 0) {
                zzee.zzc("BoxParsers", p005e.a.a(new StringBuilder(String.valueOf(iZzD).length() + 66 + String.valueOf(iZzH).length()), iZzD, "Audio sample size mismatch. stsd sample size: ", iZzH, ", stsz sample size: "));
                iZzH = iZzD;
            }
        }
        this.zza = iZzH == 0 ? -1 : iZzH;
        this.zzb = zzerVar.zzH();
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final int zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final int zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzaju
    public final int zzc() {
        int i2 = this.zza;
        return i2 == -1 ? this.zzc.zzH() : i2;
    }
}
