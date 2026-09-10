package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhwr implements zzhmn {
    private final ThreadLocal zza;
    private final String zzb;
    private final Key zzc;
    private final int zzd;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x005b  */
    public zzhwr(String str, Key key) throws GeneralSecurityException {
        byte b2;
        int i2;
        zzhwq zzhwqVar = new zzhwq(this);
        this.zza = zzhwqVar;
        if (!zzhhb.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zzb = str;
        this.zzc = key;
        if (key.getEncoded().length < 16) {
            throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        }
        switch (str) {
            case "HMACSHA1":
                b2 = 0;
                break;
            case "HMACSHA224":
                b2 = 1;
                break;
            case "HMACSHA256":
                b2 = 2;
                break;
            case "HMACSHA384":
                b2 = 3;
                break;
            case "HMACSHA512":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            i2 = 20;
        } else if (b2 == 1) {
            i2 = 28;
        } else if (b2 == 2) {
            i2 = 32;
        } else if (b2 == 3) {
            i2 = 48;
        } else {
            if (b2 != 4) {
                throw new NoSuchAlgorithmException("unknown Hmac algorithm: ".concat(str));
            }
            i2 = 64;
        }
        this.zzd = i2;
        zzhwqVar.get();
    }

    @Override // com.google.android.gms.internal.ads.zzhmn
    public final byte[] zza(byte[] bArr, int i2) throws GeneralSecurityException {
        if (i2 > this.zzd) {
            throw new InvalidAlgorithmParameterException("tag size too big");
        }
        ThreadLocal threadLocal = this.zza;
        ((Mac) threadLocal.get()).update(bArr);
        return Arrays.copyOf(((Mac) threadLocal.get()).doFinal(), i2);
    }

    public final /* synthetic */ String zzb() {
        return this.zzb;
    }

    public final /* synthetic */ Key zzc() {
        return this.zzc;
    }
}
