package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4682tg {
    public static final C4594sg Companion = new C4594sg(null);
    private final Boolean isCoppa;

    public /* synthetic */ C4682tg(int i, Boolean bool, O40 o40) {
        if (1 == (i & 1)) {
            this.isCoppa = bool;
        } else {
            AbstractC4496rb.B(i, 1, C4506rg.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public static /* synthetic */ C4682tg copy$default(C4682tg c4682tg, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4682tg.isCoppa;
        }
        return c4682tg.copy(bool);
    }

    public static final void write$Self(C4682tg c4682tg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4682tg, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.r(d40, 0, C3969lb.f4651a, c4682tg.isCoppa);
    }

    public final Boolean component1() {
        return this.isCoppa;
    }

    public final C4682tg copy(Boolean bool) {
        return new C4682tg(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4682tg) && AbstractC2995aW.i(this.isCoppa, ((C4682tg) obj).isCoppa);
    }

    public int hashCode() {
        Boolean bool = this.isCoppa;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final Boolean isCoppa() {
        return this.isCoppa;
    }

    public String toString() {
        return "COPPA(isCoppa=" + this.isCoppa + ')';
    }

    public C4682tg(Boolean bool) {
        this.isCoppa = bool;
    }

    public static /* synthetic */ void isCoppa$annotations() {
    }
}
