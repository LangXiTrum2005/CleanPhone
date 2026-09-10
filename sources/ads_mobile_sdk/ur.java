package ads_mobile_sdk;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.bonny;
import saneness.licking;
import saneness.moveable;

/* JADX INFO: loaded from: classes.dex */
public final class ur {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final JsonObject e;
    public final JsonObject f;
    public final em g;
    public final String h;
    public final JsonObject i;
    public final boolean j;
    public final long k;
    public final int l;
    public final List m;
    public final long n;
    public final long o;
    public final int p;
    public final JsonObject q;
    public final String r;

    public ur(String adapterResponseReplacementKey, String adRequestPostBody, String adRequestUrl, String adResponseBody, JsonObject adResponseHeaders, JsonObject biddingData, em emVar, String gwsQueryId, JsonObject inspectorExtras, boolean z, long j, int i, ArrayList noFillUrls, long j2, long j3, int i2, JsonObject responseInfoExtras, String scionQueryEventId) {
        Intrinsics.checkNotNullParameter(adapterResponseReplacementKey, "adapterResponseReplacementKey");
        Intrinsics.checkNotNullParameter(adRequestPostBody, "adRequestPostBody");
        Intrinsics.checkNotNullParameter(adRequestUrl, "adRequestUrl");
        Intrinsics.checkNotNullParameter(adResponseBody, "adResponseBody");
        Intrinsics.checkNotNullParameter(adResponseHeaders, "adResponseHeaders");
        Intrinsics.checkNotNullParameter(biddingData, "biddingData");
        Intrinsics.checkNotNullParameter(gwsQueryId, "gwsQueryId");
        Intrinsics.checkNotNullParameter(inspectorExtras, "inspectorExtras");
        Intrinsics.checkNotNullParameter(noFillUrls, "noFillUrls");
        Intrinsics.checkNotNullParameter(responseInfoExtras, "responseInfoExtras");
        Intrinsics.checkNotNullParameter(scionQueryEventId, "scionQueryEventId");
        this.a = adapterResponseReplacementKey;
        this.b = adRequestPostBody;
        this.c = adRequestUrl;
        this.d = adResponseBody;
        this.e = adResponseHeaders;
        this.f = biddingData;
        this.g = emVar;
        this.h = gwsQueryId;
        this.i = inspectorExtras;
        this.j = z;
        this.k = j;
        this.l = i;
        this.m = noFillUrls;
        this.n = j2;
        this.o = j3;
        this.p = i2;
        this.q = responseInfoExtras;
        this.r = scionQueryEventId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ur)) {
            return false;
        }
        ur urVar = (ur) obj;
        return Intrinsics.wireman(this.a, urVar.a) && Intrinsics.wireman(this.b, urVar.b) && Intrinsics.wireman(this.c, urVar.c) && Intrinsics.wireman(this.d, urVar.d) && Intrinsics.wireman(this.e, urVar.e) && Intrinsics.wireman(this.f, urVar.f) && Intrinsics.wireman(this.g, urVar.g) && Intrinsics.wireman(this.h, urVar.h) && Intrinsics.wireman(this.i, urVar.i) && this.j == urVar.j && this.k == urVar.k && this.l == urVar.l && Intrinsics.wireman(this.m, urVar.m) && p002kotlin.time.saneness.kowloon(this.n, urVar.n) && p002kotlin.time.saneness.kowloon(this.o, urVar.o) && this.p == urVar.p && Intrinsics.wireman(this.q, urVar.q) && Intrinsics.wireman(this.r, urVar.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [int] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r2v15, types: [int] */
    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + licking.attabal(this.d, licking.attabal(this.c, licking.attabal(this.b, this.a.hashCode() * 31, 31), 31), 31)) * 31)) * 31;
        em emVar = this.g;
        int iHashCode2 = (this.i.hashCode() + licking.attabal(this.h, (iHashCode + (emVar == null ? 0 : emVar.hashCode())) * 31, 31)) * 31;
        boolean z = this.j;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.r.hashCode() + ((this.q.hashCode() + bonny.attabal(this.p, (p002kotlin.time.saneness.trm(this.o) + ((p002kotlin.time.saneness.trm(this.n) + moveable.attabal(this.m, bonny.attabal(this.l, (Long.hashCode(this.k) + ((iHashCode2 + r0) * 31)) * 31, 31), 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "CommonConfiguration(adapterResponseReplacementKey=" + this.a + ", adRequestPostBody=" + this.b + ", adRequestUrl=" + this.c + ", adResponseBody=" + this.d + ", adResponseHeaders=" + this.e + ", biddingData=" + this.f + ", bowResponseError=" + this.g + ", gwsQueryId=" + this.h + ", inspectorExtras=" + this.i + ", isIdless=" + this.j + ", latency=" + this.k + ", maxParallelRenderers=" + this.l + ", noFillUrls=" + this.m + ", refreshInterval=" + p002kotlin.time.saneness.starveling(this.n) + ", proactiveRefreshLoadDelayInterval=" + p002kotlin.time.saneness.starveling(this.o) + ", responseCode=" + this.p + ", responseInfoExtras=" + this.q + ", scionQueryEventId=" + this.r + ")";
    }
}
