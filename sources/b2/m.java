package b2;

import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i1.p f5327c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final oa.o0 f5328d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f5329e;

    public m(i1.p pVar, int i10, int i11, s1 s1Var, String str) {
        this.f5325a = i10;
        this.f5326b = i11;
        this.f5327c = pVar;
        this.f5328d = oa.o0.e(s1Var);
        this.f5329e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (this.f5325a == mVar.f5325a && this.f5326b == mVar.f5326b && this.f5327c.equals(mVar.f5327c)) {
                oa.o0 o0Var = mVar.f5328d;
                oa.o0 o0Var2 = this.f5328d;
                o0Var2.getClass();
                if (oa.q.g(o0Var, o0Var2) && this.f5329e.equals(mVar.f5329e)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5329e.hashCode() + ((this.f5328d.hashCode() + ((this.f5327c.hashCode() + ((((217 + this.f5325a) * 31) + this.f5326b) * 31)) * 31)) * 31);
    }
}
