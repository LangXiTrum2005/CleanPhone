package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3925l2 {
    public static final C3837k2 Companion = new C3837k2(null);
    private final C3311e2 adMarkup;
    private final String placementReferenceId;

    public C3925l2() {
        this((String) null, (C3311e2) (0 == true ? 1 : 0), 3, (AbstractC2471Hm) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ C3925l2 copy$default(C3925l2 c3925l2, String str, C3311e2 c3311e2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c3925l2.placementReferenceId;
        }
        if ((i & 2) != 0) {
            c3311e2 = c3925l2.adMarkup;
        }
        return c3925l2.copy(str, c3311e2);
    }

    public static final void write$Self(C3925l2 c3925l2, InterfaceC4596sh interfaceC4596sh, D40 d40) {
        AbstractC2995aW.q(c3925l2, "self");
        if (AbstractC5044xl.v(interfaceC4596sh, "output", d40, "serialDesc", d40) || c3925l2.placementReferenceId != null) {
            interfaceC4596sh.r(d40, 0, W90.f3912a, c3925l2.placementReferenceId);
        }
        if (!interfaceC4596sh.j(d40) && c3925l2.adMarkup == null) {
            return;
        }
        interfaceC4596sh.r(d40, 1, C3134c2.INSTANCE, c3925l2.adMarkup);
    }

    public final String component1() {
        return this.placementReferenceId;
    }

    public final C3311e2 component2() {
        return this.adMarkup;
    }

    public final C3925l2 copy(String str, C3311e2 c3311e2) {
        return new C3925l2(str, c3311e2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3925l2)) {
            return false;
        }
        C3925l2 c3925l2 = (C3925l2) obj;
        return AbstractC2995aW.i(this.placementReferenceId, c3925l2.placementReferenceId) && AbstractC2995aW.i(this.adMarkup, c3925l2.adMarkup);
    }

    public final C3311e2 getAdMarkup() {
        return this.adMarkup;
    }

    public final String getPlacementReferenceId() {
        return this.placementReferenceId;
    }

    public int hashCode() {
        String str = this.placementReferenceId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3311e2 c3311e2 = this.adMarkup;
        return iHashCode + (c3311e2 != null ? c3311e2.hashCode() : 0);
    }

    public String toString() {
        return "PlacementAdUnit(placementReferenceId=" + this.placementReferenceId + ", adMarkup=" + this.adMarkup + ')';
    }

    public /* synthetic */ C3925l2(String str, C3311e2 c3311e2, int i, AbstractC2471Hm abstractC2471Hm) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : c3311e2);
    }

    public /* synthetic */ C3925l2(int i, String str, C3311e2 c3311e2, O40 o40) {
        if ((i & 1) == 0) {
            this.placementReferenceId = null;
        } else {
            this.placementReferenceId = str;
        }
        if ((i & 2) == 0) {
            this.adMarkup = null;
        } else {
            this.adMarkup = c3311e2;
        }
    }

    public C3925l2(String str, C3311e2 c3311e2) {
        this.placementReferenceId = str;
        this.adMarkup = c3311e2;
    }

    public static /* synthetic */ void getAdMarkup$annotations() {
    }

    public static /* synthetic */ void getPlacementReferenceId$annotations() {
    }
}
