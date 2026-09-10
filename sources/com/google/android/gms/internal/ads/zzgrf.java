package com.google.android.gms.internal.ads;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzgrf implements Iterator {
    final Iterator zza;
    Collection zzb;
    final /* synthetic */ zzgrg zzc;

    public zzgrf(zzgrg zzgrgVar) {
        Objects.requireNonNull(zzgrgVar);
        this.zzc = zzgrgVar;
        this.zza = zzgrgVar.zza.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.zza.next();
        this.zzb = (Collection) entry.getValue();
        return this.zzc.zzb(entry);
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzgqa.zzj(this.zzb != null, "no calls to next() since the last call to remove()");
        this.zza.remove();
        int size = this.zzb.size();
        zzgrt zzgrtVar = this.zzc.zzb;
        zzgrtVar.zzq(zzgrtVar.zzp() - size);
        this.zzb.clear();
        this.zzb = null;
    }
}
