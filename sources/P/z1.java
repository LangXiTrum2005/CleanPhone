package p;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z1 implements View.OnTouchListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a2 f47876a;

    public z1(a2 a2Var) {
        this.f47876a = a2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        a2 a2Var = this.f47876a;
        w1 w1Var = a2Var.f47609q;
        Handler handler = a2Var.f47613u;
        a0 a0Var = a2Var.f47617y;
        int action = motionEvent.getAction();
        int x10 = (int) motionEvent.getX();
        int y10 = (int) motionEvent.getY();
        if (action == 0 && a0Var != null && a0Var.isShowing() && x10 >= 0 && x10 < a0Var.getWidth() && y10 >= 0 && y10 < a0Var.getHeight()) {
            handler.postDelayed(w1Var, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        handler.removeCallbacks(w1Var);
        return false;
    }
}
