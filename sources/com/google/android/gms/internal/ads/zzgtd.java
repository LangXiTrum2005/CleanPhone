package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgtd extends zzgsz implements List, RandomAccess {
    private static final zzgvs zza = new zzgtb(zzguy.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzgtd zzi() {
        return zzguy.zza;
    }

    public static zzgtd zzj(Object obj) {
        Object[] objArr = {obj};
        zzguw.zza(objArr, 1);
        return zzt(objArr, 1);
    }

    public static zzgtd zzk(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzguw.zza(objArr, 2);
        return zzt(objArr, 2);
    }

    public static zzgtd zzl(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzguw.zza(objArr, 3);
        return zzt(objArr, 3);
    }

    public static zzgtd zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzguw.zza(objArr, 5);
        return zzt(objArr, 5);
    }

    public static zzgtd zzn(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5, obj6};
        zzguw.zza(objArr, 6);
        return zzt(objArr, 6);
    }

    @SafeVarargs
    public static zzgtd zzo(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i2 = length + 12;
        Object[] objArr2 = new Object[i2];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzguw.zza(objArr2, i2);
        return zzt(objArr2, i2);
    }

    public static zzgtd zzp(Iterable iterable) {
        iterable.getClass();
        return zzq((Collection) iterable);
    }

    public static zzgtd zzq(Collection collection) {
        if (!(collection instanceof zzgsz)) {
            Object[] array = collection.toArray();
            int length = array.length;
            zzguw.zza(array, length);
            return zzt(array, length);
        }
        zzgtd zzgtdVarZze = ((zzgsz) collection).zze();
        if (!zzgtdVarZze.zzf()) {
            return zzgtdVarZze;
        }
        Object[] array2 = zzgtdVarZze.toArray();
        return zzt(array2, array2.length);
    }

    public static zzgtd zzr(Object[] objArr) {
        if (objArr.length == 0) {
            return zzguy.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzguw.zza(objArr2, length);
        return zzt(objArr2, length);
    }

    public static zzgtd zzs(Comparator comparator, Iterable iterable) {
        Object[] array = (iterable instanceof Collection ? (Collection) iterable : zzgud.zza(((zzgtd) iterable).listIterator(0))).toArray();
        int length = array.length;
        zzguw.zza(array, length);
        Arrays.sort(array, comparator);
        return zzt(array, length);
    }

    public static zzgtd zzt(Object[] objArr, int i2) {
        return i2 == 0 ? zzguy.zza : new zzguy(objArr, i2);
    }

    public static zzgta zzv(int i2) {
        zzgrz.zzb(i2, "expectedSize");
        return new zzgta(i2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < size; i2++) {
                if (!Objects.equals(get(i2), list.get(i2))) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext() || !Objects.equals(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i2, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    @Deprecated
    public final zzgtd zze() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public int zzg(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public zzgtd subList(int i2, int i3) {
        zzgqa.zzo(i2, i3, size());
        int i4 = i3 - i2;
        if (i4 == size()) {
            return this;
        }
        return i4 == 0 ? zzguy.zza : new zzgtc(this, i2, i4);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zzu, reason: merged with bridge method [inline-methods] */
    public final zzgvs listIterator(int i2) {
        zzgqa.zzn(i2, size(), "index");
        return isEmpty() ? zza : new zzgtb(this, i2);
    }
}
