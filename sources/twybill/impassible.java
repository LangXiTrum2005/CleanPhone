package twybill;

import decarock.grimness;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ReusableBufferedOutputStream.java */
/* JADX INFO: loaded from: classes.dex */
public final class impassible extends BufferedOutputStream {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public boolean f39028kowloon;

    public impassible(OutputStream outputStream) {
        super(outputStream);
    }

    public void attabal(OutputStream outputStream) {
        decarock.attabal.competently(this.f39028kowloon);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f39028kowloon = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f39028kowloon = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th != null) {
            grimness.tectonization(th);
        }
    }

    public impassible(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
