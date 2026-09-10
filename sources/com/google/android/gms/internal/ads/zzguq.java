package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzguq extends zzgup {
    final /* synthetic */ zzgur zza;

    public zzguq(zzgur zzgurVar, int i2) {
        Objects.requireNonNull(zzgurVar);
        this.zza = zzgurVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgup
    public final zzgty zza() {
        return new zzgut(this.zza.zza(), new zzguo(2));
    }
}
