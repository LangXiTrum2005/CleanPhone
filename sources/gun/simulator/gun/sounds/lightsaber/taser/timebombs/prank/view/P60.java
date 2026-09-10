package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class P60 extends AbstractC3589h9 {
    public final long i = 150000;
    public final long j = 20000;
    public final short k = 1024;
    public int l;
    public boolean m;
    public byte[] n;
    public byte[] o;
    public int p;
    public int q;
    public int r;
    public boolean s;
    public long t;

    public P60() {
        byte[] bArr = Ug0.e;
        this.n = bArr;
        this.o = bArr;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final C3585h7 b(C3585h7 c3585h7) throws C3673i7 {
        if (c3585h7.c == 2) {
            return this.m ? c3585h7 : C3585h7.e;
        }
        throw new C3673i7(c3585h7);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void c() {
        if (this.m) {
            C3585h7 c3585h7 = this.b;
            int i = c3585h7.d;
            this.l = i;
            int i2 = c3585h7.f4446a;
            int i3 = ((int) ((this.i * ((long) i2)) / 1000000)) * i;
            if (this.n.length != i3) {
                this.n = new byte[i3];
            }
            int i4 = ((int) ((this.j * ((long) i2)) / 1000000)) * i;
            this.r = i4;
            if (this.o.length != i4) {
                this.o = new byte[i4];
            }
        }
        this.p = 0;
        this.t = 0L;
        this.q = 0;
        this.s = false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void d() {
        int i = this.q;
        if (i > 0) {
            h(this.n, i);
        }
        if (this.s) {
            return;
        }
        this.t += (long) (this.r / this.l);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void e() {
        this.m = false;
        this.r = 0;
        byte[] bArr = Ug0.e;
        this.n = bArr;
        this.o = bArr;
    }

    public final int g(ByteBuffer byteBuffer) {
        for (int iPosition = byteBuffer.position(); iPosition < byteBuffer.limit(); iPosition += 2) {
            if (Math.abs((int) byteBuffer.getShort(iPosition)) > this.k) {
                int i = this.l;
                return (iPosition / i) * i;
            }
        }
        return byteBuffer.limit();
    }

    public final void h(byte[] bArr, int i) {
        f(i).put(bArr, 0, i).flip();
        if (i > 0) {
            this.s = true;
        }
    }

    public final void i(ByteBuffer byteBuffer, byte[] bArr, int i) {
        int iMin = Math.min(byteBuffer.remaining(), this.r);
        int i2 = this.r - iMin;
        System.arraycopy(bArr, i - i2, this.o, 0, i2);
        byteBuffer.position(byteBuffer.limit() - iMin);
        byteBuffer.get(this.o, i2, iMin);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final boolean isActive() {
        return this.m;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            if (i == 0) {
                int iLimit = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + this.n.length));
                int iLimit2 = byteBuffer.limit() - 2;
                while (true) {
                    if (iLimit2 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    } else {
                        if (Math.abs((int) byteBuffer.getShort(iLimit2)) > this.k) {
                            int i2 = this.l;
                            iPosition = ((iLimit2 / i2) * i2) + i2;
                            break;
                        }
                        iLimit2 -= 2;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(iPosition);
                    int iRemaining = byteBuffer.remaining();
                    f(iRemaining).put(byteBuffer).flip();
                    if (iRemaining > 0) {
                        this.s = true;
                    }
                }
                byteBuffer.limit(iLimit);
            } else if (i == 1) {
                int iLimit3 = byteBuffer.limit();
                int iG = g(byteBuffer);
                int iPosition2 = iG - byteBuffer.position();
                byte[] bArr = this.n;
                int length = bArr.length;
                int i3 = this.q;
                int i4 = length - i3;
                if (iG >= iLimit3 || iPosition2 >= i4) {
                    int iMin = Math.min(iPosition2, i4);
                    byteBuffer.limit(byteBuffer.position() + iMin);
                    byteBuffer.get(this.n, this.q, iMin);
                    int i5 = this.q + iMin;
                    this.q = i5;
                    byte[] bArr2 = this.n;
                    if (i5 == bArr2.length) {
                        if (this.s) {
                            h(bArr2, this.r);
                            this.t += (long) ((this.q - (this.r * 2)) / this.l);
                        } else {
                            this.t += (long) ((i5 - this.r) / this.l);
                        }
                        i(byteBuffer, this.n, this.q);
                        this.q = 0;
                        this.p = 2;
                    }
                    byteBuffer.limit(iLimit3);
                } else {
                    h(bArr, i3);
                    this.q = 0;
                    this.p = 0;
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                int iLimit4 = byteBuffer.limit();
                int iG2 = g(byteBuffer);
                byteBuffer.limit(iG2);
                this.t += (long) (byteBuffer.remaining() / this.l);
                i(byteBuffer, this.o, this.r);
                if (iG2 < iLimit4) {
                    h(this.o, this.r);
                    this.p = 0;
                    byteBuffer.limit(iLimit4);
                }
            }
        }
    }
}
