package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.bumptech.glide.util.CachedHashCodeArrayMap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class YS implements InterfaceC4650tG {
    public final CachedHashCodeArrayMap b = new CachedHashCodeArrayMap();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final void b(MessageDigest messageDigest) {
        for (int i = 0; i < this.b.size(); i++) {
            VS vs = (VS) this.b.keyAt(i);
            Object objValueAt = this.b.valueAt(i);
            US us = vs.b;
            if (vs.d == null) {
                vs.d = vs.c.getBytes(InterfaceC4650tG.f5028a);
            }
            us.d(vs.d, objValueAt, messageDigest);
        }
    }

    public final Object c(VS vs) {
        CachedHashCodeArrayMap cachedHashCodeArrayMap = this.b;
        return cachedHashCodeArrayMap.containsKey(vs) ? cachedHashCodeArrayMap.get(vs) : vs.f3871a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final boolean equals(Object obj) {
        if (obj instanceof YS) {
            return this.b.equals(((YS) obj).b);
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4650tG
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
