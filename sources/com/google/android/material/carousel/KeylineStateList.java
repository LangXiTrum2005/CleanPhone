package com.google.android.material.carousel;

import com.google.android.material.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class KeylineStateList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeylineState f19202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19204c;
    public final float[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float[] f19205e;
    public final float f;
    public final float g;

    public KeylineStateList(KeylineState keylineState, ArrayList arrayList, ArrayList arrayList2) {
        this.f19202a = keylineState;
        this.f19203b = Collections.unmodifiableList(arrayList);
        this.f19204c = Collections.unmodifiableList(arrayList2);
        float f = ((KeylineState) android.support.v4.media.a.d(1, arrayList)).b().f19197a - keylineState.b().f19197a;
        this.f = f;
        float f2 = keylineState.d().f19197a - ((KeylineState) android.support.v4.media.a.d(1, arrayList2)).d().f19197a;
        this.g = f2;
        this.d = d(f, arrayList, true);
        this.f19205e = d(f2, arrayList2, false);
    }

    public static float[] d(float f, ArrayList arrayList, boolean z2) {
        int size = arrayList.size();
        float[] fArr = new float[size];
        int i2 = 1;
        while (i2 < size) {
            int i3 = i2 - 1;
            KeylineState keylineState = (KeylineState) arrayList.get(i3);
            KeylineState keylineState2 = (KeylineState) arrayList.get(i2);
            fArr[i2] = i2 == size + (-1) ? 1.0f : fArr[i3] + ((z2 ? keylineState2.b().f19197a - keylineState.b().f19197a : keylineState.d().f19197a - keylineState2.d().f19197a) / f);
            i2++;
        }
        return fArr;
    }

    public static float[] e(List list, float f, float[] fArr) {
        int size = list.size();
        float f2 = fArr[0];
        int i2 = 1;
        while (i2 < size) {
            float f3 = fArr[i2];
            if (f <= f3) {
                return new float[]{AnimationUtils.b(0.0f, 1.0f, f2, f3, f), i2 - 1, i2};
            }
            i2++;
            f2 = f3;
        }
        return new float[]{0.0f, 0.0f, 0.0f};
    }

    public static KeylineState f(KeylineState keylineState, int i2, int i3, float f, int i4, int i5, float f2) {
        ArrayList arrayList = new ArrayList(keylineState.f19189b);
        arrayList.add(i3, (KeylineState.Keyline) arrayList.remove(i2));
        KeylineState.Builder builder = new KeylineState.Builder(keylineState.f19188a, f2);
        float f3 = f;
        int i6 = 0;
        while (i6 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i6);
            float f4 = keyline.d;
            builder.b((f4 / 2.0f) + f3, keyline.f19199c, f4, i6 >= i4 && i6 <= i5, keyline.f19200e, keyline.f, 0.0f, 0.0f);
            f3 += keyline.d;
            i6++;
        }
        return builder.d();
    }

    public static KeylineState g(KeylineState keylineState, float f, float f2, boolean z2, float f3) {
        int i2;
        List list = keylineState.f19189b;
        ArrayList arrayList = new ArrayList(list);
        float f4 = keylineState.f19188a;
        KeylineState.Builder builder = new KeylineState.Builder(f4, f2);
        Iterator it = list.iterator();
        int i3 = 0;
        while (it.hasNext()) {
            if (((KeylineState.Keyline) it.next()).f19200e) {
                i3++;
            }
        }
        float size = f / (list.size() - i3);
        float f5 = z2 ? f : 0.0f;
        int i4 = 0;
        while (i4 < arrayList.size()) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) arrayList.get(i4);
            if (keyline.f19200e) {
                i2 = i4;
                builder.b(keyline.f19198b, keyline.f19199c, keyline.d, false, true, keyline.f, 0.0f, 0.0f);
            } else {
                i2 = i4;
                boolean z3 = i2 >= keylineState.f19190c && i2 <= keylineState.d;
                float f6 = keyline.d - size;
                float fB = CarouselStrategy.b(f6, f4, f3);
                float f7 = (f6 / 2.0f) + f5;
                float f8 = f7 - keyline.f19198b;
                float f9 = f8;
                if (!z2) {
                    f8 = 0.0f;
                }
                if (z2) {
                    f9 = 0.0f;
                }
                builder.b(f7, fB, f6, z3, false, keyline.f, f8, f9);
                f5 += f6;
            }
            i4 = i2 + 1;
        }
        return builder.d();
    }

    public final KeylineState a() {
        return (KeylineState) androidx.media3.extractor.text.ttml.a.h(1, this.f19204c);
    }

    public final KeylineState b(float f, float f2, float f3, boolean z2) {
        float fB;
        List list;
        float[] fArr;
        float f4 = this.f;
        float f5 = f2 + f4;
        float f6 = this.g;
        float f7 = f3 - f6;
        float f8 = c().a().g;
        float f9 = a().c().f19201h;
        if (f4 == f8) {
            f5 += f8;
        }
        if (f6 == f9) {
            f7 -= f9;
        }
        if (f < f5) {
            fB = AnimationUtils.b(1.0f, 0.0f, f2, f5, f);
            list = this.f19203b;
            fArr = this.d;
        } else {
            if (f <= f7) {
                return this.f19202a;
            }
            fB = AnimationUtils.b(0.0f, 1.0f, f7, f3, f);
            list = this.f19204c;
            fArr = this.f19205e;
        }
        if (z2) {
            float[] fArrE = e(list, fB, fArr);
            return fArrE[0] >= 0.5f ? (KeylineState) list.get((int) fArrE[2]) : (KeylineState) list.get((int) fArrE[1]);
        }
        float[] fArrE2 = e(list, fB, fArr);
        KeylineState keylineState = (KeylineState) list.get((int) fArrE2[1]);
        KeylineState keylineState2 = (KeylineState) list.get((int) fArrE2[2]);
        float f10 = fArrE2[0];
        if (keylineState.f19188a != keylineState2.f19188a) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same item size.");
        }
        List list2 = keylineState.f19189b;
        int size = list2.size();
        List list3 = keylineState2.f19189b;
        if (size != list3.size()) {
            throw new IllegalArgumentException("Keylines being linearly interpolated must have the same number of keylines.");
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list2.size(); i2++) {
            KeylineState.Keyline keyline = (KeylineState.Keyline) list2.get(i2);
            KeylineState.Keyline keyline2 = (KeylineState.Keyline) list3.get(i2);
            arrayList.add(new KeylineState.Keyline(AnimationUtils.a(keyline.f19197a, keyline2.f19197a, f10), AnimationUtils.a(keyline.f19198b, keyline2.f19198b, f10), AnimationUtils.a(keyline.f19199c, keyline2.f19199c, f10), AnimationUtils.a(keyline.d, keyline2.d, f10), false, 0.0f, 0.0f, 0.0f));
        }
        return new KeylineState(keylineState.f19188a, arrayList, AnimationUtils.c(f10, keylineState.f19190c, keylineState2.f19190c), AnimationUtils.c(f10, keylineState.d, keylineState2.d));
    }

    public final KeylineState c() {
        return (KeylineState) androidx.media3.extractor.text.ttml.a.h(1, this.f19203b);
    }
}
