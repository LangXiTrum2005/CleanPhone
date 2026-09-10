package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.MessageDigest;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.cl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3198cl implements InterfaceC4650tG {
    public final InterfaceC4650tG b;
    public final InterfaceC4650tG c;

    public C3198cl(InterfaceC4650tG interfaceC4650tG, InterfaceC4650tG interfaceC4650tG2) {
        this.b = interfaceC4650tG;
        this.c = interfaceC4650tG2;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        this.b.b(messageDigest);
        this.c.b(messageDigest);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (!(obj instanceof C3198cl)) {
            return false;
        }
        C3198cl c3198cl = (C3198cl) obj;
        return this.b.equals(c3198cl.b) && this.c.equals(c3198cl.c);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "DataCacheKey{sourceKey=" + this.b + ", signature=" + this.c + '}';
    }
}
