package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;
    private final InputStream in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void setLimit(long j) {
        try {
            long j2 = this.reset;
            long j3 = this.offset;
            if (j2 >= j3 || j3 > this.limit) {
                this.reset = j3;
                this.in.mark((int) (j - j3));
            } else {
                this.in.reset();
                this.in.mark((int) (j - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    private void skip(long j, long j2) throws IOException {
        while (j < j2) {
            long jSkip = this.in.skip(j2 - j);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j += jSkip;
        }
    }

    public void allowMarksToExpire(boolean z2) {
        this.allowExpire = z2;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.defaultMark = savePosition(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.in.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.allowExpire) {
            long j = this.offset + 1;
            long j2 = this.limit;
            if (j > j2) {
                setLimit(j2 + ((long) this.limitIncrement));
            }
        }
        int i2 = this.in.read();
        if (i2 != -1) {
            this.offset++;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public long savePosition(int i2) {
        long j = this.offset + ((long) i2);
        if (this.limit < j) {
            setLimit(j);
        }
        return this.offset;
    }

    public MarkableInputStream(InputStream inputStream, int i2) {
        this(inputStream, i2, 1024);
    }

    public void reset(long j) throws IOException {
        if (this.offset > this.limit || j < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.in.reset();
        skip(this.reset, j);
        this.offset = j;
    }

    private MarkableInputStream(InputStream inputStream, int i2, int i3) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i2);
        this.limitIncrement = i3;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        if (!this.allowExpire) {
            long j2 = this.offset;
            if (j2 + j > this.limit) {
                setLimit(j2 + j + ((long) this.limitIncrement));
            }
        }
        long jSkip = this.in.skip(j);
        this.offset += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.allowExpire) {
            long j = this.offset;
            if (((long) bArr.length) + j > this.limit) {
                setLimit(j + ((long) bArr.length) + ((long) this.limitIncrement));
            }
        }
        int i2 = this.in.read(bArr);
        if (i2 != -1) {
            this.offset += (long) i2;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (!this.allowExpire) {
            long j = this.offset;
            long j2 = i3;
            if (j + j2 > this.limit) {
                setLimit(j + j2 + ((long) this.limitIncrement));
            }
        }
        int i4 = this.in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.offset += (long) i4;
        }
        return i4;
    }
}
