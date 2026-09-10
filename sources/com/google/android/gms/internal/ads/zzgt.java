package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgt implements zzhb {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzhf zzd;

    public zzgt(boolean z2) {
        this.zza = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzhb
    public final void zze(zzhz zzhzVar) {
        zzhzVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhzVar)) {
            return;
        }
        arrayList.add(zzhzVar);
        this.zzc++;
    }

    public final void zzf(zzhf zzhfVar) {
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhz) this.zzb.get(i2)).zza(this, zzhfVar, this.zza);
        }
    }

    public final void zzg(zzhf zzhfVar) {
        this.zzd = zzhfVar;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhz) this.zzb.get(i2)).zzb(this, zzhfVar, this.zza);
        }
    }

    public final void zzh(int i2) {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzhz) this.zzb.get(i3)).zzc(this, zzhfVar, this.zza, i2);
        }
    }

    public final void zzi() {
        zzhf zzhfVar = this.zzd;
        String str = zzfj.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzhz) this.zzb.get(i2)).zzd(this, zzhfVar, this.zza);
        }
        this.zzd = null;
    }
}
