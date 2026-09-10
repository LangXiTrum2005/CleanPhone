package androidx.fragment.app;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f4315b;

    public e1(g1 g1Var, int i10) {
        this.f4315b = g1Var;
        this.f4314a = i10;
    }

    @Override // androidx.fragment.app.d1
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        g1 g1Var = this.f4315b;
        Fragment fragment = g1Var.f4346z;
        int i10 = this.f4314a;
        if (fragment == null || i10 >= 0 || !fragment.getChildFragmentManager().R(-1, 0)) {
            return g1Var.S(arrayList, arrayList2, i10, 1);
        }
        return false;
    }
}
