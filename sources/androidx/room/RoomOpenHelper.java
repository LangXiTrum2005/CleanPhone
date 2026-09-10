package androidx.room;

import android.database.Cursor;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.driver.SupportSQLiteConnection;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Delegate", "ValidationResult", "Companion", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DatabaseConfiguration f8242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f8243c;
    public final Delegate d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Deprecated
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class ValidationResult {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f8244a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f8245b;

        public ValidationResult(boolean z2, String str) {
            this.f8244a = z2;
            this.f8245b = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration configuration, Delegate delegate) {
        super(12);
        Intrinsics.f(configuration, "configuration");
        this.f8243c = configuration.f8170e;
        this.f8242b = configuration;
        this.d = delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void c(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        Cursor cursorV = frameworkSQLiteDatabase.V(new SimpleSQLiteQuery("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            Cursor cursor = cursorV;
            boolean z2 = false;
            if (cursor.moveToFirst() && cursor.getInt(0) == 0) {
                z2 = true;
            }
            cursorV.close();
            Delegate delegate = this.d;
            delegate.a(frameworkSQLiteDatabase);
            if (!z2) {
                ValidationResult validationResultF = delegate.f(frameworkSQLiteDatabase);
                if (!validationResultF.f8244a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultF.f8245b);
                }
            }
            frameworkSQLiteDatabase.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            frameworkSQLiteDatabase.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            delegate.c();
            List list = this.f8243c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.a(cursorV, th);
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) throws IOException {
        f(frameworkSQLiteDatabase, i2, i3);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) throws IOException {
        Cursor cursorV = frameworkSQLiteDatabase.V(new SimpleSQLiteQuery("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            Cursor cursor = cursorV;
            boolean z2 = cursor.moveToFirst() && cursor.getInt(0) != 0;
            cursorV.close();
            Delegate delegate = this.d;
            if (z2) {
                Cursor cursorV2 = frameworkSQLiteDatabase.V(new SimpleSQLiteQuery("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    Cursor cursor2 = cursorV2;
                    String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                    cursorV2.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        throw new IllegalStateException(android.support.v4.media.a.C("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: c103703e120ae8cc73c9248622f3cd1e, found: ", string));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.a(cursorV2, th);
                        throw th2;
                    }
                }
            } else {
                ValidationResult validationResultF = delegate.f(frameworkSQLiteDatabase);
                if (!validationResultF.f8244a) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + validationResultF.f8245b);
                }
                frameworkSQLiteDatabase.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
            }
            delegate.d(frameworkSQLiteDatabase);
            List list = this.f8243c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).a(frameworkSQLiteDatabase);
                }
            }
            this.f8242b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                CloseableKt.a(cursorV, th3);
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:1: B:12:0x0023->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x007e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x002a  */
    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    /* JADX WARN: Code duplicated, block: B:20:0x003b  */
    /* JADX WARN: Code duplicated, block: B:21:0x003d  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:28:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0072  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void f(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i2, int i3) throws IOException {
        Set set;
        Iterable<Migration> iterable;
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        Pair pair;
        Iterator it;
        boolean z2;
        int iIntValue;
        TreeMap treeMap2;
        DatabaseConfiguration databaseConfiguration = this.f8242b;
        Delegate delegate = this.d;
        if (databaseConfiguration != null) {
            RoomDatabase.MigrationContainer migrationContainer = databaseConfiguration.d;
            migrationContainer.getClass();
            Intrinsics.f(migrationContainer, "<this>");
            if (i2 == i3) {
                iterable = EmptyList.X;
            } else {
                boolean z3 = i3 > i2;
                ArrayList arrayList = new ArrayList();
                int i4 = i2;
                while (true) {
                    if (z3) {
                        if (i4 < i3) {
                            linkedHashMap = migrationContainer.f8233a;
                            if (z3) {
                                treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i4));
                                if (treeMap2 == null) {
                                    pair = null;
                                } else {
                                    pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                                }
                            } else {
                                treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i4));
                                if (treeMap == null) {
                                    pair = null;
                                } else {
                                    pair = new Pair(treeMap, treeMap.keySet());
                                }
                            }
                            if (pair == null) {
                                Map map = (Map) pair.X;
                                it = ((Iterable) pair.f43249Y).iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z2 = false;
                                        break;
                                    }
                                    iIntValue = ((Number) it.next()).intValue();
                                    if (z3) {
                                        if (i4 + 1 <= iIntValue && iIntValue <= i3) {
                                            Object obj = map.get(Integer.valueOf(iIntValue));
                                            Intrinsics.c(obj);
                                            arrayList.add(obj);
                                            z2 = true;
                                            i4 = iIntValue;
                                            break;
                                        }
                                    } else {
                                        if (i3 <= iIntValue && iIntValue < i4) {
                                            Object obj2 = map.get(Integer.valueOf(iIntValue));
                                            Intrinsics.c(obj2);
                                            arrayList.add(obj2);
                                            z2 = true;
                                            i4 = iIntValue;
                                            break;
                                            break;
                                        }
                                    }
                                }
                                if (!z2) {
                                }
                            }
                            iterable = null;
                        } else {
                            iterable = arrayList;
                        }
                    } else if (i4 > i3) {
                        linkedHashMap = migrationContainer.f8233a;
                        if (z3) {
                            treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i4));
                            if (treeMap2 == null) {
                                pair = null;
                            } else {
                                pair = new Pair(treeMap2, treeMap2.descendingKeySet());
                            }
                        } else {
                            treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i4));
                            if (treeMap == null) {
                                pair = null;
                            } else {
                                pair = new Pair(treeMap, treeMap.keySet());
                            }
                        }
                        if (pair == null) {
                            Map map2 = (Map) pair.X;
                            it = ((Iterable) pair.f43249Y).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    z2 = false;
                                    break;
                                    break;
                                }
                                iIntValue = ((Number) it.next()).intValue();
                                if (z3) {
                                    if (i4 + 1 <= iIntValue) {
                                        continue;
                                    }
                                } else if (i3 <= iIntValue) {
                                    continue;
                                }
                            }
                            if (!z2) {
                            }
                        }
                        iterable = null;
                    } else {
                        iterable = arrayList;
                    }
                }
            }
            if (iterable != null) {
                delegate.e(frameworkSQLiteDatabase);
                for (Migration migration : iterable) {
                    new SupportSQLiteConnection(frameworkSQLiteDatabase);
                    migration.getClass();
                    migration.a(frameworkSQLiteDatabase);
                }
                ValidationResult validationResultF = delegate.f(frameworkSQLiteDatabase);
                if (!validationResultF.f8244a) {
                    throw new IllegalStateException("Migration didn't properly handle: " + validationResultF.f8245b);
                }
                frameworkSQLiteDatabase.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                frameworkSQLiteDatabase.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
                return;
            }
        }
        DatabaseConfiguration databaseConfiguration2 = this.f8242b;
        if (databaseConfiguration2 != null) {
            Intrinsics.f(databaseConfiguration2, "<this>");
            boolean z4 = false;
            if ((i2 <= i3 || !databaseConfiguration2.f8173l) && databaseConfiguration2.k && ((set = databaseConfiguration2.m) == null || !set.contains(Integer.valueOf(i2)))) {
                z4 = true;
            }
            if (!z4) {
                if (databaseConfiguration2.t) {
                    Cursor cursorV = frameworkSQLiteDatabase.V(new SimpleSQLiteQuery("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
                    try {
                        Cursor cursor = cursorV;
                        ListBuilder listBuilderP = CollectionsKt.p();
                        while (cursor.moveToNext()) {
                            String string = cursor.getString(0);
                            Intrinsics.c(string);
                            if (!StringsKt.M(string, "sqlite_", false) && !string.equals("android_metadata")) {
                                listBuilderP.add(new Pair(string, Boolean.valueOf(Intrinsics.a(cursor.getString(1), "view"))));
                            }
                        }
                        ListBuilder listBuilderM = CollectionsKt.m(listBuilderP);
                        cursorV.close();
                        ListIterator listIterator = listBuilderM.listIterator(0);
                        while (listIterator.hasNext()) {
                            Pair pair2 = (Pair) listIterator.next();
                            String str = (String) pair2.X;
                            if (((Boolean) pair2.f43249Y).booleanValue()) {
                                frameworkSQLiteDatabase.C("DROP VIEW IF EXISTS " + str);
                            } else {
                                frameworkSQLiteDatabase.C("DROP TABLE IF EXISTS " + str);
                            }
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.a(cursorV, th);
                            throw th2;
                        }
                    }
                } else {
                    delegate.b(frameworkSQLiteDatabase);
                }
                List list = this.f8243c;
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        ((RoomDatabase.Callback) it2.next()).getClass();
                    }
                }
                delegate.a(frameworkSQLiteDatabase);
                return;
            }
        }
        throw new IllegalStateException(androidx.datastore.preferences.protobuf.a.e(i2, i3, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
    }

    @Deprecated
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b'\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Delegate {
        public abstract void a(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public abstract void c();

        public abstract void d(FrameworkSQLiteDatabase frameworkSQLiteDatabase);

        public ValidationResult f(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }

        public void e(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void b(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }
}
