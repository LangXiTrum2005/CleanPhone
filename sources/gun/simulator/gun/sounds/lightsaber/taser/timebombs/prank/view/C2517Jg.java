package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2517Jg {
    public static final C2491Ig Companion = new C2491Ig(null);
    private C4419qg ccpa;
    private C4682tg coppa;
    private C2634Nu fpd;
    private C5034xg gdpr;
    private C2283Ag iab;

    public C2517Jg() {
        this((C5034xg) null, (C4419qg) null, (C4682tg) null, (C2634Nu) null, (C2283Ag) null, 31, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C2517Jg copy$default(C2517Jg c2517Jg, C5034xg c5034xg, C4419qg c4419qg, C4682tg c4682tg, C2634Nu c2634Nu, C2283Ag c2283Ag, int i, Object obj) {
        if ((i & 1) != 0) {
            c5034xg = c2517Jg.gdpr;
        }
        if ((i & 2) != 0) {
            c4419qg = c2517Jg.ccpa;
        }
        C4419qg c4419qg2 = c4419qg;
        if ((i & 4) != 0) {
            c4682tg = c2517Jg.coppa;
        }
        C4682tg c4682tg2 = c4682tg;
        if ((i & 8) != 0) {
            c2634Nu = c2517Jg.fpd;
        }
        C2634Nu c2634Nu2 = c2634Nu;
        if ((i & 16) != 0) {
            c2283Ag = c2517Jg.iab;
        }
        return c2517Jg.copy(c5034xg, c4419qg2, c4682tg2, c2634Nu2, c2283Ag);
    }

    public static final void write$Self(C2517Jg c2517Jg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2517Jg, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2517Jg.gdpr != null) {
            interfaceC4596sh.r(d40, 0, C4858vg.INSTANCE, c2517Jg.gdpr);
        }
        if (interfaceC4596sh.j(d40) || c2517Jg.ccpa != null) {
            interfaceC4596sh.r(d40, 1, C4243og.INSTANCE, c2517Jg.ccpa);
        }
        if (interfaceC4596sh.j(d40) || c2517Jg.coppa != null) {
            interfaceC4596sh.r(d40, 2, C4506rg.INSTANCE, c2517Jg.coppa);
        }
        if (interfaceC4596sh.j(d40) || c2517Jg.fpd != null) {
            interfaceC4596sh.r(d40, 3, C2582Lu.INSTANCE, c2517Jg.fpd);
        }
        if (!interfaceC4596sh.j(d40) && c2517Jg.iab == null) {
            return;
        }
        interfaceC4596sh.r(d40, 4, C5122yg.INSTANCE, c2517Jg.iab);
    }

    public final C5034xg component1() {
        return this.gdpr;
    }

    public final C4419qg component2() {
        return this.ccpa;
    }

    public final C4682tg component3() {
        return this.coppa;
    }

    public final C2634Nu component4() {
        return this.fpd;
    }

    public final C2283Ag component5() {
        return this.iab;
    }

    public final C2517Jg copy(C5034xg c5034xg, C4419qg c4419qg, C4682tg c4682tg, C2634Nu c2634Nu, C2283Ag c2283Ag) {
        return new C2517Jg(c5034xg, c4419qg, c4682tg, c2634Nu, c2283Ag);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2517Jg)) {
            return false;
        }
        C2517Jg c2517Jg = (C2517Jg) obj;
        return AbstractC2995aW.i(this.gdpr, c2517Jg.gdpr) && AbstractC2995aW.i(this.ccpa, c2517Jg.ccpa) && AbstractC2995aW.i(this.coppa, c2517Jg.coppa) && AbstractC2995aW.i(this.fpd, c2517Jg.fpd) && AbstractC2995aW.i(this.iab, c2517Jg.iab);
    }

    public final C4419qg getCcpa() {
        return this.ccpa;
    }

    public final C4682tg getCoppa() {
        return this.coppa;
    }

    public final C2634Nu getFpd() {
        return this.fpd;
    }

    public final C5034xg getGdpr() {
        return this.gdpr;
    }

    public final C2283Ag getIab() {
        return this.iab;
    }

    public int hashCode() {
        C5034xg c5034xg = this.gdpr;
        int iHashCode = (c5034xg == null ? 0 : c5034xg.hashCode()) * 31;
        C4419qg c4419qg = this.ccpa;
        int iHashCode2 = (iHashCode + (c4419qg == null ? 0 : c4419qg.hashCode())) * 31;
        C4682tg c4682tg = this.coppa;
        int iHashCode3 = (iHashCode2 + (c4682tg == null ? 0 : c4682tg.hashCode())) * 31;
        C2634Nu c2634Nu = this.fpd;
        int iHashCode4 = (iHashCode3 + (c2634Nu == null ? 0 : c2634Nu.hashCode())) * 31;
        C2283Ag c2283Ag = this.iab;
        return iHashCode4 + (c2283Ag != null ? c2283Ag.hashCode() : 0);
    }

    public final void setCcpa(C4419qg c4419qg) {
        this.ccpa = c4419qg;
    }

    public final void setCoppa(C4682tg c4682tg) {
        this.coppa = c4682tg;
    }

    public final void setFpd(C2634Nu c2634Nu) {
        this.fpd = c2634Nu;
    }

    public final void setGdpr(C5034xg c5034xg) {
        this.gdpr = c5034xg;
    }

    public final void setIab(C2283Ag c2283Ag) {
        this.iab = c2283Ag;
    }

    public String toString() {
        return "User(gdpr=" + this.gdpr + ", ccpa=" + this.ccpa + ", coppa=" + this.coppa + ", fpd=" + this.fpd + ", iab=" + this.iab + ')';
    }

    public /* synthetic */ C2517Jg(C5034xg c5034xg, C4419qg c4419qg, C4682tg c4682tg, C2634Nu c2634Nu, C2283Ag c2283Ag, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : c5034xg, (i & 2) != 0 ? null : c4419qg, (i & 4) != 0 ? null : c4682tg, (i & 8) != 0 ? null : c2634Nu, (i & 16) != 0 ? null : c2283Ag);
    }

    public /* synthetic */ C2517Jg(int i, C5034xg c5034xg, C4419qg c4419qg, C4682tg c4682tg, C2634Nu c2634Nu, C2283Ag c2283Ag, O40 o40) {
        if ((i & 1) == 0) {
            this.gdpr = null;
        } else {
            this.gdpr = c5034xg;
        }
        if ((i & 2) == 0) {
            this.ccpa = null;
        } else {
            this.ccpa = c4419qg;
        }
        if ((i & 4) == 0) {
            this.coppa = null;
        } else {
            this.coppa = c4682tg;
        }
        if ((i & 8) == 0) {
            this.fpd = null;
        } else {
            this.fpd = c2634Nu;
        }
        if ((i & 16) == 0) {
            this.iab = null;
        } else {
            this.iab = c2283Ag;
        }
    }

    public C2517Jg(C5034xg c5034xg, C4419qg c4419qg, C4682tg c4682tg, C2634Nu c2634Nu, C2283Ag c2283Ag) {
        this.gdpr = c5034xg;
        this.ccpa = c4419qg;
        this.coppa = c4682tg;
        this.fpd = c2634Nu;
        this.iab = c2283Ag;
    }
}
