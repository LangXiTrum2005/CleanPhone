package sg.bigo.ads.common.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    public interface a {
        void a(Rect rect);
    }

    public static Point a(View view, View view2) {
        if (view == null || view2 == null) {
            return new Point();
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i2 = -iArr[0];
        int i3 = -iArr[1];
        view2.getLocationOnScreen(iArr);
        return new Point(i2 + iArr[0], i3 + iArr[1]);
    }

    public static void b(View view) {
        if (view == null || view.getParent() == null) {
            return;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
            return;
        }
        sg.bigo.ads.common.t.a.a(0, "Views", "parent is not a view group, parent:" + view.getParent());
    }

    public static void c(View view, int i2, int i3) {
        if (view == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(i2, i3);
        } else {
            layoutParams.width = i2;
            layoutParams.height = i3;
        }
        view.setLayoutParams(layoutParams);
    }

    public static boolean d(View view) {
        Object parent;
        if (sg.bigo.ads.common.aa.b.b() || view.getWindowVisibility() != 0) {
            return false;
        }
        while (view.getVisibility() == 0 && view.getAlpha() >= 0.9f && (parent = view.getParent()) != null) {
            if (!(parent instanceof View)) {
                return true;
            }
            view = (View) parent;
        }
        return false;
    }

    private static Point e(View view) {
        if (view == null || view.getVisibility() == 8) {
            return new Point();
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static Rect a(View view, int i2) {
        if (view == null || view.getVisibility() == 8) {
            return new Rect();
        }
        Point pointE = e(view);
        int i3 = pointE.x;
        return new Rect(i3 - i2, pointE.y - i2, view.getMeasuredWidth() + i3 + i2, view.getMeasuredHeight() + pointE.y + i2);
    }

    public static boolean b(View view, int i2, int i3) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect.contains(i2 - (iArr[0] - iArr2[0]), i3 - (iArr[1] - iArr2[1]));
    }

    public static boolean c(View view) {
        return view.isAttachedToWindow();
    }

    public static View a(Context context, View view) {
        View viewFindViewById = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        if (view == null) {
            return null;
        }
        if (!c(view)) {
            sg.bigo.ads.common.t.a.b("Views", "Attempting to call View#getRootView() on an unattached View.");
        }
        View rootView = view.getRootView();
        if (rootView == null) {
            return null;
        }
        View viewFindViewById2 = rootView.findViewById(R.id.content);
        return viewFindViewById2 != null ? viewFindViewById2 : rootView;
    }

    public static void a(View view, final View.OnAttachStateChangeListener onAttachStateChangeListener) {
        if (view == null || onAttachStateChangeListener == null) {
            return;
        }
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.common.utils.u.3
            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view2) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
                if (onAttachStateChangeListener2 != null) {
                    onAttachStateChangeListener2.onViewAttachedToWindow(view2);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view2) {
                View.OnAttachStateChangeListener onAttachStateChangeListener2 = onAttachStateChangeListener;
                if (onAttachStateChangeListener2 != null) {
                    onAttachStateChangeListener2.onViewDetachedFromWindow(view2);
                }
            }
        });
    }

    public static void a(View view, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, int i2) {
        if (view == null || viewGroup == null) {
            return;
        }
        if (view.getParent() == null) {
            if (layoutParams == null) {
                viewGroup.addView(view, i2);
                return;
            } else {
                viewGroup.addView(view, i2, layoutParams);
                return;
            }
        }
        if (view.getParent() != viewGroup) {
            b(view);
            if (layoutParams == null) {
                viewGroup.addView(view, i2);
            } else {
                viewGroup.addView(view, i2, layoutParams);
            }
        }
    }

    public static void a(final View view, final ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        ViewTreeObserver viewTreeObserver;
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.common.utils.u.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
                    viewTreeObserver2.removeOnGlobalLayoutListener(this);
                }
                onGlobalLayoutListener.onGlobalLayout();
            }
        });
    }

    public static void a(final View view, final a aVar) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: sg.bigo.ads.common.utils.u.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private boolean f47546c = false;

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                a aVar2 = aVar;
                if (aVar2 != null && !this.f47546c) {
                    this.f47546c = true;
                    Rect rect = new Rect(i2, i3, i4, i5);
                    new Rect(i6, i7, i8, i9);
                    aVar2.a(rect);
                }
                view.post(new Runnable() { // from class: sg.bigo.ads.common.utils.u.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        view.removeOnLayoutChangeListener(this);
                    }
                });
            }
        });
    }

    public static void a(ViewGroup viewGroup, sg.bigo.ads.common.d<View> dVar) {
        if (viewGroup == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        linkedList.add(viewGroup);
        while (!linkedList.isEmpty()) {
            ViewGroup viewGroup2 = (ViewGroup) linkedList.poll();
            for (int i2 = 0; i2 < viewGroup2.getChildCount(); i2++) {
                View childAt = viewGroup2.getChildAt(i2);
                dVar.a(childAt);
                if (childAt instanceof ViewGroup) {
                    linkedList.add((ViewGroup) childAt);
                }
            }
        }
    }

    public static boolean a(int i2, int i3, View view) {
        return i2 >= view.getLeft() && i2 <= view.getRight() && i3 >= view.getTop() && i3 <= view.getBottom();
    }

    private static boolean a(Context context) {
        if (context instanceof Activity) {
            return sg.bigo.ads.common.r.a.a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
        }
        while (context instanceof ContextWrapper) {
            context = ((ContextWrapper) context).getBaseContext();
            if (context instanceof Activity) {
                return sg.bigo.ads.common.r.a.a(context.getClass(), "io.flutter.embedding.android.FlutterActivity", "io.flutter.app.FlutterActivity");
            }
        }
        return false;
    }

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        if (a(view.getContext())) {
            return true;
        }
        while (true) {
            if ((view == null ? false : sg.bigo.ads.common.r.a.a(view.getClass(), "io.flutter.plugin.platform.PlatformViewWrapper", "io.flutter.embedding.android.FlutterView")) || a(view.getContext())) {
                return true;
            }
            Object parent = view.getParent();
            if (!(parent instanceof View)) {
                return false;
            }
            view = (View) parent;
        }
    }

    public static boolean a(View view, int i2, int i3) {
        return i2 >= 0 && i2 <= view.getWidth() && i3 >= 0 && i3 <= view.getHeight();
    }
}
