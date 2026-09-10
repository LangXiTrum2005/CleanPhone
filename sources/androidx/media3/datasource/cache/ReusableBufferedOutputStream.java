package androidx.media3.datasource.cache;

import androidx.media3.common.util.Util;
import java.io.BufferedOutputStream;

/* JADX INFO: loaded from: classes.dex */
final class ReusableBufferedOutputStream extends BufferedOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        int i2 = Util.f5683a;
        throw th;
    }
}
