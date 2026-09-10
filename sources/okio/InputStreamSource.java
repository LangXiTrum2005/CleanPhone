package okio;

import androidx.datastore.preferences.protobuf.a;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0012\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/InputStreamSource;", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
class InputStreamSource implements Source {
    public final InputStream X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Timeout f45149Y;

    public InputStreamSource(InputStream input, Timeout timeout) {
        Intrinsics.f(input, "input");
        Intrinsics.f(timeout, "timeout");
        this.X = input;
        this.f45149Y = timeout;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.X.close();
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.f(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
        }
        try {
            this.f45149Y.throwIfReached();
            Segment segmentJ = sink.J(1);
            int i2 = this.X.read(segmentJ.f45157a, segmentJ.f45159c, (int) Math.min(j, 8192 - segmentJ.f45159c));
            if (i2 != -1) {
                segmentJ.f45159c += i2;
                long j2 = i2;
                sink.f45132Y += j2;
                return j2;
            }
            if (segmentJ.f45158b != segmentJ.f45159c) {
                return -1L;
            }
            sink.X = segmentJ.a();
            SegmentPool.a(segmentJ);
            return -1L;
        } catch (AssertionError e2) {
            if (Okio.e(e2)) {
                throw new IOException(e2);
            }
            throw e2;
        }
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout, reason: from getter */
    public final Timeout getF45149Y() {
        return this.f45149Y;
    }

    public final String toString() {
        return "source(" + this.X + ')';
    }
}
