package androidx.recyclerview.widget;

import android.animation.ValueAnimator;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4820b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f4819a = i10;
        this.f4820b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f4819a;
        Object obj = this.f4820b;
        switch (i10) {
            case 0:
                p pVar = (p) obj;
                ValueAnimator valueAnimator = pVar.f4880z;
                int i11 = pVar.A;
                if (i11 == 1) {
                    valueAnimator.cancel();
                } else if (i11 != 2) {
                }
                pVar.A = 3;
                valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                valueAnimator.setDuration(UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE);
                valueAnimator.start();
                break;
            default:
                ((StaggeredGridLayoutManager) obj).u0();
                break;
        }
    }
}
