package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3082bU extends AbstractC4843vX {
    public static final String d;
    public static final C2953a0 e;
    public final float c;

    static {
        int i = Ug0.f3833a;
        d = Integer.toString(1, 36);
        e = new C2953a0(0);
    }

    public C3082bU() {
        this.c = -1.0f;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3082bU) {
            return this.c == ((C3082bU) obj).c;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.c)});
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(AbstractC4843vX.f5134a, 1);
        bundle.putFloat(d, this.c);
        return bundle;
    }

    public C3082bU(float f) {
        FW.i(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.c = f;
    }
}
