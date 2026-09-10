package plench;

import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class attabal {
    public static boolean attabal() {
        return Thread.currentThread() == Looper.getMainLooper().getThread();
    }
}
