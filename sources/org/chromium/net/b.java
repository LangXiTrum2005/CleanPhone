package org.chromium.net;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f47586a;

    public b(ByteBuffer byteBuffer) {
        this.f47586a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f47586a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f47586a;
        if (iRemaining >= byteBuffer2.remaining()) {
            byteBuffer.put(byteBuffer2);
        } else {
            int iLimit = byteBuffer2.limit();
            byteBuffer2.limit(byteBuffer.remaining() + byteBuffer2.position());
            byteBuffer.put(byteBuffer2);
            byteBuffer2.limit(iLimit);
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) {
        this.f47586a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
