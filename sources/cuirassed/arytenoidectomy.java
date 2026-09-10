package cuirassed;

import android.os.Looper;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Thread.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\t\n\u0002\b\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003¨\u0006\u0005"}, d2 = {"", "attabal", "J", "()J", "MainThreadId", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class arytenoidectomy {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final long f24254attabal;

    static {
        long id;
        try {
            id = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id = -1;
        }
        f24254attabal = id;
    }

    public static final long attabal() {
        return f24254attabal;
    }
}
