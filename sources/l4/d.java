package l4;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import ea.f2;
import g4.g;
import hn.u;
import java.util.List;
import s4.i;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b[] f45026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2 f45027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45028c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, b[] bVarArr, f2 f2Var) {
        super(context, str, null, 12, new c(f2Var, bVarArr));
        f2Var.getClass();
        this.f45027b = f2Var;
        this.f45026a = bVarArr;
    }

    public static b a(b[] bVarArr, SQLiteDatabase sQLiteDatabase) {
        b bVar = bVarArr[0];
        if (bVar == null || ((SQLiteDatabase) bVar.f45023b) != sQLiteDatabase) {
            bVarArr[0] = new b(sQLiteDatabase, 0);
        }
        return bVarArr[0];
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final synchronized void close() {
        super.close();
        this.f45026a[0] = null;
    }

    public final synchronized b d() {
        this.f45028c = false;
        SQLiteDatabase writableDatabase = getWritableDatabase();
        if (!this.f45028c) {
            return a(this.f45026a, writableDatabase);
        }
        close();
        return d();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        a(this.f45026a, sQLiteDatabase);
        this.f45027b.getClass();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        b bVarA = a(this.f45026a, sQLiteDatabase);
        f2 f2Var = this.f45027b;
        i iVar = (i) f2Var.f39410c;
        Cursor cursorQ = bVarA.q("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z10 = cursorQ.moveToFirst() && cursorQ.getInt(0) == 0;
            cursorQ.close();
            i.k(bVarA);
            if (!z10) {
                g gVarN = i.n(bVarA);
                if (!gVarN.f41505b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + gVarN.f41504a);
                }
            }
            f2Var.H(bVarA);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVar.f50111a;
            int i10 = WorkDatabase_Impl.f5022s;
            List list = workDatabase_Impl.f41501g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((e5.g) workDatabase_Impl.f41501g.get(i11)).getClass();
                }
            }
        } catch (Throwable th2) {
            cursorQ.close();
            throw th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f45028c = true;
        this.f45027b.y(a(this.f45026a, sQLiteDatabase), i10, i11);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (this.f45028c) {
            return;
        }
        f2 f2Var = this.f45027b;
        b bVarA = a(this.f45026a, sQLiteDatabase);
        Object obj = f2Var.f39410c;
        Cursor cursorQ = bVarA.q("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z10 = cursorQ.moveToFirst() && cursorQ.getInt(0) != 0;
            cursorQ.close();
            if (z10) {
                Cursor cursorR = bVarA.r(new u("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", 1));
                try {
                    String string = cursorR.moveToFirst() ? cursorR.getString(0) : null;
                    cursorR.close();
                    if (!"c103703e120ae8cc73c9248622f3cd1e".equals(string) && !"49f946663a8deb7054212b8adda248c6".equals(string)) {
                        throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
                    }
                } catch (Throwable th2) {
                    cursorR.close();
                    throw th2;
                }
            } else {
                g gVarN = i.n(bVarA);
                if (!gVarN.f41505b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + gVarN.f41504a);
                }
                f2Var.H(bVarA);
            }
            i iVar = (i) f2Var.f39410c;
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) iVar.f50111a;
            int i10 = WorkDatabase_Impl.f5022s;
            workDatabase_Impl.f41495a = bVarA;
            bVarA.p("PRAGMA foreign_keys = ON");
            g4.c cVar = ((WorkDatabase_Impl) iVar.f50111a).f41498d;
            synchronized (cVar) {
                try {
                    if (cVar.f41478e) {
                        Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    } else {
                        bVarA.p("PRAGMA temp_store = MEMORY;");
                        bVarA.p("PRAGMA recursive_triggers='ON';");
                        bVarA.p("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                        cVar.c(bVarA);
                        cVar.f41479f = new f(((SQLiteDatabase) bVarA.f45023b).compileStatement("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 "));
                        cVar.f41478e = true;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            List list = ((WorkDatabase_Impl) iVar.f50111a).f41501g;
            if (list != null) {
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    ((e5.g) ((WorkDatabase_Impl) iVar.f50111a).f41501g.get(i11)).getClass();
                    bVarA.d();
                    try {
                        int i12 = WorkDatabase.f5021k;
                        bVarA.p("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f5020j) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
                        bVarA.s();
                        bVarA.o();
                    } catch (Throwable th4) {
                        bVarA.o();
                        throw th4;
                    }
                }
            }
            f2Var.f39409b = null;
        } catch (Throwable th5) {
            cursorQ.close();
            throw th5;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        this.f45028c = true;
        this.f45027b.y(a(this.f45026a, sQLiteDatabase), i10, i11);
    }
}
