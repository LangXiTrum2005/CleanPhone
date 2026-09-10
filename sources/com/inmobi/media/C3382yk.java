package com.inmobi.media;

import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.yk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3382yk {
    public final int a;
    public final int b;
    public final int c;
    public final Function0 d;

    public C3382yk(int i, int i2, int i3, Function0 action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = action;
    }
}
