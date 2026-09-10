package com.bytedance.adsdk.LD.lk.Lxb;

import android.graphics.PointF;
import com.bytedance.adsdk.LD.Lxb.LD.VVE;

/* JADX INFO: loaded from: classes.dex */
public class sLN implements com.bytedance.adsdk.LD.lk.LD.lk {
    private final ZU JXs;
    private final NXR<PointF, PointF> LD;
    private final JXs Lxb;
    private final LD OY;
    private final LD QAg;
    private final LD ZU;
    private final LD ebl;
    private final LD lc;
    private final ebl lk;

    public sLN() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public ZU JXs() {
        return this.JXs;
    }

    public NXR<PointF, PointF> LD() {
        return this.LD;
    }

    @Override // com.bytedance.adsdk.LD.lk.LD.lk
    public com.bytedance.adsdk.LD.Lxb.Lxb.lk Lxb(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.ebl eblVar, com.bytedance.adsdk.LD.lk.lk.Lxb lxb) {
        return null;
    }

    public LD OY() {
        return this.lc;
    }

    public LD QAg() {
        return this.ebl;
    }

    public LD ZU() {
        return this.ZU;
    }

    public LD ebl() {
        return this.QAg;
    }

    public LD lc() {
        return this.OY;
    }

    public ebl lk() {
        return this.lk;
    }

    public VVE nBu() {
        return new VVE(this);
    }

    public sLN(JXs jXs, NXR<PointF, PointF> nxr, ebl eblVar, LD ld, ZU zu, LD ld2, LD ld3, LD ld4, LD ld5) {
        this.Lxb = jXs;
        this.LD = nxr;
        this.lk = eblVar;
        this.ZU = ld;
        this.JXs = zu;
        this.OY = ld2;
        this.QAg = ld3;
        this.lc = ld4;
        this.ebl = ld5;
    }

    public JXs Lxb() {
        return this.Lxb;
    }
}
