package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.ads.RequestConfiguration;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0017\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006!"}, d2 = {"Lokio/AsyncTimeout;", "Lokio/Timeout;", "", "enter", "()V", "", "exit", "()Z", "Lokio/Sink;", "sink", "(Lokio/Sink;)Lokio/Sink;", "Lokio/Source;", "source", "(Lokio/Source;)Lokio/Source;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "block", "withTimeout", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Ljava/io/IOException;", "cause", "access$newTimeoutException", "(Ljava/io/IOException;)Ljava/io/IOException;", "newTimeoutException", "inQueue", "Z", "next", "Lokio/AsyncTimeout;", "", "timeoutAt", "J", "Companion", "Watchdog", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class AsyncTimeout extends Timeout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static final Condition condition;
    private static AsyncTimeout head;
    private static final ReentrantLock lock;
    private boolean inQueue;
    private AsyncTimeout next;
    private long timeoutAt;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokio/AsyncTimeout$Companion;", "", "", "IDLE_TIMEOUT_MILLIS", "J", "IDLE_TIMEOUT_NANOS", "", "TIMEOUT_WRITE_SIZE", "I", "Lokio/AsyncTimeout;", TtmlNode.TAG_HEAD, "Lokio/AsyncTimeout;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public static AsyncTimeout a() throws InterruptedException {
            AsyncTimeout asyncTimeout = AsyncTimeout.head;
            Intrinsics.c(asyncTimeout);
            AsyncTimeout asyncTimeout2 = asyncTimeout.next;
            if (asyncTimeout2 == null) {
                long jNanoTime = System.nanoTime();
                AsyncTimeout.condition.await(AsyncTimeout.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                AsyncTimeout asyncTimeout3 = AsyncTimeout.head;
                Intrinsics.c(asyncTimeout3);
                if (asyncTimeout3.next != null || System.nanoTime() - jNanoTime < AsyncTimeout.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return AsyncTimeout.head;
            }
            long jAccess$remainingNanos = AsyncTimeout.access$remainingNanos(asyncTimeout2, System.nanoTime());
            if (jAccess$remainingNanos > 0) {
                AsyncTimeout.condition.await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
                return null;
            }
            AsyncTimeout asyncTimeout4 = AsyncTimeout.head;
            Intrinsics.c(asyncTimeout4);
            asyncTimeout4.next = asyncTimeout2.next;
            asyncTimeout2.next = null;
            return asyncTimeout2;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokio/AsyncTimeout$Watchdog;", "Ljava/lang/Thread;", "okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Watchdog extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            while (true) {
                try {
                    AsyncTimeout.INSTANCE.getClass();
                    ReentrantLock reentrantLock = AsyncTimeout.lock;
                    reentrantLock.lock();
                    try {
                        AsyncTimeout asyncTimeoutA = Companion.a();
                        if (asyncTimeoutA == AsyncTimeout.head) {
                            AsyncTimeout.head = null;
                            reentrantLock.unlock();
                            return;
                        } else {
                            reentrantLock.unlock();
                            if (asyncTimeoutA != null) {
                                asyncTimeoutA.timedOut();
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        Intrinsics.e(conditionNewCondition, "newCondition(...)");
        condition = conditionNewCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public static final long access$remainingNanos(AsyncTimeout asyncTimeout, long j) {
        return asyncTimeout.timeoutAt - j;
    }

    public final IOException access$newTimeoutException(IOException cause) {
        return newTimeoutException(cause);
    }

    public final void enter() {
        long timeoutNanos = getTimeoutNanos();
        boolean hasDeadline = getHasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion companion = INSTANCE;
            companion.getClass();
            companion.getClass();
            ReentrantLock reentrantLock = lock;
            reentrantLock.lock();
            try {
                if (this.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.inQueue = true;
                if (head == null) {
                    head = new AsyncTimeout();
                    Watchdog watchdog = new Watchdog("Okio Watchdog");
                    watchdog.setDaemon(true);
                    watchdog.start();
                }
                long jNanoTime = System.nanoTime();
                if (timeoutNanos != 0 && hasDeadline) {
                    this.timeoutAt = Math.min(timeoutNanos, deadlineNanoTime() - jNanoTime) + jNanoTime;
                } else if (timeoutNanos != 0) {
                    this.timeoutAt = timeoutNanos + jNanoTime;
                } else {
                    if (!hasDeadline) {
                        throw new AssertionError();
                    }
                    this.timeoutAt = deadlineNanoTime();
                }
                long jAccess$remainingNanos = access$remainingNanos(this, jNanoTime);
                AsyncTimeout asyncTimeout = head;
                Intrinsics.c(asyncTimeout);
                while (asyncTimeout.next != null) {
                    AsyncTimeout asyncTimeout2 = asyncTimeout.next;
                    Intrinsics.c(asyncTimeout2);
                    if (jAccess$remainingNanos < access$remainingNanos(asyncTimeout2, jNanoTime)) {
                        break;
                    }
                    asyncTimeout = asyncTimeout.next;
                    Intrinsics.c(asyncTimeout);
                }
                this.next = asyncTimeout.next;
                asyncTimeout.next = this;
                if (asyncTimeout == head) {
                    INSTANCE.getClass();
                    condition.signal();
                }
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    public final boolean exit() {
        Companion companion = INSTANCE;
        companion.getClass();
        companion.getClass();
        ReentrantLock reentrantLock = lock;
        reentrantLock.lock();
        try {
            if (!this.inQueue) {
                return false;
            }
            this.inQueue = false;
            for (AsyncTimeout asyncTimeout = head; asyncTimeout != null; asyncTimeout = asyncTimeout.next) {
                if (asyncTimeout.next == this) {
                    asyncTimeout.next = this.next;
                    this.next = null;
                    return false;
                }
            }
            return true;
        } finally {
            reentrantLock.unlock();
        }
    }

    public IOException newTimeoutException(IOException cause) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (cause != null) {
            interruptedIOException.initCause(cause);
        }
        return interruptedIOException;
    }

    public final Sink sink(final Sink sink) {
        Intrinsics.f(sink, "sink");
        return new Sink() { // from class: okio.AsyncTimeout.sink.1
            @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                Sink sink2 = sink;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.close();
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e2) {
                        if (!asyncTimeout.exit()) {
                            throw e2;
                        }
                        throw asyncTimeout.access$newTimeoutException(e2);
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Sink, java.io.Flushable
            public final void flush() throws IOException {
                Sink sink2 = sink;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        sink2.flush();
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e2) {
                        if (!asyncTimeout.exit()) {
                            throw e2;
                        }
                        throw asyncTimeout.access$newTimeoutException(e2);
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Sink
            /* JADX INFO: renamed from: timeout */
            public final Timeout getF45152Y() {
                return AsyncTimeout.this;
            }

            public final String toString() {
                return "AsyncTimeout.sink(" + sink + ')';
            }

            @Override // okio.Sink
            public final void write(Buffer source, long j) throws IOException {
                Intrinsics.f(source, "source");
                SegmentedByteString.b(source.f45132Y, 0L, j);
                while (true) {
                    long j2 = 0;
                    if (j <= 0) {
                        return;
                    }
                    Segment segment = source.X;
                    Intrinsics.c(segment);
                    while (j2 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        j2 += (long) (segment.f45159c - segment.f45158b);
                        if (j2 >= j) {
                            j2 = j;
                            break;
                        } else {
                            segment = segment.f;
                            Intrinsics.c(segment);
                        }
                    }
                    Sink sink2 = sink;
                    AsyncTimeout asyncTimeout = AsyncTimeout.this;
                    asyncTimeout.enter();
                    try {
                        try {
                            sink2.write(source, j2);
                            if (asyncTimeout.exit()) {
                                throw asyncTimeout.access$newTimeoutException(null);
                            }
                            j -= j2;
                        } catch (IOException e2) {
                            if (!asyncTimeout.exit()) {
                                throw e2;
                            }
                            throw asyncTimeout.access$newTimeoutException(e2);
                        }
                    } catch (Throwable th) {
                        asyncTimeout.exit();
                        throw th;
                    }
                }
            }
        };
    }

    public final Source source(final Source source) {
        Intrinsics.f(source, "source");
        return new Source() { // from class: okio.AsyncTimeout.source.1
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                Source source2 = source;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        source2.close();
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                    } catch (IOException e2) {
                        if (!asyncTimeout.exit()) {
                            throw e2;
                        }
                        throw asyncTimeout.access$newTimeoutException(e2);
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Source
            public final long read(Buffer sink, long j) throws IOException {
                Intrinsics.f(sink, "sink");
                Source source2 = source;
                AsyncTimeout asyncTimeout = AsyncTimeout.this;
                asyncTimeout.enter();
                try {
                    try {
                        long j2 = source2.read(sink, j);
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(null);
                        }
                        return j2;
                    } catch (IOException e2) {
                        if (asyncTimeout.exit()) {
                            throw asyncTimeout.access$newTimeoutException(e2);
                        }
                        throw e2;
                    }
                } catch (Throwable th) {
                    asyncTimeout.exit();
                    throw th;
                }
            }

            @Override // okio.Source
            /* JADX INFO: renamed from: timeout */
            public final Timeout getF45149Y() {
                return AsyncTimeout.this;
            }

            public final String toString() {
                return "AsyncTimeout.source(" + source + ')';
            }
        };
    }

    public void timedOut() {
    }

    public final <T> T withTimeout(Function0<? extends T> block) throws IOException {
        Intrinsics.f(block, "block");
        enter();
        try {
            try {
                T t = (T) block.invoke();
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                return t;
            } catch (IOException e2) {
                if (exit()) {
                    throw access$newTimeoutException(e2);
                }
                throw e2;
            }
        } catch (Throwable th) {
            exit();
            throw th;
        }
    }
}
