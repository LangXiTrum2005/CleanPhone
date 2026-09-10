package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzxa extends zzafd {
    final /* synthetic */ zzxk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzxa(zzxk zzxkVar, zzafr zzafrVar) {
        super(zzafrVar);
        Objects.requireNonNull(zzxkVar);
        this.zza = zzxkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzafd, com.google.android.gms.internal.ads.zzafr
    public final long zza() {
        return this.zza.zzQ();
    }
}
