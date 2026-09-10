package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2622Ni {
    public static final C4335pi Companion = new C4335pi(null);
    private C3983li autoRedirect;
    private final C4247oi cleverCache;
    private final String configExtension;
    private Long configLastValidatedTimestamp;
    private final C4598si configSettings;
    private final Boolean disableAdId;
    private final C4862vi endpoints;
    private final Boolean fpdEnabled;
    private final Boolean isCacheableAssetsRequired;
    private final Boolean isReportIncentivizedEnabled;
    private final C2441Gi logMetricsSettings;
    private final List<C4664tU> placements;
    private final Boolean rtaDebugging;
    private final Integer sessionTimeout;
    private final Integer signalSessionTimeout;
    private final Boolean signalsDisabled;
    private final C2519Ji userPrivacy;
    private final C2596Mi viewAbility;
    private final Boolean waitForConnectivityForTPAT;

    public C2622Ni() {
        this((C4247oi) null, (C4598si) null, (C4862vi) null, (C2441Gi) null, (List) null, (C2519Ji) null, (C2596Mi) null, (String) null, (Boolean) null, (Boolean) null, (Integer) null, (Boolean) null, (Integer) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Long) null, (C3983li) null, 524287, (AbstractC2471Hm) null);
    }

    public static final void write$Self(C2622Ni c2622Ni, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2622Ni, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2622Ni.cleverCache != null) {
            interfaceC4596sh.r(d40, 0, C4071mi.INSTANCE, c2622Ni.cleverCache);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.configSettings != null) {
            interfaceC4596sh.r(d40, 1, C4423qi.INSTANCE, c2622Ni.configSettings);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.endpoints != null) {
            interfaceC4596sh.r(d40, 2, C4686ti.INSTANCE, c2622Ni.endpoints);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.logMetricsSettings != null) {
            interfaceC4596sh.r(d40, 3, C2389Ei.INSTANCE, c2622Ni.logMetricsSettings);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.placements != null) {
            interfaceC4596sh.r(d40, 4, new T5(C4488rU.INSTANCE, 0), c2622Ni.placements);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.userPrivacy != null) {
            interfaceC4596sh.r(d40, 5, C2467Hi.INSTANCE, c2622Ni.userPrivacy);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.viewAbility != null) {
            interfaceC4596sh.r(d40, 6, C2545Ki.INSTANCE, c2622Ni.viewAbility);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.configExtension != null) {
            interfaceC4596sh.r(d40, 7, W90.f3912a, c2622Ni.configExtension);
        }
        if (interfaceC4596sh.j(d40) || !AbstractC2995aW.i(c2622Ni.disableAdId, Boolean.TRUE)) {
            interfaceC4596sh.r(d40, 8, C3969lb.f4651a, c2622Ni.disableAdId);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.isReportIncentivizedEnabled != null) {
            interfaceC4596sh.r(d40, 9, C3969lb.f4651a, c2622Ni.isReportIncentivizedEnabled);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.sessionTimeout != null) {
            interfaceC4596sh.r(d40, 10, AD.f2808a, c2622Ni.sessionTimeout);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.waitForConnectivityForTPAT != null) {
            interfaceC4596sh.r(d40, 11, C3969lb.f4651a, c2622Ni.waitForConnectivityForTPAT);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.signalSessionTimeout != null) {
            interfaceC4596sh.r(d40, 12, AD.f2808a, c2622Ni.signalSessionTimeout);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.isCacheableAssetsRequired != null) {
            interfaceC4596sh.r(d40, 13, C3969lb.f4651a, c2622Ni.isCacheableAssetsRequired);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.signalsDisabled != null) {
            interfaceC4596sh.r(d40, 14, C3969lb.f4651a, c2622Ni.signalsDisabled);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.fpdEnabled != null) {
            interfaceC4596sh.r(d40, 15, C3969lb.f4651a, c2622Ni.fpdEnabled);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.rtaDebugging != null) {
            interfaceC4596sh.r(d40, 16, C3969lb.f4651a, c2622Ni.rtaDebugging);
        }
        if (interfaceC4596sh.j(d40) || c2622Ni.configLastValidatedTimestamp != null) {
            interfaceC4596sh.r(d40, 17, FJ.f3064a, c2622Ni.configLastValidatedTimestamp);
        }
        if (!interfaceC4596sh.j(d40) && c2622Ni.autoRedirect == null) {
            return;
        }
        interfaceC4596sh.r(d40, 18, C3807ji.INSTANCE, c2622Ni.autoRedirect);
    }

    public final C4247oi component1() {
        return this.cleverCache;
    }

    public final Boolean component10() {
        return this.isReportIncentivizedEnabled;
    }

    public final Integer component11() {
        return this.sessionTimeout;
    }

    public final Boolean component12() {
        return this.waitForConnectivityForTPAT;
    }

    public final Integer component13() {
        return this.signalSessionTimeout;
    }

    public final Boolean component14() {
        return this.isCacheableAssetsRequired;
    }

    public final Boolean component15() {
        return this.signalsDisabled;
    }

    public final Boolean component16() {
        return this.fpdEnabled;
    }

    public final Boolean component17() {
        return this.rtaDebugging;
    }

    public final Long component18() {
        return this.configLastValidatedTimestamp;
    }

    public final C3983li component19() {
        return this.autoRedirect;
    }

    public final C4598si component2() {
        return this.configSettings;
    }

    public final C4862vi component3() {
        return this.endpoints;
    }

    public final C2441Gi component4() {
        return this.logMetricsSettings;
    }

    public final List<C4664tU> component5() {
        return this.placements;
    }

    public final C2519Ji component6() {
        return this.userPrivacy;
    }

    public final C2596Mi component7() {
        return this.viewAbility;
    }

    public final String component8() {
        return this.configExtension;
    }

    public final Boolean component9() {
        return this.disableAdId;
    }

    public final C2622Ni copy(C4247oi c4247oi, C4598si c4598si, C4862vi c4862vi, C2441Gi c2441Gi, List<C4664tU> list, C2519Ji c2519Ji, C2596Mi c2596Mi, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l, C3983li c3983li) {
        return new C2622Ni(c4247oi, c4598si, c4862vi, c2441Gi, list, c2519Ji, c2596Mi, str, bool, bool2, num, bool3, num2, bool4, bool5, bool6, bool7, l, c3983li);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2622Ni)) {
            return false;
        }
        C2622Ni c2622Ni = (C2622Ni) obj;
        return AbstractC2995aW.i(this.cleverCache, c2622Ni.cleverCache) && AbstractC2995aW.i(this.configSettings, c2622Ni.configSettings) && AbstractC2995aW.i(this.endpoints, c2622Ni.endpoints) && AbstractC2995aW.i(this.logMetricsSettings, c2622Ni.logMetricsSettings) && AbstractC2995aW.i(this.placements, c2622Ni.placements) && AbstractC2995aW.i(this.userPrivacy, c2622Ni.userPrivacy) && AbstractC2995aW.i(this.viewAbility, c2622Ni.viewAbility) && AbstractC2995aW.i(this.configExtension, c2622Ni.configExtension) && AbstractC2995aW.i(this.disableAdId, c2622Ni.disableAdId) && AbstractC2995aW.i(this.isReportIncentivizedEnabled, c2622Ni.isReportIncentivizedEnabled) && AbstractC2995aW.i(this.sessionTimeout, c2622Ni.sessionTimeout) && AbstractC2995aW.i(this.waitForConnectivityForTPAT, c2622Ni.waitForConnectivityForTPAT) && AbstractC2995aW.i(this.signalSessionTimeout, c2622Ni.signalSessionTimeout) && AbstractC2995aW.i(this.isCacheableAssetsRequired, c2622Ni.isCacheableAssetsRequired) && AbstractC2995aW.i(this.signalsDisabled, c2622Ni.signalsDisabled) && AbstractC2995aW.i(this.fpdEnabled, c2622Ni.fpdEnabled) && AbstractC2995aW.i(this.rtaDebugging, c2622Ni.rtaDebugging) && AbstractC2995aW.i(this.configLastValidatedTimestamp, c2622Ni.configLastValidatedTimestamp) && AbstractC2995aW.i(this.autoRedirect, c2622Ni.autoRedirect);
    }

    public final C3983li getAutoRedirect() {
        return this.autoRedirect;
    }

    public final C4247oi getCleverCache() {
        return this.cleverCache;
    }

    public final String getConfigExtension() {
        return this.configExtension;
    }

    public final Long getConfigLastValidatedTimestamp() {
        return this.configLastValidatedTimestamp;
    }

    public final C4598si getConfigSettings() {
        return this.configSettings;
    }

    public final Boolean getDisableAdId() {
        return this.disableAdId;
    }

    public final C4862vi getEndpoints() {
        return this.endpoints;
    }

    public final Boolean getFpdEnabled() {
        return this.fpdEnabled;
    }

    public final C2441Gi getLogMetricsSettings() {
        return this.logMetricsSettings;
    }

    public final List<C4664tU> getPlacements() {
        return this.placements;
    }

    public final Boolean getRtaDebugging() {
        return this.rtaDebugging;
    }

    public final Integer getSessionTimeout() {
        return this.sessionTimeout;
    }

    public final Integer getSignalSessionTimeout() {
        return this.signalSessionTimeout;
    }

    public final Boolean getSignalsDisabled() {
        return this.signalsDisabled;
    }

    public final C2519Ji getUserPrivacy() {
        return this.userPrivacy;
    }

    public final C2596Mi getViewAbility() {
        return this.viewAbility;
    }

    public final Boolean getWaitForConnectivityForTPAT() {
        return this.waitForConnectivityForTPAT;
    }

    public int hashCode() {
        C4247oi c4247oi = this.cleverCache;
        int iHashCode = (c4247oi == null ? 0 : c4247oi.hashCode()) * 31;
        C4598si c4598si = this.configSettings;
        int iHashCode2 = (iHashCode + (c4598si == null ? 0 : c4598si.hashCode())) * 31;
        C4862vi c4862vi = this.endpoints;
        int iHashCode3 = (iHashCode2 + (c4862vi == null ? 0 : c4862vi.hashCode())) * 31;
        C2441Gi c2441Gi = this.logMetricsSettings;
        int iHashCode4 = (iHashCode3 + (c2441Gi == null ? 0 : c2441Gi.hashCode())) * 31;
        List<C4664tU> list = this.placements;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        C2519Ji c2519Ji = this.userPrivacy;
        int iHashCode6 = (iHashCode5 + (c2519Ji == null ? 0 : c2519Ji.hashCode())) * 31;
        C2596Mi c2596Mi = this.viewAbility;
        int iHashCode7 = (iHashCode6 + (c2596Mi == null ? 0 : c2596Mi.hashCode())) * 31;
        String str = this.configExtension;
        int iHashCode8 = (iHashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.disableAdId;
        int iHashCode9 = (iHashCode8 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isReportIncentivizedEnabled;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.sessionTimeout;
        int iHashCode11 = (iHashCode10 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool3 = this.waitForConnectivityForTPAT;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num2 = this.signalSessionTimeout;
        int iHashCode13 = (iHashCode12 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool4 = this.isCacheableAssetsRequired;
        int iHashCode14 = (iHashCode13 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.signalsDisabled;
        int iHashCode15 = (iHashCode14 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Boolean bool6 = this.fpdEnabled;
        int iHashCode16 = (iHashCode15 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        Boolean bool7 = this.rtaDebugging;
        int iHashCode17 = (iHashCode16 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Long l = this.configLastValidatedTimestamp;
        int iHashCode18 = (iHashCode17 + (l == null ? 0 : l.hashCode())) * 31;
        C3983li c3983li = this.autoRedirect;
        return iHashCode18 + (c3983li != null ? c3983li.hashCode() : 0);
    }

    public final Boolean isCacheableAssetsRequired() {
        return this.isCacheableAssetsRequired;
    }

    public final Boolean isReportIncentivizedEnabled() {
        return this.isReportIncentivizedEnabled;
    }

    public final void setAutoRedirect(C3983li c3983li) {
        this.autoRedirect = c3983li;
    }

    public final void setConfigLastValidatedTimestamp(Long l) {
        this.configLastValidatedTimestamp = l;
    }

    public String toString() {
        return "ConfigPayload(cleverCache=" + this.cleverCache + ", configSettings=" + this.configSettings + ", endpoints=" + this.endpoints + ", logMetricsSettings=" + this.logMetricsSettings + ", placements=" + this.placements + ", userPrivacy=" + this.userPrivacy + ", viewAbility=" + this.viewAbility + ", configExtension=" + this.configExtension + ", disableAdId=" + this.disableAdId + ", isReportIncentivizedEnabled=" + this.isReportIncentivizedEnabled + ", sessionTimeout=" + this.sessionTimeout + ", waitForConnectivityForTPAT=" + this.waitForConnectivityForTPAT + ", signalSessionTimeout=" + this.signalSessionTimeout + ", isCacheableAssetsRequired=" + this.isCacheableAssetsRequired + ", signalsDisabled=" + this.signalsDisabled + ", fpdEnabled=" + this.fpdEnabled + ", rtaDebugging=" + this.rtaDebugging + ", configLastValidatedTimestamp=" + this.configLastValidatedTimestamp + ", autoRedirect=" + this.autoRedirect + ')';
    }

    public /* synthetic */ C2622Ni(int i, C4247oi c4247oi, C4598si c4598si, C4862vi c4862vi, C2441Gi c2441Gi, List list, C2519Ji c2519Ji, C2596Mi c2596Mi, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l, C3983li c3983li, O40 o40) {
        if ((i & 1) == 0) {
            this.cleverCache = null;
        } else {
            this.cleverCache = c4247oi;
        }
        if ((i & 2) == 0) {
            this.configSettings = null;
        } else {
            this.configSettings = c4598si;
        }
        if ((i & 4) == 0) {
            this.endpoints = null;
        } else {
            this.endpoints = c4862vi;
        }
        if ((i & 8) == 0) {
            this.logMetricsSettings = null;
        } else {
            this.logMetricsSettings = c2441Gi;
        }
        if ((i & 16) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i & 32) == 0) {
            this.userPrivacy = null;
        } else {
            this.userPrivacy = c2519Ji;
        }
        if ((i & 64) == 0) {
            this.viewAbility = null;
        } else {
            this.viewAbility = c2596Mi;
        }
        if ((i & 128) == 0) {
            this.configExtension = null;
        } else {
            this.configExtension = str;
        }
        this.disableAdId = (i & 256) == 0 ? Boolean.TRUE : bool;
        if ((i & 512) == 0) {
            this.isReportIncentivizedEnabled = null;
        } else {
            this.isReportIncentivizedEnabled = bool2;
        }
        if ((i & 1024) == 0) {
            this.sessionTimeout = null;
        } else {
            this.sessionTimeout = num;
        }
        if ((i & 2048) == 0) {
            this.waitForConnectivityForTPAT = null;
        } else {
            this.waitForConnectivityForTPAT = bool3;
        }
        if ((i & 4096) == 0) {
            this.signalSessionTimeout = null;
        } else {
            this.signalSessionTimeout = num2;
        }
        if ((i & 8192) == 0) {
            this.isCacheableAssetsRequired = null;
        } else {
            this.isCacheableAssetsRequired = bool4;
        }
        if ((i & 16384) == 0) {
            this.signalsDisabled = null;
        } else {
            this.signalsDisabled = bool5;
        }
        if ((32768 & i) == 0) {
            this.fpdEnabled = null;
        } else {
            this.fpdEnabled = bool6;
        }
        if ((65536 & i) == 0) {
            this.rtaDebugging = null;
        } else {
            this.rtaDebugging = bool7;
        }
        if ((131072 & i) == 0) {
            this.configLastValidatedTimestamp = null;
        } else {
            this.configLastValidatedTimestamp = l;
        }
        if ((i & 262144) == 0) {
            this.autoRedirect = null;
        } else {
            this.autoRedirect = c3983li;
        }
    }

    public C2622Ni(C4247oi c4247oi, C4598si c4598si, C4862vi c4862vi, C2441Gi c2441Gi, List<C4664tU> list, C2519Ji c2519Ji, C2596Mi c2596Mi, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l, C3983li c3983li) {
        this.cleverCache = c4247oi;
        this.configSettings = c4598si;
        this.endpoints = c4862vi;
        this.logMetricsSettings = c2441Gi;
        this.placements = list;
        this.userPrivacy = c2519Ji;
        this.viewAbility = c2596Mi;
        this.configExtension = str;
        this.disableAdId = bool;
        this.isReportIncentivizedEnabled = bool2;
        this.sessionTimeout = num;
        this.waitForConnectivityForTPAT = bool3;
        this.signalSessionTimeout = num2;
        this.isCacheableAssetsRequired = bool4;
        this.signalsDisabled = bool5;
        this.fpdEnabled = bool6;
        this.rtaDebugging = bool7;
        this.configLastValidatedTimestamp = l;
        this.autoRedirect = c3983li;
    }

    public /* synthetic */ C2622Ni(C4247oi c4247oi, C4598si c4598si, C4862vi c4862vi, C2441Gi c2441Gi, List list, C2519Ji c2519Ji, C2596Mi c2596Mi, String str, Boolean bool, Boolean bool2, Integer num, Boolean bool3, Integer num2, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Long l, C3983li c3983li, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : c4247oi, (i & 2) != 0 ? null : c4598si, (i & 4) != 0 ? null : c4862vi, (i & 8) != 0 ? null : c2441Gi, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : c2519Ji, (i & 64) != 0 ? null : c2596Mi, (i & 128) != 0 ? null : str, (i & 256) != 0 ? Boolean.TRUE : bool, (i & 512) != 0 ? null : bool2, (i & 1024) != 0 ? null : num, (i & 2048) != 0 ? null : bool3, (i & 4096) != 0 ? null : num2, (i & 8192) != 0 ? null : bool4, (i & 16384) != 0 ? null : bool5, (i & 32768) != 0 ? null : bool6, (i & 65536) != 0 ? null : bool7, (i & 131072) != 0 ? null : l, (i & 262144) != 0 ? null : c3983li);
    }

    public static /* synthetic */ void getAutoRedirect$annotations() {
    }

    public static /* synthetic */ void getCleverCache$annotations() {
    }

    public static /* synthetic */ void getConfigExtension$annotations() {
    }

    public static /* synthetic */ void getConfigLastValidatedTimestamp$annotations() {
    }

    public static /* synthetic */ void getConfigSettings$annotations() {
    }

    public static /* synthetic */ void getDisableAdId$annotations() {
    }

    public static /* synthetic */ void getEndpoints$annotations() {
    }

    public static /* synthetic */ void getFpdEnabled$annotations() {
    }

    public static /* synthetic */ void getLogMetricsSettings$annotations() {
    }

    public static /* synthetic */ void getPlacements$annotations() {
    }

    public static /* synthetic */ void getRtaDebugging$annotations() {
    }

    public static /* synthetic */ void getSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalSessionTimeout$annotations() {
    }

    public static /* synthetic */ void getSignalsDisabled$annotations() {
    }

    public static /* synthetic */ void getUserPrivacy$annotations() {
    }

    public static /* synthetic */ void getViewAbility$annotations() {
    }

    public static /* synthetic */ void getWaitForConnectivityForTPAT$annotations() {
    }

    public static /* synthetic */ void isCacheableAssetsRequired$annotations() {
    }

    public static /* synthetic */ void isReportIncentivizedEnabled$annotations() {
    }
}
