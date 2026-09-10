package com.bytedance.adsdk.lr.ri.ri;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class bu implements com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri, tan {
    private final com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> ik;
    private com.bytedance.adsdk.lr.ik.lr.bgr ka;
    private final String lr;
    private final com.bytedance.adsdk.lr.jbs ri;

    public bu(com.bytedance.adsdk.lr.jbs jbsVar, com.bytedance.adsdk.lr.ik.ik.ri riVar, com.bytedance.adsdk.lr.ik.lr.aw awVar) {
        this.ri = jbsVar;
        this.lr = awVar.ri();
        com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> riVarRi = awVar.lr().ri();
        this.ik = riVarRi;
        riVar.ri(riVarRi);
        riVarRi.ri(this);
    }

    public com.bytedance.adsdk.lr.ri.lr.ri<Float, Float> lr() {
        return this.ik;
    }

    @Override // com.bytedance.adsdk.lr.ri.ri.ik
    public void ri(List<ik> list, List<ik> list2) {
    }

    private com.bytedance.adsdk.lr.ik.lr.bgr lr(com.bytedance.adsdk.lr.ik.lr.bgr bgrVar) {
        List<com.bytedance.adsdk.lr.ik.ri> listIk = bgrVar.ik();
        boolean zLr = bgrVar.lr();
        int size = listIk.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.lr.ik.ri riVar = listIk.get(size);
            com.bytedance.adsdk.lr.ik.ri riVar2 = listIk.get(ri(size - 1, listIk.size()));
            PointF pointFIk = (size != 0 || zLr) ? riVar2.ik() : bgrVar.ri();
            i = (((size != 0 || zLr) ? riVar2.lr() : pointFIk).equals(pointFIk) && riVar.ri().equals(pointFIk) && !(!bgrVar.lr() && size == 0 && size == listIk.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.lr.ik.lr.bgr bgrVar2 = this.ka;
        if (bgrVar2 == null || bgrVar2.ik().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.lr.ik.ri());
            }
            this.ka = new com.bytedance.adsdk.lr.ik.lr.bgr(new PointF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), false, arrayList);
        }
        this.ka.ri(zLr);
        return this.ka;
    }

    @Override // com.bytedance.adsdk.lr.ri.lr.ri.InterfaceC0185ri
    public void ri() {
        this.ri.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.lr.ri.ri.tan
    public com.bytedance.adsdk.lr.ik.lr.bgr ri(com.bytedance.adsdk.lr.ik.lr.bgr bgrVar) {
        boolean z;
        List<com.bytedance.adsdk.lr.ik.ri> listIk = bgrVar.ik();
        if (listIk.size() > 2) {
            float fFloatValue = this.ik.xha().floatValue();
            if (fFloatValue != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                com.bytedance.adsdk.lr.ik.lr.bgr bgrVarLr = lr(bgrVar);
                bgrVarLr.ri(bgrVar.ri().x, bgrVar.ri().y);
                List<com.bytedance.adsdk.lr.ik.ri> listIk2 = bgrVarLr.ik();
                boolean zLr = bgrVar.lr();
                int i = 0;
                int i2 = 0;
                while (i < listIk.size()) {
                    com.bytedance.adsdk.lr.ik.ri riVar = listIk.get(i);
                    com.bytedance.adsdk.lr.ik.ri riVar2 = listIk.get(ri(i - 1, listIk.size()));
                    com.bytedance.adsdk.lr.ik.ri riVar3 = listIk.get(ri(i - 2, listIk.size()));
                    PointF pointFIk = (i != 0 || zLr) ? riVar2.ik() : bgrVar.ri();
                    PointF pointFLr = (i != 0 || zLr) ? riVar2.lr() : pointFIk;
                    PointF pointFRi = riVar.ri();
                    PointF pointFIk2 = riVar3.ik();
                    PointF pointFIk3 = riVar.ik();
                    if (!bgrVar.lr() && i == 0) {
                        z = i == listIk.size() + (-1);
                    }
                    if (pointFLr.equals(pointFIk) && pointFRi.equals(pointFIk) && !z) {
                        float f = pointFIk.x;
                        float f2 = f - pointFIk2.x;
                        float f3 = pointFIk.y;
                        float f4 = f3 - pointFIk2.y;
                        float f5 = pointFIk3.x - f;
                        float f6 = pointFIk3.y - f3;
                        float fHypot = (float) Math.hypot(f2, f4);
                        float fHypot2 = (float) Math.hypot(f5, f6);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f7 = pointFIk.x;
                        float f8 = ((pointFIk2.x - f7) * fMin) + f7;
                        float f9 = pointFIk.y;
                        float f10 = ((pointFIk2.y - f9) * fMin) + f9;
                        float f11 = ((pointFIk3.x - f7) * fMin2) + f7;
                        float f12 = ((pointFIk3.y - f9) * fMin2) + f9;
                        float f13 = f8 - ((f8 - f7) * 0.5519f);
                        float f14 = f10 - ((f10 - f9) * 0.5519f);
                        float f15 = f11 - ((f11 - f7) * 0.5519f);
                        float f16 = f12 - ((f12 - f9) * 0.5519f);
                        com.bytedance.adsdk.lr.ik.ri riVar4 = listIk2.get(ri(i2 - 1, listIk2.size()));
                        com.bytedance.adsdk.lr.ik.ri riVar5 = listIk2.get(i2);
                        riVar4.lr(f8, f10);
                        riVar4.ik(f8, f10);
                        if (i == 0) {
                            bgrVarLr.ri(f8, f10);
                        }
                        riVar5.ri(f13, f14);
                        com.bytedance.adsdk.lr.ik.ri riVar6 = listIk2.get(i2 + 1);
                        riVar5.lr(f15, f16);
                        riVar5.ik(f11, f12);
                        riVar6.ri(f11, f12);
                        i2 += 2;
                    } else {
                        com.bytedance.adsdk.lr.ik.ri riVar7 = listIk2.get(ri(i2 - 1, listIk2.size()));
                        com.bytedance.adsdk.lr.ik.ri riVar8 = listIk2.get(i2);
                        riVar7.lr(riVar2.lr().x, riVar2.lr().y);
                        riVar7.ik(riVar2.ik().x, riVar2.ik().y);
                        riVar8.ri(riVar.ri().x, riVar.ri().y);
                        i2++;
                    }
                    i++;
                    listIk = listIk;
                }
                return bgrVarLr;
            }
        }
        return bgrVar;
    }

    private static int lr(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private static int ri(int i, int i2) {
        return i - (lr(i, i2) * i2);
    }
}
