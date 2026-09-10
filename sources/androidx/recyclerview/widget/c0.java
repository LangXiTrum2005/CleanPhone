package androidx.recyclerview.widget;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4732c;

    public c0(r0 r0Var) {
        this.f4730a = Integer.MIN_VALUE;
        this.f4732c = new Rect();
        this.f4731b = r0Var;
    }

    public static c0 a(r0 r0Var, int i10) {
        if (i10 == 0) {
            return new b0(r0Var, 0);
        }
        if (i10 == 1) {
            return new b0(r0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int b(View view);

    public abstract int c(View view);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f();

    public abstract int g();

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m(View view);

    public abstract int n(View view);

    public abstract void o(int i10);

    public c0(x0.f fVar) {
        this.f4730a = 0;
        this.f4732c = new x0.b();
        this.f4731b = fVar;
    }
}
