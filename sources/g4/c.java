package g4;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.lifecycle.a0;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.gms.internal.ads.hx0;
import d5.u;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String[] f41473j = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f41475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase_Impl f41476c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile l4.f f41479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final hx0 f41480g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f41477d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f41478e = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final r.f f41481h = new r.f();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f41482i = new a0(this, 17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f41474a = new HashMap();

    public c(WorkDatabase_Impl workDatabase_Impl, HashMap map, HashMap map2, String... strArr) {
        this.f41476c = workDatabase_Impl;
        this.f41480g = new hx0(strArr.length);
        Collections.newSetFromMap(new IdentityHashMap());
        int length = strArr.length;
        this.f41475b = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = strArr[i10];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f41474a.put(lowerCase, Integer.valueOf(i10));
            String str2 = (String) map.get(strArr[i10]);
            if (str2 != null) {
                this.f41475b[i10] = str2.toLowerCase(locale);
            } else {
                this.f41475b[i10] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f41474a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f41474a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public final boolean a() {
        l4.b bVar = this.f41476c.f41495a;
        if (bVar == null || !((SQLiteDatabase) bVar.f45023b).isOpen()) {
            return false;
        }
        if (!this.f41478e) {
            this.f41476c.f41497c.getWritableDatabase();
        }
        if (this.f41478e) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void b(l4.b bVar, int i10) {
        bVar.p(defpackage.e.h(i10, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)"));
        String str = this.f41475b[i10];
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < 3; i11++) {
            String str2 = f41473j[i11];
            sb2.setLength(0);
            sb2.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            sb2.append("`");
            sb2.append("room_table_modification_trigger_");
            u.r(sb2, str, "_", str2, "`");
            u.r(sb2, " AFTER ", str2, " ON `", str);
            u.r(sb2, "` BEGIN UPDATE ", "room_table_modification_log", " SET ", "invalidated");
            u.r(sb2, " = 1", " WHERE ", "table_id", " = ");
            sb2.append(i10);
            sb2.append(" AND ");
            sb2.append("invalidated");
            sb2.append(" = 0");
            sb2.append("; END");
            bVar.p(sb2.toString());
        }
    }

    public final void c(l4.b bVar) {
        if (((SQLiteDatabase) bVar.f45023b).inTransaction()) {
            return;
        }
        while (true) {
            try {
                ReentrantReadWriteLock.ReadLock lock = this.f41476c.f41502h.readLock();
                lock.lock();
                try {
                    int[] iArrF = this.f41480g.f();
                    if (iArrF == null) {
                        lock.unlock();
                        return;
                    }
                    int length = iArrF.length;
                    bVar.d();
                    for (int i10 = 0; i10 < length; i10++) {
                        try {
                            int i11 = iArrF[i10];
                            if (i11 == 1) {
                                b(bVar, i10);
                            } else if (i11 == 2) {
                                String str = this.f41475b[i10];
                                StringBuilder sb2 = new StringBuilder();
                                String[] strArr = f41473j;
                                for (int i12 = 0; i12 < 3; i12++) {
                                    String str2 = strArr[i12];
                                    sb2.setLength(0);
                                    sb2.append("DROP TRIGGER IF EXISTS ");
                                    sb2.append("`");
                                    sb2.append("room_table_modification_trigger_");
                                    sb2.append(str);
                                    sb2.append("_");
                                    sb2.append(str2);
                                    sb2.append("`");
                                    bVar.p(sb2.toString());
                                }
                            }
                        } catch (Throwable th2) {
                            bVar.o();
                            throw th2;
                        }
                    }
                    bVar.s();
                    bVar.o();
                    hx0 hx0Var = this.f41480g;
                    synchronized (hx0Var) {
                        hx0Var.f15419c = false;
                    }
                    lock.unlock();
                } catch (Throwable th3) {
                    lock.unlock();
                    throw th3;
                }
            } catch (SQLiteException | IllegalStateException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                return;
            }
        }
    }
}
