package cloop;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: compiled from: InsecureNonceChaCha20Base.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class sealless {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public int[] f15700attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final int f15701saneness;

    public sealless(byte[] bArr, int i) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f15700attabal = trm.impromptu(bArr);
        this.f15701saneness = i;
    }

    public ByteBuffer attabal(byte[] bArr, int i) {
        int[] iArrSaneness = saneness(trm.impromptu(bArr), i);
        int[] iArr = (int[]) iArrSaneness.clone();
        trm.beachfront(iArr);
        for (int i2 = 0; i2 < iArrSaneness.length; i2++) {
            iArrSaneness[i2] = iArrSaneness[i2] + iArr[i2];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrSaneness, 0, 16);
        return byteBufferOrder;
    }

    public byte[] dern(byte[] bArr, ByteBuffer byteBuffer) throws GeneralSecurityException {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.remaining());
        marial(bArr, byteBufferAllocate, byteBuffer);
        return byteBufferAllocate.array();
    }

    public final void marial(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        if (bArr.length != wireman()) {
            throw new GeneralSecurityException("The nonce length (in bytes) must be " + wireman());
        }
        int iRemaining = byteBuffer2.remaining();
        int i = iRemaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferAttabal = attabal(bArr, this.f15701saneness + i3);
            if (i3 == i) {
                affiche.marial.dern(byteBuffer, byteBuffer2, byteBufferAttabal, iRemaining % 64);
            } else {
                affiche.marial.dern(byteBuffer, byteBuffer2, byteBufferAttabal, 64);
            }
        }
    }

    public abstract int[] saneness(int[] iArr, int i);

    public abstract int wireman();
}
