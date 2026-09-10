package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class zzlq {
    private final Object zza;
    private final int zzb;

    public zzlq(Object obj, int i2) {
        this.zza = obj;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlq)) {
            return false;
        }
        zzlq zzlqVar = (zzlq) obj;
        return this.zza == zzlqVar.zza && this.zzb == zzlqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
