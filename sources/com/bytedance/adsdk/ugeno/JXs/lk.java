package com.bytedance.adsdk.ugeno.JXs;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lk {
    int IeN;
    float JVA;
    int JXs;
    int NXR;
    int OY;
    int QAg;
    int VVE;
    boolean brP;
    int ebl;
    boolean kqm;
    int lc;
    float nBu;
    int sLN;
    int Lxb = Integer.MAX_VALUE;
    int LD = Integer.MAX_VALUE;
    int lk = Integer.MIN_VALUE;
    int ZU = Integer.MIN_VALUE;
    List<Integer> STP = new ArrayList();

    public int LD() {
        return this.OY - this.QAg;
    }

    public int Lxb() {
        return this.ebl;
    }

    public void Lxb(View view, int i, int i2, int i3, int i4) {
        LD ld = (LD) view.getLayoutParams();
        this.Lxb = Math.min(this.Lxb, (view.getLeft() - ld.NXR()) - i);
        this.LD = Math.min(this.LD, (view.getTop() - ld.STP()) - i2);
        this.lk = Math.max(this.lk, ld.IeN() + view.getRight() + i3);
        this.ZU = Math.max(this.ZU, ld.VVE() + view.getBottom() + i4);
    }
}
