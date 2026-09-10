package com.bytedance.sdk.component.LD.Lxb.LD;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class Lxb implements LD, lk, Cloneable, ByteChannel {
    private static final byte[] lk = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    long LD;
    JXs Lxb;

    public final ZU JXs() {
        long j = this.LD;
        if (j <= 2147483647L) {
            return ZU((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.LD);
    }

    public byte LD() {
        long j = this.LD;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        JXs jXs = this.Lxb;
        int i = jXs.LD;
        int i2 = jXs.lk;
        int i3 = i + 1;
        byte b = jXs.Lxb[i];
        this.LD = j - 1;
        if (i3 == i2) {
            this.Lxb = jXs.LD();
            lc.Lxb(jXs);
        } else {
            jXs.LD = i3;
        }
        return b;
    }

    public boolean Lxb() {
        return this.LD == 0;
    }

    /* JADX INFO: renamed from: ZU, reason: merged with bridge method [inline-methods] */
    public Lxb clone() {
        Lxb lxb = new Lxb();
        if (this.LD == 0) {
            return lxb;
        }
        JXs jXsLxb = this.Lxb.Lxb();
        lxb.Lxb = jXsLxb;
        jXsLxb.ebl = jXsLxb;
        jXsLxb.lc = jXsLxb;
        JXs jXs = this.Lxb;
        while (true) {
            jXs = jXs.lc;
            if (jXs == this.Lxb) {
                lxb.LD = this.LD;
                return lxb;
            }
            lxb.Lxb.ebl.Lxb(jXs.Lxb());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Lxb)) {
            return false;
        }
        Lxb lxb = (Lxb) obj;
        long j = this.LD;
        if (j != lxb.LD) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        JXs jXs = this.Lxb;
        JXs jXs2 = lxb.Lxb;
        int i = jXs.LD;
        int i2 = jXs2.LD;
        while (j2 < this.LD) {
            long jMin = Math.min(jXs.lk - i, jXs2.lk - i2);
            int i3 = 0;
            while (i3 < jMin) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (jXs.Lxb[i] != jXs2.Lxb[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == jXs.lk) {
                jXs = jXs.lc;
                i = jXs.LD;
            }
            if (i2 == jXs2.lk) {
                jXs2 = jXs2.lc;
                i2 = jXs2.LD;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        JXs jXs = this.Lxb;
        if (jXs == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = jXs.lk;
            for (int i3 = jXs.LD; i3 < i2; i3++) {
                i = (i * 31) + jXs.Lxb[i3];
            }
            jXs = jXs.lc;
        } while (jXs != this.Lxb);
        return i;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String lk() {
        try {
            return Lxb(this.LD, QAg.Lxb);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        JXs jXs = this.Lxb;
        if (jXs == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), jXs.lk - jXs.LD);
        byteBuffer.put(jXs.Lxb, jXs.LD, iMin);
        int i = jXs.LD + iMin;
        jXs.LD = i;
        this.LD -= (long) iMin;
        if (i == jXs.lk) {
            this.Lxb = jXs.LD();
            lc.Lxb(jXs);
        }
        return iMin;
    }

    public String toString() {
        return JXs().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i = iRemaining;
        while (i > 0) {
            JXs jXsLk = lk(1);
            int iMin = Math.min(i, 8192 - jXsLk.lk);
            byteBuffer.get(jXsLk.Lxb, jXsLk.lk, iMin);
            i -= iMin;
            jXsLk.lk += iMin;
        }
        this.LD += (long) iRemaining;
        return iRemaining;
    }

    public String Lxb(long j, Charset charset) throws EOFException {
        QAg.Lxb(this.LD, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        JXs jXs = this.Lxb;
        int i = jXs.LD;
        if (((long) i) + j > jXs.lk) {
            return new String(Lxb(j), charset);
        }
        String str = new String(jXs.Lxb, i, (int) j, charset);
        int i2 = (int) (((long) jXs.LD) + j);
        jXs.LD = i2;
        this.LD -= j;
        if (i2 == jXs.lk) {
            this.Lxb = jXs.LD();
            lc.Lxb(jXs);
        }
        return str;
    }

    public JXs lk(int i) {
        if (i > 0 && i <= 8192) {
            JXs jXs = this.Lxb;
            if (jXs == null) {
                JXs jXsLxb = lc.Lxb();
                this.Lxb = jXsLxb;
                jXsLxb.ebl = jXsLxb;
                jXsLxb.lc = jXsLxb;
                return jXsLxb;
            }
            JXs jXs2 = jXs.ebl;
            return (jXs2.lk + i > 8192 || !jXs2.JXs) ? jXs2.Lxb(lc.Lxb()) : jXs2;
        }
        throw new IllegalArgumentException();
    }

    public final ZU ZU(int i) {
        if (i == 0) {
            return ZU.lk;
        }
        return new ebl(this, i);
    }

    public Lxb LD(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            QAg.Lxb(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                JXs jXsLk = lk(1);
                int iMin = Math.min(i3 - i, 8192 - jXsLk.lk);
                System.arraycopy(bArr, i, jXsLk.Lxb, jXsLk.lk, iMin);
                i += iMin;
                jXsLk.lk += iMin;
            }
            this.LD += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] Lxb(long j) throws EOFException {
        QAg.Lxb(this.LD, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            Lxb(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    public Lxb LD(int i) {
        JXs jXsLk = lk(1);
        byte[] bArr = jXsLk.Lxb;
        int i2 = jXsLk.lk;
        jXsLk.lk = i2 + 1;
        bArr[i2] = (byte) i;
        this.LD++;
        return this;
    }

    public void Lxb(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int iLxb = Lxb(bArr, i, bArr.length - i);
            if (iLxb == -1) {
                throw new EOFException();
            }
            i += iLxb;
        }
    }

    public Lxb LD(long j) {
        if (j == 0) {
            return LD(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        JXs jXsLk = lk(iNumberOfTrailingZeros);
        byte[] bArr = jXsLk.Lxb;
        int i = jXsLk.lk;
        for (int i2 = (i + iNumberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = lk[(int) (15 & j)];
            j >>>= 4;
        }
        jXsLk.lk += iNumberOfTrailingZeros;
        this.LD += (long) iNumberOfTrailingZeros;
        return this;
    }

    public int Lxb(byte[] bArr, int i, int i2) {
        QAg.Lxb(bArr.length, i, i2);
        JXs jXs = this.Lxb;
        if (jXs == null) {
            return -1;
        }
        int iMin = Math.min(i2, jXs.lk - jXs.LD);
        System.arraycopy(jXs.Lxb, jXs.LD, bArr, i, iMin);
        int i3 = jXs.LD + iMin;
        jXs.LD = i3;
        this.LD -= (long) iMin;
        if (i3 == jXs.lk) {
            this.Lxb = jXs.LD();
            lc.Lxb(jXs);
        }
        return iMin;
    }

    public Lxb Lxb(String str) {
        return Lxb(str, 0, str.length());
    }

    public Lxb Lxb(String str, int i, int i2) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                StringBuilder sbQ = AbstractC5044xl.q("endIndex > string.length: ", i2, " > ");
                sbQ.append(str.length());
                throw new IllegalArgumentException(sbQ.toString());
            }
            while (i < i2) {
                char cCharAt2 = str.charAt(i);
                if (cCharAt2 < 128) {
                    JXs jXsLk = lk(1);
                    byte[] bArr = jXsLk.Lxb;
                    int i3 = jXsLk.lk - i;
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
                    int i5 = jXsLk.lk;
                    int i6 = (i3 + i) - i5;
                    jXsLk.lk = i5 + i6;
                    this.LD += (long) i6;
                } else {
                    if (cCharAt2 < 2048) {
                        LD((cCharAt2 >> 6) | 192);
                        LD((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i7 = i + 1;
                        char cCharAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i8 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            LD((i8 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            LD(((i8 >> 12) & 63) | 128);
                            LD(((i8 >> 6) & 63) | 128);
                            LD((i8 & 63) | 128);
                            i += 2;
                        } else {
                            LD(63);
                            i = i7;
                        }
                    } else {
                        LD((cCharAt2 >> '\f') | 224);
                        LD(((cCharAt2 >> 6) & 63) | 128);
                        LD((cCharAt2 & '?') | 128);
                    }
                    i++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(AbstractC3888ke0.h("endIndex < beginIndex: ", i2, " < ", i));
    }

    public Lxb Lxb(int i) {
        if (i < 128) {
            LD(i);
        } else if (i < 2048) {
            LD((i >> 6) | 192);
            LD((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                LD(63);
            } else {
                LD((i >> 12) | 224);
                LD(((i >> 6) & 63) | 128);
                LD((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            LD((i >> 18) | PsExtractor.VIDEO_STREAM_MASK);
            LD(((i >> 12) & 63) | 128);
            LD(((i >> 6) & 63) | 128);
            LD((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public Lxb Lxb(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 >= i) {
            if (i2 > str.length()) {
                StringBuilder sbQ = AbstractC5044xl.q("endIndex > string.length: ", i2, " > ");
                sbQ.append(str.length());
                throw new IllegalArgumentException(sbQ.toString());
            }
            if (charset != null) {
                if (charset.equals(QAg.Lxb)) {
                    return Lxb(str, i, i2);
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                return LD(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(AbstractC3888ke0.h("endIndex < beginIndex: ", i2, " < ", i));
    }
}
