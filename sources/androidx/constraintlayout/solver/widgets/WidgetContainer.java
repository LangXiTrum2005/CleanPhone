package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.Cache;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class WidgetContainer extends ConstraintWidget {
    public ArrayList e0;

    public void C() {
        ArrayList arrayList = this.e0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.e0.get(i2);
            if (constraintWidget instanceof WidgetContainer) {
                ((WidgetContainer) constraintWidget).C();
            }
        }
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public void t() {
        this.e0.clear();
        super.t();
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    public final void v(Cache cache) {
        super.v(cache);
        int size = this.e0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((ConstraintWidget) this.e0.get(i2)).v(cache);
        }
    }
}
