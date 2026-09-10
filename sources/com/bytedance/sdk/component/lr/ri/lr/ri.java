package com.bytedance.sdk.component.lr.ri.lr;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class ri implements ik, lr, Cloneable, ByteChannel {
    private static final byte[] ik = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long lr;
    fi ri;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ri)) {
            return false;
        }
        ri riVar = (ri) obj;
        long j = this.lr;
        if (j != riVar.lr) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        fi fiVar = this.ri;
        fi fiVar2 = riVar.ri;
        int i = fiVar.lr;
        int i2 = fiVar2.lr;
        while (j2 < this.lr) {
            long jMin = Math.min(fiVar.ik - i, fiVar2.ik - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (fiVar.ri[i] != fiVar2.ri[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == fiVar.ik) {
                fiVar = fiVar.di;
                i = fiVar.lr;
            }
            if (i2 == fiVar2.ik) {
                fiVar2 = fiVar2.di;
                i2 = fiVar2.lr;
            }
            j2 += jMin;
        }
        return true;
    }

    public final ka fi() {
        long j = this.lr;
        if (j <= 2147483647L) {
            return ka((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.lr);
    }

    public int hashCode() {
        fi fiVar = this.ri;
        if (fiVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = fiVar.ik;
            for (int i3 = fiVar.lr; i3 < i2; i3++) {
                i = (i * 31) + fiVar.ri[i3];
            }
            fiVar = fiVar.di;
        } while (fiVar != this.ri);
        return i;
    }

    public String ik() {
        try {
            return ri(this.lr, jbs.ri);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: ka, reason: merged with bridge method [inline-methods] */
    public ri clone() {
        ri riVar = new ri();
        if (this.lr == 0) {
            return riVar;
        }
        fi fiVarRi = this.ri.ri();
        riVar.ri = fiVarRi;
        fiVarRi.xha = fiVarRi;
        fiVarRi.di = fiVarRi;
        fi fiVar = this.ri;
        while (true) {
            fiVar = fiVar.di;
            if (fiVar == this.ri) {
                riVar.lr = this.lr;
                return riVar;
            }
            riVar.ri.xha.ri(fiVar.ri());
        }
    }

    public byte lr() {
        long j = this.lr;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        fi fiVar = this.ri;
        int i = fiVar.lr;
        int i2 = fiVar.ik;
        int i3 = i + 1;
        byte b = fiVar.ri[i];
        this.lr = j - 1;
        if (i3 != i2) {
            fiVar.lr = i3;
            return b;
        }
        this.ri = fiVar.lr();
        di.ri(fiVar);
        return b;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        fi fiVar = this.ri;
        if (fiVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), fiVar.ik - fiVar.lr);
        byteBuffer.put(fiVar.ri, fiVar.lr, iMin);
        int i = fiVar.lr + iMin;
        fiVar.lr = i;
        this.lr -= (long) iMin;
        if (i == fiVar.ik) {
            this.ri = fiVar.lr();
            di.ri(fiVar);
        }
        return iMin;
    }

    public boolean ri() {
        return this.lr == 0;
    }

    public String toString() {
        return fi().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            fi fiVarIk = ik(1);
            int iMin = Math.min(i, 8192 - fiVarIk.ik);
            byteBuffer.get(fiVarIk.ri, fiVarIk.ik, iMin);
            i -= iMin;
            fiVarIk.ik += iMin;
        }
        this.lr += (long) iRemaining;
        return iRemaining;
    }

    public String ri(long j, Charset charset) throws EOFException {
        jbs.ri(this.lr, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        fi fiVar = this.ri;
        int i = fiVar.lr;
        if (((long) i) + j > fiVar.ik) {
            return new String(ri(j), charset);
        }
        String str = new String(fiVar.ri, i, (int) j, charset);
        int i2 = (int) (((long) fiVar.lr) + j);
        fiVar.lr = i2;
        this.lr -= j;
        if (i2 == fiVar.ik) {
            this.ri = fiVar.lr();
            di.ri(fiVar);
        }
        return str;
    }

    public fi ik(int i) {
        if (i > 0 && i <= 8192) {
            fi fiVar = this.ri;
            if (fiVar == null) {
                fi fiVarRi = di.ri();
                this.ri = fiVarRi;
                fiVarRi.xha = fiVarRi;
                fiVarRi.di = fiVarRi;
                return fiVarRi;
            }
            fi fiVar2 = fiVar.xha;
            return (fiVar2.ik + i > 8192 || !fiVar2.fi) ? fiVar2.ri(di.ri()) : fiVar2;
        }
        throw new IllegalArgumentException();
    }

    public final ka ka(int i) {
        if (i == 0) {
            return ka.ik;
        }
        return new xha(this, i);
    }

    public ri lr(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            jbs.ri(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                fi fiVarIk = ik(1);
                int iMin = Math.min(i3 - i, 8192 - fiVarIk.ik);
                System.arraycopy(bArr, i, fiVarIk.ri, fiVarIk.ik, iMin);
                i += iMin;
                fiVarIk.ik += iMin;
            }
            this.lr += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] ri(long j) throws EOFException {
        jbs.ri(this.lr, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            ri(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public ri lr(int i) {
        fi fiVarIk = ik(1);
        byte[] bArr = fiVarIk.ri;
        int i2 = fiVarIk.ik;
        fiVarIk.ik = i2 + 1;
        bArr[i2] = (byte) i;
        this.lr++;
        return this;
    }

    public void ri(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iRi = ri(bArr, i, bArr.length - i);
            if (iRi == -1) {
                throw new EOFException();
            }
            i += iRi;
        }
    }

    public ri lr(long j) {
        if (j == 0) {
            return lr(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        fi fiVarIk = ik(iNumberOfTrailingZeros);
        byte[] bArr = fiVarIk.ri;
        int i = fiVarIk.ik;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = ik[(int) (15 & j)];
            j >>>= 4;
        }
        fiVarIk.ik += iNumberOfTrailingZeros;
        this.lr += (long) iNumberOfTrailingZeros;
        return this;
    }

    public int ri(byte[] bArr, int i, int i2) {
        jbs.ri(bArr.length, i, i2);
        fi fiVar = this.ri;
        if (fiVar == null) {
            return -1;
        }
        int iMin = Math.min(i2, fiVar.ik - fiVar.lr);
        System.arraycopy(fiVar.ri, fiVar.lr, bArr, i, iMin);
        int i3 = fiVar.lr + iMin;
        fiVar.lr = i3;
        this.lr -= (long) iMin;
        if (i3 == fiVar.ik) {
            this.ri = fiVar.lr();
            di.ri(fiVar);
        }
        return iMin;
    }

    public ri ri(String str) {
        return ri(str, 0, str.length());
    }

    public ri ri(String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
            while (i < i2) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < 128) {
                    fi fiVarIk = ik(1);
                    byte[] bArr = fiVarIk.ri;
                    int i3 = fiVarIk.ik - i;
                    int iMin = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) cCharAt2;
                    while (true) {
                        i = i4;
                        if (i >= iMin || (cCharAt = str.charAt(i)) >= 128) {
                            break;
                        }
                        i4 = i + 1;
                        bArr[i + i3] = (byte) cCharAt;
                    }
                    int i5 = fiVarIk.ik;
                    int i6 = (i3 + i) - i5;
                    fiVarIk.ik = i5 + i6;
                    this.lr += (long) i6;
                } else {
                    if (cCharAt2 < 2048) {
                        lr((cCharAt2 >> 6) | 192);
                        lr((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i7 = i + 1;
                        char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            lr((i8 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            lr(((i8 >> 12) & 63) | 128);
                            lr(((i8 >> 6) & 63) | 128);
                            lr((i8 & 63) | 128);
                            i += 2;
                        } else {
                            lr(63);
                            i = i7;
                        }
                    } else {
                        lr((cCharAt2 >> '\f') | 224);
                        lr(((cCharAt2 >> 6) & 63) | 128);
                        lr((cCharAt2 & '?') | 128);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
    }

    public ri ri(int i) {
        if (i < 128) {
            lr(i);
            return this;
        }
        if (i < 2048) {
            lr((i >> 6) | 192);
            lr((i & 63) | 128);
            return this;
        }
        if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                lr(63);
                return this;
            }
            lr((i >> 12) | 224);
            lr(((i >> 6) & 63) | 128);
            lr((i & 63) | 128);
            return this;
        }
        if (i <= 1114111) {
            lr((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            lr(((i >> 12) & 63) | 128);
            lr(((i >> 6) & 63) | 128);
            lr((i & 63) | 128);
            return this;
        }
        throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
    }

    public ri ri(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            }
            if (charset != null) {
                if (charset.equals(jbs.ri)) {
                    return ri(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return lr(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
    }
}
