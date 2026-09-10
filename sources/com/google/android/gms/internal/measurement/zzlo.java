package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzlo extends zzku implements RandomAccess, zzmi, zznt {
    private static final double[] zza;
    private double[] zzb;
    private int zzc;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        new zzlo(dArr, 0, false);
    }

    public zzlo() {
        this(zza, 0, true);
    }

    private static int zzi(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i2) {
        if (i2 < 0 || i2 >= this.zzc) {
            throw new IndexOutOfBoundsException(zzk(i2));
        }
    }

    private final String zzk(int i2) {
        return zzkw.zza(this.zzc, i2, (byte) 13, "Index:", ", Size:");
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzcF();
        if (i2 < 0 || i2 > (i3 = this.zzc)) {
            throw new IndexOutOfBoundsException(zzk(i2));
        }
        int i4 = i2 + 1;
        double[] dArr = this.zzb;
        int length = dArr.length;
        if (i3 < length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[zzi(length)];
            System.arraycopy(this.zzb, 0, dArr2, 0, i2);
            System.arraycopy(this.zzb, i2, dArr2, i4, this.zzc - i2);
            this.zzb = dArr2;
        }
        this.zzb[i2] = dDoubleValue;
        this.zzc++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzcF();
        byte[] bArr = zzmp.zzb;
        collection.getClass();
        if (!(collection instanceof zzlo)) {
            return super.addAll(collection);
        }
        zzlo zzloVar = (zzlo) collection;
        int i2 = zzloVar.zzc;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzc;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.zzb;
        if (i4 > dArr.length) {
            this.zzb = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzloVar.zzb, 0, this.zzb, this.zzc, zzloVar.zzc);
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
        if (!(obj instanceof zzlo)) {
            return super.equals(obj);
        }
        zzlo zzloVar = (zzlo) obj;
        if (this.zzc != zzloVar.zzc) {
            return false;
        }
        double[] dArr = zzloVar.zzb;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            if (Double.doubleToLongBits(this.zzb[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
        return Double.valueOf(this.zzb[i2]);
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzb[i3]);
            byte[] bArr = zzmp.zzb;
            i2 = (i2 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.zzc;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzb[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzcF();
        zzj(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        int i3 = this.zzc;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.zzc--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzcF();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzb;
        System.arraycopy(dArr, i3, dArr, i2, this.zzc - i3);
        this.zzc -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzcF();
        zzj(i2);
        double[] dArr = this.zzb;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzmo, com.google.android.gms.internal.measurement.zzmh
    /* JADX INFO: renamed from: zzd */
    public final zzmi zzg(int i2) {
        if (i2 >= this.zzc) {
            return new zzlo(i2 == 0 ? zza : Arrays.copyOf(this.zzb, i2), this.zzc, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zze(int i2) {
        zzj(i2);
        return this.zzb[i2];
    }

    public final void zzf(double d) {
        zzcF();
        int i2 = this.zzc;
        int length = this.zzb.length;
        if (i2 == length) {
            double[] dArr = new double[zzi(length)];
            System.arraycopy(this.zzb, 0, dArr, 0, this.zzc);
            this.zzb = dArr;
        }
        double[] dArr2 = this.zzb;
        int i3 = this.zzc;
        this.zzc = i3 + 1;
        dArr2[i3] = d;
    }

    public final void zzh(int i2) {
        int length = this.zzb.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.zzb = new double[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = zzi(length);
        }
        this.zzb = Arrays.copyOf(this.zzb, length);
    }

    private zzlo(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.zzb = dArr;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzku, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzf(((Double) obj).doubleValue());
        return true;
    }
}
