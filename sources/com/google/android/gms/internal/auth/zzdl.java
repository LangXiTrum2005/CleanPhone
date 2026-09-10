package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
final class zzdl implements zzdj {

    @CheckForNull
    volatile zzdj zza;
    volatile boolean zzb;

    @CheckForNull
    Object zzc;

    public zzdl(zzdj zzdjVar) {
        zzdjVar.getClass();
        this.zza = zzdjVar;
    }

    public final String toString() {
        Object objQ = this.zza;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (objQ == null) {
            objQ = a.q(new StringBuilder("<supplier that returned "), this.zzc, ">");
        }
        return a.q(sb, objQ, ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdj
    public final Object zza() {
        if (!this.zzb) {
            synchronized (this) {
                try {
                    if (!this.zzb) {
                        zzdj zzdjVar = this.zza;
                        zzdjVar.getClass();
                        Object objZza = zzdjVar.zza();
                        this.zzc = objZza;
                        this.zzb = true;
                        this.zza = null;
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
