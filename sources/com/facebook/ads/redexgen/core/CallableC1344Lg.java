package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class CallableC1344Lg implements Callable<Void> {
    public final File A00;
    public final /* synthetic */ AbstractC2370kr A01;

    public CallableC1344Lg(AbstractC2370kr abstractC2370kr, File file) {
        this.A01 = abstractC2370kr;
        this.A00 = file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        this.A01.A06(this.A00);
        return null;
    }
}
