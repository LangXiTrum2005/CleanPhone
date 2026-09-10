package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
class ViewUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ViewUtilsApi23 f8453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Property f8454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property f8455c;

    /* JADX INFO: renamed from: androidx.transition.ViewUtils$1, reason: invalid class name */
    public class AnonymousClass1 extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(ViewUtils.f8453a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            float fFloatValue = f.floatValue();
            ViewUtils.f8453a.b(view, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: androidx.transition.ViewUtils$2, reason: invalid class name */
    public class AnonymousClass2 extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f8453a = new ViewUtilsApi29();
        } else {
            f8453a = new ViewUtilsApi23();
        }
        f8454b = new AnonymousClass1(Float.class, "translationAlpha");
        f8455c = new AnonymousClass2(Rect.class, "clipBounds");
    }

    public static void a(View view, int i2, int i3, int i4, int i5) {
        f8453a.g(view, i2, i3, i4, i5);
    }

    public static void b(View view, int i2) {
        f8453a.c(view, i2);
    }
}
