package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.he0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3626he0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4460a = new byte[10];
    public boolean b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(InterfaceC4326pd0 interfaceC4326pd0, C4238od0 c4238od0) {
        if (this.c > 0) {
            interfaceC4326pd0.a(this.d, this.e, this.f, this.g, c4238od0);
            this.c = 0;
        }
    }

    public final void b(InterfaceC4326pd0 interfaceC4326pd0, long j, int i, int i2, int i3, C4238od0 c4238od0) {
        if (!(this.g <= i2 + i3)) {
            throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
        }
        if (this.b) {
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(interfaceC4326pd0, c4238od0);
            }
        }
    }

    public final void c(InterfaceC4265ot interfaceC4265ot) {
        if (this.b) {
            return;
        }
        byte[] bArr = this.f4460a;
        interfaceC4265ot.peekFully(bArr, 0, 10);
        interfaceC4265ot.resetPeekPosition();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b = bArr[7];
            if ((b & 254) != 186) {
                return;
            }
            if ((40 << ((bArr[(b & 255) == 187 ? '\t' : '\b'] >> 4) & 7)) == 0) {
                return;
            }
            this.b = true;
        }
    }
}
