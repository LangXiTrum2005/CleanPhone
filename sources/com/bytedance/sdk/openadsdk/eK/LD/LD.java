package com.bytedance.sdk.openadsdk.eK.LD;

import android.view.View;
import androidx.core.view.InputDeviceCompat;
import com.bytedance.sdk.openadsdk.core.model.tD;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public abstract class LD {
    private final AtomicBoolean JXs;
    protected tD LD;
    protected WeakReference<View> Lxb;
    private final Integer OY;
    private volatile boolean QAg = false;
    private final AtomicLong ZU;
    private final int ebl;
    private final JXs.Lxb lc;
    protected final AtomicBoolean lk;

    public LD(Integer num, View view, tD tDVar, int i, JXs.Lxb lxb) {
        this.OY = num;
        this.ebl = i;
        this.LD = tDVar;
        this.lc = lxb;
        Lxb(view);
        this.lk = new AtomicBoolean(false);
        this.ZU = new AtomicLong(-1L);
        this.JXs = new AtomicBoolean(false);
    }

    public static LD Lxb(boolean z, Integer num, View view, tD tDVar, JXs.Lxb lxb) {
        return z ? new OY(num, view, tDVar, lxb) : new lk(num, view, tDVar, lxb);
    }

    public Integer JVA() {
        return this.OY;
    }

    public Lxb JXs() {
        WeakReference<View> weakReference = this.Lxb;
        if (weakReference == null) {
            return new Lxb(-1, -1, -1.0f);
        }
        View view = weakReference.get();
        return view == null ? new Lxb(0, 0, 0.0f) : new Lxb(view.getWidth(), view.getHeight(), view.getAlpha());
    }

    public int LD() {
        if (QAg()) {
            return 1;
        }
        WeakReference<View> weakReference = this.Lxb;
        View view = weakReference != null ? weakReference.get() : null;
        if (view == null || this.QAg) {
            return 3;
        }
        if (JVA().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI))) {
            return (JVA().equals(view.getTag(InputDeviceCompat.SOURCE_HDMI)) && lk()) ? 1 : 2;
        }
        nBu();
        JXs.LD(JVA());
        return 3;
    }

    public abstract void LD(int i);

    public void NXR() {
        this.lk.set(false);
        OY();
    }

    public void OY() {
        this.ZU.set(-1L);
    }

    public boolean QAg() {
        return this.JXs.get();
    }

    public void ZU() {
        if (this.JXs.compareAndSet(false, true)) {
            ZU.Lxb(this.LD, JXs(), this.lc);
        }
    }

    public void ebl() {
        if (QAg()) {
            return;
        }
        if (!this.lk.get()) {
            OY();
        } else if (!this.ZU.compareAndSet(-1L, System.currentTimeMillis()) && System.currentTimeMillis() - this.ZU.get() >= this.ebl) {
            ZU();
        }
    }

    public abstract int lc();

    public abstract boolean lk();

    public void nBu() {
        this.QAg = true;
        ebl.LD(this);
    }

    public boolean sLN() {
        return this.lk.get();
    }

    public void Lxb() {
        if (this.lk.compareAndSet(false, true)) {
            ebl.Lxb(this);
        }
    }

    public void Lxb(int i) {
        if (i == 4) {
            Lxb();
            return;
        }
        if (i == 8) {
            NXR();
        } else if (i == 9) {
            ZU();
        } else {
            LD(i);
        }
    }

    public void Lxb(View view) {
        if (view != null) {
            view.setTag(InputDeviceCompat.SOURCE_HDMI, JVA());
        }
        this.Lxb = new WeakReference<>(view);
    }
}
