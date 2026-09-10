package f2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements l1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f40339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f40340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2.g f40341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f40342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f40343e;

    public /* synthetic */ g0(i0 i0Var, u uVar, c2.g gVar, IOException iOException, boolean z10) {
        this.f40339a = i0Var;
        this.f40340b = uVar;
        this.f40341c = gVar;
        this.f40342d = iOException;
        this.f40343e = z10;
    }

    @Override // l1.g
    public final void accept(Object obj) {
        j0 j0Var = (j0) obj;
        i0 i0Var = this.f40339a;
        j0Var.A(i0Var.f40369a, i0Var.f40370b, this.f40340b, this.f40341c, this.f40342d, this.f40343e);
    }
}
