package iiion;

import android.os.SystemClock;

/* JADX INFO: compiled from: StartupTime.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class triweekly {
    public static triweekly attabal(long j, long j2, long j3) {
        return new attabal(j, j2, j3);
    }

    public static triweekly marial() {
        return attabal(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long dern();

    public abstract long saneness();

    public abstract long wireman();
}
