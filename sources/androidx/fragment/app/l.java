package androidx.fragment.app;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f4379a;

    public l(c2 operation) {
        kotlin.jvm.internal.n.f(operation, "operation");
        this.f4379a = operation;
    }

    public final boolean a() {
        int i10;
        c2 c2Var = this.f4379a;
        View view = c2Var.f4273c.mView;
        if (view != null) {
            i10 = 4;
            if (view.getAlpha() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility == 0) {
                    i10 = 2;
                } else if (visibility != 4) {
                    if (visibility != 8) {
                        throw new IllegalArgumentException(l1.d.e(visibility, "Unknown visibility "));
                    }
                    i10 = 3;
                }
            }
        } else {
            i10 = 0;
        }
        int i11 = c2Var.f4271a;
        if (i10 != i11) {
            return (i10 == 2 || i11 == 2) ? false : true;
        }
        return true;
    }
}
