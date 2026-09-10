package o4;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x.e f47161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f47162b;

    public t(u uVar, x.e eVar) {
        this.f47162b = uVar;
        this.f47161a = eVar;
    }

    @Override // o4.q
    public final void c(r rVar) {
        ((ArrayList) this.f47161a.get(this.f47162b.f47164b)).remove(rVar);
        rVar.v(this);
    }
}
