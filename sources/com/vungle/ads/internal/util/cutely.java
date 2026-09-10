package com.vungle.ads.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HandlerScheduler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0003R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/vungle/ads/internal/util/cutely;", "", "<init>", "()V", "", "delay", "calculateTime", "(J)J", "Ljava/lang/Runnable;", "runnable", "", "tag", "", "schedule", "(Ljava/lang/Runnable;Ljava/lang/String;J)V", "(Ljava/lang/Runnable;J)V", "cancel", "(Ljava/lang/String;)V", "cancelAll", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class cutely {
    private final Handler handler = new Handler(Looper.getMainLooper());

    private final long calculateTime(long delay) {
        return SystemClock.uptimeMillis() + delay;
    }

    public final void cancel(String tag) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.handler.removeCallbacksAndMessages(tag);
    }

    public final void cancelAll() {
        this.handler.removeCallbacksAndMessages(null);
    }

    public final void schedule(Runnable runnable, String tag, long delay) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.handler.postAtTime(runnable, tag, calculateTime(delay));
    }

    public final void schedule(Runnable runnable, long delay) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.handler.postAtTime(runnable, calculateTime(delay));
    }
}
