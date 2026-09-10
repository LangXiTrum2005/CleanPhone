package com.bytedance.sdk.component.mzz.lnr.qdl.qdl;

import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class lnr implements Closeable {
    private byte[] lnr;
    private int mml;
    private int mzz;
    private final InputStream qdl;
    private final Charset ud;

    public lnr(InputStream inputStream, Charset charset) {
        this(inputStream, Segment.SIZE, charset);
    }

    private void lnr() throws IOException {
        InputStream inputStream = this.qdl;
        byte[] bArr = this.lnr;
        int i2 = inputStream.read(bArr, 0, bArr.length);
        if (i2 == -1) {
            throw new EOFException();
        }
        this.mml = 0;
        this.mzz = i2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.qdl) {
            try {
                if (this.lnr != null) {
                    this.lnr = null;
                    this.qdl.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean ud() {
        return this.mzz == -1;
    }

    public lnr(InputStream inputStream, int i2, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(mml.qdl)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.qdl = inputStream;
        this.ud = charset;
        this.lnr = new byte[i2];
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String qdl() throws IOException {
        int i2;
        byte[] bArr;
        int i3;
        synchronized (this.qdl) {
            try {
                if (this.lnr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.mml >= this.mzz) {
                    lnr();
                }
                for (int i4 = this.mml; i4 != this.mzz; i4++) {
                    byte[] bArr2 = this.lnr;
                    if (bArr2[i4] == 10) {
                        int i5 = this.mml;
                        if (i4 != i5) {
                            i3 = i4 - 1;
                            if (bArr2[i3] != 13) {
                                i3 = i4;
                            }
                        } else {
                            i3 = i4;
                        }
                        String str = new String(bArr2, i5, i3 - i5, this.ud.name());
                        this.mml = i4 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.mzz - this.mml) + 80) { // from class: com.bytedance.sdk.component.mzz.lnr.qdl.qdl.lnr.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i6 = ((ByteArrayOutputStream) this).count;
                        if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                            i6--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i6, lnr.this.ud.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.lnr;
                    int i6 = this.mml;
                    byteArrayOutputStream.write(bArr3, i6, this.mzz - i6);
                    this.mzz = -1;
                    lnr();
                    i2 = this.mml;
                    while (i2 != this.mzz) {
                        bArr = this.lnr;
                        if (bArr[i2] == 10) {
                            break loop1;
                        }
                        i2++;
                    }
                }
                int i7 = this.mml;
                if (i2 != i7) {
                    byteArrayOutputStream.write(bArr, i7, i2 - i7);
                }
                this.mml = i2 + 1;
                return byteArrayOutputStream.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
