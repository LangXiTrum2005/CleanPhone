package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
final class zziai extends zzhyx implements RandomAccess, zziay, zzicl {
    private static final float[] zza;
    private static final zziai zzb;
    private float[] zzc;
    private int zzd;

    static {
        float[] fArr = new float[0];
        zza = fArr;
        zzb = new zziai(fArr, 0, false);
    }

    public zziai() {
        this(zza, 0, true);
    }

    public static zziai zzd() {
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
        float fFloatValue = ((Float) obj).floatValue();
        zzdV();
        if (i2 < 0 || i2 > (i3 = this.zzd)) {
            throw new IndexOutOfBoundsException(zzl(i2));
        }
        int i4 = i2 + 1;
        float[] fArr = this.zzc;
        int length = fArr.length;
        if (i3 < length) {
            System.arraycopy(fArr, i2, fArr, i4, i3 - i2);
        } else {
            float[] fArr2 = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr2, 0, i2);
            System.arraycopy(this.zzc, i2, fArr2, i4, this.zzd - i2);
            this.zzc = fArr2;
        }
        this.zzc[i2] = fFloatValue;
        this.zzd++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zzdV();
        byte[] bArr = zzibe.zzb;
        collection.getClass();
        if (!(collection instanceof zziai)) {
            return super.addAll(collection);
        }
        zziai zziaiVar = (zziai) collection;
        int i2 = zziaiVar.zzd;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.zzd;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.zzc;
        if (i4 > fArr.length) {
            this.zzc = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(zziaiVar.zzc, 0, this.zzc, this.zzd, zziaiVar.zzd);
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
        if (!(obj instanceof zziai)) {
            return super.equals(obj);
        }
        zziai zziaiVar = (zziai) obj;
        if (this.zzd != zziaiVar.zzd) {
            return false;
        }
        float[] fArr = zziaiVar.zzc;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            if (Float.floatToIntBits(this.zzc[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i2) {
        zzk(i2);
        return Float.valueOf(this.zzc[i2]);
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.zzd; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.zzc[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.zzd;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.zzc[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        zzdV();
        zzk(i2);
        float[] fArr = this.zzc;
        float f = fArr[i2];
        int i3 = this.zzd;
        if (i2 < i3 - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (i3 - i2) - 1);
        }
        this.zzd--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        zzdV();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.zzc;
        System.arraycopy(fArr, i3, fArr, i2, this.zzd - i3);
        this.zzd -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        zzdV();
        zzk(i2);
        float[] fArr = this.zzc;
        float f = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzibd, com.google.android.gms.internal.ads.zziat
    /* JADX INFO: renamed from: zze */
    public final zziay zzh(int i2) {
        if (i2 >= this.zzd) {
            return new zziai(i2 == 0 ? zza : Arrays.copyOf(this.zzc, i2), this.zzd, true);
        }
        throw new IllegalArgumentException();
    }

    public final float zzf(int i2) {
        zzk(i2);
        return this.zzc[i2];
    }

    public final void zzg(float f) {
        zzdV();
        int i2 = this.zzd;
        int length = this.zzc.length;
        if (i2 == length) {
            float[] fArr = new float[zzj(length)];
            System.arraycopy(this.zzc, 0, fArr, 0, this.zzd);
            this.zzc = fArr;
        }
        float[] fArr2 = this.zzc;
        int i3 = this.zzd;
        this.zzd = i3 + 1;
        fArr2[i3] = f;
    }

    public final void zzi(int i2) {
        int length = this.zzc.length;
        if (i2 <= length) {
            return;
        }
        if (length == 0) {
            this.zzc = new float[Math.max(i2, 10)];
            return;
        }
        while (length < i2) {
            length = zzj(length);
        }
        this.zzc = Arrays.copyOf(this.zzc, length);
    }

    private zziai(float[] fArr, int i2, boolean z2) {
        super(z2);
        this.zzc = fArr;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzhyx, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zzg(((Float) obj).floatValue());
        return true;
    }
}
