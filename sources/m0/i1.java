package m0;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i1 extends h1 {
    public i1(r1 r1Var, WindowInsets windowInsets) {
        super(r1Var, windowInsets);
    }

    @Override // m0.o1
    public r1 a() {
        return r1.g(null, this.f45700c.consumeDisplayCutout());
    }

    @Override // m0.o1
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1)) {
            return false;
        }
        i1 i1Var = (i1) obj;
        return Objects.equals(this.f45700c, i1Var.f45700c) && Objects.equals(null, null) && g1.A(this.f45702e, i1Var.f45702e);
    }

    @Override // m0.o1
    public j g() {
        DisplayCutout displayCutout = this.f45700c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new j(displayCutout);
    }

    @Override // m0.o1
    public int hashCode() {
        return this.f45700c.hashCode();
    }
}
