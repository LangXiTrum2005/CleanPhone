package com.google.android.gms.common.api.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f11772b;

    public /* synthetic */ u(Handler handler, int i10) {
        this.f11771a = i10;
        this.f11772b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11771a) {
            case 0:
                this.f11772b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f11772b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            case 2:
                this.f11772b.post(runnable);
                return;
            case 3:
                this.f11772b.post(runnable);
                return;
            default:
                this.f11772b.post(runnable);
                return;
        }
    }

    public u(int i10) {
        this.f11771a = i10;
        switch (i10) {
            case 3:
                this.f11772b = new Handler(Looper.getMainLooper());
                break;
            case 4:
                this.f11772b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f11772b = new Handler(Looper.getMainLooper());
                break;
        }
    }
}
