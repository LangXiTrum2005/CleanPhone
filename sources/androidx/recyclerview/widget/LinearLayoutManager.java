package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends r0 implements d1 {
    public final w A;
    public final x B;
    public final int C;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4679p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y f4680q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f4681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f4682s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f4683t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4684u = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f4685v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f4686w = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4687x = -1;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f4688y = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z f4689z = null;

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4679p = 1;
        this.f4683t = false;
        w wVar = new w();
        wVar.e();
        this.A = wVar;
        this.B = new x();
        this.C = 2;
        q0 q0VarD = r0.D(context, attributeSet, i10, i11);
        int i12 = q0VarD.f4892a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException(l1.d.e(i12, "invalid orientation:"));
        }
        c(null);
        if (i12 != this.f4679p || this.f4681r == null) {
            c0 c0VarA = c0.a(this, i12);
            this.f4681r = c0VarA;
            wVar.f4948f = c0VarA;
            this.f4679p = i12;
            f0();
        }
        boolean z10 = q0VarD.f4894c;
        c(null);
        if (z10 != this.f4683t) {
            this.f4683t = z10;
            f0();
        }
        R0(q0VarD.f4895d);
    }

    public final int A0(y0 y0Var, y yVar, e1 e1Var, boolean z10) {
        int i10;
        int i11 = yVar.f4961c;
        int i12 = yVar.f4965g;
        if (i12 != Integer.MIN_VALUE) {
            if (i11 < 0) {
                yVar.f4965g = i12 + i11;
            }
            N0(y0Var, yVar);
        }
        int i13 = yVar.f4961c + yVar.f4966h;
        while (true) {
            if ((!yVar.f4969k && i13 <= 0) || (i10 = yVar.f4962d) < 0 || i10 >= e1Var.b()) {
                break;
            }
            x xVar = this.B;
            xVar.f4956d = 0;
            xVar.f4953a = false;
            xVar.f4954b = false;
            xVar.f4955c = false;
            L0(y0Var, e1Var, yVar, xVar);
            if (!xVar.f4953a) {
                int i14 = yVar.f4960b;
                int i15 = xVar.f4956d;
                yVar.f4960b = (yVar.f4964f * i15) + i14;
                if (!xVar.f4954b || this.f4680q.f4968j != null || !e1Var.f4755g) {
                    yVar.f4961c -= i15;
                    i13 -= i15;
                }
                int i16 = yVar.f4965g;
                if (i16 != Integer.MIN_VALUE) {
                    int i17 = i16 + i15;
                    yVar.f4965g = i17;
                    int i18 = yVar.f4961c;
                    if (i18 < 0) {
                        yVar.f4965g = i17 + i18;
                    }
                    N0(y0Var, yVar);
                }
                if (z10 && xVar.f4955c) {
                    break;
                }
            } else {
                break;
            }
        }
        return i11 - yVar.f4961c;
    }

    public final View B0(boolean z10) {
        return this.f4684u ? E0(0, v(), z10) : E0(v() - 1, -1, z10);
    }

    public final View C0(boolean z10) {
        return this.f4684u ? E0(v() - 1, -1, z10) : E0(0, v(), z10);
    }

    public final View D0(int i10, int i11) {
        int i12;
        int i13;
        z0();
        if (i11 <= i10 && i11 >= i10) {
            return u(i10);
        }
        if (this.f4681r.e(u(i10)) < this.f4681r.k()) {
            i12 = 16644;
            i13 = 16388;
        } else {
            i12 = 4161;
            i13 = 4097;
        }
        return this.f4679p == 0 ? this.f4907c.S0(i10, i11, i12, i13) : this.f4908d.S0(i10, i11, i12, i13);
    }

    public final View E0(int i10, int i11, boolean z10) {
        z0();
        int i12 = z10 ? 24579 : 320;
        return this.f4679p == 0 ? this.f4907c.S0(i10, i11, i12, 320) : this.f4908d.S0(i10, i11, i12, 320);
    }

    public View F0(y0 y0Var, e1 e1Var, int i10, int i11, int i12) {
        z0();
        int iK = this.f4681r.k();
        int iG = this.f4681r.g();
        int i13 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View viewU = u(i10);
            int iC = r0.C(viewU);
            if (iC >= 0 && iC < i12) {
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

    @Override // androidx.recyclerview.widget.r0
    public final boolean G() {
        return true;
    }

    public final int G0(int i10, y0 y0Var, e1 e1Var, boolean z10) {
        int iG;
        int iG2 = this.f4681r.g() - i10;
        if (iG2 <= 0) {
            return 0;
        }
        int i11 = -Q0(-iG2, y0Var, e1Var);
        int i12 = i10 + i11;
        if (!z10 || (iG = this.f4681r.g() - i12) <= 0) {
            return i11;
        }
        this.f4681r.o(iG);
        return iG + i11;
    }

    public final int H0(int i10, y0 y0Var, e1 e1Var, boolean z10) {
        int iK;
        int iK2 = i10 - this.f4681r.k();
        if (iK2 <= 0) {
            return 0;
        }
        int i11 = -Q0(iK2, y0Var, e1Var);
        int i12 = i10 + i11;
        if (!z10 || (iK = i12 - this.f4681r.k()) <= 0) {
            return i11;
        }
        this.f4681r.o(-iK);
        return i11 - iK;
    }

    public final View I0() {
        return u(this.f4684u ? 0 : v() - 1);
    }

    public final View J0() {
        return u(this.f4684u ? v() - 1 : 0);
    }

    public final boolean K0() {
        RecyclerView recyclerView = this.f4906b;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public void L0(y0 y0Var, e1 e1Var, y yVar, x xVar) {
        int iD;
        int iD2;
        int i10;
        int i11;
        int iD3;
        View viewB = yVar.b(y0Var);
        if (viewB == null) {
            xVar.f4953a = true;
            return;
        }
        s0 s0Var = (s0) viewB.getLayoutParams();
        if (yVar.f4968j == null) {
            if (this.f4684u == (yVar.f4964f == -1)) {
                b(viewB, -1, false);
            } else {
                b(viewB, 0, false);
            }
        } else {
            if (this.f4684u == (yVar.f4964f == -1)) {
                b(viewB, -1, true);
            } else {
                b(viewB, 0, true);
            }
        }
        s0 s0Var2 = (s0) viewB.getLayoutParams();
        Rect itemDecorInsetsForChild = this.f4906b.getItemDecorInsetsForChild(viewB);
        int i12 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right;
        int i13 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom;
        int iW = r0.w(this.f4917n, this.l, A() + z() + ((ViewGroup.MarginLayoutParams) s0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) s0Var2).rightMargin + i12, ((ViewGroup.MarginLayoutParams) s0Var2).width, d());
        int iW2 = r0.w(this.f4918o, this.f4916m, y() + B() + ((ViewGroup.MarginLayoutParams) s0Var2).topMargin + ((ViewGroup.MarginLayoutParams) s0Var2).bottomMargin + i13, ((ViewGroup.MarginLayoutParams) s0Var2).height, e());
        if (o0(viewB, iW, iW2, s0Var2)) {
            viewB.measure(iW, iW2);
        }
        xVar.f4956d = this.f4681r.c(viewB);
        if (this.f4679p == 1) {
            if (K0()) {
                iD3 = this.f4917n - A();
                iD2 = iD3 - this.f4681r.d(viewB);
            } else {
                int iZ = z();
                iD3 = this.f4681r.d(viewB) + iZ;
                iD2 = iZ;
            }
            if (yVar.f4964f == -1) {
                iD = yVar.f4960b;
                i11 = iD - xVar.f4956d;
            } else {
                i11 = yVar.f4960b;
                iD = xVar.f4956d + i11;
            }
        } else {
            int iB = B();
            iD = this.f4681r.d(viewB) + iB;
            if (yVar.f4964f == -1) {
                int i14 = yVar.f4960b;
                i10 = i14;
                iD2 = i14 - xVar.f4956d;
            } else {
                int i15 = yVar.f4960b;
                iD2 = i15;
                i10 = xVar.f4956d + i15;
            }
            i11 = iB;
            iD3 = i10;
        }
        r0.I(viewB, iD2, i11, iD3, iD);
        if (s0Var.f4925a.isRemoved() || s0Var.f4925a.isUpdated()) {
            xVar.f4954b = true;
        }
        xVar.f4955c = viewB.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.r0
    public View M(View view, int i10, y0 y0Var, e1 e1Var) {
        int iY0;
        View viewD0;
        P0();
        if (v() != 0 && (iY0 = y0(i10)) != Integer.MIN_VALUE) {
            z0();
            z0();
            S0(iY0, (int) (this.f4681r.l() * 0.33333334f), false, e1Var);
            y yVar = this.f4680q;
            yVar.f4965g = Integer.MIN_VALUE;
            yVar.f4959a = false;
            A0(y0Var, yVar, e1Var, true);
            if (iY0 == -1) {
                viewD0 = this.f4684u ? D0(v() - 1, -1) : D0(0, v());
            } else {
                viewD0 = this.f4684u ? D0(0, v()) : D0(v() - 1, -1);
            }
            View viewJ0 = iY0 == -1 ? J0() : I0();
            if (!viewJ0.hasFocusable()) {
                return viewD0;
            }
            if (viewD0 != null) {
                return viewJ0;
            }
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (v() > 0) {
            View viewE0 = E0(0, v(), false);
            accessibilityEvent.setFromIndex(viewE0 == null ? -1 : r0.C(viewE0));
            View viewE1 = E0(v() - 1, -1, false);
            accessibilityEvent.setToIndex(viewE1 != null ? r0.C(viewE1) : -1);
        }
    }

    public final void N0(y0 y0Var, y yVar) {
        if (!yVar.f4959a || yVar.f4969k) {
            return;
        }
        if (yVar.f4964f != -1) {
            int i10 = yVar.f4965g;
            if (i10 < 0) {
                return;
            }
            int iV = v();
            if (!this.f4684u) {
                for (int i11 = 0; i11 < iV; i11++) {
                    View viewU = u(i11);
                    if (this.f4681r.b(viewU) > i10 || this.f4681r.m(viewU) > i10) {
                        O0(y0Var, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = iV - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View viewU2 = u(i13);
                if (this.f4681r.b(viewU2) > i10 || this.f4681r.m(viewU2) > i10) {
                    O0(y0Var, i12, i13);
                    return;
                }
            }
            return;
        }
        int i14 = yVar.f4965g;
        int iV2 = v();
        if (i14 < 0) {
            return;
        }
        int iF = this.f4681r.f() - i14;
        if (this.f4684u) {
            for (int i15 = 0; i15 < iV2; i15++) {
                View viewU3 = u(i15);
                if (this.f4681r.e(viewU3) < iF || this.f4681r.n(viewU3) < iF) {
                    O0(y0Var, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = iV2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View viewU4 = u(i17);
            if (this.f4681r.e(viewU4) < iF || this.f4681r.n(viewU4) < iF) {
                O0(y0Var, i16, i17);
                return;
            }
        }
    }

    public final void O0(y0 y0Var, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                View viewU = u(i10);
                d0(i10);
                y0Var.g(viewU);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            View viewU2 = u(i12);
            d0(i12);
            y0Var.g(viewU2);
        }
    }

    public final void P0() {
        if (this.f4679p == 1 || !K0()) {
            this.f4684u = this.f4683t;
        } else {
            this.f4684u = !this.f4683t;
        }
    }

    public final int Q0(int i10, y0 y0Var, e1 e1Var) {
        if (v() != 0 && i10 != 0) {
            this.f4680q.f4959a = true;
            z0();
            int i11 = i10 > 0 ? 1 : -1;
            int iAbs = Math.abs(i10);
            S0(i11, iAbs, true, e1Var);
            y yVar = this.f4680q;
            int iA0 = A0(y0Var, yVar, e1Var, false) + yVar.f4965g;
            if (iA0 >= 0) {
                if (iAbs > iA0) {
                    i10 = i11 * iA0;
                }
                this.f4681r.o(-i10);
                this.f4680q.f4967i = i10;
                return i10;
            }
        }
        return 0;
    }

    public void R0(boolean z10) {
        c(null);
        if (this.f4685v == z10) {
            return;
        }
        this.f4685v = z10;
        f0();
    }

    public final void S0(int i10, int i11, boolean z10, e1 e1Var) {
        int iK;
        this.f4680q.f4969k = this.f4681r.i() == 0 && this.f4681r.f() == 0;
        this.f4680q.f4966h = e1Var.f4749a != -1 ? this.f4681r.l() : 0;
        y yVar = this.f4680q;
        yVar.f4964f = i10;
        if (i10 == 1) {
            yVar.f4966h = this.f4681r.h() + yVar.f4966h;
            View viewI0 = I0();
            y yVar2 = this.f4680q;
            yVar2.f4963e = this.f4684u ? -1 : 1;
            int iC = r0.C(viewI0);
            y yVar3 = this.f4680q;
            yVar2.f4962d = iC + yVar3.f4963e;
            yVar3.f4960b = this.f4681r.b(viewI0);
            iK = this.f4681r.b(viewI0) - this.f4681r.g();
        } else {
            View viewJ0 = J0();
            y yVar4 = this.f4680q;
            yVar4.f4966h = this.f4681r.k() + yVar4.f4966h;
            y yVar5 = this.f4680q;
            yVar5.f4963e = this.f4684u ? 1 : -1;
            int iC2 = r0.C(viewJ0);
            y yVar6 = this.f4680q;
            yVar5.f4962d = iC2 + yVar6.f4963e;
            yVar6.f4960b = this.f4681r.e(viewJ0);
            iK = (-this.f4681r.e(viewJ0)) + this.f4681r.k();
        }
        y yVar7 = this.f4680q;
        yVar7.f4961c = i11;
        if (z10) {
            yVar7.f4961c = i11 - iK;
        }
        yVar7.f4965g = iK;
    }

    public final void T0(int i10, int i11) {
        this.f4680q.f4961c = this.f4681r.g() - i11;
        y yVar = this.f4680q;
        yVar.f4963e = this.f4684u ? -1 : 1;
        yVar.f4962d = i10;
        yVar.f4964f = 1;
        yVar.f4960b = i11;
        yVar.f4965g = Integer.MIN_VALUE;
    }

    public final void U0(int i10, int i11) {
        this.f4680q.f4961c = i11 - this.f4681r.k();
        y yVar = this.f4680q;
        yVar.f4962d = i10;
        yVar.f4963e = this.f4684u ? 1 : -1;
        yVar.f4964f = -1;
        yVar.f4960b = i11;
        yVar.f4965g = Integer.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:117:0x01de  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:122:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:124:0x0212  */
    /* JADX WARN: Code duplicated, block: B:126:0x0216  */
    /* JADX WARN: Code duplicated, block: B:127:0x022c  */
    /* JADX WARN: Code duplicated, block: B:129:0x0241  */
    /* JADX WARN: Code duplicated, block: B:139:0x0272  */
    /* JADX WARN: Code duplicated, block: B:140:0x0279  */
    /* JADX WARN: Code duplicated, block: B:144:0x0289  */
    /* JADX WARN: Code duplicated, block: B:145:0x028f  */
    /* JADX WARN: Code duplicated, block: B:97:0x0190  */
    /* JADX WARN: Code duplicated, block: B:98:0x0194  */
    @Override // androidx.recyclerview.widget.r0
    public void V(y0 y0Var, e1 e1Var) {
        View focusedChild;
        RecyclerView recyclerView;
        View focusedChild2;
        y0 y0Var2;
        View viewF0;
        int iK;
        s0 s0Var;
        int iB;
        int i10;
        int iE;
        int i11;
        int i12;
        int i13;
        List list;
        int i14;
        int i15;
        int iG0;
        int i16;
        View viewQ;
        int iE2;
        int iG;
        int i17;
        LinearLayoutManager linearLayoutManager = this;
        e1 e1Var2 = e1Var;
        int i18 = -1;
        if (!(linearLayoutManager.f4689z == null && linearLayoutManager.f4687x == -1) && e1Var2.b() == 0) {
            a0(y0Var);
            return;
        }
        z zVar = linearLayoutManager.f4689z;
        if (zVar != null && (i17 = zVar.f4978a) >= 0) {
            linearLayoutManager.f4687x = i17;
        }
        linearLayoutManager.z0();
        linearLayoutManager.f4680q.f4959a = false;
        linearLayoutManager.P0();
        RecyclerView recyclerView2 = linearLayoutManager.f4906b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || linearLayoutManager.f4905a.f4742c.contains(focusedChild)) {
            focusedChild = null;
        }
        w wVar = linearLayoutManager.A;
        if (wVar.f4946d && linearLayoutManager.f4687x == -1 && linearLayoutManager.f4689z == null) {
            if (focusedChild != null && (linearLayoutManager.f4681r.e(focusedChild) >= linearLayoutManager.f4681r.g() || linearLayoutManager.f4681r.b(focusedChild) <= linearLayoutManager.f4681r.k())) {
                wVar.c(focusedChild, r0.C(focusedChild));
            }
            y0Var2 = y0Var;
        } else {
            wVar.e();
            wVar.f4944b = linearLayoutManager.f4684u ^ linearLayoutManager.f4685v;
            if (!e1Var2.f4755g && (i10 = linearLayoutManager.f4687x) != -1) {
                if (i10 < 0 || i10 >= e1Var2.b()) {
                    linearLayoutManager.f4687x = -1;
                    linearLayoutManager.f4688y = Integer.MIN_VALUE;
                    if (linearLayoutManager.v() != 0) {
                        recyclerView = linearLayoutManager.f4906b;
                        if (recyclerView != null) {
                            focusedChild2 = null;
                        } else {
                            focusedChild2 = null;
                        }
                        if (focusedChild2 != null) {
                            s0Var = (s0) focusedChild2.getLayoutParams();
                            if (s0Var.f4925a.isRemoved()) {
                            }
                        }
                        if (linearLayoutManager.f4682s != linearLayoutManager.f4685v) {
                            y0Var2 = y0Var;
                        } else {
                            if (wVar.f4944b) {
                                if (linearLayoutManager.f4684u) {
                                    viewF0 = linearLayoutManager.F0(y0Var, e1Var2, 0, linearLayoutManager.v(), e1Var2.b());
                                    linearLayoutManager = this;
                                } else {
                                    linearLayoutManager = this;
                                    viewF0 = linearLayoutManager.F0(y0Var, e1Var, v() - 1, -1, e1Var.b());
                                }
                                y0Var2 = y0Var;
                                e1Var2 = e1Var;
                            } else if (linearLayoutManager.f4684u) {
                                y0Var2 = y0Var;
                                e1Var2 = e1Var;
                                viewF0 = linearLayoutManager.F0(y0Var2, e1Var2, linearLayoutManager.v() - 1, -1, e1Var.b());
                                linearLayoutManager = this;
                            } else {
                                linearLayoutManager = this;
                                y0Var2 = y0Var;
                                e1Var2 = e1Var;
                                viewF0 = linearLayoutManager.F0(y0Var2, e1Var2, 0, v(), e1Var.b());
                            }
                            if (viewF0 != null) {
                                wVar.b(viewF0, r0.C(viewF0));
                                if (!e1Var2.f4755g) {
                                    if (wVar.f4944b) {
                                        iK = linearLayoutManager.f4681r.g();
                                    } else {
                                        iK = linearLayoutManager.f4681r.k();
                                    }
                                    wVar.f4947e = iK;
                                }
                            }
                        }
                        wVar.a();
                        if (linearLayoutManager.f4685v) {
                            iB = e1Var2.b() - 1;
                        } else {
                            iB = 0;
                        }
                        wVar.f4945c = iB;
                    } else {
                        y0Var2 = y0Var;
                        wVar.a();
                        if (linearLayoutManager.f4685v) {
                            iB = e1Var2.b() - 1;
                        } else {
                            iB = 0;
                        }
                        wVar.f4945c = iB;
                    }
                } else {
                    int i19 = linearLayoutManager.f4687x;
                    wVar.f4945c = i19;
                    z zVar2 = linearLayoutManager.f4689z;
                    if (zVar2 != null && zVar2.f4978a >= 0) {
                        boolean z10 = zVar2.f4980c;
                        wVar.f4944b = z10;
                        if (z10) {
                            wVar.f4947e = linearLayoutManager.f4681r.g() - linearLayoutManager.f4689z.f4979b;
                        } else {
                            wVar.f4947e = linearLayoutManager.f4681r.k() + linearLayoutManager.f4689z.f4979b;
                        }
                    } else if (linearLayoutManager.f4688y == Integer.MIN_VALUE) {
                        View viewQ2 = linearLayoutManager.q(i19);
                        if (viewQ2 == null) {
                            if (linearLayoutManager.v() > 0) {
                                wVar.f4944b = (linearLayoutManager.f4687x < r0.C(linearLayoutManager.u(0))) == linearLayoutManager.f4684u;
                            }
                            wVar.a();
                        } else if (linearLayoutManager.f4681r.c(viewQ2) > linearLayoutManager.f4681r.l()) {
                            wVar.a();
                        } else if (linearLayoutManager.f4681r.e(viewQ2) - linearLayoutManager.f4681r.k() < 0) {
                            wVar.f4947e = linearLayoutManager.f4681r.k();
                            wVar.f4944b = false;
                        } else if (linearLayoutManager.f4681r.g() - linearLayoutManager.f4681r.b(viewQ2) < 0) {
                            wVar.f4947e = linearLayoutManager.f4681r.g();
                            wVar.f4944b = true;
                        } else {
                            if (wVar.f4944b) {
                                int iB2 = linearLayoutManager.f4681r.b(viewQ2);
                                c0 c0Var = linearLayoutManager.f4681r;
                                iE = (Integer.MIN_VALUE == c0Var.f4730a ? 0 : c0Var.l() - c0Var.f4730a) + iB2;
                            } else {
                                iE = linearLayoutManager.f4681r.e(viewQ2);
                            }
                            wVar.f4947e = iE;
                        }
                    } else {
                        boolean z11 = linearLayoutManager.f4684u;
                        wVar.f4944b = z11;
                        if (z11) {
                            wVar.f4947e = linearLayoutManager.f4681r.g() - linearLayoutManager.f4688y;
                        } else {
                            wVar.f4947e = linearLayoutManager.f4681r.k() + linearLayoutManager.f4688y;
                        }
                    }
                }
                y0Var2 = y0Var;
            } else if (linearLayoutManager.v() != 0) {
                recyclerView = linearLayoutManager.f4906b;
                if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || linearLayoutManager.f4905a.f4742c.contains(focusedChild2)) {
                    focusedChild2 = null;
                }
                if (focusedChild2 != null) {
                    s0Var = (s0) focusedChild2.getLayoutParams();
                    if (s0Var.f4925a.isRemoved() && s0Var.f4925a.getLayoutPosition() >= 0 && s0Var.f4925a.getLayoutPosition() < e1Var2.b()) {
                        wVar.c(focusedChild2, r0.C(focusedChild2));
                        y0Var2 = y0Var;
                    }
                }
                if (linearLayoutManager.f4682s != linearLayoutManager.f4685v) {
                    y0Var2 = y0Var;
                } else {
                    if (wVar.f4944b) {
                        if (linearLayoutManager.f4684u) {
                            viewF0 = linearLayoutManager.F0(y0Var, e1Var2, 0, linearLayoutManager.v(), e1Var2.b());
                            linearLayoutManager = this;
                        } else {
                            linearLayoutManager = this;
                            viewF0 = linearLayoutManager.F0(y0Var, e1Var, v() - 1, -1, e1Var.b());
                        }
                        y0Var2 = y0Var;
                        e1Var2 = e1Var;
                    } else if (linearLayoutManager.f4684u) {
                        y0Var2 = y0Var;
                        e1Var2 = e1Var;
                        viewF0 = linearLayoutManager.F0(y0Var2, e1Var2, linearLayoutManager.v() - 1, -1, e1Var.b());
                        linearLayoutManager = this;
                    } else {
                        linearLayoutManager = this;
                        y0Var2 = y0Var;
                        e1Var2 = e1Var;
                        viewF0 = linearLayoutManager.F0(y0Var2, e1Var2, 0, v(), e1Var.b());
                    }
                    if (viewF0 != null) {
                        wVar.b(viewF0, r0.C(viewF0));
                        if (!e1Var2.f4755g && linearLayoutManager.t0() && (linearLayoutManager.f4681r.e(viewF0) >= linearLayoutManager.f4681r.g() || linearLayoutManager.f4681r.b(viewF0) < linearLayoutManager.f4681r.k())) {
                            if (wVar.f4944b) {
                                iK = linearLayoutManager.f4681r.g();
                            } else {
                                iK = linearLayoutManager.f4681r.k();
                            }
                            wVar.f4947e = iK;
                        }
                    }
                }
                wVar.a();
                if (linearLayoutManager.f4685v) {
                    iB = e1Var2.b() - 1;
                } else {
                    iB = 0;
                }
                wVar.f4945c = iB;
            } else {
                y0Var2 = y0Var;
                wVar.a();
                if (linearLayoutManager.f4685v) {
                    iB = e1Var2.b() - 1;
                } else {
                    iB = 0;
                }
                wVar.f4945c = iB;
            }
            wVar.f4946d = true;
        }
        int iL = e1Var2.f4749a != -1 ? linearLayoutManager.f4681r.l() : 0;
        if (linearLayoutManager.f4680q.f4967i >= 0) {
            i11 = iL;
            iL = 0;
        } else {
            i11 = 0;
        }
        int iK2 = linearLayoutManager.f4681r.k() + iL;
        int iH = linearLayoutManager.f4681r.h() + i11;
        if (e1Var2.f4755g && (i16 = linearLayoutManager.f4687x) != -1 && linearLayoutManager.f4688y != Integer.MIN_VALUE && (viewQ = linearLayoutManager.q(i16)) != null) {
            if (linearLayoutManager.f4684u) {
                iG = linearLayoutManager.f4681r.g() - linearLayoutManager.f4681r.b(viewQ);
                iE2 = linearLayoutManager.f4688y;
            } else {
                iE2 = linearLayoutManager.f4681r.e(viewQ) - linearLayoutManager.f4681r.k();
                iG = linearLayoutManager.f4688y;
            }
            int i20 = iG - iE2;
            if (i20 > 0) {
                iK2 += i20;
            } else {
                iH -= i20;
            }
        }
        if (!wVar.f4944b ? !linearLayoutManager.f4684u : linearLayoutManager.f4684u) {
            i18 = 1;
        }
        linearLayoutManager.M0(y0Var2, e1Var2, wVar, i18);
        p(y0Var);
        linearLayoutManager.f4680q.f4969k = linearLayoutManager.f4681r.i() == 0 && linearLayoutManager.f4681r.f() == 0;
        linearLayoutManager.f4680q.getClass();
        if (wVar.f4944b) {
            linearLayoutManager.U0(wVar.f4945c, wVar.f4947e);
            y yVar = linearLayoutManager.f4680q;
            yVar.f4966h = iK2;
            linearLayoutManager.A0(y0Var2, yVar, e1Var2, false);
            y yVar2 = linearLayoutManager.f4680q;
            i13 = yVar2.f4960b;
            int i21 = yVar2.f4962d;
            int i22 = yVar2.f4961c;
            if (i22 > 0) {
                iH += i22;
            }
            linearLayoutManager.T0(wVar.f4945c, wVar.f4947e);
            y yVar3 = linearLayoutManager.f4680q;
            yVar3.f4966h = iH;
            yVar3.f4962d += yVar3.f4963e;
            linearLayoutManager.A0(y0Var2, yVar3, e1Var2, false);
            y yVar4 = linearLayoutManager.f4680q;
            i12 = yVar4.f4960b;
            int i23 = yVar4.f4961c;
            if (i23 > 0) {
                linearLayoutManager.U0(i21, i13);
                y yVar5 = linearLayoutManager.f4680q;
                yVar5.f4966h = i23;
                linearLayoutManager.A0(y0Var2, yVar5, e1Var2, false);
                i13 = linearLayoutManager.f4680q.f4960b;
            }
        } else {
            linearLayoutManager.T0(wVar.f4945c, wVar.f4947e);
            y yVar6 = linearLayoutManager.f4680q;
            yVar6.f4966h = iH;
            linearLayoutManager.A0(y0Var2, yVar6, e1Var2, false);
            y yVar7 = linearLayoutManager.f4680q;
            i12 = yVar7.f4960b;
            int i24 = yVar7.f4962d;
            int i25 = yVar7.f4961c;
            if (i25 > 0) {
                iK2 += i25;
            }
            linearLayoutManager.U0(wVar.f4945c, wVar.f4947e);
            y yVar8 = linearLayoutManager.f4680q;
            yVar8.f4966h = iK2;
            yVar8.f4962d += yVar8.f4963e;
            linearLayoutManager.A0(y0Var2, yVar8, e1Var2, false);
            y yVar9 = linearLayoutManager.f4680q;
            i13 = yVar9.f4960b;
            int i26 = yVar9.f4961c;
            if (i26 > 0) {
                linearLayoutManager.T0(i24, i12);
                y yVar10 = linearLayoutManager.f4680q;
                yVar10.f4966h = i26;
                linearLayoutManager.A0(y0Var2, yVar10, e1Var2, false);
                i12 = linearLayoutManager.f4680q.f4960b;
            }
        }
        if (linearLayoutManager.v() > 0) {
            if (linearLayoutManager.f4684u ^ linearLayoutManager.f4685v) {
                int iG1 = linearLayoutManager.G0(i12, y0Var2, e1Var2, true);
                i14 = i13 + iG1;
                i15 = i12 + iG1;
                iG0 = linearLayoutManager.H0(i14, y0Var2, e1Var2, false);
            } else {
                int iH0 = linearLayoutManager.H0(i13, y0Var2, e1Var2, true);
                i14 = i13 + iH0;
                i15 = i12 + iH0;
                iG0 = linearLayoutManager.G0(i15, y0Var2, e1Var2, false);
            }
            i13 = i14 + iG0;
            i12 = i15 + iG0;
        }
        if (e1Var2.f4759k && linearLayoutManager.v() != 0 && !e1Var2.f4755g && linearLayoutManager.t0()) {
            List list2 = y0Var2.f4973d;
            int size = list2.size();
            int iC = r0.C(linearLayoutManager.u(0));
            int iC2 = 0;
            int iC3 = 0;
            for (int i27 = 0; i27 < size; i27++) {
                h1 h1Var = (h1) list2.get(i27);
                if (!h1Var.isRemoved()) {
                    if ((h1Var.getLayoutPosition() < iC) != linearLayoutManager.f4684u) {
                        iC2 += linearLayoutManager.f4681r.c(h1Var.itemView);
                    } else {
                        iC3 += linearLayoutManager.f4681r.c(h1Var.itemView);
                    }
                }
            }
            linearLayoutManager.f4680q.f4968j = list2;
            if (iC2 > 0) {
                linearLayoutManager.U0(r0.C(linearLayoutManager.J0()), i13);
                y yVar11 = linearLayoutManager.f4680q;
                yVar11.f4966h = iC2;
                yVar11.f4961c = 0;
                yVar11.a(null);
                linearLayoutManager.A0(y0Var2, linearLayoutManager.f4680q, e1Var2, false);
            }
            if (iC3 > 0) {
                linearLayoutManager.T0(r0.C(linearLayoutManager.I0()), i12);
                y yVar12 = linearLayoutManager.f4680q;
                yVar12.f4966h = iC3;
                yVar12.f4961c = 0;
                list = null;
                yVar12.a(null);
                linearLayoutManager.A0(y0Var2, linearLayoutManager.f4680q, e1Var2, false);
            } else {
                list = null;
            }
            linearLayoutManager.f4680q.f4968j = list;
        }
        if (e1Var2.f4755g) {
            wVar.e();
        } else {
            c0 c0Var2 = linearLayoutManager.f4681r;
            c0Var2.f4730a = c0Var2.l();
        }
        linearLayoutManager.f4682s = linearLayoutManager.f4685v;
    }

    @Override // androidx.recyclerview.widget.r0
    public void W(e1 e1Var) {
        this.f4689z = null;
        this.f4687x = -1;
        this.f4688y = Integer.MIN_VALUE;
        this.A.e();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void X(Parcelable parcelable) {
        if (parcelable instanceof z) {
            this.f4689z = (z) parcelable;
            f0();
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final Parcelable Y() {
        z zVar = this.f4689z;
        if (zVar != null) {
            z zVar2 = new z();
            zVar2.f4978a = zVar.f4978a;
            zVar2.f4979b = zVar.f4979b;
            zVar2.f4980c = zVar.f4980c;
            return zVar2;
        }
        z zVar3 = new z();
        if (v() <= 0) {
            zVar3.f4978a = -1;
            return zVar3;
        }
        z0();
        boolean z10 = this.f4682s ^ this.f4684u;
        zVar3.f4980c = z10;
        if (z10) {
            View viewI0 = I0();
            zVar3.f4979b = this.f4681r.g() - this.f4681r.b(viewI0);
            zVar3.f4978a = r0.C(viewI0);
            return zVar3;
        }
        View viewJ0 = J0();
        zVar3.f4978a = r0.C(viewJ0);
        zVar3.f4979b = this.f4681r.e(viewJ0) - this.f4681r.k();
        return zVar3;
    }

    @Override // androidx.recyclerview.widget.d1
    public final PointF a(int i10) {
        if (v() == 0) {
            return null;
        }
        int i11 = (i10 < r0.C(u(0))) != this.f4684u ? -1 : 1;
        return this.f4679p == 0 ? new PointF(i11, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i11);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.f4689z != null || (recyclerView = this.f4906b) == null) {
            return;
        }
        recyclerView.assertNotInLayoutOrScroll(str);
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean d() {
        return this.f4679p == 0;
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean e() {
        return this.f4679p == 1;
    }

    @Override // androidx.recyclerview.widget.r0
    public int g0(int i10, y0 y0Var, e1 e1Var) {
        if (this.f4679p == 1) {
            return 0;
        }
        return Q0(i10, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void h(int i10, int i11, e1 e1Var, q qVar) {
        if (this.f4679p != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        z0();
        S0(i10 > 0 ? 1 : -1, Math.abs(i10), true, e1Var);
        u0(e1Var, this.f4680q, qVar);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void h0(int i10) {
        this.f4687x = i10;
        this.f4688y = Integer.MIN_VALUE;
        z zVar = this.f4689z;
        if (zVar != null) {
            zVar.f4978a = -1;
        }
        f0();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void i(int i10, q qVar) {
        boolean z10;
        int i11;
        z zVar = this.f4689z;
        if (zVar == null || (i11 = zVar.f4978a) < 0) {
            P0();
            z10 = this.f4684u;
            i11 = this.f4687x;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            z10 = zVar.f4980c;
        }
        int i12 = z10 ? -1 : 1;
        for (int i13 = 0; i13 < this.C && i11 >= 0 && i11 < i10; i13++) {
            qVar.a(i11, 0);
            i11 += i12;
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public int i0(int i10, y0 y0Var, e1 e1Var) {
        if (this.f4679p == 0) {
            return 0;
        }
        return Q0(i10, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int j(e1 e1Var) {
        return v0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int k(e1 e1Var) {
        return w0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int l(e1 e1Var) {
        return x0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int m(e1 e1Var) {
        return v0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int n(e1 e1Var) {
        return w0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int o(e1 e1Var) {
        return x0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean p0() {
        if (this.f4916m != 1073741824 && this.l != 1073741824) {
            int iV = v();
            for (int i10 = 0; i10 < iV; i10++) {
                ViewGroup.LayoutParams layoutParams = u(i10).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.r0
    public final View q(int i10) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iC = i10 - r0.C(u(0));
        if (iC >= 0 && iC < iV) {
            View viewU = u(iC);
            if (r0.C(viewU) == i10) {
                return viewU;
            }
        }
        return super.q(i10);
    }

    @Override // androidx.recyclerview.widget.r0
    public s0 r() {
        return new s0(-2, -2);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void r0(RecyclerView recyclerView, int i10) {
        a0 a0Var = new a0(recyclerView.getContext());
        a0Var.f4705a = i10;
        s0(a0Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public boolean t0() {
        return this.f4689z == null && this.f4682s == this.f4685v;
    }

    public void u0(e1 e1Var, y yVar, q qVar) {
        int i10 = yVar.f4962d;
        if (i10 < 0 || i10 >= e1Var.b()) {
            return;
        }
        qVar.a(i10, Math.max(0, yVar.f4965g));
    }

    public final int v0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        z0();
        boolean z10 = !this.f4686w;
        return x7.a.g(e1Var, this.f4681r, C0(z10), B0(z10), this, this.f4686w);
    }

    public final int w0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        z0();
        boolean z10 = !this.f4686w;
        return x7.a.h(e1Var, this.f4681r, C0(z10), B0(z10), this, this.f4686w, this.f4684u);
    }

    public final int x0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        z0();
        boolean z10 = !this.f4686w;
        return x7.a.i(e1Var, this.f4681r, C0(z10), B0(z10), this, this.f4686w);
    }

    public final int y0(int i10) {
        if (i10 == 1) {
            return (this.f4679p != 1 && K0()) ? 1 : -1;
        }
        if (i10 == 2) {
            return (this.f4679p != 1 && K0()) ? -1 : 1;
        }
        if (i10 == 17) {
            return this.f4679p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 == 33) {
            return this.f4679p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i10 != 66) {
            return (i10 == 130 && this.f4679p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f4679p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void z0() {
        if (this.f4680q == null) {
            y yVar = new y();
            yVar.f4959a = true;
            yVar.f4966h = 0;
            yVar.f4968j = null;
            this.f4680q = yVar;
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void L(RecyclerView recyclerView) {
    }

    public void M0(y0 y0Var, e1 e1Var, w wVar, int i10) {
    }
}
