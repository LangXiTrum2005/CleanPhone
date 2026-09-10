package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: compiled from: ImageViewCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class taiyuan {

    /* JADX INFO: compiled from: ImageViewCompat.java */
    public static class attabal {
        public static ColorStateList attabal(ImageView imageView) {
            return imageView.getImageTintList();
        }

        public static void dern(ImageView imageView, ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        public static PorterDuff.Mode saneness(ImageView imageView) {
            return imageView.getImageTintMode();
        }

        public static void wireman(ImageView imageView, PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }

    public static ColorStateList attabal(ImageView imageView) {
        return attabal.attabal(imageView);
    }

    public static void dern(ImageView imageView, ColorStateList colorStateList) {
        attabal.dern(imageView, colorStateList);
    }

    public static PorterDuff.Mode saneness(ImageView imageView) {
        return attabal.saneness(imageView);
    }

    public static void wireman(ImageView imageView, PorterDuff.Mode mode) {
        attabal.wireman(imageView, mode);
    }
}
