package earstone;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi23.java */
/* JADX INFO: loaded from: classes.dex */
public class creditor extends saran {

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public static boolean f25521impromptu = true;

    /* JADX INFO: compiled from: ViewUtilsApi23.java */
    public static class attabal {
        public static void attabal(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // earstone.restrictive
    public void competently(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.competently(view, i);
        } else if (f25521impromptu) {
            try {
                attabal.attabal(view, i);
            } catch (NoSuchMethodError unused) {
                f25521impromptu = false;
            }
        }
    }
}
