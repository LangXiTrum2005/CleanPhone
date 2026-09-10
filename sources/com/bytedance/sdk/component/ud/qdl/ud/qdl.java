package com.bytedance.sdk.component.ud.qdl.ud;

import android.support.v4.media.a;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class qdl implements lnr, ud, Cloneable, ByteChannel {
    private static final byte[] lnr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    mzz qdl;
    long ud;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qdl)) {
            return false;
        }
        qdl qdlVar = (qdl) obj;
        long j = this.ud;
        if (j != qdlVar.ud) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        mzz mzzVar = this.qdl;
        mzz mzzVar2 = qdlVar.qdl;
        int i2 = mzzVar.ud;
        int i3 = mzzVar2.ud;
        while (j2 < this.ud) {
            long jMin = Math.min(mzzVar.lnr - i2, mzzVar2.lnr - i3);
            int i4 = 0;
            while (i4 < jMin) {
                int i5 = i2 + 1;
                int i6 = i3 + 1;
                if (mzzVar.qdl[i2] != mzzVar2.qdl[i3]) {
                    return false;
                }
                i4++;
                i2 = i5;
                i3 = i6;
            }
            if (i2 == mzzVar.lnr) {
                mzzVar = mzzVar.mo;
                i2 = mzzVar.ud;
            }
            if (i3 == mzzVar2.lnr) {
                mzzVar2 = mzzVar2.mo;
                i3 = mzzVar2.ud;
            }
            j2 += jMin;
        }
        return true;
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    public int hashCode() {
        mzz mzzVar = this.qdl;
        if (mzzVar == null) {
            return 0;
        }
        int i2 = 1;
        do {
            int i3 = mzzVar.lnr;
            for (int i4 = mzzVar.ud; i4 < i3; i4++) {
                i2 = (i2 * 31) + mzzVar.qdl[i4];
            }
            mzzVar = mzzVar.mo;
        } while (mzzVar != this.qdl);
        return i2;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public String lnr() {
        try {
            return qdl(this.ud, tvp.qdl);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: mml, reason: merged with bridge method [inline-methods] */
    public qdl clone() {
        qdl qdlVar = new qdl();
        if (this.ud == 0) {
            return qdlVar;
        }
        mzz mzzVarQdl = this.qdl.qdl();
        qdlVar.qdl = mzzVarQdl;
        mzzVarQdl.wd = mzzVarQdl;
        mzzVarQdl.mo = mzzVarQdl;
        mzz mzzVar = this.qdl;
        while (true) {
            mzzVar = mzzVar.mo;
            if (mzzVar == this.qdl) {
                qdlVar.ud = this.ud;
                return qdlVar;
            }
            qdlVar.qdl.wd.qdl(mzzVar.qdl());
        }
    }

    public final mml mzz() {
        long j = this.ud;
        if (j <= 2147483647L) {
            return mml((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.ud);
    }

    public boolean qdl() {
        return this.ud == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        mzz mzzVar = this.qdl;
        if (mzzVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), mzzVar.lnr - mzzVar.ud);
        byteBuffer.put(mzzVar.qdl, mzzVar.ud, iMin);
        int i2 = mzzVar.ud + iMin;
        mzzVar.ud = i2;
        this.ud -= (long) iMin;
        if (i2 == mzzVar.lnr) {
            this.qdl = mzzVar.ud();
            mo.qdl(mzzVar);
        }
        return iMin;
    }

    public String toString() {
        return mzz().toString();
    }

    public byte ud() {
        long j = this.ud;
        if (j == 0) {
            throw new IllegalStateException("size == 0");
        }
        mzz mzzVar = this.qdl;
        int i2 = mzzVar.ud;
        int i3 = mzzVar.lnr;
        int i4 = i2 + 1;
        byte b2 = mzzVar.qdl[i2];
        this.ud = j - 1;
        if (i4 != i3) {
            mzzVar.ud = i4;
            return b2;
        }
        this.qdl = mzzVar.ud();
        mo.qdl(mzzVar);
        return b2;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int iRemaining = byteBuffer.remaining();
        int i2 = iRemaining;
        while (i2 > 0) {
            mzz mzzVarLnr = lnr(1);
            int iMin = Math.min(i2, 8192 - mzzVarLnr.lnr);
            byteBuffer.get(mzzVarLnr.qdl, mzzVarLnr.lnr, iMin);
            i2 -= iMin;
            mzzVarLnr.lnr += iMin;
        }
        this.ud += (long) iRemaining;
        return iRemaining;
    }

    public String qdl(long j, Charset charset) throws EOFException {
        tvp.qdl(this.ud, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        mzz mzzVar = this.qdl;
        int i2 = mzzVar.ud;
        if (((long) i2) + j > mzzVar.lnr) {
            return new String(qdl(j), charset);
        }
        String str = new String(mzzVar.qdl, i2, (int) j, charset);
        int i3 = (int) (((long) mzzVar.ud) + j);
        mzzVar.ud = i3;
        this.ud -= j;
        if (i3 == mzzVar.lnr) {
            this.qdl = mzzVar.ud();
            mo.qdl(mzzVar);
        }
        return str;
    }

    public mzz lnr(int i2) {
        if (i2 > 0 && i2 <= 8192) {
            mzz mzzVar = this.qdl;
            if (mzzVar == null) {
                mzz mzzVarQdl = mo.qdl();
                this.qdl = mzzVarQdl;
                mzzVarQdl.wd = mzzVarQdl;
                mzzVarQdl.mo = mzzVarQdl;
                return mzzVarQdl;
            }
            mzz mzzVar2 = mzzVar.wd;
            return (mzzVar2.lnr + i2 > 8192 || !mzzVar2.mzz) ? mzzVar2.qdl(mo.qdl()) : mzzVar2;
        }
        throw new IllegalArgumentException();
    }

    public final mml mml(int i2) {
        if (i2 == 0) {
            return mml.lnr;
        }
        return new wd(this, i2);
    }

    public qdl ud(byte[] bArr, int i2, int i3) {
        if (bArr != null) {
            long j = i3;
            tvp.qdl(bArr.length, i2, j);
            int i4 = i3 + i2;
            while (i2 < i4) {
                mzz mzzVarLnr = lnr(1);
                int iMin = Math.min(i4 - i2, 8192 - mzzVarLnr.lnr);
                System.arraycopy(bArr, i2, mzzVarLnr.qdl, mzzVarLnr.lnr, iMin);
                i2 += iMin;
                mzzVarLnr.lnr += iMin;
            }
            this.ud += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public byte[] qdl(long j) throws EOFException {
        tvp.qdl(this.ud, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            qdl(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    public void qdl(byte[] bArr) throws EOFException {
        int i2 = 0;
        while (i2 < bArr.length) {
            int iQdl = qdl(bArr, i2, bArr.length - i2);
            if (iQdl == -1) {
                throw new EOFException();
            }
            i2 += iQdl;
        }
    }

    public qdl ud(int i2) {
        mzz mzzVarLnr = lnr(1);
        byte[] bArr = mzzVarLnr.qdl;
        int i3 = mzzVarLnr.lnr;
        mzzVarLnr.lnr = i3 + 1;
        bArr[i3] = (byte) i2;
        this.ud++;
        return this;
    }

    public int qdl(byte[] bArr, int i2, int i3) {
        tvp.qdl(bArr.length, i2, i3);
        mzz mzzVar = this.qdl;
        if (mzzVar == null) {
            return -1;
        }
        int iMin = Math.min(i3, mzzVar.lnr - mzzVar.ud);
        System.arraycopy(mzzVar.qdl, mzzVar.ud, bArr, i2, iMin);
        int i4 = mzzVar.ud + iMin;
        mzzVar.ud = i4;
        this.ud -= (long) iMin;
        if (i4 == mzzVar.lnr) {
            this.qdl = mzzVar.ud();
            mo.qdl(mzzVar);
        }
        return iMin;
    }

    public qdl ud(long j) {
        if (j == 0) {
            return ud(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        mzz mzzVarLnr = lnr(iNumberOfTrailingZeros);
        byte[] bArr = mzzVarLnr.qdl;
        int i2 = mzzVarLnr.lnr;
        for (int i3 = (i2 + iNumberOfTrailingZeros) - 1; i3 >= i2; i3--) {
            bArr[i3] = lnr[(int) (15 & j)];
            j >>>= 4;
        }
        mzzVarLnr.lnr += iNumberOfTrailingZeros;
        this.ud += (long) iNumberOfTrailingZeros;
        return this;
    }

    public qdl qdl(String str) {
        return qdl(str, 0, str.length());
    }

    public qdl qdl(String str, int i2, int i3) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i2)));
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                StringBuilder sbU = a.u(i3, "endIndex > string.length: ", " > ");
                sbU.append(str.length());
                throw new IllegalArgumentException(sbU.toString());
            }
            while (i2 < i3) {
                char cCharAt2 = str.charAt(i2);
                if (cCharAt2 < 128) {
                    mzz mzzVarLnr = lnr(1);
                    byte[] bArr = mzzVarLnr.qdl;
                    int i4 = mzzVarLnr.lnr - i2;
                    int iMin = Math.min(i3, 8192 - i4);
                    int i5 = i2 + 1;
                    bArr[i2 + i4] = (byte) cCharAt2;
                    while (true) {
                        i2 = i5;
                        if (i2 >= iMin || (cCharAt = str.charAt(i2)) >= 128) {
                            break;
                        }
                        i5 = i2 + 1;
                        bArr[i2 + i4] = (byte) cCharAt;
                    }
                    int i6 = mzzVarLnr.lnr;
                    int i7 = (i4 + i2) - i6;
                    mzzVarLnr.lnr = i6 + i7;
                    this.ud += (long) i7;
                } else {
                    if (cCharAt2 < 2048) {
                        ud((cCharAt2 >> 6) | PsExtractor.AUDIO_STREAM);
                        ud((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i8 = i2 + 1;
                        char cCharAt3 = i8 < i3 ? str.charAt(i8) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i9 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            ud((i9 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                            ud(((i9 >> 12) & 63) | 128);
                            ud(((i9 >> 6) & 63) | 128);
                            ud((i9 & 63) | 128);
                            i2 += 2;
                        } else {
                            ud(63);
                            i2 = i8;
                        }
                    } else {
                        ud((cCharAt2 >> '\f') | 224);
                        ud(((cCharAt2 >> 6) & 63) | 128);
                        ud((cCharAt2 & '?') | 128);
                    }
                    i2++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(a.g(i3, i2, "endIndex < beginIndex: ", " < "));
    }

    public qdl qdl(int i2) {
        if (i2 < 128) {
            ud(i2);
            return this;
        }
        if (i2 < 2048) {
            ud((i2 >> 6) | PsExtractor.AUDIO_STREAM);
            ud((i2 & 63) | 128);
            return this;
        }
        if (i2 >= 65536) {
            if (i2 <= 1114111) {
                ud((i2 >> 18) | PsExtractor.VIDEO_STREAM_MASK);
                ud(((i2 >> 12) & 63) | 128);
                ud(((i2 >> 6) & 63) | 128);
                ud((i2 & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException(androidx.datastore.preferences.protobuf.a.h(i2, new StringBuilder("Unexpected code point: ")));
        }
        if (i2 >= 55296 && i2 <= 57343) {
            ud(63);
            return this;
        }
        ud((i2 >> 12) | 224);
        ud(((i2 >> 6) & 63) | 128);
        ud((i2 & 63) | 128);
        return this;
    }

    public qdl qdl(String str, int i2, int i3, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i2 < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i2)));
        }
        if (i3 >= i2) {
            if (i3 > str.length()) {
                StringBuilder sbU = a.u(i3, "endIndex > string.length: ", " > ");
                sbU.append(str.length());
                throw new IllegalArgumentException(sbU.toString());
            }
            if (charset != null) {
                if (charset.equals(tvp.qdl)) {
                    return qdl(str, i2, i3);
                }
                byte[] bytes = str.substring(i2, i3).getBytes(charset);
                return ud(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException("charset == null");
        }
        throw new IllegalArgumentException(a.g(i3, i2, "endIndex < beginIndex: ", " < "));
    }
}
