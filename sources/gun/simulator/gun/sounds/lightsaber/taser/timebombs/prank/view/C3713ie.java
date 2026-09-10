package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3713ie extends AbstractC3589h9 {
    public int[] i;
    public int[] j;

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final C3585h7 b(C3585h7 c3585h7) throws C3673i7 {
        int[] iArr = this.i;
        if (iArr == null) {
            return C3585h7.e;
        }
        if (c3585h7.c != 2) {
            throw new C3673i7(c3585h7);
        }
        int length = iArr.length;
        int i = c3585h7.b;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new C3673i7(c3585h7);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new C3585h7(c3585h7.f4446a, iArr.length, 2) : C3585h7.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void c() {
        this.j = this.i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final void e() {
        this.j = null;
        this.i = null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueInput(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferF = f(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferF.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferF.flip();
    }
}
