package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.os.Bundle;
import java.util.Collections;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.iO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3693iO implements InterfaceC2538Kb {
    public static final C3693iO g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final Nd0 m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4499a;
    public final C3341eO b;
    public final C3164cO c;
    public final C3955lO d;
    public final YN e;
    public final C3429fO f;

    static {
        WN wn = new WN();
        C5086yC c5086yC = AC.b;
        C3965lY c3965lY = C3965lY.e;
        Collections.emptyList();
        C3965lY c3965lY2 = C3965lY.e;
        g = new C3693iO("", new YN(wn), null, new C3164cO(com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET, -3.4028235E38f, -3.4028235E38f), C3955lO.I, C3429fO.d);
        int i2 = Ug0.f3833a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = new Nd0(25);
    }

    public C3693iO(String str, YN yn, C3341eO c3341eO, C3164cO c3164cO, C3955lO c3955lO, C3429fO c3429fO) {
        this.f4499a = str;
        this.b = c3341eO;
        this.c = c3164cO;
        this.d = c3955lO;
        this.e = yn;
        this.f = c3429fO;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3693iO)) {
            return false;
        }
        C3693iO c3693iO = (C3693iO) obj;
        return Ug0.a(this.f4499a, c3693iO.f4499a) && this.e.equals(c3693iO.e) && Ug0.a(this.b, c3693iO.b) && Ug0.a(this.c, c3693iO.c) && Ug0.a(this.d, c3693iO.d) && Ug0.a(this.f, c3693iO.f);
    }

    public final int hashCode() {
        int iHashCode = this.f4499a.hashCode() * 31;
        C3341eO c3341eO = this.b;
        return this.f.hashCode() + ((this.d.hashCode() + ((this.e.hashCode() + ((this.c.hashCode() + ((iHashCode + (c3341eO != null ? c3341eO.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        String str = this.f4499a;
        if (!str.equals("")) {
            bundle.putString(h, str);
        }
        C3164cO c3164cO = C3164cO.f;
        C3164cO c3164cO2 = this.c;
        if (!c3164cO2.equals(c3164cO)) {
            bundle.putBundle(i, c3164cO2.toBundle());
        }
        C3955lO c3955lO = C3955lO.I;
        C3955lO c3955lO2 = this.d;
        if (!c3955lO2.equals(c3955lO)) {
            bundle.putBundle(j, c3955lO2.toBundle());
        }
        YN yn = XN.f;
        YN yn2 = this.e;
        if (!yn2.equals(yn)) {
            bundle.putBundle(k, yn2.toBundle());
        }
        C3429fO c3429fO = C3429fO.d;
        C3429fO c3429fO2 = this.f;
        if (!c3429fO2.equals(c3429fO)) {
            bundle.putBundle(l, c3429fO2.toBundle());
        }
        return bundle;
    }
}
