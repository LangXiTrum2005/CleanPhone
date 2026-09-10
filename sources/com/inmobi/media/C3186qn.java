package com.inmobi.media;

import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.qn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3186qn {
    public final G a;
    public final boolean[] b;

    public C3186qn(G adContext) {
        Intrinsics.checkNotNullParameter(adContext, "adContext");
        this.a = adContext;
        boolean[] zArr = new boolean[5];
        for (int i = 0; i < 5; i++) {
            zArr[i] = false;
        }
        this.b = zArr;
    }
}
