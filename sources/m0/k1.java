package m0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class k1 extends j1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final r1 f45726i = r1.g(null, WindowInsets.CONSUMED);

    public k1(r1 r1Var, WindowInsets windowInsets) {
        super(r1Var, windowInsets);
    }

    @Override // m0.g1, m0.o1
    public f0.b h(int i10) {
        return f0.b.c(this.f45700c.getInsets(p1.a(i10)));
    }

    @Override // m0.o1
    public boolean p(int i10) {
        return this.f45700c.isVisible(p1.a(i10));
    }

    @Override // m0.g1
    public f0.b z(int i10) {
        return f0.b.c(this.f45700c.getInsetsIgnoringVisibility(p1.a(i10)));
    }

    @Override // m0.o1
    public final void d(View view) {
    }
}
