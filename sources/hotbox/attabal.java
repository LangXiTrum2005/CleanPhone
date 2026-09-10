package hotbox;

import ingathering.triweekly;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: RequestLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final triweekly f27993attabal = triweekly.dern();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public int f27994dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public long f27995saneness;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static final long f27992wireman = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final long f27991marial = TimeUnit.MINUTES.toMillis(30);

    public static boolean dern(int i) {
        if (i != 429) {
            return i >= 500 && i < 600;
        }
        return true;
    }

    public static boolean wireman(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    public final synchronized long attabal(int i) {
        if (dern(i)) {
            return (long) Math.min(Math.pow(2.0d, this.f27994dern) + this.f27993attabal.marial(), f27991marial);
        }
        return f27992wireman;
    }

    public synchronized void beachfront(int i) {
        if (wireman(i)) {
            marial();
            return;
        }
        this.f27994dern++;
        this.f27995saneness = this.f27993attabal.attabal() + attabal(i);
    }

    public final synchronized void marial() {
        this.f27994dern = 0;
    }

    public synchronized boolean saneness() {
        return this.f27994dern == 0 || this.f27993attabal.attabal() > this.f27995saneness;
    }
}
