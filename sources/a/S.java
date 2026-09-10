package A;

import android.view.MotionEvent;
import android.view.View;
import com.inmobi.media.Y3;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class S implements View.OnTouchListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Y3 f3157Y;

    public /* synthetic */ S(Y3 y3, int i2) {
        this.X = i2;
        this.f3157Y = y3;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.X) {
            case 0:
                return Y3.a(this.f3157Y, view, motionEvent);
            case 1:
                return Y3.d(this.f3157Y, view, motionEvent);
            case 2:
                return Y3.b(this.f3157Y, view, motionEvent);
            default:
                return Y3.c(this.f3157Y, view, motionEvent);
        }
    }
}
