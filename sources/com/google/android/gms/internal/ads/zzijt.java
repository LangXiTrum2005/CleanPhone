package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijt implements zzijp {
    private static final Object zza = new Object();
    private volatile zzijp zzb;
    private volatile Object zzc = zza;

    private zzijt(zzijp zzijpVar) {
        this.zzb = zzijpVar;
    }

    public static zzijp zza(zzijp zzijpVar) {
        return ((zzijpVar instanceof zzijt) || (zzijpVar instanceof zzijf)) ? zzijpVar : new zzijt(zzijpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzijp zzijpVar = this.zzb;
        if (zzijpVar == null) {
            return this.zzc;
        }
        Object objZzb = zzijpVar.zzb();
        this.zzc = objZzb;
        this.zzb = null;
        return objZzb;
    }
}
