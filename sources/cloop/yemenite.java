package cloop;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: InsecureNonceChaCha20.java */
/* JADX INFO: loaded from: classes3.dex */
public class yemenite extends sealless {
    public yemenite(byte[] bArr, int i) throws InvalidKeyException {
        super(bArr, i);
    }

    @Override // cloop.sealless
    public /* bridge */ /* synthetic */ byte[] dern(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        return super.dern(bArr, byteBuffer);
    }

    @Override // cloop.sealless
    public int[] saneness(int[] iArr, int i) {
        if (iArr.length != wireman() / 4) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr2 = new int[16];
        trm.marial(iArr2, this.f15700attabal);
        iArr2[12] = i;
        System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
        return iArr2;
    }

    @Override // cloop.sealless
    public int wireman() {
        return 12;
    }
}
