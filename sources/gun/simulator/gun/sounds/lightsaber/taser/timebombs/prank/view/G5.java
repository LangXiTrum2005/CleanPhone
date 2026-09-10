package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes4.dex */
public final class G5 {
    public static final F5 Companion = new F5(null);
    private final String appId;
    private final String bundle;
    private final String ver;

    public /* synthetic */ G5(int i, String str, String str2, String str3, O40 o40) {
        if (7 != (i & 7)) {
            AbstractC4496rb.B(i, 7, E5.INSTANCE.getDescriptor());
            throw null;
        }
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ G5 copy$default(G5 g5, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = g5.bundle;
        }
        if ((i & 2) != 0) {
            str2 = g5.ver;
        }
        if ((i & 4) != 0) {
            str3 = g5.appId;
        }
        return g5.copy(str, str2, str3);
    }

    public static final void write$Self(G5 g5, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(g5, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, g5.bundle, d40);
        interfaceC4596sh.o(1, g5.ver, d40);
        interfaceC4596sh.o(2, g5.appId, d40);
    }

    public final String component1() {
        return this.bundle;
    }

    public final String component2() {
        return this.ver;
    }

    public final String component3() {
        return this.appId;
    }

    public final G5 copy(String str, String str2, String str3) {
        AbstractC2995aW.q(str, "bundle");
        AbstractC2995aW.q(str2, "ver");
        AbstractC2995aW.q(str3, "appId");
        return new G5(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G5)) {
            return false;
        }
        G5 g5 = (G5) obj;
        return AbstractC2995aW.i(this.bundle, g5.bundle) && AbstractC2995aW.i(this.ver, g5.ver) && AbstractC2995aW.i(this.appId, g5.appId);
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getBundle() {
        return this.bundle;
    }

    public final String getVer() {
        return this.ver;
    }

    public int hashCode() {
        return this.appId.hashCode() + DM.d(this.ver, this.bundle.hashCode() * 31, 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AppNode(bundle=");
        sb.append(this.bundle);
        sb.append(", ver=");
        sb.append(this.ver);
        sb.append(", appId=");
        return DM.l(sb, this.appId, ')');
    }

    public G5(String str, String str2, String str3) {
        AbstractC2995aW.q(str, "bundle");
        AbstractC2995aW.q(str2, "ver");
        AbstractC2995aW.q(str3, "appId");
        this.bundle = str;
        this.ver = str2;
        this.appId = str3;
    }

    public static /* synthetic */ void getAppId$annotations() {
    }
}
