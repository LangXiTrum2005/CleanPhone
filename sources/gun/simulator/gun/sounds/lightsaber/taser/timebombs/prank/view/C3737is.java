package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.is, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3737is extends InputStream {
    public static final ArrayDeque c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f4525a;
    public IOException b;

    static {
        char[] cArr = Tg0.f3783a;
        c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4525a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f4525a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f4525a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f4525a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f4525a.read();
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }

    public final void release() {
        this.b = null;
        this.f4525a = null;
        ArrayDeque arrayDeque = c;
        synchronized (arrayDeque) {
            arrayDeque.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f4525a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        try {
            return this.f4525a.skip(j);
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f4525a.read(bArr);
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            return this.f4525a.read(bArr, i, i2);
        } catch (IOException e) {
            this.b = e;
            throw e;
        }
    }
}
