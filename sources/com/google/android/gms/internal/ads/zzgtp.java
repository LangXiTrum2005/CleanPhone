package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtp extends zzgtn {
    private final transient zzgtq zza;

    public zzgtp(zzgtq zzgtqVar) {
        this.zza = zzgtqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            zzgtq zzgtqVar = this.zza;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) zzgtqVar.zzu().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzgth(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size;
    }

    @Override // com.google.android.gms.internal.ads.zzgtn, com.google.android.gms.internal.ads.zzgsz
    /* JADX INFO: renamed from: zza */
    public final zzgvr iterator() {
        return new zzgth(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgsz
    public final boolean zzf() {
        return false;
    }
}
