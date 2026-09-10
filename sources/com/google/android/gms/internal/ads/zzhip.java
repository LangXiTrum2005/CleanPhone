package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhip {
    public static final zzhip zza = new zzhio().zza();
    private final Map zzb;

    public final boolean equals(Object obj) {
        if (obj instanceof zzhip) {
            return this.zzb.equals(((zzhip) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode();
    }

    public final String toString() {
        return this.zzb.toString();
    }

    public final boolean zza() {
        return this.zzb.isEmpty();
    }
}
