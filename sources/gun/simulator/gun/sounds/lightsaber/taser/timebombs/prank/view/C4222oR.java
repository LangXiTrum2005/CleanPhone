package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4222oR extends AbstractC2992aT implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4222oR f4790a = new C4222oR();

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC2992aT
    public final AbstractC2992aT a() {
        return QZ.f3606a;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        comparable.getClass();
        comparable2.getClass();
        return comparable.compareTo(comparable2);
    }

    public final String toString() {
        return "Ordering.natural()";
    }
}
