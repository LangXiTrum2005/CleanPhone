package ud;

import com.applovin.impl.ca;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f52169c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f52170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k f52171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f52172f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f52173g;

    public v0(String sessionId, String firstSessionId, int i10, long j10, k kVar, String str, String firebaseAuthenticationToken) {
        kotlin.jvm.internal.n.f(sessionId, "sessionId");
        kotlin.jvm.internal.n.f(firstSessionId, "firstSessionId");
        kotlin.jvm.internal.n.f(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f52167a = sessionId;
        this.f52168b = firstSessionId;
        this.f52169c = i10;
        this.f52170d = j10;
        this.f52171e = kVar;
        this.f52172f = str;
        this.f52173g = firebaseAuthenticationToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return kotlin.jvm.internal.n.a(this.f52167a, v0Var.f52167a) && kotlin.jvm.internal.n.a(this.f52168b, v0Var.f52168b) && this.f52169c == v0Var.f52169c && this.f52170d == v0Var.f52170d && kotlin.jvm.internal.n.a(this.f52171e, v0Var.f52171e) && kotlin.jvm.internal.n.a(this.f52172f, v0Var.f52172f) && kotlin.jvm.internal.n.a(this.f52173g, v0Var.f52173g);
    }

    public final int hashCode() {
        return this.f52173g.hashCode() + d5.u.e((this.f52171e.hashCode() + ca.j(this.f52170d, wi.d.f(this.f52169c, d5.u.e(this.f52167a.hashCode() * 31, 31, this.f52168b), 31), 31)) * 31, 31, this.f52172f);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SessionInfo(sessionId=");
        sb2.append(this.f52167a);
        sb2.append(", firstSessionId=");
        sb2.append(this.f52168b);
        sb2.append(", sessionIndex=");
        sb2.append(this.f52169c);
        sb2.append(", eventTimestampUs=");
        sb2.append(this.f52170d);
        sb2.append(", dataCollectionStatus=");
        sb2.append(this.f52171e);
        sb2.append(", firebaseInstallationId=");
        sb2.append(this.f52172f);
        sb2.append(", firebaseAuthenticationToken=");
        return wi.d.k(sb2, this.f52173g, ')');
    }
}
