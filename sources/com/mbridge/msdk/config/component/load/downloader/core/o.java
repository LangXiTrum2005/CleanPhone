package com.mbridge.msdk.config.component.load.downloader.core;

import android.os.Process;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class o implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f32200a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f32201a;

        public a(Runnable runnable) {
            this.f32201a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Process.setThreadPriority(o.this.f32200a);
            } catch (Throwable th2) {
                q0.b("PriorityThreadFactory", "set thread priority error : " + th2.getMessage());
            }
            try {
                this.f32201a.run();
            } catch (Exception e10) {
                f2.q(e10, new StringBuilder("runnable error : "), "PriorityThreadFactory");
            }
        }
    }

    public o(int i10) {
        this.f32200a = i10;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(new a(runnable));
        thread.setName("mb_download_thread");
        return thread;
    }
}
