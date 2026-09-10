package com.bytedance.adsdk.LD.lk.Lxb;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lk extends STP<com.bytedance.adsdk.LD.lk.LD.ZU, com.bytedance.adsdk.LD.lk.LD.ZU> {
    public lk(List<com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU>> list) {
        super(Lxb(list));
    }

    private static List<com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU>> Lxb(List<com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, Lxb(list.get(i)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.STP, com.bytedance.adsdk.LD.lk.Lxb.NXR
    public /* bridge */ /* synthetic */ boolean LD() {
        return super.LD();
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.STP, com.bytedance.adsdk.LD.lk.Lxb.NXR
    public /* bridge */ /* synthetic */ List lk() {
        return super.lk();
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.STP
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU> Lxb(com.bytedance.adsdk.LD.ebl.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU> lxb) {
        com.bytedance.adsdk.LD.lk.LD.ZU zu = lxb.Lxb;
        com.bytedance.adsdk.LD.lk.LD.ZU zu2 = lxb.LD;
        if (zu == null || zu2 == null || zu.Lxb().length == zu2.Lxb().length) {
            return lxb;
        }
        float[] fArrLxb = Lxb(zu.Lxb(), zu2.Lxb());
        return lxb.Lxb(zu.Lxb(fArrLxb), zu2.Lxb(fArrLxb));
    }

    public static float[] Lxb(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.LD.lk.Lxb.NXR
    public com.bytedance.adsdk.LD.Lxb.LD.Lxb<com.bytedance.adsdk.LD.lk.LD.ZU, com.bytedance.adsdk.LD.lk.LD.ZU> Lxb() {
        return new com.bytedance.adsdk.LD.Lxb.LD.JXs(this.Lxb);
    }
}
