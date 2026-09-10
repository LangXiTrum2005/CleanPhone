package com.google.android.gms.internal.ads;

import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzhgb extends zzhgc {
    public zzhgb(byte[] bArr, int i2) throws InvalidKeyException {
        super(bArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final int[] zza(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzhga.zza(iArr2, this.zza);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgc
    public final int zzb() {
        return 12;
    }
}
