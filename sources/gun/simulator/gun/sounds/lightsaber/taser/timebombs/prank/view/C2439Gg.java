package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Gg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2439Gg {
    public static final C2413Fg Companion = new C2413Fg(null);
    private C4155ng adSize;
    private final Long adStartTime;
    private final String advAppId;
    private final String placementReferenceId;
    private final List<String> placements;
    private final String user;

    public C2439Gg() {
        this((List) null, (C4155ng) null, (Long) null, (String) null, (String) null, (String) null, 63, (AbstractC2471Hm) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2439Gg copy$default(C2439Gg c2439Gg, List list, C4155ng c4155ng, Long l, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = c2439Gg.placements;
        }
        if ((i & 2) != 0) {
            c4155ng = c2439Gg.adSize;
        }
        C4155ng c4155ng2 = c4155ng;
        if ((i & 4) != 0) {
            l = c2439Gg.adStartTime;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            str = c2439Gg.advAppId;
        }
        String str4 = str;
        if ((i & 16) != 0) {
            str2 = c2439Gg.placementReferenceId;
        }
        String str5 = str2;
        if ((i & 32) != 0) {
            str3 = c2439Gg.user;
        }
        return c2439Gg.copy(list, c4155ng2, l2, str4, str5, str3);
    }

    public static final void write$Self(C2439Gg c2439Gg, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c2439Gg, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c2439Gg.placements != null) {
            interfaceC4596sh.r(d40, 0, new T5(W90.f3912a, 0), c2439Gg.placements);
        }
        if (interfaceC4596sh.j(d40) || c2439Gg.adSize != null) {
            interfaceC4596sh.r(d40, 1, C3979lg.INSTANCE, c2439Gg.adSize);
        }
        if (interfaceC4596sh.j(d40) || c2439Gg.adStartTime != null) {
            interfaceC4596sh.r(d40, 2, FJ.f3064a, c2439Gg.adStartTime);
        }
        if (interfaceC4596sh.j(d40) || c2439Gg.advAppId != null) {
            interfaceC4596sh.r(d40, 3, W90.f3912a, c2439Gg.advAppId);
        }
        if (interfaceC4596sh.j(d40) || c2439Gg.placementReferenceId != null) {
            interfaceC4596sh.r(d40, 4, W90.f3912a, c2439Gg.placementReferenceId);
        }
        if (!interfaceC4596sh.j(d40) && c2439Gg.user == null) {
            return;
        }
        interfaceC4596sh.r(d40, 5, W90.f3912a, c2439Gg.user);
    }

    public final List<String> component1() {
        return this.placements;
    }

    public final C4155ng component2() {
        return this.adSize;
    }

    public final Long component3() {
        return this.adStartTime;
    }

    public final String component4() {
        return this.advAppId;
    }

    public final String component5() {
        return this.placementReferenceId;
    }

    public final String component6() {
        return this.user;
    }

    public final C2439Gg copy(List<String> list, C4155ng c4155ng, Long l, String str, String str2, String str3) {
        return new C2439Gg(list, c4155ng, l, str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2439Gg)) {
            return false;
        }
        C2439Gg c2439Gg = (C2439Gg) obj;
        return AbstractC2995aW.i(this.placements, c2439Gg.placements) && AbstractC2995aW.i(this.adSize, c2439Gg.adSize) && AbstractC2995aW.i(this.adStartTime, c2439Gg.adStartTime) && AbstractC2995aW.i(this.advAppId, c2439Gg.advAppId) && AbstractC2995aW.i(this.placementReferenceId, c2439Gg.placementReferenceId) && AbstractC2995aW.i(this.user, c2439Gg.user);
    }

    public final C4155ng getAdSize() {
        return this.adSize;
    }

    public final Long getAdStartTime() {
        return this.adStartTime;
    }

    public final String getAdvAppId() {
        return this.advAppId;
    }

    public final String getPlacementReferenceId() {
        return this.placementReferenceId;
    }

    public final List<String> getPlacements() {
        return this.placements;
    }

    public final String getUser() {
        return this.user;
    }

    public int hashCode() {
        List<String> list = this.placements;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C4155ng c4155ng = this.adSize;
        int iHashCode2 = (iHashCode + (c4155ng == null ? 0 : c4155ng.hashCode())) * 31;
        Long l = this.adStartTime;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.advAppId;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.placementReferenceId;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.user;
        return iHashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setAdSize(C4155ng c4155ng) {
        this.adSize = c4155ng;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("RequestParam(placements=");
        sb.append(this.placements);
        sb.append(", adSize=");
        sb.append(this.adSize);
        sb.append(", adStartTime=");
        sb.append(this.adStartTime);
        sb.append(", advAppId=");
        sb.append(this.advAppId);
        sb.append(", placementReferenceId=");
        sb.append(this.placementReferenceId);
        sb.append(", user=");
        return DM.l(sb, this.user, ')');
    }

    public /* synthetic */ C2439Gg(List list, C4155ng c4155ng, Long l, String str, String str2, String str3, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : c4155ng, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
    }

    public /* synthetic */ C2439Gg(int i, List list, C4155ng c4155ng, Long l, String str, String str2, String str3, O40 o40) {
        if ((i & 1) == 0) {
            this.placements = null;
        } else {
            this.placements = list;
        }
        if ((i & 2) == 0) {
            this.adSize = null;
        } else {
            this.adSize = c4155ng;
        }
        if ((i & 4) == 0) {
            this.adStartTime = null;
        } else {
            this.adStartTime = l;
        }
        if ((i & 8) == 0) {
            this.advAppId = null;
        } else {
            this.advAppId = str;
        }
        if ((i & 16) == 0) {
            this.placementReferenceId = null;
        } else {
            this.placementReferenceId = str2;
        }
        if ((i & 32) == 0) {
            this.user = null;
        } else {
            this.user = str3;
        }
    }

    public C2439Gg(List<String> list, C4155ng c4155ng, Long l, String str, String str2, String str3) {
        this.placements = list;
        this.adSize = c4155ng;
        this.adStartTime = l;
        this.advAppId = str;
        this.placementReferenceId = str2;
        this.user = str3;
    }

    public static /* synthetic */ void getAdSize$annotations() {
    }

    public static /* synthetic */ void getAdStartTime$annotations() {
    }

    public static /* synthetic */ void getAdvAppId$annotations() {
    }

    public static /* synthetic */ void getPlacementReferenceId$annotations() {
    }
}
