package com.bytedance.sdk.component.ud.qdl.qdl.qdl;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes.dex */
public class wd extends InputStream {
    InputStream qdl;
    HttpURLConnection ud;

    public wd(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.qdl = inputStream;
        this.ud = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            inputStream.close();
            this.qdl = null;
        }
        HttpURLConnection httpURLConnection = this.ud;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.ud = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i2) {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            inputStream.mark(i2);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        InputStream inputStream = this.qdl;
        if (inputStream != null) {
            return inputStream.read(bArr, i2, i3);
        }
        return 0;
    }
}
