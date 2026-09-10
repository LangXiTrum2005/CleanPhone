package a7;

import java.io.ByteArrayInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3438a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3439b;

    public m(f fVar) {
        super(fVar);
        this.f3439b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        switch (this.f3438a) {
            case 0:
                int i10 = this.f3439b;
                return i10 == Integer.MIN_VALUE ? super.available() : Math.min(i10, super.available());
            default:
                return Math.min(super.available(), this.f3439b);
        }
    }

    public long h(long j10) {
        int i10 = this.f3439b;
        if (i10 == 0) {
            return -1L;
        }
        return (i10 == Integer.MIN_VALUE || j10 <= ((long) i10)) ? j10 : i10;
    }

    public void j(long j10) {
        int i10 = this.f3439b;
        if (i10 == Integer.MIN_VALUE || j10 == -1) {
            return;
        }
        this.f3439b = (int) (((long) i10) - j10);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i10) {
        switch (this.f3438a) {
            case 0:
                synchronized (this) {
                    super.mark(i10);
                    this.f3439b = i10;
                }
                return;
            default:
                super.mark(i10);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f3438a) {
            case 0:
                if (h(1L) == -1) {
                    return -1;
                }
                int i10 = super.read();
                j(1L);
                return i10;
            default:
                if (this.f3439b <= 0) {
                    return -1;
                }
                int i11 = super.read();
                if (i11 >= 0) {
                    this.f3439b--;
                }
                return i11;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f3438a) {
            case 0:
                synchronized (this) {
                    super.reset();
                    this.f3439b = Integer.MIN_VALUE;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        switch (this.f3438a) {
            case 0:
                long jH = h(j10);
                if (jH == -1) {
                    return 0L;
                }
                long jSkip = super.skip(jH);
                j(jSkip);
                return jSkip;
            default:
                long jSkip2 = super.skip(Math.min(j10, this.f3439b));
                if (jSkip2 >= 0) {
                    this.f3439b = (int) (((long) this.f3439b) - jSkip2);
                }
                return jSkip2;
        }
    }

    public m(ByteArrayInputStream byteArrayInputStream, int i10) {
        super(byteArrayInputStream);
        this.f3439b = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        switch (this.f3438a) {
            case 0:
                int iH = (int) h(i11);
                if (iH == -1) {
                    return -1;
                }
                int i12 = super.read(bArr, i10, iH);
                j(i12);
                return i12;
            default:
                int i13 = this.f3439b;
                if (i13 <= 0) {
                    return -1;
                }
                int i14 = super.read(bArr, i10, Math.min(i11, i13));
                if (i14 >= 0) {
                    this.f3439b -= i14;
                }
                return i14;
        }
    }
}
