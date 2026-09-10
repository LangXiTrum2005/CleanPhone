package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaft implements zzaeo {
    private final int zza;
    private final int zzb;
    private final String zzc;
    private int zzd;
    private int zze;
    private zzaer zzf;
    private zzaga zzg;

    public zzaft(int i2, int i3, String str) {
        this.zza = i2;
        this.zzb = i3;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final boolean zza(zzaep zzaepVar) throws IOException {
        int i2 = this.zza;
        zzgqa.zzi((i2 == -1 || this.zzb == -1) ? false : true);
        int i3 = this.zzb;
        zzer zzerVar = new zzer(i3);
        ((zzaef) zzaepVar).zzh(zzerVar.zzi(), 0, i3, false);
        return zzerVar.zzt() == i2;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzc(zzaer zzaerVar) {
        this.zzf = zzaerVar;
        zzaga zzagaVarZzu = zzaerVar.zzu(1024, 4);
        this.zzg = zzagaVarZzu;
        zzt zztVar = new zzt();
        String str = this.zzc;
        zztVar.zzl(str);
        zztVar.zzm(str);
        zzagaVarZzu.zzu(zztVar.zzM());
        this.zzf.zzv();
        this.zzf.zzw(new zzafu(-9223372036854775807L));
        this.zze = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final int zzd(zzaep zzaepVar, zzafo zzafoVar) throws IOException {
        int i2 = this.zze;
        if (i2 != 1) {
            if (i2 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        zzaga zzagaVar = this.zzg;
        zzagaVar.getClass();
        int iZzy = zzagaVar.zzy(zzaepVar, 1024, true);
        if (iZzy == -1) {
            this.zze = 2;
            this.zzg.zzx(0L, 1, this.zzd, 0, null);
            this.zzd = 0;
        } else {
            this.zzd += iZzy;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zze(long j, long j2) {
        if (j == 0 || this.zze == 1) {
            this.zze = 1;
            this.zzd = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeo
    public final void zzf() {
    }
}
