package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import com.bytedance.adsdk.ugeno.ud.a;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class DrawableUtils {

    public static class OutlineCompatL {
        public static void a(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }

    public static class OutlineCompatR {
        public static void a(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    public static Drawable a(Drawable drawable, Drawable drawable2, int i2, int i3) {
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        if (i2 == -1 && (i2 = drawable2.getIntrinsicWidth()) == -1) {
            i2 = drawable.getIntrinsicWidth();
        }
        if (i3 == -1 && (i3 = drawable2.getIntrinsicHeight()) == -1) {
            i3 = drawable.getIntrinsicHeight();
        }
        if (i2 > drawable.getIntrinsicWidth() || i3 > drawable.getIntrinsicHeight()) {
            float f = i2 / i3;
            if (f >= drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight()) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                i3 = (int) (intrinsicWidth / f);
                i2 = intrinsicWidth;
            } else {
                i3 = drawable.getIntrinsicHeight();
                i2 = (int) (f * i3);
            }
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        layerDrawable.setLayerSize(1, i2, i3);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static Drawable b(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                DrawableCompat.k(drawable, mode);
            }
        }
        return drawable;
    }

    public static int[] c(int[] iArr) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            int i3 = iArr[i2];
            if (i3 == 16842912) {
                return iArr;
            }
            if (i3 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i2] = 16842912;
                return iArr2;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length + 1);
        iArrCopyOf[iArr.length] = 16842912;
        return iArrCopyOf;
    }

    public static ColorStateList d(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !a.y(drawable)) {
            return null;
        }
        return a.g(drawable).getColorStateList();
    }

    public static void e(Outline outline, Path path) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            OutlineCompatR.a(outline, path);
            return;
        }
        if (i2 >= 29) {
            try {
                OutlineCompatL.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.a(outline, path);
        }
    }
}
