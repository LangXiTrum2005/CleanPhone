package begone;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import bubbles.impassible;
import bubbles.marial;
import com.google.android.material.internal.rotuma;

/* JADX INFO: compiled from: MaterialDialogs.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness {
    public static Rect attabal(Context context, int i, int i2) {
        TypedArray typedArrayTaiyuan = rotuma.taiyuan(context, null, impassible.MaterialAlertDialog, i, i2, new int[0]);
        int dimensionPixelSize = typedArrayTaiyuan.getDimensionPixelSize(impassible.MaterialAlertDialog_backgroundInsetStart, context.getResources().getDimensionPixelSize(marial.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayTaiyuan.getDimensionPixelSize(impassible.MaterialAlertDialog_backgroundInsetTop, context.getResources().getDimensionPixelSize(marial.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayTaiyuan.getDimensionPixelSize(impassible.MaterialAlertDialog_backgroundInsetEnd, context.getResources().getDimensionPixelSize(marial.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayTaiyuan.getDimensionPixelSize(impassible.MaterialAlertDialog_backgroundInsetBottom, context.getResources().getDimensionPixelSize(marial.mtrl_alert_dialog_background_inset_bottom));
        typedArrayTaiyuan.recycle();
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        int i3 = layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize;
        if (layoutDirection != 1) {
            dimensionPixelSize = dimensionPixelSize3;
        }
        return new Rect(i3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize4);
    }

    public static InsetDrawable saneness(Drawable drawable, Rect rect) {
        return new InsetDrawable(drawable, rect.left, rect.top, rect.right, rect.bottom);
    }
}
