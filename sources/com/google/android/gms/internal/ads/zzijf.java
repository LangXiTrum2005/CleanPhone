package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijf implements zzijp, zzija {
    private static final Object zza = new Object();
    private volatile zzijp zzb;
    private volatile Object zzc = zza;

    private zzijf(zzijp zzijpVar) {
        this.zzb = zzijpVar;
    }

    public static zzijp zza(zzijp zzijpVar) {
        return zzijpVar instanceof zzijf ? zzijpVar : new zzijf(zzijpVar);
    }

    public static zzija zzc(zzijp zzijpVar) {
        if (zzijpVar instanceof zzija) {
            return (zzija) zzijpVar;
        }
        zzijpVar.getClass();
        return new zzijf(zzijpVar);
    }

    private final synchronized Object zzd() {
        try {
            Object obj = this.zzc;
            Object obj2 = zza;
            if (obj != obj2) {
                return obj;
            }
            Object objZzb = this.zzb.zzb();
            Object obj3 = this.zzc;
            if (obj3 != obj2 && obj3 != objZzb) {
                throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + objZzb + ". This is likely due to a circular dependency.");
            }
            this.zzc = objZzb;
            this.zzb = null;
            return objZzb;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final Object zzb() {
        Object obj = this.zzc;
        return obj == zza ? zzd() : obj;
    }
}
