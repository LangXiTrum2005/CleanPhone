package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.tU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4664tU {
    public static final C4576sU Companion = new C4576sU(null);
    private final boolean headerBidding;
    private final String referenceId;
    private final String type;
    private Long wakeupTime;

    public /* synthetic */ C4664tU(int i, String str, boolean z, String str2, O40 o40) {
        if (1 != (i & 1)) {
            AbstractC4496rb.B(i, 1, C4488rU.INSTANCE.getDescriptor());
            throw null;
        }
        this.referenceId = str;
        if ((i & 2) == 0) {
            this.headerBidding = false;
        } else {
            this.headerBidding = z;
        }
        if ((i & 4) == 0) {
            this.type = null;
        } else {
            this.type = str2;
        }
        this.wakeupTime = null;
    }

    public static /* synthetic */ C4664tU copy$default(C4664tU c4664tU, String str, boolean z, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4664tU.referenceId;
        }
        if ((i & 2) != 0) {
            z = c4664tU.headerBidding;
        }
        if ((i & 4) != 0) {
            str2 = c4664tU.type;
        }
        return c4664tU.copy(str, z, str2);
    }

    public static final void write$Self(C4664tU c4664tU, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c4664tU, "self");
        AbstractC2995aW.q(interfaceC4596sh, "output");
        AbstractC2995aW.q(d40, "serialDesc");
        interfaceC4596sh.o(0, c4664tU.referenceId, d40);
        if (interfaceC4596sh.j(d40) || c4664tU.headerBidding) {
            interfaceC4596sh.C(d40, 1, c4664tU.headerBidding);
        }
        if (!interfaceC4596sh.j(d40) && c4664tU.type == null) {
            return;
        }
        interfaceC4596sh.r(d40, 2, W90.f3912a, c4664tU.type);
    }

    public final String component1() {
        return this.referenceId;
    }

    public final boolean component2() {
        return this.headerBidding;
    }

    public final String component3() {
        return this.type;
    }

    public final C4664tU copy(String str, boolean z, String str2) {
        AbstractC2995aW.q(str, "referenceId");
        return new C4664tU(str, z, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4664tU)) {
            return false;
        }
        C4664tU c4664tU = (C4664tU) obj;
        return AbstractC2995aW.i(this.referenceId, c4664tU.referenceId) && this.headerBidding == c4664tU.headerBidding && AbstractC2995aW.i(this.type, c4664tU.type);
    }

    public final boolean getHeaderBidding() {
        return this.headerBidding;
    }

    public final String getReferenceId() {
        return this.referenceId;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getWakeupTime() {
        return this.wakeupTime;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = this.referenceId.hashCode() * 31;
        boolean z = this.headerBidding;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        String str = this.type;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final boolean isAppOpen() {
        return AbstractC2995aW.i(this.type, C2390Ej.PLACEMENT_TYPE_APP_OPEN);
    }

    public final boolean isBanner() {
        return AbstractC2995aW.i(this.type, "banner");
    }

    public final boolean isInline() {
        return AbstractC2995aW.i(this.type, "in_line");
    }

    public final boolean isInterstitial() {
        return AbstractC2995aW.i(this.type, C2390Ej.PLACEMENT_TYPE_INTERSTITIAL);
    }

    public final boolean isMREC() {
        return AbstractC2995aW.i(this.type, "mrec");
    }

    public final boolean isNative() {
        return AbstractC2995aW.i(this.type, "native");
    }

    public final boolean isRewardedVideo() {
        return AbstractC2995aW.i(this.type, C2390Ej.PLACEMENT_TYPE_REWARDED);
    }

    public final void setWakeupTime(Long l) {
        this.wakeupTime = l;
    }

    public final void snooze(long j) {
        this.wakeupTime = Long.valueOf((j * ((long) 1000)) + System.currentTimeMillis());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Placement(referenceId=");
        sb.append(this.referenceId);
        sb.append(", headerBidding=");
        sb.append(this.headerBidding);
        sb.append(", type=");
        return DM.l(sb, this.type, ')');
    }

    public C4664tU(String str, boolean z, String str2) {
        AbstractC2995aW.q(str, "referenceId");
        this.referenceId = str;
        this.headerBidding = z;
        this.type = str2;
    }

    public /* synthetic */ C4664tU(String str, boolean z, String str2, int i, AbstractC2471Hm abstractC2471Hm) {
        this(str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2);
    }

    public static /* synthetic */ void getHeaderBidding$annotations() {
    }

    public static /* synthetic */ void getReferenceId$annotations() {
    }

    public static /* synthetic */ void getType$annotations() {
    }

    public static /* synthetic */ void getWakeupTime$annotations() {
    }
}
