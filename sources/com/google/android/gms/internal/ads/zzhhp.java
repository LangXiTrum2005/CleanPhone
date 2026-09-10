package com.google.android.gms.internal.ads;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhp {
    static final zzhhp zzd;
    final BigInteger zza;
    final BigInteger zzb;
    final BigInteger zzc;

    static {
        BigInteger bigInteger = BigInteger.ONE;
        zzd = new zzhhp(bigInteger, bigInteger, BigInteger.ZERO);
    }

    public zzhhp(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.zza = bigInteger;
        this.zzb = bigInteger2;
        this.zzc = bigInteger3;
    }

    public final boolean zza() {
        return this.zzc.equals(BigInteger.ZERO);
    }
}
