package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgtn<E> extends zzgsz<E> implements Set<E> {
    private transient zzgtd zza;

    public static zzgtn zzh() {
        return zzgve.zza;
    }

    public static zzgtn zzi(Object obj) {
        return new zzgvo(obj);
    }

    public static zzgtn zzj(Object obj, Object obj2) {
        return zzv(2, obj, obj2);
    }

    public static zzgtn zzk(Object obj, Object obj2, Object obj3) {
        return zzv(3, obj, obj2, obj3);
    }

    public static zzgtn zzl(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return zzv(5, obj, obj2, obj3, obj4, obj5);
    }

    @SafeVarargs
    public static zzgtn zzm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object... objArr) {
        int length = objArr.length;
        int i2 = length + 6;
        Object[] objArr2 = new Object[i2];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        System.arraycopy(objArr, 0, objArr2, 6, length);
        return zzv(i2, objArr2);
    }

    public static int zzn(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            zzgqa.zzb(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
        } while (((double) iHighestOneBit) * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static zzgtn zzo(Collection collection) {
        if ((collection instanceof zzgtn) && !(collection instanceof SortedSet)) {
            zzgtn zzgtnVar = (zzgtn) collection;
            if (!zzgtnVar.zzf()) {
                return zzgtnVar;
            }
        }
        Object[] array = collection.toArray();
        return zzv(array.length, array);
    }

    public static zzgtn zzp(Object[] objArr) {
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? zzv(length, (Object[]) objArr.clone()) : new zzgvo(objArr[0]);
        }
        return zzgve.zza;
    }

    public static zzgtm zzs(int i2) {
        zzgrz.zzb(i2, "expectedSize");
        return new zzgtm(i2, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgtn zzv(int i2, Object... objArr) {
        if (i2 == 0) {
            return zzgve.zza;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return new zzgvo(obj);
        }
        int iZzn = zzn(i2);
        Object[] objArr2 = new Object[iZzn];
        int i3 = iZzn - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            zzguw.zzb(obj2, i6);
            int iHashCode = obj2.hashCode();
            int iZza = zzgsw.zza(iHashCode);
            while (true) {
                int i7 = iZza & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iZza++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            Objects.requireNonNull(obj4);
            return new zzgvo(obj4);
        }
        if (zzn(i5) < iZzn / 2) {
            return zzv(i5, objArr);
        }
        if (zzw(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new zzgve(objArr, i4, objArr2, i3, i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzw(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof zzgtn) && zzq() && ((zzgtn) obj).zzq() && hashCode() != obj.hashCode()) {
            return false;
        }
        return zzgvn.zzd(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzgvn.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract zzgvr iterator();

    @Override // com.google.android.gms.internal.ads.zzgsz
    public zzgtd zze() {
        zzgtd zzgtdVar = this.zza;
        if (zzgtdVar != null) {
            return zzgtdVar;
        }
        zzgtd zzgtdVarZzr = zzr();
        this.zza = zzgtdVarZzr;
        return zzgtdVarZzr;
    }

    public boolean zzq() {
        return false;
    }

    public zzgtd zzr() {
        Object[] array = toArray();
        int i2 = zzgtd.zzd;
        return zzgtd.zzt(array, array.length);
    }
}
