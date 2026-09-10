package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class F2 implements Serializable {
    private final C3967la adMarkup;
    private final C4664tU placement;
    private final C3105bi0 requestAdSize;

    public F2(C4664tU c4664tU, C3967la c3967la, C3105bi0 c3105bi0) {
        AbstractC2995aW.q(c4664tU, "placement");
        this.placement = c4664tU;
        this.adMarkup = c3967la;
        this.requestAdSize = c3105bi0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC2995aW.i(F2.class, obj.getClass())) {
            return false;
        }
        F2 f2 = (F2) obj;
        if (!AbstractC2995aW.i(this.placement.getReferenceId(), f2.placement.getReferenceId()) || !AbstractC2995aW.i(this.requestAdSize, f2.requestAdSize)) {
            return false;
        }
        C3967la c3967la = this.adMarkup;
        C3967la c3967la2 = f2.adMarkup;
        if (c3967la != null) {
            return AbstractC2995aW.i(c3967la, c3967la2);
        }
        return c3967la2 == null;
    }

    public final C3967la getAdMarkup() {
        return this.adMarkup;
    }

    public final C4664tU getPlacement() {
        return this.placement;
    }

    public final C3105bi0 getRequestAdSize() {
        return this.requestAdSize;
    }

    public int hashCode() {
        int iHashCode = this.placement.getReferenceId().hashCode() * 31;
        C3105bi0 c3105bi0 = this.requestAdSize;
        int iHashCode2 = (iHashCode + (c3105bi0 != null ? c3105bi0.hashCode() : 0)) * 31;
        C3967la c3967la = this.adMarkup;
        return iHashCode2 + (c3967la != null ? c3967la.hashCode() : 0);
    }

    public String toString() {
        return "AdRequest{placementId='" + this.placement.getReferenceId() + "', adMarkup=" + this.adMarkup + ", requestAdSize=" + this.requestAdSize + '}';
    }
}
