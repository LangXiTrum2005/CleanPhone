package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class BV extends FrameLayout {
    public static final AtomicBoolean A00 = new AtomicBoolean();
    public static final AtomicReference<BO> A01 = new AtomicReference<>();

    public static void A00(boolean z, BO bo) {
        A00.set(z);
        A01.set(bo);
    }
}
