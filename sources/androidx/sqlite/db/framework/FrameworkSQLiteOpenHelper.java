package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "OpenHelper", "Companion", "DBRefHolder", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public final Context X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final String f8373Y;
    public final SupportSQLiteOpenHelper.Callback Z;
    public final boolean e0;
    public final Lazy f0;
    public boolean g0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$Companion;", "", "", "TAG", "Ljava/lang/String;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DBRefHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public FrameworkSQLiteDatabase f8374a = null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "CallbackException", "CallbackName", "Companion", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenHelper extends SQLiteOpenHelper {
        public static final /* synthetic */ int h0 = 0;
        public final Context X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final DBRefHolder f8375Y;
        public final SupportSQLiteOpenHelper.Callback Z;
        public boolean e0;
        public final ProcessLock f0;
        public boolean g0;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CallbackException extends RuntimeException {
            public final CallbackName X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public final Throwable f8376Y;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.X = callbackName;
                this.f8376Y = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.f8376Y;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CallbackName {
            public static final CallbackName X;

            /* JADX INFO: renamed from: Y, reason: collision with root package name */
            public static final CallbackName f8377Y;
            public static final CallbackName Z;
            public static final CallbackName e0;
            public static final CallbackName f0;
            public static final /* synthetic */ CallbackName[] g0;
            public static final /* synthetic */ EnumEntries h0;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                X = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                f8377Y = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                Z = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                e0 = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                f0 = callbackName5;
                CallbackName[] callbackNameArr = {callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
                g0 = callbackNameArr;
                h0 = EnumEntriesKt.a(callbackNameArr);
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) g0.clone();
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public static FrameworkSQLiteDatabase a(DBRefHolder refHolder, SQLiteDatabase sQLiteDatabase) {
                Intrinsics.f(refHolder, "refHolder");
                FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.f8374a;
                if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.X.equals(sQLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
                refHolder.f8374a = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            static {
                int[] iArr = new int[CallbackName.values().length];
                try {
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    CallbackName callbackName = CallbackName.X;
                    iArr[1] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    CallbackName callbackName2 = CallbackName.X;
                    iArr[2] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    CallbackName callbackName3 = CallbackName.X;
                    iArr[3] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    CallbackName callbackName4 = CallbackName.X;
                    iArr[4] = 5;
                } catch (NoSuchFieldError unused5) {
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final DBRefHolder dBRefHolder, final SupportSQLiteOpenHelper.Callback callback) {
            super(context, str, null, callback.f8365a, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.d
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i2 = FrameworkSQLiteOpenHelper.OpenHelper.h0;
                    Intrinsics.c(sQLiteDatabase);
                    FrameworkSQLiteDatabase frameworkSQLiteDatabaseA = FrameworkSQLiteOpenHelper.OpenHelper.Companion.a(dBRefHolder, sQLiteDatabase);
                    callback.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + frameworkSQLiteDatabaseA + ".path");
                    SQLiteDatabase sQLiteDatabase2 = frameworkSQLiteDatabaseA.X;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            SupportSQLiteOpenHelper.Callback.a(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> attachedDbs = null;
                    try {
                        try {
                            attachedDbs = sQLiteDatabase2.getAttachedDbs();
                        } catch (SQLiteException unused) {
                        }
                        try {
                            frameworkSQLiteDatabaseA.close();
                        } catch (IOException unused2) {
                        }
                        if (attachedDbs != null) {
                            return;
                        }
                    } finally {
                        if (attachedDbs != null) {
                            Iterator<T> it = attachedDbs.iterator();
                            while (it.hasNext()) {
                                Object second = ((Pair) it.next()).second;
                                Intrinsics.e(second, "second");
                                SupportSQLiteOpenHelper.Callback.a((String) second);
                            }
                        } else {
                            String path2 = sQLiteDatabase2.getPath();
                            if (path2 != null) {
                                SupportSQLiteOpenHelper.Callback.a(path2);
                            }
                        }
                    }
                }
            });
            Intrinsics.f(context, "context");
            Intrinsics.f(callback, "callback");
            this.X = context;
            this.f8375Y = dBRefHolder;
            this.Z = callback;
            this.f0 = new ProcessLock(context.getCacheDir(), str == null ? androidx.media3.extractor.text.ttml.a.m("toString(...)") : str, false);
        }

        public final SupportSQLiteDatabase a(boolean z2) {
            ProcessLock processLock = this.f0;
            try {
                processLock.a((this.g0 || getDatabaseName() == null) ? false : true);
                this.e0 = false;
                SQLiteDatabase sQLiteDatabaseB = b(z2);
                if (!this.e0) {
                    return Companion.a(this.f8375Y, sQLiteDatabaseB);
                }
                close();
                return a(z2);
            } finally {
                processLock.b();
            }
        }

        public final SQLiteDatabase b(boolean z2) throws Throwable {
            SQLiteDatabase readableDatabase;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z3 = this.g0;
            if (databaseName != null && !z3 && (parentFile = this.X.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z2) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    Intrinsics.c(writableDatabase);
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase2 = getReadableDatabase();
                Intrinsics.c(readableDatabase2);
                return readableDatabase2;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z2) {
                        readableDatabase = getWritableDatabase();
                        Intrinsics.c(readableDatabase);
                    } else {
                        readableDatabase = getReadableDatabase();
                        Intrinsics.c(readableDatabase);
                    }
                    return readableDatabase;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = (CallbackException) th;
                        int iOrdinal = callbackException.X.ordinal();
                        th = callbackException.f8376Y;
                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                            throw th;
                        }
                        if (iOrdinal != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                    }
                    boolean z4 = th instanceof SQLiteException;
                    throw th;
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            ProcessLock processLock = this.f0;
            try {
                processLock.a(processLock.f8387a);
                super.close();
                this.f8375Y.f8374a = null;
                this.g0 = false;
            } finally {
                processLock.b();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase db) {
            Intrinsics.f(db, "db");
            boolean z2 = this.e0;
            SupportSQLiteOpenHelper.Callback callback = this.Z;
            if (!z2 && callback.f8365a != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                callback.b(Companion.a(this.f8375Y, db));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.X, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.f(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.Z.c(Companion.a(this.f8375Y, sqLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.f8377Y, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase db, int i2, int i3) {
            Intrinsics.f(db, "db");
            this.e0 = true;
            try {
                this.Z.d(Companion.a(this.f8375Y, db), i2, i3);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.e0, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase db) {
            Intrinsics.f(db, "db");
            if (!this.e0) {
                try {
                    this.Z.e(Companion.a(this.f8375Y, db));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.f0, th);
                }
            }
            this.g0 = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i2, int i3) {
            Intrinsics.f(sqLiteDatabase, "sqLiteDatabase");
            this.e0 = true;
            try {
                this.Z.f(Companion.a(this.f8375Y, sqLiteDatabase), i2, i3);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.Z, th);
            }
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z2) {
        Intrinsics.f(context, "context");
        Intrinsics.f(callback, "callback");
        this.X = context;
        this.f8373Y = str;
        this.Z = callback;
        this.e0 = z2;
        this.f0 = LazyKt.b(new Function0() { // from class: androidx.sqlite.db.framework.c
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper = this.X;
                String str2 = frameworkSQLiteOpenHelper.f8373Y;
                SupportSQLiteOpenHelper.Callback callback2 = frameworkSQLiteOpenHelper.Z;
                String str3 = frameworkSQLiteOpenHelper.f8373Y;
                Context context2 = frameworkSQLiteOpenHelper.X;
                if (str2 == null || !frameworkSQLiteOpenHelper.e0) {
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, str3, new FrameworkSQLiteOpenHelper.DBRefHolder(), callback2);
                } else {
                    Intrinsics.f(context2, "context");
                    File noBackupFilesDir = context2.getNoBackupFilesDir();
                    Intrinsics.e(noBackupFilesDir, "getNoBackupFilesDir(...)");
                    openHelper = new FrameworkSQLiteOpenHelper.OpenHelper(context2, new File(noBackupFilesDir, str3).getAbsolutePath(), new FrameworkSQLiteOpenHelper.DBRefHolder(), callback2);
                }
                openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.g0);
                return openHelper;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.f0;
        if (lazy.isInitialized()) {
            ((OpenHelper) lazy.getX()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: getDatabaseName, reason: from getter */
    public final String getF8373Y() {
        return this.f8373Y;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return ((OpenHelper) this.f0.getX()).a(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        Lazy lazy = this.f0;
        if (lazy.isInitialized()) {
            ((OpenHelper) lazy.getX()).setWriteAheadLoggingEnabled(z2);
        }
        this.g0 = z2;
    }
}
