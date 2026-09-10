package b2;

import com.google.android.gms.internal.play_billing.q1;
import com.mbridge.msdk.foundation.download.Command;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Map;
import oa.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa.l0 f5392a;

    static {
        new r(new n5.f(2));
    }

    public r(n5.f fVar) {
        oa.l0 l0Var;
        oa.u uVar = (oa.u) ((oa.k0) fVar.f46523b).f47269b;
        if (uVar == null) {
            l0Var = oa.a0.f47218f;
        } else {
            Collection collectionEntrySet = uVar.entrySet();
            if (((AbstractCollection) collectionEntrySet).isEmpty()) {
                l0Var = oa.a0.f47218f;
            } else {
                oa.s<Map.Entry> sVar = (oa.s) collectionEntrySet;
                p pVar = new p(sVar.f47306b.size());
                int i10 = 0;
                for (Map.Entry entry : sVar) {
                    Object key = entry.getKey();
                    n1 n1VarG = ((oa.e0) entry.getValue()).g();
                    pVar.l(key, n1VarG);
                    i10 += n1VarG.f47283d;
                }
                l0Var = new oa.l0(pVar.c(true), i10);
            }
        }
        this.f5392a = l0Var;
    }

    public static String a(String str) {
        if (q1.m(str, "Accept")) {
            return "Accept";
        }
        if (q1.m(str, "Allow")) {
            return "Allow";
        }
        if (q1.m(str, "Authorization")) {
            return "Authorization";
        }
        if (q1.m(str, "Bandwidth")) {
            return "Bandwidth";
        }
        if (q1.m(str, "Blocksize")) {
            return "Blocksize";
        }
        if (q1.m(str, "Cache-Control")) {
            return "Cache-Control";
        }
        if (q1.m(str, "Connection")) {
            return "Connection";
        }
        if (q1.m(str, "Content-Base")) {
            return "Content-Base";
        }
        if (q1.m(str, "Content-Encoding")) {
            return "Content-Encoding";
        }
        if (q1.m(str, "Content-Language")) {
            return "Content-Language";
        }
        if (q1.m(str, "Content-Length")) {
            return "Content-Length";
        }
        if (q1.m(str, "Content-Location")) {
            return "Content-Location";
        }
        if (q1.m(str, "Content-Type")) {
            return "Content-Type";
        }
        if (q1.m(str, "CSeq")) {
            return "CSeq";
        }
        if (q1.m(str, "Date")) {
            return "Date";
        }
        if (q1.m(str, "Expires")) {
            return "Expires";
        }
        if (q1.m(str, "Location")) {
            return "Location";
        }
        if (q1.m(str, "Proxy-Authenticate")) {
            return "Proxy-Authenticate";
        }
        if (q1.m(str, "Proxy-Require")) {
            return "Proxy-Require";
        }
        if (q1.m(str, "Public")) {
            return "Public";
        }
        if (q1.m(str, Command.HTTP_HEADER_RANGE)) {
            return Command.HTTP_HEADER_RANGE;
        }
        if (q1.m(str, "RTP-Info")) {
            return "RTP-Info";
        }
        if (q1.m(str, "RTCP-Interval")) {
            return "RTCP-Interval";
        }
        if (q1.m(str, "Scale")) {
            return "Scale";
        }
        if (q1.m(str, "Session")) {
            return "Session";
        }
        if (q1.m(str, "Speed")) {
            return "Speed";
        }
        if (q1.m(str, "Supported")) {
            return "Supported";
        }
        if (q1.m(str, "Timestamp")) {
            return "Timestamp";
        }
        if (q1.m(str, "Transport")) {
            return "Transport";
        }
        if (q1.m(str, Command.HTTP_HEADER_USER_AGENT)) {
            return Command.HTTP_HEADER_USER_AGENT;
        }
        if (q1.m(str, "Via")) {
            return "Via";
        }
        return q1.m(str, "WWW-Authenticate") ? "WWW-Authenticate" : str;
    }

    public final String b(String str) {
        oa.j0 j0VarK = this.f5392a.k(a(str));
        if (j0VarK.isEmpty()) {
            return null;
        }
        return (String) oa.q.k(j0VarK);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            return this.f5392a.equals(((r) obj).f5392a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5392a.hashCode();
    }
}
