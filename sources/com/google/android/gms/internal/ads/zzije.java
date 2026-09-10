package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzije implements zzijg {
    private zzijp zza;

    public static void zza(zzijp zzijpVar, zzijp zzijpVar2) {
        zzije zzijeVar = (zzije) zzijpVar;
        if (zzijeVar.zza != null) {
            throw new IllegalStateException();
        }
        zzijeVar.zza = zzijpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final Object zzb() {
        zzijp zzijpVar = this.zza;
        if (zzijpVar != null) {
            return zzijpVar.zzb();
        }
        throw new IllegalStateException();
    }
}
