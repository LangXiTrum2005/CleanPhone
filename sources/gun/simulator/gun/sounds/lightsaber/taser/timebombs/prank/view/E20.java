package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.mbridge.msdk.newreward.player.view.hybrid.util.MRAIDCommunicatorUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class E20 implements InterfaceC3562gs, La0, InterfaceC4768uf {
    public static final C3736ir f = new C3736ir("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3928l30 f3002a;
    public final InterfaceC2438Gf b;
    public final InterfaceC2438Gf c;
    public final Z7 d;
    public final InterfaceC5194zW e;

    public E20(InterfaceC2438Gf interfaceC2438Gf, InterfaceC2438Gf interfaceC2438Gf2, Z7 z7, C3928l30 c3928l30, InterfaceC5194zW interfaceC5194zW) {
        this.f3002a = c3928l30;
        this.b = interfaceC2438Gf;
        this.c = interfaceC2438Gf2;
        this.d = z7;
        this.e = interfaceC5194zW;
    }

    public static Long i(SQLiteDatabase sQLiteDatabase, Sd0 sd0) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        C4289p8 c4289p8 = (C4289p8) sd0;
        ArrayList arrayList = new ArrayList(Arrays.asList(c4289p8.f4824a, String.valueOf(JV.a(c4289p8.c))));
        byte[] bArr = c4289p8.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) p(sQLiteDatabase.query("transport_contexts", new String[]{com.umeng.analytics.pro.bg.d}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new Nd0(16));
    }

    public static String o(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((C3675i8) it.next()).f4490a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object p(Cursor cursor, C20 c20) {
        try {
            return c20.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3002a.close();
    }

    public final SQLiteDatabase h() {
        Object objApply;
        C3928l30 c3928l30 = this.f3002a;
        Objects.requireNonNull(c3928l30);
        Nd0 nd0 = new Nd0(10);
        C5211zg0 c5211zg0 = (C5211zg0) this.c;
        long jA = c5211zg0.a();
        while (true) {
            try {
                objApply = c3928l30.getWritableDatabase();
                break;
            } catch (SQLiteDatabaseLockedException e) {
                if (c5211zg0.a() >= ((long) this.d.c) + jA) {
                    objApply = nd0.apply(e);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        return (SQLiteDatabase) objApply;
    }

    public final Object k(C20 c20) {
        SQLiteDatabase sQLiteDatabaseH = h();
        sQLiteDatabaseH.beginTransaction();
        try {
            Object objApply = c20.apply(sQLiteDatabaseH);
            sQLiteDatabaseH.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseH.endTransaction();
        }
    }

    public final ArrayList m(SQLiteDatabase sQLiteDatabase, Sd0 sd0, int i) {
        ArrayList arrayList = new ArrayList();
        Long lI = i(sQLiteDatabase, sd0);
        if (lI == null) {
            return arrayList;
        }
        p(sQLiteDatabase.query(com.umeng.analytics.pro.f.ax, new String[]{com.umeng.analytics.pro.bg.d, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", MRAIDCommunicatorUtil.PLACEMENT_INLINE}, "context_id = ?", new String[]{lI.toString()}, null, null, null, String.valueOf(i)), new C2351Cw(this, arrayList, sd0, 3));
        return arrayList;
    }

    public final Object n(Ka0 ka0) {
        SQLiteDatabase sQLiteDatabaseH = h();
        Nd0 nd0 = new Nd0(9);
        C5211zg0 c5211zg0 = (C5211zg0) this.c;
        long jA = c5211zg0.a();
        while (true) {
            try {
                sQLiteDatabaseH.beginTransaction();
                break;
            } catch (SQLiteDatabaseLockedException e) {
                if (c5211zg0.a() >= ((long) this.d.c) + jA) {
                    nd0.apply(e);
                    break;
                }
                SystemClock.sleep(50L);
            }
        }
        try {
            Object objExecute = ka0.execute();
            sQLiteDatabaseH.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseH.endTransaction();
        }
    }
}
