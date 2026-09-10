package t6;

import androidx.lifecycle.o;
import java.util.HashMap;
import m0.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f50540a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f50541b;

    public g(s1 s1Var, o oVar) {
        this.f50541b = s1Var;
        this.f50540a = oVar;
    }

    @Override // t6.f
    public final void onDestroy() {
        ((HashMap) this.f50541b.f45751b).remove(this.f50540a);
    }

    @Override // t6.f
    public final void f() {
    }

    @Override // t6.f
    public final void onStart() {
    }
}
