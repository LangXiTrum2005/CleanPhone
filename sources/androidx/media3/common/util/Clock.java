package androidx.media3.common.util;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public interface Clock {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SystemClock f5626a = new SystemClock();

    HandlerWrapper createHandler(Looper looper, Handler.Callback callback);

    long elapsedRealtime();
}
