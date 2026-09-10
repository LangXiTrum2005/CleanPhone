package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhxi extends zzhxj implements Iterable {
    private final ArrayList zza = new ArrayList();

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhxi) && ((zzhxi) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final void zza(zzhxj zzhxjVar) {
        this.zza.add(zzhxjVar);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final zzhxj zzc(int i2) {
        return (zzhxj) this.zza.get(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhxj
    public final String zzd() {
        ArrayList arrayList = this.zza;
        int size = arrayList.size();
        if (size == 1) {
            return ((zzhxj) arrayList.get(0)).zzd();
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.g(size, "Array must have size 1, but has size ", new StringBuilder(String.valueOf(size).length() + 37)));
    }
}
