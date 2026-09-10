package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class slm implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, aw, fi, qt, sf {
    private final boolean di;
    private final String fi;
    private final com.bytedance.adsdk.lr.jbs ik;
    private final com.bytedance.adsdk.lr.ri.lr.slm jbs;
    private final com.bytedance.adsdk.lr.ik.ik.ri ka;
    private final com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> mj;
    private ka qt;
    private final com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> xha;
    private final Matrix ri = new Matrix();
    private final Path lr = new Path();

    public slm(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.co coVar) {
        this.ik = jbsVar;
        this.ka = riVar;
        this.fi = coVar.ri();
        this.di = coVar.fi();
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = coVar.lr().ri();
        this.xha = riVarRi;
        riVar.ri(riVarRi);
        riVarRi.ri(this);
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi2 = coVar.ik().ri();
        this.mj = riVarRi2;
        riVar.ri(riVarRi2);
        riVarRi2.ri(this);
        com.bytedance.adsdk.lr.ri.lr.slm slmVarQt = coVar.ka().qt();
        this.jbs = slmVarQt;
        slmVarQt.ri(riVar);
        slmVarQt.ri(this);
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.aw
    public Path ka() {
        Path pathKa = this.qt.ka();
        this.lr.reset();
        float fFloatValue = this.xha.xha().floatValue();
        float fFloatValue2 = this.mj.xha().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.ri.set(this.jbs.lr(i + fFloatValue2));
            this.lr.addPath(pathKa, this.ri);
        }
        return this.lr;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.qt
    public void ri(ListIterator<ik> listIterator) {
        if (this.qt != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.qt = new ka(this.ik, this.ka, "Repeater", this.di, arrayList, null);
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        this.qt.ri(list, list2);
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        float fFloatValue = this.xha.xha().floatValue();
        float fFloatValue2 = this.mj.xha().floatValue();
        float fFloatValue3 = this.jbs.lr().xha().floatValue() / 100.0f;
        float fFloatValue4 = this.jbs.ik().xha().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.ri.set(matrix);
            float f = i2;
            this.ri.preConcat(this.jbs.lr(f + fFloatValue2));
            this.qt.ri(canvas, this.ri, (int) (i * com.bytedance.adsdk.lr.di.fi.ri(fFloatValue3, fFloatValue4, f / fFloatValue)));
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        this.qt.ri(rectF, matrix, z);
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.ik.invalidateSelf();
    }
}
