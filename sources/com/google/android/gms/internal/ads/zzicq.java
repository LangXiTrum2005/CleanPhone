package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzicq extends zzhze {
    final zzics zza;
    zzhzg zzb;
    final /* synthetic */ zzict zzc;

    public zzicq(zzict zzictVar) {
        Objects.requireNonNull(zzictVar);
        this.zzc = zzictVar;
        this.zza = new zzics(zzictVar, null);
        this.zzb = zzb();
    }

    private final zzhzg zzb() {
        zzics zzicsVar = this.zza;
        if (zzicsVar.hasNext()) {
            return zzicsVar.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // com.google.android.gms.internal.ads.zzhzg
    public final byte zza() {
        zzhzg zzhzgVar = this.zzb;
        if (zzhzgVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzhzgVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
