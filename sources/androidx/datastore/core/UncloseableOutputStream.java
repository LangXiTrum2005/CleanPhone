package androidx.datastore.core;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/datastore/core/UncloseableOutputStream;", "Ljava/io/OutputStream;", "datastore-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UncloseableOutputStream extends OutputStream {
    public final FileOutputStream X;

    public UncloseableOutputStream(FileOutputStream fileOutputStream) {
        this.X = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.X.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i2) throws IOException {
        this.X.write(i2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b2) throws IOException {
        Intrinsics.f(b2, "b");
        this.X.write(b2);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i2, int i3) throws IOException {
        Intrinsics.f(bytes, "bytes");
        this.X.write(bytes, i2, i3);
    }
}
