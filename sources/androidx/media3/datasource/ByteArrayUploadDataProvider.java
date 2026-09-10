package androidx.media3.datasource;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
final class ByteArrayUploadDataProvider extends UploadDataProvider {
    public final byte[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public int f5727Y;

    public ByteArrayUploadDataProvider(byte[] bArr) {
        this.X = bArr;
    }

    public final long getLength() {
        return this.X.length;
    }

    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        int iMin = Math.min(byteBuffer.remaining(), this.X.length - this.f5727Y);
        byteBuffer.put(this.X, this.f5727Y, iMin);
        this.f5727Y += iMin;
        uploadDataSink.onReadSucceeded(false);
    }

    public final void rewind(UploadDataSink uploadDataSink) {
        this.f5727Y = 0;
        uploadDataSink.onRewindSucceeded();
    }
}
