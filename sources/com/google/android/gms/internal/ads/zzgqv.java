package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqv implements zzgqs {
    private static final zzgqs zzb = zzgqu.zza;
    private final zzgqz zza = new zzgqz();
    private volatile zzgqs zzc;
    private Object zzd;

    public zzgqv(zzgqs zzgqsVar) {
        this.zzc = zzgqsVar;
    }

    public final String toString() {
        Object objS = this.zzc;
        if (objS == zzb) {
            String strValueOf = String.valueOf(this.zzd);
            objS = android.support.v4.media.a.s(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        }
        String strValueOf2 = String.valueOf(objS);
        return android.support.v4.media.a.s(new StringBuilder(strValueOf2.length() + 19), "Suppliers.memoize(", strValueOf2, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final Object zza() {
        zzgqs zzgqsVar = this.zzc;
        zzgqs zzgqsVar2 = zzb;
        if (zzgqsVar != zzgqsVar2) {
            synchronized (this.zza) {
                try {
                    if (this.zzc != zzgqsVar2) {
                        Object objZza = this.zzc.zza();
                        this.zzd = objZza;
                        this.zzc = zzgqsVar2;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzd;
    }
}
