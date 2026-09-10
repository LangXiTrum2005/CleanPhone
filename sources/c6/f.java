package c6;

import com.applovin.shadow.okio.Segment;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f5949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f5950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f5951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5953e;

    public f(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(g.f5954a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f5949a = fileInputStream;
        this.f5950b = charset;
        this.f5951c = new byte[Segment.SIZE];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f5949a) {
            try {
                if (this.f5951c != null) {
                    this.f5951c = null;
                    this.f5949a.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String d() {
        int i10;
        synchronized (this.f5949a) {
            try {
                byte[] bArr = this.f5951c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f5952d >= this.f5953e) {
                    int i11 = this.f5949a.read(bArr, 0, bArr.length);
                    if (i11 == -1) {
                        throw new EOFException();
                    }
                    this.f5952d = 0;
                    this.f5953e = i11;
                }
                for (int i12 = this.f5952d; i12 != this.f5953e; i12++) {
                    byte[] bArr2 = this.f5951c;
                    if (bArr2[i12] == 10) {
                        int i13 = this.f5952d;
                        if (i12 != i13) {
                            i10 = i12 - 1;
                            if (bArr2[i10] != 13) {
                                i10 = i12;
                            }
                        } else {
                            i10 = i12;
                        }
                        String str = new String(bArr2, i13, i10 - i13, this.f5950b.name());
                        this.f5952d = i12 + 1;
                        return str;
                    }
                }
                e eVar = new e(this, (this.f5953e - this.f5952d) + 80);
                while (true) {
                    byte[] bArr3 = this.f5951c;
                    int i14 = this.f5952d;
                    eVar.write(bArr3, i14, this.f5953e - i14);
                    this.f5953e = -1;
                    FileInputStream fileInputStream = this.f5949a;
                    byte[] bArr4 = this.f5951c;
                    int i15 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i15 == -1) {
                        throw new EOFException();
                    }
                    this.f5952d = 0;
                    this.f5953e = i15;
                    for (int i16 = 0; i16 != this.f5953e; i16++) {
                        byte[] bArr5 = this.f5951c;
                        if (bArr5[i16] == 10) {
                            int i17 = this.f5952d;
                            if (i16 != i17) {
                                eVar.write(bArr5, i17, i16 - i17);
                            }
                            this.f5952d = i16 + 1;
                            return eVar.toString();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
