package k6;

import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements s, s6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f44391a;

    public /* synthetic */ y(Resources resources) {
        this.f44391a = resources;
    }

    @Override // k6.s
    public r M(x xVar) {
        return new b(this.f44391a, b0.f44334b);
    }

    @Override // s6.a
    public g6.a0 a(g6.a0 a0Var, e6.i iVar) {
        if (a0Var == null) {
            return null;
        }
        return new n6.d(this.f44391a, a0Var);
    }
}
