package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4841vV implements InterfaceC4753uV, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5133a;

    public C4841vV(List list) {
        this.f5133a = list;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4753uV
    public final boolean apply(Object obj) {
        int i = 0;
        while (true) {
            List list = this.f5133a;
            if (i >= list.size()) {
                return true;
            }
            if (!((InterfaceC4753uV) list.get(i)).apply(obj)) {
                return false;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4841vV) {
            return this.f5133a.equals(((C4841vV) obj).f5133a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5133a.hashCode() + 306654252;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : this.f5133a) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
