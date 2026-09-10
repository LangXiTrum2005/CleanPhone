package com.bytedance.adsdk.ud.mzz;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class bjy implements wc<com.bytedance.adsdk.ud.lnr.ud.mml> {
    private int qdl;

    public bjy(int i2) {
        this.qdl = i2;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    @Override // com.bytedance.adsdk.ud.mzz.wc
    /* JADX INFO: renamed from: qdl, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ud.lnr.ud.mml ud(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z2 = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z2) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.qdl = 2;
        }
        if (z2) {
            jsonReader.endArray();
        }
        if (this.qdl == -1) {
            this.qdl = arrayList.size() / 4;
        }
        int i2 = this.qdl;
        float[] fArr = new float[i2];
        int[] iArr = new int[i2];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < this.qdl * 4; i5++) {
            int i6 = i5 / 4;
            double dFloatValue = ((Float) arrayList.get(i5)).floatValue();
            int i7 = i5 % 4;
            if (i7 != 0) {
                if (i7 == 1) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i7 == 2) {
                    i4 = (int) (dFloatValue * 255.0d);
                } else if (i7 == 3) {
                    iArr[i6] = Color.argb(255, i3, i4, (int) (dFloatValue * 255.0d));
                }
            } else if (i6 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i6 - 1] >= f2) {
                    fArr[i6] = f2 + 0.01f;
                } else {
                    fArr[i6] = (float) dFloatValue;
                }
            } else {
                fArr[i6] = (float) dFloatValue;
            }
        }
        return qdl(new com.bytedance.adsdk.ud.lnr.ud.mml(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.ud.lnr.ud.mml qdl(com.bytedance.adsdk.ud.lnr.ud.mml mmlVar, List<Float> list) {
        int i2 = this.qdl * 4;
        if (list.size() <= i2) {
            return mmlVar;
        }
        float[] fArrQdl = mmlVar.qdl();
        int[] iArrUd = mmlVar.ud();
        int size = (list.size() - i2) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i3 = 0;
        while (i2 < list.size()) {
            if (i2 % 2 == 0) {
                fArr[i3] = list.get(i2).floatValue();
            } else {
                fArr2[i3] = list.get(i2).floatValue();
                i3++;
            }
            i2++;
        }
        float[] fArrQdl2 = qdl(mmlVar.qdl(), fArr);
        int length = fArrQdl2.length;
        int[] iArr = new int[length];
        for (int i4 = 0; i4 < length; i4++) {
            float f = fArrQdl2[i4];
            int iBinarySearch = Arrays.binarySearch(fArrQdl, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                iArr[i4] = qdl(f, iArrUd[iBinarySearch], fArr, fArr2);
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i4] = qdl(f, fArr2[iBinarySearch2], fArrQdl, iArrUd);
            }
        }
        return new com.bytedance.adsdk.ud.lnr.ud.mml(fArrQdl2, iArr);
    }

    public int qdl(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                float f3 = fArr[i2];
                if (f3 >= f || i2 == fArr.length - 1) {
                    int i3 = i2 - 1;
                    float f4 = fArr[i3];
                    float f5 = (f - f4) / (f3 - f4);
                    int i4 = iArr[i2];
                    int i5 = iArr[i3];
                    return Color.argb((int) (f2 * 255.0f), com.bytedance.adsdk.ud.mo.ud.qdl(f5, Color.red(i5), Color.red(i4)), com.bytedance.adsdk.ud.mo.ud.qdl(f5, Color.green(i5), Color.green(i4)), com.bytedance.adsdk.ud.mo.ud.qdl(f5, Color.blue(i5), Color.blue(i4)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int qdl(float f, int i2, float[] fArr, float[] fArr2) {
        float fQdl;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i3 = 1; i3 < fArr.length; i3++) {
                float f2 = fArr[i3];
                if (f2 >= f || i3 == fArr.length - 1) {
                    if (f2 <= f) {
                        fQdl = fArr2[i3];
                    } else {
                        int i4 = i3 - 1;
                        float f3 = fArr[i4];
                        fQdl = com.bytedance.adsdk.ud.mo.mzz.qdl(fArr2[i4], fArr2[i3], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (fQdl * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static float[] qdl(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            float f = i3 < fArr.length ? fArr[i3] : Float.NaN;
            float f2 = i4 < fArr2.length ? fArr2[i4] : Float.NaN;
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i5] = f;
                    i3++;
                    i4++;
                    i2++;
                } else {
                    fArr3[i5] = f2;
                    i4++;
                }
            } else {
                fArr3[i5] = f;
                i3++;
            }
        }
        return i2 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i2);
    }
}
