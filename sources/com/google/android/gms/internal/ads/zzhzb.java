package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzb extends zzhyx implements RandomAccess, zziat, zzicl {
    private static final boolean[] zza;
    private static final zzhzb zzb;
    private boolean[] zzc;
    private int zzd;

    static {
        boolean[] zArr = new boolean[0];
        zza = zArr;
        zzb = new zzhzb(zArr, 0, false);
    }

    public zzhzb() {
        this(zza, 0, true);
    }

    public static zzhzb zzd() {
        return zzb;
    }

    private static int zzi(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final void zzj(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzk(i2));
        }
    }

    private final String zzk(int i2) {
        int i3 = this.zzd;
        return p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), i2, "Index:", i3, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzdV();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzk(i2));
        }
        int i4 = i2 + 1;
        boolean[] zArr = this.zzc;
        int length = zArr.length;
        if (i3 < length) {
            System.arraycopy(zArr, i2, zArr, i4, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr2, 0, i2);
            System.arraycopy(this.zzc, i2, zArr2, i4, this.zzd - i2);
            this.zzc = zArr2;
        }
        this.zzc[i2] = zBooleanValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzibe.zzb;
        collection.getClass();
        if (!(collection instanceof zzhzb)) {
            return super.addAll(collection);
        }
        zzhzb zzhzbVar = (zzhzb) collection;
        int i2 = zzhzbVar.zzd;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzd;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.zzc;
        if (i4 > zArr.length) {
            this.zzc = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(zzhzbVar.zzc, 0, this.zzc, this.zzd, zzhzbVar.zzd);
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
        if (!(obj instanceof zzhzb)) {
            return super.equals(obj);
        }
        zzhzb zzhzbVar = (zzhzb) obj;
        if (this.zzd != zzhzbVar.zzd) {
            return false;
        }
        boolean[] zArr = zzhzbVar.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (this.zzc[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzj(i2);
        return Boolean.valueOf(this.zzc[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iZzb = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            iZzb = (iZzb * 31) + zzibe.zzb(this.zzc[i2]);
        }
        return iZzb;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.zzd;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzc[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdV();
        zzj(i2);
        boolean[] zArr = this.zzc;
        boolean z2 = zArr[i2];
        int i3 = this.zzd;
        if (i2 < i3 - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (i3 - i2) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzdV();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.zzc;
        System.arraycopy(zArr, i3, zArr, i2, this.zzd - i3);
        this.zzd -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        zzdV();
        zzj(i2);
        boolean[] zArr = this.zzc;
        boolean z2 = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibd, com.google.android.gms.internal.ads.zziat
    /* JADX INFO: renamed from: zze */
    public final zziat zzh(int i2) {
        if (i2 >= this.zzd) {
            return new zzhzb(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final boolean zzf(int i2) {
        zzj(i2);
        return this.zzc[i2];
    }

    public final void zzg(boolean z2) {
        zzdV();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            boolean[] zArr = new boolean[zzi(length)];
            System.arraycopy(this.zzc, 0, zArr, 0, this.zzd);
            this.zzc = zArr;
        }
        boolean[] zArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        zArr2[i3] = z2;
    }

    private zzhzb(boolean[] zArr, int i2, boolean z2) {
        super(z2);
        this.zzc = zArr;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Boolean) obj).booleanValue());
        return true;
    }
}
