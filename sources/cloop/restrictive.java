package cloop;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: InsecureNonceXChaCha20.java */
/* JADX INFO: loaded from: classes3.dex */
public class restrictive extends sealless {
    public restrictive(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // cloop.sealless
    public /* bridge */ /* synthetic */ byte[] dern(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.dern(bArr, byteBuffer);
    }

    @Override // cloop.sealless
    public int[] saneness(int[] iArr, int i) {
        if (iArr.length != wireman() / 4) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        trm.marial(iArr2, trm.saneness(this.f15700attabal, iArr));
        iArr2[12] = i;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }

    @Override // cloop.sealless
    public int wireman() {
        return 24;
    }
}
