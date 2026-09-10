package com.bytedance.adsdk.LD.JXs;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class IeN implements NDz<com.bytedance.adsdk.LD.lk.LD.ZU> {
    private int Lxb;

    public IeN(int i) {
        this.Lxb = i;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    @Override // com.bytedance.adsdk.LD.JXs.NDz
    /* JADX INFO: renamed from: Lxb, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.LD.lk.LD.ZU LD(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
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
            this.Lxb = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.Lxb == -1) {
            this.Lxb = arrayList.size() / 4;
        }
        int i = this.Lxb;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.Lxb * 4; i4++) {
            int i5 = i4 / 4;
            double dFloatValue = ((Float) arrayList.get(i4)).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 == 1) {
                    i2 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 2) {
                    i3 = (int) (dFloatValue * 255.0d);
                } else if (i6 == 3) {
                    iArr[i5] = Color.argb(255, i2, i3, (int) (dFloatValue * 255.0d));
                }
            } else if (i5 > 0) {
                float f2 = (float) dFloatValue;
                if (fArr[i5 - 1] >= f2) {
                    fArr[i5] = f2 + 0.01f;
                } else {
                    fArr[i5] = (float) dFloatValue;
                }
            } else {
                fArr[i5] = (float) dFloatValue;
            }
        }
        return Lxb(new com.bytedance.adsdk.LD.lk.LD.ZU(fArr, iArr), arrayList);
    }

    private com.bytedance.adsdk.LD.lk.LD.ZU Lxb(com.bytedance.adsdk.LD.lk.LD.ZU zu, List<Float> list) {
        int i = this.Lxb * 4;
        if (list.size() <= i) {
            return zu;
        }
        float[] fArrLxb = zu.Lxb();
        int[] iArrLD = zu.LD();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrLxb2 = Lxb(zu.Lxb(), fArr);
        int length = fArrLxb2.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrLxb2[i3];
            int iBinarySearch = Arrays.binarySearch(fArrLxb, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch >= 0 && iBinarySearch2 <= 0) {
                iArr[i3] = Lxb(f, iArrLD[iBinarySearch], fArr, fArr2);
            } else {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i3] = Lxb(f, fArr2[iBinarySearch2], fArrLxb, iArrLD);
            }
        }
        return new com.bytedance.adsdk.LD.lk.LD.ZU(fArrLxb2, iArr);
    }

    public int Lxb(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f3 = fArr[i];
                if (f3 >= f || i == fArr.length - 1) {
                    int i2 = i - 1;
                    float f4 = fArr[i2];
                    float f5 = (f - f4) / (f3 - f4);
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    return Color.argb((int) (f2 * 255.0f), com.bytedance.adsdk.LD.lc.LD.Lxb(f5, Color.red(i4), Color.red(i3)), com.bytedance.adsdk.LD.lc.LD.Lxb(f5, Color.green(i4), Color.green(i3)), com.bytedance.adsdk.LD.lc.LD.Lxb(f5, Color.blue(i4), Color.blue(i3)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    private int Lxb(float f, int i, float[] fArr, float[] fArr2) {
        float fLxb;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                float f2 = fArr[i2];
                if (f2 >= f || i2 == fArr.length - 1) {
                    if (f2 <= f) {
                        fLxb = fArr2[i2];
                    } else {
                        int i3 = i2 - 1;
                        float f3 = fArr[i3];
                        fLxb = com.bytedance.adsdk.LD.lc.JXs.Lxb(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (fLxb * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public static float[] Lxb(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
