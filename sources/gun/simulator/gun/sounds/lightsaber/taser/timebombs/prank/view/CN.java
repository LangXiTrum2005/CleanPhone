package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class CN {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2917a;
    public final boolean b;
    public final boolean c;

    public CN(String str, boolean z, boolean z2) {
        this.f2917a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != CN.class) {
            return false;
        }
        CN cn = (CN) obj;
        return TextUtils.equals(this.f2917a, cn.f2917a) && this.b == cn.b && this.c == cn.c;
    }

    public final int hashCode() {
        return ((DM.d(this.f2917a, 31, 31) + (this.b ? 1231 : 1237)) * 31) + (this.c ? 1231 : 1237);
    }
}
