package cloop;

import com.google.crypto.tink.config.internal.TinkFipsUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import javax.crypto.AEADBadTagException;

/* JADX INFO: compiled from: InsecureNonceChaCha20Poly1305Base.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class supplicat {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final TinkFipsUtil.AlgorithmFipsCompatibility f15708dern = TinkFipsUtil.AlgorithmFipsCompatibility.ALGORITHM_NOT_FIPS;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final sealless f15709attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final sealless f15710saneness;

    public supplicat(byte[] bArr) throws GeneralSecurityException {
        if (!f15708dern.isCompatible()) {
            throw new GeneralSecurityException("Can not use ChaCha20Poly1305 in FIPS-mode.");
        }
        this.f15709attabal = wireman(bArr, 1);
        this.f15710saneness = wireman(bArr, 0);
    }

    public static byte[] dern(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining % 16;
        int i2 = (i == 0 ? iRemaining : (iRemaining + 16) - i) + length;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr);
        byteBufferOrder.position(length);
        byteBufferOrder.put(byteBuffer);
        byteBufferOrder.position(i2);
        byteBufferOrder.putLong(bArr.length);
        byteBufferOrder.putLong(iRemaining);
        return byteBufferOrder.array();
    }

    public byte[] attabal(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() < 16) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        int iPosition = byteBuffer.position();
        byte[] bArr3 = new byte[16];
        byteBuffer.position(byteBuffer.limit() - 16);
        byteBuffer.get(bArr3);
        byteBuffer.position(iPosition);
        byteBuffer.limit(byteBuffer.limit() - 16);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        try {
            seminary.beachfront(saneness(bArr), dern(bArr2, byteBuffer), bArr3);
            byteBuffer.position(iPosition);
            return this.f15709attabal.dern(bArr, byteBuffer);
        } catch (GeneralSecurityException e) {
            throw new AEADBadTagException(e.toString());
        }
    }

    public final byte[] saneness(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = new byte[32];
        this.f15710saneness.attabal(bArr, 0).get(bArr2);
        return bArr2;
    }

    public abstract sealless wireman(byte[] bArr, int i) throws InvalidKeyException;
}
