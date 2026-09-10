package y8;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements d, z8.c, c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o8.c f54338f = new o8.c("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f54339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a9.a f54340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a9.a f54341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f54342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final vj.a f54343e;

    public h(a9.a aVar, a9.a aVar2, a aVar3, j jVar, vj.a aVar4) {
        this.f54339a = jVar;
        this.f54340b = aVar;
        this.f54341c = aVar2;
        this.f54342d = aVar3;
        this.f54343e = aVar4;
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, r8.i iVar) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.f49489a, String.valueOf(b9.a.a(iVar.f49491c))));
        byte[] bArr = iVar.f49490b;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            Cursor cursor = cursorQuery;
            return !cursor.moveToNext() ? null : Long.valueOf(cursor.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public static String p(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).f54331a);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object q(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f54339a.close();
    }

    public final SQLiteDatabase d() {
        j jVar = this.f54339a;
        Objects.requireNonNull(jVar);
        a9.a aVar = this.f54341c;
        long jF = aVar.f();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.f() >= ((long) this.f54342d.f54328c) + jF) {
                    throw new z8.a("Timed out while trying to open db.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object j(f fVar) {
        SQLiteDatabase sQLiteDatabaseD = d();
        sQLiteDatabaseD.beginTransaction();
        try {
            Object objApply = fVar.apply(sQLiteDatabaseD);
            sQLiteDatabaseD.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseD.endTransaction();
        }
    }

    public final ArrayList k(SQLiteDatabase sQLiteDatabase, r8.i iVar, int i10) {
        ArrayList arrayList = new ArrayList();
        Long lH = h(sQLiteDatabase, iVar);
        if (lH == null) {
            return arrayList;
        }
        q(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lH.toString()}, null, null, null, String.valueOf(i10)), new ac.a(this, arrayList, iVar, 15));
        return arrayList;
    }

    public final void n(long j10, u8.c cVar, String str) {
        j(new qd.d(str, cVar, j10));
    }

    public final Object o(z8.b bVar) {
        SQLiteDatabase sQLiteDatabaseD = d();
        a9.a aVar = this.f54341c;
        long jF = aVar.f();
        while (true) {
            try {
                sQLiteDatabaseD.beginTransaction();
                try {
                    Object objExecute = bVar.execute();
                    sQLiteDatabaseD.setTransactionSuccessful();
                    return objExecute;
                } finally {
                    sQLiteDatabaseD.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e10) {
                if (aVar.f() >= ((long) this.f54342d.f54328c) + jF) {
                    throw new z8.a("Timed out while trying to acquire the lock.", e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }
}
