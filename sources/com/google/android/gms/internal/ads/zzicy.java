package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzicy implements Map.Entry, Comparable {
    final /* synthetic */ zzidb zza;
    private final Comparable zzb;
    private Object zzc;

    public zzicy(zzidb zzidbVar, Comparable comparable, Object obj) {
        Objects.requireNonNull(zzidbVar);
        this.zza = zzidbVar;
        this.zzb = comparable;
        this.zzc = obj;
    }

    private static final boolean zzb(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.zzb.compareTo(((zzicy) obj).zzb);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return zzb(this.zzb, entry.getKey()) && zzb(this.zzc, entry.getValue());
    }

    @Override // java.util.Map.Entry
    public final /* synthetic */ Object getKey() {
        return this.zzb;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzc;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.zzb;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.zzc;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.zza.zzh();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String strValueOf2 = String.valueOf(this.zzc);
        return android.support.v4.media.a.s(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, d9.i.f24747b, strValueOf2);
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
