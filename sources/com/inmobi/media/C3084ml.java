package com.inmobi.media;

import java.util.ArrayList;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3084ml {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public C3084ml(ArrayList resources, ArrayList inlineTrackers, ArrayList wrapperTrackers) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        Intrinsics.checkNotNullParameter(inlineTrackers, "inlineTrackers");
        Intrinsics.checkNotNullParameter(wrapperTrackers, "wrapperTrackers");
        this.a = resources;
        this.b = inlineTrackers;
        this.c = wrapperTrackers;
    }
}
