package m0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class m1 extends l1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final r1 f45728j = r1.g(null, WindowInsets.CONSUMED);

    public m1(r1 r1Var, WindowInsets windowInsets) {
        super(r1Var, windowInsets);
    }

    @Override // m0.k1, m0.g1, m0.o1
    public f0.b h(int i10) {
        return f0.b.c(this.f45700c.getInsets(q1.a(i10)));
    }

    @Override // m0.k1, m0.o1
    public boolean p(int i10) {
        return this.f45700c.isVisible(q1.a(i10));
    }

    @Override // m0.k1, m0.g1
    public f0.b z(int i10) {
        return f0.b.c(this.f45700c.getInsetsIgnoringVisibility(q1.a(i10)));
    }

    @Override // m0.g1, m0.o1
    public void k(View view) {
    }
}
