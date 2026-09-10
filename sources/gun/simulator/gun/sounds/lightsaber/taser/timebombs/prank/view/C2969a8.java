package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2969a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4111a;
    public final List b;

    public C2969a8(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f4111a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2969a8)) {
            return false;
        }
        C2969a8 c2969a8 = (C2969a8) obj;
        return this.f4111a.equals(c2969a8.f4111a) && this.b.equals(c2969a8.b);
    }

    public final int hashCode() {
        return ((this.f4111a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f4111a + ", usedDates=" + this.b + "}";
    }
}
