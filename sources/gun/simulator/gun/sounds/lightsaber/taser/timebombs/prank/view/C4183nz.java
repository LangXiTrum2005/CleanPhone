package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.google.android.gms.measurement.api.AppMeasurementSdk;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4183nz {
    public static final C3971lc d;
    public static final C3971lc e;
    public static final C3971lc f;
    public static final C3971lc g;
    public static final C3971lc h;
    public static final C3971lc i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3971lc f4769a;
    public final C3971lc b;
    public final int c;

    static {
        C3971lc c3971lc = C3971lc.d;
        d = G7.x(":");
        e = G7.x(":status");
        f = G7.x(":method");
        g = G7.x(":path");
        h = G7.x(":scheme");
        i = G7.x(":authority");
    }

    public C4183nz(C3971lc c3971lc, C3971lc c3971lc2) {
        AbstractC2995aW.q(c3971lc, "name");
        AbstractC2995aW.q(c3971lc2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.f4769a = c3971lc;
        this.b = c3971lc2;
        this.c = c3971lc2.c() + c3971lc.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4183nz)) {
            return false;
        }
        C4183nz c4183nz = (C4183nz) obj;
        return AbstractC2995aW.i(this.f4769a, c4183nz.f4769a) && AbstractC2995aW.i(this.b, c4183nz.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f4769a.hashCode() * 31);
    }

    public final String toString() {
        return this.f4769a.j() + ": " + this.b.j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4183nz(C3971lc c3971lc, String str) {
        this(c3971lc, G7.x(str));
        AbstractC2995aW.q(c3971lc, "name");
        AbstractC2995aW.q(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C3971lc c3971lc2 = C3971lc.d;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4183nz(String str, String str2) {
        this(G7.x(str), G7.x(str2));
        AbstractC2995aW.q(str, "name");
        AbstractC2995aW.q(str2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        C3971lc c3971lc = C3971lc.d;
    }
}
