package j$.time.format;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class r implements InterfaceC3555f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j$.time.temporal.r f43117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final H f43118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C f43119c;
    private volatile j d;

    r(j$.time.temporal.r rVar, H h2, C c2) {
        this.f43117a = rVar;
        this.f43118b = h2;
        this.f43119c = c2;
    }

    @Override // j$.time.format.InterfaceC3555f
    public final boolean p(z zVar, StringBuilder sb) {
        String strF;
        Long lE = zVar.e(this.f43117a);
        if (lE == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) zVar.d().a(j$.time.temporal.s.a());
        if (mVar == null || mVar == j$.time.chrono.t.d) {
            strF = this.f43119c.f(this.f43117a, lE.longValue(), this.f43118b, zVar.c());
        } else {
            strF = this.f43119c.e(mVar, this.f43117a, lE.longValue(), this.f43118b, zVar.c());
        }
        if (strF != null) {
            sb.append(strF);
            return true;
        }
        if (this.d == null) {
            this.d = new j(this.f43117a, 1, 19, G.NORMAL);
        }
        return this.d.p(zVar, sb);
    }

    @Override // j$.time.format.InterfaceC3555f
    public final int r(w wVar, CharSequence charSequence, int i2) {
        Iterator itH;
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            throw new IndexOutOfBoundsException();
        }
        H h2 = wVar.l() ? this.f43118b : null;
        j$.time.chrono.m mVarH = wVar.h();
        C c2 = this.f43119c;
        j$.time.temporal.r rVar = this.f43117a;
        if (mVarH == null || mVarH == j$.time.chrono.t.d) {
            itH = c2.h(rVar, h2, wVar.i());
        } else {
            itH = c2.g(mVarH, rVar, h2, wVar.i());
        }
        Iterator it = itH;
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (wVar.s(str, 0, charSequence, i2, str.length())) {
                    return wVar.o(this.f43117a, ((Long) entry.getValue()).longValue(), i2, str.length() + i2);
                }
            }
            if (rVar == j$.time.temporal.a.ERA && !wVar.l()) {
                for (j$.time.chrono.n nVar : mVarH.D()) {
                    String string = nVar.toString();
                    if (wVar.s(string, 0, charSequence, i2, string.length())) {
                        return wVar.o(this.f43117a, nVar.p(), i2, string.length() + i2);
                    }
                }
            }
            if (wVar.l()) {
                return ~i2;
            }
        }
        if (this.d == null) {
            this.d = new j(this.f43117a, 1, 19, G.NORMAL);
        }
        return this.d.r(wVar, charSequence, i2);
    }

    public final String toString() {
        H h2 = H.FULL;
        j$.time.temporal.r rVar = this.f43117a;
        H h3 = this.f43118b;
        if (h3 == h2) {
            return "Text(" + rVar + ")";
        }
        return "Text(" + rVar + "," + h3 + ")";
    }
}
