package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.ax;

/* JADX INFO: loaded from: classes3.dex */
public class exc {
    private float mml;
    private int mo;
    private float mzz;
    private final qdl qdl;
    private boolean rq;
    private int wd;
    private final boolean ud = false;
    private boolean lnr = false;
    private boolean jpc = true;
    private boolean tvp = false;
    private final View.OnTouchListener to = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.exc.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (exc.this.qdl.ljh()) {
                return !exc.this.lnr;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                exc excVar = exc.this;
                excVar.rq = excVar.qdl(motionEvent);
                exc.this.mml = x;
                exc.this.mzz = y;
                exc.this.mo = (int) x;
                exc.this.wd = (int) y;
                exc.this.jpc = true;
                if (exc.this.qdl != null && exc.this.lnr) {
                    exc.this.qdl.qdl(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - exc.this.mo) > 20.0f || Math.abs(y - exc.this.wd) > 20.0f) {
                    exc.this.jpc = false;
                }
                exc.this.jpc = true;
                exc.this.tvp = false;
                exc.this.mml = 0.0f;
                exc.this.mzz = 0.0f;
                exc.this.mo = 0;
                if (exc.this.qdl != null) {
                    exc.this.qdl.qdl(view, exc.this.jpc);
                }
                exc.this.rq = false;
            } else if (action == 3) {
                exc.this.rq = false;
            }
            return !exc.this.lnr;
        }
    };

    public interface qdl {
        boolean ljh();

        void qdl(View view, boolean z2);
    }

    public exc(qdl qdlVar) {
        this.qdl = qdlVar;
    }

    public void qdl(View view) {
        if (view != null) {
            view.setOnTouchListener(this.to);
        }
    }

    public void qdl(boolean z2) {
        this.lnr = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean qdl(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iLnr = ax.lnr(com.bytedance.sdk.openadsdk.core.yt.qdl().getApplicationContext());
        int iMzz = ax.mzz(com.bytedance.sdk.openadsdk.core.yt.qdl().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iLnr;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = iMzz;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
