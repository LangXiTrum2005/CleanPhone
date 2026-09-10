package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzhxz implements Map.Entry {
    zzhxz zza;
    zzhxz zzb;
    zzhxz zzc;
    zzhxz zzd;
    zzhxz zze;
    final Object zzf;
    final boolean zzg;
    Object zzh;
    int zzi;

    public zzhxz(boolean z2) {
        this.zzf = null;
        this.zzg = z2;
        this.zze = this;
        this.zzd = this;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = this.zzf;
            if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                Object obj3 = this.zzh;
                if (obj3 == null) {
                    if (entry.getValue() == null) {
                        return true;
                    }
                } else if (obj3.equals(entry.getValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.zzf;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.zzh;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object obj = this.zzf;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.zzh;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj == null && !this.zzg) {
            throw new NullPointerException("value == null");
        }
        Object obj2 = this.zzh;
        this.zzh = obj;
        return obj2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzf);
        String strValueOf2 = String.valueOf(this.zzh);
        return android.support.v4.media.a.s(new StringBuilder(strValueOf.length() + 1 + strValueOf2.length()), strValueOf, d9.i.f24747b, strValueOf2);
    }

    public zzhxz(boolean z2, zzhxz zzhxzVar, Object obj, zzhxz zzhxzVar2, zzhxz zzhxzVar3) {
        this.zza = zzhxzVar;
        this.zzf = obj;
        this.zzg = z2;
        this.zzi = 1;
        this.zzd = zzhxzVar2;
        this.zze = zzhxzVar3;
        zzhxzVar3.zzd = this;
        zzhxzVar2.zze = this;
    }
}
