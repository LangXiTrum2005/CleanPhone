package com.google.android.gms.internal.ads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class zzgrq extends AbstractCollection {
    final Object zza;
    Collection zzb;
    final zzgrq zzc;
    final Collection zzd;
    final /* synthetic */ zzgrt zze;

    public zzgrq(zzgrt zzgrtVar, Object obj, Collection collection, zzgrq zzgrqVar) {
        Objects.requireNonNull(zzgrtVar);
        this.zze = zzgrtVar;
        this.zza = obj;
        this.zzb = collection;
        this.zzc = zzgrqVar;
        this.zzd = zzgrqVar == null ? null : zzgrqVar.zzb;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        zza();
        boolean zIsEmpty = this.zzb.isEmpty();
        boolean zAdd = this.zzb.add(obj);
        if (zAdd) {
            zzgrt zzgrtVar = this.zze;
            zzgrtVar.zzq(zzgrtVar.zzp() + 1);
            if (zIsEmpty) {
                zzc();
                return true;
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zAddAll = this.zzb.addAll(collection);
        if (!zAddAll) {
            return zAddAll;
        }
        int size2 = this.zzb.size();
        zzgrt zzgrtVar = this.zze;
        zzgrtVar.zzq(zzgrtVar.zzp() + (size2 - size));
        if (size != 0) {
            return zAddAll;
        }
        zzc();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.zzb.clear();
        zzgrt zzgrtVar = this.zze;
        zzgrtVar.zzq(zzgrtVar.zzp() - size);
        zzb();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        zza();
        return this.zzb.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        zza();
        return this.zzb.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        zza();
        return this.zzb.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        zza();
        return this.zzb.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        zza();
        return new zzgrp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        zza();
        boolean zRemove = this.zzb.remove(obj);
        if (zRemove) {
            zzgrt zzgrtVar = this.zze;
            zzgrtVar.zzq(zzgrtVar.zzp() - 1);
            zzb();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean zRemoveAll = this.zzb.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.zzb.size();
            zzgrt zzgrtVar = this.zze;
            zzgrtVar.zzq(zzgrtVar.zzp() + (size2 - size));
            zzb();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        int size = size();
        boolean zRetainAll = this.zzb.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.zzb.size();
            zzgrt zzgrtVar = this.zze;
            zzgrtVar.zzq(zzgrtVar.zzp() + (size2 - size));
            zzb();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        zza();
        return this.zzb.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        zza();
        return this.zzb.toString();
    }

    public final void zza() {
        zzgrq zzgrqVar = this.zzc;
        if (zzgrqVar != null) {
            zzgrqVar.zza();
            if (zzgrqVar.zzb != this.zzd) {
                throw new ConcurrentModificationException();
            }
            return;
        }
        if (this.zzb.isEmpty()) {
            zzgrt zzgrtVar = this.zze;
            Collection collection = (Collection) zzgrtVar.zzo().get(this.zza);
            if (collection != null) {
                this.zzb = collection;
            }
        }
    }

    public final void zzb() {
        zzgrq zzgrqVar = this.zzc;
        if (zzgrqVar != null) {
            zzgrqVar.zzb();
        } else if (this.zzb.isEmpty()) {
            zzgrt zzgrtVar = this.zze;
            zzgrtVar.zzo().remove(this.zza);
        }
    }

    public final void zzc() {
        zzgrq zzgrqVar = this.zzc;
        if (zzgrqVar != null) {
            zzgrqVar.zzc();
            return;
        }
        zzgrt zzgrtVar = this.zze;
        zzgrtVar.zzo().put(this.zza, this.zzb);
    }
}
