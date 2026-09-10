package com.google.android.gms.internal.consent_sdk;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzpf extends zzpg {
    final /* synthetic */ zzpm zza;
    private int zzb;
    private final int zzc;

    public zzpf(zzpm zzpmVar) {
        Objects.requireNonNull(zzpmVar);
        this.zza = zzpmVar;
        this.zzb = 0;
        this.zzc = zzpmVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzpi
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
