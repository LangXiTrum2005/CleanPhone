package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgth extends zzgvr {
    final Iterator zza;
    Object zzb;
    Iterator zzc;
    final /* synthetic */ zzgtl zzd;

    public zzgth(zzgtl zzgtlVar) {
        Objects.requireNonNull(zzgtlVar);
        this.zzd = zzgtlVar;
        this.zza = zzgtlVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = zzgtt.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.zzc.hasNext()) {
            Map.Entry entry = (Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((zzgsz) entry.getValue()).iterator();
        }
        Object obj = this.zzb;
        Objects.requireNonNull(obj);
        return new AbstractMap.SimpleImmutableEntry(obj, this.zzc.next());
    }
}
