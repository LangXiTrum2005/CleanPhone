package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.graphics.PorterDuff;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ViewUtils {

    /* JADX INFO: renamed from: com.google.android.material.internal.ViewUtils$1, reason: invalid class name */
    class AnonymousClass1 implements OnApplyWindowInsetsListener {
        @Override // com.google.android.material.internal.ViewUtils.OnApplyWindowInsetsListener
        public final WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding) {
            ViewUtils.e(view);
            int i2 = relativePadding.f19355a;
            int i3 = relativePadding.f19356b;
            int i4 = relativePadding.f19357c;
            int i5 = relativePadding.d;
            WeakHashMap weakHashMap = ViewCompat.f4466a;
            view.setPaddingRelative(i2, i3, i4, i5);
            return windowInsetsCompat;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.internal.ViewUtils$3, reason: invalid class name */
    class AnonymousClass3 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            ViewCompat.x(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    public interface OnApplyWindowInsetsListener {
        WindowInsetsCompat a(View view, WindowInsetsCompat windowInsetsCompat, RelativePadding relativePadding);
    }

    public static class RelativePadding {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f19355a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f19356b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f19357c;
        public int d;
    }

    public static void a(View view, final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        int paddingStart = view.getPaddingStart();
        int paddingTop = view.getPaddingTop();
        int paddingEnd = view.getPaddingEnd();
        int paddingBottom = view.getPaddingBottom();
        final RelativePadding relativePadding = new RelativePadding();
        relativePadding.f19355a = paddingStart;
        relativePadding.f19356b = paddingTop;
        relativePadding.f19357c = paddingEnd;
        relativePadding.d = paddingBottom;
        ViewCompat.G(view, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: com.google.android.material.internal.ViewUtils.2
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat d(View view2, WindowInsetsCompat windowInsetsCompat) {
                RelativePadding relativePadding2 = new RelativePadding();
                RelativePadding relativePadding3 = relativePadding;
                relativePadding2.f19355a = relativePadding3.f19355a;
                relativePadding2.f19356b = relativePadding3.f19356b;
                relativePadding2.f19357c = relativePadding3.f19357c;
                relativePadding2.d = relativePadding3.d;
                onApplyWindowInsetsListener.a(view2, windowInsetsCompat, relativePadding2);
                return windowInsetsCompat;
            }
        });
        if (view.isAttachedToWindow()) {
            ViewCompat.x(view);
        } else {
            view.addOnAttachStateChangeListener(new AnonymousClass3());
        }
    }

    public static float b(Context context, int i2) {
        return TypedValue.applyDimension(1, i2, context.getResources().getDisplayMetrics());
    }

    public static ViewGroup c(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(R.id.content);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static ViewOverlayImpl d(View view) {
        if (view == null) {
            return null;
        }
        return new ViewOverlayApi18(view);
    }

    public static boolean e(View view) {
        WeakHashMap weakHashMap = ViewCompat.f4466a;
        return view.getLayoutDirection() == 1;
    }

    public static PorterDuff.Mode f(int i2, PorterDuff.Mode mode) {
        if (i2 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i2 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i2 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i2) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
