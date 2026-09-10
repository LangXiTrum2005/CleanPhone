package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import javax.inject.Provider;
import javax.inject.Singleton;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore {
    public static final Encoding g0 = new Encoding("proto");
    public final SchemaManager X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Clock f16959Y;
    public final Clock Z;
    public final EventStoreConfig e0;
    public final Provider f0;

    public interface Function<T, U> {
        Object apply(Object obj);
    }

    public static class Metadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f16960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f16961b;

        public Metadata(String str, String str2) {
            this.f16960a = str;
            this.f16961b = str2;
        }
    }

    public interface Producer<T> {
    }

    public SQLiteEventStore(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, Provider provider) {
        this.X = schemaManager;
        this.f16959Y = clock;
        this.Z = clock2;
        this.e0 = eventStoreConfig;
        this.f0 = provider;
    }

    public static Long l(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))));
        if (transportContext.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String o(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((PersistedEvent) it.next()).b());
            if (it.hasNext()) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object p(Cursor cursor, Function function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void A0(final long j, final TransportContext transportContext) {
        m(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.g0;
                ContentValues contentValues = new ContentValues();
                contentValues.put("next_request_ms", Long.valueOf(j));
                TransportContext transportContext2 = transportContext;
                if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext2.b(), String.valueOf(PriorityMapping.a(transportContext2.d()))}) < 1) {
                    contentValues.put("backend_name", transportContext2.b());
                    contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(PriorityMapping.a(transportContext2.d())));
                    sQLiteDatabase.insert("transport_contexts", null, contentValues);
                }
                return null;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final Iterable F() {
        return (Iterable) m(new a(0));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final PersistedEvent F0(TransportContext transportContext, EventInternal eventInternal) {
        Logging.b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.d(), eventInternal.l(), transportContext.b());
        long jLongValue = ((Long) m(new c(this, eventInternal, transportContext, 0))).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return new AutoValue_PersistedEvent(jLongValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final long X(TransportContext transportContext) {
        Cursor cursorRawQuery = k().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.b(), String.valueOf(PriorityMapping.a(transportContext.d()))});
        try {
            Cursor cursor = cursorRawQuery;
            return (cursor.moveToNext() ? Long.valueOf(cursor.getLong(0)) : 0L).longValue();
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final boolean Z(TransportContext transportContext) {
        Boolean bool;
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            Long l2 = l(sQLiteDatabaseK, transportContext);
            if (l2 == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor cursorRawQuery = k().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{l2.toString()});
                try {
                    Boolean boolValueOf = Boolean.valueOf(cursorRawQuery.moveToNext());
                    cursorRawQuery.close();
                    bool = boolValueOf;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
            sQLiteDatabaseK.setTransactionSuccessful();
            sQLiteDatabaseK.endTransaction();
            return bool.booleanValue();
        } catch (Throwable th2) {
            sQLiteDatabaseK.endTransaction();
            throw th2;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public final Object a(SynchronizationGuard.CriticalSection criticalSection) {
        SQLiteDatabase sQLiteDatabaseK = k();
        Clock clock = this.Z;
        long jA = clock.a();
        while (true) {
            try {
                sQLiteDatabaseK.beginTransaction();
                try {
                    Object objExecute = criticalSection.execute();
                    sQLiteDatabaseK.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseK.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e2) {
                if (clock.a() >= ((long) this.e0.a()) + jA) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void a0(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + o(iterable);
            SQLiteDatabase sQLiteDatabaseK = k();
            sQLiteDatabaseK.beginTransaction();
            try {
                sQLiteDatabaseK.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseK.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        i(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseK.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseK.setTransactionSuccessful();
                    sQLiteDatabaseK.endTransaction();
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                sQLiteDatabaseK.endTransaction();
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.X.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final void d() {
        m(new f(this, 0));
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final Iterable g0(final TransportContext transportContext) {
        return (Iterable) m(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                SQLiteEventStore sQLiteEventStore = this.f16971a;
                EventStoreConfig eventStoreConfig = sQLiteEventStore.e0;
                int iC = eventStoreConfig.c();
                TransportContext transportContext2 = transportContext;
                ArrayList arrayListN = sQLiteEventStore.n(sQLiteDatabase, transportContext2, iC);
                for (Priority priority : Priority.values()) {
                    if (priority != transportContext2.d()) {
                        int iC2 = eventStoreConfig.c() - arrayListN.size();
                        if (iC2 <= 0) {
                            break;
                        }
                        arrayListN.addAll(sQLiteEventStore.n(sQLiteDatabase, transportContext2.e(priority), iC2));
                    }
                }
                HashMap map = new HashMap();
                StringBuilder sb = new StringBuilder("event_id IN (");
                for (int i2 = 0; i2 < arrayListN.size(); i2++) {
                    sb.append(((PersistedEvent) arrayListN.get(i2)).b());
                    if (i2 < arrayListN.size() - 1) {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                }
                sb.append(')');
                SQLiteEventStore.p(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new f(map, 1));
                ListIterator listIterator = arrayListN.listIterator();
                while (listIterator.hasNext()) {
                    PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
                    if (map.containsKey(Long.valueOf(persistedEvent.b()))) {
                        EventInternal.Builder builderN = persistedEvent.a().n();
                        for (SQLiteEventStore.Metadata metadata : (Set) map.get(Long.valueOf(persistedEvent.b()))) {
                            builderN.a(metadata.f16960a, metadata.f16961b);
                        }
                        listIterator.set(new AutoValue_PersistedEvent(persistedEvent.b(), persistedEvent.c(), builderN.b()));
                    }
                }
                return arrayListN;
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final ClientMetrics h() {
        int i2 = ClientMetrics.f16875e;
        ClientMetrics.Builder builder = new ClientMetrics.Builder();
        HashMap map = new HashMap();
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            ClientMetrics clientMetrics = (ClientMetrics) p(sQLiteDatabaseK.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new c(this, map, builder, 2));
            sQLiteDatabaseK.setTransactionSuccessful();
            return clientMetrics;
        } finally {
            sQLiteDatabaseK.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public final void i(final long j, final LogEventDropped.Reason reason, final String str) {
        m(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.g0;
                int i2 = reason.X;
                String string = Integer.toString(i2);
                String str2 = str;
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str2, string});
                try {
                    Encoding encoding2 = SQLiteEventStore.g0;
                    boolean z2 = cursorRawQuery.getCount() > 0;
                    cursorRawQuery.close();
                    long j2 = j;
                    if (z2) {
                        sQLiteDatabase.execSQL(androidx.media3.extractor.text.ttml.a.j(j2, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str2, Integer.toString(i2)});
                        return null;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("log_source", str2);
                    contentValues.put("reason", Integer.valueOf(i2));
                    contentValues.put("events_dropped_count", Long.valueOf(j2));
                    sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                    return null;
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            }
        });
    }

    public final SQLiteDatabase k() {
        SchemaManager schemaManager = this.X;
        Objects.requireNonNull(schemaManager);
        Clock clock = this.Z;
        long jA = clock.a();
        while (true) {
            try {
                return schemaManager.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e2) {
                if (clock.a() >= ((long) this.e0.a()) + jA) {
                    throw new SynchronizationException("Timed out while trying to open db.", e2);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object m(Function function) {
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            Object objApply = function.apply(sQLiteDatabaseK);
            sQLiteDatabaseK.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseK.endTransaction();
        }
    }

    public final ArrayList n(SQLiteDatabase sQLiteDatabase, TransportContext transportContext, int i2) {
        ArrayList arrayList = new ArrayList();
        Long l2 = l(sQLiteDatabase, transportContext);
        if (l2 == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{l2.toString()}, null, null, null, String.valueOf(i2)), new c(this, arrayList, transportContext, 1));
        return arrayList;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final int y() {
        long jA = this.f16959Y.a() - this.e0.b();
        SQLiteDatabase sQLiteDatabaseK = k();
        sQLiteDatabaseK.beginTransaction();
        try {
            String[] strArr = {String.valueOf(jA)};
            Cursor cursorRawQuery = sQLiteDatabaseK.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
            try {
                Cursor cursor = cursorRawQuery;
                while (cursor.moveToNext()) {
                    i(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
                }
                cursorRawQuery.close();
                int iDelete = sQLiteDatabaseK.delete("events", "timestamp_ms < ?", strArr);
                sQLiteDatabaseK.setTransactionSuccessful();
                sQLiteDatabaseK.endTransaction();
                return iDelete;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabaseK.endTransaction();
            throw th2;
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public final void z(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            k().compileStatement("DELETE FROM events WHERE _id in " + o(iterable)).execute();
        }
    }
}
