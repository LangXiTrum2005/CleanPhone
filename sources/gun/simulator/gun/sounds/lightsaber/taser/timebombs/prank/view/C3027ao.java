package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3027ao implements InterfaceC2538Kb {
    public static final String d;
    public static final String e;
    public static final String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4142a;
    public final int[] b;
    public final int c;

    static {
        int i = Ug0.f3833a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
    }

    public C3027ao(int i, int i2, int[] iArr) {
        this.f4142a = i;
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.b = iArrCopyOf;
        this.c = i2;
        Arrays.sort(iArrCopyOf);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C3027ao.class != obj.getClass()) {
            return false;
        }
        C3027ao c3027ao = (C3027ao) obj;
        return this.f4142a == c3027ao.f4142a && Arrays.equals(this.b, c3027ao.b) && this.c == c3027ao.c;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.b) + (this.f4142a * 31)) * 31) + this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.f4142a);
        bundle.putIntArray(e, this.b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}
