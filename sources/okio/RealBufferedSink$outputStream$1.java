package okio;

import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okio/RealBufferedSink$outputStream$1", "Ljava/io/OutputStream;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RealBufferedSink$outputStream$1 extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        throw null;
    }

    public final String toString() {
        return ((Object) null) + ".outputStream()";
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        throw null;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] data, int i2, int i3) {
        Intrinsics.f(data, "data");
        throw null;
    }
}
