package kotlin.io.encoding;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/io/encoding/EncodeOutputStream;", "Ljava/io/OutputStream;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class EncodeOutputStream extends OutputStream {
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        throw new IOException("The output stream is closed.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] source, int i2, int i3) throws IOException {
        Intrinsics.f(source, "source");
        throw new IOException("The output stream is closed.");
    }
}
