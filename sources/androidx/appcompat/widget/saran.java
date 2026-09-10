package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: TooltipCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class saran {

    /* JADX INFO: compiled from: TooltipCompat.java */
    public static class attabal {
        public static void attabal(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void attabal(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            attabal.attabal(view, charSequence);
        } else {
            starveling.competently(view, charSequence);
        }
    }
}
