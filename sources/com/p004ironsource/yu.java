package com.p004ironsource;

import android.os.Handler;
import com.smartdigimkt.h5.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0012\u0018\u00002\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\u0006\u0010\b\u001a\u00020\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\fR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\fR\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\fR\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0016¨\u0006\u001c"}, d2 = {"Lcom/ironsource/yu;", "Lcom/ironsource/hq;", "", "c", "Lcom/ironsource/yu$a;", "a", "b", "", "e", "Landroid/os/Handler;", "Landroid/os/Handler;", "handler", "J", "timeout", "timePassed", "d", "resumeTimeStamp", "pausedTimeStamp", "com/ironsource/yu$b", f.j, "Lcom/ironsource/yu$b;", "safeTask", "()J", "remainingTime", "Ljava/lang/Runnable;", "task", "<init>", "(Landroid/os/Handler;Ljava/lang/Runnable;J)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class yu implements hq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long timeout;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long timePassed;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long resumeTimeStamp;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private long pausedTimeStamp;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final b safeTask;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/yu$a;", "", "", "a", "b", "remainingTime", "timePassed", "", "toString", "", "hashCode", x4.DEFAULT_AUCTION_FALLBACK_VALUE, "", "equals", "J", "c", "()J", "d", "<init>", "(JJ)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long remainingTime;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final long timePassed;

        public a(long j, long j2) {
            this.remainingTime = j;
            this.timePassed = j2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getRemainingTime() {
            return this.remainingTime;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final long getTimePassed() {
            return this.timePassed;
        }

        public final long c() {
            return this.remainingTime;
        }

        public final long d() {
            return this.timePassed;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.remainingTime == aVar.remainingTime && this.timePassed == aVar.timePassed;
        }

        public int hashCode() {
            return Long.hashCode(this.timePassed) + (Long.hashCode(this.remainingTime) * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Status(remainingTime=");
            sb.append(this.remainingTime);
            sb.append(", timePassed=");
            return androidx.media3.extractor.text.ttml.a.o(sb, this.timePassed, ')');
        }

        public final a a(long remainingTime, long timePassed) {
            return new a(remainingTime, timePassed);
        }

        public static /* synthetic */ a a(a aVar, long j, long j2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = aVar.remainingTime;
            }
            if ((i2 & 2) != 0) {
                j2 = aVar.timePassed;
            }
            return aVar.a(j, j2);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"com/ironsource/yu$b", "Lcom/ironsource/ks;", "", "a", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b extends ks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Runnable f27815a;

        public b(Runnable runnable) {
            this.f27815a = runnable;
        }

        @Override // com.p004ironsource.ks
        public void a() {
            this.f27815a.run();
        }
    }

    public yu(Handler handler, Runnable task, long j) {
        Intrinsics.f(handler, "handler");
        Intrinsics.f(task, "task");
        this.handler = handler;
        this.timeout = j;
        this.safeTask = new b(task);
        this.pausedTimeStamp = c();
        a();
    }

    private final long c() {
        return System.currentTimeMillis();
    }

    private final long d() {
        return this.timeout - this.timePassed;
    }

    @Override // com.p004ironsource.hq
    public a a() {
        if (e()) {
            this.resumeTimeStamp = c();
            this.pausedTimeStamp = 0L;
            this.handler.postDelayed(this.safeTask, d());
        }
        return new a(d(), this.timePassed);
    }

    @Override // com.p004ironsource.hq
    public a b() {
        if (!e()) {
            long jC = c();
            this.pausedTimeStamp = jC;
            this.timePassed = (jC - this.resumeTimeStamp) + this.timePassed;
            this.handler.removeCallbacks(this.safeTask);
        }
        return new a(d(), this.timePassed);
    }

    public final boolean e() {
        return this.pausedTimeStamp > 0;
    }
}
