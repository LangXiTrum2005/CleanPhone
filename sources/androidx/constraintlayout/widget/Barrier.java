package androidx.constraintlayout.widget;

import android.content.Context;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Barrier extends ConstraintHelper {
    public int l0;
    public int m0;
    public final androidx.constraintlayout.solver.widgets.Barrier n0;

    public Barrier(Context context) {
        super(context);
        this.e0 = new int[32];
        this.j0 = null;
        this.k0 = new HashMap();
        this.g0 = context;
        androidx.constraintlayout.solver.widgets.Barrier barrier = new androidx.constraintlayout.solver.widgets.Barrier();
        barrier.g0 = 0;
        barrier.h0 = true;
        barrier.i0 = 0;
        this.n0 = barrier;
        this.h0 = barrier;
        j();
        super.setVisibility(8);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintWidget constraintWidget, boolean z2) {
        int i2 = this.l0;
        this.m0 = i2;
        if (z2) {
            if (i2 == 5) {
                this.m0 = 1;
            } else if (i2 == 6) {
                this.m0 = 0;
            }
        } else if (i2 == 5) {
            this.m0 = 0;
        } else if (i2 == 6) {
            this.m0 = 1;
        }
        if (constraintWidget instanceof androidx.constraintlayout.solver.widgets.Barrier) {
            ((androidx.constraintlayout.solver.widgets.Barrier) constraintWidget).g0 = this.m0;
        }
    }

    public int getMargin() {
        return this.n0.i0;
    }

    public int getType() {
        return this.l0;
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.n0.h0 = z2;
    }

    public void setDpMargin(int i2) {
        this.n0.i0 = (int) ((i2 * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i2) {
        this.n0.i0 = i2;
    }

    public void setType(int i2) {
        this.l0 = i2;
    }
}
