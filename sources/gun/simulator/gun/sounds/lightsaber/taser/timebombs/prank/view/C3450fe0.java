package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fe0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3450fe0 extends AbstractC3589h9 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final C3585h7 b(C3585h7 c3585h7) throws C3673i7 {
        if (c3585h7.c != 2) {
            throw new C3673i7(c3585h7);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? C3585h7.e : c3585h7;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void c() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void d() {
        if (this.k) {
            int i = this.n;
            if (i > 0) {
                this.o += (long) (i / this.b.d);
            }
            this.n = 0;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void e() {
        this.m = Ug0.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final ByteBuffer getOutput() {
        int i;
        if (super.isEnded() && (i = this.n) > 0) {
            f(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.getOutput();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final boolean isEnded() {
        return super.isEnded() && this.n == 0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += (long) (iMin / this.b.d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferF = f(length);
        int iJ = Ug0.j(length, 0, this.n);
        byteBufferF.put(this.m, 0, iJ);
        int iJ2 = Ug0.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferF.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferF.flip();
    }
}
