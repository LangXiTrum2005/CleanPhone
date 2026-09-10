package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2530Jt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3287a;
    public final Map b;

    public C2530Jt(String str, Map map) {
        this.f3287a = str;
        this.b = map;
    }

    public static C2530Jt a(String str) {
        return new C2530Jt(str, Collections.emptyMap());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2530Jt)) {
            return false;
        }
        C2530Jt c2530Jt = (C2530Jt) obj;
        return this.f3287a.equals(c2530Jt.f3287a) && this.b.equals(c2530Jt.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f3287a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.f3287a + ", properties=" + this.b.values() + "}";
    }
}
