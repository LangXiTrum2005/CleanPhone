package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqt implements Serializable, zzgqs {
    final zzgqs zza;
    volatile transient boolean zzb;
    transient Object zzc;
    private final transient zzgqz zzd = new zzgqz();

    public zzgqt(zzgqs zzgqsVar) {
        this.zza = zzgqsVar;
    }

    public final String toString() {
        Object objS;
        if (this.zzb) {
            String strValueOf = String.valueOf(this.zzc);
            objS = android.support.v4.media.a.s(new StringBuilder(strValueOf.length() + 25), "<supplier that returned ", strValueOf, ">");
        } else {
            objS = this.zza;
        }
        String string = objS.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 19), "Suppliers.memoize(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgqs
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this.zzd) {
                try {
                    if (!this.zzb) {
                        Object objZza = this.zza.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        return objZza;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.zzc;
    }
}
