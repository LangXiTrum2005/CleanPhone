package com.google.android.gms.internal.ads;

import com.applovin.impl.Z;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhmm extends zzhmp {
    private final int zza;

    private zzhmm(int i2) {
        this.zza = i2;
    }

    public static zzhmm zzb(int i2) throws GeneralSecurityException {
        if (i2 == 16 || i2 == 32) {
            return new zzhmm(i2);
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i2 * 8)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzhmm) && ((zzhmm) obj).zza == this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzhmm.class, Integer.valueOf(this.zza));
    }

    public final String toString() {
        int i2 = this.zza;
        return Z.n(new StringBuilder(String.valueOf(i2).length() + 34), "AesCmac PRF Parameters (", i2, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzhan
    public final boolean zza() {
        return false;
    }

    public final int zzc() {
        return this.zza;
    }
}
