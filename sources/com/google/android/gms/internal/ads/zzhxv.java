package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhxv extends AbstractSet {
    final /* synthetic */ zzhya zza;

    public zzhxv(zzhya zzhyaVar) {
        Objects.requireNonNull(zzhyaVar);
        this.zza = zzhyaVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return (obj instanceof Map.Entry) && this.zza.zzc((Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzhxu(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        zzhya zzhyaVar;
        zzhxz zzhxzVarZzc;
        if (!(obj instanceof Map.Entry) || (zzhxzVarZzc = (zzhyaVar = this.zza).zzc((Map.Entry) obj)) == null) {
            return false;
        }
        zzhyaVar.zzd(zzhxzVarZzc, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
