package okio;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/OutputStreamSink;", "Lokio/Sink;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class OutputStreamSink implements Sink {
    public final OutputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Timeout f45152Y;

    public OutputStreamSink(OutputStream outputStream, Timeout timeout) {
        this.X = outputStream;
        this.f45152Y = timeout;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() throws IOException {
        this.X.flush();
    }

    @Override // okio.Sink
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public final Timeout getF45152Y() {
        return this.f45152Y;
    }

    public final String toString() {
        return "sink(" + this.X + ')';
    }

    @Override // okio.Sink
    public final void write(Buffer source, long j) throws IOException {
        Intrinsics.f(source, "source");
        SegmentedByteString.b(source.f45132Y, 0L, j);
        while (j > 0) {
            this.f45152Y.throwIfReached();
            Segment segment = source.X;
            Intrinsics.c(segment);
            int iMin = (int) Math.min(j, segment.f45159c - segment.f45158b);
            this.X.write(segment.f45157a, segment.f45158b, iMin);
            int i2 = segment.f45158b + iMin;
            segment.f45158b = i2;
            long j2 = iMin;
            j -= j2;
            source.f45132Y -= j2;
            if (i2 == segment.f45159c) {
                source.X = segment.a();
                SegmentPool.a(segment);
            }
        }
    }
}
