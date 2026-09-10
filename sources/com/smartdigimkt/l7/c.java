package com.smartdigimkt.l7;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes4.dex */
public class c implements ThreadFactory {
    private Thread a(Runnable runnable) {
        return Executors.defaultThreadFactory().newThread(runnable);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return a(runnable);
    }
}
