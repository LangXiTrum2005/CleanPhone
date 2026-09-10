package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
final class CharSequenceReader extends Reader {
    public String X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f20020Y;
    public int Z;

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.X = null;
    }

    public final void d() throws IOException {
        if (this.X == null) {
            throw new IOException("reader closed");
        }
    }

    public final int h() {
        Objects.requireNonNull(this.X);
        return this.X.length() - this.f20020Y;
    }

    @Override // java.io.Reader
    public final synchronized void mark(int i2) {
        Preconditions.c(i2, "readAheadLimit (%s) may not be negative", i2 >= 0);
        d();
        this.Z = this.f20020Y;
    }

    @Override // java.io.Reader
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader
    public final synchronized int read() {
        int iCharAt;
        d();
        Objects.requireNonNull(this.X);
        if (h() > 0) {
            String str = this.X;
            int i2 = this.f20020Y;
            this.f20020Y = i2 + 1;
            iCharAt = str.charAt(i2);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public final synchronized boolean ready() {
        d();
        return true;
    }

    @Override // java.io.Reader
    public final synchronized void reset() {
        d();
        this.f20020Y = this.Z;
    }

    @Override // java.io.Reader
    public final synchronized long skip(long j) {
        int iMin;
        Preconditions.d(j, j >= 0, "n (%s) may not be negative");
        d();
        iMin = (int) Math.min(h(), j);
        this.f20020Y += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public final synchronized int read(char[] cArr, int i2, int i3) {
        Preconditions.l(i2, i2 + i3, cArr.length);
        d();
        Objects.requireNonNull(this.X);
        if (!(h() > 0)) {
            return -1;
        }
        int iMin = Math.min(i3, h());
        for (int i4 = 0; i4 < iMin; i4++) {
            String str = this.X;
            int i5 = this.f20020Y;
            this.f20020Y = i5 + 1;
            cArr[i2 + i4] = str.charAt(i5);
        }
        return iMin;
    }

    @Override // java.io.Reader, java.lang.Readable
    public final synchronized int read(CharBuffer charBuffer) {
        charBuffer.getClass();
        d();
        Objects.requireNonNull(this.X);
        if (!(h() > 0)) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), h());
        for (int i2 = 0; i2 < iMin; i2++) {
            String str = this.X;
            int i3 = this.f20020Y;
            this.f20020Y = i3 + 1;
            charBuffer.put(str.charAt(i3));
        }
        return iMin;
    }
}
