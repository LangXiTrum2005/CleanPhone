package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import androidx.annotation.NonNull;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class DataSourceInputStream extends InputStream {
    private final DataSource dataSource;
    private final DataSpec dataSpec;
    private long totalBytesRead;
    private boolean opened = false;
    private boolean closed = false;
    private final byte[] singleByteArray = new byte[1];

    public DataSourceInputStream(DataSource dataSource, DataSpec dataSpec) {
        this.dataSource = dataSource;
        this.dataSpec = dataSpec;
    }

    private void checkOpened() throws IOException {
        if (this.opened) {
            return;
        }
        this.dataSource.open(this.dataSpec);
        this.opened = true;
    }

    public long bytesRead() {
        return this.totalBytesRead;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.dataSource.close();
        this.closed = true;
    }

    public void open() throws IOException {
        checkOpened();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.singleByteArray) == -1) {
            return -1;
        }
        return this.singleByteArray[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(@NonNull byte[] bArr, int i10, int i11) throws IOException {
        Assertions.checkState(!this.closed);
        checkOpened();
        int i12 = this.dataSource.read(bArr, i10, i11);
        if (i12 == -1) {
            return -1;
        }
        this.totalBytesRead += (long) i12;
        return i12;
    }
}
