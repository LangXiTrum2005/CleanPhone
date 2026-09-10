package okio;

import java.io.IOException;
import java.util.zip.Deflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/DeflaterSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class DeflaterSink implements Sink {
    public final RealBufferedSink X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Deflater f45135Y;
    public boolean Z;

    public DeflaterSink(RealBufferedSink realBufferedSink, Deflater deflater) {
        this.X = realBufferedSink;
        this.f45135Y = deflater;
    }

    public final void a(boolean z2) throws IOException {
        Segment segmentJ;
        int iDeflate;
        RealBufferedSink realBufferedSink = this.X;
        Buffer buffer = realBufferedSink.f45155Y;
        while (true) {
            segmentJ = buffer.J(1);
            Deflater deflater = this.f45135Y;
            byte[] bArr = segmentJ.f45157a;
            if (z2) {
                try {
                    int i2 = segmentJ.f45159c;
                    iDeflate = deflater.deflate(bArr, i2, 8192 - i2, 2);
                } catch (NullPointerException e2) {
                    throw new IOException("Deflater already closed", e2);
                }
            } else {
                int i3 = segmentJ.f45159c;
                iDeflate = deflater.deflate(bArr, i3, 8192 - i3);
            }
            if (iDeflate > 0) {
                segmentJ.f45159c += iDeflate;
                buffer.f45132Y += (long) iDeflate;
                realBufferedSink.emitCompleteSegments();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (segmentJ.f45158b == segmentJ.f45159c) {
            buffer.X = segmentJ.a();
            SegmentPool.a(segmentJ);
        }
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f45135Y;
        if (this.Z) {
            return;
        }
        deflater.finish();
        a(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.X.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.Z = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        a(true);
        this.X.flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45152Y() {
        return this.X.X.getF45152Y();
    }

    public final String toString() {
        return "DeflaterSink(" + this.X + ')';
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) throws IOException {
        Intrinsics.f(source, "source");
        SegmentedByteString.b(source.f45132Y, 0L, j);
        while (j > 0) {
            Segment segment = source.X;
            Intrinsics.c(segment);
            int iMin = (int) Math.min(j, segment.f45159c - segment.f45158b);
            this.f45135Y.setInput(segment.f45157a, segment.f45158b, iMin);
            a(false);
            long j2 = iMin;
            source.f45132Y -= j2;
            int i2 = segment.f45158b + iMin;
            segment.f45158b = i2;
            if (i2 == segment.f45159c) {
                source.X = segment.a();
                SegmentPool.a(segment);
            }
            j -= j2;
        }
    }
}
