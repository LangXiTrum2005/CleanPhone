package com.airbnb.lottie.utils;

import android.graphics.PointF;
import android.support.v4.media.a;
import com.airbnb.lottie.animation.content.KeyPathElementContent;
import com.airbnb.lottie.model.KeyPath;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MiscUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PointF f9945a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i2 = (int) f;
        int i3 = (int) f2;
        int i4 = i2 / i3;
        int i5 = i2 % i3;
        if (!((i2 ^ i3) >= 0) && i5 != 0) {
            i4--;
        }
        return i2 - (i3 * i4);
    }

    public static float d(float f, float f2, float f3) {
        return a.a(f2, f, f3, f);
    }

    public static int e(float f, int i2, int i3) {
        return (int) ((f * (i3 - i2)) + i2);
    }

    public static void f(KeyPath keyPath, int i2, ArrayList arrayList, KeyPath keyPath2, KeyPathElementContent keyPathElementContent) {
        if (keyPath.a(i2, keyPathElementContent.getName())) {
            String name = keyPathElementContent.getName();
            KeyPath keyPath3 = new KeyPath(keyPath2);
            keyPath3.f9728a.add(name);
            KeyPath keyPath4 = new KeyPath(keyPath3);
            keyPath4.f9729b = keyPathElementContent;
            arrayList.add(keyPath4);
        }
    }
}
