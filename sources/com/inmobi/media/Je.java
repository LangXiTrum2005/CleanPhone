package com.inmobi.media;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Je {
    public static final Le a(C2968c9 videoAsset, C2984d8 asset) {
        double d;
        double d2;
        double d3;
        Intrinsics.f(videoAsset, "videoAsset");
        Intrinsics.f(asset, "asset");
        Ve veD = videoAsset.d();
        Point point = asset.d.f23552a;
        Le le = null;
        ArrayList arrayList = veD != null ? ((Ue) veD).f23284i : null;
        float f = U3.d().f23294c;
        double d4 = point.y / f;
        double d5 = point.x / f;
        double d6 = d5 / d4;
        double d7 = d5 * d4;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            double d8 = -1.0d;
            double d9 = 0.0d;
            while (it.hasNext()) {
                Le le2 = (Le) it.next();
                int i2 = le2.f22957b;
                it = it;
                double d10 = le2.f22956a;
                double d11 = i2;
                if (d6 > d10 / d11) {
                    d2 = (d4 / d11) * d10;
                    d = d4;
                } else {
                    d = (d5 / d10) * d11;
                    d2 = d5;
                }
                if (d11 >= d * 0.33d && d10 >= 0.33d * d2) {
                    double d12 = d2 * d;
                    if (d12 > 0.5d * d7) {
                        if (d12 > d8) {
                            d9 = d11 / d;
                            le = le2;
                            d8 = d12;
                        } else if (d12 == d8) {
                            float f2 = U3.d().f23294c;
                            double d13 = d11 / d;
                            if (d13 > d9) {
                                d3 = d13;
                                if (d9 >= f2) {
                                }
                                le = le2;
                                d9 = d3;
                            } else {
                                d3 = d13;
                            }
                            double d14 = f2;
                            if (d9 > d14 && d3 < d9 && d3 > d14) {
                                le = le2;
                                d9 = d3;
                            }
                        }
                    }
                }
            }
        }
        return le;
    }
}
