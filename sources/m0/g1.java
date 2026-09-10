package m0;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowInsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g1 extends o1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets f45700c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f0.b f45701d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45702e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Rect[][] f45703f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect[][] f45704g;

    public g1(r1 r1Var, WindowInsets windowInsets) {
        super(r1Var);
        this.f45701d = null;
        this.f45703f = new Rect[10][];
        this.f45704g = new Rect[10][];
        this.f45700c = windowInsets;
    }

    public static boolean A(int i10, int i11) {
        return (i10 & 6) == (i11 & 6);
    }

    private l w(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f45733a.f45740a.o()) {
            return l.a(point.x, point.y, true, 0, 0, 0, 0);
        }
        y yVarB = i.b(0, display);
        y yVarB2 = i.b(1, display);
        y yVarB3 = i.b(2, display);
        y yVarB4 = i.b(3, display);
        return l.a(point.x, point.y, false, yVarB != null ? yVarB.f45764b : 0, yVarB2 != null ? yVarB2.f45764b : 0, yVarB3 != null ? yVarB3.f45764b : 0, yVarB4 != null ? yVarB4.f45764b : 0);
    }

    private static List<Rect> x(Rect[][] rectArr, int i10) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i11 = 1; i11 <= 512; i11 <<= 1) {
            if ((i10 & i11) != 0 && (rectArr2 = rectArr[go.k.M(i11)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    private Rect[] y(f0.b bVar) {
        ArrayList arrayList = new ArrayList();
        int i10 = bVar.f40258a;
        int i11 = bVar.f40261d;
        int i12 = bVar.f40260c;
        int i13 = bVar.f40259b;
        if (i10 != 0) {
            arrayList.add(new Rect(0, 0, bVar.f40258a, 0));
        }
        if (i13 != 0) {
            arrayList.add(new Rect(0, 0, 0, i13));
        }
        if (i12 != 0) {
            arrayList.add(new Rect(0 - i12, 0, 0, 0));
        }
        if (i11 != 0) {
            arrayList.add(new Rect(0, 0 - i11, 0, 0));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    @Override // m0.o1
    public List<Rect> e(int i10) {
        return x(this.f45703f, i10);
    }

    @Override // m0.o1
    public List<Rect> f(int i10) {
        return x(this.f45704g, i10);
    }

    @Override // m0.o1
    public abstract f0.b h(int i10);

    @Override // m0.o1
    public final f0.b j() {
        if (this.f45701d == null) {
            WindowInsets windowInsets = this.f45700c;
            this.f45701d = f0.b.b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f45701d;
    }

    @Override // m0.o1
    public void k(View view) {
        w(view);
    }

    @Override // m0.o1
    @SuppressLint({"WrongConstant"})
    public void l() {
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            int iM = go.k.M(i10);
            this.f45703f[iM] = y(h(i10));
            if (i10 != 8) {
                this.f45704g[iM] = y(z(i10));
            }
        }
    }

    @Override // m0.o1
    public boolean o() {
        return this.f45700c.isRound();
    }

    @Override // m0.o1
    public void t(int i10) {
        this.f45702e = i10;
    }

    @Override // m0.o1
    public void u(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f45703f = (Rect[][]) rectArr.clone();
    }

    @Override // m0.o1
    public void v(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f45704g = (Rect[][]) rectArr.clone();
    }

    public abstract f0.b z(int i10);

    @Override // m0.o1
    public void q(l lVar) {
    }

    @Override // m0.o1
    public void r(f0.b[] bVarArr) {
    }

    @Override // m0.o1
    public void s(r1 r1Var) {
    }
}
