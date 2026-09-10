package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzibq extends zzhyx implements RandomAccess, zzibc, zzicl {
    private static final long[] zza;
    private static final zzibq zzb;
    private long[] zzc;
    private int zzd;

    static {
        long[] jArr = new long[0];
        zza = jArr;
        zzb = new zzibq(jArr, 0, false);
    }

    public zzibq() {
        this(zza, 0, true);
    }

    public static zzibq zzg() {
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
        long jLongValue = ((Long) obj).longValue();
        zzdV();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i2));
        }
        int i4 = i2 + 1;
        long[] jArr = this.zzc;
        int length = jArr.length;
        if (i3 < length) {
            System.arraycopy(jArr, i2, jArr, i4, i3 - i2);
        } else {
            long[] jArr2 = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr2, 0, i2);
            System.arraycopy(this.zzc, i2, jArr2, i4, this.zzd - i2);
            this.zzc = jArr2;
        }
        this.zzc[i2] = jLongValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzibe.zzb;
        collection.getClass();
        if (!(collection instanceof zzibq)) {
            return super.addAll(collection);
        }
        zzibq zzibqVar = (zzibq) collection;
        int i2 = zzibqVar.zzd;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzd;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.zzc;
        if (i4 > jArr.length) {
            this.zzc = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(zzibqVar.zzc, 0, this.zzc, this.zzd, zzibqVar.zzd);
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
        if (!(obj instanceof zzibq)) {
            return super.equals(obj);
        }
        zzibq zzibqVar = (zzibq) obj;
        if (this.zzd != zzibqVar.zzd) {
            return false;
        }
        long[] jArr = zzibqVar.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (this.zzc[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzk(i2);
        return Long.valueOf(this.zzc[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.zzd; i3++) {
            long j = this.zzc[i3];
            byte[] bArr = zzibe.zzb;
            i2 = (i2 * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.zzd;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzc[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdV();
        zzk(i2);
        long[] jArr = this.zzc;
        long j = jArr[i2];
        int i3 = this.zzd;
        if (i2 < i3 - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (i3 - i2) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzdV();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.zzc;
        System.arraycopy(jArr, i3, jArr, i2, this.zzd - i3);
        this.zzd -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        return Long.valueOf(zze(i2, ((Long) obj).longValue()));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    public final long zzc(int i2) {
        zzk(i2);
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    public final void zzd(long j) {
        zzdV();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            long[] jArr = new long[zzj(length)];
            System.arraycopy(this.zzc, 0, jArr, 0, this.zzd);
            this.zzc = jArr;
        }
        long[] jArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        jArr2[i3] = j;
    }

    @Override // com.google.android.gms.internal.ads.zzibc
    public final long zze(int i2, long j) {
        zzdV();
        zzk(i2);
        long[] jArr = this.zzc;
        long j2 = jArr[i2];
        jArr[i2] = j;
        return j2;
    }

    @Override // com.google.android.gms.internal.ads.zzibd, com.google.android.gms.internal.ads.zziat
    /* JADX INFO: renamed from: zzf */
    public final zzibc zzh(int i2) {
        if (i2 >= this.zzd) {
            return new zzibq(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final void zzi(int i2) {
        int length = this.zzc.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new long[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zzibq(long[] jArr, int i2, boolean z2) {
        super(z2);
        this.zzc = jArr;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzd(((Long) obj).longValue());
        return true;
    }
}
