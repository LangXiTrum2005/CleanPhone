package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
final class LogWriter extends Writer {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final StringBuilder f5185Y = new StringBuilder(128);
    public final String X = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        d();
    }

    public final void d() {
        StringBuilder sb = this.f5185Y;
        if (sb.length() > 0) {
            Log.d(this.X, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        d();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                d();
            } else {
                this.f5185Y.append(c2);
            }
        }
    }
}
