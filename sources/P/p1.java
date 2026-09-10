package p;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f47759b;

    public /* synthetic */ p1(q1 q1Var, int i10) {
        this.f47758a = i10;
        this.f47759b = q1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f47758a) {
            case 0:
                ViewParent parent = this.f47759b.f47776d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
                break;
            default:
                q1 q1Var = this.f47759b;
                q1Var.a();
                View view = q1Var.f47776d;
                if (view.isEnabled() && !view.isLongClickable() && q1Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                    view.onTouchEvent(motionEventObtain);
                    motionEventObtain.recycle();
                    q1Var.f47779g = true;
                    break;
                }
                break;
        }
    }
}
