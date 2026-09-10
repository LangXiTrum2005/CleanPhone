package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.SystemClock;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3555gn implements InterfaceC2973aA {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3730in f4431a;

    public C3555gn(C3730in c3730in) {
        this.f4431a = c3730in;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2973aA
    public final boolean a(Uri uri, BR br, boolean z) {
        HashMap map;
        C3643hn c3643hn;
        C3730in c3730in = this.f4431a;
        if (c3730in.l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            C2847Vz c2847Vz = c3730in.j;
            int i = Ug0.f3833a;
            List list = c2847Vz.e;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                int size = list.size();
                map = c3730in.d;
                if (i2 >= size) {
                    break;
                }
                C3643hn c3643hn2 = (C3643hn) map.get(((C2821Uz) list.get(i2)).f3851a);
                if (c3643hn2 != null && jElapsedRealtime < c3643hn2.h) {
                    i3++;
                }
                i2++;
            }
            C3483g0 c3483g0 = new C3483g0(1, 0, c3730in.j.e.size(), i3);
            c3730in.c.getClass();
            C2868Wu c2868WuY = G7.y(c3483g0, br);
            if (c2868WuY != null && c2868WuY.f3945a == 2 && (c3643hn = (C3643hn) map.get(uri)) != null) {
                C3643hn.a(c3643hn, c2868WuY.b);
            }
        }
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2973aA
    public final void c() {
        this.f4431a.e.remove(this);
    }
}
