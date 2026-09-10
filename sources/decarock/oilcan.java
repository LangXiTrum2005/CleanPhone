package decarock;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes.dex */
public class oilcan implements wireman {
    @Override // decarock.wireman
    public cutely createHandler(Looper looper, Handler.Callback callback) {
        return new yemenite(new Handler(looper, callback));
    }

    @Override // decarock.wireman
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // decarock.wireman
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // decarock.wireman
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // decarock.wireman
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }

    @Override // decarock.wireman
    public void attabal() {
    }
}
