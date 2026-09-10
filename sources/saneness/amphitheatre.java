package saneness;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public interface amphitheatre {
    static long a() {
        return System.currentTimeMillis();
    }

    static long b() {
        return SystemClock.elapsedRealtime();
    }
}
