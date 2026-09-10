package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhrf {
    private zzhri zza = null;
    private zzhxd zzb = null;

    private zzhrf() {
    }

    public final zzhrf zza(zzhri zzhriVar) {
        this.zza = zzhriVar;
        return this;
    }

    public final zzhrf zzb(zzhxd zzhxdVar) {
        this.zzb = zzhxdVar;
        return this;
    }

    public final zzhrg zzc() throws GeneralSecurityException {
        zzhri zzhriVar = this.zza;
        if (zzhriVar == null) {
            throw new GeneralSecurityException("Cannot build without a ecdsa public key");
        }
        zzhxd zzhxdVar = this.zzb;
        if (zzhxdVar == null) {
            throw new GeneralSecurityException("Cannot build without a private value");
        }
        BigInteger bigIntegerZzb = zzhxdVar.zzb(zzgzv.zza());
        ECPoint eCPointZzd = zzhriVar.zzd();
        zzhra zzhraVarZzd = zzhriVar.zzf().zzd();
        BigInteger order = zzhraVarZzd.zza().getOrder();
        if (bigIntegerZzb.signum() <= 0 || bigIntegerZzb.compareTo(order) >= 0) {
            throw new GeneralSecurityException("Invalid private value");
        }
        if (zzhhq.zzd(bigIntegerZzb, zzhraVarZzd.zza()).equals(eCPointZzd)) {
            return new zzhrg(this.zza, this.zzb, null);
        }
        throw new GeneralSecurityException("Invalid private value");
    }

    public /* synthetic */ zzhrf(byte[] bArr) {
    }
}
