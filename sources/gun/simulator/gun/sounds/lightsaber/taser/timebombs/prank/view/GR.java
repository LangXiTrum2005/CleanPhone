package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;

/* JADX INFO: loaded from: classes3.dex */
public final class GR extends InputStream {
    private final ByteBuffer buf;
    final /* synthetic */ HR this$0;

    public GR(HR hr) {
        this.this$0 = hr;
        this.buf = hr.buffer.slice();
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.buf.remaining();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.buf.hasRemaining()) {
            return this.buf.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        try {
        } catch (InvalidMarkException e) {
            throw new IOException(e);
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.buf.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i2, this.buf.remaining());
        this.buf.get(bArr, i, iMin);
        return iMin;
    }
}
