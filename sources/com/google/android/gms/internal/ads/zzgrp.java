package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
class zzgrp implements Iterator {
    final Iterator zza;
    final Collection zzb;
    final /* synthetic */ zzgrq zzc;

    public zzgrp(zzgrq zzgrqVar) {
        Objects.requireNonNull(zzgrqVar);
        this.zzc = zzgrqVar;
        Collection collection = zzgrqVar.zzb;
        this.zzb = collection;
        this.zza = collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        zzgrq zzgrqVar = this.zzc;
        zzgrt zzgrtVar = zzgrqVar.zze;
        zzgrtVar.zzq(zzgrtVar.zzp() - 1);
        zzgrqVar.zzb();
    }

    public final void zza() {
        zzgrq zzgrqVar = this.zzc;
        zzgrqVar.zza();
        if (zzgrqVar.zzb != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public zzgrp(zzgrq zzgrqVar, Iterator it) {
        Objects.requireNonNull(zzgrqVar);
        this.zzc = zzgrqVar;
        this.zzb = zzgrqVar.zzb;
        this.zza = it;
    }
}
