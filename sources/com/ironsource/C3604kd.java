package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3604kd {
    private final String a;
    private final LevelPlay.AdFormat b;

    public C3604kd(String placementName, LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        this.a = placementName;
        this.b = adFormat;
    }

    public final String a() {
        return this.a + "_" + this.b;
    }
}
