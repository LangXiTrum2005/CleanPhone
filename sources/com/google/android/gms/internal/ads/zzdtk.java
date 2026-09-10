package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdtk implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;
    private final zzijp zzc;

    private zzdtk(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
        this.zzc = zzijpVar3;
    }

    public static zzdtk zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzdtk(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        int i2 = ((zzdab) this.zzc).zza().zzp.zza;
        if (i2 != 0) {
            return i2 + (-1) != 0 ? ((zzeoj) this.zzb).zzb() : ((zzeoj) this.zza).zzb();
        }
        throw null;
    }
}
