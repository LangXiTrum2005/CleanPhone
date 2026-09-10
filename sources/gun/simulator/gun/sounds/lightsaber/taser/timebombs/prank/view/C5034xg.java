package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5034xg {
    public static final C4946wg Companion = new C4946wg(null);
    private final String consentMessageVersion;
    private final String consentSource;
    private final String consentStatus;
    private final long consentTimestamp;

    public /* synthetic */ C5034xg(int i, String str, String str2, long j, String str3, O40 o40) {
        if (15 != (i & 15)) {
            AbstractC4496rb.B(i, 15, C4858vg.INSTANCE.getDescriptor());
            throw null;
        }
        this.consentStatus = str;
        this.consentSource = str2;
        this.consentTimestamp = j;
        this.consentMessageVersion = str3;
    }

    public static /* synthetic */ C5034xg copy$default(C5034xg c5034xg, String str, String str2, long j, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c5034xg.consentStatus;
        }
        if ((i & 2) != 0) {
            str2 = c5034xg.consentSource;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = c5034xg.consentTimestamp;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = c5034xg.consentMessageVersion;
        }
        return c5034xg.copy(str, str4, j2, str3);
    }

    public static final void write$Self(C5034xg c5034xg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c5034xg, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, c5034xg.consentStatus, d40);
        interfaceC4596sh.o(1, c5034xg.consentSource, d40);
        interfaceC4596sh.l(d40, 2, c5034xg.consentTimestamp);
        interfaceC4596sh.o(3, c5034xg.consentMessageVersion, d40);
    }

    public final String component1() {
        return this.consentStatus;
    }

    public final String component2() {
        return this.consentSource;
    }

    public final long component3() {
        return this.consentTimestamp;
    }

    public final String component4() {
        return this.consentMessageVersion;
    }

    public final C5034xg copy(String str, String str2, long j, String str3) {
        AbstractC2995aW.q(str, "consentStatus");
        AbstractC2995aW.q(str2, "consentSource");
        AbstractC2995aW.q(str3, "consentMessageVersion");
        return new C5034xg(str, str2, j, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5034xg)) {
            return false;
        }
        C5034xg c5034xg = (C5034xg) obj;
        return AbstractC2995aW.i(this.consentStatus, c5034xg.consentStatus) && AbstractC2995aW.i(this.consentSource, c5034xg.consentSource) && this.consentTimestamp == c5034xg.consentTimestamp && AbstractC2995aW.i(this.consentMessageVersion, c5034xg.consentMessageVersion);
    }

    public final String getConsentMessageVersion() {
        return this.consentMessageVersion;
    }

    public final String getConsentSource() {
        return this.consentSource;
    }

    public final String getConsentStatus() {
        return this.consentStatus;
    }

    public final long getConsentTimestamp() {
        return this.consentTimestamp;
    }

    public int hashCode() {
        int iD = DM.d(this.consentSource, this.consentStatus.hashCode() * 31, 31);
        long j = this.consentTimestamp;
        return this.consentMessageVersion.hashCode() + ((iD + ((int) (j ^ (j >>> 32)))) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GDPR(consentStatus=");
        sb.append(this.consentStatus);
        sb.append(", consentSource=");
        sb.append(this.consentSource);
        sb.append(", consentTimestamp=");
        sb.append(this.consentTimestamp);
        sb.append(", consentMessageVersion=");
        return DM.l(sb, this.consentMessageVersion, ')');
    }

    public C5034xg(String str, String str2, long j, String str3) {
        AbstractC2995aW.q(str, "consentStatus");
        AbstractC2995aW.q(str2, "consentSource");
        AbstractC2995aW.q(str3, "consentMessageVersion");
        this.consentStatus = str;
        this.consentSource = str2;
        this.consentTimestamp = j;
        this.consentMessageVersion = str3;
    }

    public static /* synthetic */ void getConsentMessageVersion$annotations() {
    }

    public static /* synthetic */ void getConsentSource$annotations() {
    }

    public static /* synthetic */ void getConsentStatus$annotations() {
    }

    public static /* synthetic */ void getConsentTimestamp$annotations() {
    }
}
