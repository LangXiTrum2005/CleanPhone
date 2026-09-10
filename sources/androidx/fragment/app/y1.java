package androidx.fragment.app;

import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.ads.lw;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y1 {
    public static void d(List list, View view) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (list.get(i10) == view) {
                return;
            }
        }
        WeakHashMap weakHashMap = m0.s0.f45746a;
        if (view.getTransitionName() != null) {
            list.add(view);
        }
        for (int i11 = size; i11 < list.size(); i11++) {
            View view2 = (View) list.get(i11);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i12 = 0; i12 < childCount; i12++) {
                    View childAt = viewGroup.getChildAt(i12);
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            if (childAt.getTransitionName() == null) {
                                break;
                            }
                            list.add(childAt);
                            break;
                        } else if (list.get(i13) == childAt) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            }
        }
    }

    public static void g(View view, Rect rect) {
        if (view.isAttachedToWindow()) {
            RectF rectF = new RectF();
            rectF.set(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, view.getWidth(), view.getHeight());
            view.getMatrix().mapRect(rectF);
            rectF.offset(view.getLeft(), view.getTop());
            Object parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                rectF.offset(-view2.getScrollX(), -view2.getScrollY());
                view2.getMatrix().mapRect(rectF);
                rectF.offset(view2.getLeft(), view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            rectF.offset(iArr[0], iArr[1]);
            rect.set(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        }
    }

    public static boolean h(List list) {
        return list == null || list.isEmpty();
    }

    public abstract void a(View view, Object obj);

    public abstract void b(Object obj, ArrayList arrayList);

    public abstract void c(ViewGroup viewGroup, Object obj);

    public abstract boolean e(Object obj);

    public abstract Object f(Object obj);

    public void i() {
        if (g1.J(4)) {
            Log.i("FragmentManager", "Older versions of AndroidX Transition do not support seeking. Add dependency on AndroidX Transition 1.5.0 or higher to enable seeking.");
        }
    }

    public abstract Object j(Object obj, Object obj2, Object obj3);

    public abstract Object k(Object obj, Object obj2);

    public abstract void l(Object obj, View view, ArrayList arrayList);

    public abstract void m(Object obj, Object obj2, ArrayList arrayList, Object obj3, ArrayList arrayList2);

    public abstract void n(View view, Object obj);

    public abstract void o(Object obj, Rect rect);

    public abstract void p(Object obj, lw lwVar, Runnable runnable);

    public abstract void q(Object obj, View view, ArrayList arrayList);

    public abstract void r(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract Object s(Object obj);
}
