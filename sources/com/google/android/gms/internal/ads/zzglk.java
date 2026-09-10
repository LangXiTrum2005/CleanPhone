package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzglk extends zzgdx {
    private final zzgnh zza;

    public zzglk(zzgnh zzgnhVar, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        zzc(zzgnhVar, zzgeoVar);
        this.zza = zzgnhVar;
    }

    private static void zzc(zzgnh zzgnhVar, @Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        int i = zzglj.zzb[zzgnhVar.zzb().ordinal()];
    }

    public final zzgnh zza(@Nullable zzgeo zzgeoVar) throws GeneralSecurityException {
        zzc(this.zza, zzgeoVar);
        return this.zza;
    }

    @Nullable
    public final Integer zzb() {
        return this.zza.zzf();
    }
}
