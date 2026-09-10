package com.bytedance.adsdk.ud.qdl.qdl;

import android.graphics.PointF;
import android.support.v4.media.a;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class yt implements exc, com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl {
    private final com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> lnr;
    private com.bytedance.adsdk.ud.lnr.ud.rdp mml;
    private final com.bytedance.adsdk.ud.tvp qdl;
    private final String ud;

    public yt(com.bytedance.adsdk.ud.tvp tvpVar, com.bytedance.adsdk.ud.lnr.lnr.qdl qdlVar, com.bytedance.adsdk.ud.lnr.ud.exu exuVar) {
        this.qdl = tvpVar;
        this.ud = exuVar.qdl();
        com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> qdlVarQdl = exuVar.ud().qdl();
        this.lnr = qdlVarQdl;
        qdlVar.qdl(qdlVarQdl);
        qdlVarQdl.qdl(this);
    }

    @Override // com.bytedance.adsdk.ud.qdl.qdl.lnr
    public void qdl(List<lnr> list, List<lnr> list2) {
    }

    public com.bytedance.adsdk.ud.qdl.ud.qdl<Float, Float> ud() {
        return this.lnr;
    }

    private com.bytedance.adsdk.ud.lnr.ud.rdp ud(com.bytedance.adsdk.ud.lnr.ud.rdp rdpVar) {
        List<com.bytedance.adsdk.ud.lnr.qdl> listLnr = rdpVar.lnr();
        boolean zUd = rdpVar.ud();
        int size = listLnr.size() - 1;
        int i2 = 0;
        while (size >= 0) {
            com.bytedance.adsdk.ud.lnr.qdl qdlVar = listLnr.get(size);
            com.bytedance.adsdk.ud.lnr.qdl qdlVar2 = listLnr.get(qdl(size - 1, listLnr.size()));
            PointF pointFLnr = (size != 0 || zUd) ? qdlVar2.lnr() : rdpVar.qdl();
            i2 = (((size != 0 || zUd) ? qdlVar2.ud() : pointFLnr).equals(pointFLnr) && qdlVar.qdl().equals(pointFLnr) && !(!rdpVar.ud() && size == 0 && size == listLnr.size() - 1)) ? i2 + 2 : i2 + 1;
            size--;
        }
        com.bytedance.adsdk.ud.lnr.ud.rdp rdpVar2 = this.mml;
        if (rdpVar2 == null || rdpVar2.lnr().size() != i2) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new com.bytedance.adsdk.ud.lnr.qdl());
            }
            this.mml = new com.bytedance.adsdk.ud.lnr.ud.rdp(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.mml.qdl(zUd);
        return this.mml;
    }

    @Override // com.bytedance.adsdk.ud.qdl.ud.qdl.InterfaceC0060qdl
    public void qdl() {
        this.qdl.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a1  */
    @Override // com.bytedance.adsdk.ud.qdl.qdl.exc
    public com.bytedance.adsdk.ud.lnr.ud.rdp qdl(com.bytedance.adsdk.ud.lnr.ud.rdp rdpVar) {
        boolean z2;
        List<com.bytedance.adsdk.ud.lnr.qdl> listLnr = rdpVar.lnr();
        if (listLnr.size() > 2) {
            float fFloatValue = this.lnr.wd().floatValue();
            if (fFloatValue != 0.0f) {
                com.bytedance.adsdk.ud.lnr.ud.rdp rdpVarUd = ud(rdpVar);
                rdpVarUd.qdl(rdpVar.qdl().x, rdpVar.qdl().y);
                List<com.bytedance.adsdk.ud.lnr.qdl> listLnr2 = rdpVarUd.lnr();
                boolean zUd = rdpVar.ud();
                int i2 = 0;
                int i3 = 0;
                while (i2 < listLnr.size()) {
                    com.bytedance.adsdk.ud.lnr.qdl qdlVar = listLnr.get(i2);
                    com.bytedance.adsdk.ud.lnr.qdl qdlVar2 = listLnr.get(qdl(i2 - 1, listLnr.size()));
                    com.bytedance.adsdk.ud.lnr.qdl qdlVar3 = listLnr.get(qdl(i2 - 2, listLnr.size()));
                    PointF pointFLnr = (i2 != 0 || zUd) ? qdlVar2.lnr() : rdpVar.qdl();
                    PointF pointFUd = (i2 != 0 || zUd) ? qdlVar2.ud() : pointFLnr;
                    PointF pointFQdl = qdlVar.qdl();
                    PointF pointFLnr2 = qdlVar3.lnr();
                    PointF pointFLnr3 = qdlVar.lnr();
                    if (!rdpVar.ud() && i2 == 0) {
                        z2 = i2 == listLnr.size() + (-1);
                    }
                    if (pointFUd.equals(pointFLnr) && pointFQdl.equals(pointFLnr) && !z2) {
                        float f = pointFLnr.x;
                        float f2 = f - pointFLnr2.x;
                        float f3 = pointFLnr.y;
                        float f4 = f3 - pointFLnr2.y;
                        float f5 = pointFLnr3.x - f;
                        float f6 = pointFLnr3.y - f3;
                        float fHypot = (float) Math.hypot(f2, f4);
                        float fHypot2 = (float) Math.hypot(f5, f6);
                        float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                        float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                        float f7 = pointFLnr.x;
                        float fA = a.a(pointFLnr2.x, f7, fMin, f7);
                        float f8 = pointFLnr.y;
                        float fA2 = a.a(pointFLnr2.y, f8, fMin, f8);
                        float fA3 = a.a(pointFLnr3.x, f7, fMin2, f7);
                        float fA4 = a.a(pointFLnr3.y, f8, fMin2, f8);
                        float f9 = fA - ((fA - f7) * 0.5519f);
                        float f10 = fA2 - ((fA2 - f8) * 0.5519f);
                        float f11 = fA3 - ((fA3 - f7) * 0.5519f);
                        float f12 = fA4 - ((fA4 - f8) * 0.5519f);
                        com.bytedance.adsdk.ud.lnr.qdl qdlVar4 = listLnr2.get(qdl(i3 - 1, listLnr2.size()));
                        com.bytedance.adsdk.ud.lnr.qdl qdlVar5 = listLnr2.get(i3);
                        qdlVar4.ud(fA, fA2);
                        qdlVar4.lnr(fA, fA2);
                        if (i2 == 0) {
                            rdpVarUd.qdl(fA, fA2);
                        }
                        qdlVar5.qdl(f9, f10);
                        com.bytedance.adsdk.ud.lnr.qdl qdlVar6 = listLnr2.get(i3 + 1);
                        qdlVar5.ud(f11, f12);
                        qdlVar5.lnr(fA3, fA4);
                        qdlVar6.qdl(fA3, fA4);
                        i3 += 2;
                    } else {
                        com.bytedance.adsdk.ud.lnr.qdl qdlVar7 = listLnr2.get(qdl(i3 - 1, listLnr2.size()));
                        com.bytedance.adsdk.ud.lnr.qdl qdlVar8 = listLnr2.get(i3);
                        qdlVar7.ud(qdlVar2.ud().x, qdlVar2.ud().y);
                        qdlVar7.lnr(qdlVar2.lnr().x, qdlVar2.lnr().y);
                        qdlVar8.qdl(qdlVar.qdl().x, qdlVar.qdl().y);
                        i3++;
                    }
                    i2++;
                    listLnr = listLnr;
                }
                return rdpVarUd;
            }
        }
        return rdpVar;
    }

    private static int ud(int i2, int i3) {
        int i4 = i2 / i3;
        return ((i2 ^ i3) >= 0 || i3 * i4 == i2) ? i4 : i4 - 1;
    }

    private static int qdl(int i2, int i3) {
        return i2 - (ud(i2, i3) * i3);
    }
}
