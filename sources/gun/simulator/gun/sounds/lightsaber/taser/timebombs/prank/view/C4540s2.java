package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.s2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4540s2 {
    public static final C4452r2 Companion = new C4452r2(null);
    private final C4804v2 om;

    public C4540s2() {
        this((C4804v2) null, 1, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C4540s2 copy$default(C4540s2 c4540s2, C4804v2 c4804v2, int i, Object obj) {
        if ((i & 1) != 0) {
            c4804v2 = c4540s2.om;
        }
        return c4540s2.copy(c4804v2);
    }

    public static final void write$Self(C4540s2 c4540s2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4540s2, "self");
        if (!AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) && c4540s2.om == null) {
            return;
        }
        interfaceC4596sh.r(d40, 0, C4628t2.INSTANCE, c4540s2.om);
    }

    public final C4804v2 component1() {
        return this.om;
    }

    public final C4540s2 copy(C4804v2 c4804v2) {
        return new C4540s2(c4804v2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4540s2) && AbstractC2995aW.i(this.om, ((C4540s2) obj).om);
    }

    public final C4804v2 getOm() {
        return this.om;
    }

    public int hashCode() {
        C4804v2 c4804v2 = this.om;
        if (c4804v2 == null) {
            return 0;
        }
        return c4804v2.hashCode();
    }

    public String toString() {
        return "ViewAbility(om=" + this.om + ')';
    }

    public /* synthetic */ C4540s2(C4804v2 c4804v2, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : c4804v2);
    }

    public /* synthetic */ C4540s2(int i, C4804v2 c4804v2, O40 o40) {
        if ((i & 1) == 0) {
            this.om = null;
        } else {
            this.om = c4804v2;
        }
    }

    public C4540s2(C4804v2 c4804v2) {
        this.om = c4804v2;
    }
}
