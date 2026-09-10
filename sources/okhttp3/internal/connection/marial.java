package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import com.ironsource.C3414a2;
import com.vungle.ads.internal.ui.AdActivity;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.CertificatePinner;
import okhttp3.cuirassed;
import okhttp3.graveside;
import okhttp3.kowloon;
import okhttp3.monoploid;
import okhttp3.preprohormone;
import okhttp3.rotuma;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.collections.cord;
import p002kotlin.jvm.internal.Intrinsics;
import paddywack.cutely;

/* JADX INFO: compiled from: RealCall.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017*\u0001W\u0018\u00002\u00020\u0001:\u0002uvB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0010\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u000f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0013\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u0010\u0012\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010\fJ\u000f\u0010!\u001a\u00020\u0006H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020#H\u0000¢\u0006\u0004\b*\u0010%J\u001d\u0010,\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010-J\u0017\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J;\u0010:\u001a\u00028\u0000\"\n\b\u0000\u0010\u000e*\u0004\u0018\u00010\r2\u0006\u00107\u001a\u0002002\u0006\u00108\u001a\u00020\u00062\u0006\u00109\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b<\u0010\u0011J\u0011\u0010>\u001a\u0004\u0018\u00010=H\u0000¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\n¢\u0006\u0004\b@\u0010\fJ\u0017\u0010B\u001a\u00020\n2\u0006\u0010A\u001a\u00020\u0006H\u0000¢\u0006\u0004\bB\u0010CJ\r\u0010D\u001a\u00020\u0006¢\u0006\u0004\bD\u0010\"J\u000f\u0010E\u001a\u00020\u0019H\u0000¢\u0006\u0004\bE\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bF\u0010\"R\u0014\u0010Q\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010PR\u001a\u0010V\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010S\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010[R\u0018\u0010_\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010^R\u0018\u0010b\u001a\u0004\u0018\u00010`8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010aR(\u00104\u001a\u0004\u0018\u0001032\b\u0010c\u001a\u0004\u0018\u0001038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b>\u0010d\u001a\u0004\be\u0010fR\u0016\u0010g\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010NR(\u0010k\u001a\u0004\u0018\u0001002\b\u0010c\u001a\u0004\u0018\u0001008\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bM\u0010jR\u0016\u0010l\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010NR\u0016\u0010m\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010NR\u0016\u0010n\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010NR\u0016\u0010p\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010NR\u0018\u00107\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010iR$\u0010t\u001a\u0004\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010d\u001a\u0004\bs\u0010f\"\u0004\bh\u00106¨\u0006w"}, d2 = {"Lokhttp3/internal/connection/marial;", "Lokhttp3/marial;", "Lokhttp3/rotuma;", "client", "Lokhttp3/preprohormone;", "originalRequest", "", "forWebSocket", "<init>", "(Lokhttp3/rotuma;Lokhttp3/preprohormone;Z)V", "", "beachfront", "()V", "Ljava/io/IOException;", "E", "e", "marial", "(Ljava/io/IOException;)Ljava/io/IOException;", "cause", "stratoscope", "Lokhttp3/graveside;", "url", "Lokhttp3/attabal;", "impromptu", "(Lokhttp3/graveside;)Lokhttp3/attabal;", "", "trm", "()Ljava/lang/String;", "competently", "()Lokhttp3/internal/connection/marial;", AdActivity.REQUEST_KEY_EXTRA, "()Lokhttp3/preprohormone;", "cancel", "isCanceled", "()Z", "Lokhttp3/cuirassed;", "execute", "()Lokhttp3/cuirassed;", "Lokhttp3/beachfront;", "responseCallback", "privatdozent", "(Lokhttp3/beachfront;)V", "molybdenite", "newExchangeFinder", "taiyuan", "(Lokhttp3/preprohormone;Z)V", "Lpaddywack/competently;", "chain", "Lokhttp3/internal/connection/dern;", "graveside", "(Lpaddywack/competently;)Lokhttp3/internal/connection/dern;", "Lokhttp3/internal/connection/RealConnection;", "connection", "wireman", "(Lokhttp3/internal/connection/RealConnection;)V", "exchange", "requestDone", "responseDone", "adultoid", "(Lokhttp3/internal/connection/dern;ZZLjava/io/IOException;)Ljava/io/IOException;", "dovishness", "Ljava/net/Socket;", "rotuma", "()Ljava/net/Socket;", "cuirassed", "closeExchange", "apical", "(Z)V", "preprohormone", "gintrap", "kowloon", "Lokhttp3/rotuma;", "formularize", "()Lokhttp3/rotuma;", "arytenoidectomy", "Lokhttp3/preprohormone;", "polloi", "monoploid", "Z", "Lokhttp3/internal/connection/beachfront;", "Lokhttp3/internal/connection/beachfront;", "connectionPool", "Lokhttp3/monoploid;", "Lokhttp3/monoploid;", "triweekly", "()Lokhttp3/monoploid;", "eventListener", "okhttp3/internal/connection/marial$dern", "Lokhttp3/internal/connection/marial$dern;", "timeout", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "executed", "", "Ljava/lang/Object;", "callStackTrace", "Lokhttp3/internal/connection/wireman;", "Lokhttp3/internal/connection/wireman;", "exchangeFinder", "<set-?>", "Lokhttp3/internal/connection/RealConnection;", "impassible", "()Lokhttp3/internal/connection/RealConnection;", "timeoutEarlyExit", "cord", "Lokhttp3/internal/connection/dern;", "()Lokhttp3/internal/connection/dern;", "interceptorScopedExchange", "requestBodyOpen", "responseBodyOpen", "expectMoreExchanges", "oilcan", "canceled", "yemenite", "sealless", "getConnectionToCancel", "connectionToCancel", "attabal", "saneness", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class marial implements okhttp3.marial {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final AtomicBoolean executed;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final preprohormone originalRequest;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public okhttp3.internal.connection.dern interceptorScopedExchange;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean requestBodyOpen;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public Object callStackTrace;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public wireman exchangeFinder;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final dern timeout;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final rotuma client;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final monoploid eventListener;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final boolean forWebSocket;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public volatile boolean canceled;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final beachfront connectionPool;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public boolean timeoutEarlyExit;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public RealConnection connection;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public volatile RealConnection connectionToCancel;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public boolean responseBodyOpen;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public boolean expectMoreExchanges;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public volatile okhttp3.internal.connection.dern exchange;

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\n\u0010\u0007\u001a\u00060\u0000R\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R$\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010 \u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lokhttp3/internal/connection/marial$attabal;", "Ljava/lang/Runnable;", "Lokhttp3/beachfront;", "responseCallback", "<init>", "(Lokhttp3/internal/connection/marial;Lokhttp3/beachfront;)V", "Lokhttp3/internal/connection/marial;", C3414a2.d, "", "marial", "(Lokhttp3/internal/connection/marial$attabal;)V", "Ljava/util/concurrent/ExecutorService;", "executorService", "attabal", "(Ljava/util/concurrent/ExecutorService;)V", "run", "()V", "kowloon", "Lokhttp3/beachfront;", "Ljava/util/concurrent/atomic/AtomicInteger;", "<set-?>", "arytenoidectomy", "Ljava/util/concurrent/atomic/AtomicInteger;", "dern", "()Ljava/util/concurrent/atomic/AtomicInteger;", "callsPerHost", "", "wireman", "()Ljava/lang/String;", "host", "saneness", "()Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public final class attabal implements Runnable {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
        public volatile AtomicInteger callsPerHost;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
        public final okhttp3.beachfront responseCallback;

        /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
        public final /* synthetic */ marial f34564monoploid;

        public attabal(marial this$0, okhttp3.beachfront responseCallback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f34564monoploid = this$0;
            this.responseCallback = responseCallback;
            this.callsPerHost = new AtomicInteger(0);
        }

        public final void attabal(ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            kowloon dispatcher = this.f34564monoploid.getClient().getDispatcher();
            if (hereditist.wireman.f27721impromptu && Thread.holdsLock(dispatcher)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + dispatcher);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e);
                    this.f34564monoploid.dovishness(interruptedIOException);
                    this.responseCallback.onFailure(this.f34564monoploid, interruptedIOException);
                    this.f34564monoploid.getClient().getDispatcher().beachfront(this);
                }
            } catch (Throwable th) {
                this.f34564monoploid.getClient().getDispatcher().beachfront(this);
                throw th;
            }
        }

        /* JADX INFO: renamed from: dern, reason: from getter */
        public final AtomicInteger getCallsPerHost() {
            return this.callsPerHost;
        }

        public final void marial(attabal other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.callsPerHost = other.callsPerHost;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z;
            Throwable th;
            IOException e;
            rotuma client;
            String strArytenoidectomy = Intrinsics.arytenoidectomy("OkHttp ", this.f34564monoploid.gintrap());
            marial marialVar = this.f34564monoploid;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(strArytenoidectomy);
            try {
                marialVar.timeout.dovishness();
                try {
                    try {
                        z = true;
                        try {
                            this.responseCallback.onResponse(marialVar, marialVar.molybdenite());
                            client = marialVar.getClient();
                        } catch (IOException e2) {
                            e = e2;
                            if (z) {
                                elusion.impromptu.INSTANCE.competently().apical(Intrinsics.arytenoidectomy("Callback failure for ", marialVar.trm()), 4, e);
                            } else {
                                this.responseCallback.onFailure(marialVar, e);
                            }
                            client = marialVar.getClient();
                        } catch (Throwable th2) {
                            th = th2;
                            marialVar.cancel();
                            if (!z) {
                                IOException iOException = new IOException(Intrinsics.arytenoidectomy("canceled due to ", th));
                                patroclinal.marial.attabal(iOException, th);
                                this.responseCallback.onFailure(marialVar, iOException);
                            }
                            throw th;
                        }
                    } catch (IOException e3) {
                        z = false;
                        e = e3;
                    } catch (Throwable th3) {
                        z = false;
                        th = th3;
                    }
                    client.getDispatcher().beachfront(this);
                    threadCurrentThread.setName(name);
                } catch (Throwable th4) {
                    marialVar.getClient().getDispatcher().beachfront(this);
                    throw th4;
                }
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final marial getF34564monoploid() {
            return this.f34564monoploid;
        }

        public final String wireman() {
            return this.f34564monoploid.getOriginalRequest().getUrl().getHost();
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/connection/marial$dern", "Lduvetyn/saneness;", "", "stratoscope", "()V", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class dern extends duvetyn.saneness {
        public dern() {
        }

        @Override // duvetyn.saneness
        public void stratoscope() {
            marial.this.cancel();
        }
    }

    /* JADX INFO: compiled from: RealCall.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\n¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/connection/marial$saneness;", "Ljava/lang/ref/WeakReference;", "Lokhttp3/internal/connection/marial;", "referent", "", "callStackTrace", "<init>", "(Lokhttp3/internal/connection/marial;Ljava/lang/Object;)V", "attabal", "Ljava/lang/Object;", "()Ljava/lang/Object;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class saneness extends WeakReference<marial> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final Object callStackTrace;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public saneness(marial referent, Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.callStackTrace = obj;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public final Object getCallStackTrace() {
            return this.callStackTrace;
        }
    }

    public marial(rotuma client, preprohormone originalRequest, boolean z) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = z;
        this.connectionPool = client.getConnectionPool().getDelegate();
        this.eventListener = client.getEventListenerFactory().attabal(this);
        dern dernVar = new dern();
        dernVar.competently(getClient().getCallTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.timeout = dernVar;
        this.executed = new AtomicBoolean();
        this.expectMoreExchanges = true;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:47:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final <E extends IOException> E adultoid(okhttp3.internal.connection.dern exchange, boolean requestDone, boolean responseDone, E e) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.wireman(exchange, this.exchange)) {
            synchronized (this) {
                z = false;
                if (requestDone) {
                    try {
                        if (this.requestBodyOpen) {
                            if (requestDone) {
                                this.requestBodyOpen = false;
                            }
                            if (responseDone) {
                                this.responseBodyOpen = false;
                            }
                            z3 = this.requestBodyOpen;
                            if (z3) {
                                z4 = false;
                            } else {
                                z4 = false;
                            }
                            if (!z3) {
                                z = true;
                            }
                            z2 = z;
                            z = z4;
                        } else if (responseDone || !this.responseBodyOpen) {
                            z2 = false;
                        } else {
                            if (requestDone) {
                                this.requestBodyOpen = false;
                            }
                            if (responseDone) {
                                this.responseBodyOpen = false;
                            }
                            z3 = this.requestBodyOpen;
                            if (z3 || this.responseBodyOpen) {
                                z4 = false;
                            } else {
                                z4 = true;
                            }
                            if (!z3 && !this.responseBodyOpen && !this.expectMoreExchanges) {
                                z = true;
                            }
                            z2 = z;
                            z = z4;
                        }
                        Unit unit = Unit.f29295attabal;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (responseDone) {
                    }
                    z2 = false;
                    Unit unit2 = Unit.f29295attabal;
                }
            }
            if (z) {
                this.exchange = null;
                RealConnection realConnection = this.connection;
                if (realConnection != null) {
                    realConnection.molybdenite();
                }
            }
            if (z2) {
                return (E) marial(e);
            }
        }
        return e;
    }

    public final void apical(boolean closeExchange) {
        okhttp3.internal.connection.dern dernVar;
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            Unit unit = Unit.f29295attabal;
        }
        if (closeExchange && (dernVar = this.exchange) != null) {
            dernVar.wireman();
        }
        this.interceptorScopedExchange = null;
    }

    public final void beachfront() {
        this.callStackTrace = elusion.impromptu.INSTANCE.competently().taiyuan("response.body().close()");
        this.eventListener.beachfront(this);
    }

    @Override // okhttp3.marial
    public void cancel() {
        if (this.canceled) {
            return;
        }
        this.canceled = true;
        okhttp3.internal.connection.dern dernVar = this.exchange;
        if (dernVar != null) {
            dernVar.saneness();
        }
        RealConnection realConnection = this.connectionToCancel;
        if (realConnection != null) {
            realConnection.wireman();
        }
        this.eventListener.competently(this);
    }

    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public marial clone() {
        return new marial(this.client, this.originalRequest, this.forWebSocket);
    }

    public final void cord(RealConnection realConnection) {
        this.connectionToCancel = realConnection;
    }

    public final void cuirassed() {
        if (this.timeoutEarlyExit) {
            throw new IllegalStateException("Check failed.");
        }
        this.timeoutEarlyExit = true;
        this.timeout.gintrap();
    }

    public final IOException dovishness(IOException e) {
        boolean z;
        synchronized (this) {
            try {
                z = false;
                if (this.expectMoreExchanges) {
                    this.expectMoreExchanges = false;
                    if (!this.requestBodyOpen && !this.responseBodyOpen) {
                        z = true;
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z ? marial(e) : e;
    }

    @Override // okhttp3.marial
    public cuirassed execute() {
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.timeout.dovishness();
        beachfront();
        try {
            this.client.getDispatcher().saneness(this);
            return molybdenite();
        } finally {
            this.client.getDispatcher().competently(this);
        }
    }

    /* JADX INFO: renamed from: formularize, reason: from getter */
    public final rotuma getClient() {
        return this.client;
    }

    public final String gintrap() {
        return this.originalRequest.getUrl().monoploid();
    }

    public final okhttp3.internal.connection.dern graveside(paddywack.competently chain) throws IOException {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (!this.expectMoreExchanges) {
                throw new IllegalStateException("released");
            }
            if (this.responseBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f29295attabal;
        }
        wireman wiremanVar = this.exchangeFinder;
        Intrinsics.beachfront(wiremanVar);
        okhttp3.internal.connection.dern dernVar = new okhttp3.internal.connection.dern(this, this.eventListener, wiremanVar, wiremanVar.attabal(this.client, chain));
        this.interceptorScopedExchange = dernVar;
        this.exchange = dernVar;
        synchronized (this) {
            this.requestBodyOpen = true;
            this.responseBodyOpen = true;
        }
        if (this.canceled) {
            throw new IOException("Canceled");
        }
        return dernVar;
    }

    /* JADX INFO: renamed from: impassible, reason: from getter */
    public final RealConnection getConnection() {
        return this.connection;
    }

    public final okhttp3.attabal impromptu(graveside url) {
        SSLSocketFactory sSLSocketFactoryPolder;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        if (url.getIsHttps()) {
            sSLSocketFactoryPolder = this.client.polder();
            hostnameVerifier = this.client.getHostnameVerifier();
            certificatePinner = this.client.getCertificatePinner();
        } else {
            sSLSocketFactoryPolder = null;
            hostnameVerifier = null;
            certificatePinner = null;
        }
        return new okhttp3.attabal(url.getHost(), url.getOrg.jacoco.core.runtime.AgentOptions.PORT java.lang.String(), this.client.getDns(), this.client.getSocketFactory(), sSLSocketFactoryPolder, hostnameVerifier, certificatePinner, this.client.getProxyAuthenticator(), this.client.getProxy(), this.client.trm(), this.client.triweekly(), this.client.getProxySelector());
    }

    @Override // okhttp3.marial
    /* JADX INFO: renamed from: isCanceled, reason: from getter */
    public boolean getCanceled() {
        return this.canceled;
    }

    /* JADX INFO: renamed from: kowloon, reason: from getter */
    public final boolean getForWebSocket() {
        return this.forWebSocket;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final <E extends IOException> E marial(E e) {
        Socket socketRotuma;
        boolean z = hereditist.wireman.f27721impromptu;
        if (z && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + this);
        }
        RealConnection realConnection = this.connection;
        if (realConnection != null) {
            if (z && Thread.holdsLock(realConnection)) {
                throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST NOT hold lock on " + realConnection);
            }
            synchronized (realConnection) {
                socketRotuma = rotuma();
            }
            if (this.connection == null) {
                if (socketRotuma != null) {
                    hereditist.wireman.triweekly(socketRotuma);
                }
                this.eventListener.formularize(this, realConnection);
            } else if (socketRotuma != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        E e2 = (E) stratoscope(e);
        if (e == null) {
            this.eventListener.wireman(this);
            return e2;
        }
        monoploid monoploidVar = this.eventListener;
        Intrinsics.beachfront(e2);
        monoploidVar.marial(this, e2);
        return e2;
    }

    public final cuirassed molybdenite() throws IOException {
        ArrayList arrayList = new ArrayList();
        cord.stratoscope(arrayList, this.client.rotuma());
        arrayList.add(new cutely(this.client));
        arrayList.add(new paddywack.attabal(this.client.getCookieJar()));
        arrayList.add(new okhttp3.internal.cache.attabal(this.client.getCache()));
        arrayList.add(okhttp3.internal.connection.attabal.f34506kowloon);
        if (!this.forWebSocket) {
            cord.stratoscope(arrayList, this.client.cord());
        }
        arrayList.add(new paddywack.saneness(this.forWebSocket));
        try {
            try {
                cuirassed cuirassedVarAttabal = new paddywack.competently(this, arrayList, 0, null, this.originalRequest, this.client.getConnectTimeoutMillis(), this.client.getReadTimeoutMillis(), this.client.getWriteTimeoutMillis()).attabal(this.originalRequest);
                if (getCanceled()) {
                    hereditist.wireman.impassible(cuirassedVarAttabal);
                    throw new IOException("Canceled");
                }
                dovishness(null);
                return cuirassedVarAttabal;
            } catch (IOException e) {
                IOException iOExceptionDovishness = dovishness(e);
                if (iOExceptionDovishness == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
                }
                throw iOExceptionDovishness;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                dovishness(null);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: monoploid, reason: from getter */
    public final okhttp3.internal.connection.dern getInterceptorScopedExchange() {
        return this.interceptorScopedExchange;
    }

    /* JADX INFO: renamed from: polloi, reason: from getter */
    public final preprohormone getOriginalRequest() {
        return this.originalRequest;
    }

    public final boolean preprohormone() {
        wireman wiremanVar = this.exchangeFinder;
        Intrinsics.beachfront(wiremanVar);
        return wiremanVar.marial();
    }

    @Override // okhttp3.marial
    public void privatdozent(okhttp3.beachfront responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (!this.executed.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        beachfront();
        this.client.getDispatcher().attabal(new attabal(this, responseCallback));
    }

    @Override // okhttp3.marial
    public preprohormone request() {
        return this.originalRequest;
    }

    public final Socket rotuma() {
        RealConnection realConnection = this.connection;
        Intrinsics.beachfront(realConnection);
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(realConnection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + realConnection);
        }
        List<Reference<marial>> listTriweekly = realConnection.triweekly();
        Iterator<Reference<marial>> it = listTriweekly.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (Intrinsics.wireman(it.next().get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listTriweekly.remove(i);
        this.connection = null;
        if (listTriweekly.isEmpty()) {
            realConnection.stratoscope(System.nanoTime());
            if (this.connectionPool.dern(realConnection)) {
                return realConnection.oilcan();
            }
        }
        return null;
    }

    public final <E extends IOException> E stratoscope(E cause) {
        if (this.timeoutEarlyExit || !this.timeout.gintrap()) {
            return cause;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final void taiyuan(preprohormone request, boolean newExchangeFinder) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.interceptorScopedExchange != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.responseBodyOpen) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.requestBodyOpen) {
                throw new IllegalStateException("Check failed.");
            }
            Unit unit = Unit.f29295attabal;
        }
        if (newExchangeFinder) {
            this.exchangeFinder = new wireman(this.connectionPool, impromptu(request.getUrl()), this, this.eventListener);
        }
    }

    /* JADX INFO: renamed from: triweekly, reason: from getter */
    public final monoploid getEventListener() {
        return this.eventListener;
    }

    public final String trm() {
        StringBuilder sb = new StringBuilder();
        sb.append(getCanceled() ? "canceled " : "");
        sb.append(this.forWebSocket ? "web socket" : NotificationCompat.CATEGORY_CALL);
        sb.append(" to ");
        sb.append(gintrap());
        return sb.toString();
    }

    public final void wireman(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!hereditist.wireman.f27721impromptu || Thread.holdsLock(connection)) {
            if (this.connection != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.connection = connection;
            connection.triweekly().add(new saneness(this, this.callStackTrace));
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }
}
