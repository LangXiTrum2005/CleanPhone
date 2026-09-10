package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zziaa {
    private final Object zza;
    private final int zzb;

    public zziaa(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zziaa)) {
            return false;
        }
        zziaa zziaaVar = (zziaa) obj;
        return this.zza == zziaaVar.zza && this.zzb == zziaaVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
