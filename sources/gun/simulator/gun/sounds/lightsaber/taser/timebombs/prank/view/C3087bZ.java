package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3087bZ extends AbstractC3589h9 {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final C3585h7 b(C3585h7 c3585h7) throws C3673i7 {
        int i = c3585h7.c;
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return i != 2 ? new C3585h7(c3585h7.f4446a, c3585h7.b, 2) : C3585h7.e;
        }
        throw new C3673i7(c3585h7);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        int i2 = this.b.c;
        if (i2 == 3) {
            i *= 2;
        } else if (i2 == 4) {
            i /= 2;
        } else if (i2 != 268435456) {
            if (i2 != 536870912) {
                if (i2 != 805306368) {
                    throw new IllegalStateException();
                }
                i /= 2;
            } else {
                i /= 3;
                i *= 2;
            }
        }
        ByteBuffer byteBufferF = f(i);
        int i3 = this.b.c;
        if (i3 == 3) {
            while (iPosition < iLimit) {
                byteBufferF.put((byte) 0);
                byteBufferF.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        } else if (i3 == 4) {
            while (iPosition < iLimit) {
                short sI = (short) (Ug0.i(byteBuffer.getFloat(iPosition), -1.0f, 1.0f) * 32767.0f);
                byteBufferF.put((byte) (sI & 255));
                byteBufferF.put((byte) ((sI >> 8) & 255));
                iPosition += 4;
            }
        } else if (i3 == 268435456) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition));
                iPosition += 2;
            }
        } else if (i3 == 536870912) {
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 1));
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            while (iPosition < iLimit) {
                byteBufferF.put(byteBuffer.get(iPosition + 2));
                byteBufferF.put(byteBuffer.get(iPosition + 3));
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
