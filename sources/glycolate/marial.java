package glycolate;

import amount.sealless;
import android.os.SystemClock;
import com.google.android.datatransport.Priority;
import com.google.android.gms.tasks.TaskCompletionSource;
import gelandelaufer.competently;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lehua.formularize;
import staphylococcal.cutely;
import staphylococcal.impromptu;
import umbriferous.cord;
import umbriferous.peridotite;
import umbriferous.seminary;

/* JADX INFO: compiled from: ReportQueue.java */
/* JADX INFO: loaded from: classes3.dex */
public final class marial {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public long f27307apical;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final double f27308attabal;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final BlockingQueue<Runnable> f27309beachfront;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public final ThreadPoolExecutor f27310competently;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public int f27311cutely;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final long f27312dern;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name */
    public final impromptu<sealless> f27313impromptu;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final int f27314marial;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final double f27315saneness;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name */
    public final seminary f27316taiyuan;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final long f27317wireman;

    /* JADX INFO: compiled from: ReportQueue.java */
    public final class saneness implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final TaskCompletionSource<cord> f27318arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final cord f27319kowloon;

        @Override // java.lang.Runnable
        public void run() {
            marial.this.triweekly(this.f27319kowloon, this.f27318arytenoidectomy);
            marial.this.f27316taiyuan.dern();
            double dCompetently = marial.this.competently();
            competently.beachfront().saneness("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dCompetently / 1000.0d)) + " s for report: " + this.f27319kowloon.wireman());
            marial.kowloon(dCompetently);
        }

        public saneness(cord cordVar, TaskCompletionSource<cord> taskCompletionSource) {
            this.f27319kowloon = cordVar;
            this.f27318arytenoidectomy = taskCompletionSource;
        }
    }

    public marial(impromptu<sealless> impromptuVar, reeve.wireman wiremanVar, seminary seminaryVar) {
        this(wiremanVar.f36180beachfront, wiremanVar.f36181competently, ((long) wiremanVar.f36183impromptu) * 1000, impromptuVar, seminaryVar);
    }

    public static /* synthetic */ void attabal(marial marialVar, TaskCompletionSource taskCompletionSource, boolean z, cord cordVar, Exception exc) {
        marialVar.getClass();
        if (exc != null) {
            taskCompletionSource.trySetException(exc);
            return;
        }
        if (z) {
            marialVar.cutely();
        }
        taskCompletionSource.trySetResult(cordVar);
    }

    public static void kowloon(double d) {
        try {
            Thread.sleep((long) d);
        } catch (InterruptedException unused) {
        }
    }

    public static /* synthetic */ void saneness(marial marialVar, CountDownLatch countDownLatch) {
        marialVar.getClass();
        try {
            formularize.attabal(marialVar.f27313impromptu, Priority.HIGHEST);
        } catch (Exception unused) {
        }
        countDownLatch.countDown();
    }

    public final boolean apical() {
        return this.f27309beachfront.size() < this.f27314marial;
    }

    public final double competently() {
        return Math.min(3600000.0d, (60000.0d / this.f27308attabal) * Math.pow(this.f27315saneness, impromptu()));
    }

    public void cutely() {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() { // from class: glycolate.wireman
            @Override // java.lang.Runnable
            public final void run() {
                marial.saneness(this.f27328kowloon, countDownLatch);
            }
        }).start();
        peridotite.dern(countDownLatch, 2L, TimeUnit.SECONDS);
    }

    public final boolean formularize() {
        return this.f27309beachfront.size() == this.f27314marial;
    }

    public final long impassible() {
        return System.currentTimeMillis();
    }

    public final int impromptu() {
        if (this.f27307apical == 0) {
            this.f27307apical = impassible();
        }
        int iImpassible = (int) ((impassible() - this.f27307apical) / this.f27312dern);
        int iMin = formularize() ? Math.min(100, this.f27311cutely + iImpassible) : Math.max(0, this.f27311cutely - iImpassible);
        if (this.f27311cutely != iMin) {
            this.f27311cutely = iMin;
            this.f27307apical = impassible();
        }
        return iMin;
    }

    public TaskCompletionSource<cord> taiyuan(cord cordVar, boolean z) {
        synchronized (this.f27309beachfront) {
            try {
                TaskCompletionSource<cord> taskCompletionSource = new TaskCompletionSource<>();
                if (!z) {
                    triweekly(cordVar, taskCompletionSource);
                    return taskCompletionSource;
                }
                this.f27316taiyuan.saneness();
                if (!apical()) {
                    impromptu();
                    competently.beachfront().saneness("Dropping report due to queue being full: " + cordVar.wireman());
                    this.f27316taiyuan.attabal();
                    taskCompletionSource.trySetResult(cordVar);
                    return taskCompletionSource;
                }
                competently.beachfront().saneness("Enqueueing report: " + cordVar.wireman());
                competently.beachfront().saneness("Queue size: " + this.f27309beachfront.size());
                this.f27310competently.execute(new saneness(cordVar, taskCompletionSource));
                competently.beachfront().saneness("Closing task for report: " + cordVar.wireman());
                taskCompletionSource.trySetResult(cordVar);
                return taskCompletionSource;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void triweekly(final cord cordVar, final TaskCompletionSource<cord> taskCompletionSource) {
        competently.beachfront().saneness("Sending report through Google DataTransport: " + cordVar.wireman());
        final boolean z = SystemClock.elapsedRealtime() - this.f27317wireman < 2000;
        this.f27313impromptu.saneness(staphylococcal.wireman.impromptu(cordVar.saneness()), new cutely() { // from class: glycolate.dern
            @Override // staphylococcal.cutely
            public final void attabal(Exception exc) {
                marial.attabal(this.f27303attabal, taskCompletionSource, z, cordVar, exc);
            }
        });
    }

    public marial(double d, double d2, long j, impromptu<sealless> impromptuVar, seminary seminaryVar) {
        this.f27308attabal = d;
        this.f27315saneness = d2;
        this.f27312dern = j;
        this.f27313impromptu = impromptuVar;
        this.f27316taiyuan = seminaryVar;
        this.f27317wireman = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.f27314marial = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f27309beachfront = arrayBlockingQueue;
        this.f27310competently = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f27311cutely = 0;
        this.f27307apical = 0L;
    }
}
