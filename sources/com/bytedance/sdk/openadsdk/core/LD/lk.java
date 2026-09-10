package com.bytedance.sdk.openadsdk.core.LD;

import android.graphics.Point;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.core.settings.sLN;

/* JADX INFO: loaded from: classes2.dex */
public abstract class lk implements View.OnClickListener, View.OnTouchListener {
    private static long JXs = 0;
    private static float LD = 0.0f;
    private static float Lxb = 0.0f;
    private static float ZU = 0.0f;
    private static float lk = 0.0f;
    protected static int nE = 8;
    protected View hg;
    protected float Sfi = -1.0f;
    protected float HD = -1.0f;
    protected float eK = -1.0f;
    protected float aH = -1.0f;
    protected long CSn = -1;
    protected long id = -1;
    protected int foI = -1;
    protected int KPU = -1024;
    protected int Ivz = -1;
    protected boolean xan = true;
    public SparseArray<Lxb> CG = new SparseArray<>();
    private int lc = 0;
    private int ebl = 0;

    public static class Lxb {
        public double LD;
        public int Lxb;
        public long ZU;
        public double lk;

        public Lxb(int i, double d, double d2, long j) {
            this.Lxb = i;
            this.LD = d;
            this.lk = d2;
            this.ZU = j;
        }
    }

    static {
        if (kqm.Lxb() != null) {
            nE = kqm.LD();
        }
        Lxb = 0.0f;
        LD = 0.0f;
        lk = 0.0f;
        ZU = 0.0f;
        JXs = 0L;
    }

    private boolean Lxb(View view, Point point) {
        int i;
        int i2;
        int i3;
        int i4;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i5 = 0; i5 < viewGroup.getChildCount(); i5++) {
                View childAt = viewGroup.getChildAt(i5);
                if (LD.lk(childAt)) {
                    int[] iArr = new int[2];
                    childAt.getLocationOnScreen(iArr);
                    return view.isShown() && (i = point.x) >= (i2 = iArr[0]) && i <= childAt.getWidth() + i2 && (i3 = point.y) >= (i4 = iArr[1]) && i3 <= childAt.getHeight() + i4;
                }
                if (Lxb(childAt, point)) {
                    return true;
                }
            }
        }
        return false;
    }

    public abstract void Lxb(View view, float f, float f2, float f3, float f4, SparseArray<Lxb> sparseArray, boolean z);

    public boolean ebl() {
        return this.xan;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (sLN.Lxb()) {
            Lxb(view, this.Sfi, this.HD, this.eK, this.aH, this.CG, this.xan);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        this.KPU = motionEvent.getDeviceId();
        this.foI = motionEvent.getToolType(0);
        this.Ivz = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 1;
        if (actionMasked == 0) {
            this.lc = (int) motionEvent.getRawX();
            this.ebl = (int) motionEvent.getRawY();
            this.Sfi = motionEvent.getRawX();
            this.HD = motionEvent.getRawY();
            this.CSn = System.currentTimeMillis();
            this.foI = motionEvent.getToolType(0);
            this.KPU = motionEvent.getDeviceId();
            this.Ivz = motionEvent.getSource();
            JXs = System.currentTimeMillis();
            this.xan = true;
            this.hg = view;
            com.bytedance.sdk.openadsdk.core.QAg.lk.Lxb(motionEvent);
            i = 0;
        } else if (actionMasked == 1) {
            this.eK = motionEvent.getRawX();
            this.aH = motionEvent.getRawY();
            this.id = System.currentTimeMillis();
            if (Math.abs(this.eK - this.lc) >= nE || Math.abs(this.aH - this.ebl) >= nE) {
                this.xan = false;
            }
            Point point = new Point((int) this.eK, (int) this.aH);
            if (view != null && !LD.lk(view) && Lxb((View) view.getParent(), point)) {
                return true;
            }
            i = 3;
        } else if (actionMasked != 2) {
            i = actionMasked != 3 ? -1 : 4;
        } else {
            lk = Math.abs(motionEvent.getX() - Lxb) + lk;
            ZU = Math.abs(motionEvent.getY() - LD) + ZU;
            Lxb = motionEvent.getX();
            LD = motionEvent.getY();
            if (System.currentTimeMillis() - JXs > 200) {
                float f = lk;
                int i3 = nE;
                if (f <= i3 && ZU <= i3) {
                    i2 = 2;
                }
            } else {
                i2 = 2;
            }
            this.eK = motionEvent.getRawX();
            this.aH = motionEvent.getRawY();
            if (Math.abs(this.eK - this.lc) >= nE || Math.abs(this.aH - this.ebl) >= nE) {
                this.xan = false;
            }
            i = i2;
        }
        this.CG.put(motionEvent.getActionMasked(), new Lxb(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        return false;
    }
}
