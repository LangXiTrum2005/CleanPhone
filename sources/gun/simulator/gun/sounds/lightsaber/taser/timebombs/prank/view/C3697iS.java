package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3697iS implements InterfaceC4650tG {
    public final Object b;

    public C3697iS(Object obj) {
        AbstractC2871Wx.V(obj, "Argument must not be null");
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        messageDigest.update(this.b.toString().getBytes(InterfaceC4650tG.f5028a));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (obj instanceof C3697iS) {
            return this.b.equals(((C3697iS) obj).b);
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "ObjectKey{object=" + this.b + '}';
    }
}
