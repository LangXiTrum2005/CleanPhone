package A;

import android.view.ViewTreeObserver;
import com.chartboost.heliumsdk.controllers.banners.VisibilityTracker;
import com.chartboost.sdk.impl.vj;
import com.inmobi.media.B3;
import com.vungle.ads.internal.ImpressionTracker;

/* JADX INFO: renamed from: A.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ViewTreeObserverOnPreDrawListenerC0893h implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3177Y;

    public /* synthetic */ ViewTreeObserverOnPreDrawListenerC0893h(Object obj, int i2) {
        this.X = i2;
        this.f3177Y = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.X) {
            case 0:
                return B3.a((B3) this.f3177Y);
            case 1:
                return VisibilityTracker.preDrawListener$lambda$0((VisibilityTracker) this.f3177Y);
            case 2:
                return ImpressionTracker.m3194_init_$lambda0((ImpressionTracker) this.f3177Y);
            default:
                return vj.j((vj) this.f3177Y);
        }
    }
}
