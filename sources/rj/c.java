package rj;

import i1.p;
import java.util.ArrayList;
import java.util.Objects;
import m5.k;
import p1.b0;
import qj.h;
import qj.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends h {
    @Override // qj.h
    public final void l() {
        b0 b0Var = (b0) this.f49059b;
        b0Var.l1();
        p pVar = b0Var.R;
        Objects.requireNonNull(pVar);
        int iA = q4.a.a(pVar.f42655z);
        int i10 = pVar.f42650u;
        int i11 = pVar.f42651v;
        if (iA == 2 || iA == 4) {
            iA = q4.a.a(0);
            i10 = i11;
            i11 = i10;
        }
        long jS0 = b0Var.S0();
        int iE = q4.a.e(iA);
        k kVar = (k) this.f49060c.f49096b;
        ((ArrayList) kVar.f45903c).add(new j(jS0, i10, i11, iE));
        kVar.D();
    }
}
