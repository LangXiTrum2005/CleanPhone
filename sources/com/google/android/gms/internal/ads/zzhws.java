package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhws implements zzham {
    private static final byte[] zza = {0};
    private final zzhmn zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    private zzhws(zzhkn zzhknVar) throws GeneralSecurityException {
        this.zzb = zzhwp.zzb(zzhml.zzc(zzhmm.zzb(zzhknVar.zzf().zzc()), zzhknVar.zzd()));
        this.zzc = zzhknVar.zzf().zzd();
        this.zzd = zzhknVar.zze().zzc();
        if (zzhknVar.zzf().zzf().equals(zzhkt.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public static zzham zza(zzhkn zzhknVar) throws GeneralSecurityException {
        return new zzhws(zzhknVar);
    }

    public static zzham zzb(zzhkz zzhkzVar) throws GeneralSecurityException {
        return new zzhws(zzhkzVar);
    }

    public final byte[] zzc(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        return bArr2.length > 0 ? zzhvp.zza(this.zzd, this.zzb.zza(zzhvp.zza(bArr, bArr2), this.zzc)) : zzhvp.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }

    private zzhws(zzhkz zzhkzVar) throws GeneralSecurityException {
        String strValueOf = String.valueOf(zzhkzVar.zzf().zzg());
        this.zzb = new zzhwr("HMAC".concat(strValueOf), new SecretKeySpec(zzhkzVar.zzd().zzc(zzgzv.zza()), "HMAC"));
        this.zzc = zzhkzVar.zzf().zzd();
        this.zzd = zzhkzVar.zze().zzc();
        if (zzhkzVar.zzf().zzf().equals(zzhlh.zzc)) {
            this.zze = Arrays.copyOf(zza, 1);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzhws(zzhmn zzhmnVar, int i2) throws GeneralSecurityException {
        this.zzb = zzhmnVar;
        this.zzc = i2;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        zzhmnVar.zza(new byte[0], i2);
    }
}
