package com.google.android.gms.internal.ads;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzapj {
    private final List zza;
    private final zzaga[] zzc;
    private final String zzb = "video/mp2t";
    private final zzgq zzd = new zzgq(new zzgp() { // from class: com.google.android.gms.internal.ads.zzapi
        @Override // com.google.android.gms.internal.ads.zzgp
        public final /* synthetic */ void zza(long j, zzer zzerVar) {
            this.zza.zzf(j, zzerVar);
        }
    });

    public zzapj(List list, String str) {
        this.zza = list;
        this.zzc = new zzaga[list.size()];
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
            String strZzc = zzvVar.zza;
            if (strZzc == null) {
                strZzc = zzapuVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(strZzc);
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

    public final void zzb(int i2) {
        this.zzd.zza(i2);
    }

    public final void zzc(long j, zzer zzerVar) {
        this.zzd.zzc(j, zzerVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    public final /* synthetic */ void zzf(long j, zzer zzerVar) {
        zzaeb.zza(j, zzerVar, this.zzc);
    }
}
