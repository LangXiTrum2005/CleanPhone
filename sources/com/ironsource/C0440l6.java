package com.ironsource;

import android.app.Activity;

/* JADX INFO: renamed from: com.ironsource.l6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0440l6 implements K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f29154a;

    public C0440l6(Activity activity) {
        kotlin.jvm.internal.n.f(activity, "activity");
        this.f29154a = activity;
    }

    @Override // com.ironsource.K
    public void a(C0404j6 fullscreenAdInstance) {
        kotlin.jvm.internal.n.f(fullscreenAdInstance, "fullscreenAdInstance");
        fullscreenAdInstance.a(this.f29154a);
    }
}
