package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzy extends zzhyx implements RandomAccess, zziau, zzicl {
    private static final double[] zza;
    private static final zzhzy zzb;
    private double[] zzc;
    private int zzd;

    static {
        double[] dArr = new double[0];
        zza = dArr;
        zzb = new zzhzy(dArr, 0, false);
    }

    public zzhzy() {
        this(zza, 0, true);
    }

    public static zzhzy zzd() {
        return zzb;
    }

    private static int zzj(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final void zzk(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzl(i2));
        }
    }

    private final String zzl(int i2) {
        int i3 = this.zzd;
        return p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), i2, "Index:", i3, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdV();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i2));
        }
        int i4 = i2 + 1;
        double[] dArr = this.zzc;
        int length = dArr.length;
        if (i3 < length) {
            System.arraycopy(dArr, i2, dArr, i4, i3 - i2);
        } else {
            double[] dArr2 = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr2, 0, i2);
            System.arraycopy(this.zzc, i2, dArr2, i4, this.zzd - i2);
            this.zzc = dArr2;
        }
        this.zzc[i2] = dDoubleValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzibe.zzb;
        collection.getClass();
        if (!(collection instanceof zzhzy)) {
            return super.addAll(collection);
        }
        zzhzy zzhzyVar = (zzhzy) collection;
        int i2 = zzhzyVar.zzd;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzd;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.zzc;
        if (i4 > dArr.length) {
            this.zzc = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(zzhzyVar.zzc, 0, this.zzc, this.zzd, zzhzyVar.zzd);
        this.zzd = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzhzy)) {
            return super.equals(obj);
        }
        zzhzy zzhzyVar = (zzhzy) obj;
        if (this.zzd != zzhzyVar.zzd) {
            return false;
        }
        double[] dArr = zzhzyVar.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (Double.doubleToLongBits(this.zzc[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzk(i2);
        return Double.valueOf(this.zzc[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzd; i3++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.zzc[i3]);
            byte[] bArr = zzibe.zzb;
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
        int i2 = this.zzd;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzc[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdV();
        zzk(i2);
        double[] dArr = this.zzc;
        double d = dArr[i2];
        int i3 = this.zzd;
        if (i2 < i3 - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (i3 - i2) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzdV();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.zzc;
        System.arraycopy(dArr, i3, dArr, i2, this.zzd - i3);
        this.zzd -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        zzdV();
        zzk(i2);
        double[] dArr = this.zzc;
        double d = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibd, com.google.android.gms.internal.ads.zziat
    /* JADX INFO: renamed from: zze */
    public final zziau zzh(int i2) {
        if (i2 >= this.zzd) {
            return new zzhzy(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final double zzf(int i2) {
        zzk(i2);
        return this.zzc[i2];
    }

    public final void zzg(double d) {
        zzdV();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            double[] dArr = new double[zzj(length)];
            System.arraycopy(this.zzc, 0, dArr, 0, this.zzd);
            this.zzc = dArr;
        }
        double[] dArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        dArr2[i3] = d;
    }

    public final void zzi(int i2) {
        int length = this.zzc.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new double[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzhzy(double[] dArr, int i2, boolean z2) {
        super(z2);
        this.zzc = dArr;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Double) obj).doubleValue());
        return true;
    }
}
