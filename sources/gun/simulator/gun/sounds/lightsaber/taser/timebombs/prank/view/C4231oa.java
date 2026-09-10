package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4231oa {
    private final String bidToken;
    private final String errorMessage;

    public C4231oa(String str, String str2) {
        AbstractC2995aW.q(str, "bidToken");
        AbstractC2995aW.q(str2, "errorMessage");
        this.bidToken = str;
        this.errorMessage = str2;
    }

    public static /* synthetic */ C4231oa copy$default(C4231oa c4231oa, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4231oa.bidToken;
        }
        if ((i & 2) != 0) {
            str2 = c4231oa.errorMessage;
        }
        return c4231oa.copy(str, str2);
    }

    public final String component1() {
        return this.bidToken;
    }

    public final String component2() {
        return this.errorMessage;
    }

    public final C4231oa copy(String str, String str2) {
        AbstractC2995aW.q(str, "bidToken");
        AbstractC2995aW.q(str2, "errorMessage");
        return new C4231oa(str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4231oa)) {
            return false;
        }
        C4231oa c4231oa = (C4231oa) obj;
        return AbstractC2995aW.i(this.bidToken, c4231oa.bidToken) && AbstractC2995aW.i(this.errorMessage, c4231oa.errorMessage);
    }

    public final String getBidToken() {
        return this.bidToken;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public int hashCode() {
        return this.errorMessage.hashCode() + (this.bidToken.hashCode() * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BiddingTokenInfo(bidToken=");
        sb.append(this.bidToken);
        sb.append(", errorMessage=");
        return DM.l(sb, this.errorMessage, ')');
    }
}
