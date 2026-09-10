package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.zS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5190zS {
    public static final C5102yS Companion = new C5102yS(null);
    private final String params;
    private final String vendorKey;
    private final String vendorURL;

    public C5190zS() {
        this((String) null, (String) null, (String) null, 7, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C5190zS copy$default(C5190zS c5190zS, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5190zS.params;
        }
        if ((i & 2) != 0) {
            str2 = c5190zS.vendorKey;
        }
        if ((i & 4) != 0) {
            str3 = c5190zS.vendorURL;
        }
        return c5190zS.copy(str, str2, str3);
    }

    public static final void write$Self(C5190zS c5190zS, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c5190zS, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c5190zS.params != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, c5190zS.params);
        }
        if (interfaceC4596sh.j(d40) || c5190zS.vendorKey != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c5190zS.vendorKey);
        }
        if (!interfaceC4596sh.j(d40) && c5190zS.vendorURL == null) {
            return;
        }
        interfaceC4596sh.r(d40, 2, W90.f3912a, c5190zS.vendorURL);
    }

    public final String component1() {
        return this.params;
    }

    public final String component2() {
        return this.vendorKey;
    }

    public final String component3() {
        return this.vendorURL;
    }

    public final C5190zS copy(String str, String str2, String str3) {
        return new C5190zS(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5190zS)) {
            return false;
        }
        C5190zS c5190zS = (C5190zS) obj;
        return AbstractC2995aW.i(this.params, c5190zS.params) && AbstractC2995aW.i(this.vendorKey, c5190zS.vendorKey) && AbstractC2995aW.i(this.vendorURL, c5190zS.vendorURL);
    }

    public final String getParams() {
        return this.params;
    }

    public final String getVendorKey() {
        return this.vendorKey;
    }

    public final String getVendorURL() {
        return this.vendorURL;
    }

    public int hashCode() {
        String str = this.params;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.vendorKey;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.vendorURL;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OmSdkData(params=");
        sb.append(this.params);
        sb.append(", vendorKey=");
        sb.append(this.vendorKey);
        sb.append(", vendorURL=");
        return DM.l(sb, this.vendorURL, ')');
    }

    public /* synthetic */ C5190zS(String str, String str2, String str3, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public /* synthetic */ C5190zS(int i, String str, String str2, String str3, O40 o40) {
        if ((i & 1) == 0) {
            this.params = null;
        } else {
            this.params = str;
        }
        if ((i & 2) == 0) {
            this.vendorKey = null;
        } else {
            this.vendorKey = str2;
        }
        if ((i & 4) == 0) {
            this.vendorURL = null;
        } else {
            this.vendorURL = str3;
        }
    }

    public C5190zS(String str, String str2, String str3) {
        this.params = str;
        this.vendorKey = str2;
        this.vendorURL = str3;
    }
}
