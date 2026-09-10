package com.google.android.gms.internal.ads;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class rb extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19495a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f19497c;

    public rb(BufferedInputStream bufferedInputStream, long j10) {
        super(bufferedInputStream);
        this.f19496b = j10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        long jMin;
        switch (this.f19495a) {
            case 1:
                jMin = Math.min(((FilterInputStream) this).in.available(), this.f19496b);
                break;
            case 2:
                jMin = Math.min(((FilterInputStream) this).in.available(), this.f19496b);
                break;
            default:
                return super.available();
        }
        return (int) jMin;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        switch (this.f19495a) {
            case 1:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i10);
                    this.f19497c = this.f19496b;
                }
                return;
            case 2:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i10);
                    this.f19497c = this.f19496b;
                }
                return;
            default:
                super.mark(i10);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f19495a) {
            case 0:
                int i10 = super.read();
                if (i10 != -1) {
                    this.f19497c++;
                }
                return i10;
            case 1:
                if (this.f19496b == 0) {
                    return -1;
                }
                int i11 = ((FilterInputStream) this).in.read();
                if (i11 != -1) {
                    this.f19496b--;
                }
                return i11;
            default:
                if (this.f19496b == 0) {
                    return -1;
                }
                int i12 = ((FilterInputStream) this).in.read();
                if (i12 != -1) {
                    this.f19496b--;
                }
                return i12;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f19495a) {
            case 1:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f19497c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f19496b = this.f19497c;
                }
                return;
            case 2:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f19497c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f19496b = this.f19497c;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j10) throws IOException {
        switch (this.f19495a) {
            case 1:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j10, this.f19496b));
                this.f19496b -= jSkip;
                return jSkip;
            case 2:
                long jSkip2 = ((FilterInputStream) this).in.skip(Math.min(j10, this.f19496b));
                this.f19496b -= jSkip2;
                return jSkip2;
            default:
                return super.skip(j10);
        }
    }

    public rb(InputStream inputStream, long j10) {
        super(inputStream);
        this.f19497c = -1L;
        inputStream.getClass();
        ps1.C("limit must be non-negative", j10 >= 0);
        this.f19496b = j10;
    }

    public rb(InputStream inputStream) {
        super(inputStream);
        this.f19497c = -1L;
        this.f19496b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        switch (this.f19495a) {
            case 0:
                int i12 = super.read(bArr, i10, i11);
                if (i12 != -1) {
                    this.f19497c += (long) i12;
                }
                return i12;
            case 1:
                long j10 = this.f19496b;
                if (j10 == 0) {
                    return -1;
                }
                int i13 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j10));
                if (i13 != -1) {
                    this.f19496b -= (long) i13;
                }
                return i13;
            default:
                long j11 = this.f19496b;
                if (j11 == 0) {
                    return -1;
                }
                int i14 = ((FilterInputStream) this).in.read(bArr, i10, (int) Math.min(i11, j11));
                if (i14 != -1) {
                    this.f19496b -= (long) i14;
                }
                return i14;
        }
    }
}
