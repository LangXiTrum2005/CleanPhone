package com.inmobi.media;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class Fd implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f22828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f22829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f22830c;
    public int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22831e;

    public Fd(FileInputStream fileInputStream, Charset charset) {
        charset.getClass();
        if (!charset.equals(Ge.f22851a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f22828a = fileInputStream;
        this.f22829b = charset;
        this.f22830c = new byte[Segment.SIZE];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041  */
    public final String a() {
        int i2;
        synchronized (this.f22828a) {
            try {
                byte[] bArr = this.f22830c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.d >= this.f22831e) {
                    int i3 = this.f22828a.read(bArr, 0, bArr.length);
                    if (i3 == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.f22831e = i3;
                }
                for (int i4 = this.d; i4 != this.f22831e; i4++) {
                    byte[] bArr2 = this.f22830c;
                    if (bArr2[i4] == 10) {
                        int i5 = this.d;
                        if (i4 != i5) {
                            i2 = i4 - 1;
                            if (bArr2[i2] != 13) {
                                i2 = i4;
                            }
                        } else {
                            i2 = i4;
                        }
                        String str = new String(bArr2, i5, i2 - i5, this.f22829b.name());
                        this.d = i4 + 1;
                        return str;
                    }
                }
                Ed ed = new Ed(this, (this.f22831e - this.d) + 80);
                while (true) {
                    byte[] bArr3 = this.f22830c;
                    int i6 = this.d;
                    ed.write(bArr3, i6, this.f22831e - i6);
                    this.f22831e = -1;
                    FileInputStream fileInputStream = this.f22828a;
                    byte[] bArr4 = this.f22830c;
                    int i7 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i7 == -1) {
                        throw new EOFException();
                    }
                    this.d = 0;
                    this.f22831e = i7;
                    for (int i8 = 0; i8 != this.f22831e; i8++) {
                        byte[] bArr5 = this.f22830c;
                        if (bArr5[i8] == 10) {
                            int i9 = this.d;
                            if (i8 != i9) {
                                ed.write(bArr5, i9, i8 - i9);
                            }
                            this.d = i8 + 1;
                            return ed.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f22828a) {
            try {
                if (this.f22830c != null) {
                    this.f22830c = null;
                    this.f22828a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
