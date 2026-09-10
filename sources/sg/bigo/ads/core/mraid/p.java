package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final WeakReference<View> f48722a;
    b d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f48725e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f48727i;
    private WeakReference<ViewTreeObserver> j;
    float f = -1.0f;
    Rect g = new Rect();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f48726h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f48724c = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final a f48723b = new a();

    public class a implements Runnable {
        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0055  */
        @Override // java.lang.Runnable
        public final void run() {
            View view;
            float f;
            b bVar;
            sg.bigo.ads.core.mraid.b bVar2;
            p pVar = p.this;
            boolean z2 = false;
            pVar.f48725e = false;
            if (pVar.d == null || (view = pVar.f48722a.get()) == null) {
                return;
            }
            Rect rect = new Rect();
            view.getLocalVisibleRect(rect);
            Rect rect2 = new Rect();
            boolean globalVisibleRect = view.getGlobalVisibleRect(rect2);
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            boolean zIsShown = view.isShown();
            float f2 = 0.0f;
            boolean z3 = view.getAlpha() == 0.0f;
            List arrayList = new ArrayList();
            if (globalVisibleRect && zIsShown && !z3) {
                Pair pairA = p.a(rect2, view);
                if (((Boolean) pairA.first).booleanValue()) {
                    f = 0.0f;
                } else {
                    m mVar = new m((List) pairA.second, iArr);
                    float fA = mVar.a();
                    float height = view.getHeight() * view.getWidth();
                    float fHeight = rect.height() * rect.width();
                    if (height > 0.0f) {
                        f = ((fHeight - fA) * 100.0f) / height;
                        f2 = (fHeight * 100.0f) / height;
                    } else {
                        f = 0.0f;
                    }
                    arrayList = mVar.f48710a;
                }
            } else {
                f = 0.0f;
            }
            p pVar2 = p.this;
            if (f2 == pVar2.f && rect.equals(pVar2.g)) {
                return;
            }
            p pVar3 = p.this;
            if (pVar3.f48726h) {
                f2 = f;
            }
            pVar3.f = f2;
            pVar3.g = rect;
            DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
            p pVar4 = p.this;
            if (pVar4.f48726h) {
                bVar = pVar4.d;
                if (globalVisibleRect && zIsShown && !z3) {
                    z2 = true;
                }
                bVar2 = new sg.bigo.ads.core.mraid.b(pVar4.f, p.a(pVar4.g, displayMetrics.densityDpi), p.a(arrayList, displayMetrics.densityDpi));
            } else {
                bVar = pVar4.d;
                if (globalVisibleRect && zIsShown && !z3) {
                    z2 = true;
                }
                bVar2 = new sg.bigo.ads.core.mraid.b(pVar4.f, p.a(pVar4.g, displayMetrics.densityDpi), null);
            }
            bVar.a(z2, bVar2);
        }
    }

    public interface b {
        void a(boolean z2, sg.bigo.ads.core.mraid.b bVar);
    }

    public p(View view) {
        this.f48722a = new WeakReference<>(view);
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.p.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                p pVar = p.this;
                if (!pVar.f48725e) {
                    pVar.f48725e = true;
                    pVar.f48724c.postDelayed(pVar.f48723b, 500L);
                }
                return true;
            }
        };
        this.f48727i = onPreDrawListener;
        this.j = new WeakReference<>(null);
        Context context = view.getContext();
        ViewTreeObserver viewTreeObserver = this.j.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View viewA = u.a(context, view);
            if (viewA == null) {
                sg.bigo.ads.common.t.a.a(0, "VisibilityTracker", "Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = viewA.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                sg.bigo.ads.common.t.a.a(0, "VisibilityTracker", "Visibility Tracker was unable to track views because the root view tree observer was not alive");
            } else {
                this.j = new WeakReference<>(viewTreeObserver2);
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener);
            }
        }
    }

    public static Rect a(Rect rect, int i2) {
        return new Rect((rect.left * 160) / i2, (rect.top * 160) / i2, (rect.right * 160) / i2, (rect.bottom * 160) / i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.View, android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r2v2, types: [android.view.View] */
    public static /* synthetic */ Pair a(Rect rect, View view) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        loop0: while (true) {
            ?? r2 = view;
            view = (ViewGroup) view.getParent();
            while (true) {
                if (view == 0) {
                    z2 = false;
                    break loop0;
                }
                z2 = true;
                if (view.getAlpha() == 0.0f) {
                    break loop0;
                }
                for (int iIndexOfChild = view.indexOfChild(r2) + 1; iIndexOfChild < view.getChildCount(); iIndexOfChild++) {
                    View childAt = view.getChildAt(iIndexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        if (Rect.intersects(rect, rect2)) {
                            arrayList.add(new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom)));
                        }
                    }
                }
                if (view != viewGroup) {
                    break;
                }
                view = 0;
            }
        }
        return new Pair(Boolean.valueOf(z2), arrayList);
    }

    public static /* synthetic */ List a(List list, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Rect) it.next(), i2));
        }
        return arrayList;
    }
}
