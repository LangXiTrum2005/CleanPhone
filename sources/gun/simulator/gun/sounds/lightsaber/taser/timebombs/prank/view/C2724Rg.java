package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2724Rg extends AbstractC2992aT implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f3669a;

    public C2724Rg(P70 p70) {
        this.f3669a = p70;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f3669a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2724Rg) {
            return this.f3669a.equals(((C2724Rg) obj).f3669a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3669a.hashCode();
    }

    public final String toString() {
        return this.f3669a.toString();
    }
}
