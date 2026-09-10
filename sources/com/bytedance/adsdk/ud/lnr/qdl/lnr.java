package com.bytedance.adsdk.ud.lnr.qdl;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class lnr extends rdp<com.bytedance.adsdk.ud.lnr.ud.mml, com.bytedance.adsdk.ud.lnr.ud.mml> {
    public lnr(List<com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml>> list) {
        super(qdl(list));
    }

    private static List<com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml>> qdl(List<com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml>> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            list.set(i2, qdl(list.get(i2)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.rdp, com.bytedance.adsdk.ud.lnr.qdl.exu
    public /* bridge */ /* synthetic */ List lnr() {
        return super.lnr();
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.rdp
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.rdp, com.bytedance.adsdk.ud.lnr.qdl.exu
    public /* bridge */ /* synthetic */ boolean ud() {
        return super.ud();
    }

    private static com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml> qdl(com.bytedance.adsdk.ud.wd.qdl<com.bytedance.adsdk.ud.lnr.ud.mml> qdlVar) {
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVar = qdlVar.qdl;
        com.bytedance.adsdk.ud.lnr.ud.mml mmlVar2 = qdlVar.ud;
        if (mmlVar == null || mmlVar2 == null || mmlVar.qdl().length == mmlVar2.qdl().length) {
            return qdlVar;
        }
        float[] fArrQdl = qdl(mmlVar.qdl(), mmlVar2.qdl());
        return qdlVar.qdl(mmlVar.qdl(fArrQdl), mmlVar2.qdl(fArrQdl));
    }

    public static float[] qdl(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            float f2 = fArr3[i3];
            if (f2 != f) {
                fArr3[i2] = f2;
                i2++;
                f = fArr3[i3];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i2);
    }

    @Override // com.bytedance.adsdk.ud.lnr.qdl.exu
    public com.bytedance.adsdk.ud.qdl.ud.qdl<com.bytedance.adsdk.ud.lnr.ud.mml, com.bytedance.adsdk.ud.lnr.ud.mml> qdl() {
        return new com.bytedance.adsdk.ud.qdl.ud.mzz(this.qdl);
    }
}
