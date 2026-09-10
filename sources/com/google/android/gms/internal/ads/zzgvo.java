package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvo extends zzgtn {
    final transient Object zza;

    public zzgvo(Object obj) {
        obj.getClass();
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgtv(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(String.valueOf(string).length() + 2), d9.i.d, string, d9.i.f24752e);
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return new zzgtv(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    public final zzgtd zze() {
        return zzgtd.zzj(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzg(Object[] objArr, int i2) {
        objArr[i2] = this.zza;
        return i2 + 1;
    }
}
