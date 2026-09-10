package com.inmobi.media;

import android.widget.RelativeLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.n5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3142n5 extends Af {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RelativeLayout.LayoutParams f23826a;

    public C3142n5(RelativeLayout.LayoutParams layoutParams) {
        this.f23826a = layoutParams;
    }

    @Override // com.inmobi.media.Af
    public final void a(EnumC3179pa orientation, Cf finalInsets) {
        Intrinsics.f(orientation, "orientation");
        Intrinsics.f(finalInsets, "finalInsets");
        B2.a(finalInsets, this.f23826a, orientation);
    }
}
