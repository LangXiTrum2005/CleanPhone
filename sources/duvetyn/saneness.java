package duvetyn;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AsyncTimeout.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\b\u0016\u0018\u0000 %2\u00020\u0001:\u0002&'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lduvetyn/saneness;", "Lduvetyn/restrictive;", "<init>", "()V", "", "dovishness", "", "gintrap", "()Z", "stratoscope", "Lduvetyn/sealless;", "sink", "cord", "(Lduvetyn/sealless;)Lduvetyn/sealless;", "Lduvetyn/supplicat;", "source", "cuirassed", "(Lduvetyn/supplicat;)Lduvetyn/supplicat;", "Ljava/io/IOException;", "cause", "arytenoidectomy", "(Ljava/io/IOException;)Ljava/io/IOException;", "rotuma", "", "now", "preprohormone", "(J)J", "", "beachfront", "I", "state", "competently", "Lduvetyn/saneness;", "next", "impromptu", "J", "timeoutAt", "taiyuan", "attabal", "saneness", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class saneness extends restrictive {

    /* JADX INFO: renamed from: apical, reason: collision with root package name */
    public static final Condition f25454apical;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name */
    public static final ReentrantLock f25455cutely;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name */
    public static final long f25456formularize;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name */
    public static final long f25457impassible;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name */
    public static saneness f25459triweekly;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public int state;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public saneness next;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public long timeoutAt;

    /* JADX INFO: renamed from: duvetyn.saneness$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\t\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010 R\u0014\u0010\"\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010 R\u0014\u0010#\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010 R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lduvetyn/saneness$attabal;", "", "<init>", "()V", "Lduvetyn/saneness;", "dern", "()Lduvetyn/saneness;", "node", "", "timeoutNanos", "", "hasDeadline", "", "beachfront", "(Lduvetyn/saneness;JZ)V", "competently", "(Lduvetyn/saneness;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "marial", "()Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/Condition;", "condition", "Ljava/util/concurrent/locks/Condition;", "wireman", "()Ljava/util/concurrent/locks/Condition;", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "STATE_CANCELED", "I", "STATE_IDLE", "STATE_IN_QUEUE", "STATE_TIMED_OUT", "TIMEOUT_WRITE_SIZE", TtmlNode.TAG_HEAD, "Lduvetyn/saneness;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void beachfront(saneness node, long timeoutNanos, boolean hasDeadline) {
            if (saneness.f25459triweekly == null) {
                saneness.f25459triweekly = new saneness();
                new C0592saneness().start();
            }
            long jNanoTime = System.nanoTime();
            if (timeoutNanos != 0 && hasDeadline) {
                node.timeoutAt = Math.min(timeoutNanos, node.dern() - jNanoTime) + jNanoTime;
            } else if (timeoutNanos != 0) {
                node.timeoutAt = timeoutNanos + jNanoTime;
            } else {
                if (!hasDeadline) {
                    throw new AssertionError();
                }
                node.timeoutAt = node.dern();
            }
            long jPreprohormone = node.preprohormone(jNanoTime);
            saneness sanenessVar = saneness.f25459triweekly;
            Intrinsics.beachfront(sanenessVar);
            while (sanenessVar.next != null) {
                saneness sanenessVar2 = sanenessVar.next;
                Intrinsics.beachfront(sanenessVar2);
                if (jPreprohormone < sanenessVar2.preprohormone(jNanoTime)) {
                    break;
                }
                sanenessVar = sanenessVar.next;
                Intrinsics.beachfront(sanenessVar);
            }
            node.next = sanenessVar.next;
            sanenessVar.next = node;
            if (sanenessVar == saneness.f25459triweekly) {
                wireman().signal();
            }
        }

        public final void competently(saneness node) {
            for (saneness sanenessVar = saneness.f25459triweekly; sanenessVar != null; sanenessVar = sanenessVar.next) {
                if (sanenessVar.next == node) {
                    sanenessVar.next = node.next;
                    node.next = null;
                    return;
                }
            }
            throw new IllegalStateException("node was not found in the queue");
        }

        public final saneness dern() throws InterruptedException {
            saneness sanenessVar = saneness.f25459triweekly;
            Intrinsics.beachfront(sanenessVar);
            saneness sanenessVar2 = sanenessVar.next;
            if (sanenessVar2 == null) {
                long jNanoTime = System.nanoTime();
                wireman().await(saneness.f25456formularize, TimeUnit.MILLISECONDS);
                saneness sanenessVar3 = saneness.f25459triweekly;
                Intrinsics.beachfront(sanenessVar3);
                if (sanenessVar3.next != null || System.nanoTime() - jNanoTime < saneness.f25457impassible) {
                    return null;
                }
                return saneness.f25459triweekly;
            }
            long jPreprohormone = sanenessVar2.preprohormone(System.nanoTime());
            if (jPreprohormone > 0) {
                wireman().await(jPreprohormone, TimeUnit.NANOSECONDS);
                return null;
            }
            saneness sanenessVar4 = saneness.f25459triweekly;
            Intrinsics.beachfront(sanenessVar4);
            sanenessVar4.next = sanenessVar2.next;
            sanenessVar2.next = null;
            sanenessVar2.state = 2;
            return sanenessVar2;
        }

        public final ReentrantLock marial() {
            return saneness.f25455cutely;
        }

        public final Condition wireman() {
            return saneness.f25454apical;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"duvetyn/saneness$dern", "Lduvetyn/sealless;", "Lduvetyn/wireman;", "source", "", "byteCount", "", "supplicat", "(Lduvetyn/wireman;J)V", "flush", "()V", "close", "Lduvetyn/saneness;", "attabal", "()Lduvetyn/saneness;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class dern implements sealless {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ sealless f25463arytenoidectomy;

        public dern(sealless seallessVar) {
            this.f25463arytenoidectomy = seallessVar;
        }

        @Override // duvetyn.sealless
        /* JADX INFO: renamed from: attabal, reason: from getter and merged with bridge method [inline-methods] */
        public saneness getTimeout() {
            return saneness.this;
        }

        @Override // duvetyn.sealless, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            saneness sanenessVar = saneness.this;
            sealless seallessVar = this.f25463arytenoidectomy;
            sanenessVar.dovishness();
            try {
                try {
                    seallessVar.close();
                    Unit unit = Unit.f29295attabal;
                    if (sanenessVar.gintrap()) {
                        throw sanenessVar.arytenoidectomy(null);
                    }
                } catch (IOException e) {
                    if (!sanenessVar.gintrap()) {
                        throw e;
                    }
                    throw sanenessVar.arytenoidectomy(e);
                }
            } catch (Throwable th) {
                sanenessVar.gintrap();
                throw th;
            }
        }

        @Override // duvetyn.sealless, java.io.Flushable
        public void flush() throws IOException {
            saneness sanenessVar = saneness.this;
            sealless seallessVar = this.f25463arytenoidectomy;
            sanenessVar.dovishness();
            try {
                try {
                    seallessVar.flush();
                    Unit unit = Unit.f29295attabal;
                    if (sanenessVar.gintrap()) {
                        throw sanenessVar.arytenoidectomy(null);
                    }
                } catch (IOException e) {
                    if (!sanenessVar.gintrap()) {
                        throw e;
                    }
                    throw sanenessVar.arytenoidectomy(e);
                }
            } catch (Throwable th) {
                sanenessVar.gintrap();
                throw th;
            }
        }

        @Override // duvetyn.sealless
        public void supplicat(duvetyn.wireman source, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            attabal.saneness(source.getSize(), 0L, byteCount);
            while (true) {
                long j = 0;
                if (byteCount <= 0) {
                    return;
                }
                oilcan oilcanVar = source.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_HEAD java.lang.String;
                Intrinsics.beachfront(oilcanVar);
                while (j < 65536) {
                    j += (long) (oilcanVar.limit - oilcanVar.pos);
                    if (j >= byteCount) {
                        j = byteCount;
                        break;
                    } else {
                        oilcanVar = oilcanVar.next;
                        Intrinsics.beachfront(oilcanVar);
                    }
                }
                saneness sanenessVar = saneness.this;
                sealless seallessVar = this.f25463arytenoidectomy;
                sanenessVar.dovishness();
                try {
                    try {
                        seallessVar.supplicat(source, j);
                        Unit unit = Unit.f29295attabal;
                        if (sanenessVar.gintrap()) {
                            throw sanenessVar.arytenoidectomy(null);
                        }
                        byteCount -= j;
                    } catch (IOException e) {
                        if (!sanenessVar.gintrap()) {
                            throw e;
                        }
                        throw sanenessVar.arytenoidectomy(e);
                    }
                } catch (Throwable th) {
                    sanenessVar.gintrap();
                    throw th;
                }
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f25463arytenoidectomy + ')';
        }
    }

    /* JADX INFO: renamed from: duvetyn.saneness$saneness, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Lduvetyn/saneness$saneness;", "Ljava/lang/Thread;", "<init>", "()V", "", "run", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C0592saneness extends Thread {
        public C0592saneness() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    ReentrantLock reentrantLockMarial = saneness.INSTANCE.marial();
                    reentrantLockMarial.lock();
                    try {
                        saneness sanenessVarDern = saneness.INSTANCE.dern();
                        if (sanenessVarDern == saneness.f25459triweekly) {
                            Companion unused = saneness.INSTANCE;
                            saneness.f25459triweekly = null;
                            reentrantLockMarial.unlock();
                            return;
                        } else {
                            Unit unit = Unit.f29295attabal;
                            reentrantLockMarial.unlock();
                            if (sanenessVarDern != null) {
                                sanenessVarDern.stratoscope();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLockMarial.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused2) {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.kt */
    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"duvetyn/saneness$wireman", "Lduvetyn/supplicat;", "Lduvetyn/wireman;", "sink", "", "byteCount", "read", "(Lduvetyn/wireman;J)J", "", "close", "()V", "Lduvetyn/saneness;", "attabal", "()Lduvetyn/saneness;", "", "toString", "()Ljava/lang/String;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class wireman implements supplicat {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ supplicat f25465arytenoidectomy;

        public wireman(supplicat supplicatVar) {
            this.f25465arytenoidectomy = supplicatVar;
        }

        @Override // duvetyn.supplicat
        /* JADX INFO: renamed from: attabal, reason: from getter and merged with bridge method [inline-methods] */
        public saneness getTimeout() {
            return saneness.this;
        }

        @Override // duvetyn.supplicat, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            saneness sanenessVar = saneness.this;
            supplicat supplicatVar = this.f25465arytenoidectomy;
            sanenessVar.dovishness();
            try {
                try {
                    supplicatVar.close();
                    Unit unit = Unit.f29295attabal;
                    if (sanenessVar.gintrap()) {
                        throw sanenessVar.arytenoidectomy(null);
                    }
                } catch (IOException e) {
                    if (!sanenessVar.gintrap()) {
                        throw e;
                    }
                    throw sanenessVar.arytenoidectomy(e);
                }
            } catch (Throwable th) {
                sanenessVar.gintrap();
                throw th;
            }
        }

        @Override // duvetyn.supplicat
        public long read(duvetyn.wireman sink, long byteCount) throws IOException {
            Intrinsics.checkNotNullParameter(sink, "sink");
            saneness sanenessVar = saneness.this;
            supplicat supplicatVar = this.f25465arytenoidectomy;
            sanenessVar.dovishness();
            try {
                try {
                    long j = supplicatVar.read(sink, byteCount);
                    if (sanenessVar.gintrap()) {
                        throw sanenessVar.arytenoidectomy(null);
                    }
                    return j;
                } catch (IOException e) {
                    if (sanenessVar.gintrap()) {
                        throw sanenessVar.arytenoidectomy(e);
                    }
                    throw e;
                }
            } catch (Throwable th) {
                sanenessVar.gintrap();
                throw th;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f25465arytenoidectomy + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        f25455cutely = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(conditionNewCondition, "newCondition(...)");
        f25454apical = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f25456formularize = millis;
        f25457impassible = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final IOException arytenoidectomy(IOException cause) {
        return rotuma(cause);
    }

    public final sealless cord(sealless sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new dern(sink);
    }

    public final supplicat cuirassed(supplicat source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new wireman(source);
    }

    public final void dovishness() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            ReentrantLock reentrantLock = f25455cutely;
            reentrantLock.lock();
            try {
                if (this.state != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.state = 1;
                INSTANCE.beachfront(this, timeoutNanos, hasDeadline);
                Unit unit = Unit.f29295attabal;
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean gintrap() {
        ReentrantLock reentrantLock = f25455cutely;
        reentrantLock.lock();
        try {
            int i = this.state;
            this.state = 0;
            if (i != 1) {
                return i == 2;
            }
            INSTANCE.competently(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long preprohormone(long now) {
        return this.timeoutAt - now;
    }

    public IOException rotuma(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public void stratoscope() {
    }
}
