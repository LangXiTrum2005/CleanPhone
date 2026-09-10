package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xd0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5029xd0 implements InterfaceC2538Kb {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5234a;
    public final C3974ld0 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i2 = Ug0.f3833a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public C5029xd0(C3974ld0 c3974ld0, boolean z, int[] iArr, boolean[] zArr) {
        int i2 = c3974ld0.f4655a;
        this.f5234a = i2;
        boolean z2 = false;
        FW.h(i2 == iArr.length && i2 == zArr.length);
        this.b = c3974ld0;
        if (z && i2 > 1) {
            z2 = true;
        }
        this.c = z2;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final int a() {
        return this.b.c;
    }

    public final boolean b() {
        for (boolean z : this.e) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C5029xd0.class != obj.getClass()) {
            return false;
        }
        C5029xd0 c5029xd0 = (C5029xd0) obj;
        return this.c == c5029xd0.c && this.b.equals(c5029xd0.b) && Arrays.equals(this.d, c5029xd0.d) && Arrays.equals(this.e, c5029xd0.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putBundle(f, this.b.toBundle());
        bundle.putIntArray(g, this.d);
        bundle.putBooleanArray(h, this.e);
        bundle.putBoolean(i, this.c);
        return bundle;
    }
}
