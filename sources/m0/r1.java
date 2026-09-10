package m0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f45739b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f45740a;

    static {
        if (Build.VERSION.SDK_INT >= 34) {
            f45739b = m1.f45728j;
        } else {
            f45739b = k1.f45726i;
        }
    }

    public r1(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f45740a = new n1(this, windowInsets);
            return;
        }
        if (i10 >= 34) {
            this.f45740a = new m1(this, windowInsets);
        } else if (i10 >= 31) {
            this.f45740a = new l1(this, windowInsets);
        } else {
            this.f45740a = new k1(this, windowInsets);
        }
    }

    public static r1 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        r1 r1Var = new r1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = s0.f45746a;
            r1 r1VarA = m0.a(view);
            o1 o1Var = r1Var.f45740a;
            o1Var.s(r1VarA);
            View rootView = view.getRootView();
            o1Var.d(rootView);
            o1Var.k(rootView);
            o1Var.l();
            o1Var.t(view.getWindowSystemUiVisibility());
        }
        return r1Var;
    }

    public final int a() {
        return this.f45740a.j().f40261d;
    }

    public final int b() {
        return this.f45740a.j().f40258a;
    }

    public final int c() {
        return this.f45740a.j().f40260c;
    }

    public final int d() {
        return this.f45740a.j().f40259b;
    }

    public final r1 e(int i10, int i11, int i12, int i13) {
        f1 b1Var;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 36) {
            b1Var = new e1(this);
        } else if (i14 >= 35) {
            b1Var = new d1(this);
        } else if (i14 >= 34) {
            b1Var = new c1(this);
        } else {
            b1Var = i14 >= 31 ? new b1(this) : new a1(this);
        }
        b1Var.f(f0.b.b(i10, i11, i12, i13));
        return b1Var.b();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r1) {
            return Objects.equals(this.f45740a, ((r1) obj).f45740a);
        }
        return false;
    }

    public final WindowInsets f() {
        o1 o1Var = this.f45740a;
        if (o1Var instanceof g1) {
            return ((g1) o1Var).f45700c;
        }
        return null;
    }

    public final int hashCode() {
        o1 o1Var = this.f45740a;
        if (o1Var == null) {
            return 0;
        }
        return o1Var.hashCode();
    }

    public r1() {
        this.f45740a = new o1(this);
    }
}
