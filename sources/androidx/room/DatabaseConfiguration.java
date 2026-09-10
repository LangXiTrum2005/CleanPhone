package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DatabaseConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SupportSQLiteOpenHelper.Factory f8169c;
    public final RoomDatabase.MigrationContainer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8170e;
    public final boolean f;
    public final RoomDatabase.JournalMode g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f8171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f8172i;
    public final Intent j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f8173l;
    public final Set m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f8174n;
    public final File o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Callable f8175p;
    public final RoomDatabase.PrepackagedDatabaseCallback q;
    public final List r;
    public final List s;
    public final boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final SQLiteDriver f8176u;
    public final CoroutineContext v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f8177w;

    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z3, boolean z4, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List typeConverters, List autoMigrationSpecs, boolean z5, SQLiteDriver sQLiteDriver, CoroutineContext coroutineContext) {
        Intrinsics.f(context, "context");
        Intrinsics.f(migrationContainer, "migrationContainer");
        Intrinsics.f(queryExecutor, "queryExecutor");
        Intrinsics.f(transactionExecutor, "transactionExecutor");
        Intrinsics.f(typeConverters, "typeConverters");
        Intrinsics.f(autoMigrationSpecs, "autoMigrationSpecs");
        this.f8167a = context;
        this.f8168b = str;
        this.f8169c = factory;
        this.d = migrationContainer;
        this.f8170e = list;
        this.f = z2;
        this.g = journalMode;
        this.f8171h = queryExecutor;
        this.f8172i = transactionExecutor;
        this.j = intent;
        this.k = z3;
        this.f8173l = z4;
        this.m = set;
        this.f8174n = str2;
        this.o = file;
        this.f8175p = callable;
        this.q = prepackagedDatabaseCallback;
        this.r = typeConverters;
        this.s = autoMigrationSpecs;
        this.t = z5;
        this.f8176u = sQLiteDriver;
        this.v = coroutineContext;
        this.f8177w = true;
    }
}
