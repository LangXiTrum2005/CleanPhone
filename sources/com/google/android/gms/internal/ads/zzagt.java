package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzagt implements zzaeo {
    private final zzer zza = new zzer(4);
    private final zzaft zzb = new zzaft(-1, -1, "image/avif");

    private final boolean zzh(zzaep zzaepVar, int i2) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        ((zzaef) zzaepVar).zzh(zzerVar.zzi(), 0, 4, false);
        return zzerVar.zzz() == ((long) i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        ((zzaef) zzaepVar).zzj(4, false);
        return zzh(zzaepVar, 1718909296) && zzh(zzaepVar, 1635150182);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzb.zzc(zzaerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        return this.zzb.zzd(zzaepVar, zzafoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
