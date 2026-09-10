package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2596Mi {
    public static final C2571Li Companion = new C2571Li(null);
    private final Boolean om;

    public C2596Mi() {
        this((Boolean) null, 1, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C2596Mi copy$default(C2596Mi c2596Mi, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c2596Mi.om;
        }
        return c2596Mi.copy(bool);
    }

    public static final void write$Self(C2596Mi c2596Mi, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2596Mi, "self");
        if (!AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) && c2596Mi.om == null) {
            return;
        }
        interfaceC4596sh.r(d40, 0, C3969lb.f4651a, c2596Mi.om);
    }

    public final Boolean component1() {
        return this.om;
    }

    public final C2596Mi copy(Boolean bool) {
        return new C2596Mi(bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2596Mi) && AbstractC2995aW.i(this.om, ((C2596Mi) obj).om);
    }

    public final Boolean getOm() {
        return this.om;
    }

    public int hashCode() {
        Boolean bool = this.om;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public String toString() {
        return "ViewAbilitySettings(om=" + this.om + ')';
    }

    public /* synthetic */ C2596Mi(Boolean bool, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : bool);
    }

    public /* synthetic */ C2596Mi(int i, Boolean bool, O40 o40) {
        if ((i & 1) == 0) {
            this.om = null;
        } else {
            this.om = bool;
        }
    }

    public C2596Mi(Boolean bool) {
        this.om = bool;
    }

    public static /* synthetic */ void getOm$annotations() {
    }
}
