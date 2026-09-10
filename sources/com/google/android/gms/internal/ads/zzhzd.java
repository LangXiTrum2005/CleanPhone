package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzhzd extends zzhze {
    final /* synthetic */ zzhzl zza;
    private int zzb;
    private final int zzc;

    public zzhzd(zzhzl zzhzlVar) {
        Objects.requireNonNull(zzhzlVar);
        this.zza = zzhzlVar;
        this.zzb = 0;
        this.zzc = zzhzlVar.zzc();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzhzg
    public final byte zza() {
        int i2 = this.zzb;
        if (i2 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i2 + 1;
        return this.zza.zzb(i2);
    }
}
