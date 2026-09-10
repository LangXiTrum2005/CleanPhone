package n6;

import com.google.android.gms.internal.ads.dm0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f46612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f46613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f46614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f46616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final dm0 f46617f;

    public v(InputStream inputStream, dm0 dm0Var) {
        super(inputStream);
        this.f46615d = -1;
        this.f46617f = dm0Var;
        this.f46612a = (byte[]) dm0Var.d(byte[].class, C.DEFAULT_BUFFER_SEGMENT_SIZE);
    }

    public static void h() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i10 = this.f46615d;
        if (i10 != -1) {
            int i11 = this.f46616e - i10;
            int i12 = this.f46614c;
            if (i11 < i12) {
                if (i10 == 0 && i12 > bArr.length && this.f46613b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i12) {
                        i12 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f46617f.d(byte[].class, i12);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f46612a = bArr2;
                    this.f46617f.h(bArr);
                    bArr = bArr2;
                } else if (i10 > 0) {
                    System.arraycopy(bArr, i10, bArr, 0, bArr.length - i10);
                }
                int i13 = this.f46616e - this.f46615d;
                this.f46616e = i13;
                this.f46615d = 0;
                this.f46613b = 0;
                int i14 = inputStream.read(bArr, i13, bArr.length - i13);
                int i15 = this.f46616e;
                if (i14 > 0) {
                    i15 += i14;
                }
                this.f46613b = i15;
                return i14;
            }
        }
        int i16 = inputStream.read(bArr);
        if (i16 > 0) {
            this.f46615d = -1;
            this.f46616e = 0;
            this.f46613b = i16;
        }
        return i16;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f46612a == null || inputStream == null) {
            h();
            throw null;
        }
        return (this.f46613b - this.f46616e) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f46612a != null) {
            this.f46617f.h(this.f46612a);
            this.f46612a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void d() {
        if (this.f46612a != null) {
            this.f46617f.h(this.f46612a);
            this.f46612a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i10) {
        this.f46614c = Math.max(this.f46614c, i10);
        this.f46615d = this.f46616e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f46612a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            h();
            throw null;
        }
        if (this.f46616e >= this.f46613b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f46612a && (bArr = this.f46612a) == null) {
            h();
            throw null;
        }
        int i10 = this.f46613b;
        int i11 = this.f46616e;
        if (i10 - i11 <= 0) {
            return -1;
        }
        this.f46616e = i11 + 1;
        return bArr[i11] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f46612a == null) {
            throw new IOException("Stream is closed");
        }
        int i10 = this.f46615d;
        if (-1 == i10) {
            throw new u("Mark has been invalidated, pos: " + this.f46616e + " markLimit: " + this.f46614c);
        }
        this.f46616e = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j10) {
        if (j10 < 1) {
            return 0L;
        }
        byte[] bArr = this.f46612a;
        if (bArr == null) {
            h();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            h();
            throw null;
        }
        int i10 = this.f46613b;
        int i11 = this.f46616e;
        if (i10 - i11 >= j10) {
            this.f46616e = (int) (((long) i11) + j10);
            return j10;
        }
        long j11 = ((long) i10) - ((long) i11);
        this.f46616e = i10;
        if (this.f46615d == -1 || j10 > this.f46614c) {
            long jSkip = inputStream.skip(j10 - j11);
            if (jSkip > 0) {
                this.f46615d = -1;
            }
            return j11 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j11;
        }
        int i12 = this.f46613b;
        int i13 = this.f46616e;
        if (i12 - i13 >= j10 - j11) {
            this.f46616e = (int) ((((long) i13) + j10) - j11);
            return j10;
        }
        long j12 = (j11 + ((long) i12)) - ((long) i13);
        this.f46616e = i12;
        return j12;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = this.f46612a;
        if (bArr2 == null) {
            h();
            throw null;
        }
        if (i11 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i14 = this.f46616e;
            int i15 = this.f46613b;
            if (i14 < i15) {
                int i16 = i15 - i14;
                if (i16 >= i11) {
                    i16 = i11;
                }
                System.arraycopy(bArr2, i14, bArr, i10, i16);
                this.f46616e += i16;
                if (i16 == i11 || inputStream.available() == 0) {
                    return i16;
                }
                i10 += i16;
                i12 = i11 - i16;
            } else {
                i12 = i11;
            }
            while (true) {
                if (this.f46615d == -1 && i12 >= bArr2.length) {
                    i13 = inputStream.read(bArr, i10, i12);
                    if (i13 == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i12 != i11 ? i11 - i12 : -1;
                    }
                    if (bArr2 != this.f46612a && (bArr2 = this.f46612a) == null) {
                        h();
                        throw null;
                    }
                    int i17 = this.f46613b;
                    int i18 = this.f46616e;
                    i13 = i17 - i18;
                    if (i13 >= i12) {
                        i13 = i12;
                    }
                    System.arraycopy(bArr2, i18, bArr, i10, i13);
                    this.f46616e += i13;
                }
                i12 -= i13;
                if (i12 == 0) {
                    return i11;
                }
                if (inputStream.available() == 0) {
                    return i11 - i12;
                }
                i10 += i13;
            }
        } else {
            h();
            throw null;
        }
    }
}
