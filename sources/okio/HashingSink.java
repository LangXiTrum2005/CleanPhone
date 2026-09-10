package okio;

import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokio/HashingSink;", "Lokio/ForwardingSink;", "Lokio/Sink;", "Companion", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HashingSink extends ForwardingSink implements Sink {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/HashingSink$Companion;", "", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
    }

    @Override // okio.ForwardingSink, okio.Sink
    public final void write(Buffer source, long j) throws IOException {
        Intrinsics.f(source, "source");
        SegmentedByteString.b(source.f45132Y, 0L, j);
        Segment segment = source.X;
        Intrinsics.c(segment);
        if (0 >= j) {
            super.write(source, j);
        } else {
            Math.min(j, segment.f45159c - segment.f45158b);
            Intrinsics.c(null);
            throw null;
        }
    }
}
