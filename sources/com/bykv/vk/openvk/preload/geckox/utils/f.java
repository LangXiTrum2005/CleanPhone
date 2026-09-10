package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class f implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile f f13020a;

    public static f a() {
        if (f13020a == null) {
            synchronized (f.class) {
                try {
                    if (f13020a == null) {
                        f13020a = new f();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13020a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
