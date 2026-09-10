package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mc0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4060mc0 extends AbstractC4843vX {
    public static final String e;
    public static final String f;
    public static final C2953a0 g;
    public final boolean c;
    public final boolean d;

    static {
        int i = Ug0.f3833a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = new C2953a0(7);
    }

    public C4060mc0() {
        this.c = false;
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4060mc0)) {
            return false;
        }
        C4060mc0 c4060mc0 = (C4060mc0) obj;
        return this.d == c4060mc0.d && this.c == c4060mc0.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.c), Boolean.valueOf(this.d)});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC4843vX.f5134a, 3);
        bundle.putBoolean(e, this.c);
        bundle.putBoolean(f, this.d);
        return bundle;
    }

    public C4060mc0(boolean z) {
        this.c = true;
        this.d = z;
    }
}
