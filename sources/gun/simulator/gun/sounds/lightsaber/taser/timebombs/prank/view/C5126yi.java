package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5126yi {
    public static final C5038xi Companion = new C5038xi(null);
    private final String buttonAccept;
    private final String buttonDeny;
    private final String consentMessage;
    private final String consentMessageVersion;
    private final String consentTitle;
    private final Boolean isCountryDataProtected;

    public C5126yi() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (AbstractC2471Hm) null);
    }

    public static /* synthetic */ C5126yi copy$default(C5126yi c5126yi, Boolean bool, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = c5126yi.isCountryDataProtected;
        }
        if ((i & 2) != 0) {
            str = c5126yi.consentTitle;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = c5126yi.consentMessage;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = c5126yi.consentMessageVersion;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = c5126yi.buttonAccept;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = c5126yi.buttonDeny;
        }
        return c5126yi.copy(bool, str6, str7, str8, str9, str5);
    }

    public static final void write$Self(C5126yi c5126yi, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c5126yi, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c5126yi.isCountryDataProtected != null) {
            interfaceC4596sh.r(d40, 0, C3969lb.f4651a, c5126yi.isCountryDataProtected);
        }
        if (interfaceC4596sh.j(d40) || c5126yi.consentTitle != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c5126yi.consentTitle);
        }
        if (interfaceC4596sh.j(d40) || c5126yi.consentMessage != null) {
            interfaceC4596sh.r(d40, 2, W90.f3912a, c5126yi.consentMessage);
        }
        if (interfaceC4596sh.j(d40) || c5126yi.consentMessageVersion != null) {
            interfaceC4596sh.r(d40, 3, W90.f3912a, c5126yi.consentMessageVersion);
        }
        if (interfaceC4596sh.j(d40) || c5126yi.buttonAccept != null) {
            interfaceC4596sh.r(d40, 4, W90.f3912a, c5126yi.buttonAccept);
        }
        if (!interfaceC4596sh.j(d40) && c5126yi.buttonDeny == null) {
            return;
        }
        interfaceC4596sh.r(d40, 5, W90.f3912a, c5126yi.buttonDeny);
    }

    public final Boolean component1() {
        return this.isCountryDataProtected;
    }

    public final String component2() {
        return this.consentTitle;
    }

    public final String component3() {
        return this.consentMessage;
    }

    public final String component4() {
        return this.consentMessageVersion;
    }

    public final String component5() {
        return this.buttonAccept;
    }

    public final String component6() {
        return this.buttonDeny;
    }

    public final C5126yi copy(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        return new C5126yi(bool, str, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5126yi)) {
            return false;
        }
        C5126yi c5126yi = (C5126yi) obj;
        return AbstractC2995aW.i(this.isCountryDataProtected, c5126yi.isCountryDataProtected) && AbstractC2995aW.i(this.consentTitle, c5126yi.consentTitle) && AbstractC2995aW.i(this.consentMessage, c5126yi.consentMessage) && AbstractC2995aW.i(this.consentMessageVersion, c5126yi.consentMessageVersion) && AbstractC2995aW.i(this.buttonAccept, c5126yi.buttonAccept) && AbstractC2995aW.i(this.buttonDeny, c5126yi.buttonDeny);
    }

    public final String getButtonAccept() {
        return this.buttonAccept;
    }

    public final String getButtonDeny() {
        return this.buttonDeny;
    }

    public final String getConsentMessage() {
        return this.consentMessage;
    }

    public final String getConsentMessageVersion() {
        return this.consentMessageVersion;
    }

    public final String getConsentTitle() {
        return this.consentTitle;
    }

    public int hashCode() {
        Boolean bool = this.isCountryDataProtected;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.consentTitle;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.consentMessage;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.consentMessageVersion;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonAccept;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.buttonDeny;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final Boolean isCountryDataProtected() {
        return this.isCountryDataProtected;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GDPRSettings(isCountryDataProtected=");
        sb.append(this.isCountryDataProtected);
        sb.append(", consentTitle=");
        sb.append(this.consentTitle);
        sb.append(", consentMessage=");
        sb.append(this.consentMessage);
        sb.append(", consentMessageVersion=");
        sb.append(this.consentMessageVersion);
        sb.append(", buttonAccept=");
        sb.append(this.buttonAccept);
        sb.append(", buttonDeny=");
        return DM.l(sb, this.buttonDeny, ')');
    }

    public /* synthetic */ C5126yi(Boolean bool, String str, String str2, String str3, String str4, String str5, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }

    public /* synthetic */ C5126yi(int i, Boolean bool, String str, String str2, String str3, String str4, String str5, O40 o40) {
        if ((i & 1) == 0) {
            this.isCountryDataProtected = null;
        } else {
            this.isCountryDataProtected = bool;
        }
        if ((i & 2) == 0) {
            this.consentTitle = null;
        } else {
            this.consentTitle = str;
        }
        if ((i & 4) == 0) {
            this.consentMessage = null;
        } else {
            this.consentMessage = str2;
        }
        if ((i & 8) == 0) {
            this.consentMessageVersion = null;
        } else {
            this.consentMessageVersion = str3;
        }
        if ((i & 16) == 0) {
            this.buttonAccept = null;
        } else {
            this.buttonAccept = str4;
        }
        if ((i & 32) == 0) {
            this.buttonDeny = null;
        } else {
            this.buttonDeny = str5;
        }
    }

    public C5126yi(Boolean bool, String str, String str2, String str3, String str4, String str5) {
        this.isCountryDataProtected = bool;
        this.consentTitle = str;
        this.consentMessage = str2;
        this.consentMessageVersion = str3;
        this.buttonAccept = str4;
        this.buttonDeny = str5;
    }

    public static /* synthetic */ void getButtonAccept$annotations() {
    }

    public static /* synthetic */ void getButtonDeny$annotations() {
    }

    public static /* synthetic */ void getConsentMessage$annotations() {
    }

    public static /* synthetic */ void getConsentMessageVersion$annotations() {
    }

    public static /* synthetic */ void getConsentTitle$annotations() {
    }

    public static /* synthetic */ void isCountryDataProtected$annotations() {
    }
}
