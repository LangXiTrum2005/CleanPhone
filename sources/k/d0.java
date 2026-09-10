package k;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;
import ea.f2;
import java.util.WeakHashMap;
import m0.s0;
import m0.y0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f44061b;

    public /* synthetic */ d0(f0 f0Var, int i10) {
        this.f44060a = i10;
        this.f44061b = f0Var;
    }

    @Override // m0.x0
    public final void c() {
        View view;
        int i10 = this.f44060a;
        f0 f0Var = this.f44061b;
        switch (i10) {
            case 0:
                if (f0Var.f44110o && (view = f0Var.f44103g) != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f0Var.f44100d.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                f0Var.f44100d.setVisibility(8);
                f0Var.f44100d.setTransitioning(false);
                f0Var.f44114s = null;
                f2 f2Var = f0Var.f44107k;
                if (f2Var != null) {
                    f2Var.u(f0Var.f44106j);
                    f0Var.f44106j = null;
                    f0Var.f44107k = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = f0Var.f44099c;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = s0.f45746a;
                    actionBarOverlayLayout.requestApplyInsets();
                }
                break;
            default:
                f0Var.f44114s = null;
                f0Var.f44100d.requestLayout();
                break;
        }
    }
}
