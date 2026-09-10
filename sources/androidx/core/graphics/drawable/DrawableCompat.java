package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableCompat {

    public static class Api21Impl {
        public static void a(Drawable drawable, Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        public static boolean b(Drawable drawable) {
            return drawable.canApplyTheme();
        }

        public static ColorFilter c(Drawable drawable) {
            return drawable.getColorFilter();
        }

        public static void d(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        public static void e(Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        public static void f(Drawable drawable, int i2, int i3, int i4, int i5) {
            drawable.setHotspotBounds(i2, i3, i4, i5);
        }

        public static void g(Drawable drawable, int i2) {
            drawable.setTint(i2);
        }

        public static void h(Drawable drawable, ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        public static void i(Drawable drawable, PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }
    }

    public static class Api23Impl {
        public static int a(Drawable drawable) {
            return drawable.getLayoutDirection();
        }

        public static boolean b(Drawable drawable, int i2) {
            return drawable.setLayoutDirection(i2);
        }
    }

    public static void a(Drawable drawable, Resources.Theme theme) {
        Api21Impl.a(drawable, theme);
    }

    public static boolean b(Drawable drawable) {
        return Api21Impl.b(drawable);
    }

    public static ColorFilter c(Drawable drawable) {
        return Api21Impl.c(drawable);
    }

    public static int d(Drawable drawable) {
        return Api23Impl.a(drawable);
    }

    public static void e(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Api21Impl.d(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    public static void f(Drawable drawable, float f, float f2) {
        Api21Impl.e(drawable, f, f2);
    }

    public static void g(Drawable drawable, int i2, int i3, int i4, int i5) {
        Api21Impl.f(drawable, i2, i3, i4, i5);
    }

    public static boolean h(Drawable drawable, int i2) {
        return Api23Impl.b(drawable, i2);
    }

    public static void i(Drawable drawable, int i2) {
        Api21Impl.g(drawable, i2);
    }

    public static void j(Drawable drawable, ColorStateList colorStateList) {
        Api21Impl.h(drawable, colorStateList);
    }

    public static void k(Drawable drawable, PorterDuff.Mode mode) {
        Api21Impl.i(drawable, mode);
    }
}
