package com.ironsource;

import android.app.Activity;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3562i6 implements K {
    private final Activity a;

    public C3562i6(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    @Override // com.ironsource.K
    public void a(C3526g6 fullscreenAdInstance) {
        Intrinsics.checkNotNullParameter(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.a);
    }
}
