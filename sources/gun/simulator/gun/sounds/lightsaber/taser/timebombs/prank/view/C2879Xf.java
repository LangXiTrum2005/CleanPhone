package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Xf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2879Xf implements InterfaceC2538Kb {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final C2911Yl j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3985a;
    public final int b;
    public final int c;
    public final byte[] d;
    public int e;

    static {
        int i2 = Ug0.f3833a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
        j = new C2911Yl(23);
    }

    public C2879Xf(int i2, int i3, int i4, byte[] bArr) {
        this.f3985a = i2;
        this.b = i3;
        this.c = i4;
        this.d = bArr;
    }

    public static int a(int i2) {
        if (i2 == 1) {
            return 1;
        }
        if (i2 != 9) {
            return (i2 == 4 || i2 == 5 || i2 == 6 || i2 == 7) ? 2 : -1;
        }
        return 6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2879Xf.class != obj.getClass()) {
            return false;
        }
        C2879Xf c2879Xf = (C2879Xf) obj;
        return this.f3985a == c2879Xf.f3985a && this.b == c2879Xf.b && this.c == c2879Xf.c && Arrays.equals(this.d, c2879Xf.d);
    }

    public final int hashCode() {
        if (this.e == 0) {
            this.e = Arrays.hashCode(this.d) + ((((((527 + this.f3985a) * 31) + this.b) * 31) + this.c) * 31);
        }
        return this.e;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f, this.f3985a);
        bundle.putInt(g, this.b);
        bundle.putInt(h, this.c);
        bundle.putByteArray(i, this.d);
        return bundle;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(this.f3985a);
        sb.append(", ");
        sb.append(this.b);
        sb.append(", ");
        sb.append(this.c);
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(")");
        return sb.toString();
    }
}
