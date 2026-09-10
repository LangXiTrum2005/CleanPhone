package ea;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f39618e = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f39619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39620d;

    public n0(m1 m1Var) {
        super(m1Var);
        this.f39619c = new l(this, ((m1) this.f3623a).f39582a);
    }

    @Override // ea.f0
    public final boolean J0() {
        return false;
    }

    public final void K0() {
        int iDelete;
        m1 m1Var = (m1) this.f3623a;
        G0();
        try {
            SQLiteDatabase sQLiteDatabaseM0 = M0();
            if (sQLiteDatabaseM0 == null || (iDelete = sQLiteDatabaseM0.delete("messages", null, null)) <= 0) {
                return;
            }
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39760n.c(Integer.valueOf(iDelete), "Reset local analytics data. records");
        } catch (SQLiteException e10) {
            s0 s0Var2 = m1Var.f39587f;
            m1.h(s0Var2);
            s0Var2.f39753f.c(e10, "Error resetting local analytics data. error");
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x006f A[PHI: r4
  0x006f: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:32:0x0080, B:28:0x006d, B:25:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    public final void L0() {
        m1 m1Var = (m1) this.f3623a;
        G0();
        if (!this.f39620d && m1Var.f39582a.getDatabasePath("google_app_measurement_local.db").exists()) {
            int i10 = 5;
            for (int i11 = 0; i11 < 5; i11++) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabaseM0 = M0();
                        if (sQLiteDatabaseM0 == null) {
                            this.f39620d = true;
                            return;
                        }
                        sQLiteDatabaseM0.beginTransaction();
                        sQLiteDatabaseM0.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        sQLiteDatabaseM0.setTransactionSuccessful();
                        sQLiteDatabaseM0.endTransaction();
                        sQLiteDatabaseM0.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i10);
                        i10 += 20;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    } catch (SQLiteFullException e10) {
                        s0 s0Var = m1Var.f39587f;
                        m1.h(s0Var);
                        s0Var.f39753f.c(e10, "Error deleting app launch break from local database");
                        this.f39620d = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                } catch (SQLiteException e11) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    s0 s0Var2 = m1Var.f39587f;
                    m1.h(s0Var2);
                    s0Var2.f39753f.c(e11, "Error deleting app launch break from local database");
                    this.f39620d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            s0 s0Var3 = m1Var.f39587f;
            m1.h(s0Var3);
            s0Var3.f39756i.b("Error deleting app launch break from local database in reasonable time");
        }
    }

    public final SQLiteDatabase M0() {
        if (this.f39620d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f39619c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f39620d = true;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0120 A[Catch: all -> 0x0154, TRY_ENTER, TryCatch #10 {all -> 0x0154, blocks: (B:30:0x0088, B:32:0x008e, B:43:0x00ae, B:45:0x00cf, B:47:0x00d8, B:49:0x00de, B:59:0x00f8, B:73:0x0120, B:75:0x0126, B:76:0x0129, B:93:0x015b, B:83:0x0144), top: B:109:0x0088 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139  */
    /* JADX WARN: Code duplicated, block: B:86:0x014b  */
    /* JADX WARN: Code duplicated, block: B:88:0x0150 A[PHI: r8 r10 r17
  0x0150: PHI (r8v5 int) = (r8v3 int), (r8v3 int), (r8v6 int) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r10v7 android.database.sqlite.SQLiteDatabase) = 
  (r10v5 android.database.sqlite.SQLiteDatabase)
  (r10v6 android.database.sqlite.SQLiteDatabase)
  (r10v8 android.database.sqlite.SQLiteDatabase)
 binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]
  0x0150: PHI (r17v7 boolean) = (r17v4 boolean), (r17v5 boolean), (r17v8 boolean) binds: [B:79:0x013c, B:96:0x016d, B:87:0x014e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x016a  */
    public final boolean N0(int i10, byte[] bArr) {
        SQLiteDatabase sQLiteDatabaseM0;
        boolean z10;
        boolean z11;
        Cursor cursorRawQuery;
        m1 m1Var = (m1) this.f3623a;
        G0();
        boolean z12 = false;
        z12 = false;
        if (!this.f39620d) {
            g gVar = m1Var.f39585d;
            s0 s0Var = m1Var.f39587f;
            c0 c0Var = d0.W0;
            Cursor cursor = null;
            cursor = null;
            n4 n4VarK0 = gVar.R0(null, c0Var) ? m1Var.m().K0(null) : null;
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", Integer.valueOf(i10));
            contentValues.put("entry", bArr);
            if (m1Var.f39585d.R0(null, c0Var) && n4VarK0 != null) {
                contentValues.put("app_version", n4VarK0.f39630c);
                contentValues.put("app_version_int", Long.valueOf(n4VarK0.f39637j));
            }
            int i11 = 5;
            int i12 = 0;
            for (int i13 = 5; i12 < i13; i13 = 5) {
                try {
                    sQLiteDatabaseM0 = M0();
                    if (sQLiteDatabaseM0 == null) {
                        this.f39620d = true;
                    } else {
                        try {
                            sQLiteDatabaseM0.beginTransaction();
                            cursorRawQuery = sQLiteDatabaseM0.rawQuery("select count(1) from messages", null);
                            long j10 = 0;
                            if (cursorRawQuery != null) {
                                try {
                                    try {
                                        if (cursorRawQuery.moveToFirst()) {
                                            j10 = cursorRawQuery.getLong(z12 ? 1 : 0);
                                        }
                                    } catch (SQLiteDatabaseLockedException unused) {
                                        z10 = z12 ? 1 : 0;
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM0 != null) {
                                            sQLiteDatabaseM0.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    } catch (SQLiteFullException e10) {
                                        e = e10;
                                        z10 = z12 ? 1 : 0;
                                        m1.h(s0Var);
                                        s0Var.f39753f.c(e, "Error writing entry; local database full");
                                        this.f39620d = true;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM0 != null) {
                                            sQLiteDatabaseM0.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        z10 = z12 ? 1 : 0;
                                        z11 = true;
                                        if (sQLiteDatabaseM0 != null) {
                                            sQLiteDatabaseM0.endTransaction();
                                        }
                                        m1.h(s0Var);
                                        s0Var.f39753f.c(e, "Error writing entry to local database");
                                        this.f39620d = z11;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM0 != null) {
                                            sQLiteDatabaseM0.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    cursor = cursorRawQuery;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabaseM0 != null) {
                                        sQLiteDatabaseM0.close();
                                    }
                                    throw th;
                                }
                            }
                            if (j10 >= 100000) {
                                m1.h(s0Var);
                                s0Var.f39753f.b("Data loss, local db full");
                                long j11 = 100001 - j10;
                                long jDelete = sQLiteDatabaseM0.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j11)});
                                if (jDelete != j11) {
                                    m1.h(s0Var);
                                    bo.b bVar = s0Var.f39753f;
                                    z10 = z12 ? 1 : 0;
                                    try {
                                        try {
                                            z11 = true;
                                            try {
                                                bVar.e("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j11), Long.valueOf(jDelete), Long.valueOf(j11 - jDelete));
                                            } catch (SQLiteFullException e12) {
                                                e = e12;
                                                m1.h(s0Var);
                                                s0Var.f39753f.c(e, "Error writing entry; local database full");
                                                this.f39620d = true;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM0 != null) {
                                                    sQLiteDatabaseM0.close();
                                                }
                                                i12++;
                                                z12 = z10;
                                            } catch (SQLiteException e13) {
                                                e = e13;
                                                if (sQLiteDatabaseM0 != null) {
                                                    sQLiteDatabaseM0.endTransaction();
                                                }
                                                m1.h(s0Var);
                                                s0Var.f39753f.c(e, "Error writing entry to local database");
                                                this.f39620d = z11;
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                if (sQLiteDatabaseM0 != null) {
                                                    sQLiteDatabaseM0.close();
                                                }
                                                i12++;
                                                z12 = z10;
                                            }
                                        } catch (SQLiteFullException e14) {
                                            e = e14;
                                            m1.h(s0Var);
                                            s0Var.f39753f.c(e, "Error writing entry; local database full");
                                            this.f39620d = true;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM0 != null) {
                                                sQLiteDatabaseM0.close();
                                            }
                                            i12++;
                                            z12 = z10;
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            z11 = true;
                                            if (sQLiteDatabaseM0 != null && sQLiteDatabaseM0.inTransaction()) {
                                                sQLiteDatabaseM0.endTransaction();
                                            }
                                            m1.h(s0Var);
                                            s0Var.f39753f.c(e, "Error writing entry to local database");
                                            this.f39620d = z11;
                                            if (cursorRawQuery != null) {
                                                cursorRawQuery.close();
                                            }
                                            if (sQLiteDatabaseM0 != null) {
                                                sQLiteDatabaseM0.close();
                                            }
                                            i12++;
                                            z12 = z10;
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        if (sQLiteDatabaseM0 != null) {
                                            sQLiteDatabaseM0.close();
                                        }
                                        i12++;
                                        z12 = z10;
                                    }
                                } else {
                                    z10 = z12 ? 1 : 0;
                                    z11 = true;
                                }
                            } else {
                                z10 = z12 ? 1 : 0;
                                z11 = true;
                            }
                            sQLiteDatabaseM0.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabaseM0.setTransactionSuccessful();
                            sQLiteDatabaseM0.endTransaction();
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            sQLiteDatabaseM0.close();
                            return z11;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteFullException e16) {
                            e = e16;
                            z10 = z12 ? 1 : 0;
                            cursorRawQuery = null;
                        } catch (SQLiteException e17) {
                            e = e17;
                            z10 = z12 ? 1 : 0;
                            z11 = true;
                            cursorRawQuery = null;
                        } catch (Throwable th3) {
                            th = th3;
                        }
                    }
                } catch (SQLiteDatabaseLockedException unused4) {
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseM0 = null;
                    cursorRawQuery = null;
                } catch (SQLiteFullException e18) {
                    e = e18;
                    z10 = z12 ? 1 : 0;
                    sQLiteDatabaseM0 = null;
                    cursorRawQuery = null;
                } catch (SQLiteException e19) {
                    e = e19;
                    z10 = z12 ? 1 : 0;
                    z11 = true;
                    sQLiteDatabaseM0 = null;
                    cursorRawQuery = null;
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteDatabaseM0 = null;
                }
            }
            boolean z13 = z12 ? 1 : 0;
            m1.h(s0Var);
            s0Var.f39760n.b("Failed to write entry to local database");
            return z13;
        }
        return z12;
    }
}
