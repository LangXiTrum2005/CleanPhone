package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4091mv extends AbstractC3589h9 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3589h9
    public final C3585h7 b(C3585h7 c3585h7) throws C3673i7 {
        int i2 = c3585h7.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new C3585h7(c3585h7.f4446a, c3585h7.b, 4) : C3585h7.e;
        }
        throw new C3673i7(c3585h7);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3759j7
    public final void queueInput(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferF;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            byteBufferF = f((i2 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) (((double) (((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i4) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferF.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferF = f(i2);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((double) ((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24))) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i4) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferF.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferF.flip();
    }
}
