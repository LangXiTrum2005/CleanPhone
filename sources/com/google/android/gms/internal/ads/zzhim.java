package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhim extends zzgzx {
    private final zzhjz zza;

    public zzhim(zzhjz zzhjzVar, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        zze(zzhjzVar, zzharVar);
        this.zza = zzhjzVar;
    }

    private static void zze(zzhjz zzhjzVar, @Nullable zzhar zzharVar) throws GeneralSecurityException {
        int i2 = zzhik.zzb[zzhjzVar.zzc().ordinal()];
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    public final zzhan zza() {
        zzhjz zzhjzVar = this.zza;
        return new zzhil(zzhjzVar.zzg(), zzhjzVar.zzd(), null);
    }

    @Override // com.google.android.gms.internal.ads.zzgzx
    @Nullable
    public final Integer zzb() {
        return this.zza.zze();
    }

    public final zzhjz zzc(@Nullable zzhar zzharVar) throws GeneralSecurityException {
        zzhjz zzhjzVar = this.zza;
        zze(zzhjzVar, zzharVar);
        return zzhjzVar;
    }

    public final zzhxc zzd() throws GeneralSecurityException {
        zzhjz zzhjzVar = this.zza;
        if (zzhjzVar.zzd().equals(zzhpw.RAW)) {
            return zzhxc.zza(new byte[0]);
        }
        if (zzhjzVar.zzd().equals(zzhpw.TINK)) {
            return zzhjf.zzb(zzhjzVar.zze().intValue());
        }
        if (zzhjzVar.zzd().equals(zzhpw.LEGACY) || zzhjzVar.zzd().equals(zzhpw.CRUNCHY)) {
            return zzhjf.zza(zzhjzVar.zze().intValue());
        }
        throw new GeneralSecurityException("Unknown output prefix type");
    }
}
