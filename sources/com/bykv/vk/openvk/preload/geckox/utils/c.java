package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class c implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile c f13018a;

    public static c a() {
        if (f13018a == null) {
            synchronized (c.class) {
                try {
                    if (f13018a == null) {
                        f13018a = new c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13018a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
