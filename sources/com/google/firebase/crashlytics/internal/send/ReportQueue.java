package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import com.google.android.datatransport.Event;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportScheduleCallback;
import com.google.android.datatransport.runtime.ForcedSender;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CrashlyticsReportWithSessionId;
import com.google.firebase.crashlytics.internal.common.OnDemandCounter;
import com.google.firebase.crashlytics.internal.common.Utils;
import com.google.firebase.crashlytics.internal.settings.Settings;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
final class ReportQueue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f20735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f20736b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20737c;
    public final long d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20738e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Transport f20739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OnDemandCounter f20740i;
    public int j;
    public long k;

    public final class ReportRunnable implements Runnable {
        public final CrashlyticsReportWithSessionId X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final TaskCompletionSource f20741Y;

        public ReportRunnable(CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, TaskCompletionSource taskCompletionSource) {
            this.X = crashlyticsReportWithSessionId;
            this.f20741Y = taskCompletionSource;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ReportQueue reportQueue = ReportQueue.this;
            CrashlyticsReportWithSessionId crashlyticsReportWithSessionId = this.X;
            reportQueue.b(crashlyticsReportWithSessionId, this.f20741Y);
            reportQueue.f20740i.f20363b.set(0);
            double dMin = Math.min(3600000.0d, Math.pow(reportQueue.f20736b, reportQueue.a()) * (60000.0d / reportQueue.f20735a));
            Logger.f20289a.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(dMin / 1000.0d)) + " s for report: " + crashlyticsReportWithSessionId.c(), null);
            try {
                Thread.sleep((long) dMin);
            } catch (InterruptedException unused) {
            }
        }
    }

    public ReportQueue(Transport transport, Settings settings, OnDemandCounter onDemandCounter) {
        double d = settings.d;
        long j = ((long) settings.f) * 1000;
        this.f20735a = d;
        this.f20736b = settings.f20749e;
        this.f20737c = j;
        this.f20739h = transport;
        this.f20740i = onDemandCounter;
        this.d = SystemClock.elapsedRealtime();
        int i2 = (int) d;
        this.f20738e = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.f20737c);
        int iMin = this.f.size() == this.f20738e ? Math.min(100, this.j + iCurrentTimeMillis) : Math.max(0, this.j - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final CrashlyticsReportWithSessionId crashlyticsReportWithSessionId, final TaskCompletionSource taskCompletionSource) {
        Logger.f20289a.b("Sending report through Google DataTransport: " + crashlyticsReportWithSessionId.c(), null);
        final boolean z2 = SystemClock.elapsedRealtime() - this.d < 2000;
        this.f20739h.a(Event.g(crashlyticsReportWithSessionId.a()), new TransportScheduleCallback() { // from class: com.google.firebase.crashlytics.internal.send.a
            @Override // com.google.android.datatransport.TransportScheduleCallback
            public final void a(Exception exc) throws Throwable {
                final ReportQueue reportQueue = this.X;
                reportQueue.getClass();
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z2) {
                    boolean z3 = true;
                    final CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new Runnable() { // from class: com.google.firebase.crashlytics.internal.send.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            ReportQueue reportQueue2 = reportQueue;
                            reportQueue2.getClass();
                            try {
                                ForcedSender.a(reportQueue2.f20739h);
                            } catch (Exception unused) {
                            }
                            countDownLatch.countDown();
                        }
                    }).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = Utils.f20368a;
                    boolean z4 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (Throwable th) {
                                    th = th;
                                    if (z3) {
                                        Thread.currentThread().interrupt();
                                    }
                                    throw th;
                                }
                            } catch (InterruptedException unused) {
                                nanos = jNanoTime - System.nanoTime();
                                z4 = true;
                            }
                        }
                        if (z4) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z3 = z4;
                    }
                }
                taskCompletionSource2.trySetResult(crashlyticsReportWithSessionId);
            }
        });
    }
}
