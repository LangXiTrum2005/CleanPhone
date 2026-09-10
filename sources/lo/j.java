package lo;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f45643a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f45644b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f45645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f45646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CRC32 f45647e;

    public j(t source) {
        kotlin.jvm.internal.n.f(source, "source");
        n nVar = new n(source);
        this.f45644b = nVar;
        Inflater inflater = new Inflater(true);
        this.f45645c = inflater;
        this.f45646d = new k(nVar, inflater);
        this.f45647e = new CRC32();
    }

    public static void a(String str, int i10, int i11) throws IOException {
        if (i11 != i10) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i11), Integer.valueOf(i10)}, 3)));
        }
    }

    public final void b(e eVar, long j10, long j11) {
        o oVar = eVar.f45636a;
        kotlin.jvm.internal.n.c(oVar);
        while (true) {
            int i10 = oVar.f45661c;
            int i11 = oVar.f45660b;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            oVar = oVar.f45664f;
            kotlin.jvm.internal.n.c(oVar);
        }
        while (j11 > 0) {
            int i12 = (int) (((long) oVar.f45660b) + j10);
            int iMin = (int) Math.min(oVar.f45661c - i12, j11);
            this.f45647e.update(oVar.f45659a, i12, iMin);
            j11 -= (long) iMin;
            oVar = oVar.f45664f;
            kotlin.jvm.internal.n.c(oVar);
            j10 = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f45646d.close();
    }

    @Override // lo.t
    public final long l(long j10, e sink) throws IOException {
        long j11;
        j jVar = this;
        kotlin.jvm.internal.n.f(sink, "sink");
        byte b10 = jVar.f45643a;
        CRC32 crc32 = jVar.f45647e;
        n nVar = jVar.f45644b;
        if (b10 == 0) {
            nVar.require(10L);
            e eVar = nVar.f45657b;
            byte bH = eVar.h(3L);
            boolean z10 = ((bH >> 1) & 1) == 1;
            if (z10) {
                jVar.b(eVar, 0L, 10L);
            }
            a("ID1ID2", 8075, nVar.readShort());
            nVar.skip(8L);
            if (((bH >> 2) & 1) == 1) {
                nVar.require(2L);
                if (z10) {
                    b(eVar, 0L, 2L);
                }
                short s10 = eVar.readShort();
                long j12 = ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535;
                nVar.require(j12);
                if (z10) {
                    b(eVar, 0L, j12);
                }
                nVar.skip(j12);
            }
            if (((bH >> 3) & 1) == 1) {
                long jIndexOf = nVar.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    j11 = 2;
                    b(eVar, 0L, jIndexOf + 1);
                } else {
                    j11 = 2;
                }
                nVar.skip(jIndexOf + 1);
            } else {
                j11 = 2;
            }
            if (((bH >> 4) & 1) == 1) {
                j11 = j11;
                long jIndexOf2 = nVar.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z10) {
                    jVar = this;
                    jVar.b(eVar, 0L, jIndexOf2 + 1);
                } else {
                    jVar = this;
                }
                nVar.skip(jIndexOf2 + 1);
            } else {
                jVar = this;
            }
            if (z10) {
                nVar.require(j11);
                short s11 = eVar.readShort();
                a("FHCRC", (short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) crc32.getValue());
                crc32.reset();
            }
            jVar.f45643a = (byte) 1;
        }
        if (jVar.f45643a == 1) {
            long j13 = sink.f45637b;
            long jL = jVar.f45646d.l(8192L, sink);
            if (jL != -1) {
                jVar.b(sink, j13, jL);
                return jL;
            }
            jVar.f45643a = (byte) 2;
        }
        if (jVar.f45643a == 2) {
            a("CRC", nVar.readIntLe(), (int) crc32.getValue());
            a("ISIZE", nVar.readIntLe(), (int) jVar.f45645c.getBytesWritten());
            jVar.f45643a = (byte) 3;
            if (!nVar.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // lo.t
    public final v timeout() {
        return this.f45644b.f45656a.timeout();
    }
}
