package A;

import android.view.MotionEvent;
import android.view.View;
import com.applovin.impl.a2;
import com.inmobi.media.F7;
import com.inmobi.media.Xb;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r implements View.OnTouchListener {
    public final /* synthetic */ int X;

    public /* synthetic */ r(int i2) {
        this.X = i2;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.X) {
            case 0:
                return F7.a(view, motionEvent);
            case 1:
                return Xb.a(view, motionEvent);
            case 2:
                return a2.a(view, motionEvent);
            default:
                return com.applovin.impl.adview.b.a(view, motionEvent);
        }
    }
}
