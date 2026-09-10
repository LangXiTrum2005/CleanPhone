package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SZ extends AbstractC2992aT implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC2992aT f3720a;

    public SZ(AbstractC2992aT abstractC2992aT) {
        abstractC2992aT.getClass();
        this.f3720a = abstractC2992aT;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2992aT
    public final AbstractC2992aT a() {
        return this.f3720a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f3720a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SZ) {
            return this.f3720a.equals(((SZ) obj).f3720a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f3720a.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f3720a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
