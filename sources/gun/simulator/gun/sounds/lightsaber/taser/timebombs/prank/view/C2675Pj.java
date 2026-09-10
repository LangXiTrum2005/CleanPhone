package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Pj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2675Pj extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3568a;
    public int b;

    public C2675Pj(InputStream inputStream, long j) {
        super(inputStream);
        this.f3568a = j;
    }

    public final void a(int i) throws IOException {
        if (i >= 0) {
            this.b += i;
            return;
        }
        long j = this.b;
        long j2 = this.f3568a;
        if (j2 - j <= 0) {
            return;
        }
        StringBuilder sbP = DM.p("Failed to read all expected data, expected: ", j2, ", but read: ");
        sbP.append(this.b);
        throw new IOException(sbP.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f3568a - ((long) this.b), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        a(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        a(i3);
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }
}
