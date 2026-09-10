package com.mbridge.msdk.playercommon.exoplayer2.upstream.crypto;

import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class AesFlushingCipher {
    private final int blockSize;
    private final Cipher cipher;
    private final byte[] flushedBlock;
    private int pendingXorBytes;
    private final byte[] zerosBlock;

    public AesFlushingCipher(int i10, byte[] bArr, long j10, long j11) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CTR/NoPadding");
            this.cipher = cipher;
            int blockSize = cipher.getBlockSize();
            this.blockSize = blockSize;
            this.zerosBlock = new byte[blockSize];
            this.flushedBlock = new byte[blockSize];
            long j12 = blockSize;
            long j13 = j11 / j12;
            int i11 = (int) (j11 % j12);
            cipher.init(i10, new SecretKeySpec(bArr, Util.splitAtFirst(cipher.getAlgorithm(), "/")[0]), new IvParameterSpec(getInitializationVector(j10, j13)));
            if (i11 != 0) {
                updateInPlace(new byte[i11], 0, i11);
            }
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException e10) {
            throw new RuntimeException(e10);
        }
    }

    private byte[] getInitializationVector(long j10, long j11) {
        return ByteBuffer.allocate(16).putLong(j10).putLong(j11).array();
    }

    private int nonFlushingUpdate(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        try {
            return this.cipher.update(bArr, i10, i11, bArr2, i12);
        } catch (ShortBufferException e10) {
            throw new RuntimeException(e10);
        }
    }

    public void update(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        do {
            int i13 = this.pendingXorBytes;
            if (i13 <= 0) {
                int iNonFlushingUpdate = nonFlushingUpdate(bArr, i10, i11, bArr2, i12);
                if (i11 == iNonFlushingUpdate) {
                    return;
                }
                int i14 = i11 - iNonFlushingUpdate;
                int i15 = 0;
                Assertions.checkState(i14 < this.blockSize);
                int i16 = i12 + iNonFlushingUpdate;
                int i17 = this.blockSize - i14;
                this.pendingXorBytes = i17;
                Assertions.checkState(nonFlushingUpdate(this.zerosBlock, 0, i17, this.flushedBlock, 0) == this.blockSize);
                while (i15 < i14) {
                    bArr2[i16] = this.flushedBlock[i15];
                    i15++;
                    i16++;
                }
                return;
            }
            bArr2[i12] = (byte) (bArr[i10] ^ this.flushedBlock[this.blockSize - i13]);
            i12++;
            i10++;
            this.pendingXorBytes = i13 - 1;
            i11--;
        } while (i11 != 0);
    }

    public void updateInPlace(byte[] bArr, int i10, int i11) {
        update(bArr, i10, i11, bArr, i10);
    }
}
