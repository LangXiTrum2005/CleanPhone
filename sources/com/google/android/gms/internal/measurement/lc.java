package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.ads.fs1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.zip.DataFormatException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class lc extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f23704b;

    public /* synthetic */ lc(Closeable closeable, int i10) {
        this.f23703a = i10;
        this.f23704b = closeable;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        switch (this.f23703a) {
            case 2:
                return ((ByteBuffer) this.f23704b).remaining();
            case 3:
                return (int) Math.min(((lo.e) this.f23704b).f45637b, Integer.MAX_VALUE);
            case 4:
                lo.n nVar = (lo.n) this.f23704b;
                if (nVar.f45658c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(nVar.f45657b.f45637b, Integer.MAX_VALUE);
            default:
                return super.available();
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        switch (this.f23703a) {
            case 3:
                break;
            case 4:
                ((lo.n) this.f23704b).close();
                break;
            default:
                super.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        switch (this.f23703a) {
            case 2:
                ((ByteBuffer) this.f23704b).mark();
                break;
            default:
                super.mark(i10);
                break;
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        switch (this.f23703a) {
            case 2:
                return true;
            default:
                return super.markSupported();
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f23703a) {
            case 0:
                byte[] bArr = new byte[1];
                if (read(bArr, 0, 1) == -1) {
                    return -1;
                }
                return bArr[0];
            case 1:
                byte[] bArr2 = new byte[1];
                if (((fs1) this.f23704b).r(bArr2, 0, 1) == -1) {
                    return -1;
                }
                return bArr2[0];
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) this.f23704b;
                if (byteBuffer.hasRemaining()) {
                    return byteBuffer.get() & 255;
                }
                return -1;
            case 3:
                lo.e eVar = (lo.e) this.f23704b;
                if (eVar.f45637b > 0) {
                    return eVar.readByte() & 255;
                }
                return -1;
            default:
                lo.n nVar = (lo.n) this.f23704b;
                lo.e eVar2 = nVar.f45657b;
                if (nVar.f45658c) {
                    throw new IOException("closed");
                }
                if (eVar2.f45637b == 0 && nVar.f45656a.l(8192L, eVar2) == -1) {
                    return -1;
                }
                return eVar2.readByte() & 255;
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        switch (this.f23703a) {
            case 2:
                try {
                    ((ByteBuffer) this.f23704b).reset();
                    return;
                } catch (InvalidMarkException e10) {
                    throw new IOException(e10);
                }
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.InputStream
    public long skip(long j10) {
        switch (this.f23703a) {
            case 1:
                if (j10 <= 0) {
                    return 0L;
                }
                int i10 = j10 > 2147483647L ? Integer.MAX_VALUE : (int) j10;
                ((fs1) this.f23704b).t(i10);
                return i10;
            default:
                return super.skip(j10);
        }
    }

    public String toString() {
        switch (this.f23703a) {
            case 3:
                return ((lo.e) this.f23704b) + ".inputStream()";
            case 4:
                return ((lo.n) this.f23704b) + ".inputStream()";
            default:
                return super.toString();
        }
    }

    public lc(mc mcVar, fs1 fs1Var) {
        this.f23703a = 1;
        this.f23704b = fs1Var;
    }

    public lc(com.google.protobuf.j3 j3Var) {
        this.f23703a = 2;
        this.f23704b = j3Var.f24876a.slice();
    }

    @Override // java.io.InputStream
    public final int read(byte[] sink, int i10, int i11) throws IOException {
        switch (this.f23703a) {
            case 0:
                mc mcVar = (mc) this.f23704b;
                try {
                    int iInflate = mcVar.f23737a.inflate(sink, i10, i11);
                    if (iInflate > 0) {
                        return iInflate;
                    }
                    if (i11 == 0) {
                        return 0;
                    }
                    if (mcVar.f23737a.getRemaining() == 0) {
                        return -1;
                    }
                    int remaining = mcVar.f23737a.getRemaining();
                    throw new IOException(l1.d.j(new StringBuilder(String.valueOf(i11).length() + 70 + String.valueOf(remaining).length()), i11, "Read no bytes (requested up to ", remaining, ") but did not reach end of stream, had "));
                } catch (DataFormatException e10) {
                    throw new IOException(e10);
                }
            case 1:
                return ((fs1) this.f23704b).r(sink, i10, i11);
            case 2:
                ByteBuffer byteBuffer = (ByteBuffer) this.f23704b;
                if (!byteBuffer.hasRemaining()) {
                    return -1;
                }
                int iMin = Math.min(i11, byteBuffer.remaining());
                byteBuffer.get(sink, i10, iMin);
                return iMin;
            case 3:
                kotlin.jvm.internal.n.f(sink, "sink");
                return ((lo.e) this.f23704b).read(sink, i10, i11);
            default:
                kotlin.jvm.internal.n.f(sink, "data");
                lo.n nVar = (lo.n) this.f23704b;
                lo.e eVar = nVar.f45657b;
                if (!nVar.f45658c) {
                    com.google.android.gms.internal.auth.i.b(sink.length, i10, i11);
                    if (eVar.f45637b == 0 && nVar.f45656a.l(8192L, eVar) == -1) {
                        return -1;
                    }
                    return eVar.read(sink, i10, i11);
                }
                throw new IOException("closed");
        }
    }

    private final void d() {
    }
}
