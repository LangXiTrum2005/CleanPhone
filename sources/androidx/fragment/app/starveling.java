package androidx.fragment.app;

import java.io.Writer;

/* JADX INFO: compiled from: LogWriter.java */
/* JADX INFO: loaded from: classes.dex */
public final class starveling extends Writer {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public StringBuilder f10420arytenoidectomy = new StringBuilder(128);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final String f10421kowloon;

    public starveling(String str) {
        this.f10421kowloon = str;
    }

    public final void attabal() {
        if (this.f10420arytenoidectomy.length() > 0) {
            this.f10420arytenoidectomy.toString();
            StringBuilder sb = this.f10420arytenoidectomy;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        attabal();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        attabal();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                attabal();
            } else {
                this.f10420arytenoidectomy.append(c);
            }
        }
    }
}
