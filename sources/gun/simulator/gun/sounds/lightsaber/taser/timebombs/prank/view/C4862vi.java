package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.vi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4862vi {
    public static final C4774ui Companion = new C4774ui(null);
    private final String adsEndpoint;
    private final String errorLogsEndpoint;
    private final String metricsEndpoint;
    private final String mraidEndpoint;
    private final String riEndpoint;

    public C4862vi() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C4862vi copy$default(C4862vi c4862vi, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4862vi.adsEndpoint;
        }
        if ((i & 2) != 0) {
            str2 = c4862vi.riEndpoint;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = c4862vi.errorLogsEndpoint;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = c4862vi.metricsEndpoint;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = c4862vi.mraidEndpoint;
        }
        return c4862vi.copy(str, str6, str7, str8, str5);
    }

    public static final void write$Self(C4862vi c4862vi, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4862vi, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c4862vi.adsEndpoint != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, c4862vi.adsEndpoint);
        }
        if (interfaceC4596sh.j(d40) || c4862vi.riEndpoint != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c4862vi.riEndpoint);
        }
        if (interfaceC4596sh.j(d40) || c4862vi.errorLogsEndpoint != null) {
            interfaceC4596sh.r(d40, 2, W90.f3912a, c4862vi.errorLogsEndpoint);
        }
        if (interfaceC4596sh.j(d40) || c4862vi.metricsEndpoint != null) {
            interfaceC4596sh.r(d40, 3, W90.f3912a, c4862vi.metricsEndpoint);
        }
        if (!interfaceC4596sh.j(d40) && c4862vi.mraidEndpoint == null) {
            return;
        }
        interfaceC4596sh.r(d40, 4, W90.f3912a, c4862vi.mraidEndpoint);
    }

    public final String component1() {
        return this.adsEndpoint;
    }

    public final String component2() {
        return this.riEndpoint;
    }

    public final String component3() {
        return this.errorLogsEndpoint;
    }

    public final String component4() {
        return this.metricsEndpoint;
    }

    public final String component5() {
        return this.mraidEndpoint;
    }

    public final C4862vi copy(String str, String str2, String str3, String str4, String str5) {
        return new C4862vi(str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4862vi)) {
            return false;
        }
        C4862vi c4862vi = (C4862vi) obj;
        return AbstractC2995aW.i(this.adsEndpoint, c4862vi.adsEndpoint) && AbstractC2995aW.i(this.riEndpoint, c4862vi.riEndpoint) && AbstractC2995aW.i(this.errorLogsEndpoint, c4862vi.errorLogsEndpoint) && AbstractC2995aW.i(this.metricsEndpoint, c4862vi.metricsEndpoint) && AbstractC2995aW.i(this.mraidEndpoint, c4862vi.mraidEndpoint);
    }

    public final String getAdsEndpoint() {
        return this.adsEndpoint;
    }

    public final String getErrorLogsEndpoint() {
        return this.errorLogsEndpoint;
    }

    public final String getMetricsEndpoint() {
        return this.metricsEndpoint;
    }

    public final String getMraidEndpoint() {
        return this.mraidEndpoint;
    }

    public final String getRiEndpoint() {
        return this.riEndpoint;
    }

    public int hashCode() {
        String str = this.adsEndpoint;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.riEndpoint;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorLogsEndpoint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.metricsEndpoint;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mraidEndpoint;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Endpoints(adsEndpoint=");
        sb.append(this.adsEndpoint);
        sb.append(", riEndpoint=");
        sb.append(this.riEndpoint);
        sb.append(", errorLogsEndpoint=");
        sb.append(this.errorLogsEndpoint);
        sb.append(", metricsEndpoint=");
        sb.append(this.metricsEndpoint);
        sb.append(", mraidEndpoint=");
        return DM.l(sb, this.mraidEndpoint, ')');
    }

    public /* synthetic */ C4862vi(String str, String str2, String str3, String str4, String str5, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public /* synthetic */ C4862vi(int i, String str, String str2, String str3, String str4, String str5, O40 o40) {
        if ((i & 1) == 0) {
            this.adsEndpoint = null;
        } else {
            this.adsEndpoint = str;
        }
        if ((i & 2) == 0) {
            this.riEndpoint = null;
        } else {
            this.riEndpoint = str2;
        }
        if ((i & 4) == 0) {
            this.errorLogsEndpoint = null;
        } else {
            this.errorLogsEndpoint = str3;
        }
        if ((i & 8) == 0) {
            this.metricsEndpoint = null;
        } else {
            this.metricsEndpoint = str4;
        }
        if ((i & 16) == 0) {
            this.mraidEndpoint = null;
        } else {
            this.mraidEndpoint = str5;
        }
    }

    public C4862vi(String str, String str2, String str3, String str4, String str5) {
        this.adsEndpoint = str;
        this.riEndpoint = str2;
        this.errorLogsEndpoint = str3;
        this.metricsEndpoint = str4;
        this.mraidEndpoint = str5;
    }

    public static /* synthetic */ void getAdsEndpoint$annotations() {
    }

    public static /* synthetic */ void getErrorLogsEndpoint$annotations() {
    }

    public static /* synthetic */ void getMetricsEndpoint$annotations() {
    }

    public static /* synthetic */ void getMraidEndpoint$annotations() {
    }

    public static /* synthetic */ void getRiEndpoint$annotations() {
    }
}
