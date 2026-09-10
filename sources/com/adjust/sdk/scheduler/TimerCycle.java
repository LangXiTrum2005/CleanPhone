package com.adjust.sdk.scheduler;

import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.Util;
import java.text.DecimalFormat;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import q5.a;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class TimerCycle {
    private Runnable command;
    private long cycleDelay;
    private long initialDelay;
    private boolean isPaused = true;
    private ILogger logger = AdjustFactory.getLogger();
    private String name;
    private FutureScheduler scheduler;
    private ScheduledFuture waitingTask;

    public TimerCycle(Runnable runnable, long j10, long j11, String str) {
        this.scheduler = new SingleThreadFutureScheduler(str, true);
        this.name = str;
        this.command = runnable;
        this.initialDelay = j10;
        this.cycleDelay = j11;
        DecimalFormat decimalFormat = Util.SecondsDisplayFormat;
        this.logger.verbose("%s configured to fire after %s seconds of starting and cycles every %s seconds", str, decimalFormat.format(j10 / 1000.0d), decimalFormat.format(j11 / 1000.0d));
    }

    private void cancel(boolean z10) {
        ScheduledFuture scheduledFuture = this.waitingTask;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(z10);
        }
        this.waitingTask = null;
    }

    public void start() {
        boolean z10 = this.isPaused;
        ILogger iLogger = this.logger;
        String str = this.name;
        if (!z10) {
            iLogger.verbose("%s is already started", str);
            return;
        }
        iLogger.verbose("%s starting", str);
        this.waitingTask = this.scheduler.scheduleFutureWithFixedDelay(new a(this, 6), this.initialDelay, this.cycleDelay);
        this.isPaused = false;
    }

    public void suspend() {
        if (this.isPaused) {
            this.logger.verbose("%s is already suspended", this.name);
            return;
        }
        this.initialDelay = this.waitingTask.getDelay(TimeUnit.MILLISECONDS);
        this.waitingTask.cancel(false);
        this.logger.verbose("%s suspended with %s seconds left", this.name, Util.SecondsDisplayFormat.format(this.initialDelay / 1000.0d));
        this.isPaused = true;
    }

    public void teardown() {
        cancel(true);
        FutureScheduler futureScheduler = this.scheduler;
        if (futureScheduler != null) {
            futureScheduler.teardown();
        }
        this.scheduler = null;
    }
}
