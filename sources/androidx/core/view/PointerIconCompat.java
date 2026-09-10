package androidx.core.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes.dex */
public final class PointerIconCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PointerIcon f4456a;

    public static class Api24Impl {
        public static PointerIcon a(Bitmap bitmap, float f, float f2) {
            return PointerIcon.create(bitmap, f, f2);
        }

        public static PointerIcon b(Context context, int i2) {
            return PointerIcon.getSystemIcon(context, i2);
        }

        public static PointerIcon c(Resources resources, int i2) {
            return PointerIcon.load(resources, i2);
        }
    }

    public PointerIconCompat(PointerIcon pointerIcon) {
        this.f4456a = pointerIcon;
    }

    public static PointerIconCompat a(Context context) {
        return new PointerIconCompat(Api24Impl.b(context, 1002));
    }
}
