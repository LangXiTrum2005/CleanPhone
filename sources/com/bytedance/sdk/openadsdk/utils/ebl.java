package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public class ebl implements sLN, Runnable {
    private long JXs;
    private final Activity LD;
    private boolean OY;
    private long ZU;
    private final Lxb ebl;
    private boolean lc;
    private final AtomicBoolean QAg = new AtomicBoolean(false);
    private final Handler lk = new Handler(Looper.getMainLooper());
    private View Lxb = ZU();

    public interface Lxb {
        void LD();

        View Lxb();
    }

    private ebl(Activity activity, int i, Lxb lxb) {
        this.ebl = lxb;
        this.LD = activity;
        this.ZU = i;
    }

    private void JXs() {
        this.OY = false;
        this.JXs = SystemClock.elapsedRealtime();
        Handler handler = this.lk;
        if (handler != null) {
            handler.postDelayed(this, this.ZU);
        }
    }

    public static sLN Lxb(Activity activity, Lxb lxb) {
        int iPyu = com.bytedance.sdk.openadsdk.core.settings.VVE.TA().pyu();
        return iPyu < 0 ? new sLN() { // from class: com.bytedance.sdk.openadsdk.utils.ebl.1
            @Override // com.bytedance.sdk.openadsdk.utils.sLN
            public void LD() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sLN
            public void Lxb() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sLN
            public void lk() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.sLN
            public void Lxb(long j) {
            }
        } : new ebl(activity, Math.min(iPyu, 50) * 1000, lxb);
    }

    private View ZU() {
        Lxb lxb = this.ebl;
        if (lxb != null) {
            return lxb.Lxb();
        }
        return null;
    }

    private void ebl() {
        ViewParent parent = this.Lxb.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.Lxb) != viewGroup.getChildCount() - 1) {
                this.Lxb.bringToFront();
            }
        }
    }

    private void lc() {
        Activity activity;
        View childAt;
        if (this.lc || (activity = this.LD) == null || activity.isFinishing() || this.LD.isDestroyed()) {
            return;
        }
        if (this.Lxb == null) {
            this.Lxb = ZU();
        }
        View view = this.Lxb;
        if (view != null) {
            if (LD(view)) {
                Lxb(this.Lxb);
                View view2 = this.Lxb;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.Lxb).getChildAt(0)) != null && LD(childAt)) {
                    Lxb(childAt);
                }
                Lxb lxb = this.ebl;
                if (lxb != null) {
                    lxb.LD();
                }
            }
            ebl();
        }
        this.lc = true;
    }

    @Override // com.bytedance.sdk.openadsdk.utils.sLN
    public void LD() {
        if (this.JXs <= 0 || this.lc) {
            return;
        }
        if (!this.OY) {
            this.ZU -= SystemClock.elapsedRealtime() - this.JXs;
        }
        this.OY = true;
        if (this.ZU <= 0) {
            lc();
            return;
        }
        Handler handler = this.lk;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.sLN
    public void lk() {
        if (this.lc) {
            return;
        }
        this.lc = true;
        Handler handler = this.lk;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.sLN.LD(th.getMessage());
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        lc();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.sLN
    public void Lxb(long j) {
        if (this.QAg.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.ZU += j;
            JXs();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.sLN
    public void Lxb() {
        if (this.JXs == 0 || !this.OY) {
            return;
        }
        JXs();
    }

    private void Lxb(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean LD(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
