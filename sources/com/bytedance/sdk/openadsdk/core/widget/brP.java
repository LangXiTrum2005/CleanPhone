package com.bytedance.sdk.openadsdk.core.widget;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.le;

/* JADX INFO: loaded from: classes2.dex */
public class brP {
    private boolean JVA;
    private float JXs;
    private final Lxb Lxb;
    private float ZU;
    private int ebl;
    private int lc;
    private final boolean LD = false;
    private boolean lk = false;
    private boolean OY = true;
    private boolean QAg = false;
    private final View.OnTouchListener nBu = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.brP.1
        @Override // android.view.View.OnTouchListener
        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (brP.this.Lxb.eK()) {
                return !brP.this.lk;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                brP brp = brP.this;
                brp.JVA = brp.Lxb(motionEvent);
                brP.this.ZU = x;
                brP.this.JXs = y;
                brP.this.lc = (int) x;
                brP.this.ebl = (int) y;
                brP.this.OY = true;
                if (brP.this.Lxb != null && brP.this.lk) {
                    brP.this.Lxb.Lxb(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - brP.this.lc) > 20.0f || Math.abs(y - brP.this.ebl) > 20.0f) {
                    brP.this.OY = false;
                }
                brP.this.OY = true;
                brP.this.QAg = false;
                brP.this.ZU = 0.0f;
                brP.this.JXs = 0.0f;
                brP.this.lc = 0;
                if (brP.this.Lxb != null) {
                    brP.this.Lxb.Lxb(view, brP.this.OY);
                }
                brP.this.JVA = false;
            } else if (action == 3) {
                brP.this.JVA = false;
            }
            return !brP.this.lk;
        }
    };

    public interface Lxb {
        void Lxb(View view, boolean z);

        boolean eK();
    }

    public brP(Lxb lxb) {
        this.Lxb = lxb;
    }

    public void Lxb(View view) {
        if (view != null) {
            view.setOnTouchListener(this.nBu);
        }
    }

    public void Lxb(boolean z) {
        this.lk = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean Lxb(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iLk = le.lk(com.bytedance.sdk.openadsdk.core.kqm.Lxb().getApplicationContext());
        int iZU = le.ZU(com.bytedance.sdk.openadsdk.core.kqm.Lxb().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iLk;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = iZU;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
