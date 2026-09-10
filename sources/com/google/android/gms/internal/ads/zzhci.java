package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhci {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;

    @Nullable
    private Integer zzc = null;
    private zzhcj zzd = zzhcj.zzc;

    private zzhci() {
    }

    public final zzhci zza(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 24 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhci zzb(int i2) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzhci zzc(int i2) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzhci zzd(zzhcj zzhcjVar) {
        this.zzd = zzhcjVar;
        return this;
    }

    public final zzhck zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzd == null) {
            throw new GeneralSecurityException("Variant is not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("IV size is not set");
        }
        if (this.zzc == null) {
            throw new GeneralSecurityException("Tag size is not set");
        }
        int iIntValue = num.intValue();
        this.zzb.getClass();
        this.zzc.getClass();
        return new zzhck(iIntValue, 12, 16, this.zzd, null);
    }

    public /* synthetic */ zzhci(byte[] bArr) {
    }
}
