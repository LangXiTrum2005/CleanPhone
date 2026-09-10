package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.rm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4519rm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4945a;
    public final boolean b;
    public final int c;
    public final String d;
    public final Map e;
    public final String[] f;

    public C4519rm0(boolean z, boolean z2, int i, String str, Map map, String[] strArr) {
        this.f4945a = z;
        this.b = z2;
        this.c = i;
        this.d = str;
        this.e = map;
        this.f = strArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4519rm0.class != obj.getClass()) {
            return false;
        }
        C4519rm0 c4519rm0 = (C4519rm0) obj;
        if (this.f4945a == c4519rm0.f4945a && this.b == c4519rm0.b && this.c == c4519rm0.c) {
            return this.d.equals(c4519rm0.d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((((((this.f4945a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + this.c) * 31);
    }
}
