package cloop;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: InsecureNonceXChaCha20Poly1305.java */
/* JADX INFO: loaded from: classes3.dex */
public final class merc extends supplicat {
    public merc(byte[] bArr) throws GeneralSecurityException {
        super(bArr);
    }

    @Override // cloop.supplicat
    public /* bridge */ /* synthetic */ byte[] attabal(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return super.attabal(byteBuffer, bArr, bArr2);
    }

    @Override // cloop.supplicat
    public sealless wireman(byte[] bArr, int i) throws InvalidKeyException {
        return new restrictive(bArr, i);
    }
}
