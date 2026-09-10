package com.ironsource;

import com.unity3d.mediation.LevelPlay;

/* JADX INFO: renamed from: com.ironsource.od, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0501od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f29938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LevelPlay.AdFormat f29939b;

    public C0501od(String placementName, LevelPlay.AdFormat adFormat) {
        kotlin.jvm.internal.n.f(placementName, "placementName");
        kotlin.jvm.internal.n.f(adFormat, "adFormat");
        this.f29938a = placementName;
        this.f29939b = adFormat;
    }

    public final String a() {
        return this.f29938a + "_" + this.f29939b;
    }
}
