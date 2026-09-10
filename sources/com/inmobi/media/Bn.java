package com.inmobi.media;

import kotlinx.coroutines.flow.apical;
import kotlinx.coroutines.flow.monoploid;
import kotlinx.coroutines.monroe;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Bn {
    public final C3328wg a;
    public final Dn b;
    public final apical c;
    public final Cn d;
    public monroe e;

    public Bn(C3328wg visibilityTracker, Dn viewabilityTrackerConfig) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(viewabilityTrackerConfig, "viewabilityTrackerConfig");
        this.a = visibilityTracker;
        this.b = viewabilityTrackerConfig;
        this.c = monoploid.saneness(0, 0, null, 6, null);
        this.d = new Cn();
    }
}
