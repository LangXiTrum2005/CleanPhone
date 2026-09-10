package ads_mobile_sdk;

import android.view.MotionEvent;
import java.util.ArrayDeque;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class uf1 {
    public MotionEvent b;
    public final ArrayDeque a = new ArrayDeque();
    public sf1 c = new sf1();

    public final synchronized void a(HashMap map) {
        try {
            MotionEvent motionEvent = this.b;
            if (motionEvent != null) {
                map.put("nv", motionEvent);
            }
            map.put("oe", this.c);
            ArrayDeque arrayDeque = this.a;
            map.put("ro", arrayDeque.toArray(new tf1[arrayDeque.size()]));
            this.c = new sf1();
            this.a.clear();
            MotionEvent motionEvent2 = this.b;
            if (motionEvent2 != null) {
                motionEvent2.recycle();
                this.b = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void a(MotionEvent motionEvent) {
        try {
            if (motionEvent.getAction() == 1) {
                this.b = MotionEvent.obtain(motionEvent);
            }
            sf1 sf1Var = this.c;
            sf1Var.getClass();
            int action = motionEvent.getAction();
            if (action == 0) {
                sf1Var.a++;
                sf1Var.g = 0.0d;
                sf1Var.e = motionEvent.getRawX();
                sf1Var.f = motionEvent.getRawY();
                sf1Var.h = motionEvent.getX();
                sf1Var.i = motionEvent.getY();
                sf1Var.j = motionEvent.getRawX();
                sf1Var.k = motionEvent.getRawY();
            } else if (action == 1) {
                sf1Var.c++;
                sf1Var.g = Math.hypot(((double) motionEvent.getRawX()) - sf1Var.e, ((double) motionEvent.getRawY()) - sf1Var.f) + sf1Var.g;
                sf1Var.e = motionEvent.getRawX();
                sf1Var.f = motionEvent.getRawY();
            } else if (action == 2) {
                sf1Var.b += (long) (motionEvent.getHistorySize() + 1);
                sf1Var.g = Math.hypot(((double) motionEvent.getRawX()) - sf1Var.e, ((double) motionEvent.getRawY()) - sf1Var.f) + sf1Var.g;
                sf1Var.e = motionEvent.getRawX();
                sf1Var.f = motionEvent.getRawY();
            } else if (action == 3) {
                sf1Var.d++;
            }
            if (this.a.size() >= 6) {
                this.a.remove();
            }
            this.a.add(new tf1(motionEvent));
        } catch (Throwable th) {
            throw th;
        }
    }
}
