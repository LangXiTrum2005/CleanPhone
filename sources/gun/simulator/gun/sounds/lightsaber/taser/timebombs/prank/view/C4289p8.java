package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Arrays;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4289p8 extends Sd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4824a;
    public final byte[] b;
    public final HV c;

    public C4289p8(String str, byte[] bArr, HV hv) {
        this.f4824a = str;
        this.b = bArr;
        this.c = hv;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sd0)) {
            return false;
        }
        Sd0 sd0 = (Sd0) obj;
        if (this.f4824a.equals(((C4289p8) sd0).f4824a)) {
            if (Arrays.equals(this.b, (sd0 instanceof C4289p8 ? (C4289p8) sd0 : (C4289p8) sd0).b) && this.c.equals(((C4289p8) sd0).c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f4824a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b)) * 1000003) ^ this.c.hashCode();
    }
}
