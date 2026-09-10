package s0;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f49820a;

    public h1(FileOutputStream fileOutputStream) {
        this.f49820a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f49820a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        this.f49820a.write(i10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] b10) throws IOException {
        kotlin.jvm.internal.n.f(b10, "b");
        this.f49820a.write(b10);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bytes, int i10, int i11) throws IOException {
        kotlin.jvm.internal.n.f(bytes, "bytes");
        this.f49820a.write(bytes, i10, i11);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
