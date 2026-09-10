package hardpan;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: CalleeHandler.java */
/* JADX INFO: loaded from: classes.dex */
public class saneness {
    public static Handler attabal() {
        return Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
    }
}
