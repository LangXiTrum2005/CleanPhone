package com.bytedance.adsdk.ud.qdl.ud;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public class lnr implements qdl.InterfaceC0060qdl {
    private final qdl<Float, Float> lnr;
    private final qdl<Float, Float> mml;
    private final qdl<Float, Float> mo;
    private final qdl<Float, Float> mzz;
    private final qdl.InterfaceC0060qdl qdl;
    private final qdl<Integer, Integer> ud;
    private boolean wd = true;

    public lnr(qdl.InterfaceC0060qdl interfaceC0060qdl, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.mzz.to toVar) {
        this.qdl = interfaceC0060qdl;
        qdl<Integer, Integer> qdlVarQdl = toVar.qdl().qdl();
        this.ud = qdlVarQdl;
        qdlVarQdl.qdl(this);
        qdlVar.qdl(qdlVarQdl);
        qdl<Float, Float> qdlVarQdl2 = toVar.ud().qdl();
        this.lnr = qdlVarQdl2;
        qdlVarQdl2.qdl(this);
        qdlVar.qdl(qdlVarQdl2);
        qdl<Float, Float> qdlVarQdl3 = toVar.lnr().qdl();
        this.mml = qdlVarQdl3;
        qdlVarQdl3.qdl(this);
        qdlVar.qdl(qdlVarQdl3);
        qdl<Float, Float> qdlVarQdl4 = toVar.mml().qdl();
        this.mzz = qdlVarQdl4;
        qdlVarQdl4.qdl(this);
        qdlVar.qdl(qdlVarQdl4);
        qdl<Float, Float> qdlVarQdl5 = toVar.mzz().qdl();
        this.mo = qdlVarQdl5;
        qdlVarQdl5.qdl(this);
        qdlVar.qdl(qdlVarQdl5);
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.wd = true;
        this.qdl.qdl();
    }

    public void qdl(Paint paint) {
        if (this.wd) {
            this.wd = false;
            double dFloatValue = ((double) this.mml.wd().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.mzz.wd().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.ud.wd().intValue();
            paint.setShadowLayer(this.mo.wd().floatValue(), fSin, fCos, Color.argb(Math.round(this.lnr.wd().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
