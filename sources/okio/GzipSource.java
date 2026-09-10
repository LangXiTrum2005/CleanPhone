package okio;

import androidx.datastore.preferences.protobuf.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/GzipSource;", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GzipSource implements Source {
    public byte X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final RealBufferedSource f45147Y;
    public final Inflater Z;
    public final InflaterSource e0;
    public final CRC32 f0;

    public GzipSource(Source source) {
        Intrinsics.f(source, "source");
        RealBufferedSource realBufferedSource = new RealBufferedSource(source);
        this.f45147Y = realBufferedSource;
        Inflater inflater = new Inflater(true);
        this.Z = inflater;
        this.e0 = new InflaterSource(realBufferedSource, inflater);
        this.f0 = new CRC32();
    }

    public static void a(String str, int i2, int i3) throws IOException {
        if (i3 != i2) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i3), Integer.valueOf(i2)}, 3)));
        }
    }

    public final void b(long j, Buffer buffer, long j2) {
        Segment segment = buffer.X;
        Intrinsics.c(segment);
        while (true) {
            int i2 = segment.f45159c;
            int i3 = segment.f45158b;
            if (j < i2 - i3) {
                break;
            }
            j -= (long) (i2 - i3);
            segment = segment.f;
            Intrinsics.c(segment);
        }
        while (j2 > 0) {
            int i4 = (int) (((long) segment.f45158b) + j);
            int iMin = (int) Math.min(segment.f45159c - i4, j2);
            this.f0.update(segment.f45157a, i4, iMin);
            j2 -= (long) iMin;
            segment = segment.f;
            Intrinsics.c(segment);
            j = 0;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e0.close();
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        GzipSource gzipSource = this;
        Intrinsics.f(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return 0L;
        }
        byte b2 = gzipSource.X;
        CRC32 crc32 = gzipSource.f0;
        RealBufferedSource realBufferedSource = gzipSource.f45147Y;
        if (b2 == 0) {
            realBufferedSource.require(10L);
            Buffer buffer = realBufferedSource.f45156Y;
            byte bR = buffer.r(3L);
            boolean z2 = ((bR >> 1) & 1) == 1;
            if (z2) {
                gzipSource.b(0L, buffer, 10L);
            }
            a("ID1ID2", 8075, realBufferedSource.readShort());
            realBufferedSource.skip(8L);
            if (((bR >> 2) & 1) == 1) {
                realBufferedSource.require(2L);
                if (z2) {
                    b(0L, buffer, 2L);
                }
                long shortLe = buffer.readShortLe() & 65535;
                realBufferedSource.require(shortLe);
                if (z2) {
                    b(0L, buffer, shortLe);
                }
                realBufferedSource.skip(shortLe);
            }
            if (((bR >> 3) & 1) == 1) {
                long jIndexOf = realBufferedSource.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    b(0L, buffer, jIndexOf + 1);
                }
                realBufferedSource.skip(jIndexOf + 1);
            }
            if (((bR >> 4) & 1) == 1) {
                long jIndexOf2 = realBufferedSource.indexOf((byte) 0, 0L, Long.MAX_VALUE);
                if (jIndexOf2 == -1) {
                    throw new EOFException();
                }
                if (z2) {
                    gzipSource = this;
                    gzipSource.b(0L, buffer, jIndexOf2 + 1);
                } else {
                    gzipSource = this;
                }
                realBufferedSource.skip(jIndexOf2 + 1);
            } else {
                gzipSource = this;
            }
            if (z2) {
                a("FHCRC", realBufferedSource.readShortLe(), (short) crc32.getValue());
                crc32.reset();
            }
            gzipSource.X = (byte) 1;
        }
        if (gzipSource.X == 1) {
            long j2 = sink.f45132Y;
            long j3 = gzipSource.e0.read(sink, j);
            if (j3 != -1) {
                gzipSource.b(j2, sink, j3);
                return j3;
            }
            gzipSource.X = (byte) 2;
        }
        if (gzipSource.X == 2) {
            a("CRC", realBufferedSource.readIntLe(), (int) crc32.getValue());
            a("ISIZE", realBufferedSource.readIntLe(), (int) gzipSource.Z.getBytesWritten());
            gzipSource.X = (byte) 3;
            if (!realBufferedSource.exhausted()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45149Y() {
        return this.f45147Y.X.getF45149Y();
    }
}
