package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvb extends zzgtn {
    private final transient zzgtg zza;
    private final transient zzgtd zzb;

    public zzgvb(zzgtg zzgtgVar, zzgtd zzgtdVar) {
        this.zza = zzgtgVar;
        this.zzb = zzgtdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    public final zzgtd zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzg(Object[] objArr, int i2) {
        return this.zzb.zzg(objArr, i2);
    }
}
