package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zzicn extends zzhyx implements RandomAccess {
    private static final Object[] zza;
    private static final zzicn zzb;
    private Object[] zzc;
    private int zzd;

    static {
        Object[] objArr = new Object[0];
        zza = objArr;
        zzb = new zzicn(objArr, 0, false);
    }

    public zzicn() {
        this(zza, 0, true);
    }

    public static zzicn zzd() {
        return zzb;
    }

    private static int zzf(int i2) {
        return Math.max(((i2 * 3) / 2) + 1, 10);
    }

    private final void zzg(int i2) {
        if (i2 < 0 || i2 >= this.zzd) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
    }

    private final String zzi(int i2) {
        int i3 = this.zzd;
        return p005e.a.a(new StringBuilder(String.valueOf(i2).length() + 13 + String.valueOf(i3).length()), i2, "Index:", i3, ", Size:");
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final void add(int i2, Object obj) {
        int i3;
        zzdV();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzi(i2));
        }
        int i4 = i2 + 1;
        Object[] objArr = this.zzc;
        int length = objArr.length;
        if (i3 < length) {
            System.arraycopy(objArr, i2, objArr, i4, i3 - i2);
        } else {
            Object[] objArr2 = new Object[zzf(length)];
            System.arraycopy(this.zzc, 0, objArr2, 0, i2);
            System.arraycopy(this.zzc, i2, objArr2, i4, this.zzd - i2);
            this.zzc = objArr2;
        }
        this.zzc[i2] = obj;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i2) {
        zzg(i2);
        return this.zzc[i2];
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final Object remove(int i2) {
        zzdV();
        zzg(i2);
        Object[] objArr = this.zzc;
        Object obj = objArr[i2];
        int i3 = this.zzd;
        if (i2 < i3 - 1) {
            System.arraycopy(objArr, i2 + 1, objArr, i2, (i3 - i2) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final Object set(int i2, Object obj) {
        zzdV();
        zzg(i2);
        Object[] objArr = this.zzc;
        Object obj2 = objArr[i2];
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    public final void zze(int i2) {
        int length = this.zzc.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new Object[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = zzf(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    @Override // com.google.android.gms.internal.ads.zzibd, com.google.android.gms.internal.ads.zziat
    public final /* bridge */ /* synthetic */ zzibd zzh(int i2) {
        if (i2 >= this.zzd) {
            return new zzicn(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    private zzicn(Object[] objArr, int i2, boolean z2) {
        super(z2);
        this.zzc = objArr;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zzdV();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            this.zzc = Arrays.copyOf(this.zzc, zzf(length));
        }
        Object[] objArr = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        objArr[i3] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
