package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4420qg0 extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f4894a;

    public C4420qg0(ByteBuffer byteBuffer) {
        this.f4894a = byteBuffer;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return this.f4894a.limit();
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        int iRemaining = byteBuffer.remaining();
        ByteBuffer byteBuffer2 = this.f4894a;
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
        this.f4894a.position(0);
        uploadDataSink.onRewindSucceeded();
    }
}
