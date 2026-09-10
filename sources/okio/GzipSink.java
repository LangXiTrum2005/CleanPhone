package okio;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/GzipSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GzipSink implements Sink {
    public final RealBufferedSink X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Deflater f45146Y;
    public final DeflaterSink Z;
    public boolean e0;
    public final CRC32 f0;

    public GzipSink(Buffer buffer) {
        RealBufferedSink realBufferedSink = new RealBufferedSink(buffer);
        this.X = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.f45146Y = deflater;
        this.Z = new DeflaterSink(realBufferedSink, deflater);
        this.f0 = new CRC32();
        Buffer buffer2 = realBufferedSink.f45155Y;
        buffer2.j0(8075);
        buffer2.T(8);
        buffer2.T(0);
        buffer2.c0(0);
        buffer2.T(0);
        buffer2.T(0);
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f45146Y;
        RealBufferedSink realBufferedSink = this.X;
        if (this.e0) {
            return;
        }
        try {
            DeflaterSink deflaterSink = this.Z;
            deflaterSink.f45135Y.finish();
            deflaterSink.a(false);
            int value = (int) this.f0.getValue();
            if (realBufferedSink.Z) {
                throw new IllegalStateException("closed");
            }
            int iC = SegmentedByteString.c(value);
            Buffer buffer = realBufferedSink.f45155Y;
            buffer.c0(iC);
            realBufferedSink.emitCompleteSegments();
            int bytesRead = (int) deflater.getBytesRead();
            if (realBufferedSink.Z) {
                throw new IllegalStateException("closed");
            }
            buffer.c0(SegmentedByteString.c(bytesRead));
            realBufferedSink.emitCompleteSegments();
            th = null;
            try {
                deflater.end();
            } catch (Throwable th) {
                if (th == null) {
                    th = th;
                }
            }
            try {
                realBufferedSink.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                }
            }
            this.e0 = true;
            if (th != null) {
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        this.Z.flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45152Y() {
        return this.X.X.getF45152Y();
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) throws IOException {
        Intrinsics.f(source, "source");
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
        }
        if (j == 0) {
            return;
        }
        Segment segment = source.X;
        Intrinsics.c(segment);
        long j2 = j;
        while (j2 > 0) {
            int iMin = (int) Math.min(j2, segment.f45159c - segment.f45158b);
            this.f0.update(segment.f45157a, segment.f45158b, iMin);
            j2 -= (long) iMin;
            segment = segment.f;
            Intrinsics.c(segment);
        }
        this.Z.write(source, j);
    }
}
