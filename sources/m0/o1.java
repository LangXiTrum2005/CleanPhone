package m0;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class o1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r1 f45732b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f45733a;

    static {
        f1 b1Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            b1Var = new e1();
        } else if (i10 >= 35) {
            b1Var = new d1();
        } else if (i10 >= 34) {
            b1Var = new c1();
        } else {
            b1Var = i10 >= 31 ? new b1() : new a1();
        }
        f45732b = b1Var.b().f45740a.a().f45740a.b().f45740a.c();
    }

    public o1(r1 r1Var) {
        this.f45733a = r1Var;
    }

    public r1 a() {
        return this.f45733a;
    }

    public r1 b() {
        return this.f45733a;
    }

    public r1 c() {
        return this.f45733a;
    }

    public List<Rect> e(int i10) {
        return Collections.EMPTY_LIST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o1)) {
            return false;
        }
        o1 o1Var = (o1) obj;
        return o() == o1Var.o() && n() == o1Var.n() && Objects.equals(j(), o1Var.j()) && Objects.equals(i(), o1Var.i()) && Objects.equals(g(), o1Var.g());
    }

    public List<Rect> f(int i10) {
        return Collections.EMPTY_LIST;
    }

    public j g() {
        return null;
    }

    public f0.b h(int i10) {
        return f0.b.f40257e;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(o()), Boolean.valueOf(n()), j(), i(), g());
    }

    public f0.b i() {
        return f0.b.f40257e;
    }

    public f0.b j() {
        return f0.b.f40257e;
    }

    public r1 m(int i10, int i11, int i12, int i13) {
        return f45732b;
    }

    public boolean n() {
        return false;
    }

    public boolean o() {
        return false;
    }

    public boolean p(int i10) {
        return true;
    }

    public void l() {
    }

    public void d(View view) {
    }

    public void k(View view) {
    }

    public void q(l lVar) {
    }

    public void r(f0.b[] bVarArr) {
    }

    public void s(r1 r1Var) {
    }

    public void t(int i10) {
    }

    public void u(Rect[][] rectArr) {
    }

    public void v(Rect[][] rectArr) {
    }
}
