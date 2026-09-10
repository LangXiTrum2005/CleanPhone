package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
final class zzgla extends zzgld {
    final /* synthetic */ zzglb zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgla(zzgvo zzgvoVar, Class cls, zzglb zzglbVar) {
        super(zzgvoVar, cls, null);
        this.zza = zzglbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgld
    public final zzgdx zza(zzgnm zzgnmVar, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        return this.zza.zza(zzgnmVar, zzgeoVar);
    }
}
