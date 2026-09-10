package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Dg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2361Dg {
    public static final C2335Cg Companion = new C2335Cg(null);
    private final String configExtension;
    private final Long configLastValidatedTimestamp;
    private String signals;

    public C2361Dg() {
        this((String) null, (String) null, (Long) null, 7, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C2361Dg copy$default(C2361Dg c2361Dg, String str, String str2, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2361Dg.configExtension;
        }
        if ((i & 2) != 0) {
            str2 = c2361Dg.signals;
        }
        if ((i & 4) != 0) {
            l = c2361Dg.configLastValidatedTimestamp;
        }
        return c2361Dg.copy(str, str2, l);
    }

    public static final void write$Self(C2361Dg c2361Dg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2361Dg, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2361Dg.configExtension != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, c2361Dg.configExtension);
        }
        if (interfaceC4596sh.j(d40) || c2361Dg.signals != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c2361Dg.signals);
        }
        if (!interfaceC4596sh.j(d40) && c2361Dg.configLastValidatedTimestamp == null) {
            return;
        }
        interfaceC4596sh.r(d40, 2, FJ.f3064a, c2361Dg.configLastValidatedTimestamp);
    }

    public final String component1() {
        return this.configExtension;
    }

    public final String component2() {
        return this.signals;
    }

    public final Long component3() {
        return this.configLastValidatedTimestamp;
    }

    public final C2361Dg copy(String str, String str2, Long l) {
        return new C2361Dg(str, str2, l);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2361Dg)) {
            return false;
        }
        C2361Dg c2361Dg = (C2361Dg) obj;
        return AbstractC2995aW.i(this.configExtension, c2361Dg.configExtension) && AbstractC2995aW.i(this.signals, c2361Dg.signals) && AbstractC2995aW.i(this.configLastValidatedTimestamp, c2361Dg.configLastValidatedTimestamp);
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final String getSignals() {
        return this.signals;
    }

    public int hashCode() {
        String str = this.configExtension;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.signals;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.configLastValidatedTimestamp;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final void setSignals(String str) {
        this.signals = str;
    }

    public String toString() {
        return "RequestExt(configExtension=" + this.configExtension + ", signals=" + this.signals + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ')';
    }

    public /* synthetic */ C2361Dg(String str, String str2, Long l, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l);
    }

    public /* synthetic */ C2361Dg(int i, String str, String str2, Long l, O40 o40) {
        if ((i & 1) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        if ((i & 2) == 0) {
            this.signals = null;
        } else {
            this.signals = str2;
        }
        if ((i & 4) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l;
        }
    }

    public C2361Dg(String str, String str2, Long l) {
        this.configExtension = str;
        this.signals = str2;
        this.configLastValidatedTimestamp = l;
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getSignals$annotations() {
    }
}
