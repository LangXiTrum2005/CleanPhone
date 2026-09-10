package okio.internal;

import android.support.v4.media.a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.Buffer;
import okio.ForwardingSource;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/internal/FixedLengthSource;", "Lokio/ForwardingSource;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FixedLengthSource extends ForwardingSource {
    public long X;

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.f(sink, "sink");
        if (this.X > 0) {
            j = 0;
        }
        long j2 = super.read(sink, j);
        if (j2 != -1) {
            this.X += j2;
        }
        long j3 = this.X;
        if ((j3 >= 0 || j2 != -1) && j3 <= 0) {
            return j2;
        }
        if (j2 > 0 && j3 > 0) {
            long j4 = sink.f45132Y - (j3 - 0);
            Buffer buffer = new Buffer();
            buffer.g(sink);
            sink.write(buffer, j4);
            buffer.k();
        }
        StringBuilder sbV = a.v(0L, "expected ", " bytes but got ");
        sbV.append(this.X);
        throw new IOException(sbV.toString());
    }
}
