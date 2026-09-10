package okio;

import androidx.datastore.preferences.protobuf.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/CipherSource;", "Lokio/Source;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CipherSource implements Source {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // okio.Source
    public final long read(Buffer sink, long j) {
        Intrinsics.f(sink, "sink");
        if (j >= 0) {
            throw new IllegalStateException("closed");
        }
        throw new IllegalArgumentException(a.i(j, "byteCount < 0: ").toString());
    }

    @Override // okio.Source
    /* JADX INFO: renamed from: timeout */
    public final Timeout getF45149Y() {
        throw null;
    }
}
