package earstone;

import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* JADX INFO: compiled from: ImageViewUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class cutely {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static boolean f25522attabal = true;

    /* JADX INFO: compiled from: ImageViewUtils.java */
    public static class attabal {
        public static void attabal(ImageView imageView, Matrix matrix) {
            imageView.animateTransform(matrix);
        }
    }

    public static void attabal(ImageView imageView, Matrix matrix) {
        if (Build.VERSION.SDK_INT >= 29) {
            attabal.attabal(imageView, matrix);
            return;
        }
        if (matrix != null) {
            saneness(imageView, matrix);
            return;
        }
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
            imageView.invalidate();
        }
    }

    public static void saneness(ImageView imageView, Matrix matrix) {
        if (f25522attabal) {
            try {
                attabal.attabal(imageView, matrix);
            } catch (NoSuchMethodError unused) {
                f25522attabal = false;
            }
        }
    }
}
