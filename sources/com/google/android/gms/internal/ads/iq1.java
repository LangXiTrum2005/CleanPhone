package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class iq1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final co.c f15827d = new co.c(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecretKeySpec f15828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15830c;

    public iq1(byte[] bArr, int i10) throws GeneralSecurityException {
        if (!jc1.e(2)) {
            throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
        }
        ic1.c(bArr.length);
        this.f15828a = new SecretKeySpec(bArr, "AES");
        int blockSize = ((Cipher) f15827d.get()).getBlockSize();
        this.f15830c = blockSize;
        if (i10 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f15829b = i10;
    }
}
