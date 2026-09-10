package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzky extends zzku implements RandomAccess, zzmh, zznt {
    private static final boolean[] zza;
    private boolean[] zzb;
    private int zzc;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        new zzky(zArr, 0, false);
    }

    public zzky() {
        this(zza, 0, true);
    }

    private static int zzh(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final void zzi(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
    }

    private final String zzj(int i2) {
        return zzkw.zza(this.zzc, i2, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzcF();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzj(i2));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.zzb;
        int length = zArr.length;
        if (i3 < length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr2, 0, i2);
            System.arraycopy(this.zzb, i2, zArr2, i4, this.zzc - i2);
            this.zzb = zArr2;
        }
        this.zzb[i2] = zBooleanValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzky)) {
            return super.addAll(collection);
        }
        zzky zzkyVar = (zzky) collection;
        int i2 = zzkyVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.zzb;
        if (i4 > zArr.length) {
            this.zzb = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzkyVar.zzb, 0, this.zzb, this.zzc, zzkyVar.zzc);
        this.zzc = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzky)) {
            return super.equals(obj);
        }
        zzky zzkyVar = (zzky) obj;
        if (this.zzc != zzkyVar.zzc) {
            return false;
        }
        boolean[] zArr = zzkyVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (this.zzb[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzi(i2);
        return Boolean.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            iZzb = (iZzb * 31) + zzmp.zzb(this.zzb[i2]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.zzc;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzb[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzcF();
        zzi(i2);
        boolean[] zArr = this.zzb;
        boolean z2 = zArr[i2];
        int i3 = this.zzc;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzcF();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzb;
        System.arraycopy(zArr, i3, zArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzcF();
        zzi(i2);
        boolean[] zArr = this.zzb;
        boolean z2 = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzd */
    public final zzmh zzg(int i2) {
        if (i2 >= this.zzc) {
            return new zzky(i2 == 0 ? zza : Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zze(int i2) {
        zzi(i2);
        return this.zzb[i2];
    }

    public final void zzf(boolean z2) {
        zzcF();
        int i2 = this.zzc;
        int length = this.zzb.length;
        if (i2 == length) {
            boolean[] zArr = new boolean[zzh(length)];
            System.arraycopy(this.zzb, 0, zArr, 0, this.zzc);
            this.zzb = zArr;
        }
        boolean[] zArr2 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        zArr2[i3] = z2;
    }

    private zzky(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.zzb = zArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Boolean) obj).booleanValue());
        return true;
    }
}
