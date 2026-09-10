package com.bytedance.sdk.openadsdk.core.lnr;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.yt;

/* JADX INFO: loaded from: classes3.dex */
public class mo {
    private static float bjy = 0.0f;
    private static float exu = 0.0f;
    private static float jtx = 0.0f;
    private static float rdp = 0.0f;
    public static int to = 8;
    private static long yt;
    public float qdl = -1.0f;
    public float ud = -1.0f;
    public float lnr = -1.0f;
    public float mml = -1.0f;
    public long mzz = -1;
    public long mo = -1;
    public int wd = -1;
    public int jpc = -1024;
    public int tvp = -1;
    public boolean rq = true;
    public SparseArray<lnr.qdl> fs = new SparseArray<>();
    private int jl = 0;
    private int exc = 0;

    static {
        if (yt.qdl() != null) {
            to = yt.ud();
        }
        exu = 0.0f;
        rdp = 0.0f;
        bjy = 0.0f;
        jtx = 0.0f;
        yt = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0072  */
    public void qdl(MotionEvent motionEvent) {
        int i2;
        this.jpc = motionEvent.getDeviceId();
        int i3 = 0;
        this.wd = motionEvent.getToolType(0);
        this.tvp = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i4 = 1;
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                this.lnr = motionEvent.getRawX();
                this.mml = motionEvent.getRawY();
                this.mo = System.currentTimeMillis();
                if (Math.abs(this.lnr - this.jl) >= to || Math.abs(this.mml - this.exc) >= to) {
                    this.rq = false;
                }
                i2 = 3;
            } else if (actionMasked != 2) {
                i3 = actionMasked != 3 ? -1 : 4;
            } else {
                bjy = Math.abs(motionEvent.getX() - exu) + bjy;
                jtx = Math.abs(motionEvent.getY() - rdp) + jtx;
                exu = motionEvent.getX();
                rdp = motionEvent.getY();
                if (System.currentTimeMillis() - yt > 200) {
                    float f = bjy;
                    int i5 = to;
                    if (f <= i5 && jtx <= i5) {
                        i4 = 2;
                    }
                } else {
                    i4 = 2;
                }
                this.lnr = motionEvent.getRawX();
                this.mml = motionEvent.getRawY();
                if (Math.abs(this.lnr - this.jl) >= to || Math.abs(this.mml - this.exc) >= to) {
                    this.rq = false;
                }
                i2 = i4;
            }
            this.fs.put(motionEvent.getActionMasked(), new lnr.qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
        }
        this.jl = (int) motionEvent.getRawX();
        this.exc = (int) motionEvent.getRawY();
        this.qdl = motionEvent.getRawX();
        this.ud = motionEvent.getRawY();
        this.mzz = System.currentTimeMillis();
        this.wd = motionEvent.getToolType(0);
        this.jpc = motionEvent.getDeviceId();
        this.tvp = motionEvent.getSource();
        yt = System.currentTimeMillis();
        this.rq = true;
        i2 = i3;
        this.fs.put(motionEvent.getActionMasked(), new lnr.qdl(i2, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
