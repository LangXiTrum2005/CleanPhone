package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgf extends zzhgc {
    public zzhgf(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final int[] zza(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzhga.zza(iArr2, zzhga.zze(this.zza, iArr));
        iArr2[12] = i2;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final int zzb() {
        return 24;
    }
}
