package okhttp3;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0002\u0010\u0006J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n2\n\u0010\t\u001a\u00060\u0007R\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0010\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\b\u0018\u00010\u0007R\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001e\u001a\u00020\n\"\u0004\b\u0000\u0010\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR*\u0010 \u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010$R*\u0010%\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u00118F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b&\u0010\u0013\"\u0004\b'\u0010$R.\u00100\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010(8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00101R\u001e\u00105\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104R\u001e\u00106\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00104R\u001a\u00107\u001a\b\u0012\u0004\u0012\u00020\b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00104R\u0011\u0010\u0005\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b*\u00108¨\u00069"}, d2 = {"Lokhttp3/kowloon;", "", "<init>", "()V", "Ljava/util/concurrent/ExecutorService;", "executorService", "(Ljava/util/concurrent/ExecutorService;)V", "Lokhttp3/internal/connection/marial$attabal;", "Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "", "attabal", "(Lokhttp3/internal/connection/marial$attabal;)V", "saneness", "(Lokhttp3/internal/connection/marial;)V", "beachfront", "competently", "", "formularize", "()I", "", "host", "wireman", "(Ljava/lang/String;)Lokhttp3/internal/connection/marial$attabal;", "", "apical", "()Z", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Ljava/util/Deque;", "calls", "marial", "(Ljava/util/Deque;Ljava/lang/Object;)V", "maxRequests", "I", "taiyuan", "impassible", "(I)V", "maxRequestsPerHost", "cutely", "setMaxRequestsPerHost", "Ljava/lang/Runnable;", "<set-?>", "dern", "Ljava/lang/Runnable;", "impromptu", "()Ljava/lang/Runnable;", "setIdleCallback", "(Ljava/lang/Runnable;)V", "idleCallback", "Ljava/util/concurrent/ExecutorService;", "executorServiceOrNull", "Ljava/util/ArrayDeque;", "Ljava/util/ArrayDeque;", "readyAsyncCalls", "runningAsyncCalls", "runningSyncCalls", "()Ljava/util/concurrent/ExecutorService;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class kowloon {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int maxRequests;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final ArrayDeque<okhttp3.internal.connection.marial.attabal> runningAsyncCalls;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public final ArrayDeque<okhttp3.internal.connection.marial> runningSyncCalls;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Runnable idleCallback;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final ArrayDeque<okhttp3.internal.connection.marial.attabal> readyAsyncCalls;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int maxRequestsPerHost;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public ExecutorService executorServiceOrNull;

    public kowloon() {
        this.maxRequests = 64;
        this.maxRequestsPerHost = 5;
        this.readyAsyncCalls = new ArrayDeque<>();
        this.runningAsyncCalls = new ArrayDeque<>();
        this.runningSyncCalls = new ArrayDeque<>();
    }

    public final boolean apical() {
        int i;
        boolean z;
        if (hereditist.wireman.f27721impromptu && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Iterator<okhttp3.internal.connection.marial.attabal> it = this.readyAsyncCalls.iterator();
                Intrinsics.checkNotNullExpressionValue(it, "readyAsyncCalls.iterator()");
                while (it.hasNext()) {
                    okhttp3.internal.connection.marial.attabal asyncCall = it.next();
                    if (this.runningAsyncCalls.size() >= taiyuan()) {
                        break;
                    }
                    if (asyncCall.getCallsPerHost().get() < cutely()) {
                        it.remove();
                        asyncCall.getCallsPerHost().incrementAndGet();
                        Intrinsics.checkNotNullExpressionValue(asyncCall, "asyncCall");
                        arrayList.add(asyncCall);
                        this.runningAsyncCalls.add(asyncCall);
                    }
                }
                z = formularize() > 0;
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        int size = arrayList.size();
        for (i = 0; i < size; i++) {
            ((okhttp3.internal.connection.marial.attabal) arrayList.get(i)).attabal(dern());
        }
        return z;
    }

    public final void attabal(okhttp3.internal.connection.marial.attabal call) {
        okhttp3.internal.connection.marial.attabal attabalVarWireman;
        Intrinsics.checkNotNullParameter(call, "call");
        synchronized (this) {
            try {
                this.readyAsyncCalls.add(call);
                if (!call.getF34564monoploid().getForWebSocket() && (attabalVarWireman = wireman(call.wireman())) != null) {
                    call.marial(attabalVarWireman);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        apical();
    }

    public final void beachfront(okhttp3.internal.connection.marial.attabal call) {
        Intrinsics.checkNotNullParameter(call, "call");
        call.getCallsPerHost().decrementAndGet();
        marial(this.runningAsyncCalls, call);
    }

    public final void competently(okhttp3.internal.connection.marial call) {
        Intrinsics.checkNotNullParameter(call, "call");
        marial(this.runningSyncCalls, call);
    }

    public final synchronized int cutely() {
        return this.maxRequestsPerHost;
    }

    public final synchronized ExecutorService dern() {
        ExecutorService executorService;
        try {
            if (this.executorServiceOrNull == null) {
                this.executorServiceOrNull = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), hereditist.wireman.saran(Intrinsics.arytenoidectomy(hereditist.wireman.f27724taiyuan, " Dispatcher"), false));
            }
            executorService = this.executorServiceOrNull;
            Intrinsics.beachfront(executorService);
        } catch (Throwable th) {
            throw th;
        }
        return executorService;
    }

    public final synchronized int formularize() {
        return this.runningAsyncCalls.size() + this.runningSyncCalls.size();
    }

    public final void impassible(int i) {
        if (i < 1) {
            throw new IllegalArgumentException(Intrinsics.arytenoidectomy("max < 1: ", Integer.valueOf(i)).toString());
        }
        synchronized (this) {
            this.maxRequests = i;
            Unit unit = Unit.f29295attabal;
        }
        apical();
    }

    public final synchronized Runnable impromptu() {
        return this.idleCallback;
    }

    public final <T> void marial(Deque<T> calls, T call) {
        Runnable runnableImpromptu;
        synchronized (this) {
            if (!calls.remove(call)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnableImpromptu = impromptu();
            Unit unit = Unit.f29295attabal;
        }
        if (apical() || runnableImpromptu == null) {
            return;
        }
        runnableImpromptu.run();
    }

    public final synchronized void saneness(okhttp3.internal.connection.marial call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.runningSyncCalls.add(call);
    }

    public final synchronized int taiyuan() {
        return this.maxRequests;
    }

    public final okhttp3.internal.connection.marial.attabal wireman(String host) {
        for (okhttp3.internal.connection.marial.attabal attabalVar : this.runningAsyncCalls) {
            if (Intrinsics.wireman(attabalVar.wireman(), host)) {
                return attabalVar;
            }
        }
        for (okhttp3.internal.connection.marial.attabal attabalVar2 : this.readyAsyncCalls) {
            if (Intrinsics.wireman(attabalVar2.wireman(), host)) {
                return attabalVar2;
            }
        }
        return null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public kowloon(ExecutorService executorService) {
        this();
        Intrinsics.checkNotNullParameter(executorService, "executorService");
        this.executorServiceOrNull = executorService;
    }
}
