package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgqw {
    public static zzgqs zza(zzgqs zzgqsVar) {
        if ((zzgqsVar instanceof zzgqv) || (zzgqsVar instanceof zzgqt)) {
            return zzgqsVar;
        }
        return zzgqsVar instanceof Serializable ? new zzgqt(zzgqsVar) : new zzgqv(zzgqsVar);
    }
}
