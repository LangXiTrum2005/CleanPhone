package com.bytedance.sdk.openadsdk.core.LD;

import android.util.SparseArray;
import android.view.MotionEvent;
import com.bytedance.sdk.openadsdk.core.kqm;

/* JADX INFO: loaded from: classes2.dex */
public class lc {
    private static float IeN = 0.0f;
    private static float NXR = 0.0f;
    private static float STP = 0.0f;
    private static float VVE = 0.0f;
    private static long kqm = 0;
    public static int nBu = 8;
    public float Lxb = -1.0f;
    public float LD = -1.0f;
    public float lk = -1.0f;
    public float ZU = -1.0f;
    public long JXs = -1;
    public long lc = -1;
    public int ebl = -1;
    public int OY = -1024;
    public int QAg = -1;
    public boolean JVA = true;
    public SparseArray<lk.Lxb> sLN = new SparseArray<>();
    private int brP = 0;
    private int tD = 0;

    static {
        if (kqm.Lxb() != null) {
            nBu = kqm.LD();
        }
        NXR = 0.0f;
        STP = 0.0f;
        IeN = 0.0f;
        VVE = 0.0f;
        kqm = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0074  */
    public void Lxb(MotionEvent motionEvent) {
        int i;
        this.OY = motionEvent.getDeviceId();
        this.ebl = motionEvent.getToolType(0);
        this.QAg = motionEvent.getSource();
        int actionMasked = motionEvent.getActionMasked();
        int i2 = 1;
        if (actionMasked == 0) {
            this.brP = (int) motionEvent.getRawX();
            this.tD = (int) motionEvent.getRawY();
            this.Lxb = motionEvent.getRawX();
            this.LD = motionEvent.getRawY();
            this.JXs = System.currentTimeMillis();
            this.ebl = motionEvent.getToolType(0);
            this.OY = motionEvent.getDeviceId();
            this.QAg = motionEvent.getSource();
            kqm = System.currentTimeMillis();
            this.JVA = true;
            i = 0;
        } else if (actionMasked == 1) {
            this.lk = motionEvent.getRawX();
            this.ZU = motionEvent.getRawY();
            this.lc = System.currentTimeMillis();
            if (Math.abs(this.lk - this.brP) >= nBu || Math.abs(this.ZU - this.tD) >= nBu) {
                this.JVA = false;
            }
            i = 3;
        } else if (actionMasked != 2) {
            i = actionMasked != 3 ? -1 : 4;
        } else {
            IeN = Math.abs(motionEvent.getX() - NXR) + IeN;
            VVE = Math.abs(motionEvent.getY() - STP) + VVE;
            NXR = motionEvent.getX();
            STP = motionEvent.getY();
            if (System.currentTimeMillis() - kqm > 200) {
                float f = IeN;
                int i3 = nBu;
                if (f <= i3 && VVE <= i3) {
                    i2 = 2;
                }
            } else {
                i2 = 2;
            }
            this.lk = motionEvent.getRawX();
            this.ZU = motionEvent.getRawY();
            if (Math.abs(this.lk - this.brP) >= nBu || Math.abs(this.ZU - this.tD) >= nBu) {
                this.JVA = false;
            }
            i = i2;
        }
        this.sLN.put(motionEvent.getActionMasked(), new lk.Lxb(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
    }
}
