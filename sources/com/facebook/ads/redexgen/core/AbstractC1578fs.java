package com.facebook.ads.redexgen.core;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract /* synthetic */ class AbstractC1578fs {
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.f3 != com.google.android.exoplayer2.util.Consumer<T extends java.util.concurrent.Executor> */
    public static <T extends Executor> InterfaceExecutorC1579ft A00(T executor, InterfaceC1528f3<T> interfaceC1528f3) {
        return new PA(executor, interfaceC1528f3);
    }
}
