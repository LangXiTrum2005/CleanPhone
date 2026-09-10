package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
final class zzgvh extends zzgrb {
    final Iterator zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ Set zzc;

    public zzgvh(zzgvi zzgviVar, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        Objects.requireNonNull(zzgviVar);
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzgrb
    public final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            set = this.zzc;
            next = it.next();
        } while (!set.contains(next));
        return next;
    }
}
