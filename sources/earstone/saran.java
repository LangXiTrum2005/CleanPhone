package earstone;

import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi22.java */
/* JADX INFO: loaded from: classes.dex */
public class saran extends seminary {

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static boolean f25554competently = true;

    /* JADX INFO: compiled from: ViewUtilsApi22.java */
    public static class attabal {
        public static void attabal(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    @Override // earstone.restrictive
    public void marial(View view, int i, int i2, int i3, int i4) {
        if (f25554competently) {
            try {
                attabal.attabal(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f25554competently = false;
            }
        }
    }
}
