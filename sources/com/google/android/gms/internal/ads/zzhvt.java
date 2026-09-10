package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhvt implements zzhaq {
    private final zzhxc zza;
    private final byte[] zzb;
    private final byte[] zzc;

    private zzhvt(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (!zzhhb.zza(1)) {
            throw new IllegalStateException(new GeneralSecurityException("Can not use Ed25519 in FIPS-mode."));
        }
        if (bArr.length != 32) {
            throw new IllegalArgumentException("Given public key's length is not 32.");
        }
        this.zza = zzhxc.zza(bArr);
        this.zzb = bArr2;
        this.zzc = bArr3;
        zzhhm.zzd();
    }

    public static zzhaq zzb(zzhrv zzhrvVar) throws GeneralSecurityException {
        if (!zzhhb.zza(1)) {
            throw new GeneralSecurityException("Can not use Ed25519 in FIPS-mode.");
        }
        try {
            return zzhum.zzb(zzhrvVar);
        } catch (GeneralSecurityException unused) {
            return new zzhvt(zzhrvVar.zzd().zzc(), zzhrvVar.zze().zzc(), zzhrvVar.zzf().zzc().equals(zzhrn.zzc) ? new byte[]{0} : new byte[0]);
        }
    }

    private final void zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length != 64) {
            throw new GeneralSecurityException("The length of the signature is not 64.");
        }
        if (!zzhhm.zzc(bArr2, bArr, this.zza.zzc())) {
            throw new GeneralSecurityException("Signature check failed.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhaq
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0 && this.zzc.length == 0) {
            zzc(bArr, bArr2);
        } else {
            if (!zzhkl.zze(bArr3, bArr)) {
                throw new GeneralSecurityException("Invalid signature (output prefix mismatch)");
            }
            byte[] bArr4 = this.zzc;
            if (bArr4.length != 0) {
                bArr2 = zzhvp.zza(bArr2, bArr4);
            }
            zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
        }
    }
}
