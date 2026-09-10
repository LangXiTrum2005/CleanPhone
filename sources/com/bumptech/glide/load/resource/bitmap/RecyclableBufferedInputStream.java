package com.bumptech.glide.load.resource.bitmap;

import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.inmobi.commons.core.configs.AdConfig;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class RecyclableBufferedInputStream extends FilterInputStream {
    public volatile byte[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f12684Y;
    public int Z;
    public int e0;
    public int f0;
    public final LruArrayPool g0;

    public static class InvalidMarkException extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;
    }

    public RecyclableBufferedInputStream(InputStream inputStream, LruArrayPool lruArrayPool) {
        super(inputStream);
        this.e0 = -1;
        this.g0 = lruArrayPool;
        this.X = (byte[]) lruArrayPool.d(65536, byte[].class);
    }

    public static void d() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.e0;
        if (i2 != -1) {
            int i3 = this.f0 - i2;
            int i4 = this.Z;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f12684Y == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.g0.d(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.X = bArr2;
                    this.g0.i(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f0 - this.e0;
                this.f0 = i5;
                this.e0 = 0;
                this.f12684Y = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.f0;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.f12684Y = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.e0 = -1;
            this.f0 = 0;
            this.f12684Y = i8;
        }
        return i8;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.X == null || inputStream == null) {
            d();
            throw null;
        }
        return (this.f12684Y - this.f0) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.X != null) {
            this.g0.i(this.X);
            this.X = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i2) {
        this.Z = Math.max(this.Z, i2);
        this.e0 = this.f0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.X;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            d();
            throw null;
        }
        if (this.f0 >= this.f12684Y && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.X && (bArr = this.X) == null) {
            d();
            throw null;
        }
        int i2 = this.f12684Y;
        int i3 = this.f0;
        if (i2 - i3 <= 0) {
            return -1;
        }
        this.f0 = i3 + 1;
        return bArr[i3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
    }

    public final synchronized void release() {
        if (this.X != null) {
            this.g0.i(this.X);
            this.X = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.X == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.e0;
        if (-1 == i2) {
            throw new InvalidMarkException("Mark has been invalidated, pos: " + this.f0 + " markLimit: " + this.Z);
        }
        this.f0 = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.X;
        if (bArr == null) {
            d();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            d();
            throw null;
        }
        int i2 = this.f12684Y;
        int i3 = this.f0;
        if (i2 - i3 >= j) {
            this.f0 = (int) (((long) i3) + j);
            return j;
        }
        long j2 = ((long) i2) - ((long) i3);
        this.f0 = i2;
        if (this.e0 == -1 || j > this.Z) {
            long jSkip = inputStream.skip(j - j2);
            if (jSkip > 0) {
                this.e0 = -1;
            }
            return j2 + jSkip;
        }
        if (a(inputStream, bArr) == -1) {
            return j2;
        }
        int i4 = this.f12684Y;
        int i5 = this.f0;
        if (i4 - i5 >= j - j2) {
            this.f0 = (int) ((((long) i5) + j) - j2);
            return j;
        }
        long j3 = (j2 + ((long) i4)) - ((long) i5);
        this.f0 = i4;
        return j3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr2 = this.X;
        if (bArr2 == null) {
            d();
            throw null;
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.f0;
            int i7 = this.f12684Y;
            if (i6 < i7) {
                int i8 = i7 - i6;
                if (i8 >= i3) {
                    i8 = i3;
                }
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f0 += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.e0 == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (a(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.X && (bArr2 = this.X) == null) {
                        d();
                        throw null;
                    }
                    int i9 = this.f12684Y;
                    int i10 = this.f0;
                    i5 = i9 - i10;
                    if (i5 >= i4) {
                        i5 = i4;
                    }
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f0 += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        } else {
            d();
            throw null;
        }
    }
}
