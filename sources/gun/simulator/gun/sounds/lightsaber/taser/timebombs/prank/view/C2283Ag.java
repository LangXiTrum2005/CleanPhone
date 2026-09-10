package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ag, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2283Ag {
    public static final C5210zg Companion = new C5210zg(null);
    private final String tcf;

    public /* synthetic */ C2283Ag(int i, String str, O40 o40) {
        if (1 == (i & 1)) {
            this.tcf = str;
        } else {
            AbstractC4496rb.B(i, 1, C5122yg.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ C2283Ag copy$default(C2283Ag c2283Ag, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2283Ag.tcf;
        }
        return c2283Ag.copy(str);
    }

    public static final void write$Self(C2283Ag c2283Ag, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2283Ag, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, c2283Ag.tcf, d40);
    }

    public final String component1() {
        return this.tcf;
    }

    public final C2283Ag copy(String str) {
        AbstractC2995aW.q(str, "tcf");
        return new C2283Ag(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2283Ag) && AbstractC2995aW.i(this.tcf, ((C2283Ag) obj).tcf);
    }

    public final String getTcf() {
        return this.tcf;
    }

    public int hashCode() {
        return this.tcf.hashCode();
    }

    public String toString() {
        return DM.l(new StringBuilder("IAB(tcf="), this.tcf, ')');
    }

    public C2283Ag(String str) {
        AbstractC2995aW.q(str, "tcf");
        this.tcf = str;
    }

    public static /* synthetic */ void getTcf$annotations() {
    }
}
