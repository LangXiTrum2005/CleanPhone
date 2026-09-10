package com.lzh.easythread;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: JavaDeliver.java */
/* JADX INFO: loaded from: classes4.dex */
public final class impromptu implements Executor {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static impromptu f23541kowloon = new impromptu();

    public static impromptu attabal() {
        return f23541kowloon;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}
