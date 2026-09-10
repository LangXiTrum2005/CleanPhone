package com.chartboost.sdk.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final jb f14246a = new jb();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f14247b = MapsKt.j(new Pair("video/mp4", Double.valueOf(1.5d)), new Pair("video/3gpp", Double.valueOf(1.0d)), new Pair("video/webm", Double.valueOf(1.0d)), new Pair("video/x-matroska", Double.valueOf(1.0d)));

    public final double a(double d, double d2, double d3) {
        return (1.0d / ((d2 + 1.0d) + d3)) * d;
    }

    public final double a(Integer num) {
        if (num == null) {
            return 0.5d;
        }
        if (num.intValue() < 0) {
            num = null;
        }
        if (num == null) {
            return 0.5d;
        }
        int iIntValue = num.intValue();
        if (700 > iIntValue || iIntValue >= 1501) {
            return Math.min(((double) Math.abs(700 - iIntValue)) / ((double) 700), ((double) Math.abs(1500 - iIntValue)) / ((double) 1500));
        }
        return 0.0d;
    }

    public final double a(af afVar, hb hbVar) {
        double d = afVar.d();
        double dB = afVar.b();
        Integer numE = hbVar.e();
        if (numE != null) {
            double dIntValue = numE.intValue();
            Integer numB = hbVar.b();
            if (numB != null) {
                double dIntValue2 = numB.intValue();
                float fA = afVar.a();
                if (d > 0.0d && dB > 0.0d && dIntValue > 0.0d && dIntValue2 > 0.0d) {
                    double d2 = ((double) fA) * d;
                    return Math.abs((d / dB) - (dIntValue / dIntValue2)) + (d2 != 0.0d ? Math.abs(d2 - dIntValue) / d2 : Double.MAX_VALUE);
                }
            }
        }
        return Double.MAX_VALUE;
    }

    public final hb a(List mediaFiles, af renderingContainer) {
        Intrinsics.f(mediaFiles, "mediaFiles");
        Intrinsics.f(renderingContainer, "renderingContainer");
        Iterator it = mediaFiles.iterator();
        hb hbVar = null;
        double d = Double.NEGATIVE_INFINITY;
        while (it.hasNext()) {
            hb hbVar2 = (hb) it.next();
            double dA = a(hbVar2.c());
            if (dA != 0.0d) {
                double dA2 = a(dA, a(renderingContainer, hbVar2), a(hbVar2.a()));
                if (dA2 > d) {
                    hbVar = hbVar2;
                    d = dA2;
                }
            }
        }
        return hbVar;
    }

    public final double a(String str) {
        return ((Number) f14247b.getOrDefault(str, Double.valueOf(0.0d))).doubleValue();
    }
}
