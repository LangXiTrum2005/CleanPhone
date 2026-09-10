package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4692tl extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4429ql f5048a;
    public final C4868vl b;
    public boolean d = false;
    public boolean e = false;
    public final byte[] c = new byte[1];

    public C4692tl(InterfaceC4429ql interfaceC4429ql, C4868vl c4868vl) {
        this.f5048a = interfaceC4429ql;
        this.b = c4868vl;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.f5048a.close();
        this.e = true;
    }

    public final void h() {
        if (this.d) {
            return;
        }
        this.f5048a.d(this.b);
        this.d = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return bArr[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        FW.s(!this.e);
        h();
        int i3 = this.f5048a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        return i3;
    }
}
