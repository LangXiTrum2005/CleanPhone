package okio;

import androidx.datastore.preferences.protobuf.a;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/InflaterSource;", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class InflaterSource implements Source {
    public final RealBufferedSource X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Inflater f45148Y;
    public int Z;
    public boolean e0;

    public InflaterSource(RealBufferedSource realBufferedSource, Inflater inflater) {
        this.X = realBufferedSource;
        this.f45148Y = inflater;
    }

    public final long a(Buffer sink, long j) throws IOException {
        Inflater inflater = this.f45148Y;
        Intrinsics.f(sink, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
        }
        if (this.e0) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                Segment segmentJ = sink.J(1);
                int iMin = (int) Math.min(j, 8192 - segmentJ.f45159c);
                boolean zNeedsInput = inflater.needsInput();
                RealBufferedSource realBufferedSource = this.X;
                if (zNeedsInput && !realBufferedSource.exhausted()) {
                    Segment segment = realBufferedSource.f45156Y.X;
                    Intrinsics.c(segment);
                    int i2 = segment.f45159c;
                    int i3 = segment.f45158b;
                    int i4 = i2 - i3;
                    this.Z = i4;
                    inflater.setInput(segment.f45157a, i3, i4);
                }
                int iInflate = inflater.inflate(segmentJ.f45157a, segmentJ.f45159c, iMin);
                int i5 = this.Z;
                if (i5 != 0) {
                    int remaining = i5 - inflater.getRemaining();
                    this.Z -= remaining;
                    realBufferedSource.skip(remaining);
                }
                if (iInflate > 0) {
                    segmentJ.f45159c += iInflate;
                    long j2 = iInflate;
                    sink.f45132Y += j2;
                    return j2;
                }
                if (segmentJ.f45158b == segmentJ.f45159c) {
                    sink.X = segmentJ.a();
                    SegmentPool.a(segmentJ);
                }
            } catch (DataFormatException e2) {
                throw new IOException(e2);
            }
        }
        return 0L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e0) {
            return;
        }
        this.f45148Y.end();
        this.e0 = true;
        this.X.close();
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.f(sink, "sink");
        do {
            long jA = a(sink, j);
            if (jA > 0) {
                return jA;
            }
            Inflater inflater = this.f45148Y;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.X.exhausted());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45149Y() {
        return this.X.X.getF45149Y();
    }
}
