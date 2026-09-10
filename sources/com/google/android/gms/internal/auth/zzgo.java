package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import com.p004ironsource.d9;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgo implements Map.Entry, Comparable {
    final /* synthetic */ zzgu zza;
    private final Comparable zzb;
    private Object zzc;

    public zzgo(zzgu zzguVar, Comparable comparable, Object obj) {
        this.zza = zzguVar;
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
        return this.zzb.compareTo(((zzgo) obj).zzb);
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
        this.zza.zzn();
        Object obj2 = this.zzc;
        this.zzc = obj;
        return obj2;
    }

    public final String toString() {
        return a.D(String.valueOf(this.zzb), d9.i.f24747b, String.valueOf(this.zzc));
    }

    public final Comparable zza() {
        return this.zzb;
    }
}
