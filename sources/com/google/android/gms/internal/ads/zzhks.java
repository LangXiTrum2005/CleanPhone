package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhks {

    @Nullable
    private Integer zza = null;

    @Nullable
    private Integer zzb = null;
    private zzhkt zzc = zzhkt.zzd;

    private zzhks() {
    }

    public final zzhks zza(int i2) throws GeneralSecurityException {
        if (i2 != 16 && i2 != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i2 * 8)));
        }
        this.zza = Integer.valueOf(i2);
        return this;
    }

    public final zzhks zzb(int i2) throws GeneralSecurityException {
        if (i2 < 10 || i2 > 16) {
            throw new GeneralSecurityException(androidx.datastore.preferences.protobuf.a.g(i2, "Invalid tag size for AesCmacParameters: ", new StringBuilder(String.valueOf(i2).length() + 40)));
        }
        this.zzb = Integer.valueOf(i2);
        return this;
    }

    public final zzhks zzc(zzhkt zzhktVar) {
        this.zzc = zzhktVar;
        return this;
    }

    public final zzhku zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (this.zzb == null) {
            throw new GeneralSecurityException("tag size not set");
        }
        if (this.zzc != null) {
            return new zzhku(num.intValue(), this.zzb.intValue(), this.zzc, null);
        }
        throw new GeneralSecurityException("variant not set");
    }

    public /* synthetic */ zzhks(byte[] bArr) {
    }
}
