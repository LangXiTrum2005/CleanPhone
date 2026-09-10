package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgvl extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return zzgvn.zzf(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
