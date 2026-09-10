package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3575h2 {
    public static final C3487g2 Companion = new C3487g2(null);
    private final String extension;
    private final Boolean required;
    private final String url;

    public C3575h2() {
        this((String) null, (String) null, (Boolean) null, 7, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C3575h2 copy$default(C3575h2 c3575h2, String str, String str2, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3575h2.url;
        }
        if ((i & 2) != 0) {
            str2 = c3575h2.extension;
        }
        if ((i & 4) != 0) {
            bool = c3575h2.required;
        }
        return c3575h2.copy(str, str2, bool);
    }

    public static final void write$Self(C3575h2 c3575h2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c3575h2, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c3575h2.url != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, c3575h2.url);
        }
        if (interfaceC4596sh.j(d40) || c3575h2.extension != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c3575h2.extension);
        }
        if (!interfaceC4596sh.j(d40) && c3575h2.required == null) {
            return;
        }
        interfaceC4596sh.r(d40, 2, C3969lb.f4651a, c3575h2.required);
    }

    public final String component1() {
        return this.url;
    }

    public final String component2() {
        return this.extension;
    }

    public final Boolean component3() {
        return this.required;
    }

    public final C3575h2 copy(String str, String str2, Boolean bool) {
        return new C3575h2(str, str2, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3575h2)) {
            return false;
        }
        C3575h2 c3575h2 = (C3575h2) obj;
        return AbstractC2995aW.i(this.url, c3575h2.url) && AbstractC2995aW.i(this.extension, c3575h2.extension) && AbstractC2995aW.i(this.required, c3575h2.required);
    }

    public final String getExtension() {
        return this.extension;
    }

    public final Boolean getRequired() {
        return this.required;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.extension;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.required;
        return iHashCode2 + (bool != null ? bool.hashCode() : 0);
    }

    public String toString() {
        return "CacheableReplacement(url=" + this.url + ", extension=" + this.extension + ", required=" + this.required + ')';
    }

    public /* synthetic */ C3575h2(String str, String str2, Boolean bool, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : bool);
    }

    public /* synthetic */ C3575h2(int i, String str, String str2, Boolean bool, O40 o40) {
        if ((i & 1) == 0) {
            this.url = null;
        } else {
            this.url = str;
        }
        if ((i & 2) == 0) {
            this.extension = null;
        } else {
            this.extension = str2;
        }
        if ((i & 4) == 0) {
            this.required = null;
        } else {
            this.required = bool;
        }
    }

    public C3575h2(String str, String str2, Boolean bool) {
        this.url = str;
        this.extension = str2;
        this.required = bool;
    }
}
