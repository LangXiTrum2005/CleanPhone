package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgve extends zzgtn {
    static final zzgve zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zzgve(objArr, 0, objArr, 0, 0);
    }

    public zzgve(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.zzb = objArr;
        this.zze = i2;
        this.zzc = objArr2;
        this.zzf = i3;
        this.zzg = i4;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZzb = zzgsw.zzb(obj);
                while (true) {
                    int i2 = iZzb & this.zzf;
                    Object obj2 = objArr[i2];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZzb = i2 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final Object[] zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzd() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzg(Object[] objArr, int i2) {
        Object[] objArr2 = this.zzb;
        int i3 = this.zzg;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn
    public final boolean zzq() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn
    public final zzgtd zzr() {
        return zzgtd.zzt(this.zzb, this.zzg);
    }
}
