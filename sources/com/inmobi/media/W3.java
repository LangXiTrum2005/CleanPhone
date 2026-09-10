package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class W3 extends Af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f23316a;

    public W3(RelativeLayout.LayoutParams layoutParams) {
        this.f23316a = layoutParams;
    }

    @Override // com.inmobi.media.Af
    public final void a(EnumC3179pa orientation, Cf finalInsets) {
        Intrinsics.f(orientation, "orientation");
        Intrinsics.f(finalInsets, "finalInsets");
        B2.a(finalInsets, this.f23316a, orientation);
    }
}
