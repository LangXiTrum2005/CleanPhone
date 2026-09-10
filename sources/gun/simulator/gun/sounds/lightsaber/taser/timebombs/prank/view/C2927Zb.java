package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2927Zb extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f4077a;
    public int b = -1;

    public C2927Zb(ByteBuffer byteBuffer) {
        this.f4077a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4077a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.b = this.f4077a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f4077a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f4077a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        ByteBuffer byteBuffer = this.f4077a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        ByteBuffer byteBuffer = this.f4077a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}
