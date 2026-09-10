package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4126nJ {
    private String adSource;
    private String creativeId;
    private String eventId;
    private String placementRefId;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AbstractC2995aW.i(C4126nJ.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        AbstractC2995aW.o(obj, "null cannot be cast to non-null type com.vungle.ads.internal.util.LogEntry");
        C4126nJ c4126nJ = (C4126nJ) obj;
        return AbstractC2995aW.i(this.placementRefId, c4126nJ.placementRefId) && AbstractC2995aW.i(this.creativeId, c4126nJ.creativeId) && AbstractC2995aW.i(this.eventId, c4126nJ.eventId) && AbstractC2995aW.i(this.adSource, c4126nJ.adSource);
    }

    public final String getAdSource$vungle_ads_release() {
        return this.adSource;
    }

    public final String getCreativeId$vungle_ads_release() {
        return this.creativeId;
    }

    public final String getEventId$vungle_ads_release() {
        return this.eventId;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    public int hashCode() {
        String str = this.placementRefId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.creativeId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.eventId;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.adSource;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setAdSource$vungle_ads_release(String str) {
        this.adSource = str;
    }

    public final void setCreativeId$vungle_ads_release(String str) {
        this.creativeId = str;
    }

    public final void setEventId$vungle_ads_release(String str) {
        this.eventId = str;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        this.placementRefId = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LogEntry(placementRefId=");
        sb.append(this.placementRefId);
        sb.append(", creativeId=");
        sb.append(this.creativeId);
        sb.append(", eventId=");
        sb.append(this.eventId);
        sb.append(", adSource=");
        return DM.l(sb, this.adSource, ')');
    }
}
