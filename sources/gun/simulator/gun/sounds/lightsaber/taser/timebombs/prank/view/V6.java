package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class V6 implements InterfaceC4226oV {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F4 f3859a;
    public int b;
    public int c;
    public Bitmap.Config d;

    public V6(F4 f4) {
        this.f3859a = f4;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4226oV
    public final void a() {
        this.f3859a.h(this);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof V6)) {
            return false;
        }
        V6 v6 = (V6) obj;
        return this.b == v6.b && this.c == v6.c && this.d == v6.d;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        Bitmap.Config config = this.d;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return C3692iN.A(this.b, this.c, this.d);
    }
}
