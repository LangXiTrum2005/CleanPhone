package com.bumptech.glide.disklrucache;

import com.applovin.shadow.okio.Segment;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
class StrictLineReader implements Closeable {
    public final FileInputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Charset f12324Y;
    public byte[] Z;
    public int e0;
    public int f0;

    public StrictLineReader(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(Util.f12325a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.X = fileInputStream;
        this.f12324Y = charset;
        this.Z = new byte[Segment.SIZE];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.X) {
            try {
                if (this.Z != null) {
                    this.Z = null;
                    this.X.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String d() {
        int i2;
        synchronized (this.X) {
            try {
                byte[] bArr = this.Z;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.e0 >= this.f0) {
                    int i3 = this.X.read(bArr, 0, bArr.length);
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.e0 = 0;
                    this.f0 = i3;
                }
                for (int i4 = this.e0; i4 != this.f0; i4++) {
                    byte[] bArr2 = this.Z;
                    if (bArr2[i4] == 10) {
                        int i5 = this.e0;
                        if (i4 != i5) {
                            i2 = i4 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i4;
                            }
                        } else {
                            i2 = i4;
                        }
                        String str = new String(bArr2, i5, i2 - i5, this.f12324Y.name());
                        this.e0 = i4 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.f0 - this.e0) + 80) { // from class: com.bumptech.glide.disklrucache.StrictLineReader.1
                    @Override // java.io.ByteArrayOutputStream
                    public final String toString() {
                        int i6 = ((ByteArrayOutputStream) this).count;
                        if (i6 > 0 && ((ByteArrayOutputStream) this).buf[i6 - 1] == 13) {
                            i6--;
                        }
                        try {
                            return new String(((ByteArrayOutputStream) this).buf, 0, i6, StrictLineReader.this.f12324Y.name());
                        } catch (UnsupportedEncodingException e2) {
                            throw new AssertionError(e2);
                        }
                    }
                };
                while (true) {
                    byte[] bArr3 = this.Z;
                    int i6 = this.e0;
                    byteArrayOutputStream.write(bArr3, i6, this.f0 - i6);
                    this.f0 = -1;
                    byte[] bArr4 = this.Z;
                    int i7 = this.X.read(bArr4, 0, bArr4.length);
                    if (i7 == -1) {
                        throw new EOFException();
                    }
                    this.e0 = 0;
                    this.f0 = i7;
                    for (int i8 = 0; i8 != this.f0; i8++) {
                        byte[] bArr5 = this.Z;
                        if (bArr5[i8] == 10) {
                            int i9 = this.e0;
                            if (i8 != i9) {
                                byteArrayOutputStream.write(bArr5, i9, i8 - i9);
                            }
                            this.e0 = i8 + 1;
                            return byteArrayOutputStream.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
