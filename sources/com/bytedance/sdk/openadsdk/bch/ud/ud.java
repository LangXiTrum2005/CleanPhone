package com.bytedance.sdk.openadsdk.bch.ud;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ud {
    private final Integer jpc;
    protected final AtomicBoolean lnr;
    private final AtomicLong mml;
    private final mzz.qdl mo;
    private final AtomicBoolean mzz;
    protected WeakReference<View> qdl;
    private volatile boolean tvp = false;
    protected ljh ud;
    private final int wd;

    public ud(Integer num, View view, ljh ljhVar, int i2, mzz.qdl qdlVar) {
        this.jpc = num;
        this.wd = i2;
        this.ud = ljhVar;
        this.mo = qdlVar;
        qdl(view);
        this.lnr = new AtomicBoolean(false);
        this.mml = new AtomicLong(-1L);
        this.mzz = new AtomicBoolean(false);
    }

    public static ud qdl(boolean z2, Integer num, View view, ljh ljhVar, mzz.qdl qdlVar) {
        return z2 ? new jpc(num, view, ljhVar, qdlVar) : new lnr(num, view, ljhVar, qdlVar);
    }

    public void exu() {
        this.lnr.set(false);
        jpc();
    }

    public boolean fs() {
        return this.lnr.get();
    }

    public void jpc() {
        this.mml.set(-1L);
    }

    public abstract boolean lnr();

    public void mml() {
        if (this.mzz.compareAndSet(false, true)) {
            mml.qdl(this.ud, mzz(), this.mo);
        }
    }

    public abstract int mo();

    public qdl mzz() {
        WeakReference<View> weakReference = this.qdl;
        if (weakReference == null) {
            return new qdl(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new qdl(0, 0, 0.0f) : new qdl(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public Integer rq() {
        return this.jpc;
    }

    public void to() {
        this.tvp = true;
        wd.ud(this);
    }

    public boolean tvp() {
        return this.mzz.get();
    }

    public int ud() {
        if (tvp()) {
            return 1;
        }
        WeakReference<View> weakReference = this.qdl;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.tvp) {
            return 3;
        }
        if (rq().equals(view.getTag(33554433))) {
            return (rq().equals(view.getTag(33554433)) && lnr()) ? 1 : 2;
        }
        to();
        mzz.ud(rq());
        return 3;
    }

    public abstract void ud(int i2);

    public void wd() {
        if (tvp()) {
            return;
        }
        if (!this.lnr.get()) {
            jpc();
        } else if (!this.mml.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.mml.get() >= this.wd) {
            mml();
        }
    }

    public void qdl() {
        if (this.lnr.compareAndSet(false, true)) {
            wd.qdl(this);
        }
    }

    public void qdl(int i2) {
        if (i2 == 4) {
            qdl();
            return;
        }
        if (i2 == 8) {
            exu();
        } else if (i2 == 9) {
            mml();
        } else {
            ud(i2);
        }
    }

    public void qdl(View view) {
        if (view != null) {
            view.setTag(33554433, rq());
        }
        this.qdl = new WeakReference<>(view);
    }
}
