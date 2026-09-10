package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.core.os.HandlerCompat;
import androidx.work.RunnableScheduler;

/* JADX INFO: loaded from: classes.dex */
public class DefaultRunnableScheduler implements RunnableScheduler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f8660a = HandlerCompat.a(Looper.getMainLooper());

    public final void a(Runnable runnable) {
        this.f8660a.removeCallbacks(runnable);
    }
}
