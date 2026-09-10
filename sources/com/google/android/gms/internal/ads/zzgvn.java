package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgvn {
    public static zzgvm zza(Set set, Set set2) {
        zzgqa.zzk(set, "set1");
        zzgqa.zzk(set2, "set2");
        return new zzgvi(set, set2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Set zzb(Set set, zzgqb zzgqbVar) {
        if (!(set instanceof SortedSet)) {
            if (!(set instanceof zzgvj)) {
                set.getClass();
                return new zzgvj(set, zzgqbVar);
            }
            zzgvj zzgvjVar = (zzgvj) set;
            return new zzgvj((Set) zzgvjVar.zza, zzgqe.zzb(zzgvjVar.zzb, zzgqbVar));
        }
        SortedSet sortedSet = (SortedSet) set;
        if (!(sortedSet instanceof zzgvj)) {
            sortedSet.getClass();
            return new zzgvk(sortedSet, zzgqbVar);
        }
        zzgvj zzgvjVar2 = (zzgvj) sortedSet;
        return new zzgvk((SortedSet) zzgvjVar2.zza, zzgqe.zzb(zzgvjVar2.zzb, zzgqbVar));
    }

    public static int zzc(Set set) {
        Iterator it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static boolean zzd(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static boolean zze(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static boolean zzf(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof zzguu) {
            collection = ((zzguu) collection).zza();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return zze(set, collection.iterator());
        }
        Iterator it = set.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }
}
