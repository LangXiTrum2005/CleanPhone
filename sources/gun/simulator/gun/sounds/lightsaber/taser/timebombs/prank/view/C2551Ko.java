package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Ko, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2551Ko {
    public static final C2525Jo Companion = new C2525Jo(null);
    private String amazonAdvertisingId;
    private String appSetId;
    private Integer appSetIdScope;
    private float batteryLevel;
    private int batterySaverEnabled;
    private String batteryState;
    private String connectionType;
    private String connectionTypeDetail;
    private String gaid;
    private boolean isGooglePlayServicesAvailable;
    private boolean isSideloadEnabled;
    private boolean isTv;
    private String language;
    private String locale;
    private int sdCardAvailable;
    private int soundEnabled;
    private String timeZone;
    private float volumeLevel;

    public C2551Ko() {
        this(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, 262143, (AbstractC2471Hm) null);
    }

    public static final void write$Self(C2551Ko c2551Ko, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2551Ko, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2551Ko.isGooglePlayServicesAvailable) {
            interfaceC4596sh.C(d40, 0, c2551Ko.isGooglePlayServicesAvailable);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.appSetId != null) {
            interfaceC4596sh.r(d40, 1, W90.f3912a, c2551Ko.appSetId);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.appSetIdScope != null) {
            interfaceC4596sh.r(d40, 2, AD.f2808a, c2551Ko.appSetIdScope);
        }
        if (interfaceC4596sh.j(d40) || !AbstractC2995aW.i(Float.valueOf(c2551Ko.batteryLevel), Float.valueOf(0.0f))) {
            interfaceC4596sh.k(d40, 3, c2551Ko.batteryLevel);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.batteryState != null) {
            interfaceC4596sh.r(d40, 4, W90.f3912a, c2551Ko.batteryState);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.batterySaverEnabled != 0) {
            interfaceC4596sh.g(5, c2551Ko.batterySaverEnabled, d40);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.connectionType != null) {
            interfaceC4596sh.r(d40, 6, W90.f3912a, c2551Ko.connectionType);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.connectionTypeDetail != null) {
            interfaceC4596sh.r(d40, 7, W90.f3912a, c2551Ko.connectionTypeDetail);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.locale != null) {
            interfaceC4596sh.r(d40, 8, W90.f3912a, c2551Ko.locale);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.language != null) {
            interfaceC4596sh.r(d40, 9, W90.f3912a, c2551Ko.language);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.timeZone != null) {
            interfaceC4596sh.r(d40, 10, W90.f3912a, c2551Ko.timeZone);
        }
        if (interfaceC4596sh.j(d40) || !AbstractC2995aW.i(Float.valueOf(c2551Ko.volumeLevel), Float.valueOf(0.0f))) {
            interfaceC4596sh.k(d40, 11, c2551Ko.volumeLevel);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.soundEnabled != 1) {
            interfaceC4596sh.g(12, c2551Ko.soundEnabled, d40);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.isTv) {
            interfaceC4596sh.C(d40, 13, c2551Ko.isTv);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.sdCardAvailable != 1) {
            interfaceC4596sh.g(14, c2551Ko.sdCardAvailable, d40);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.isSideloadEnabled) {
            interfaceC4596sh.C(d40, 15, c2551Ko.isSideloadEnabled);
        }
        if (interfaceC4596sh.j(d40) || c2551Ko.gaid != null) {
            interfaceC4596sh.r(d40, 16, W90.f3912a, c2551Ko.gaid);
        }
        if (!interfaceC4596sh.j(d40) && c2551Ko.amazonAdvertisingId == null) {
            return;
        }
        interfaceC4596sh.r(d40, 17, W90.f3912a, c2551Ko.amazonAdvertisingId);
    }

    public final boolean component1() {
        return this.isGooglePlayServicesAvailable;
    }

    public final String component10() {
        return this.language;
    }

    public final String component11() {
        return this.timeZone;
    }

    public final float component12() {
        return this.volumeLevel;
    }

    public final int component13() {
        return this.soundEnabled;
    }

    public final boolean component14() {
        return this.isTv;
    }

    public final int component15() {
        return this.sdCardAvailable;
    }

    public final boolean component16() {
        return this.isSideloadEnabled;
    }

    public final String component17() {
        return this.gaid;
    }

    public final String component18() {
        return this.amazonAdvertisingId;
    }

    public final String component2() {
        return this.appSetId;
    }

    public final Integer component3() {
        return this.appSetIdScope;
    }

    public final float component4() {
        return this.batteryLevel;
    }

    public final String component5() {
        return this.batteryState;
    }

    public final int component6() {
        return this.batterySaverEnabled;
    }

    public final String component7() {
        return this.connectionType;
    }

    public final String component8() {
        return this.connectionTypeDetail;
    }

    public final String component9() {
        return this.locale;
    }

    public final C2551Ko copy(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9) {
        return new C2551Ko(z, str, num, f, str2, i, str3, str4, str5, str6, str7, f2, i2, z2, i3, z3, str8, str9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2551Ko)) {
            return false;
        }
        C2551Ko c2551Ko = (C2551Ko) obj;
        return this.isGooglePlayServicesAvailable == c2551Ko.isGooglePlayServicesAvailable && AbstractC2995aW.i(this.appSetId, c2551Ko.appSetId) && AbstractC2995aW.i(this.appSetIdScope, c2551Ko.appSetIdScope) && AbstractC2995aW.i(Float.valueOf(this.batteryLevel), Float.valueOf(c2551Ko.batteryLevel)) && AbstractC2995aW.i(this.batteryState, c2551Ko.batteryState) && this.batterySaverEnabled == c2551Ko.batterySaverEnabled && AbstractC2995aW.i(this.connectionType, c2551Ko.connectionType) && AbstractC2995aW.i(this.connectionTypeDetail, c2551Ko.connectionTypeDetail) && AbstractC2995aW.i(this.locale, c2551Ko.locale) && AbstractC2995aW.i(this.language, c2551Ko.language) && AbstractC2995aW.i(this.timeZone, c2551Ko.timeZone) && AbstractC2995aW.i(Float.valueOf(this.volumeLevel), Float.valueOf(c2551Ko.volumeLevel)) && this.soundEnabled == c2551Ko.soundEnabled && this.isTv == c2551Ko.isTv && this.sdCardAvailable == c2551Ko.sdCardAvailable && this.isSideloadEnabled == c2551Ko.isSideloadEnabled && AbstractC2995aW.i(this.gaid, c2551Ko.gaid) && AbstractC2995aW.i(this.amazonAdvertisingId, c2551Ko.amazonAdvertisingId);
    }

    public final String getAmazonAdvertisingId() {
        return this.amazonAdvertisingId;
    }

    public final String getAppSetId() {
        return this.appSetId;
    }

    public final Integer getAppSetIdScope() {
        return this.appSetIdScope;
    }

    public final float getBatteryLevel() {
        return this.batteryLevel;
    }

    public final int getBatterySaverEnabled() {
        return this.batterySaverEnabled;
    }

    public final String getBatteryState() {
        return this.batteryState;
    }

    public final String getConnectionType() {
        return this.connectionType;
    }

    public final String getConnectionTypeDetail() {
        return this.connectionTypeDetail;
    }

    public final String getGaid() {
        return this.gaid;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final int getSdCardAvailable() {
        return this.sdCardAvailable;
    }

    public final int getSoundEnabled() {
        return this.soundEnabled;
    }

    public final String getTimeZone() {
        return this.timeZone;
    }

    public final float getVolumeLevel() {
        return this.volumeLevel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v32, types: [int] */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    public int hashCode() {
        boolean z = this.isGooglePlayServicesAvailable;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        String str = this.appSetId;
        int iHashCode = (i + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.appSetIdScope;
        int iFloatToIntBits = (Float.floatToIntBits(this.batteryLevel) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        String str2 = this.batteryState;
        int iHashCode2 = (((iFloatToIntBits + (str2 == null ? 0 : str2.hashCode())) * 31) + this.batterySaverEnabled) * 31;
        String str3 = this.connectionType;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.connectionTypeDetail;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.locale;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.language;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.timeZone;
        int iFloatToIntBits2 = (((Float.floatToIntBits(this.volumeLevel) + ((iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31) + this.soundEnabled) * 31;
        boolean z2 = this.isTv;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int i2 = (((iFloatToIntBits2 + r2) * 31) + this.sdCardAvailable) * 31;
        boolean z3 = this.isSideloadEnabled;
        int i3 = (i2 + (z3 ? 1 : z3)) * 31;
        String str8 = this.gaid;
        int iHashCode7 = (i3 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.amazonAdvertisingId;
        return iHashCode7 + (str9 != null ? str9.hashCode() : 0);
    }

    public final boolean isGooglePlayServicesAvailable() {
        return this.isGooglePlayServicesAvailable;
    }

    public final boolean isSideloadEnabled() {
        return this.isSideloadEnabled;
    }

    public final boolean isTv() {
        return this.isTv;
    }

    public final void setAmazonAdvertisingId(String str) {
        this.amazonAdvertisingId = str;
    }

    public final void setAppSetId(String str) {
        this.appSetId = str;
    }

    public final void setAppSetIdScope(Integer num) {
        this.appSetIdScope = num;
    }

    public final void setBatteryLevel(float f) {
        this.batteryLevel = f;
    }

    public final void setBatterySaverEnabled(int i) {
        this.batterySaverEnabled = i;
    }

    public final void setBatteryState(String str) {
        this.batteryState = str;
    }

    public final void setConnectionType(String str) {
        this.connectionType = str;
    }

    public final void setConnectionTypeDetail(String str) {
        this.connectionTypeDetail = str;
    }

    public final void setGaid(String str) {
        this.gaid = str;
    }

    public final void setGooglePlayServicesAvailable(boolean z) {
        this.isGooglePlayServicesAvailable = z;
    }

    public final void setLanguage(String str) {
        this.language = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setSdCardAvailable(int i) {
        this.sdCardAvailable = i;
    }

    public final void setSideloadEnabled(boolean z) {
        this.isSideloadEnabled = z;
    }

    public final void setSoundEnabled(int i) {
        this.soundEnabled = i;
    }

    public final void setTimeZone(String str) {
        this.timeZone = str;
    }

    public final void setTv(boolean z) {
        this.isTv = z;
    }

    public final void setVolumeLevel(float f) {
        this.volumeLevel = f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VungleExt(isGooglePlayServicesAvailable=");
        sb.append(this.isGooglePlayServicesAvailable);
        sb.append(", appSetId=");
        sb.append(this.appSetId);
        sb.append(", appSetIdScope=");
        sb.append(this.appSetIdScope);
        sb.append(", batteryLevel=");
        sb.append(this.batteryLevel);
        sb.append(", batteryState=");
        sb.append(this.batteryState);
        sb.append(", batterySaverEnabled=");
        sb.append(this.batterySaverEnabled);
        sb.append(", connectionType=");
        sb.append(this.connectionType);
        sb.append(", connectionTypeDetail=");
        sb.append(this.connectionTypeDetail);
        sb.append(", locale=");
        sb.append(this.locale);
        sb.append(", language=");
        sb.append(this.language);
        sb.append(", timeZone=");
        sb.append(this.timeZone);
        sb.append(", volumeLevel=");
        sb.append(this.volumeLevel);
        sb.append(", soundEnabled=");
        sb.append(this.soundEnabled);
        sb.append(", isTv=");
        sb.append(this.isTv);
        sb.append(", sdCardAvailable=");
        sb.append(this.sdCardAvailable);
        sb.append(", isSideloadEnabled=");
        sb.append(this.isSideloadEnabled);
        sb.append(", gaid=");
        sb.append(this.gaid);
        sb.append(", amazonAdvertisingId=");
        return DM.l(sb, this.amazonAdvertisingId, ')');
    }

    public /* synthetic */ C2551Ko(int i, boolean z, String str, Integer num, float f, String str2, int i2, String str3, String str4, String str5, String str6, String str7, float f2, int i3, boolean z2, int i4, boolean z3, String str8, String str9, O40 o40) {
        if ((i & 1) == 0) {
            this.isGooglePlayServicesAvailable = false;
        } else {
            this.isGooglePlayServicesAvailable = z;
        }
        if ((i & 2) == 0) {
            this.appSetId = null;
        } else {
            this.appSetId = str;
        }
        if ((i & 4) == 0) {
            this.appSetIdScope = null;
        } else {
            this.appSetIdScope = num;
        }
        if ((i & 8) == 0) {
            this.batteryLevel = 0.0f;
        } else {
            this.batteryLevel = f;
        }
        if ((i & 16) == 0) {
            this.batteryState = null;
        } else {
            this.batteryState = str2;
        }
        if ((i & 32) == 0) {
            this.batterySaverEnabled = 0;
        } else {
            this.batterySaverEnabled = i2;
        }
        if ((i & 64) == 0) {
            this.connectionType = null;
        } else {
            this.connectionType = str3;
        }
        if ((i & 128) == 0) {
            this.connectionTypeDetail = null;
        } else {
            this.connectionTypeDetail = str4;
        }
        if ((i & 256) == 0) {
            this.locale = null;
        } else {
            this.locale = str5;
        }
        if ((i & 512) == 0) {
            this.language = null;
        } else {
            this.language = str6;
        }
        if ((i & 1024) == 0) {
            this.timeZone = null;
        } else {
            this.timeZone = str7;
        }
        if ((i & 2048) == 0) {
            this.volumeLevel = 0.0f;
        } else {
            this.volumeLevel = f2;
        }
        if ((i & 4096) == 0) {
            this.soundEnabled = 1;
        } else {
            this.soundEnabled = i3;
        }
        if ((i & 8192) == 0) {
            this.isTv = false;
        } else {
            this.isTv = z2;
        }
        if ((i & 16384) == 0) {
            this.sdCardAvailable = 1;
        } else {
            this.sdCardAvailable = i4;
        }
        if ((32768 & i) == 0) {
            this.isSideloadEnabled = false;
        } else {
            this.isSideloadEnabled = z3;
        }
        if ((65536 & i) == 0) {
            this.gaid = null;
        } else {
            this.gaid = str8;
        }
        if ((i & 131072) == 0) {
            this.amazonAdvertisingId = null;
        } else {
            this.amazonAdvertisingId = str9;
        }
    }

    public C2551Ko(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9) {
        this.isGooglePlayServicesAvailable = z;
        this.appSetId = str;
        this.appSetIdScope = num;
        this.batteryLevel = f;
        this.batteryState = str2;
        this.batterySaverEnabled = i;
        this.connectionType = str3;
        this.connectionTypeDetail = str4;
        this.locale = str5;
        this.language = str6;
        this.timeZone = str7;
        this.volumeLevel = f2;
        this.soundEnabled = i2;
        this.isTv = z2;
        this.sdCardAvailable = i3;
        this.isSideloadEnabled = z3;
        this.gaid = str8;
        this.amazonAdvertisingId = str9;
    }

    public /* synthetic */ C2551Ko(boolean z, String str, Integer num, float f, String str2, int i, String str3, String str4, String str5, String str6, String str7, float f2, int i2, boolean z2, int i3, boolean z3, String str8, String str9, int i4, AbstractC2471Hm abstractC2471Hm) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : num, (i4 & 8) != 0 ? 0.0f : f, (i4 & 16) != 0 ? null : str2, (i4 & 32) != 0 ? 0 : i, (i4 & 64) != 0 ? null : str3, (i4 & 128) != 0 ? null : str4, (i4 & 256) != 0 ? null : str5, (i4 & 512) != 0 ? null : str6, (i4 & 1024) != 0 ? null : str7, (i4 & 2048) == 0 ? f2 : 0.0f, (i4 & 4096) != 0 ? 1 : i2, (i4 & 8192) != 0 ? false : z2, (i4 & 16384) == 0 ? i3 : 1, (32768 & i4) != 0 ? false : z3, (i4 & 65536) != 0 ? null : str8, (i4 & 131072) != 0 ? null : str9);
    }

    public static /* synthetic */ void getAmazonAdvertisingId$annotations() {
    }

    public static /* synthetic */ void getAppSetId$annotations() {
    }

    public static /* synthetic */ void getAppSetIdScope$annotations() {
    }

    public static /* synthetic */ void getBatteryLevel$annotations() {
    }

    public static /* synthetic */ void getBatterySaverEnabled$annotations() {
    }

    public static /* synthetic */ void getBatteryState$annotations() {
    }

    public static /* synthetic */ void getConnectionType$annotations() {
    }

    public static /* synthetic */ void getConnectionTypeDetail$annotations() {
    }

    public static /* synthetic */ void getGaid$annotations() {
    }

    public static /* synthetic */ void getLanguage$annotations() {
    }

    public static /* synthetic */ void getLocale$annotations() {
    }

    public static /* synthetic */ void getSdCardAvailable$annotations() {
    }

    public static /* synthetic */ void getSoundEnabled$annotations() {
    }

    public static /* synthetic */ void getTimeZone$annotations() {
    }

    public static /* synthetic */ void getVolumeLevel$annotations() {
    }

    public static /* synthetic */ void isGooglePlayServicesAvailable$annotations() {
    }

    public static /* synthetic */ void isSideloadEnabled$annotations() {
    }

    public static /* synthetic */ void isTv$annotations() {
    }
}
