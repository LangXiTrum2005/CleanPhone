package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgti extends zzgvr {
    final Iterator zza;
    Iterator zzb;
    final /* synthetic */ zzgtl zzc;

    public zzgti(zzgtl zzgtlVar) {
        Objects.requireNonNull(zzgtlVar);
        this.zzc = zzgtlVar;
        this.zza = ((zzgtd) zzgtlVar.map.values()).listIterator(0);
        this.zzb = zzgtt.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.zzb.hasNext()) {
            this.zzb = ((zzgsz) this.zza.next()).iterator();
        }
        return this.zzb.next();
    }
}
