package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4305pM extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4832a;

    public C4305pM(C3737is c3737is) {
        super(c3737is);
        this.f4832a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f4832a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long f(long j) {
        int i = this.f4832a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    public final void g(long j) {
        int i = this.f4832a;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f4832a = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f4832a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (f(1L) == -1) {
            return -1;
        }
        int i = super.read();
        g(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f4832a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jF = f(j);
        if (jF == -1) {
            return 0L;
        }
        long jSkip = super.skip(jF);
        g(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iF = (int) f(i2);
        if (iF == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iF);
        g(i3);
        return i3;
    }
}
