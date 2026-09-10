package com.zhy.http.okhttp.utils;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public class Platform {

    public static class Android extends Platform {

        public static class MainThreadExecutor implements Executor {
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                throw null;
            }
        }
    }

    static {
        try {
            Class.forName("android.os.Build");
        } catch (ClassNotFoundException unused) {
        }
    }
}
