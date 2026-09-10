package earstone;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: ViewUtilsApi21.java */
/* JADX INFO: loaded from: classes.dex */
public class seminary extends restrictive {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static boolean f25558beachfront = true;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static boolean f25559marial = true;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static boolean f25560wireman = true;

    /* JADX INFO: compiled from: ViewUtilsApi21.java */
    public static class attabal {
        public static void attabal(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void dern(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }

        public static void saneness(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }
    }

    @Override // earstone.restrictive
    public void impromptu(View view, Matrix matrix) {
        if (f25559marial) {
            try {
                attabal.saneness(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25559marial = false;
            }
        }
    }

    @Override // earstone.restrictive
    public void taiyuan(View view, Matrix matrix) {
        if (f25558beachfront) {
            try {
                attabal.dern(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25558beachfront = false;
            }
        }
    }

    @Override // earstone.restrictive
    public void wireman(View view, Matrix matrix) {
        if (f25560wireman) {
            try {
                attabal.attabal(view, matrix);
            } catch (NoSuchMethodError unused) {
                f25560wireman = false;
            }
        }
    }
}
