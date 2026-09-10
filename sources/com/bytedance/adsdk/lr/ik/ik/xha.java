package com.bytedance.adsdk.lr.ik.ik;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.lr.ik.lr.slm;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xha extends ri {
    private final lr mj;
    private final com.bytedance.adsdk.lr.ri.ri.ka xha;

    public xha(com.bytedance.adsdk.lr.jbs jbsVar, fi fiVar, lr lrVar, com.bytedance.adsdk.lr.xha xhaVar) {
        super(jbsVar, fiVar);
        this.mj = lrVar;
        com.bytedance.adsdk.lr.ri.ri.ka kaVar = new com.bytedance.adsdk.lr.ri.ri.ka(jbsVar, this, new slm("__container", fiVar.bgr(), false), xhaVar);
        this.xha = kaVar;
        List<com.bytedance.adsdk.lr.ri.ri.ik> list = Collections.EMPTY_LIST;
        kaVar.ri(list, list);
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public void lr(Canvas canvas, Matrix matrix, int i) {
        super.lr(canvas, matrix, i);
        this.xha.ri(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public com.bytedance.adsdk.lr.ik.lr.ri qt() {
        com.bytedance.adsdk.lr.ik.lr.ri riVarQt = super.qt();
        return riVarQt != null ? riVarQt : this.mj.qt();
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri, com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        super.ri(rectF, matrix, z);
        this.xha.ri(rectF, this.ri, z);
    }

    @Override // com.bytedance.adsdk.lr.ik.ik.ri
    public com.bytedance.adsdk.lr.fi.qt sf() {
        com.bytedance.adsdk.lr.fi.qt qtVarSf = super.sf();
        return qtVarSf != null ? qtVarSf : this.mj.sf();
    }
}
