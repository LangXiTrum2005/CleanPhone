package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n90, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4116n90 extends AbstractC4843vX {
    public static final String e;
    public static final String f;
    public static final C2953a0 g;
    public final int c;
    public final float d;

    static {
        int i = Ug0.f3833a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = new C2953a0(6);
    }

    public C4116n90(int i) {
        FW.i(i > 0, "maxStars must be a positive integer");
        this.c = i;
        this.d = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4116n90)) {
            return false;
        }
        C4116n90 c4116n90 = (C4116n90) obj;
        return this.c == c4116n90.c && this.d == c4116n90.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.c), Float.valueOf(this.d)});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC4843vX.f5134a, 2);
        bundle.putInt(e, this.c);
        bundle.putFloat(f, this.d);
        return bundle;
    }

    public C4116n90(int i, float f2) {
        FW.i(i > 0, "maxStars must be a positive integer");
        FW.i(f2 >= 0.0f && f2 <= ((float) i), "starRating is out of range [0, maxStars]");
        this.c = i;
        this.d = f2;
    }
}
