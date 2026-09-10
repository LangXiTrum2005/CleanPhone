package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgva extends zzgtn {
    private final transient zzgtg zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    public zzgva(zzgtg zzgtgVar, Object[] objArr, int i2, int i3) {
        this.zza = zzgtgVar;
        this.zzb = objArr;
        this.zzc = i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zze().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return zze().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final int zzg(Object[] objArr, int i2) {
        return zze().zzg(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzgtn
    public final zzgtd zzr() {
        return new zzguz(this);
    }

    public final /* synthetic */ Object[] zzv() {
        return this.zzb;
    }

    public final /* synthetic */ int zzw() {
        return this.zzc;
    }
}
