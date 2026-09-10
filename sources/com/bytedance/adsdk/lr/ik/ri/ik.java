package com.bytedance.adsdk.lr.ik.ri;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class ik extends bgr<com.bytedance.adsdk.lr.ik.lr.ka, com.bytedance.adsdk.lr.ik.lr.ka> {
    public ik(List<com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka>> list) {
        super(ri(list));
    }

    private static List<com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka>> ri(List<com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, ri(list.get(i)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.bgr, com.bytedance.adsdk.lr.ik.ri.aw
    public /* bridge */ /* synthetic */ List ik() {
        return super.ik();
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.bgr, com.bytedance.adsdk.lr.ik.ri.aw
    public /* bridge */ /* synthetic */ boolean lr() {
        return super.lr();
    }

    @Override // com.bytedance.adsdk.lr.ik.ri.bgr
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    private static com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka> ri(com.bytedance.adsdk.lr.xha.ri<com.bytedance.adsdk.lr.ik.lr.ka> riVar) {
        com.bytedance.adsdk.lr.ik.lr.ka kaVar = riVar.ri;
        com.bytedance.adsdk.lr.ik.lr.ka kaVar2 = riVar.lr;
        if (kaVar == null || kaVar2 == null || kaVar.ri().length == kaVar2.ri().length) {
            return riVar;
        }
        float[] fArrRi = ri(kaVar.ri(), kaVar2.ri());
        return riVar.ri(kaVar.ri(fArrRi), kaVar2.ri(fArrRi));
    }

    public static float[] ri(float[] fArr, float[] fArr2) {
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

    @Override // com.bytedance.adsdk.lr.ik.ri.aw
    public com.bytedance.adsdk.lr.ri.lr.ri<com.bytedance.adsdk.lr.ik.lr.ka, com.bytedance.adsdk.lr.ik.lr.ka> ri() {
        return new com.bytedance.adsdk.lr.ri.lr.fi(this.ri);
    }
}
