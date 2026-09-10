package com.facebook.ads.redexgen.core;

import java.util.concurrent.Callable;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class YO implements Callable<Void> {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int[] A06;

    public YO(int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = iArr;
        this.A05 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A00 = i6;
        this.A03 = i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    @Nullable
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final Void call() throws Exception {
        Q5.A00(this.A06, this.A05, this.A01, this.A02, this.A04, this.A00, this.A03);
        return null;
    }
}
