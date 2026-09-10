package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.t50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4635t50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FC f5015a;
    public final C3965lY b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Uri g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public C4635t50(C4547s50 c4547s50) {
        this.f5015a = FC.b(c4547s50.f4962a);
        this.b = c4547s50.b.J0();
        String str = c4547s50.d;
        int i = Ug0.f3833a;
        this.c = str;
        this.d = c4547s50.e;
        this.e = c4547s50.f;
        this.g = c4547s50.g;
        this.h = c4547s50.h;
        this.f = c4547s50.c;
        this.i = c4547s50.i;
        this.j = c4547s50.k;
        this.k = c4547s50.l;
        this.l = c4547s50.j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4635t50.class != obj.getClass()) {
            return false;
        }
        C4635t50 c4635t50 = (C4635t50) obj;
        if (this.f == c4635t50.f) {
            FC fc = this.f5015a;
            fc.getClass();
            if (FW.D(fc, c4635t50.f5015a) && this.b.equals(c4635t50.b) && Ug0.a(this.d, c4635t50.d) && Ug0.a(this.c, c4635t50.c) && Ug0.a(this.e, c4635t50.e) && Ug0.a(this.l, c4635t50.l) && Ug0.a(this.g, c4635t50.g) && Ug0.a(this.j, c4635t50.j) && Ug0.a(this.k, c4635t50.k) && Ug0.a(this.h, c4635t50.h) && Ug0.a(this.i, c4635t50.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + ((this.f5015a.hashCode() + EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE) * 31)) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode4 = (((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f) * 31;
        String str4 = this.l;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Uri uri = this.g;
        int iHashCode6 = (iHashCode5 + (uri == null ? 0 : uri.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.i;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }
}
