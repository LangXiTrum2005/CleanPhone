package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Rl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2729Rl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3676a;
    public final C4619sw b;
    public final C4619sw c;
    public final int d;
    public final int e;

    public C2729Rl(String str, C4619sw c4619sw, C4619sw c4619sw2, int i, int i2) {
        FW.h(i == 0 || i2 == 0);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.f3676a = str;
        c4619sw.getClass();
        this.b = c4619sw;
        c4619sw2.getClass();
        this.c = c4619sw2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2729Rl.class != obj.getClass()) {
            return false;
        }
        C2729Rl c2729Rl = (C2729Rl) obj;
        return this.d == c2729Rl.d && this.e == c2729Rl.e && this.f3676a.equals(c2729Rl.f3676a) && this.b.equals(c2729Rl.b) && this.c.equals(c2729Rl.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + DM.d(this.f3676a, (((527 + this.d) * 31) + this.e) * 31, 31)) * 31);
    }
}
