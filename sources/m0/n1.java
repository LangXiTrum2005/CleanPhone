package m0;

import android.graphics.Rect;
import android.view.WindowInsets;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends m1 {
    public n1(r1 r1Var, WindowInsets windowInsets) {
        super(r1Var, windowInsets);
    }

    @Override // m0.g1, m0.o1
    public List<Rect> e(int i10) {
        return this.f45700c.getBoundingRects(q1.a(i10));
    }

    @Override // m0.g1, m0.o1
    public List<Rect> f(int i10) {
        return this.f45700c.getBoundingRectsIgnoringVisibility(q1.a(i10));
    }

    @Override // m0.g1, m0.o1
    public void l() {
    }
}
