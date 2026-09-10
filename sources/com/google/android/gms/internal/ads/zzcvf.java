package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcvf implements zzijg {
    private final zzcvc zza;

    private zzcvf(zzcvc zzcvcVar) {
        this.zza = zzcvcVar;
    }

    public static zzcvf zzc(zzcvc zzcvcVar) {
        return new zzcvf(zzcvcVar);
    }

    public static zzddl zzd(zzcvc zzcvcVar) {
        return zzcvcVar.zza();
    }

    public final zzddl zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
