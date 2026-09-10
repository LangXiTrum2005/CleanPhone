package com.bytedance.adsdk.LD.Lxb.Lxb;

import android.graphics.PointF;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5044xl;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class kqm implements com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb, tD {
    private final String LD;
    private final com.bytedance.adsdk.LD.QAg Lxb;
    private com.bytedance.adsdk.LD.lk.LD.STP ZU;
    private final com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> lk;

    public kqm(com.bytedance.adsdk.LD.QAg qAg, com.bytedance.adsdk.LD.lk.lk.Lxb lxb, com.bytedance.adsdk.LD.lk.LD.NXR nxr) {
        this.Lxb = qAg;
        this.LD = nxr.Lxb();
        com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> Lxb = nxr.LD().Lxb();
        this.lk = Lxb;
        lxb.Lxb(Lxb);
        Lxb.Lxb(this);
    }

    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<Float, Float> LD() {
        return this.lk;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.lk
    public void Lxb(List<lk> list, List<lk> list2) {
    }

    private com.bytedance.adsdk.LD.lk.LD.STP LD(com.bytedance.adsdk.LD.lk.LD.STP stp) {
        List<com.bytedance.adsdk.LD.lk.Lxb> listLk = stp.lk();
        boolean zLD = stp.LD();
        int size = listLk.size() - 1;
        int i = 0;
        while (size >= 0) {
            com.bytedance.adsdk.LD.lk.Lxb lxb = listLk.get(size);
            com.bytedance.adsdk.LD.lk.Lxb lxb2 = listLk.get(Lxb(size - 1, listLk.size()));
            PointF pointFLk = (size != 0 || zLD) ? lxb2.lk() : stp.Lxb();
            i = (((size != 0 || zLD) ? lxb2.LD() : pointFLk).equals(pointFLk) && lxb.Lxb().equals(pointFLk) && !(!stp.LD() && size == 0 && size == listLk.size() - 1)) ? i + 2 : i + 1;
            size--;
        }
        com.bytedance.adsdk.LD.lk.LD.STP stp2 = this.ZU;
        if (stp2 == null || stp2.lk().size() != i) {
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 < i; i2++) {
                arrayList.add(new com.bytedance.adsdk.LD.lk.Lxb());
            }
            this.ZU = new com.bytedance.adsdk.LD.lk.LD.STP(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.ZU.Lxb(zLD);
        return this.ZU;
    }

    @Override // com.bytedance.adsdk.LD.Lxb.LD.Lxb.InterfaceC0024Lxb
    public void Lxb() {
        this.Lxb.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:26:0x009f  */
    @Override // com.bytedance.adsdk.LD.Lxb.Lxb.tD
    public com.bytedance.adsdk.LD.lk.LD.STP Lxb(com.bytedance.adsdk.LD.lk.LD.STP stp) {
        boolean z;
        List<com.bytedance.adsdk.LD.lk.Lxb> listLk = stp.lk();
        if (listLk.size() <= 2) {
            return stp;
        }
        float fFloatValue = this.lk.ebl().floatValue();
        if (fFloatValue == 0.0f) {
            return stp;
        }
        com.bytedance.adsdk.LD.lk.LD.STP stpLD = LD(stp);
        stpLD.Lxb(stp.Lxb().x, stp.Lxb().y);
        List<com.bytedance.adsdk.LD.lk.Lxb> listLk2 = stpLD.lk();
        boolean zLD = stp.LD();
        int i = 0;
        int i2 = 0;
        while (i < listLk.size()) {
            com.bytedance.adsdk.LD.lk.Lxb lxb = listLk.get(i);
            com.bytedance.adsdk.LD.lk.Lxb lxb2 = listLk.get(Lxb(i - 1, listLk.size()));
            com.bytedance.adsdk.LD.lk.Lxb lxb3 = listLk.get(Lxb(i - 2, listLk.size()));
            PointF pointFLk = (i != 0 || zLD) ? lxb2.lk() : stp.Lxb();
            PointF pointFLD = (i != 0 || zLD) ? lxb2.LD() : pointFLk;
            PointF pointFLxb = lxb.Lxb();
            PointF pointFLk2 = lxb3.lk();
            PointF pointFLk3 = lxb.lk();
            if (!stp.LD() && i == 0) {
                z = i == listLk.size() + (-1);
            }
            if (pointFLD.equals(pointFLk) && pointFLxb.equals(pointFLk) && !z) {
                float f = pointFLk.x;
                float f2 = f - pointFLk2.x;
                float f3 = pointFLk.y;
                float f4 = f3 - pointFLk2.y;
                float f5 = pointFLk3.x - f;
                float f6 = pointFLk3.y - f3;
                float fHypot = (float) Math.hypot(f2, f4);
                float fHypot2 = (float) Math.hypot(f5, f6);
                float fMin = Math.min(fFloatValue / fHypot, 0.5f);
                float fMin2 = Math.min(fFloatValue / fHypot2, 0.5f);
                float f7 = pointFLk.x;
                float fW = AbstractC5044xl.w(pointFLk2.x, f7, fMin, f7);
                float f8 = pointFLk.y;
                float fW2 = AbstractC5044xl.w(pointFLk2.y, f8, fMin, f8);
                float fW3 = AbstractC5044xl.w(pointFLk3.x, f7, fMin2, f7);
                float fW4 = AbstractC5044xl.w(pointFLk3.y, f8, fMin2, f8);
                float f9 = fW - ((fW - f7) * 0.5519f);
                float f10 = fW2 - ((fW2 - f8) * 0.5519f);
                float f11 = fW3 - ((fW3 - f7) * 0.5519f);
                float f12 = fW4 - ((fW4 - f8) * 0.5519f);
                com.bytedance.adsdk.LD.lk.Lxb lxb4 = listLk2.get(Lxb(i2 - 1, listLk2.size()));
                com.bytedance.adsdk.LD.lk.Lxb lxb5 = listLk2.get(i2);
                lxb4.LD(fW, fW2);
                lxb4.lk(fW, fW2);
                if (i == 0) {
                    stpLD.Lxb(fW, fW2);
                }
                lxb5.Lxb(f9, f10);
                com.bytedance.adsdk.LD.lk.Lxb lxb6 = listLk2.get(i2 + 1);
                lxb5.LD(f11, f12);
                lxb5.lk(fW3, fW4);
                lxb6.Lxb(fW3, fW4);
                i2 += 2;
            } else {
                com.bytedance.adsdk.LD.lk.Lxb lxb7 = listLk2.get(Lxb(i2 - 1, listLk2.size()));
                com.bytedance.adsdk.LD.lk.Lxb lxb8 = listLk2.get(i2);
                lxb7.LD(lxb2.LD().x, lxb2.LD().y);
                lxb7.lk(lxb2.lk().x, lxb2.lk().y);
                lxb8.Lxb(lxb.Lxb().x, lxb.Lxb().y);
                i2++;
            }
            i++;
            listLk = listLk;
        }
        return stpLD;
    }

    private static int LD(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) >= 0 || i2 * i3 == i) ? i3 : i3 - 1;
    }

    private static int Lxb(int i, int i2) {
        return i - (LD(i, i2) * i2);
    }
}
