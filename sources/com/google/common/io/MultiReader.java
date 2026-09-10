package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
class MultiReader extends Reader {
    public Reader X;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Reader reader = this.X;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.X = null;
            }
        }
    }

    @Override // java.io.Reader
    public final int read(char[] cArr, int i2, int i3) throws IOException {
        cArr.getClass();
        Reader reader = this.X;
        if (reader == null) {
            return -1;
        }
        int i4 = reader.read(cArr, i2, i3);
        if (i4 != -1) {
            return i4;
        }
        close();
        throw null;
    }

    @Override // java.io.Reader
    public final boolean ready() {
        Reader reader = this.X;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public final long skip(long j) throws IOException {
        Reader reader;
        Preconditions.e("n is negative", j >= 0);
        if (j <= 0 || (reader = this.X) == null) {
            return 0L;
        }
        long jSkip = reader.skip(j);
        if (jSkip > 0) {
            return jSkip;
        }
        close();
        throw null;
    }
}
