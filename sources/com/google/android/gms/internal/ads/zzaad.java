package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzaad {
    private zzaac zza;
    private zzaam zzb;

    public void zzb() {
        this.zza = null;
        this.zzb = null;
    }

    public boolean zzd() {
        throw null;
    }

    public void zze(zzd zzdVar) {
        throw null;
    }

    public zzmj zzg() {
        throw null;
    }

    public abstract void zzp(Object obj);

    public abstract zzaae zzq(zzmk[] zzmkVarArr, zzyh zzyhVar, zzwg zzwgVar, zzbf zzbfVar) throws zzit;

    public final void zzr(zzaac zzaacVar, zzaam zzaamVar) {
        zzgqa.zzi(this.zza == null);
        this.zza = zzaacVar;
        this.zzb = zzaamVar;
    }

    public final void zzs() {
        zzaac zzaacVar = this.zza;
        if (zzaacVar != null) {
            zzaacVar.zzq();
        }
    }

    public final zzaam zzt() {
        zzaam zzaamVar = this.zzb;
        zzaamVar.getClass();
        return zzaamVar;
    }
}
