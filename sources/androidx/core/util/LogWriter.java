package androidx.core.util;

import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class LogWriter extends Writer {
    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw null;
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        throw null;
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        if (i3 > 0) {
            if (cArr[i2] != '\n') {
                throw null;
            }
            throw null;
        }
    }
}
