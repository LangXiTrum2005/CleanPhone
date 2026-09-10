package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdn {
    public static zzdj zza(zzdj zzdjVar) {
        if ((zzdjVar instanceof zzdl) || (zzdjVar instanceof zzdk)) {
            return zzdjVar;
        }
        return zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdl(zzdjVar);
    }

    public static zzdj zzb(Object obj) {
        return new zzdm(obj);
    }
}
