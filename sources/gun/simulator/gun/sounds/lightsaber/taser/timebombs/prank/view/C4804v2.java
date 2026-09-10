package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4804v2 {
    public static final C4716u2 Companion = new C4716u2(null);
    private final String extraVast;
    private final Boolean isEnabled;

    public C4804v2() {
        this((Boolean) null, (String) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C4804v2 copy$default(C4804v2 c4804v2, Boolean bool, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c4804v2.isEnabled;
        }
        if ((i & 2) != 0) {
            str = c4804v2.extraVast;
        }
        return c4804v2.copy(bool, str);
    }

    public static final void write$Self(C4804v2 c4804v2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4804v2, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c4804v2.isEnabled != null) {
            interfaceC4596sh.r(d40, 0, C3969lb.f4651a, c4804v2.isEnabled);
        }
        if (!interfaceC4596sh.j(d40) && c4804v2.extraVast == null) {
            return;
        }
        interfaceC4596sh.r(d40, 1, W90.f3912a, c4804v2.extraVast);
    }

    public final Boolean component1() {
        return this.isEnabled;
    }

    public final String component2() {
        return this.extraVast;
    }

    public final C4804v2 copy(Boolean bool, String str) {
        return new C4804v2(bool, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4804v2)) {
            return false;
        }
        C4804v2 c4804v2 = (C4804v2) obj;
        return AbstractC2995aW.i(this.isEnabled, c4804v2.isEnabled) && AbstractC2995aW.i(this.extraVast, c4804v2.extraVast);
    }

    public final String getExtraVast() {
        return this.extraVast;
    }

    public int hashCode() {
        Boolean bool = this.isEnabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.extraVast;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final Boolean isEnabled() {
        return this.isEnabled;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ViewAbilityInfo(isEnabled=");
        sb.append(this.isEnabled);
        sb.append(", extraVast=");
        return DM.l(sb, this.extraVast, ')');
    }

    public /* synthetic */ C4804v2(Boolean bool, String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str);
    }

    public /* synthetic */ C4804v2(int i, Boolean bool, String str, O40 o40) {
        if ((i & 1) == 0) {
            this.isEnabled = null;
        } else {
            this.isEnabled = bool;
        }
        if ((i & 2) == 0) {
            this.extraVast = null;
        } else {
            this.extraVast = str;
        }
    }

    public C4804v2(Boolean bool, String str) {
        this.isEnabled = bool;
        this.extraVast = str;
    }

    public static /* synthetic */ void getExtraVast$annotations() {
    }

    public static /* synthetic */ void isEnabled$annotations() {
    }
}
