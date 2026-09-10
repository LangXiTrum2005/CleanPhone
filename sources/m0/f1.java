package m0;

import android.graphics.Rect;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r1 f45696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rect[][] f45697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect[][] f45698c;

    public f1() {
        this(new r1());
    }

    public abstract r1 b();

    public void c(r1 r1Var) {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            List<Rect> listE = r1Var.f45740a.e(i10);
            int iM = go.k.M(i10);
            this.f45697b[iM] = (Rect[]) listE.toArray(new Rect[listE.size()]);
            if (i10 != 8) {
                List<Rect> listF = r1Var.f45740a.f(i10);
                this.f45698c[iM] = (Rect[]) listF.toArray(new Rect[listF.size()]);
            }
        }
    }

    public abstract void d(f0.b bVar);

    public abstract void e(f0.b bVar);

    public abstract void f(f0.b bVar);

    public abstract void g(f0.b bVar);

    public f1(r1 r1Var) {
        this.f45697b = new Rect[10][];
        this.f45698c = new Rect[10][];
        this.f45696a = r1Var;
        c(r1Var);
    }

    public final void a() {
    }
}
