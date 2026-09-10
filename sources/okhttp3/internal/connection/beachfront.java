package okhttp3.internal.connection;

import androidx.core.app.NotificationCompat;
import java.lang.ref.Reference;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import okhttp3.trm;
import org.jacoco.core.runtime.AgentOptions;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RealConnectionPool.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001+\u0018\u0000 \u001c2\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u0006¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0014\u0010'\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010&R\u0014\u0010*\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010)R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010,R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00190.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010/¨\u00061"}, d2 = {"Lokhttp3/internal/connection/beachfront;", "", "Lgold/marial;", "taskRunner", "", "maxIdleConnections", "", "keepAliveDuration", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Lgold/marial;IJLjava/util/concurrent/TimeUnit;)V", "wireman", "()I", "Lokhttp3/attabal;", AgentOptions.ADDRESS, "Lokhttp3/internal/connection/marial;", NotificationCompat.CATEGORY_CALL, "", "Lokhttp3/trm;", "routes", "", "requireMultiplexed", "attabal", "(Lokhttp3/attabal;Lokhttp3/internal/connection/marial;Ljava/util/List;Z)Z", "Lokhttp3/internal/connection/RealConnection;", "connection", "", "beachfront", "(Lokhttp3/internal/connection/RealConnection;)V", "dern", "(Lokhttp3/internal/connection/RealConnection;)Z", "now", "saneness", "(J)J", "marial", "(Lokhttp3/internal/connection/RealConnection;J)I", "I", "J", "keepAliveDurationNs", "Lgold/wireman;", "Lgold/wireman;", "cleanupQueue", "okhttp3/internal/connection/beachfront$saneness", "Lokhttp3/internal/connection/beachfront$saneness;", "cleanupTask", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "connections", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class beachfront {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final int maxIdleConnections;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final gold.wireman cleanupQueue;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final ConcurrentLinkedQueue<RealConnection> connections;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final long keepAliveDurationNs;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final saneness cleanupTask;

    /* JADX INFO: compiled from: RealConnectionPool.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"okhttp3/internal/connection/beachfront$saneness", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class saneness extends gold.attabal {
        public saneness(String str) {
            super(str, false, 2, null);
        }

        @Override // gold.attabal
        public long beachfront() {
            return beachfront.this.saneness(System.nanoTime());
        }
    }

    public beachfront(gold.marial taskRunner, int i, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        this.maxIdleConnections = i;
        this.keepAliveDurationNs = timeUnit.toNanos(j);
        this.cleanupQueue = taskRunner.taiyuan();
        this.cleanupTask = new saneness(Intrinsics.arytenoidectomy(hereditist.wireman.f27724taiyuan, " ConnectionPool"));
        this.connections = new ConcurrentLinkedQueue<>();
        if (j <= 0) {
            throw new IllegalArgumentException(Intrinsics.arytenoidectomy("keepAliveDuration <= 0: ", Long.valueOf(j)).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002d A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:8:0x0024, B:15:0x0033, B:13:0x002d, B:18:0x0037), top: B:26:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0037 A[SYNTHETIC] */
    public final boolean attabal(okhttp3.attabal address, marial call, List<trm> routes, boolean requireMultiplexed) {
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(call, "call");
        for (RealConnection connection : this.connections) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (requireMultiplexed) {
                    try {
                        if (connection.dovishness()) {
                            if (connection.graveside(address, routes)) {
                                call.wireman(connection);
                                return true;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (connection.graveside(address, routes)) {
                    call.wireman(connection);
                    return true;
                }
                Unit unit = Unit.f29295attabal;
            }
        }
        return false;
    }

    public final void beachfront(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!hereditist.wireman.f27721impromptu || Thread.holdsLock(connection)) {
            this.connections.add(connection);
            gold.wireman.cutely(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return;
        }
        throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
    }

    public final boolean dern(RealConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        if (!connection.getNoNewExchanges() && this.maxIdleConnections != 0) {
            gold.wireman.cutely(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return false;
        }
        connection.trm(true);
        this.connections.remove(connection);
        if (this.connections.isEmpty()) {
            this.cleanupQueue.attabal();
        }
        return true;
    }

    public final int marial(RealConnection connection, long now) {
        if (hereditist.wireman.f27721impromptu && !Thread.holdsLock(connection)) {
            throw new AssertionError("Thread " + ((Object) Thread.currentThread().getName()) + " MUST hold lock on " + connection);
        }
        List<Reference<marial>> listTriweekly = connection.triweekly();
        int i = 0;
        while (i < listTriweekly.size()) {
            Reference<marial> reference = listTriweekly.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                elusion.impromptu.INSTANCE.competently().impassible("A connection to " + connection.getRoute().getOrg.jacoco.core.runtime.AgentOptions.ADDRESS java.lang.String().getUrl() + " was leaked. Did you forget to close a response body?", ((marial.saneness) reference).getCallStackTrace());
                listTriweekly.remove(i);
                connection.trm(true);
                if (listTriweekly.isEmpty()) {
                    connection.stratoscope(now - this.keepAliveDurationNs);
                    return 0;
                }
            }
        }
        return listTriweekly.size();
    }

    public final long saneness(long now) {
        int i = 0;
        long j = Long.MIN_VALUE;
        RealConnection realConnection = null;
        int i2 = 0;
        for (RealConnection connection : this.connections) {
            Intrinsics.checkNotNullExpressionValue(connection, "connection");
            synchronized (connection) {
                if (marial(connection, now) > 0) {
                    i2++;
                } else {
                    i++;
                    long idleAtNs = now - connection.getIdleAtNs();
                    if (idleAtNs > j) {
                        realConnection = connection;
                        j = idleAtNs;
                    }
                    Unit unit = Unit.f29295attabal;
                }
            }
        }
        long j2 = this.keepAliveDurationNs;
        if (j < j2 && i <= this.maxIdleConnections) {
            if (i > 0) {
                return j2 - j;
            }
            if (i2 > 0) {
                return j2;
            }
            return -1L;
        }
        Intrinsics.beachfront(realConnection);
        synchronized (realConnection) {
            if (!realConnection.triweekly().isEmpty()) {
                return 0L;
            }
            if (realConnection.getIdleAtNs() + j != now) {
                return 0L;
            }
            realConnection.trm(true);
            this.connections.remove(realConnection);
            hereditist.wireman.triweekly(realConnection.oilcan());
            if (this.connections.isEmpty()) {
                this.cleanupQueue.attabal();
            }
            return 0L;
        }
    }

    public final int wireman() {
        return this.connections.size();
    }
}
