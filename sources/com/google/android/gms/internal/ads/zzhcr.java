package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhcr {

    @Nullable
    private Integer zza = null;
    private zzhcs zzb = zzhcs.zzc;

    private zzhcr() {
    }

    public final zzhcr zza(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i2)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhcr zzb(zzhcs zzhcsVar) {
        this.zzb = zzhcsVar;
        return this;
    }

    public final zzhct zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("Key size is not set");
        }
        if (this.zzb != null) {
            return new zzhct(num.intValue(), this.zzb, null);
        }
        throw new GeneralSecurityException("Variant is not set");
    }

    public /* synthetic */ zzhcr(byte[] bArr) {
    }
}
