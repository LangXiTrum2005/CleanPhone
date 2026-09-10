package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzaof implements zzaog {
    private final List zza;
    private final zzaga[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzaof(List list, String str) {
        this.zza = list;
        this.zzc = new zzaga[list.size()];
    }

    private final boolean zzf(zzer zzerVar, int i2) {
        if (zzerVar.zzd() == 0) {
            return false;
        }
        if (zzerVar.zzs() != i2) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzb(zzaer zzaerVar, zzapu zzapuVar) {
        int i2 = 0;
        while (true) {
            zzaga[] zzagaVarArr = this.zzc;
            if (i2 >= zzagaVarArr.length) {
                return;
            }
            zzapr zzaprVar = (zzapr) this.zza.get(i2);
            zzapuVar.zza();
            zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 3);
            zzt zztVar = new zzt();
            zztVar.zza(zzapuVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm("application/dvbsubs");
            zztVar.zzp(Collections.singletonList(zzaprVar.zzb));
            zztVar.zze(zzaprVar.zza);
            zzagaVarZzu.zzu(zztVar.zzM());
            zzagaVarArr[i2] = zzagaVarZzu;
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzc(long j, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zzd(zzer zzerVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzerVar, 32)) {
                if (this.zze != 1 || zzf(zzerVar, 0)) {
                    int iZzg = zzerVar.zzg();
                    int iZzd = zzerVar.zzd();
                    for (zzaga zzagaVar : this.zzc) {
                        zzerVar.zzh(iZzg);
                        zzagaVar.zzz(zzerVar, iZzd);
                    }
                    this.zzf += iZzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaog
    public final void zze(boolean z2) {
        if (this.zzd) {
            zzgqa.zzi(this.zzg != -9223372036854775807L);
            for (zzaga zzagaVar : this.zzc) {
                zzagaVar.zzx(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
