package com.bytedance.sdk.openadsdk.core.widget;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.qd;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: loaded from: classes2.dex */
public class tan {
    private int di;
    private float fi;
    private float ka;
    private final ri ri;
    private boolean sf;
    private int xha;
    private final boolean lr = false;
    private boolean ik = false;
    private boolean mj = true;
    private boolean jbs = false;
    private final View.OnTouchListener qt = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.tan.1
        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (tan.this.ri.wjv()) {
                return !tan.this.ik;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                tan tanVar = tan.this;
                tanVar.sf = tanVar.ri(motionEvent);
                tan.this.ka = x;
                tan.this.fi = y;
                tan.this.di = (int) x;
                tan.this.xha = (int) y;
                tan.this.mj = true;
                if (tan.this.ri != null && tan.this.ik) {
                    tan.this.ri.ri(view, true);
                }
            } else if (action == 1) {
                if (Math.abs(x - tan.this.di) > 20.0f || Math.abs(y - tan.this.xha) > 20.0f) {
                    tan.this.mj = false;
                }
                tan.this.mj = true;
                tan.this.jbs = false;
                tan.this.ka = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                tan.this.fi = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                tan.this.di = 0;
                if (tan.this.ri != null) {
                    tan.this.ri.ri(view, tan.this.mj);
                }
                tan.this.sf = false;
            } else if (action == 3) {
                tan.this.sf = false;
            }
            return !tan.this.ik;
        }
    };

    public interface ri {
        void ri(View view, boolean z);

        boolean wjv();
    }

    public tan(ri riVar) {
        this.ri = riVar;
    }

    public void ri(View view) {
        if (view != null) {
            view.setOnTouchListener(this.qt);
        }
    }

    public void ri(boolean z) {
        this.ik = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        int iIk = qd.ik(com.bytedance.sdk.openadsdk.core.nr.ri().getApplicationContext());
        int iFi = qd.fi(com.bytedance.sdk.openadsdk.core.nr.ri().getApplicationContext());
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        float f = iIk;
        if (rawX <= f * 0.01f || rawX >= f * 0.99f) {
            return true;
        }
        float f2 = iFi;
        return rawY <= 0.01f * f2 || rawY >= f2 * 0.99f;
    }
}
