package com.google.android.gms.internal.ads;

import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxl extends zzhxj {
    private final zzhya zza = new zzhya(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhxl) && ((zzhxl) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(String str, zzhxj zzhxjVar) {
        this.zza.put(str, zzhxjVar);
    }

    public final Set zzb() {
        return this.zza.entrySet();
    }

    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    public final zzhxj zzh(String str) {
        return (zzhxj) this.zza.get(str);
    }
}
