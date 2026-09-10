package oa;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class s0 extends b0 {
    @Override // oa.b0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public s0 a(Object obj) {
        obj.getClass();
        b(obj);
        return this;
    }

    public u0 h() {
        int i10 = this.f47227b;
        if (i10 == 0) {
            int i11 = u0.f47325c;
            return u1.f47328j;
        }
        if (i10 != 1) {
            u0 u0VarU = u0.u(i10, this.f47226a);
            this.f47227b = u0VarU.size();
            this.f47228c = true;
            return u0VarU;
        }
        Object obj = this.f47226a[0];
        Objects.requireNonNull(obj);
        int i12 = u0.f47325c;
        return new b2(obj);
    }
}
