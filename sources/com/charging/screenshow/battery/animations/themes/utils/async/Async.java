package com.charging.screenshow.battery.animations.themes.utils.async;

/* JADX INFO: loaded from: classes3.dex */
public class Async {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ThreadPoolExecutorWrapper f13314a;

    public static ThreadPoolExecutorWrapper a() {
        if (f13314a == null) {
            synchronized (Async.class) {
                try {
                    if (f13314a == null) {
                        f13314a = new ThreadPoolExecutorWrapper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f13314a;
    }

    public static void b(long j, Runnable runnable) {
        a().f13317c.postDelayed(runnable, j);
    }
}
