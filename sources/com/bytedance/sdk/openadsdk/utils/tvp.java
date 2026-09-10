package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class tvp implements rdp, Runnable {
    private boolean jpc;
    private long mml;
    private boolean mo;
    private long mzz;
    private final Activity ud;
    private final qdl wd;
    private final AtomicBoolean tvp = new AtomicBoolean(false);
    private final Handler lnr = new Handler(Looper.getMainLooper());
    private View qdl = mml();

    public interface qdl {
        View qdl();

        void ud();
    }

    private tvp(Activity activity, int i2, qdl qdlVar) {
        this.wd = qdlVar;
        this.ud = activity;
        this.mml = i2;
    }

    private View mml() {
        qdl qdlVar = this.wd;
        if (qdlVar != null) {
            return qdlVar.qdl();
        }
        return null;
    }

    private void mo() {
        Activity activity;
        View childAt;
        if (this.mo || (activity = this.ud) == null || activity.isFinishing() || this.ud.isDestroyed()) {
            return;
        }
        if (this.qdl == null) {
            this.qdl = mml();
        }
        View view = this.qdl;
        if (view != null) {
            if (ud(view)) {
                qdl(this.qdl);
                View view2 = this.qdl;
                if ((view2 instanceof ViewGroup) && ((ViewGroup) view2).getChildCount() > 0 && (childAt = ((ViewGroup) this.qdl).getChildAt(0)) != null && ud(childAt)) {
                    qdl(childAt);
                }
                qdl qdlVar = this.wd;
                if (qdlVar != null) {
                    qdlVar.ud();
                }
            }
            wd();
        }
        this.mo = true;
    }

    private void mzz() {
        this.jpc = false;
        this.mzz = SystemClock.elapsedRealtime();
        Handler handler = this.lnr;
        if (handler != null) {
            handler.postDelayed(this, this.mml);
        }
    }

    public static rdp qdl(Activity activity, qdl qdlVar) {
        int iDps = com.bytedance.sdk.openadsdk.core.settings.rq.lnr().dps();
        return iDps < 0 ? new rdp() { // from class: com.bytedance.sdk.openadsdk.utils.tvp.1
            @Override // com.bytedance.sdk.openadsdk.utils.rdp
            public void lnr() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.rdp
            public void qdl() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.rdp
            public void ud() {
            }

            @Override // com.bytedance.sdk.openadsdk.utils.rdp
            public void qdl(long j) {
            }
        } : new tvp(activity, Math.min(iDps, 50) * 1000, qdlVar);
    }

    private void wd() {
        ViewParent parent = this.qdl.getParent();
        if (parent instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.indexOfChild(this.qdl) != viewGroup.getChildCount() - 1) {
                this.qdl.bringToFront();
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rdp
    public void lnr() {
        if (this.mo) {
            return;
        }
        this.mo = true;
        Handler handler = this.lnr;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        mo();
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rdp
    public void ud() {
        if (this.mzz <= 0 || this.mo) {
            return;
        }
        if (!this.jpc) {
            this.mml -= SystemClock.elapsedRealtime() - this.mzz;
        }
        this.jpc = true;
        if (this.mml <= 0) {
            mo();
            return;
        }
        Handler handler = this.lnr;
        if (handler != null) {
            try {
                handler.removeCallbacks(this);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.aaj.lnr(th.getMessage(), new Object[0]);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rdp
    public void qdl(long j) {
        if (this.tvp.compareAndSet(false, true)) {
            if (j < 0) {
                j = 0;
            }
            this.mml += j;
            mzz();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.utils.rdp
    public void qdl() {
        if (this.mzz == 0 || !this.jpc) {
            return;
        }
        mzz();
    }

    private void qdl(View view) {
        view.setVisibility(0);
        view.setAlpha(1.0f);
    }

    private boolean ud(View view) {
        if (view == null) {
            return true;
        }
        return !view.isShown() || ((double) view.getAlpha()) <= 0.9d;
    }
}
