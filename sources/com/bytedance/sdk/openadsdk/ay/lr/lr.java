package com.bytedance.sdk.openadsdk.ay.lr;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lr {
    private final fi.ri di;
    private final AtomicBoolean fi;
    protected final AtomicBoolean ik;
    private volatile boolean jbs = false;
    private final AtomicLong ka;
    protected wjv lr;
    private final Integer mj;
    protected WeakReference<View> ri;
    private final int xha;

    public lr(Integer num, View view, wjv wjvVar, int i, fi.ri riVar) {
        this.mj = num;
        this.xha = i;
        this.lr = wjvVar;
        this.di = riVar;
        ri(view);
        this.ik = new AtomicBoolean(false);
        this.ka = new AtomicLong(-1L);
        this.fi = new AtomicBoolean(false);
    }

    public static lr ri(boolean z, Integer num, View view, wjv wjvVar, fi.ri riVar) {
        return z ? new mj(num, view, wjvVar, riVar) : new ik(num, view, wjvVar, riVar);
    }

    public void aw() {
        this.ik.set(false);
        mj();
    }

    public boolean co() {
        return this.ik.get();
    }

    public abstract int di();

    public ri fi() {
        WeakReference<View> weakReference = this.ri;
        if (weakReference == null) {
            return new ri(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new ri(0, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : new ri(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public abstract boolean ik();

    public boolean jbs() {
        return this.fi.get();
    }

    public void ka() {
        if (this.fi.compareAndSet(false, true)) {
            ka.ri(this.lr, fi(), this.di);
        }
    }

    public int lr() {
        if (jbs()) {
            return 1;
        }
        WeakReference<View> weakReference = this.ri;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.jbs) {
            return 3;
        }
        if (sf().equals(view.getTag(33554433))) {
            return (sf().equals(view.getTag(33554433)) && ik()) ? 1 : 2;
        }
        qt();
        fi.lr(sf());
        return 3;
    }

    public abstract void lr(int i);

    public void mj() {
        this.ka.set(-1L);
    }

    public void qt() {
        this.jbs = true;
        xha.lr(this);
    }

    public Integer sf() {
        return this.mj;
    }

    public void xha() {
        if (jbs()) {
            return;
        }
        if (!this.ik.get()) {
            mj();
        } else if (!this.ka.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.ka.get() >= this.xha) {
            ka();
        }
    }

    public void ri() {
        if (this.ik.compareAndSet(false, true)) {
            xha.ri(this);
        }
    }

    public void ri(int i) {
        if (i == 4) {
            ri();
            return;
        }
        if (i == 8) {
            aw();
        } else if (i == 9) {
            ka();
        } else {
            lr(i);
        }
    }

    public void ri(View view) {
        if (view != null) {
            view.setTag(33554433, sf());
        }
        this.ri = new WeakReference<>(view);
    }
}
