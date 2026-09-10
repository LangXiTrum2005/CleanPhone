package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
final class zzapy {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaga[] zzc;
    private final zzgq zzd;

    public zzapy(List list, String str) {
        this.zza = list;
        this.zzc = new zzaga[list.size()];
        zzgq zzgqVar = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzapx
            @Override // com.google.android.gms.internal.ads.zzgp
            public final /* synthetic */ void zza(long j, zzer zzerVar) {
                this.zza.zzc(j, zzerVar);
            }
        });
        this.zzd = zzgqVar;
        zzgqVar.zza(3);
    }

    public final void zza(zzaer zzaerVar, zzapu zzapuVar) {
        int i2 = 0;
        while (true) {
            zzaga[] zzagaVarArr = this.zzc;
            if (i2 >= zzagaVarArr.length) {
                return;
            }
            zzapuVar.zza();
            zzaga zzagaVarZzu = zzaerVar.zzu(zzapuVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i2);
            String str = zzvVar.zzo;
            boolean z2 = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z2 = false;
            }
            zzgqa.zzf(z2, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzapuVar.zzc());
            zztVar.zzl(this.zzb);
            zztVar.zzm(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzJ(zzvVar.zzL);
            zztVar.zzp(zzvVar.zzr);
            zzagaVarZzu.zzu(zztVar.zzM());
            zzagaVarArr[i2] = zzagaVarZzu;
            i2++;
        }
    }

    public final void zzb(long j, zzer zzerVar) {
        if (zzerVar.zzd() < 9) {
            return;
        }
        int iZzB = zzerVar.zzB();
        int iZzB2 = zzerVar.zzB();
        int iZzs = zzerVar.zzs();
        if (iZzB == 434 && iZzB2 == 1195456820 && iZzs == 3) {
            this.zzd.zzc(j, zzerVar);
        }
    }

    public final /* synthetic */ void zzc(long j, zzer zzerVar) {
        zzaeb.zzb(j, zzerVar, this.zzc);
    }
}
