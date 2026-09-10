package com.bytedance.sdk.component.JXs.lk.Lxb.Lxb;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
class lk implements Closeable {
    private int JXs;
    private final Charset LD;
    private final InputStream Lxb;
    private int ZU;
    private byte[] lk;

    public lk(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    private void lk() throws IOException {
        InputStream inputStream = this.Lxb;
        byte[] bArr = this.lk;
        int i = inputStream.read(bArr, 0, bArr.length);
        if (i == -1) {
            throw new EOFException();
        }
        this.ZU = 0;
        this.JXs = i;
    }

    public boolean LD() {
        return this.JXs == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.Lxb) {
            try {
                if (this.lk != null) {
                    this.lk = null;
                    this.Lxb.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lk(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(ZU.Lxb)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.Lxb = inputStream;
        this.LD = charset;
        this.lk = new byte[i];
    }

    /* JADX WARN: Code duplicated, block: B:21:0x002f  */
    public String Lxb() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.Lxb) {
            try {
                if (this.lk == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.ZU >= this.JXs) {
                    lk();
                }
                for (int i3 = this.ZU; i3 != this.JXs; i3++) {
                    byte[] bArr2 = this.lk;
                    if (bArr2[i3] == 10) {
                        int i4 = this.ZU;
                        if (i3 != i4) {
                            i2 = i3 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i3;
                            }
                        } else {
                            i2 = i3;
                        }
                        String str = new String(bArr2, i4, i2 - i4, this.LD.name());
                        this.ZU = i3 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.JXs - this.ZU) + 80) { // from class: com.bytedance.sdk.component.JXs.lk.Lxb.Lxb.lk.1
                    @Override // java.io.ByteArrayOutputStream
                    public String toString() {
                        int i5 = ((ByteArrayOutputStream) this).count;
                        if (i5 > 0 && ((ByteArrayOutputStream) this).buf[i5 - 1] == 13) {
                            i5--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i5, lk.this.LD.name());
                        } catch (UnsupportedEncodingException e) {
                            throw new AssertionError(e);
                        }
                    }
                };
                loop1: while (true) {
                    byte[] bArr3 = this.lk;
                    int i5 = this.ZU;
                    byteArrayOutputStream.write(bArr3, i5, this.JXs - i5);
                    this.JXs = -1;
                    lk();
                    i = this.ZU;
                    while (i != this.JXs) {
                        bArr = this.lk;
                        if (bArr[i] == 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                int i6 = this.ZU;
                if (i != i6) {
                    byteArrayOutputStream.write(bArr, i6, i - i6);
                }
                this.ZU = i + 1;
                return byteArrayOutputStream.toString();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
