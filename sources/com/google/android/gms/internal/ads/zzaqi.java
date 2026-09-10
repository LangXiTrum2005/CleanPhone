package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaqi implements zzaeo {
    private final zzer zza = new zzer(4);
    private final zzaft zzb = new zzaft(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        zzer zzerVar = this.zza;
        zzerVar.zza(4);
        zzaef zzaefVar = (zzaef) zzaepVar;
        zzaefVar.zzh(zzerVar.zzi(), 0, 4, false);
        if (zzerVar.zzz() == 1380533830) {
            zzaefVar.zzj(4, false);
            zzerVar.zza(4);
            zzaefVar.zzh(zzerVar.zzi(), 0, 4, false);
            if (zzerVar.zzz() == 1464156752) {
                return true;
            }
        }
        return false;
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
