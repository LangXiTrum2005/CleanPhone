package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
final class zzgts extends zzgrb {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzgqb zzb;

    public zzgts(Iterator it, zzgqb zzgqbVar) {
        this.zza = it;
        this.zzb = zzgqbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgrb
    public final Object zza() {
        zzgqb zzgqbVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzgqbVar = this.zzb;
            next = it.next();
        } while (!zzgqbVar.zza(next));
        return next;
    }
}
