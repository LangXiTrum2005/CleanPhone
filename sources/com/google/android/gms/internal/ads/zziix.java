package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class zziix extends AbstractList {
    private static final zziiy zzc = zziiy.zzb(zziix.class);
    final List zza;
    final Iterator zzb;

    public zziix(List list, Iterator it) {
        this.zza = list;
        this.zzb = it;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        List list = this.zza;
        if (list.size() > i2) {
            return list.get(i2);
        }
        Iterator it = this.zzb;
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        list.add(it.next());
        return get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new zziiw(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        zziiy zziiyVar = zzc;
        zziiyVar.zza("potentially expensive size() call");
        zziiyVar.zza("blowup running");
        while (true) {
            Iterator it = this.zzb;
            if (!it.hasNext()) {
                return this.zza.size();
            }
            this.zza.add(it.next());
        }
    }
}
