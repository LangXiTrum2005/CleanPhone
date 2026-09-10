package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class ImageViewCompat {

    public static class Api21Impl {
        public static ColorStateList a(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public static PorterDuff.Mode b(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        public static void c(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        public static void d(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static void a(ImageView imageView, ColorStateList colorStateList) {
        Api21Impl.c(imageView, colorStateList);
    }

    public static void b(ImageView imageView, PorterDuff.Mode mode) {
        Api21Impl.d(imageView, mode);
    }
}
