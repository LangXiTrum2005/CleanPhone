package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4070mh0 extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f4708a;

    public C4070mh0(ByteBuffer byteBuffer) {
        this.f4708a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f4708a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j, byte[] bArr, int i, int i2) {
        if (j >= this.f4708a.limit()) {
            return -1;
        }
        this.f4708a.position((int) j);
        int iMin = Math.min(i2, this.f4708a.remaining());
        this.f4708a.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
