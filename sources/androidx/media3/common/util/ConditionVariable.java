package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
public class ConditionVariable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SystemClock f5632a = Clock.f5626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5633b;

    public ConditionVariable(int i2) {
    }

    public final synchronized void a() {
        while (!this.f5633b) {
            wait();
        }
    }

    public final synchronized boolean b(long j) {
        try {
            if (j <= 0) {
                return this.f5633b;
            }
            this.f5632a.getClass();
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long j2 = j + jElapsedRealtime;
            if (j2 < jElapsedRealtime) {
                a();
            } else {
                while (!this.f5633b && jElapsedRealtime < j2) {
                    wait(j2 - jElapsedRealtime);
                    this.f5632a.getClass();
                    jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
                }
            }
            return this.f5633b;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        this.f5633b = false;
    }

    public final synchronized boolean d() {
        if (this.f5633b) {
            return false;
        }
        this.f5633b = true;
        notifyAll();
        return true;
    }
}
