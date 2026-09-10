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
public class jbs implements bgr, Runnable {
    private boolean di;
    private long fi;
    private long ka;
    private final Activity lr;
    private boolean mj;
    private final ri xha;
    private final AtomicBoolean jbs = new AtomicBoolean(false);
    private final Handler ik = new Handler(Looper.getMainLooper());
    private View ri = ka();

    public interface ri {
        void lr();

        View ri();
    }

    private jbs(Activity activity, int i, ri riVar) {
        this.xha = riVar;
        this.lr = activity;
        this.ka = i;
    }

    private void di() {
        Activity activity;
        View childAt;
        if (this.di || (activity = this.lr) == null || activity.isFinishing() || this.lr.isDestroyed()) {
            return;
        }
        if (this.ri == null) {
            this.ri = ka();
        }
        View view = this.ri;
        if (view != null) {
            if (lr(view)) {
                ri(this.ri);
                View view2 = this.ri;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.ri).getChildAt(0)) != null && lr(childAt)) {
                    ri(childAt);
                }
                ri riVar = this.xha;
                if (riVar != null) {
                    riVar.lr();
                }
            }
            xha();
        }
        this.di = true;
    }

    private void fi() {
        this.mj = false;
        this.fi = SystemClock.elapsedRealtime();
        Handler handler = this.ik;
        if (handler != null) {
            handler.postDelayed(this, this.ka);
        }
    }

    private View ka() {
        ri riVar = this.xha;
        if (riVar != null) {
            return riVar.ri();
        }
        return null;
    }

    public static bgr ri(Activity activity, ri riVar) {
        int iChe = com.bytedance.sdk.openadsdk.core.settings.sf.lr().che();
        return iChe < 0 ? new bgr() { // from class: com.bytedance.sdk.openadsdk.utils.jbs.1
            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            public void ri() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            public void ri(long j) {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            public void ik() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.bgr
            public void lr() {
            }
        } : new jbs(activity, Math.min(iChe, 50) * 1000, riVar);
    }

    private void xha() {
        ViewParent parent = this.ri.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.ri) != viewGroup.getChildCount() - 1) {
                this.ri.bringToFront();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    public void ik() {
        if (this.di) {
            return;
        }
        this.di = true;
        Handler handler = this.ik;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    public void lr() {
        if (this.fi <= 0 || this.di) {
            return;
        }
        if (!this.mj) {
            this.ka -= SystemClock.elapsedRealtime() - this.fi;
        }
        this.mj = true;
        if (this.ka <= 0) {
            di();
            return;
        }
        Handler handler = this.ik;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.ac.ik(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        di();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    public void ri(long j) {
        if (this.jbs.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.ka += j;
            fi();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.bgr
    public void ri() {
        if (this.fi == 0 || !this.mj) {
            return;
        }
        fi();
    }

    private void ri(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean lr(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
