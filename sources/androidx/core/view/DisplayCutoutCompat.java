package androidx.core.view;

import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisplayCutout f4440a;

    public static class Api28Impl {
        public static DisplayCutout a(Rect rect, List<Rect> list) {
            return new DisplayCutout(rect, list);
        }

        public static List<Rect> b(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int f(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    public static class Api29Impl {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }

    public static class Api30Impl {
        public static DisplayCutout a(Insets insets, Rect rect, Rect rect2, Rect rect3, Rect rect4, Insets insets2) {
            return new DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        public static Insets b(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.f4440a = displayCutout;
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.c(this.f4440a);
        }
        return 0;
    }

    public final int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.d(this.f4440a);
        }
        return 0;
    }

    public final int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.e(this.f4440a);
        }
        return 0;
    }

    public final int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.f(this.f4440a);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f4440a, ((DisplayCutoutCompat) obj).f4440a);
    }

    public final int hashCode() {
        return this.f4440a.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f4440a + "}";
    }
}
