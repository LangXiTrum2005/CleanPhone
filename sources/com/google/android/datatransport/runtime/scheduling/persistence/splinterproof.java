package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Named;

/* JADX INFO: compiled from: SchemaManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class splinterproof extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final attabal f19384adultoid;

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final List<attabal> f19385cord;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final attabal f19386dovishness;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name */
    public static final attabal f19387gintrap;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name */
    public static final attabal f19388graveside;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name */
    public static final attabal f19389molybdenite;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name */
    public static final String f19390monoploid = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: polloi, reason: collision with root package name */
    public static int f19391polloi = 7;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name */
    public static final attabal f19392preprohormone;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name */
    public static final attabal f19393rotuma;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
    public boolean f19394arytenoidectomy;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public final int f19395kowloon;

    /* JADX INFO: compiled from: SchemaManager.java */
    public interface attabal {
        void attabal(SQLiteDatabase sQLiteDatabase);
    }

    static {
        attabal attabalVar = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.privatdozent
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                splinterproof.attabal(sQLiteDatabase);
            }
        };
        f19389molybdenite = attabalVar;
        attabal attabalVar2 = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.creditor
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                splinterproof.formularize(sQLiteDatabase);
            }
        };
        f19388graveside = attabalVar2;
        attabal attabalVar3 = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.starveling
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f19384adultoid = attabalVar3;
        attabal attabalVar4 = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.hydrovane
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                splinterproof.arytenoidectomy(sQLiteDatabase);
            }
        };
        f19386dovishness = attabalVar4;
        attabal attabalVar5 = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.walach
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                splinterproof.marial(sQLiteDatabase);
            }
        };
        f19387gintrap = attabalVar5;
        attabal attabalVar6 = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.peridotite
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN product_id INTEGER");
            }
        };
        f19393rotuma = attabalVar6;
        attabal attabalVar7 = new attabal() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.mathsort
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.splinterproof.attabal
            public final void attabal(SQLiteDatabase sQLiteDatabase) {
                splinterproof.saneness(sQLiteDatabase);
            }
        };
        f19392preprohormone = attabalVar7;
        f19385cord = Arrays.asList(attabalVar, attabalVar2, attabalVar3, attabalVar4, attabalVar5, attabalVar6, attabalVar7);
    }

    @Inject
    public splinterproof(Context context, @Named("SQLITE_DB_NAME") String str, @Named("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f19394arytenoidectomy = false;
        this.f19395kowloon = i;
    }

    public static /* synthetic */ void arytenoidectomy(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void attabal(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void formularize(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void marial(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f19390monoploid);
    }

    public static /* synthetic */ void saneness(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN pseudonymous_id TEXT");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_clear_blob BLOB");
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN experiment_ids_encrypted_blob BLOB");
    }

    public final void dovishness(SQLiteDatabase sQLiteDatabase, int i) {
        monoploid(sQLiteDatabase);
        rotuma(sQLiteDatabase, 0, i);
    }

    public final void monoploid(SQLiteDatabase sQLiteDatabase) {
        if (this.f19394arytenoidectomy) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f19394arytenoidectomy = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        dovishness(sQLiteDatabase, this.f19395kowloon);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        dovishness(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        monoploid(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        monoploid(sQLiteDatabase);
        rotuma(sQLiteDatabase, i, i2);
    }

    public final void rotuma(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<attabal> list = f19385cord;
        if (i2 <= list.size()) {
            while (i < i2) {
                f19385cord.get(i).attabal(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }
}
