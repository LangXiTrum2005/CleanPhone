package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.sg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4595sg0 extends UploadDataProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile FileChannel f4992a;
    public final InterfaceC4507rg0 b;
    public final Object c = new Object();

    public C4595sg0(InterfaceC4507rg0 interfaceC4507rg0) {
        this.b = interfaceC4507rg0;
    }

    @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileChannel fileChannel = this.f4992a;
        if (fileChannel != null) {
            fileChannel.close();
        }
    }

    @Override // org.chromium.net.UploadDataProvider
    public final long getLength() {
        return h().size();
    }

    public final FileChannel h() {
        if (this.f4992a == null) {
            synchronized (this.c) {
                try {
                    if (this.f4992a == null) {
                        this.f4992a = this.b.e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4992a;
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }
        FileChannel fileChannelH = h();
        int i = 0;
        while (i == 0) {
            int i2 = fileChannelH.read(byteBuffer);
            if (i2 == -1) {
                break;
            } else {
                i += i2;
            }
        }
        uploadDataSink.onReadSucceeded(false);
    }

    @Override // org.chromium.net.UploadDataProvider
    public final void rewind(UploadDataSink uploadDataSink) throws IOException {
        h().position(0L);
        uploadDataSink.onRewindSucceeded();
    }
}
