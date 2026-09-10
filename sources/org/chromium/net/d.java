package org.chromium.net;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile FileChannel f47587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f47588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47589c = new Object();

    public d(c cVar) {
        this.f47588b = cVar;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f47587a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    public final FileChannel d() {
        if (this.f47587a == null) {
            synchronized (this.f47589c) {
                try {
                    if (this.f47587a == null) {
                        this.f47587a = this.f47588b.g();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f47587a;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return d().size();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelD = d();
        int i10 = 0;
        while (i10 == 0) {
            int i11 = fileChannelD.read(byteBuffer);
            if (i11 == -1) {
                break;
            } else {
                i10 += i11;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        d().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
