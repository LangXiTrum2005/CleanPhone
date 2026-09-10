package com.airbnb.lottie.parser;

import android.graphics.Color;
import com.airbnb.lottie.model.content.GradientColor;
import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.MiscUtils;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GradientColorParser implements ValueParser<GradientColor> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9898a;

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    @Override // com.airbnb.lottie.parser.ValueParser
    public final Object a(JsonReader jsonReader, float f) {
        int i2;
        int iArgb;
        float f2;
        int iArgb2;
        float f3;
        float fD;
        ArrayList arrayList = new ArrayList();
        int i3 = 1;
        int i4 = 0;
        boolean z2 = jsonReader.H() == JsonReader.Token.X;
        if (z2) {
            jsonReader.d();
        }
        while (jsonReader.m()) {
            arrayList.add(Float.valueOf((float) jsonReader.q()));
        }
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f9898a = 2;
        }
        if (z2) {
            jsonReader.k();
        }
        if (this.f9898a == -1) {
            this.f9898a = arrayList.size() / 4;
        }
        int i5 = this.f9898a;
        float[] fArr = new float[i5];
        int[] iArr = new int[i5];
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i2 = this.f9898a * 4;
            if (i6 >= i2) {
                break;
            }
            int i9 = i6 / 4;
            double dFloatValue = ((Float) arrayList.get(i6)).floatValue();
            int i10 = i4;
            int i11 = i6 % 4;
            if (i11 != 0) {
                if (i11 == i3) {
                    i7 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 2) {
                    i8 = (int) (dFloatValue * 255.0d);
                } else if (i11 == 3) {
                    iArr[i9] = Color.argb(255, i7, i8, (int) (dFloatValue * 255.0d));
                }
            } else if (i9 > 0) {
                float f4 = (float) dFloatValue;
                if (fArr[i9 - 1] >= f4) {
                    fArr[i9] = f4 + 0.01f;
                } else {
                    fArr[i9] = (float) dFloatValue;
                }
            } else {
                fArr[i9] = (float) dFloatValue;
            }
            i6++;
            i4 = i10;
            i3 = 1;
        }
        int i12 = i4;
        GradientColor gradientColor = new GradientColor(fArr, iArr);
        if (arrayList.size() <= i2) {
            return gradientColor;
        }
        int size = (arrayList.size() - i2) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i13 = i12;
        while (i2 < arrayList.size()) {
            if (i2 % 2 == 0) {
                fArr2[i13] = ((Float) arrayList.get(i2)).floatValue();
            } else {
                fArr3[i13] = ((Float) arrayList.get(i2)).floatValue();
                i13++;
            }
            i2++;
        }
        float[] fArrCopyOf = gradientColor.f9755a;
        if (fArrCopyOf.length == 0) {
            fArrCopyOf = fArr2;
        } else if (size != 0) {
            int length = fArrCopyOf.length + size;
            float[] fArr4 = new float[length];
            int i14 = i12;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            while (i14 < length) {
                float f5 = i16 < fArrCopyOf.length ? fArrCopyOf[i16] : Float.NaN;
                float f6 = i17 < size ? fArr2[i17] : Float.NaN;
                if (Float.isNaN(f6) || f5 < f6) {
                    fArr4[i14] = f5;
                    i16++;
                } else if (Float.isNaN(f5) || f6 < f5) {
                    fArr4[i14] = f6;
                    i17++;
                } else {
                    fArr4[i14] = f5;
                    i16++;
                    i17++;
                    i15++;
                }
                i14++;
            }
            fArrCopyOf = i15 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i15);
        }
        int length2 = fArrCopyOf.length;
        int[] iArr2 = new int[length2];
        int i18 = i12;
        while (i18 < length2) {
            float f7 = fArrCopyOf[i18];
            int iBinarySearch = Arrays.binarySearch(fArr, f7);
            int iBinarySearch2 = Arrays.binarySearch(fArr2, f7);
            int[] iArr3 = gradientColor.f9756b;
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                float f8 = fArr3[iBinarySearch2];
                if (iArr3.length < 2 || f7 == fArr[i12]) {
                    iArgb = iArr3[i12];
                } else {
                    int i19 = 1;
                    while (true) {
                        if (i19 >= i5) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f2 = fArr[i19];
                        if (f2 >= f7 || i19 == i5 - 1) {
                            break;
                        }
                        i19++;
                    }
                    int i20 = i19 - 1;
                    float f9 = fArr[i20];
                    float f10 = (f7 - f9) / (f2 - f9);
                    int i21 = iArr3[i19];
                    int i22 = iArr3[i20];
                    iArgb = Color.argb((int) (f8 * 255.0f), MiscUtils.e(f10, Color.red(i22), Color.red(i21)), MiscUtils.e(f10, Color.green(i22), Color.green(i21)), MiscUtils.e(f10, Color.blue(i22), Color.blue(i21)));
                }
                iArr2[i18] = iArgb;
            } else {
                int i23 = iArr3[iBinarySearch];
                if (size < 2 || f7 <= fArr2[i12]) {
                    iArgb2 = Color.argb((int) (fArr3[i12] * 255.0f), Color.red(i23), Color.green(i23), Color.blue(i23));
                } else {
                    int i24 = 1;
                    while (true) {
                        if (i24 >= size) {
                            throw new IllegalArgumentException("Unreachable code.");
                        }
                        f3 = fArr2[i24];
                        if (f3 >= f7 || i24 == size - 1) {
                            break;
                        }
                        i24++;
                    }
                    if (f3 <= f7) {
                        fD = fArr3[i24];
                    } else {
                        int i25 = i24 - 1;
                        float f11 = fArr2[i25];
                        fD = MiscUtils.d(fArr3[i25], fArr3[i24], (f7 - f11) / (f3 - f11));
                    }
                    iArgb2 = Color.argb((int) (fD * 255.0f), Color.red(i23), Color.green(i23), Color.blue(i23));
                }
                iArr2[i18] = iArgb2;
                i5 = i5;
            }
            i18++;
            i5 = i5;
        }
        return new GradientColor(fArrCopyOf, iArr2);
    }
}
