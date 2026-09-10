package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/HashingSource;", "Lokio/ForwardingSource;", "Lokio/Source;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HashingSource extends ForwardingSource implements Source {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/HashingSource$Companion;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // okio.ForwardingSource, okio.Source
    public final long read(Buffer sink, long j) throws IOException {
        Intrinsics.f(sink, "sink");
        long j2 = super.read(sink, j);
        if (j2 != -1) {
            long j3 = sink.f45132Y;
            long j4 = j3 - j2;
            Segment segment = sink.X;
            Intrinsics.c(segment);
            while (j3 > j4) {
                segment = segment.g;
                Intrinsics.c(segment);
                j3 -= (long) (segment.f45159c - segment.f45158b);
            }
            if (j3 < sink.f45132Y) {
                Intrinsics.c(null);
                throw null;
            }
        }
        return j2;
    }
}
