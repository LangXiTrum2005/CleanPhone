package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzguy extends zzgtd {
    static final zzgtd zza = new zzguy(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    public zzguy(Object[] objArr, int i2) {
        this.zzb = objArr;
        this.zzc = i2;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        zzgqa.zzm(i2, this.zzc, "index");
        Object obj = this.zzb[i2];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
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
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtd, com.google.android.gms.internal.ads.zzgsz
    public final int zzg(Object[] objArr, int i2) {
        Object[] objArr2 = this.zzb;
        int i3 = this.zzc;
        System.arraycopy(objArr2, 0, objArr, i2, i3);
        return i2 + i3;
    }
}
