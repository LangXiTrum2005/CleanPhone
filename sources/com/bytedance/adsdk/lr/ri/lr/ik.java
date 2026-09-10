package com.bytedance.adsdk.lr.ri.lr;

import android.graphics.Color;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes2.dex */
public class ik implements ri.InterfaceC0185ri {
    private final ri<Float, Float> di;
    private final ri<Float, Float> fi;
    private final ri<Float, Float> ik;
    private final ri<Float, Float> ka;
    private final ri<Integer, Integer> lr;
    private final ri.InterfaceC0185ri ri;
    private boolean xha = true;

    public ik(ri.InterfaceC0185ri interfaceC0185ri, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.fi.qt qtVar) {
        this.ri = interfaceC0185ri;
        ri<Integer, Integer> riVarRi = qtVar.ri().ri();
        this.lr = riVarRi;
        riVarRi.ri(this);
        riVar.ri(riVarRi);
        ri<Float, Float> riVarRi2 = qtVar.lr().ri();
        this.ik = riVarRi2;
        riVarRi2.ri(this);
        riVar.ri(riVarRi2);
        ri<Float, Float> riVarRi3 = qtVar.ik().ri();
        this.ka = riVarRi3;
        riVarRi3.ri(this);
        riVar.ri(riVarRi3);
        ri<Float, Float> riVarRi4 = qtVar.ka().ri();
        this.fi = riVarRi4;
        riVarRi4.ri(this);
        riVar.ri(riVarRi4);
        ri<Float, Float> riVarRi5 = qtVar.fi().ri();
        this.di = riVarRi5;
        riVarRi5.ri(this);
        riVar.ri(riVarRi5);
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.xha = true;
        this.ri.ri();
    }

    public void ri(Paint paint) {
        if (this.xha) {
            this.xha = false;
            double dFloatValue = ((double) this.ka.xha().floatValue()) * 0.017453292519943295d;
            float fFloatValue = this.fi.xha().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.lr.xha().intValue();
            paint.setShadowLayer(this.di.xha().floatValue(), fSin, fCos, Color.argb(Math.round(this.ik.xha().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }
}
