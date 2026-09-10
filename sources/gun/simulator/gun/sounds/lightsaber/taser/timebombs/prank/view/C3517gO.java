package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.gO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3517gO {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f4413a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    public C3517gO(C3605hO c3605hO) {
        this.f4413a = (Uri) c3605hO.d;
        this.b = (String) c3605hO.f4454a;
        this.c = (String) c3605hO.e;
        this.d = c3605hO.b;
        this.e = c3605hO.c;
        this.f = (String) c3605hO.f;
        this.g = (String) c3605hO.g;
    }

    public final C3605hO a() {
        C3605hO c3605hO = new C3605hO();
        c3605hO.d = this.f4413a;
        c3605hO.f4454a = this.b;
        c3605hO.e = this.c;
        c3605hO.b = this.d;
        c3605hO.c = this.e;
        c3605hO.f = this.f;
        c3605hO.g = this.g;
        return c3605hO;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3517gO)) {
            return false;
        }
        C3517gO c3517gO = (C3517gO) obj;
        return this.f4413a.equals(c3517gO.f4413a) && Ug0.a(this.b, c3517gO.b) && Ug0.a(this.c, c3517gO.c) && this.d == c3517gO.d && this.e == c3517gO.e && Ug0.a(this.f, c3517gO.f) && Ug0.a(this.g, c3517gO.g);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int iHashCode = this.f4413a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
