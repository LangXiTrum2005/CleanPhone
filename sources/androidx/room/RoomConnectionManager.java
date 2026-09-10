package androidx.room;

import android.content.Context;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.PassthroughConnectionPool;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import androidx.sqlite.driver.SupportSQLiteDriver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/RoomConnectionManager;", "Landroidx/room/BaseRoomConnectionManager;", "SupportOpenHelperCallback", "NoOpOpenDelegate", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RoomConnectionManager extends BaseRoomConnectionManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f8213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectionPool f8214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SupportSQLiteOpenHelper f8215c;
    public SupportSQLiteDatabase d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomConnectionManager$NoOpOpenDelegate;", "Landroidx/room/RoomOpenDelegate;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NoOpOpenDelegate extends RoomOpenDelegate {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomConnectionManager$SupportOpenHelperCallback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            new SupportSQLiteConnection(frameworkSQLiteDatabase);
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) {
            f(frameworkSQLiteDatabase, i2, i3);
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            new SupportSQLiteConnection(frameworkSQLiteDatabase);
            throw null;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) {
            new SupportSQLiteConnection(frameworkSQLiteDatabase);
            throw null;
        }
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, b bVar, Function2 function2) {
        List list = EmptyList.X;
        List list2 = databaseConfiguration.f8170e;
        this.f8213a = list2 == null ? list : list2;
        final b bVar2 = new b(this, 0);
        ArrayList arrayListP = CollectionsKt.P(new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public final void a(SupportSQLiteDatabase db) {
                Intrinsics.f(db, "db");
                bVar2.invoke(db);
            }
        }, list2 != null ? list2 : list);
        Context context = databaseConfiguration.f8167a;
        Intrinsics.f(context, "context");
        RoomDatabase.MigrationContainer migrationContainer = databaseConfiguration.d;
        Intrinsics.f(migrationContainer, "migrationContainer");
        RoomDatabase.JournalMode journalMode = databaseConfiguration.g;
        Executor queryExecutor = databaseConfiguration.f8171h;
        Intrinsics.f(queryExecutor, "queryExecutor");
        Executor transactionExecutor = databaseConfiguration.f8172i;
        Intrinsics.f(transactionExecutor, "transactionExecutor");
        List typeConverters = databaseConfiguration.r;
        Intrinsics.f(typeConverters, "typeConverters");
        List autoMigrationSpecs = databaseConfiguration.s;
        Intrinsics.f(autoMigrationSpecs, "autoMigrationSpecs");
        DatabaseConfiguration databaseConfiguration2 = new DatabaseConfiguration(context, databaseConfiguration.f8168b, databaseConfiguration.f8169c, migrationContainer, arrayListP, databaseConfiguration.f, journalMode, queryExecutor, transactionExecutor, databaseConfiguration.j, databaseConfiguration.k, databaseConfiguration.f8173l, databaseConfiguration.m, databaseConfiguration.f8174n, databaseConfiguration.o, databaseConfiguration.f8175p, databaseConfiguration.q, typeConverters, autoMigrationSpecs, databaseConfiguration.t, databaseConfiguration.f8176u, databaseConfiguration.v);
        databaseConfiguration2.f8177w = databaseConfiguration.f8177w;
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = (SupportSQLiteOpenHelper) bVar.invoke(databaseConfiguration2);
        this.f8215c = supportSQLiteOpenHelper;
        SupportSQLiteDriver supportSQLiteDriver = new SupportSQLiteDriver(supportSQLiteOpenHelper);
        String str = databaseConfiguration.f8168b;
        this.f8214b = new PassthroughConnectionPool(supportSQLiteDriver, str == null ? ":memory:" : str, function2);
        boolean z2 = journalMode == RoomDatabase.JournalMode.Z;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.setWriteAheadLoggingEnabled(z2);
        }
    }
}
