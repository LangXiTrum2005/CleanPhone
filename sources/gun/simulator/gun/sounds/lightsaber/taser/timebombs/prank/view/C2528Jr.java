package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2528Jr {
    private final String description;
    private final boolean errorIsTerminal;
    private final EnumC4719u30 reason;

    public C2528Jr(EnumC4719u30 enumC4719u30, String str, boolean z) {
        AbstractC2995aW.q(enumC4719u30, "reason");
        AbstractC2995aW.q(str, "description");
        this.reason = enumC4719u30;
        this.description = str;
        this.errorIsTerminal = z;
    }

    public static /* synthetic */ C2528Jr copy$default(C2528Jr c2528Jr, EnumC4719u30 enumC4719u30, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            enumC4719u30 = c2528Jr.reason;
        }
        if ((i & 2) != 0) {
            str = c2528Jr.description;
        }
        if ((i & 4) != 0) {
            z = c2528Jr.errorIsTerminal;
        }
        return c2528Jr.copy(enumC4719u30, str, z);
    }

    public final EnumC4719u30 component1() {
        return this.reason;
    }

    public final String component2() {
        return this.description;
    }

    public final boolean component3() {
        return this.errorIsTerminal;
    }

    public final C2528Jr copy(EnumC4719u30 enumC4719u30, String str, boolean z) {
        AbstractC2995aW.q(enumC4719u30, "reason");
        AbstractC2995aW.q(str, "description");
        return new C2528Jr(enumC4719u30, str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2528Jr)) {
            return false;
        }
        C2528Jr c2528Jr = (C2528Jr) obj;
        return this.reason == c2528Jr.reason && AbstractC2995aW.i(this.description, c2528Jr.description) && this.errorIsTerminal == c2528Jr.errorIsTerminal;
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getErrorIsTerminal() {
        return this.errorIsTerminal;
    }

    public final EnumC4719u30 getReason() {
        return this.reason;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iD = DM.d(this.description, this.reason.hashCode() * 31, 31);
        boolean z = this.errorIsTerminal;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return iD + r1;
    }

    public String toString() {
        return "ErrorInfo(reason=" + this.reason + ", description=" + this.description + ", errorIsTerminal=" + this.errorIsTerminal + ')';
    }

    public /* synthetic */ C2528Jr(EnumC4719u30 enumC4719u30, String str, boolean z, int i, AbstractC2471Hm abstractC2471Hm) {
        this(enumC4719u30, str, (i & 4) != 0 ? false : z);
    }
}
