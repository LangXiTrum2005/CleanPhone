package com.bytedance.adsdk.LD.Lxb.LD;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class lk implements Lxb.InterfaceC0024Lxb {
    private final Lxb<Float, Float> JXs;
    private final Lxb<Integer, Integer> LD;
    private final Lxb.InterfaceC0024Lxb Lxb;
    private final Lxb<Float, Float> ZU;
    private boolean ebl = true;
    private final Lxb<Float, Float> lc;
    private final Lxb<Float, Float> lk;

    public lk(Lxb.InterfaceC0024Lxb interfaceC0024Lxb, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.JXs.nBu nbu) {
        this.Lxb = interfaceC0024Lxb;
        Lxb<Integer, Integer> Lxb = nbu.Lxb().Lxb();
        this.LD = Lxb;
        Lxb.Lxb(this);
        lxb.Lxb(Lxb);
        Lxb<Float, Float> Lxb2 = nbu.LD().Lxb();
        this.lk = Lxb2;
        Lxb2.Lxb(this);
        lxb.Lxb(Lxb2);
        Lxb<Float, Float> Lxb3 = nbu.lk().Lxb();
        this.ZU = Lxb3;
        Lxb3.Lxb(this);
        lxb.Lxb(Lxb3);
        Lxb<Float, Float> Lxb4 = nbu.ZU().Lxb();
        this.JXs = Lxb4;
        Lxb4.Lxb(this);
        lxb.Lxb(Lxb4);
        Lxb<Float, Float> Lxb5 = nbu.JXs().Lxb();
        this.lc = Lxb5;
        Lxb5.Lxb(this);
        lxb.Lxb(Lxb5);
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.ebl = true;
        this.Lxb.Lxb();
    }

    public void Lxb(Paint paint) {
        if (this.ebl) {
            this.ebl = false;
            double dFloatValue = ((double) this.ZU.ebl().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.JXs.ebl().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.LD.ebl().intValue();
            paint.setShadowLayer(this.lc.ebl().floatValue(), fSin, fCos, Color.argb(Math.round(this.lk.ebl().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
