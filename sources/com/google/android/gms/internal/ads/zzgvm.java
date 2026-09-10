package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgvm extends AbstractSet {
    private zzgvm() {
        throw null;
    }

    public static int zzd(Set set) {
        return set instanceof zzgvm ? ((zzgvm) set).zzc() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int iZzd;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (iZzd = zzd((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof zzgvm) {
            ((zzgvm) set).zzb();
            size = 0;
        } else {
            size = set.size();
        }
        if (zzc() < size) {
            return false;
        }
        zzgvr it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            try {
                if (!set.contains(it.next())) {
                    return false;
                }
                i2++;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        if (i2 == iZzd) {
            return true;
        }
        if (i2 < size) {
            return false;
        }
        Iterator it2 = set.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            it2.next();
            i3++;
            if (i3 > i2) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgvr iterator();

    public abstract int zzb();

    public abstract int zzc();

    public /* synthetic */ zzgvm(byte[] bArr) {
    }
}
