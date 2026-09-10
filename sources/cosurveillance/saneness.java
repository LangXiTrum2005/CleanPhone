package cosurveillance;

import android.os.Process;
import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: CustomThreadFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness implements ThreadFactory {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final ThreadFactory f24088molybdenite = Executors.defaultThreadFactory();

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public final String f24089arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final AtomicLong f24090kowloon = new AtomicLong();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public final int f24091monoploid;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f24092polloi;

    public saneness(String str, int i, @Nullable StrictMode.ThreadPolicy threadPolicy) {
        this.f24089arytenoidectomy = str;
        this.f24091monoploid = i;
        this.f24092polloi = threadPolicy;
    }

    public static /* synthetic */ void attabal(saneness sanenessVar, Runnable runnable) {
        Process.setThreadPriority(sanenessVar.f24091monoploid);
        StrictMode.ThreadPolicy threadPolicy = sanenessVar.f24092polloi;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(final Runnable runnable) {
        Thread threadNewThread = f24088molybdenite.newThread(new Runnable() { // from class: cosurveillance.attabal
            @Override // java.lang.Runnable
            public final void run() {
                saneness.attabal(this.f24057kowloon, runnable);
            }
        });
        threadNewThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f24089arytenoidectomy, Long.valueOf(this.f24090kowloon.getAndIncrement())));
        return threadNewThread;
    }
}
