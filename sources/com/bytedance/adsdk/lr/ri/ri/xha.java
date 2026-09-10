package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class xha implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, fi, sf {
    private com.bytedance.adsdk.lr.ri.lr.ik aw;

    /* JADX INFO: renamed from: co, reason: collision with root package name */
    private com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> f18004co;
    private final boolean di;
    private final String fi;
    private final Paint ik;
    private final com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> jbs;
    private final com.bytedance.adsdk.lr.ik.ik.ri ka;
    private final Path lr;
    private final com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> mj;
    private com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> qt;
    float ri;
    private final com.bytedance.adsdk.lr.jbs sf;
    private final List<aw> xha;

    public xha(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.vr vrVar) {
        Path path = new Path();
        this.lr = path;
        this.ik = new com.bytedance.adsdk.lr.ri.ri(1);
        this.xha = new ArrayList();
        this.ka = riVar;
        this.fi = vrVar.ri();
        this.di = vrVar.fi();
        this.sf = jbsVar;
        if (riVar.qt() != null) {
            com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = riVar.qt().ri().ri();
            this.f18004co = riVarRi;
            riVarRi.ri(this);
            riVar.ri(this.f18004co);
        }
        if (riVar.sf() != null) {
            this.aw = new com.bytedance.adsdk.lr.ri.lr.ik(this, riVar, riVar.sf());
        }
        if (vrVar.lr() == null || vrVar.ik() == null) {
            this.mj = null;
            this.jbs = null;
            return;
        }
        path.setFillType(vrVar.ka());
        com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVarRi2 = vrVar.lr().ri();
        this.mj = riVarRi2;
        riVarRi2.ri(this);
        riVar.ri(riVarRi2);
        com.bytedance.adsdk.lr.ri.lr.ri<Integer, Integer> riVarRi3 = vrVar.ik().ri();
        this.jbs = riVarRi3;
        riVarRi3.ri(this);
        riVar.ri(riVarRi3);
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.sf.invalidateSelf();
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
        for (int i = 0; i < list2.size(); i++) {
            ik ikVar = list2.get(i);
            if (ikVar instanceof aw) {
                this.xha.add((aw) ikVar);
            }
        }
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(Canvas canvas, Matrix matrix, int i) {
        if (this.di) {
            return;
        }
        com.bytedance.adsdk.lr.fi.ri("FillContent#draw");
        this.ik.setColor((com.bytedance.adsdk.lr.di.fi.ri((int) ((((i / 255.0f) * this.jbs.xha().intValue()) / 100.0f) * 255.0f), 0, 255) << 24) | (((com.bytedance.adsdk.lr.ri.lr.lr) this.mj).jbs() & 16777215));
        com.bytedance.adsdk.lr.ri.lr.ri<ColorFilter, ColorFilter> riVar = this.qt;
        if (riVar != null) {
            this.ik.setColorFilter(riVar.xha());
        }
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVar2 = this.f18004co;
        if (riVar2 != null) {
            float fFloatValue = riVar2.xha().floatValue();
            if (fFloatValue == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                this.ik.setMaskFilter(null);
            } else if (fFloatValue != this.ri) {
                this.ik.setMaskFilter(this.ka.lr(fFloatValue));
            }
            this.ri = fFloatValue;
        }
        com.bytedance.adsdk.lr.ri.lr.ik ikVar = this.aw;
        if (ikVar != null) {
            ikVar.ri(this.ik);
        }
        this.lr.reset();
        for (int i2 = 0; i2 < this.xha.size(); i2++) {
            this.lr.addPath(this.xha.get(i2).ka(), matrix);
        }
        canvas.drawPath(this.lr, this.ik);
        com.bytedance.adsdk.lr.fi.lr("FillContent#draw");
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.fi
    public void ri(RectF rectF, Matrix matrix, boolean z) {
        this.lr.reset();
        for (int i = 0; i < this.xha.size(); i++) {
            this.lr.addPath(this.xha.get(i).ka(), matrix);
        }
        this.lr.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }
}
