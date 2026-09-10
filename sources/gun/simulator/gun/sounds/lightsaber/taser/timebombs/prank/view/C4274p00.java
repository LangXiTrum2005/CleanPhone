package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.p00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4274p00 {
    public static final C4186o00 Companion = new C4186o00(null);
    private final String sdkUserAgent;

    public C4274p00() {
        this((String) null, 1, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C4274p00 copy$default(C4274p00 c4274p00, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4274p00.sdkUserAgent;
        }
        return c4274p00.copy(str);
    }

    public static final void write$Self(C4274p00 c4274p00, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4274p00, "self");
        if (!AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) && c4274p00.sdkUserAgent == null) {
            return;
        }
        interfaceC4596sh.r(d40, 0, W90.f3912a, c4274p00.sdkUserAgent);
    }

    public final String component1() {
        return this.sdkUserAgent;
    }

    public final C4274p00 copy(String str) {
        return new C4274p00(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4274p00) && AbstractC2995aW.i(this.sdkUserAgent, ((C4274p00) obj).sdkUserAgent);
    }

    public final String getSdkUserAgent() {
        return this.sdkUserAgent;
    }

    public int hashCode() {
        String str = this.sdkUserAgent;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return DM.l(new StringBuilder("RtbRequest(sdkUserAgent="), this.sdkUserAgent, ')');
    }

    public /* synthetic */ C4274p00(String str, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : str);
    }

    public /* synthetic */ C4274p00(int i, String str, O40 o40) {
        if ((i & 1) == 0) {
            this.sdkUserAgent = null;
        } else {
            this.sdkUserAgent = str;
        }
    }

    public C4274p00(String str) {
        this.sdkUserAgent = str;
    }

    public static /* synthetic */ void getSdkUserAgent$annotations() {
    }
}
