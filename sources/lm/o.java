package lm;

import java.util.List;
import tl.g0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o extends kotlin.jvm.internal.o implements jk.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f45570e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f45571f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ g0 f45572g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(r rVar, boolean z10, g0 g0Var) {
        super(0);
        this.f45570e = rVar;
        this.f45571f = z10;
        this.f45572g = g0Var;
    }

    @Override // jk.a
    public final Object invoke() {
        List listN0;
        r rVar = this.f45570e;
        com.google.android.gms.internal.consent_sdk.d dVar = rVar.f45583a;
        i iVar = (i) dVar.f22981a;
        u uVarA = rVar.a((zk.j) dVar.f22983c);
        if (uVarA != null) {
            boolean z10 = this.f45571f;
            g0 g0Var = this.f45572g;
            listN0 = z10 ? xj.n.N0(iVar.f45541e.t(uVarA, g0Var)) : xj.n.N0(iVar.f45541e.w0(uVarA, g0Var));
        } else {
            listN0 = null;
        }
        return listN0 == null ? xj.v.f53866a : listN0;
    }
}
