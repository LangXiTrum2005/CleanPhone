package cloop;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: InsecureNonceChaCha20Poly1305.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kattegat extends supplicat {
    public kattegat(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // cloop.supplicat
    public /* bridge */ /* synthetic */ byte[] attabal(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.attabal(byteBuffer, bArr, bArr2);
    }

    @Override // cloop.supplicat
    public sealless wireman(byte[] bArr, int i) throws InvalidKeyException {
        return new yemenite(bArr, i);
    }
}
