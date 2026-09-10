package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class ac extends ri {
    private final boolean di;
    private final String fi;
    private final com.bytedance.adsdk.lr.ik.ik.ri ka;
    private com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> mj;
    private final com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> xha;

    public ac(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.nr nrVar) {
        super(jbsVar, riVar, nrVar.xha().ri(), nrVar.mj().ri(), nrVar.jbs(), nrVar.ik(), nrVar.ka(), nrVar.fi(), nrVar.di());
        this.ka = riVar;
        this.fi = nrVar.ri();
        this.di = nrVar.qt();
        com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVarRi = nrVar.lr().ri();
        this.xha = riVarRi;
        riVarRi.ri(this);
        riVar.ri(riVarRi);
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        if (this.di) {
            return;
        }
        this.lr.setColor(((com.bytedance.adsdk.lr.ri.lr.lr) this.xha).jbs());
        com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> riVar = this.mj;
        if (riVar != null) {
            this.lr.setColorFilter(riVar.xha());
        }
        super.ri(canvas, matrix, i);
    }
}
