package A;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.applovin.impl.e1;
import com.inmobi.ads.WatermarkData;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class X implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3162Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ X(Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.f3162Y = obj;
        this.Z = obj2;
        this.e0 = obj3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.X) {
            case 0:
                GestureDetectorOnGestureListenerC3005ec.a((GestureDetectorOnGestureListenerC3005ec) this.f3162Y, (byte[]) this.Z, (WatermarkData) this.e0);
                break;
            default:
                ((e1) this.f3162Y).a((View) this.Z, (FrameLayout) this.e0);
                break;
        }
    }
}
