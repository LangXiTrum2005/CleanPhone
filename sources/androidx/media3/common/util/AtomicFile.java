package androidx.media3.common.util;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class AtomicFile {

    public static final class AtomicFileOutputStream extends OutputStream {
        public boolean X;

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.X) {
                return;
            }
            this.X = true;
            throw null;
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr) {
            throw null;
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            throw null;
        }
    }
}
