package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyw implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzeyw(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzeyw zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzeyw(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzeyu((String) this.zza.zzb(), ((Integer) this.zzb.zzb()).intValue());
    }
}
