package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class A4 implements InterfaceC4650tG {
    public final int b;
    public final InterfaceC4650tG c;

    public A4(int i, InterfaceC4650tG interfaceC4650tG) {
        this.b = i;
        this.c = interfaceC4650tG;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        this.c.b(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.b).array());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (!(obj instanceof A4)) {
            return false;
        }
        A4 a4 = (A4) obj;
        return this.b == a4.b && this.c.equals(a4.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return Tg0.h(this.b, this.c);
    }
}
