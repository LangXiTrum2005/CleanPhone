package sj;

import i1.p;
import i1.z0;
import java.util.ArrayList;
import java.util.Objects;
import p1.b0;
import p1.k;
import qj.h;
import qj.j;
import qj.x;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f50254d;

    public a(k kVar, x xVar, boolean z10) {
        super(kVar, xVar);
        this.f50254d = z10;
    }

    @Override // qj.h
    public final void l() {
        b0 b0Var = (b0) this.f49059b;
        b0Var.l1();
        z0 z0Var = b0Var.f47938f0;
        int i10 = z0Var.f42723a;
        int i11 = z0Var.f42724b;
        int iA = 1;
        if (i10 != 0 && i11 != 0 && !this.f50254d) {
            b0Var.l1();
            p pVar = b0Var.R;
            Objects.requireNonNull(pVar);
            try {
                iA = q4.a.a(pVar.f42655z);
            } catch (IllegalArgumentException unused) {
            }
        }
        long jS0 = b0Var.S0();
        int iE = q4.a.e(iA);
        m5.k kVar = (m5.k) this.f49060c.f49096b;
        ((ArrayList) kVar.f45903c).add(new j(jS0, i10, i11, iE));
        kVar.D();
    }
}
