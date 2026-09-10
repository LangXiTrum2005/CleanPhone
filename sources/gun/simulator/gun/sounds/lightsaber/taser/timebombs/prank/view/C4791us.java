package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.us, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4791us extends FilterInputStream {
    public static final byte[] c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
    public static final int d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f5108a;
    public int b;

    public C4791us(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("Cannot add invalid orientation: ", i));
        }
        this.f5108a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i2;
        int i3 = this.b;
        if (i3 < 2 || i3 > (i2 = d)) {
            i = super.read();
        } else {
            i = i3 == i2 ? this.f5108a : c[i3 - 2] & 255;
        }
        if (i != -1) {
            this.b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(j);
        if (jSkip > 0) {
            this.b = (int) (((long) this.b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4 = this.b;
        int i5 = d;
        if (i4 > i5) {
            i3 = super.read(bArr, i, i2);
        } else if (i4 == i5) {
            bArr[i] = this.f5108a;
            i3 = 1;
        } else if (i4 < 2) {
            i3 = super.read(bArr, i, 2 - i4);
        } else {
            int iMin = Math.min(i5 - i4, i2);
            System.arraycopy(c, this.b - 2, bArr, i, iMin);
            i3 = iMin;
        }
        if (i3 > 0) {
            this.b += i3;
        }
        return i3;
    }
}
