package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzctm implements zzijg {
    private final zzctj zza;

    private zzctm(zzctj zzctjVar) {
        this.zza = zzctjVar;
    }

    public static zzctm zzc(zzctj zzctjVar) {
        return new zzctm(zzctjVar);
    }

    public static zzfhs zzd(zzctj zzctjVar) {
        zzfhs zzfhsVarZzd = zzctjVar.zzd();
        zzijo.zzb(zzfhsVarZzd);
        return zzfhsVarZzd;
    }

    public final zzfhs zza() {
        return zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return zzd(this.zza);
    }
}
