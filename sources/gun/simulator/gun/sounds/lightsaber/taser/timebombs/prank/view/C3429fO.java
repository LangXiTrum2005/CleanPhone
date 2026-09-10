package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.fO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3429fO implements InterfaceC2538Kb {
    public static final C3429fO d = new C3429fO(new C4568sM(9));
    public static final String e;
    public static final String f;
    public static final String g;
    public static final Nd0 h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4365a;
    public final String b;
    public final Bundle c;

    static {
        int i = Ug0.f3833a;
        e = Integer.toString(0, 36);
        f = Integer.toString(1, 36);
        g = Integer.toString(2, 36);
        h = new Nd0(28);
    }

    public C3429fO(C4568sM c4568sM) {
        this.f4365a = (Uri) c4568sM.b;
        this.b = (String) c4568sM.c;
        this.c = (Bundle) c4568sM.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3429fO)) {
            return false;
        }
        C3429fO c3429fO = (C3429fO) obj;
        return Ug0.a(this.f4365a, c3429fO.f4365a) && Ug0.a(this.b, c3429fO.b);
    }

    public final int hashCode() {
        Uri uri = this.f4365a;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        String str = this.b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2538Kb
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        Uri uri = this.f4365a;
        if (uri != null) {
            bundle.putParcelable(e, uri);
        }
        String str = this.b;
        if (str != null) {
            bundle.putString(f, str);
        }
        Bundle bundle2 = this.c;
        if (bundle2 != null) {
            bundle.putBundle(g, bundle2);
        }
        return bundle;
    }
}
