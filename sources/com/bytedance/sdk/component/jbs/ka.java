package com.bytedance.sdk.component.jbs;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.utils.ac;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class ka extends ik {
    private View.OnTouchListener di;
    private final di fi;
    private final long ik;
    private float jbs;
    private final Context ka;
    private final int lr;
    private float mj;
    private String qt;
    private final View.OnTouchListener ri;
    private long xha = -1;

    public ka(Context context, View.OnTouchListener onTouchListener, int i, long j, di diVar) {
        this.ka = context;
        this.ri = onTouchListener;
        this.lr = i;
        this.ik = j;
        this.fi = diVar;
    }

    private boolean ri(long j) {
        long j2 = this.xha;
        if (j2 == -1) {
            this.xha = j;
            return false;
        }
        int i = this.lr;
        if (i == 1) {
            if (j - j2 <= this.ik) {
                return true;
            }
            this.xha = j;
            return false;
        }
        if (i == 2) {
            if (j - j2 <= this.ik) {
                this.xha = j;
                return true;
            }
            this.xha = j;
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        ka kaVar;
        int action = motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (action == 0) {
            kaVar = this;
            kaVar.mj = x;
            kaVar.jbs = y;
        } else if (action != 1) {
            kaVar = this;
        } else {
            kaVar = this;
            if (kaVar.ri(x, y, this.mj, this.jbs, this.ka)) {
                if (ri(SystemClock.elapsedRealtime())) {
                    motionEvent.setAction(3);
                    ri(1, x, y);
                } else {
                    ri(0, x, y);
                }
            }
        }
        View.OnTouchListener onTouchListener = kaVar.ri;
        if (onTouchListener != null) {
            onTouchListener.onTouch(view, motionEvent);
        }
        View.OnTouchListener onTouchListener2 = kaVar.di;
        if (onTouchListener2 != null) {
            onTouchListener2.onTouch(view, motionEvent);
        }
        return false;
    }

    private void ri(int i, float f, float f2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("is_interceptor", i);
            jSONObject2.put("click_x", f);
            jSONObject2.put("click_y", f2);
            jSONObject.put("lp_click_type", this.lr);
            jSONObject.put("lp_click_interval", this.ik);
        } catch (Throwable th) {
            ac.ri("LpClickIntervalTouchListener", "sendLpClickInterceptEvent", th);
        }
        if (com.bytedance.sdk.component.jbs.ri.ri.ri().lr() != null) {
            com.bytedance.sdk.component.jbs.ri.lr lrVarLr = com.bytedance.sdk.component.jbs.ri.ri.ri().lr();
            di diVar = this.fi;
            lrVarLr.ri(diVar != null ? diVar.getMaterialMeta() : null, this.qt, "click_interval_intercept", jSONObject, jSONObject2);
        }
    }

    public void ri(String str) {
        this.qt = str;
    }

    @Override // com.bytedance.sdk.component.jbs.ik
    public void ri(View.OnTouchListener onTouchListener) {
        this.di = onTouchListener;
    }
}
