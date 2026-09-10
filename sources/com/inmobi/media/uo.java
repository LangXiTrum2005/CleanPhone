package com.inmobi.media;

import android.view.WindowInsets;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uo {
    public boolean a() {
        return true;
    }

    public void a(Df orientation, wo finalInsets) {
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(finalInsets, "finalInsets");
    }

    public void a(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
    }
}
