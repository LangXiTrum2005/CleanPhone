package com.inmobi.media;

import android.view.WindowInsets;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Af {
    public boolean a() {
        return true;
    }

    public void a(EnumC3179pa orientation, Cf finalInsets) {
        Intrinsics.f(orientation, "orientation");
        Intrinsics.f(finalInsets, "finalInsets");
    }

    public void a(WindowInsets insets) {
        Intrinsics.f(insets, "insets");
    }
}
