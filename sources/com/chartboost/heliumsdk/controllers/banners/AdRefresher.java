package com.chartboost.heliumsdk.controllers.banners;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c0.a;
import com.chartboost.heliumsdk.utils.LogController;
import com.smartdigimkt.o1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\fJ\b\u0010\u0017\u001a\u00020\u0003H\u0002J\u0006\u0010\u0018\u001a\u00020\u0015J\u0006\u0010\u0019\u001a\u00020\u0015J\u0006\u0010\u001a\u001a\u00020\u0015J\b\u0010\u001b\u001a\u00020\u0015H\u0002J\u0006\u0010\u001c\u001a\u00020\u0015R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/chartboost/heliumsdk/controllers/banners/AdRefresher;", "", "initialRefreshRateSec", "", "penaltyRefreshRateSec", "maxFailuresUntilPenaltyTime", "adRefresherCallback", "Lcom/chartboost/heliumsdk/controllers/banners/AdRefresherCallback;", "(IIILcom/chartboost/heliumsdk/controllers/banners/AdRefresherCallback;)V", "handler", "Landroid/os/Handler;", "isRefreshing", "", "isResumed", "refreshRunnable", "Ljava/lang/Runnable;", "refreshesFailed", "timeStartedRefreshingMs", "", "totalTimePausedMs", b.P3, "", "resetTimer", "getRefreshTimeInSeconds", "markLoadFailed", "markLoadSuccess", "resume", "scheduleNextRefresh", "start", "Helium_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AdRefresher {
    private final AdRefresherCallback adRefresherCallback;
    private final Handler handler;
    private final int initialRefreshRateSec;
    private boolean isRefreshing;
    private boolean isResumed;
    private final int maxFailuresUntilPenaltyTime;
    private final int penaltyRefreshRateSec;
    private final Runnable refreshRunnable;
    private int refreshesFailed;
    private long timeStartedRefreshingMs;
    private long totalTimePausedMs;

    public AdRefresher(int i2, int i3, int i4, AdRefresherCallback adRefresherCallback) {
        Intrinsics.f(adRefresherCallback, "adRefresherCallback");
        this.initialRefreshRateSec = i2;
        this.penaltyRefreshRateSec = i3;
        this.maxFailuresUntilPenaltyTime = i4;
        this.adRefresherCallback = adRefresherCallback;
        this.handler = new Handler(Looper.getMainLooper());
        this.refreshRunnable = new a(this, 15);
    }

    public static /* synthetic */ void cancel$default(AdRefresher adRefresher, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        adRefresher.cancel(z2);
    }

    private final int getRefreshTimeInSeconds() {
        return this.refreshesFailed < this.maxFailuresUntilPenaltyTime ? this.initialRefreshRateSec : this.penaltyRefreshRateSec;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshRunnable$lambda$0(AdRefresher this$0) {
        Intrinsics.f(this$0, "this$0");
        LogController.INSTANCE.i("Helium AdRefresherCallback onAdNeedsRefreshing.");
        this$0.adRefresherCallback.onAdNeedsRefreshing();
    }

    private final void scheduleNextRefresh() {
        long refreshTimeInSeconds = ((long) getRefreshTimeInSeconds()) * 1000;
        long j = this.totalTimePausedMs;
        long j2 = j > refreshTimeInSeconds ? 0L : refreshTimeInSeconds - j;
        LogController logController = LogController.INSTANCE;
        StringBuilder sb = new StringBuilder("Helium AdRefresherCallback start. Current refresh rate at: ");
        sb.append(this.refreshesFailed < this.maxFailuresUntilPenaltyTime ? this.initialRefreshRateSec : this.penaltyRefreshRateSec);
        sb.append("s. Time to the next update: ");
        sb.append(j2);
        sb.append("ms");
        logController.i(sb.toString());
        this.handler.removeCallbacks(this.refreshRunnable);
        this.handler.postDelayed(this.refreshRunnable, j2);
        this.timeStartedRefreshingMs = SystemClock.uptimeMillis();
    }

    public final void cancel(boolean resetTimer) {
        LogController logController = LogController.INSTANCE;
        logController.i("Helium AdRefresherCallback cancel.");
        this.isResumed = false;
        this.handler.removeCallbacks(this.refreshRunnable);
        if (resetTimer) {
            this.totalTimePausedMs = 0L;
            this.isRefreshing = false;
        } else {
            this.totalTimePausedMs = (SystemClock.uptimeMillis() - this.timeStartedRefreshingMs) + this.totalTimePausedMs;
        }
        logController.i("Helium AdRefresherCallback reset timer. Viewed for: " + this.totalTimePausedMs);
    }

    public final void markLoadFailed() {
        if (this.isRefreshing) {
            this.refreshesFailed++;
            this.totalTimePausedMs = 0L;
            scheduleNextRefresh();
        }
    }

    public final void markLoadSuccess() {
        if (this.isRefreshing) {
            this.refreshesFailed = 0;
            this.totalTimePausedMs = 0L;
            scheduleNextRefresh();
        }
    }

    public final void resume() {
        this.isResumed = true;
        if (this.isRefreshing) {
            scheduleNextRefresh();
        }
    }

    public final void start() {
        this.isRefreshing = true;
        this.totalTimePausedMs = 0L;
        if (this.isResumed) {
            resume();
            this.isResumed = false;
        }
    }
}
