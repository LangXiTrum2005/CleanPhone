package com.bytedance.adsdk.ugeno.core.lr;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.aw;
import com.bytedance.adsdk.ugeno.core.vr;

/* JADX INFO: loaded from: classes2.dex */
public class ik {
    private final int di;
    private boolean fi;
    private aw ik;
    private Context ka;
    private float lr;
    private float ri;

    public ik(Context context, aw awVar) {
        this.ka = context;
        this.ik = awVar;
        this.di = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean ri(vr vrVar, com.bytedance.adsdk.ugeno.lr.ik ikVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.ri = motionEvent.getX();
            this.lr = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.ri) >= this.di || Math.abs(y - this.lr) >= this.di) {
                    this.fi = true;
                }
            } else if (action == 3) {
                this.fi = false;
            }
        } else {
            if (this.fi) {
                this.fi = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.ri) >= this.di || Math.abs(y2 - this.lr) >= this.di) {
                this.fi = false;
            } else if (vrVar != null) {
                vrVar.ri(this.ik, ikVar, ikVar);
                return true;
            }
        }
        return true;
    }
}
