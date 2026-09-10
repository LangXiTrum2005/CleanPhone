package utwa;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: Transform3D.java */
/* JADX INFO: loaded from: classes.dex */
public class kowloon {
    public static void attabal(Matrix matrix, float f, float f2, float f3, float f4, float f5) {
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            matrix.preRotate(f3);
        }
        if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            wireman(matrix, f5);
        }
        if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            dern(matrix, f4);
        }
    }

    public static void dern(Matrix matrix, float f) {
        matrix.preScale(1.0f, f);
    }

    public static void saneness(Matrix matrix, PointF pointF, PointF pointF2, float f, float f2, float f3, float f4, float f5, float f6, float f7) {
        matrix.reset();
        if (pointF2 != null) {
            float f8 = pointF2.x;
            if (f8 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || pointF2.y != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                matrix.preTranslate(f8, pointF2.y);
            }
        }
        if (f5 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            matrix.preRotate(f5);
        }
        if (f4 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            wireman(matrix, f7);
        }
        if (f3 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            dern(matrix, f6);
        }
        if (f != 1.0f || f2 != 1.0f) {
            matrix.preScale(f, f2);
        }
        if (pointF != null) {
            float f9 = pointF.x;
            if (f9 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && pointF.y == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            matrix.preTranslate(-f9, -pointF.y);
        }
    }

    public static void wireman(Matrix matrix, float f) {
        matrix.preScale(f, 1.0f);
    }
}
