package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5150yz extends AbstractC4843vX {
    public static final String e;
    public static final String f;
    public static final Nd0 g;
    public final boolean c;
    public final boolean d;

    static {
        int i = Ug0.f3833a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = new Nd0(24);
    }

    public C5150yz() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C5150yz)) {
            return false;
        }
        C5150yz c5150yz = (C5150yz) obj;
        return this.d == c5150yz.d && this.c == c5150yz.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC4843vX.f5134a, 0);
        bundle.putBoolean(e, this.c);
        bundle.putBoolean(f, this.d);
        return bundle;
    }

    public C5150yz(boolean z) {
        this.c = true;
        this.d = z;
    }
}
