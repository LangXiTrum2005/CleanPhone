package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2519Ji {
    public static final C2493Ii Companion = new C2493Ii(null);
    private final C5126yi gdpr;
    private final C2363Di iab;

    public C2519Ji() {
        this((C5126yi) null, (C2363Di) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C2519Ji copy$default(C2519Ji c2519Ji, C5126yi c5126yi, C2363Di c2363Di, int i, Object obj) {
        if ((i & 1) != 0) {
            c5126yi = c2519Ji.gdpr;
        }
        if ((i & 2) != 0) {
            c2363Di = c2519Ji.iab;
        }
        return c2519Ji.copy(c5126yi, c2363Di);
    }

    public static final void write$Self(C2519Ji c2519Ji, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2519Ji, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2519Ji.gdpr != null) {
            interfaceC4596sh.r(d40, 0, C4950wi.INSTANCE, c2519Ji.gdpr);
        }
        if (!interfaceC4596sh.j(d40) && c2519Ji.iab == null) {
            return;
        }
        interfaceC4596sh.r(d40, 1, C5214zi.INSTANCE, c2519Ji.iab);
    }

    public final C5126yi component1() {
        return this.gdpr;
    }

    public final C2363Di component2() {
        return this.iab;
    }

    public final C2519Ji copy(C5126yi c5126yi, C2363Di c2363Di) {
        return new C2519Ji(c5126yi, c2363Di);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2519Ji)) {
            return false;
        }
        C2519Ji c2519Ji = (C2519Ji) obj;
        return AbstractC2995aW.i(this.gdpr, c2519Ji.gdpr) && AbstractC2995aW.i(this.iab, c2519Ji.iab);
    }

    public final C5126yi getGdpr() {
        return this.gdpr;
    }

    public final C2363Di getIab() {
        return this.iab;
    }

    public int hashCode() {
        C5126yi c5126yi = this.gdpr;
        int iHashCode = (c5126yi == null ? 0 : c5126yi.hashCode()) * 31;
        C2363Di c2363Di = this.iab;
        return iHashCode + (c2363Di != null ? c2363Di.hashCode() : 0);
    }

    public String toString() {
        return "UserPrivacy(gdpr=" + this.gdpr + ", iab=" + this.iab + ')';
    }

    public /* synthetic */ C2519Ji(C5126yi c5126yi, C2363Di c2363Di, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : c5126yi, (i & 2) != 0 ? null : c2363Di);
    }

    public /* synthetic */ C2519Ji(int i, C5126yi c5126yi, C2363Di c2363Di, O40 o40) {
        if ((i & 1) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = c5126yi;
        }
        if ((i & 2) == 0) {
            this.iab = null;
        } else {
            this.iab = c2363Di;
        }
    }

    public C2519Ji(C5126yi c5126yi, C2363Di c2363Di) {
        this.gdpr = c5126yi;
        this.iab = c2363Di;
    }

    public static /* synthetic */ void getGdpr$annotations() {
    }

    public static /* synthetic */ void getIab$annotations() {
    }
}
