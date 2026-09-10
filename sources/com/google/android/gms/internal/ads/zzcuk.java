package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcuk implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzcuk(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        this.zza = zzijpVar2;
        this.zzb = zzijpVar3;
    }

    public static zzcuk zza(zzijp zzijpVar, zzijp zzijpVar2, zzijp zzijpVar3) {
        return new zzcuk(zzijpVar, zzijpVar2, zzijpVar3);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* synthetic */ Object zzb() {
        return true == Boolean.valueOf(zzcui.zza()).booleanValue() ? ((zzemk) this.zza).zzb() : ((zzeoj) this.zzb).zzb();
    }
}
