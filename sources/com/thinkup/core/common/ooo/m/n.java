package com.thinkup.core.common.ooo.m;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements ThreadFactory {
    private static Thread o(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(runnable);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(runnable);
    }
}
