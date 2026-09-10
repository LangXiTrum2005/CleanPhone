package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdjq implements zzijg {
    private final zzijp zza;
    private final zzijp zzb;

    private zzdjq(zzijp zzijpVar, zzijp zzijpVar2) {
        this.zza = zzijpVar;
        this.zzb = zzijpVar2;
    }

    public static zzdjq zza(zzijp zzijpVar, zzijp zzijpVar2) {
        return new zzdjq(zzijpVar, zzijpVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzdjp((zzdum) this.zza.zzb(), ((zzcwd) this.zzb).zza());
    }
}
