package o4;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.uz1;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends r {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f47124w = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f47125v;

    public i(int i10) {
        this.f47125v = i10;
    }

    public static void G(x xVar) {
        View view = xVar.f47174b;
        int visibility = view.getVisibility();
        HashMap map = xVar.f47173a;
        map.put("android:visibility:visibility", Integer.valueOf(visibility));
        map.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        map.put("android:visibility:screenLocation", iArr);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0052  */
    /* JADX WARN: Code duplicated, block: B:7:0x002f  */
    public static uz1 I(x xVar, x xVar2) {
        uz1 uz1Var = new uz1();
        uz1Var.f20968a = false;
        uz1Var.f20969b = false;
        if (xVar != null) {
            HashMap map = xVar.f47173a;
            if (map.containsKey("android:visibility:visibility")) {
                uz1Var.f20970c = ((Integer) map.get("android:visibility:visibility")).intValue();
                uz1Var.f20972e = (ViewGroup) map.get("android:visibility:parent");
            } else {
                uz1Var.f20970c = -1;
                uz1Var.f20972e = null;
            }
        } else {
            uz1Var.f20970c = -1;
            uz1Var.f20972e = null;
        }
        if (xVar2 != null) {
            HashMap map2 = xVar2.f47173a;
            if (map2.containsKey("android:visibility:visibility")) {
                uz1Var.f20971d = ((Integer) map2.get("android:visibility:visibility")).intValue();
                uz1Var.f20973f = (ViewGroup) map2.get("android:visibility:parent");
            } else {
                uz1Var.f20971d = -1;
                uz1Var.f20973f = null;
            }
        } else {
            uz1Var.f20971d = -1;
            uz1Var.f20973f = null;
        }
        if (xVar != null && xVar2 != null) {
            int i10 = uz1Var.f20970c;
            int i11 = uz1Var.f20971d;
            if (i10 != i11 || ((ViewGroup) uz1Var.f20972e) != ((ViewGroup) uz1Var.f20973f)) {
                if (i10 != i11) {
                    if (i10 == 0) {
                        uz1Var.f20969b = false;
                        uz1Var.f20968a = true;
                        return uz1Var;
                    }
                    if (i11 == 0) {
                        uz1Var.f20969b = true;
                        uz1Var.f20968a = true;
                        return uz1Var;
                    }
                } else {
                    if (((ViewGroup) uz1Var.f20973f) == null) {
                        uz1Var.f20969b = false;
                        uz1Var.f20968a = true;
                        return uz1Var;
                    }
                    if (((ViewGroup) uz1Var.f20972e) == null) {
                        uz1Var.f20969b = true;
                        uz1Var.f20968a = true;
                        return uz1Var;
                    }
                }
            }
        } else {
            if (xVar == null && uz1Var.f20971d == 0) {
                uz1Var.f20969b = true;
                uz1Var.f20968a = true;
                return uz1Var;
            }
            if (xVar2 == null && uz1Var.f20970c == 0) {
                uz1Var.f20969b = false;
                uz1Var.f20968a = true;
            }
        }
        return uz1Var;
    }

    public final ObjectAnimator H(View view, float f10, float f11) {
        if (f10 == f11) {
            return null;
        }
        c cVar = y.f47176a;
        view.setTransitionAlpha(f10);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, y.f47176a, f11);
        objectAnimatorOfFloat.addListener(new androidx.recyclerview.widget.n(view));
        a(new h(view, 0));
        return objectAnimatorOfFloat;
    }

    @Override // o4.r
    public final void d(x xVar) {
        G(xVar);
    }

    @Override // o4.r
    public final void g(x xVar) {
        G(xVar);
        HashMap map = xVar.f47173a;
        View view = xVar.f47174b;
        c cVar = y.f47176a;
        map.put("android:fade:transitionAlpha", Float.valueOf(view.getTransitionAlpha()));
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00be  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:67:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0150  */
    /* JADX WARN: Code duplicated, block: B:69:0x015a  */
    /* JADX WARN: Code duplicated, block: B:70:0x0172  */
    /* JADX WARN: Code duplicated, block: B:73:0x018e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:75:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:84:0x020f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0216  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004d, code lost:
    
        if (I(n(r3, false), q(r3, false)).f20968a != false) goto L9;
     */
    @Override // o4.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r23, o4.x r24, o4.x r25) {
        /*
            Method dump skipped, instruction units count: 715
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o4.i.k(android.view.ViewGroup, o4.x, o4.x):android.animation.Animator");
    }

    @Override // o4.r
    public final String[] p() {
        return f47124w;
    }

    @Override // o4.r
    public final boolean r(x xVar, x xVar2) {
        if (xVar == null && xVar2 == null) {
            return false;
        }
        if (xVar != null && xVar2 != null && xVar2.f47173a.containsKey("android:visibility:visibility") != xVar.f47173a.containsKey("android:visibility:visibility")) {
            return false;
        }
        uz1 uz1VarI = I(xVar, xVar2);
        if (uz1VarI.f20968a) {
            return uz1VarI.f20970c == 0 || uz1VarI.f20971d == 0;
        }
        return false;
    }
}
