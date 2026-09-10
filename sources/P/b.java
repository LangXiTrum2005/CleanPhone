package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f47619b;

    public /* synthetic */ b(ActionBarOverlayLayout actionBarOverlayLayout, int i10) {
        this.f47618a = i10;
        this.f47619b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47618a) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.f47619b;
                actionBarOverlayLayout.h();
                actionBarOverlayLayout.f3915w = actionBarOverlayLayout.f3897d.animate().translationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setListener(actionBarOverlayLayout.f3916x);
                break;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.f47619b;
                actionBarOverlayLayout2.h();
                actionBarOverlayLayout2.f3915w = actionBarOverlayLayout2.f3897d.animate().translationY(-actionBarOverlayLayout2.f3897d.getHeight()).setListener(actionBarOverlayLayout2.f3916x);
                break;
        }
    }
}
