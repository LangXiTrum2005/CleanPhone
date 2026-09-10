package com.lzh.easythread;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: AndroidDeliver.java */
/* JADX INFO: loaded from: classes4.dex */
public final class attabal implements Executor {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public static attabal f23516arytenoidectomy = new attabal();

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public Handler f23517kowloon = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: com.lzh.easythread.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidDeliver.java */
    public class RunnableC0419attabal implements Runnable {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Runnable f23519kowloon;

        public RunnableC0419attabal(Runnable runnable) {
            this.f23519kowloon = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23519kowloon.run();
        }
    }

    public static attabal attabal() {
        return f23516arytenoidectomy;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            this.f23517kowloon.post(new RunnableC0419attabal(runnable));
        }
    }
}
