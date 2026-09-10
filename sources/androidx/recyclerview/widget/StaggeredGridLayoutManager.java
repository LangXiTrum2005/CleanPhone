package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.unity3d.services.UnityAdsConstants;
import ea.f2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class StaggeredGridLayoutManager extends r0 implements d1 {
    public final f2 B;
    public final int C;
    public boolean D;
    public boolean E;
    public n1 F;
    public final Rect G;
    public final k1 H;
    public final boolean I;
    public int[] J;
    public final l K;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f4690p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o1[] f4691q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c0 f4692r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c0 f4693s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f4694t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4695u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final v f4696v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f4697w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BitSet f4699y;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4698x = false;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4700z = -1;
    public int A = Integer.MIN_VALUE;

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4690p = -1;
        this.f4697w = false;
        f2 f2Var = new f2(3, false);
        this.B = f2Var;
        this.C = 2;
        this.G = new Rect();
        this.H = new k1(this);
        this.I = true;
        this.K = new l(this, 1);
        q0 q0VarD = r0.D(context, attributeSet, i10, i11);
        int i12 = q0VarD.f4892a;
        if (i12 != 0 && i12 != 1) {
            throw new IllegalArgumentException("invalid orientation.");
        }
        c(null);
        if (i12 != this.f4694t) {
            this.f4694t = i12;
            c0 c0Var = this.f4692r;
            this.f4692r = this.f4693s;
            this.f4693s = c0Var;
            f0();
        }
        int i13 = q0VarD.f4893b;
        c(null);
        if (i13 != this.f4690p) {
            int[] iArr = (int[]) f2Var.f39409b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            f2Var.f39410c = null;
            f0();
            this.f4690p = i13;
            this.f4699y = new BitSet(this.f4690p);
            this.f4691q = new o1[this.f4690p];
            for (int i14 = 0; i14 < this.f4690p; i14++) {
                this.f4691q[i14] = new o1(this, i14);
            }
            f0();
        }
        boolean z10 = q0VarD.f4894c;
        c(null);
        n1 n1Var = this.F;
        if (n1Var != null && n1Var.f4845h != z10) {
            n1Var.f4845h = z10;
        }
        this.f4697w = z10;
        f0();
        v vVar = new v();
        vVar.f4934a = true;
        vVar.f4939f = 0;
        vVar.f4940g = 0;
        this.f4696v = vVar;
        this.f4692r = c0.a(this, this.f4694t);
        this.f4693s = c0.a(this, 1 - this.f4694t);
    }

    public static int U0(int i10, int i11, int i12) {
        int mode;
        return (!(i11 == 0 && i12 == 0) && ((mode = View.MeasureSpec.getMode(i10)) == Integer.MIN_VALUE || mode == 1073741824)) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    public final void A0(y0 y0Var, e1 e1Var, boolean z10) {
        int iK;
        int iE0 = E0(Integer.MAX_VALUE);
        if (iE0 != Integer.MAX_VALUE && (iK = iE0 - this.f4692r.k()) > 0) {
            int iQ0 = iK - Q0(iK, y0Var, e1Var);
            if (!z10 || iQ0 <= 0) {
                return;
            }
            this.f4692r.o(-iQ0);
        }
    }

    public final int B0() {
        if (v() == 0) {
            return 0;
        }
        return r0.C(u(0));
    }

    public final int C0() {
        int iV = v();
        if (iV == 0) {
            return 0;
        }
        return r0.C(u(iV - 1));
    }

    public final int D0(int i10) {
        int iH = this.f4691q[0].h(i10);
        for (int i11 = 1; i11 < this.f4690p; i11++) {
            int iH2 = this.f4691q[i11].h(i10);
            if (iH2 > iH) {
                iH = iH2;
            }
        }
        return iH;
    }

    @Override // androidx.recyclerview.widget.r0
    public final int E(y0 y0Var, e1 e1Var) {
        return this.f4694t == 0 ? this.f4690p : super.E(y0Var, e1Var);
    }

    public final int E0(int i10) {
        int iJ = this.f4691q[0].j(i10);
        for (int i11 = 1; i11 < this.f4690p; i11++) {
            int iJ2 = this.f4691q[i11].j(i10);
            if (iJ2 < iJ) {
                iJ = iJ2;
            }
        }
        return iJ;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:22:0x0036 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0039  */
    /* JADX WARN: Code duplicated, block: B:26:0x0041  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050 A[LOOP:0: B:25:0x003f->B:29:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0053 A[EDGE_INSN: B:30:0x0053->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050]] */
    /* JADX WARN: Code duplicated, block: B:32:0x0056  */
    /* JADX WARN: Code duplicated, block: B:35:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x0077 A[LOOP:1: B:34:0x0066->B:38:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0092  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:49:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:52:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:59:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:63:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0054 A[EDGE_INSN: B:64:0x0054->B:31:0x0054 BREAK  A[LOOP:0: B:25:0x003f->B:29:0x0050], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x007a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x007b A[EDGE_INSN: B:66:0x007b->B:40:0x007b BREAK  A[LOOP:1: B:34:0x0066->B:38:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:? A[RETURN, SYNTHETIC] */
    public final void F0(int i10, int i11, int i12) {
        int i13;
        int i14;
        f2 f2Var;
        int[] iArr;
        int iC0;
        ArrayList arrayList;
        m1 m1Var;
        int size;
        int i15;
        int i16;
        int size2;
        int iC1 = this.f4698x ? C0() : B0();
        if (i12 == 8) {
            if (i10 < i11) {
                i13 = i11 + 1;
            } else {
                i13 = i10 + 1;
                i14 = i11;
            }
            f2Var = this.B;
            iArr = (int[]) f2Var.f39409b;
            if (iArr != null && i14 < iArr.length) {
                arrayList = (ArrayList) f2Var.f39410c;
                if (arrayList != null) {
                    if (arrayList == null) {
                        size2 = arrayList.size() - 1;
                        while (true) {
                            if (size2 >= 0) {
                                m1Var = null;
                                break;
                            }
                            m1Var = (m1) ((ArrayList) f2Var.f39410c).get(size2);
                            if (m1Var.f4825a == i14) {
                                break;
                            } else {
                                size2--;
                            }
                        }
                    } else {
                        m1Var = null;
                        break;
                    }
                    if (m1Var != null) {
                        ((ArrayList) f2Var.f39410c).remove(m1Var);
                    }
                    size = ((ArrayList) f2Var.f39410c).size();
                    i15 = 0;
                    while (true) {
                        if (i15 < size) {
                            i15 = -1;
                            break;
                        } else if (((m1) ((ArrayList) f2Var.f39410c).get(i15)).f4825a >= i14) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    if (i15 != -1) {
                        m1 m1Var2 = (m1) ((ArrayList) f2Var.f39410c).get(i15);
                        ((ArrayList) f2Var.f39410c).remove(i15);
                        i16 = m1Var2.f4825a;
                    } else {
                        i16 = -1;
                    }
                } else {
                    i16 = -1;
                }
                if (i16 == -1) {
                    int[] iArr2 = (int[]) f2Var.f39409b;
                    Arrays.fill(iArr2, i14, iArr2.length, -1);
                    int length = ((int[]) f2Var.f39409b).length;
                } else {
                    Arrays.fill((int[]) f2Var.f39409b, i14, i16 + 1, -1);
                }
            }
            if (i12 != 1) {
                f2Var.s(i10, i11);
            } else if (i12 != 2) {
                f2Var.t(i10, i11);
            } else if (i12 == 8) {
                f2Var.t(i10, 1);
                f2Var.s(i11, 1);
            }
            if (i13 <= iC1) {
                return;
            }
            if (this.f4698x) {
                iC0 = B0();
            } else {
                iC0 = C0();
            }
            if (i14 <= iC0) {
                f0();
            }
        }
        i13 = i10 + i11;
        i14 = i10;
        f2Var = this.B;
        iArr = (int[]) f2Var.f39409b;
        if (iArr != null) {
            arrayList = (ArrayList) f2Var.f39410c;
            if (arrayList != null) {
                if (arrayList == null) {
                    size2 = arrayList.size() - 1;
                    while (true) {
                        if (size2 >= 0) {
                            m1Var = null;
                            break;
                        }
                        m1Var = (m1) ((ArrayList) f2Var.f39410c).get(size2);
                        if (m1Var.f4825a == i14) {
                            break;
                            break;
                        }
                        size2--;
                    }
                } else {
                    m1Var = null;
                    break;
                }
                if (m1Var != null) {
                    ((ArrayList) f2Var.f39410c).remove(m1Var);
                }
                size = ((ArrayList) f2Var.f39410c).size();
                i15 = 0;
                while (true) {
                    if (i15 < size) {
                        i15 = -1;
                        break;
                    } else {
                        if (((m1) ((ArrayList) f2Var.f39410c).get(i15)).f4825a >= i14) {
                            break;
                            break;
                        }
                        i15++;
                    }
                }
                if (i15 != -1) {
                    m1 m1Var3 = (m1) ((ArrayList) f2Var.f39410c).get(i15);
                    ((ArrayList) f2Var.f39410c).remove(i15);
                    i16 = m1Var3.f4825a;
                } else {
                    i16 = -1;
                }
            } else {
                i16 = -1;
            }
            if (i16 == -1) {
                int[] iArr3 = (int[]) f2Var.f39409b;
                Arrays.fill(iArr3, i14, iArr3.length, -1);
                int length2 = ((int[]) f2Var.f39409b).length;
            } else {
                Arrays.fill((int[]) f2Var.f39409b, i14, i16 + 1, -1);
            }
        }
        if (i12 != 1) {
            f2Var.s(i10, i11);
        } else if (i12 != 2) {
            f2Var.t(i10, i11);
        } else if (i12 == 8) {
            f2Var.t(i10, 1);
            f2Var.s(i11, 1);
        }
        if (i13 <= iC1) {
            return;
        }
        if (this.f4698x) {
            iC0 = B0();
        } else {
            iC0 = C0();
        }
        if (i14 <= iC0) {
            f0();
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean G() {
        return this.C != 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fe A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x002c A[SYNTHETIC] */
    public final View G0() {
        boolean z10;
        boolean z11;
        int iV = v();
        int i10 = iV - 1;
        BitSet bitSet = new BitSet(this.f4690p);
        bitSet.set(0, this.f4690p, true);
        byte b10 = (this.f4694t == 1 && H0()) ? (byte) 1 : (byte) -1;
        if (this.f4698x) {
            iV = -1;
        } else {
            i10 = 0;
        }
        int i11 = i10 < iV ? 1 : -1;
        while (i10 != iV) {
            View viewU = u(i10);
            l1 l1Var = (l1) viewU.getLayoutParams();
            if (bitSet.get(l1Var.f4821e.f4854f)) {
                o1 o1Var = l1Var.f4821e;
                if (this.f4698x) {
                    int i12 = o1Var.f4852d;
                    if (i12 == Integer.MIN_VALUE) {
                        o1Var.a();
                        i12 = o1Var.f4852d;
                    }
                    if (i12 < this.f4692r.g()) {
                        ((l1) ((View) l1.d.d((ArrayList) o1Var.f4850b, 1)).getLayoutParams()).getClass();
                        return viewU;
                    }
                } else {
                    int i13 = o1Var.f4851c;
                    ArrayList arrayList = (ArrayList) o1Var.f4850b;
                    if (i13 == Integer.MIN_VALUE) {
                        View view = (View) arrayList.get(0);
                        l1 l1Var2 = (l1) view.getLayoutParams();
                        o1Var.f4851c = ((StaggeredGridLayoutManager) o1Var.f4855g).f4692r.e(view);
                        l1Var2.getClass();
                        i13 = o1Var.f4851c;
                    }
                    if (i13 > this.f4692r.k()) {
                        ((l1) ((View) arrayList.get(0)).getLayoutParams()).getClass();
                        return viewU;
                    }
                }
                bitSet.clear(l1Var.f4821e.f4854f);
            }
            i10 += i11;
            if (i10 != iV) {
                View viewU2 = u(i10);
                if (this.f4698x) {
                    int iB = this.f4692r.b(viewU);
                    int iB2 = this.f4692r.b(viewU2);
                    if (iB >= iB2) {
                        if (iB == iB2) {
                            if (l1Var.f4821e.f4854f - ((l1) viewU2.getLayoutParams()).f4821e.f4854f < 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (b10 < 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10 != z11) {
                            }
                        } else {
                            continue;
                        }
                    }
                    return viewU;
                }
                int iE = this.f4692r.e(viewU);
                int iE2 = this.f4692r.e(viewU2);
                if (iE <= iE2) {
                    if (iE == iE2) {
                        if (l1Var.f4821e.f4854f - ((l1) viewU2.getLayoutParams()).f4821e.f4854f < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (b10 < 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 != z11) {
                        }
                    } else {
                        continue;
                    }
                }
                return viewU;
            }
        }
        return null;
    }

    public final boolean H0() {
        RecyclerView recyclerView = this.f4906b;
        WeakHashMap weakHashMap = m0.s0.f45746a;
        return recyclerView.getLayoutDirection() == 1;
    }

    public final void I0(View view, int i10, int i11) {
        RecyclerView recyclerView = this.f4906b;
        Rect rect = this.G;
        if (recyclerView == null) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(recyclerView.getItemDecorInsetsForChild(view));
        }
        l1 l1Var = (l1) view.getLayoutParams();
        int iU0 = U0(i10, ((ViewGroup.MarginLayoutParams) l1Var).leftMargin + rect.left, ((ViewGroup.MarginLayoutParams) l1Var).rightMargin + rect.right);
        int iU1 = U0(i11, ((ViewGroup.MarginLayoutParams) l1Var).topMargin + rect.top, ((ViewGroup.MarginLayoutParams) l1Var).bottomMargin + rect.bottom);
        if (o0(view, iU0, iU1, l1Var)) {
            view.measure(iU0, iU1);
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void J(int i10) {
        super.J(i10);
        for (int i11 = 0; i11 < this.f4690p; i11++) {
            o1 o1Var = this.f4691q[i11];
            int i12 = o1Var.f4851c;
            if (i12 != Integer.MIN_VALUE) {
                o1Var.f4851c = i12 + i10;
            }
            int i13 = o1Var.f4852d;
            if (i13 != Integer.MIN_VALUE) {
                o1Var.f4852d = i13 + i10;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:109:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:131:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:133:0x0209  */
    /* JADX WARN: Code duplicated, block: B:257:0x0421  */
    /* JADX WARN: Code duplicated, block: B:268:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:272:0x01fc A[SYNTHETIC] */
    public final void J0(y0 y0Var, e1 e1Var, boolean z10) {
        boolean z11;
        n1 n1Var;
        int iV;
        int i10;
        int iC;
        int iC2;
        int iV2;
        int i11;
        boolean z12;
        n1 n1Var2 = this.F;
        k1 k1Var = this.H;
        if (!(n1Var2 == null && this.f4700z == -1) && e1Var.b() == 0) {
            a0(y0Var);
            k1Var.a();
            return;
        }
        boolean z13 = k1Var.f4816e;
        StaggeredGridLayoutManager staggeredGridLayoutManager = k1Var.f4818g;
        boolean z14 = (z13 && this.f4700z == -1 && this.F == null) ? false : true;
        f2 f2Var = this.B;
        if (z14) {
            k1Var.a();
            n1 n1Var3 = this.F;
            if (n1Var3 != null) {
                int i12 = n1Var3.f4840c;
                if (i12 > 0) {
                    if (i12 == this.f4690p) {
                        for (int i13 = 0; i13 < this.f4690p; i13++) {
                            this.f4691q[i13].b();
                            n1 n1Var4 = this.F;
                            int iG = n1Var4.f4841d[i13];
                            if (iG != Integer.MIN_VALUE) {
                                iG += n1Var4.f4846i ? this.f4692r.g() : this.f4692r.k();
                            }
                            o1 o1Var = this.f4691q[i13];
                            o1Var.f4851c = iG;
                            o1Var.f4852d = iG;
                        }
                    } else {
                        n1Var3.f4841d = null;
                        n1Var3.f4840c = 0;
                        n1Var3.f4842e = 0;
                        n1Var3.f4843f = null;
                        n1Var3.f4844g = null;
                        n1Var3.f4838a = n1Var3.f4839b;
                    }
                }
                n1 n1Var5 = this.F;
                this.E = n1Var5.f4847j;
                boolean z15 = n1Var5.f4845h;
                c(null);
                n1 n1Var6 = this.F;
                if (n1Var6 != null && n1Var6.f4845h != z15) {
                    n1Var6.f4845h = z15;
                }
                this.f4697w = z15;
                f0();
                P0();
                n1 n1Var7 = this.F;
                int i14 = n1Var7.f4838a;
                if (i14 != -1) {
                    this.f4700z = i14;
                    k1Var.f4814c = n1Var7.f4846i;
                } else {
                    k1Var.f4814c = this.f4698x;
                }
                if (n1Var7.f4842e > 1) {
                    f2Var.f39409b = n1Var7.f4843f;
                    f2Var.f39410c = n1Var7.f4844g;
                }
            } else {
                P0();
                k1Var.f4814c = this.f4698x;
            }
            if (e1Var.f4755g || (i11 = this.f4700z) == -1) {
                if (this.D) {
                    int iB = e1Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iC2 = 0;
                            break;
                        }
                        iC2 = r0.C(u(iV2));
                        if (iC2 < 0 && iC2 < iB) {
                            break;
                        } else {
                            iV2--;
                        }
                    }
                } else {
                    int iB2 = e1Var.b();
                    iV = v();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iV) {
                            iC2 = 0;
                            break;
                        }
                        iC = r0.C(u(i10));
                        if (iC < 0 && iC < iB2) {
                            iC2 = iC;
                            break;
                        }
                        i10++;
                    }
                }
                k1Var.f4812a = iC2;
                k1Var.f4813b = Integer.MIN_VALUE;
            } else if (i11 < 0 || i11 >= e1Var.b()) {
                this.f4700z = -1;
                this.A = Integer.MIN_VALUE;
                if (this.D) {
                    int iB3 = e1Var.b();
                    iV2 = v() - 1;
                    while (true) {
                        if (iV2 < 0) {
                            iC2 = 0;
                            break;
                        } else {
                            iC2 = r0.C(u(iV2));
                            if (iC2 < 0) {
                            }
                            iV2--;
                        }
                    }
                } else {
                    int iB4 = e1Var.b();
                    iV = v();
                    i10 = 0;
                    while (true) {
                        if (i10 >= iV) {
                            iC2 = 0;
                            break;
                        } else {
                            iC = r0.C(u(i10));
                            if (iC < 0) {
                            }
                            i10++;
                        }
                    }
                }
                k1Var.f4812a = iC2;
                k1Var.f4813b = Integer.MIN_VALUE;
            } else {
                n1 n1Var8 = this.F;
                if (n1Var8 == null || n1Var8.f4838a == -1 || n1Var8.f4840c < 1) {
                    View viewQ = q(this.f4700z);
                    if (viewQ != null) {
                        k1Var.f4812a = this.f4698x ? C0() : B0();
                        if (this.A != Integer.MIN_VALUE) {
                            if (k1Var.f4814c) {
                                k1Var.f4813b = (this.f4692r.g() - this.A) - this.f4692r.b(viewQ);
                            } else {
                                k1Var.f4813b = (this.f4692r.k() + this.A) - this.f4692r.e(viewQ);
                            }
                        } else if (this.f4692r.c(viewQ) > this.f4692r.l()) {
                            k1Var.f4813b = k1Var.f4814c ? this.f4692r.g() : this.f4692r.k();
                        } else {
                            int iE = this.f4692r.e(viewQ) - this.f4692r.k();
                            if (iE < 0) {
                                k1Var.f4813b = -iE;
                            } else {
                                int iG2 = this.f4692r.g() - this.f4692r.b(viewQ);
                                if (iG2 < 0) {
                                    k1Var.f4813b = iG2;
                                } else {
                                    k1Var.f4813b = Integer.MIN_VALUE;
                                }
                            }
                        }
                    } else {
                        int i15 = this.f4700z;
                        k1Var.f4812a = i15;
                        int i16 = this.A;
                        if (i16 == Integer.MIN_VALUE) {
                            if (v() != 0) {
                                if ((i15 < B0()) != this.f4698x) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                            } else if (this.f4698x) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            k1Var.f4814c = z12;
                            k1Var.f4813b = z12 ? staggeredGridLayoutManager.f4692r.g() : staggeredGridLayoutManager.f4692r.k();
                        } else if (k1Var.f4814c) {
                            k1Var.f4813b = staggeredGridLayoutManager.f4692r.g() - i16;
                        } else {
                            k1Var.f4813b = staggeredGridLayoutManager.f4692r.k() + i16;
                        }
                        k1Var.f4815d = true;
                    }
                } else {
                    k1Var.f4813b = Integer.MIN_VALUE;
                    k1Var.f4812a = this.f4700z;
                }
            }
            k1Var.f4816e = true;
        }
        if (this.F == null && this.f4700z == -1 && (k1Var.f4814c != this.D || H0() != this.E)) {
            int[] iArr = (int[]) f2Var.f39409b;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            f2Var.f39410c = null;
            k1Var.f4815d = true;
        }
        if (v() > 0 && ((n1Var = this.F) == null || n1Var.f4840c < 1)) {
            if (k1Var.f4815d) {
                for (int i17 = 0; i17 < this.f4690p; i17++) {
                    this.f4691q[i17].b();
                    int i18 = k1Var.f4813b;
                    if (i18 != Integer.MIN_VALUE) {
                        o1 o1Var2 = this.f4691q[i17];
                        o1Var2.f4851c = i18;
                        o1Var2.f4852d = i18;
                    }
                }
            } else if (z14 || k1Var.f4817f == null) {
                for (int i19 = 0; i19 < this.f4690p; i19++) {
                    o1 o1Var3 = this.f4691q[i19];
                    boolean z16 = this.f4698x;
                    int i20 = k1Var.f4813b;
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = (StaggeredGridLayoutManager) o1Var3.f4855g;
                    int iH = z16 ? o1Var3.h(Integer.MIN_VALUE) : o1Var3.j(Integer.MIN_VALUE);
                    o1Var3.b();
                    if (iH != Integer.MIN_VALUE && ((!z16 || iH >= staggeredGridLayoutManager2.f4692r.g()) && (z16 || iH <= staggeredGridLayoutManager2.f4692r.k()))) {
                        if (i20 != Integer.MIN_VALUE) {
                            iH += i20;
                        }
                        o1Var3.f4852d = iH;
                        o1Var3.f4851c = iH;
                    }
                }
                o1[] o1VarArr = this.f4691q;
                int length = o1VarArr.length;
                int[] iArr2 = k1Var.f4817f;
                if (iArr2 == null || iArr2.length < length) {
                    k1Var.f4817f = new int[staggeredGridLayoutManager.f4691q.length];
                }
                for (int i21 = 0; i21 < length; i21++) {
                    k1Var.f4817f[i21] = o1VarArr[i21].j(Integer.MIN_VALUE);
                }
            } else {
                for (int i22 = 0; i22 < this.f4690p; i22++) {
                    o1 o1Var4 = this.f4691q[i22];
                    o1Var4.b();
                    int i23 = k1Var.f4817f[i22];
                    o1Var4.f4851c = i23;
                    o1Var4.f4852d = i23;
                }
            }
        }
        p(y0Var);
        v vVar = this.f4696v;
        vVar.f4934a = false;
        int iL = this.f4693s.l();
        this.f4695u = iL / this.f4690p;
        View.MeasureSpec.makeMeasureSpec(iL, this.f4693s.i());
        S0(k1Var.f4812a, e1Var);
        if (k1Var.f4814c) {
            R0(-1);
            w0(y0Var, vVar, e1Var);
            R0(1);
            vVar.f4936c = k1Var.f4812a + vVar.f4937d;
            w0(y0Var, vVar, e1Var);
        } else {
            R0(1);
            w0(y0Var, vVar, e1Var);
            R0(-1);
            vVar.f4936c = k1Var.f4812a + vVar.f4937d;
            w0(y0Var, vVar, e1Var);
        }
        if (this.f4693s.i() != 1073741824) {
            int iV3 = v();
            float fMax = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (int i24 = 0; i24 < iV3; i24++) {
                View viewU = u(i24);
                float fC = this.f4693s.c(viewU);
                if (fC >= fMax) {
                    ((l1) viewU.getLayoutParams()).getClass();
                    fMax = Math.max(fMax, fC);
                }
            }
            int i25 = this.f4695u;
            int iRound = Math.round(fMax * this.f4690p);
            if (this.f4693s.i() == Integer.MIN_VALUE) {
                iRound = Math.min(iRound, this.f4693s.l());
            }
            this.f4695u = iRound / this.f4690p;
            View.MeasureSpec.makeMeasureSpec(iRound, this.f4693s.i());
            if (this.f4695u != i25) {
                for (int i26 = 0; i26 < iV3; i26++) {
                    View viewU2 = u(i26);
                    l1 l1Var = (l1) viewU2.getLayoutParams();
                    l1Var.getClass();
                    if (H0() && this.f4694t == 1) {
                        int i27 = -((this.f4690p - 1) - l1Var.f4821e.f4854f);
                        viewU2.offsetLeftAndRight((this.f4695u * i27) - (i27 * i25));
                    } else {
                        int i28 = l1Var.f4821e.f4854f;
                        int i29 = this.f4695u * i28;
                        int i30 = i28 * i25;
                        if (this.f4694t == 1) {
                            viewU2.offsetLeftAndRight(i29 - i30);
                        } else {
                            viewU2.offsetTopAndBottom(i29 - i30);
                        }
                    }
                }
            }
        }
        if (v() > 0) {
            if (this.f4698x) {
                z0(y0Var, e1Var, true);
                A0(y0Var, e1Var, false);
            } else {
                A0(y0Var, e1Var, true);
                z0(y0Var, e1Var, false);
            }
        }
        if (z10 && !e1Var.f4755g && this.C != 0 && v() > 0 && G0() != null) {
            RecyclerView recyclerView = this.f4906b;
            if (recyclerView != null) {
                recyclerView.removeCallbacks(this.K);
            }
            z11 = u0();
        }
        if (e1Var.f4755g) {
            k1Var.a();
        }
        this.D = k1Var.f4814c;
        this.E = H0();
        if (z11) {
            k1Var.a();
            J0(y0Var, e1Var, false);
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void K(int i10) {
        super.K(i10);
        for (int i11 = 0; i11 < this.f4690p; i11++) {
            o1 o1Var = this.f4691q[i11];
            int i12 = o1Var.f4851c;
            if (i12 != Integer.MIN_VALUE) {
                o1Var.f4851c = i12 + i10;
            }
            int i13 = o1Var.f4852d;
            if (i13 != Integer.MIN_VALUE) {
                o1Var.f4852d = i13 + i10;
            }
        }
    }

    public final boolean K0(int i10) {
        if (this.f4694t == 0) {
            return (i10 == -1) != this.f4698x;
        }
        return ((i10 == -1) == this.f4698x) == H0();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void L(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f4906b;
        if (recyclerView2 != null) {
            recyclerView2.removeCallbacks(this.K);
        }
        for (int i10 = 0; i10 < this.f4690p; i10++) {
            this.f4691q[i10].b();
        }
        recyclerView.requestLayout();
    }

    public final void L0(int i10, e1 e1Var) {
        int iB0;
        int i11;
        if (i10 > 0) {
            iB0 = C0();
            i11 = 1;
        } else {
            iB0 = B0();
            i11 = -1;
        }
        v vVar = this.f4696v;
        vVar.f4934a = true;
        S0(iB0, e1Var);
        R0(i11);
        vVar.f4936c = iB0 + vVar.f4937d;
        vVar.f4935b = Math.abs(i10);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0046  */
    /* JADX WARN: Code duplicated, block: B:37:0x0051  */
    @Override // androidx.recyclerview.widget.r0
    public final View M(View view, int i10, y0 y0Var, e1 e1Var) {
        View viewFindContainingItemView;
        int i11;
        if (v() != 0) {
            RecyclerView recyclerView = this.f4906b;
            if (recyclerView == null || (viewFindContainingItemView = recyclerView.findContainingItemView(view)) == null || this.f4905a.f4742c.contains(viewFindContainingItemView)) {
                viewFindContainingItemView = null;
            }
            if (viewFindContainingItemView != null) {
                P0();
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 17) {
                            if (i10 != 33) {
                                if (i10 == 66 ? this.f4694t == 0 : !(i10 != 130 || this.f4694t != 1)) {
                                    i11 = 1;
                                }
                            } else if (this.f4694t == 1) {
                                i11 = -1;
                            }
                            i11 = Integer.MIN_VALUE;
                        } else if (this.f4694t == 0) {
                            i11 = -1;
                        } else {
                            i11 = Integer.MIN_VALUE;
                        }
                    } else if (this.f4694t != 1 && H0()) {
                        i11 = -1;
                    } else {
                        i11 = 1;
                    }
                } else if (this.f4694t != 1 && H0()) {
                    i11 = 1;
                } else {
                    i11 = -1;
                }
                if (i11 != Integer.MIN_VALUE) {
                    l1 l1Var = (l1) viewFindContainingItemView.getLayoutParams();
                    l1Var.getClass();
                    o1 o1Var = l1Var.f4821e;
                    int iC0 = i11 == 1 ? C0() : B0();
                    S0(iC0, e1Var);
                    R0(i11);
                    v vVar = this.f4696v;
                    vVar.f4936c = vVar.f4937d + iC0;
                    vVar.f4935b = (int) (this.f4692r.l() * 0.33333334f);
                    vVar.f4941h = true;
                    vVar.f4934a = false;
                    w0(y0Var, vVar, e1Var);
                    this.D = this.f4698x;
                    View viewI = o1Var.i(iC0, i11);
                    if (viewI != null && viewI != viewFindContainingItemView) {
                        return viewI;
                    }
                    if (K0(i11)) {
                        for (int i12 = this.f4690p - 1; i12 >= 0; i12--) {
                            View viewI2 = this.f4691q[i12].i(iC0, i11);
                            if (viewI2 != null && viewI2 != viewFindContainingItemView) {
                                return viewI2;
                            }
                        }
                    } else {
                        for (int i13 = 0; i13 < this.f4690p; i13++) {
                            View viewI3 = this.f4691q[i13].i(iC0, i11);
                            if (viewI3 != null && viewI3 != viewFindContainingItemView) {
                                return viewI3;
                            }
                        }
                    }
                    boolean z10 = (this.f4697w ^ true) == (i11 == -1);
                    View viewQ = q(z10 ? o1Var.d() : o1Var.e());
                    if (viewQ != null && viewQ != viewFindContainingItemView) {
                        return viewQ;
                    }
                    if (K0(i11)) {
                        for (int i14 = this.f4690p - 1; i14 >= 0; i14--) {
                            if (i14 != o1Var.f4854f) {
                                View viewQ2 = q(z10 ? this.f4691q[i14].d() : this.f4691q[i14].e());
                                if (viewQ2 != null && viewQ2 != viewFindContainingItemView) {
                                    return viewQ2;
                                }
                            }
                        }
                    } else {
                        for (int i15 = 0; i15 < this.f4690p; i15++) {
                            View viewQ3 = q(z10 ? this.f4691q[i15].d() : this.f4691q[i15].e());
                            if (viewQ3 != null && viewQ3 != viewFindContainingItemView) {
                                return viewQ3;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final void M0(y0 y0Var, v vVar) {
        int iMin;
        if (!vVar.f4934a || vVar.f4942i) {
            return;
        }
        if (vVar.f4935b == 0) {
            if (vVar.f4938e == -1) {
                N0(y0Var, vVar.f4940g);
                return;
            } else {
                O0(y0Var, vVar.f4939f);
                return;
            }
        }
        int i10 = 1;
        if (vVar.f4938e == -1) {
            int i11 = vVar.f4939f;
            int iJ = this.f4691q[0].j(i11);
            while (i10 < this.f4690p) {
                int iJ2 = this.f4691q[i10].j(i11);
                if (iJ2 > iJ) {
                    iJ = iJ2;
                }
                i10++;
            }
            int i12 = i11 - iJ;
            N0(y0Var, i12 < 0 ? vVar.f4940g : vVar.f4940g - Math.min(i12, vVar.f4935b));
            return;
        }
        int i13 = vVar.f4940g;
        int iH = this.f4691q[0].h(i13);
        while (i10 < this.f4690p) {
            int iH2 = this.f4691q[i10].h(i13);
            if (iH2 < iH) {
                iH = iH2;
            }
            i10++;
        }
        int i14 = iH - vVar.f4940g;
        if (i14 < 0) {
            iMin = vVar.f4939f;
        } else {
            iMin = Math.min(i14, vVar.f4935b) + vVar.f4939f;
        }
        O0(y0Var, iMin);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void N(AccessibilityEvent accessibilityEvent) {
        super.N(accessibilityEvent);
        if (v() > 0) {
            View viewY0 = y0(false);
            View viewX0 = x0(false);
            if (viewY0 == null || viewX0 == null) {
                return;
            }
            int iC = r0.C(viewY0);
            int iC2 = r0.C(viewX0);
            if (iC < iC2) {
                accessibilityEvent.setFromIndex(iC);
                accessibilityEvent.setToIndex(iC2);
            } else {
                accessibilityEvent.setFromIndex(iC2);
                accessibilityEvent.setToIndex(iC);
            }
        }
    }

    public final void N0(y0 y0Var, int i10) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            if (this.f4692r.e(viewU) < i10 || this.f4692r.n(viewU) < i10) {
                return;
            }
            l1 l1Var = (l1) viewU.getLayoutParams();
            l1Var.getClass();
            if (((ArrayList) l1Var.f4821e.f4850b).size() == 1) {
                return;
            }
            o1 o1Var = l1Var.f4821e;
            ArrayList arrayList = (ArrayList) o1Var.f4850b;
            int size = arrayList.size();
            View view = (View) arrayList.remove(size - 1);
            l1 l1Var2 = (l1) view.getLayoutParams();
            l1Var2.f4821e = null;
            if (l1Var2.f4925a.isRemoved() || l1Var2.f4925a.isUpdated()) {
                o1Var.f4853e -= ((StaggeredGridLayoutManager) o1Var.f4855g).f4692r.c(view);
            }
            if (size == 1) {
                o1Var.f4851c = Integer.MIN_VALUE;
            }
            o1Var.f4852d = Integer.MIN_VALUE;
            c0(viewU, y0Var);
        }
    }

    public final void O0(y0 y0Var, int i10) {
        while (v() > 0) {
            View viewU = u(0);
            if (this.f4692r.b(viewU) > i10 || this.f4692r.m(viewU) > i10) {
                return;
            }
            l1 l1Var = (l1) viewU.getLayoutParams();
            l1Var.getClass();
            if (((ArrayList) l1Var.f4821e.f4850b).size() == 1) {
                return;
            }
            o1 o1Var = l1Var.f4821e;
            ArrayList arrayList = (ArrayList) o1Var.f4850b;
            View view = (View) arrayList.remove(0);
            l1 l1Var2 = (l1) view.getLayoutParams();
            l1Var2.f4821e = null;
            if (arrayList.size() == 0) {
                o1Var.f4852d = Integer.MIN_VALUE;
            }
            if (l1Var2.f4925a.isRemoved() || l1Var2.f4925a.isUpdated()) {
                o1Var.f4853e -= ((StaggeredGridLayoutManager) o1Var.f4855g).f4692r.c(view);
            }
            o1Var.f4851c = Integer.MIN_VALUE;
            c0(viewU, y0Var);
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void P(y0 y0Var, e1 e1Var, View view, n0.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f46334a;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof l1)) {
            O(view, eVar);
            return;
        }
        l1 l1Var = (l1) layoutParams;
        if (this.f4694t == 0) {
            o1 o1Var = l1Var.f4821e;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(o1Var != null ? o1Var.f4854f : -1, 1, -1, -1, false, false));
        } else {
            o1 o1Var2 = l1Var.f4821e;
            accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(-1, -1, o1Var2 != null ? o1Var2.f4854f : -1, 1, false, false));
        }
    }

    public final void P0() {
        if (this.f4694t == 1 || !H0()) {
            this.f4698x = this.f4697w;
        } else {
            this.f4698x = !this.f4697w;
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void Q(int i10, int i11) {
        F0(i10, i11, 1);
    }

    public final int Q0(int i10, y0 y0Var, e1 e1Var) {
        if (v() == 0 || i10 == 0) {
            return 0;
        }
        L0(i10, e1Var);
        v vVar = this.f4696v;
        int iW0 = w0(y0Var, vVar, e1Var);
        if (vVar.f4935b >= iW0) {
            i10 = i10 < 0 ? -iW0 : iW0;
        }
        this.f4692r.o(-i10);
        this.D = this.f4698x;
        vVar.f4935b = 0;
        M0(y0Var, vVar);
        return i10;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void R() {
        f2 f2Var = this.B;
        int[] iArr = (int[]) f2Var.f39409b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        f2Var.f39410c = null;
        f0();
    }

    public final void R0(int i10) {
        v vVar = this.f4696v;
        vVar.f4938e = i10;
        vVar.f4937d = this.f4698x != (i10 == -1) ? -1 : 1;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void S(int i10, int i11) {
        F0(i10, i11, 8);
    }

    public final void S0(int i10, e1 e1Var) {
        int iL;
        int iL2;
        int i11;
        v vVar = this.f4696v;
        boolean z10 = false;
        vVar.f4935b = 0;
        vVar.f4936c = i10;
        a0 a0Var = this.f4909e;
        if (a0Var == null || !a0Var.f4709e || (i11 = e1Var.f4749a) == -1) {
            iL = 0;
            iL2 = 0;
        } else {
            if (this.f4698x == (i11 < i10)) {
                iL = this.f4692r.l();
                iL2 = 0;
            } else {
                iL2 = this.f4692r.l();
                iL = 0;
            }
        }
        RecyclerView recyclerView = this.f4906b;
        if (recyclerView == null || !recyclerView.mClipToPadding) {
            vVar.f4940g = this.f4692r.f() + iL;
            vVar.f4939f = -iL2;
        } else {
            vVar.f4939f = this.f4692r.k() - iL2;
            vVar.f4940g = this.f4692r.g() + iL;
        }
        vVar.f4941h = false;
        vVar.f4934a = true;
        if (this.f4692r.i() == 0 && this.f4692r.f() == 0) {
            z10 = true;
        }
        vVar.f4942i = z10;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void T(int i10, int i11) {
        F0(i10, i11, 2);
    }

    public final void T0(o1 o1Var, int i10, int i11) {
        int i12 = o1Var.f4853e;
        int i13 = o1Var.f4854f;
        if (i10 != -1) {
            int i14 = o1Var.f4852d;
            if (i14 == Integer.MIN_VALUE) {
                o1Var.a();
                i14 = o1Var.f4852d;
            }
            if (i14 - i12 >= i11) {
                this.f4699y.set(i13, false);
                return;
            }
            return;
        }
        int i15 = o1Var.f4851c;
        if (i15 == Integer.MIN_VALUE) {
            View view = (View) ((ArrayList) o1Var.f4850b).get(0);
            l1 l1Var = (l1) view.getLayoutParams();
            o1Var.f4851c = ((StaggeredGridLayoutManager) o1Var.f4855g).f4692r.e(view);
            l1Var.getClass();
            i15 = o1Var.f4851c;
        }
        if (i15 + i12 <= i11) {
            this.f4699y.set(i13, false);
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void U(int i10, int i11) {
        F0(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void V(y0 y0Var, e1 e1Var) {
        J0(y0Var, e1Var, true);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void W(e1 e1Var) {
        this.f4700z = -1;
        this.A = Integer.MIN_VALUE;
        this.F = null;
        this.H.a();
    }

    @Override // androidx.recyclerview.widget.r0
    public final void X(Parcelable parcelable) {
        if (parcelable instanceof n1) {
            this.F = (n1) parcelable;
            f0();
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final Parcelable Y() {
        int iJ;
        int iK;
        int[] iArr;
        n1 n1Var = this.F;
        if (n1Var != null) {
            n1 n1Var2 = new n1();
            n1Var2.f4840c = n1Var.f4840c;
            n1Var2.f4838a = n1Var.f4838a;
            n1Var2.f4839b = n1Var.f4839b;
            n1Var2.f4841d = n1Var.f4841d;
            n1Var2.f4842e = n1Var.f4842e;
            n1Var2.f4843f = n1Var.f4843f;
            n1Var2.f4845h = n1Var.f4845h;
            n1Var2.f4846i = n1Var.f4846i;
            n1Var2.f4847j = n1Var.f4847j;
            n1Var2.f4844g = n1Var.f4844g;
            return n1Var2;
        }
        n1 n1Var3 = new n1();
        n1Var3.f4845h = this.f4697w;
        n1Var3.f4846i = this.D;
        n1Var3.f4847j = this.E;
        f2 f2Var = this.B;
        if (f2Var == null || (iArr = (int[]) f2Var.f39409b) == null) {
            n1Var3.f4842e = 0;
        } else {
            n1Var3.f4843f = iArr;
            n1Var3.f4842e = iArr.length;
            n1Var3.f4844g = (ArrayList) f2Var.f39410c;
        }
        if (v() <= 0) {
            n1Var3.f4838a = -1;
            n1Var3.f4839b = -1;
            n1Var3.f4840c = 0;
            return n1Var3;
        }
        n1Var3.f4838a = this.D ? C0() : B0();
        View viewX0 = this.f4698x ? x0(true) : y0(true);
        n1Var3.f4839b = viewX0 != null ? r0.C(viewX0) : -1;
        int i10 = this.f4690p;
        n1Var3.f4840c = i10;
        n1Var3.f4841d = new int[i10];
        for (int i11 = 0; i11 < this.f4690p; i11++) {
            if (this.D) {
                iJ = this.f4691q[i11].h(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f4692r.g();
                    iJ -= iK;
                }
            } else {
                iJ = this.f4691q[i11].j(Integer.MIN_VALUE);
                if (iJ != Integer.MIN_VALUE) {
                    iK = this.f4692r.k();
                    iJ -= iK;
                }
            }
            n1Var3.f4841d[i11] = iJ;
        }
        return n1Var3;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void Z(int i10) {
        if (i10 == 0) {
            u0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:6:0x000c  */
    @Override // androidx.recyclerview.widget.d1
    public final PointF a(int i10) {
        int i11 = -1;
        if (v() != 0) {
            if ((i10 < B0()) == this.f4698x) {
                i11 = 1;
            }
        } else if (this.f4698x) {
            i11 = 1;
        }
        PointF pointF = new PointF();
        if (i11 == 0) {
            return null;
        }
        if (this.f4694t == 0) {
            pointF.x = i11;
            pointF.y = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            return pointF;
        }
        pointF.x = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        pointF.y = i11;
        return pointF;
    }

    @Override // androidx.recyclerview.widget.r0
    public final void c(String str) {
        RecyclerView recyclerView;
        if (this.F != null || (recyclerView = this.f4906b) == null) {
            return;
        }
        recyclerView.assertNotInLayoutOrScroll(str);
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean d() {
        return this.f4694t == 0;
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean e() {
        return this.f4694t == 1;
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean f(s0 s0Var) {
        return s0Var instanceof l1;
    }

    @Override // androidx.recyclerview.widget.r0
    public final int g0(int i10, y0 y0Var, e1 e1Var) {
        return Q0(i10, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void h(int i10, int i11, e1 e1Var, q qVar) {
        v vVar;
        int iH;
        int iJ;
        if (this.f4694t != 0) {
            i10 = i11;
        }
        if (v() == 0 || i10 == 0) {
            return;
        }
        L0(i10, e1Var);
        int[] iArr = this.J;
        if (iArr == null || iArr.length < this.f4690p) {
            this.J = new int[this.f4690p];
        }
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f4690p;
            vVar = this.f4696v;
            if (i12 >= i14) {
                break;
            }
            if (vVar.f4937d == -1) {
                iH = vVar.f4939f;
                iJ = this.f4691q[i12].j(iH);
            } else {
                iH = this.f4691q[i12].h(vVar.f4940g);
                iJ = vVar.f4940g;
            }
            int i15 = iH - iJ;
            if (i15 >= 0) {
                this.J[i13] = i15;
                i13++;
            }
            i12++;
        }
        Arrays.sort(this.J, 0, i13);
        for (int i16 = 0; i16 < i13; i16++) {
            int i17 = vVar.f4936c;
            if (i17 < 0 || i17 >= e1Var.b()) {
                return;
            }
            qVar.a(vVar.f4936c, this.J[i16]);
            vVar.f4936c += vVar.f4937d;
        }
    }

    @Override // androidx.recyclerview.widget.r0
    public final void h0(int i10) {
        n1 n1Var = this.F;
        if (n1Var != null && n1Var.f4838a != i10) {
            n1Var.f4841d = null;
            n1Var.f4840c = 0;
            n1Var.f4838a = -1;
            n1Var.f4839b = -1;
        }
        this.f4700z = i10;
        this.A = Integer.MIN_VALUE;
        f0();
    }

    @Override // androidx.recyclerview.widget.r0
    public final int i0(int i10, y0 y0Var, e1 e1Var) {
        return Q0(i10, y0Var, e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int j(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return x7.a.g(e1Var, this.f4692r, y0(z10), x0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int k(e1 e1Var) {
        return v0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int l(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return x7.a.i(e1Var, this.f4692r, y0(z10), x0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void l0(Rect rect, int i10, int i11) {
        int iG;
        int iG2;
        int iA = A() + z();
        int iY = y() + B();
        int i12 = this.f4694t;
        int i13 = this.f4690p;
        if (i12 == 1) {
            int iHeight = rect.height() + iY;
            RecyclerView recyclerView = this.f4906b;
            WeakHashMap weakHashMap = m0.s0.f45746a;
            iG2 = r0.g(i11, iHeight, recyclerView.getMinimumHeight());
            iG = r0.g(i10, (this.f4695u * i13) + iA, this.f4906b.getMinimumWidth());
        } else {
            int iWidth = rect.width() + iA;
            RecyclerView recyclerView2 = this.f4906b;
            WeakHashMap weakHashMap2 = m0.s0.f45746a;
            iG = r0.g(i10, iWidth, recyclerView2.getMinimumWidth());
            iG2 = r0.g(i11, (this.f4695u * i13) + iY, this.f4906b.getMinimumHeight());
        }
        this.f4906b.setMeasuredDimension(iG, iG2);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int m(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return x7.a.g(e1Var, this.f4692r, y0(z10), x0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int n(e1 e1Var) {
        return v0(e1Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final int o(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return x7.a.i(e1Var, this.f4692r, y0(z10), x0(z10), this, this.I);
    }

    @Override // androidx.recyclerview.widget.r0
    public final s0 r() {
        return this.f4694t == 0 ? new l1(-2, -1) : new l1(-1, -2);
    }

    @Override // androidx.recyclerview.widget.r0
    public final void r0(RecyclerView recyclerView, int i10) {
        a0 a0Var = new a0(recyclerView.getContext());
        a0Var.f4705a = i10;
        s0(a0Var);
    }

    @Override // androidx.recyclerview.widget.r0
    public final s0 s(Context context, AttributeSet attributeSet) {
        return new l1(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.r0
    public final s0 t(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new l1((ViewGroup.MarginLayoutParams) layoutParams) : new l1(layoutParams);
    }

    @Override // androidx.recyclerview.widget.r0
    public final boolean t0() {
        return this.F == null;
    }

    public final boolean u0() {
        int iB0;
        if (v() != 0 && this.C != 0 && this.f4911g) {
            if (this.f4698x) {
                iB0 = C0();
                B0();
            } else {
                iB0 = B0();
                C0();
            }
            if (iB0 == 0 && G0() != null) {
                f2 f2Var = this.B;
                int[] iArr = (int[]) f2Var.f39409b;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                f2Var.f39410c = null;
                this.f4910f = true;
                f0();
                return true;
            }
        }
        return false;
    }

    public final int v0(e1 e1Var) {
        if (v() == 0) {
            return 0;
        }
        boolean z10 = !this.I;
        return x7.a.h(e1Var, this.f4692r, y0(z10), x0(z10), this, this.I, this.f4698x);
    }

    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean, int] */
    public final int w0(y0 y0Var, v vVar, e1 e1Var) {
        o1 o1Var;
        ?? r10;
        int iJ;
        int iC;
        int iK;
        int iC2;
        int i10;
        int i11;
        int i12;
        int i13 = 0;
        int i14 = 1;
        this.f4699y.set(0, this.f4690p, true);
        v vVar2 = this.f4696v;
        int i15 = vVar2.f4942i ? vVar.f4938e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : vVar.f4938e == 1 ? vVar.f4940g + vVar.f4935b : vVar.f4939f - vVar.f4935b;
        int i16 = vVar.f4938e;
        for (int i17 = 0; i17 < this.f4690p; i17++) {
            if (!((ArrayList) this.f4691q[i17].f4850b).isEmpty()) {
                T0(this.f4691q[i17], i16, i15);
            }
        }
        int iG = this.f4698x ? this.f4692r.g() : this.f4692r.k();
        boolean z10 = false;
        while (true) {
            int i18 = vVar.f4936c;
            if (i18 < 0 || i18 >= e1Var.b() || (!vVar2.f4942i && this.f4699y.isEmpty())) {
                break;
            }
            View view = y0Var.j(vVar.f4936c, Long.MAX_VALUE).itemView;
            vVar.f4936c += vVar.f4937d;
            l1 l1Var = (l1) view.getLayoutParams();
            int layoutPosition = l1Var.f4925a.getLayoutPosition();
            f2 f2Var = this.B;
            int[] iArr = (int[]) f2Var.f39409b;
            int i19 = (iArr == null || layoutPosition >= iArr.length) ? -1 : iArr[layoutPosition];
            if (i19 == -1) {
                if (K0(vVar.f4938e)) {
                    i12 = this.f4690p - i14;
                    i11 = -1;
                    i10 = -1;
                } else {
                    i10 = i14;
                    i11 = this.f4690p;
                    i12 = i13;
                }
                o1 o1Var2 = null;
                if (vVar.f4938e == i14) {
                    int iK2 = this.f4692r.k();
                    int i20 = Integer.MAX_VALUE;
                    while (i12 != i11) {
                        o1 o1Var3 = this.f4691q[i12];
                        int iH = o1Var3.h(iK2);
                        if (iH < i20) {
                            i20 = iH;
                            o1Var2 = o1Var3;
                        }
                        i12 += i10;
                    }
                } else {
                    int iG2 = this.f4692r.g();
                    int i21 = Integer.MIN_VALUE;
                    while (i12 != i11) {
                        o1 o1Var4 = this.f4691q[i12];
                        int iJ2 = o1Var4.j(iG2);
                        if (iJ2 > i21) {
                            o1Var2 = o1Var4;
                            i21 = iJ2;
                        }
                        i12 += i10;
                    }
                }
                o1Var = o1Var2;
                f2Var.k(layoutPosition);
                ((int[]) f2Var.f39409b)[layoutPosition] = o1Var.f4854f;
            } else {
                o1Var = this.f4691q[i19];
            }
            l1Var.f4821e = o1Var;
            if (vVar.f4938e == 1) {
                r10 = 0;
                b(view, -1, false);
            } else {
                r10 = 0;
                b(view, 0, false);
            }
            if (this.f4694t == 1) {
                I0(view, r0.w(this.f4695u, this.l, r10, ((ViewGroup.MarginLayoutParams) l1Var).width, r10), r0.w(this.f4918o, this.f4916m, y() + B(), ((ViewGroup.MarginLayoutParams) l1Var).height, true));
            } else {
                I0(view, r0.w(this.f4917n, this.l, A() + z(), ((ViewGroup.MarginLayoutParams) l1Var).width, true), r0.w(this.f4695u, this.f4916m, 0, ((ViewGroup.MarginLayoutParams) l1Var).height, false));
            }
            if (vVar.f4938e == 1) {
                iC = o1Var.h(iG);
                iJ = this.f4692r.c(view) + iC;
            } else {
                iJ = o1Var.j(iG);
                iC = iJ - this.f4692r.c(view);
            }
            if (vVar.f4938e == 1) {
                o1 o1Var5 = l1Var.f4821e;
                o1Var5.getClass();
                l1 l1Var2 = (l1) view.getLayoutParams();
                l1Var2.f4821e = o1Var5;
                ArrayList arrayList = (ArrayList) o1Var5.f4850b;
                arrayList.add(view);
                o1Var5.f4852d = Integer.MIN_VALUE;
                if (arrayList.size() == 1) {
                    o1Var5.f4851c = Integer.MIN_VALUE;
                }
                if (l1Var2.f4925a.isRemoved() || l1Var2.f4925a.isUpdated()) {
                    o1Var5.f4853e = ((StaggeredGridLayoutManager) o1Var5.f4855g).f4692r.c(view) + o1Var5.f4853e;
                }
            } else {
                o1 o1Var6 = l1Var.f4821e;
                o1Var6.getClass();
                l1 l1Var3 = (l1) view.getLayoutParams();
                l1Var3.f4821e = o1Var6;
                ArrayList arrayList2 = (ArrayList) o1Var6.f4850b;
                arrayList2.add(0, view);
                o1Var6.f4851c = Integer.MIN_VALUE;
                if (arrayList2.size() == 1) {
                    o1Var6.f4852d = Integer.MIN_VALUE;
                }
                if (l1Var3.f4925a.isRemoved() || l1Var3.f4925a.isUpdated()) {
                    o1Var6.f4853e = ((StaggeredGridLayoutManager) o1Var6.f4855g).f4692r.c(view) + o1Var6.f4853e;
                }
            }
            if (H0() && this.f4694t == 1) {
                iC2 = this.f4693s.g() - (((this.f4690p - 1) - o1Var.f4854f) * this.f4695u);
                iK = iC2 - this.f4693s.c(view);
            } else {
                iK = this.f4693s.k() + (o1Var.f4854f * this.f4695u);
                iC2 = this.f4693s.c(view) + iK;
            }
            if (this.f4694t == 1) {
                r0.I(view, iK, iC, iC2, iJ);
            } else {
                r0.I(view, iC, iK, iJ, iC2);
            }
            T0(o1Var, vVar2.f4938e, i15);
            M0(y0Var, vVar2);
            if (vVar2.f4941h && view.hasFocusable()) {
                this.f4699y.set(o1Var.f4854f, false);
            }
            i14 = 1;
            z10 = true;
            i13 = 0;
        }
        if (!z10) {
            M0(y0Var, vVar2);
        }
        int iK3 = vVar2.f4938e == -1 ? this.f4692r.k() - E0(this.f4692r.k()) : D0(this.f4692r.g()) - this.f4692r.g();
        if (iK3 > 0) {
            return Math.min(vVar.f4935b, iK3);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.r0
    public final int x(y0 y0Var, e1 e1Var) {
        return this.f4694t == 1 ? this.f4690p : super.x(y0Var, e1Var);
    }

    public final View x0(boolean z10) {
        int iK = this.f4692r.k();
        int iG = this.f4692r.g();
        View view = null;
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            int iE = this.f4692r.e(viewU);
            int iB = this.f4692r.b(viewU);
            if (iB > iK && iE < iG) {
                if (iB <= iG || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final View y0(boolean z10) {
        int iK = this.f4692r.k();
        int iG = this.f4692r.g();
        int iV = v();
        View view = null;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            int iE = this.f4692r.e(viewU);
            if (this.f4692r.b(viewU) > iK && iE < iG) {
                if (iE >= iK || !z10) {
                    return viewU;
                }
                if (view == null) {
                    view = viewU;
                }
            }
        }
        return view;
    }

    public final void z0(y0 y0Var, e1 e1Var, boolean z10) {
        int iG;
        int iD0 = D0(Integer.MIN_VALUE);
        if (iD0 != Integer.MIN_VALUE && (iG = this.f4692r.g() - iD0) > 0) {
            int i10 = iG - (-Q0(-iG, y0Var, e1Var));
            if (!z10 || i10 <= 0) {
                return;
            }
            this.f4692r.o(i10);
        }
    }
}
