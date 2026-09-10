package ads_mobile_sdk;

import p002kotlin.jvm.internal.Intrinsics;
import saneness.licking;

/* JADX INFO: loaded from: classes.dex */
public final class tt1 {
    public final long a;
    public final String b;
    public final String c;

    public tt1(long j, String gwsQueryId, String url) {
        st1 eventState = st1.READY_TO_PING;
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(eventState, "eventState");
        this.a = j;
        this.b = gwsQueryId;
        this.c = url;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tt1)) {
            return false;
        }
        tt1 tt1Var = (tt1) obj;
        if (this.a != tt1Var.a || !Intrinsics.wireman(this.b, tt1Var.b) || !Intrinsics.wireman(this.c, tt1Var.c)) {
            return false;
        }
        st1 st1Var = st1.READY_TO_PING;
        return true;
    }

    public final int hashCode() {
        return st1.READY_TO_PING.hashCode() + licking.attabal(this.c, licking.attabal(this.b, Long.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "OfflineBufferedPingRecord(timestamp=" + this.a + ", gwsQueryId=" + this.b + ", url=" + this.c + ", eventState=" + st1.READY_TO_PING + ")";
    }
}
