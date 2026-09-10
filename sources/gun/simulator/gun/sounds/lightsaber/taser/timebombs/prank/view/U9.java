package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class U9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3813a;
    public final String b;
    public final int c;
    public final int d;

    public U9(String str, String str2, int i, int i2) {
        this.f3813a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U9)) {
            return false;
        }
        U9 u9 = (U9) obj;
        return this.c == u9.c && this.d == u9.d && FW.B(this.f3813a, u9.f3813a) && FW.B(this.b, u9.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3813a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }
}
