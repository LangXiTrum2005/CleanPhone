package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.u70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4727u70 implements InterfaceC4226oV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F4 f5066a;
    public int b;
    public Bitmap.Config c;

    public C4727u70(F4 f4) {
        this.f5066a = f4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4226oV
    public final void a() {
        this.f5066a.h(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4727u70)) {
            return false;
        }
        C4727u70 c4727u70 = (C4727u70) obj;
        return this.b == c4727u70.b && Tg0.b(this.c, c4727u70.c);
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C4815v70.d(this.b, this.c);
    }
}
