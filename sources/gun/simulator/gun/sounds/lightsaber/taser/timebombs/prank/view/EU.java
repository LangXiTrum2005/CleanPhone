package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class EU implements InterfaceC2538Kb {
    public static final EU d = new EU(1.0f, 1.0f);
    public static final String e;
    public static final String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f3024a;
    public final float b;
    public final int c;

    static {
        int i = Ug0.f3833a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
    }

    public EU(float f2, float f3) {
        FW.h(f2 > 0.0f);
        FW.h(f3 > 0.0f);
        this.f3024a = f2;
        this.b = f3;
        this.c = Math.round(f2 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EU.class != obj.getClass()) {
            return false;
        }
        EU eu = (EU) obj;
        return this.f3024a == eu.f3024a && this.b == eu.b;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.f3024a) + 527) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putFloat(e, this.f3024a);
        bundle.putFloat(f, this.b);
        return bundle;
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.f3024a), Float.valueOf(this.b)};
        int i = Ug0.f3833a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
