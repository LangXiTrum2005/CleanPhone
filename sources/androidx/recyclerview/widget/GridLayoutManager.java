package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean D;
    public final int E;
    public int[] F;
    public View[] G;
    public final SparseIntArray H;
    public final SparseIntArray I;
    public final t J;
    public final Rect K;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.D = false;
        this.E = -1;
        this.H = new SparseIntArray();
        this.I = new SparseIntArray();
        t tVar = new t();
        this.J = tVar;
        this.K = new Rect();
        int i12 = r0.D(context, attributeSet, i10, i11).f4893b;
        if (i12 == this.E) {
            return;
        }
        this.D = true;
        if (i12 < 1) {
            throw new IllegalArgumentException(l1.d.e(i12, "Span count should be at least 1. Provided "));
        }
        this.E = i12;
        tVar.b();
        f0();
    }

    @Override // androidx.recyclerview.widget.r0
    public final int E(y0 y0Var, e1 e1Var) {
        if (this.f4679p == 0) {
            return this.E;
        }
        if (e1Var.b() < 1) {
            return 0;
        }
        return Y0(e1Var.b() - 1, y0Var, e1Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View F0(y0 y0Var, e1 e1Var, int i10, int i11, int i12) {
        z0();
        int iK = this.f4681r.k();
        int iG = this.f4681r.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewU = u(i10);
            int iC = r0.C(viewU);
            if (iC >= 0 && iC < i12 && Z0(iC, y0Var, e1Var) == 0) {
                if (((s0) viewU.getLayoutParams()).f4925a.isRemoved()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f4681r.e(viewU) < iG && this.f4681r.b(viewU) >= iK) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            i10 += i13;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v35 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void L0(y0 y0Var, e1 e1Var, y yVar, x xVar) {
        int i10;
        int i11;
        int i12;
        int iD;
        int iZ;
        int i13;
        int iW;
        int iW2;
        ?? r13;
        int i14;
        View viewB;
        int iJ = this.f4681r.j();
        boolean z10 = iJ != 1073741824;
        int i15 = v() > 0 ? this.F[this.E] : 0;
        if (z10) {
            c1();
        }
        boolean z11 = yVar.f4963e == 1;
        int iA1 = !z11 ? a1(yVar.f4962d, y0Var, e1Var) + Z0(yVar.f4962d, y0Var, e1Var) : this.E;
        int i16 = 0;
        while (i16 < this.E && (i14 = yVar.f4962d) >= 0 && i14 < e1Var.b() && iA1 > 0) {
            int i17 = yVar.f4962d;
            int iA2 = a1(i17, y0Var, e1Var);
            if (iA2 > this.E) {
                throw new IllegalArgumentException(l1.d.i(l1.d.l("Item at position ", i17, " requires ", iA2, " spans but GridLayoutManager has only "), this.E, " spans."));
            }
            iA1 -= iA2;
            if (iA1 < 0 || (viewB = yVar.b(y0Var)) == null) {
                break;
            }
            this.G[i16] = viewB;
            i16++;
        }
        if (i16 == 0) {
            xVar.f4953a = true;
            return;
        }
        if (z11) {
            i12 = 1;
            i11 = i16;
            i10 = 0;
        } else {
            i10 = i16 - 1;
            i11 = -1;
            i12 = -1;
        }
        int i18 = 0;
        while (i10 != i11) {
            View view = this.G[i10];
            u uVar = (u) view.getLayoutParams();
            int iA3 = a1(r0.C(view), y0Var, e1Var);
            uVar.f4933f = iA3;
            uVar.f4932e = i18;
            i18 += iA3;
            i10 += i12;
        }
        float f10 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i19 = 0;
        for (int i20 = 0; i20 < i16; i20++) {
            View view2 = this.G[i20];
            if (yVar.f4968j != null) {
                r13 = 0;
                r13 = 0;
                if (z11) {
                    b(view2, -1, true);
                } else {
                    b(view2, 0, true);
                }
            } else if (z11) {
                r13 = 0;
                b(view2, -1, false);
            } else {
                r13 = 0;
                b(view2, 0, false);
            }
            RecyclerView recyclerView = this.f4906b;
            Rect rect = this.K;
            if (recyclerView == null) {
                rect.set(r13, r13, r13, r13);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view2));
            }
            b1(view2, iJ, r13);
            int iC = this.f4681r.c(view2);
            if (iC > i19) {
                i19 = iC;
            }
            float fD = (this.f4681r.d(view2) * 1.0f) / ((u) view2.getLayoutParams()).f4933f;
            if (fD > f10) {
                f10 = fD;
            }
        }
        if (z10) {
            V0(Math.max(Math.round(f10 * this.E), i15));
            i19 = 0;
            for (int i21 = 0; i21 < i16; i21++) {
                View view3 = this.G[i21];
                b1(view3, 1073741824, true);
                int iC2 = this.f4681r.c(view3);
                if (iC2 > i19) {
                    i19 = iC2;
                }
            }
        }
        for (int i22 = 0; i22 < i16; i22++) {
            View view4 = this.G[i22];
            if (this.f4681r.c(view4) != i19) {
                u uVar2 = (u) view4.getLayoutParams();
                Rect rect2 = uVar2.f4926b;
                int i23 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) uVar2).topMargin + ((ViewGroup.MarginLayoutParams) uVar2).bottomMargin;
                int i24 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) uVar2).leftMargin + ((ViewGroup.MarginLayoutParams) uVar2).rightMargin;
                int iX0 = X0(uVar2.f4932e, uVar2.f4933f);
                if (this.f4679p == 1) {
                    iW2 = r0.w(iX0, 1073741824, i24, ((ViewGroup.MarginLayoutParams) uVar2).width, false);
                    iW = View.MeasureSpec.makeMeasureSpec(i19 - i23, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i19 - i24, 1073741824);
                    iW = r0.w(iX0, 1073741824, i23, ((ViewGroup.MarginLayoutParams) uVar2).height, false);
                    iW2 = iMakeMeasureSpec;
                }
                if (q0(view4, iW2, iW, (s0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        int iD2 = 0;
        xVar.f4956d = i19;
        if (this.f4679p == 1) {
            if (yVar.f4964f == -1) {
                int i25 = yVar.f4960b;
                i13 = i25 - i19;
                iD2 = i25;
            } else {
                i13 = yVar.f4960b;
                iD2 = i13 + i19;
            }
            iZ = 0;
            iD = 0;
        } else {
            if (yVar.f4964f == -1) {
                int i26 = yVar.f4960b;
                iZ = i26 - i19;
                iD = i26;
            } else {
                int i27 = yVar.f4960b;
                iD = i27 + i19;
                iZ = i27;
            }
            i13 = iD2;
        }
        for (int i28 = 0; i28 < i16; i28++) {
            View view5 = this.G[i28];
            u uVar3 = (u) view5.getLayoutParams();
            if (this.f4679p != 1) {
                int iB = B() + this.F[uVar3.f4932e];
                i13 = iB;
                iD2 = this.f4681r.d(view5) + iB;
            } else if (K0()) {
                int iZ2 = z() + this.F[this.E - uVar3.f4932e];
                iD = iZ2;
                iZ = iZ2 - this.f4681r.d(view5);
            } else {
                iZ = z() + this.F[uVar3.f4932e];
                iD = this.f4681r.d(view5) + iZ;
            }
            r0.I(view5, iZ, i13, iD, iD2);
            if (uVar3.f4925a.isRemoved() || uVar3.f4925a.isUpdated()) {
                xVar.f4954b = true;
            }
            xVar.f4955c = view5.hasFocusable() | xVar.f4955c;
        }
        Arrays.fill(this.G, (Object) null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View M(android.view.View r23, int r24, androidx.recyclerview.widget.y0 r25, androidx.recyclerview.widget.e1 r26) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.M(android.view.View, int, androidx.recyclerview.widget.y0, androidx.recyclerview.widget.e1):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(y0 y0Var, e1 e1Var, w wVar, int i10) {
        c1();
        if (e1Var.b() > 0 && !e1Var.f4755g) {
            boolean z10 = i10 == 1;
            int iZ0 = Z0(wVar.f4945c, y0Var, e1Var);
            if (z10) {
                while (iZ0 > 0) {
                    int i11 = wVar.f4945c;
                    if (i11 <= 0) {
                        break;
                    }
                    int i12 = i11 - 1;
                    wVar.f4945c = i12;
                    iZ0 = Z0(i12, y0Var, e1Var);
                }
            } else {
                int iB = e1Var.b() - 1;
                int i13 = wVar.f4945c;
                while (i13 < iB) {
                    int i14 = i13 + 1;
                    int iZ1 = Z0(i14, y0Var, e1Var);
                    if (iZ1 <= iZ0) {
                        break;
                    }
                    i13 = i14;
                    iZ0 = iZ1;
                }
                wVar.f4945c = i13;
            }
        }
        W0();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void P(y0 y0Var, e1 e1Var, View view, n0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f46334a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof u)) {
            O(view, eVar);
            return;
        }
        u uVar = (u) layoutParams;
        int iY0 = Y0(uVar.f4925a.getLayoutPosition(), y0Var, e1Var);
        if (this.f4679p == 0) {
            int i10 = uVar.f4932e;
            int i11 = uVar.f4933f;
            int i12 = this.E;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, iY0, 1, i12 > 1 && i11 == i12, false));
            return;
        }
        int i13 = uVar.f4932e;
        int i14 = uVar.f4933f;
        int i15 = this.E;
        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(iY0, 1, i13, i14, i15 > 1 && i14 == i15, false));
    }

    @Override // androidx.recyclerview.widget.r0
    public final void Q(int i10, int i11) {
        this.J.b();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void R() {
        this.J.b();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void R0(boolean z10) {
        if (z10) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.R0(false);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void S(int i10, int i11) {
        this.J.b();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void T(int i10, int i11) {
        this.J.b();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void U(int i10, int i11) {
        this.J.b();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    public final void V(y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f4755g;
        SparseIntArray sparseIntArray = this.I;
        SparseIntArray sparseIntArray2 = this.H;
        if (z10) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                u uVar = (u) u(i10).getLayoutParams();
                int layoutPosition = uVar.f4925a.getLayoutPosition();
                sparseIntArray2.put(layoutPosition, uVar.f4933f);
                sparseIntArray.put(layoutPosition, uVar.f4932e);
            }
        }
        super.V(y0Var, e1Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    public final void V0(int i10) {
        int i11;
        int[] iArr = this.F;
        int i12 = this.E;
        if (iArr == null || iArr.length != i12 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i12 + 1];
        }
        int i13 = 0;
        iArr[0] = 0;
        int i14 = i10 / i12;
        int i15 = i10 % i12;
        int i16 = 0;
        for (int i17 = 1; i17 <= i12; i17++) {
            i13 += i15;
            if (i13 <= 0 || i12 - i13 >= i15) {
                i11 = i14;
            } else {
                i11 = i14 + 1;
                i13 -= i12;
            }
            i16 += i11;
            iArr[i17] = i16;
        }
        this.F = iArr;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    public final void W(e1 e1Var) {
        super.W(e1Var);
        this.D = false;
    }

    public final void W0() {
        View[] viewArr = this.G;
        if (viewArr == null || viewArr.length != this.E) {
            this.G = new View[this.E];
        }
    }

    public final int X0(int i10, int i11) {
        if (this.f4679p != 1 || !K0()) {
            int[] iArr = this.F;
            return iArr[i11 + i10] - iArr[i10];
        }
        int[] iArr2 = this.F;
        int i12 = this.E;
        return iArr2[i12 - i10] - iArr2[(i12 - i10) - i11];
    }

    public final int Y0(int i10, y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f4755g;
        t tVar = this.J;
        if (!z10) {
            tVar.getClass();
            return t.a(i10, this.E);
        }
        int iB = y0Var.b(i10);
        if (iB == -1) {
            d5.u.o(i10, "Cannot find span size for pre layout position. ", "GridLayoutManager");
            return 0;
        }
        tVar.getClass();
        return t.a(iB, this.E);
    }

    public final int Z0(int i10, y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f4755g;
        t tVar = this.J;
        if (!z10) {
            tVar.getClass();
            return i10 % this.E;
        }
        int i11 = this.I.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = y0Var.b(i10);
        if (iB == -1) {
            d5.u.o(i10, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 0;
        }
        tVar.getClass();
        return iB % this.E;
    }

    public final int a1(int i10, y0 y0Var, e1 e1Var) {
        boolean z10 = e1Var.f4755g;
        t tVar = this.J;
        if (!z10) {
            tVar.getClass();
            return 1;
        }
        int i11 = this.H.get(i10, -1);
        if (i11 != -1) {
            return i11;
        }
        if (y0Var.b(i10) == -1) {
            d5.u.o(i10, "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:", "GridLayoutManager");
            return 1;
        }
        tVar.getClass();
        return 1;
    }

    public final void b1(View view, int i10, boolean z10) {
        int iW;
        int iW2;
        u uVar = (u) view.getLayoutParams();
        Rect rect = uVar.f4926b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) uVar).topMargin + ((ViewGroup.MarginLayoutParams) uVar).bottomMargin;
        int i12 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) uVar).leftMargin + ((ViewGroup.MarginLayoutParams) uVar).rightMargin;
        int iX0 = X0(uVar.f4932e, uVar.f4933f);
        if (this.f4679p == 1) {
            iW2 = r0.w(iX0, i10, i12, ((ViewGroup.MarginLayoutParams) uVar).width, false);
            iW = r0.w(this.f4681r.l(), this.f4916m, i11, ((ViewGroup.MarginLayoutParams) uVar).height, true);
        } else {
            int iW3 = r0.w(iX0, i10, i11, ((ViewGroup.MarginLayoutParams) uVar).height, false);
            int iW4 = r0.w(this.f4681r.l(), this.l, i12, ((ViewGroup.MarginLayoutParams) uVar).width, true);
            iW = iW3;
            iW2 = iW4;
        }
        s0 s0Var = (s0) view.getLayoutParams();
        if (z10 ? q0(view, iW2, iW, s0Var) : o0(view, iW2, iW, s0Var)) {
            view.measure(iW2, iW);
        }
    }

    public final void c1() {
        int iY;
        int iB;
        if (this.f4679p == 1) {
            iY = this.f4917n - A();
            iB = z();
        } else {
            iY = this.f4918o - y();
            iB = B();
        }
        V0(iY - iB);
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean f(s0 s0Var) {
        return s0Var instanceof u;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    public final int g0(int i10, y0 y0Var, e1 e1Var) {
        c1();
        W0();
        return super.g0(i10, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    public final int i0(int i10, y0 y0Var, e1 e1Var) {
        c1();
        W0();
        return super.i0(i10, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void l0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        if (this.F == null) {
            super.l0(rect, i10, i11);
        }
        int iA = A() + z();
        int iY = y() + B();
        if (this.f4679p == 1) {
            int iHeight = rect.height() + iY;
            RecyclerView recyclerView = this.f4906b;
            WeakHashMap weakHashMap = m0.s0.f45746a;
            iG2 = r0.g(i11, iHeight, recyclerView.getMinimumHeight());
            int[] iArr = this.F;
            iG = r0.g(i10, iArr[iArr.length - 1] + iA, this.f4906b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iA;
            RecyclerView recyclerView2 = this.f4906b;
            WeakHashMap weakHashMap2 = m0.s0.f45746a;
            iG = r0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            int[] iArr2 = this.F;
            iG2 = r0.g(i11, iArr2[iArr2.length - 1] + iY, this.f4906b.getMinimumHeight());
        }
        this.f4906b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    public final s0 r() {
        return this.f4679p == 0 ? new u(-2, -1) : new u(-1, -2);
    }

    @Override // androidx.recyclerview.widget.r0
    public final s0 s(Context context, AttributeSet attributeSet) {
        u uVar = new u(context, attributeSet);
        uVar.f4932e = -1;
        uVar.f4933f = 0;
        return uVar;
    }

    @Override // androidx.recyclerview.widget.r0
    public final s0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            u uVar = new u((ViewGroup.MarginLayoutParams) layoutParams);
            uVar.f4932e = -1;
            uVar.f4933f = 0;
            return uVar;
        }
        u uVar2 = new u(layoutParams);
        uVar2.f4932e = -1;
        uVar2.f4933f = 0;
        return uVar2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.r0
    public final boolean t0() {
        return this.f4689z == null && !this.D;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void u0(e1 e1Var, y yVar, q qVar) {
        int i10;
        int i11 = this.E;
        for (int i12 = 0; i12 < this.E && (i10 = yVar.f4962d) >= 0 && i10 < e1Var.b() && i11 > 0; i12++) {
            qVar.a(yVar.f4962d, Math.max(0, yVar.f4965g));
            this.J.getClass();
            i11--;
            yVar.f4962d += yVar.f4963e;
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final int x(y0 y0Var, e1 e1Var) {
        if (this.f4679p == 1) {
            return this.E;
        }
        if (e1Var.b() < 1) {
            return 0;
        }
        return Y0(e1Var.b() - 1, y0Var, e1Var) + 1;
    }
}
