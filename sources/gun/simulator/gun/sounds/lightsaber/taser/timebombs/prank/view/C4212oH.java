package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.OutputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4212oH extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4786a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f4786a += (long) i2;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.f4786a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f4786a += (long) bArr.length;
    }
}
