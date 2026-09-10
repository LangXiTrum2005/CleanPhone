package o4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.X3;
import java.util.HashMap;
import java.util.WeakHashMap;
import m0.s0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends r {
    public static final c A;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String[] f47117v = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final c f47118w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final c f47119x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f47120y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final c f47121z;

    static {
        new b(PointF.class, "boundsOrigin").f47095a = new Rect();
        f47118w = new c(0, PointF.class, "topLeft");
        f47119x = new c(1, PointF.class, "bottomRight");
        f47120y = new c(2, PointF.class, "bottomRight");
        f47121z = new c(3, PointF.class, "topLeft");
        A = new c(4, PointF.class, X3.i.L);
    }

    public static void G(x xVar) {
        View view = xVar.f47174b;
        HashMap map = xVar.f47173a;
        WeakHashMap weakHashMap = s0.f45746a;
        if (!view.isLaidOut() && view.getWidth() == 0 && view.getHeight() == 0) {
            return;
        }
        map.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
        map.put("android:changeBounds:parent", view.getParent());
    }

    @Override // o4.r
    public final void d(x xVar) {
        G(xVar);
    }

    @Override // o4.r
    public final void g(x xVar) {
        G(xVar);
    }

    @Override // o4.r
    public final Animator k(ViewGroup viewGroup, x xVar, x xVar2) {
        int i10;
        g gVar;
        Animator animatorOfObject;
        if (xVar == null) {
            return null;
        }
        HashMap map = xVar.f47173a;
        if (xVar2 == null) {
            return null;
        }
        HashMap map2 = xVar2.f47173a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = xVar2.f47174b;
        Rect rect = (Rect) map.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) map2.get("android:changeBounds:bounds");
        int i11 = rect.left;
        int i12 = rect2.left;
        int i13 = rect.top;
        int i14 = rect2.top;
        int i15 = rect.right;
        int i16 = rect2.right;
        int i17 = rect.bottom;
        int i18 = rect2.bottom;
        int i19 = i15 - i11;
        int i20 = i17 - i13;
        int i21 = i16 - i12;
        int i22 = i18 - i14;
        Rect rect3 = (Rect) map.get("android:changeBounds:clip");
        Rect rect4 = (Rect) map2.get("android:changeBounds:clip");
        if ((i19 == 0 || i20 == 0) && (i21 == 0 || i22 == 0)) {
            i10 = 0;
        } else {
            i10 = (i11 == i12 && i13 == i14) ? 0 : 1;
            if (i15 != i16 || i17 != i18) {
                i10++;
            }
        }
        if ((rect3 != null && !rect3.equals(rect4)) || (rect3 == null && rect4 != null)) {
            i10++;
        }
        int i23 = i10;
        if (i23 <= 0) {
            return null;
        }
        c cVar = y.f47176a;
        view.setLeftTopRightBottom(i11, i13, i15, i17);
        if (i23 != 2) {
            gVar = this;
            if (i11 == i12 && i13 == i14) {
                gVar.f47160r.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f47120y, (TypeConverter) null, ne.c.l(i15, i17, i16, i18));
            } else {
                gVar.f47160r.getClass();
                animatorOfObject = ObjectAnimator.ofObject(view, f47121z, (TypeConverter) null, ne.c.l(i11, i13, i12, i14));
            }
        } else if (i19 == i21 && i20 == i22) {
            gVar = this;
            gVar.f47160r.getClass();
            animatorOfObject = ObjectAnimator.ofObject(view, A, (TypeConverter) null, ne.c.l(i11, i13, i12, i14));
        } else {
            gVar = this;
            f fVar = new f();
            fVar.f47114e = view;
            gVar.f47160r.getClass();
            ObjectAnimator objectAnimatorOfObject = ObjectAnimator.ofObject(fVar, f47118w, (TypeConverter) null, ne.c.l(i11, i13, i12, i14));
            gVar.f47160r.getClass();
            ObjectAnimator objectAnimatorOfObject2 = ObjectAnimator.ofObject(fVar, f47119x, (TypeConverter) null, ne.c.l(i15, i17, i16, i18));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(objectAnimatorOfObject, objectAnimatorOfObject2);
            animatorSet.addListener(new d(fVar));
            animatorOfObject = animatorSet;
        }
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup4 = (ViewGroup) view.getParent();
            viewGroup4.suppressLayout(true);
            gVar.a(new e(viewGroup4));
        }
        return animatorOfObject;
    }

    @Override // o4.r
    public final String[] p() {
        return f47117v;
    }
}
