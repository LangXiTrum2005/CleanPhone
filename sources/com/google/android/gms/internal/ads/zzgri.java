package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgri implements Iterator {
    Map.Entry zza;
    final /* synthetic */ Iterator zzb;
    final /* synthetic */ zzgrj zzc;

    public zzgri(zzgrj zzgrjVar, Iterator it) {
        this.zzb = it;
        Objects.requireNonNull(zzgrjVar);
        this.zzc = zzgrjVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.zzb.next();
        this.zza = entry;
        return entry.getKey();
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgqa.zzj(this.zza != null, "no calls to next() since the last call to remove()");
        Collection collection = (Collection) this.zza.getValue();
        this.zzb.remove();
        int size = collection.size();
        zzgrt zzgrtVar = this.zzc.zza;
        zzgrtVar.zzq(zzgrtVar.zzp() - size);
        collection.clear();
        this.zza = null;
    }
}
