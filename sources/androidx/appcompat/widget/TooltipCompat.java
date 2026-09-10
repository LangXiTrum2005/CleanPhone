package androidx.appcompat.widget;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class TooltipCompat {

    public static class Api26Impl {
        public static void a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.a(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler = TooltipCompatHandler.l0;
        if (tooltipCompatHandler != null && tooltipCompatHandler.X == view) {
            TooltipCompatHandler.b(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new TooltipCompatHandler(view, charSequence);
            return;
        }
        TooltipCompatHandler tooltipCompatHandler2 = TooltipCompatHandler.m0;
        if (tooltipCompatHandler2 != null && tooltipCompatHandler2.X == view) {
            tooltipCompatHandler2.a();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }
}
