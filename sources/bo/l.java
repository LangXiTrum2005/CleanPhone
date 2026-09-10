package bo;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.hardware.display.DisplayManager;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.u9;
import com.google.android.gms.internal.measurement.v9;
import com.google.android.gms.internal.measurement.y9;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import d5.u;
import ea.e4;
import ea.h4;
import ea.m1;
import ea.s0;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.p;
import io.flutter.view.q;
import java.io.IOException;
import java.io.Serializable;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;
import xn.s;
import xn.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements xn.e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static l f5816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static p f5817f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f5818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f5819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f5820c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5821d;

    public /* synthetic */ l(ea.c cVar) {
        this.f5821d = cVar;
    }

    public static l b(DisplayManager displayManager, FlutterJNI flutterJNI) {
        if (f5816e == null) {
            f5816e = new l(flutterJNI);
        }
        if (f5817f == null) {
            l lVar = f5816e;
            Objects.requireNonNull(lVar);
            p pVar = new p(lVar, displayManager, 0);
            f5817f = pVar;
            displayManager.registerDisplayListener(pVar, null);
        }
        if (f5816e.f5818a == -1) {
            float refreshRate = displayManager.getDisplay(0).getRefreshRate();
            f5816e.f5818a = (long) (1.0E9d / ((double) refreshRate));
            flutterJNI.setRefreshRateFPS(refreshRate);
        }
        return f5816e;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x002e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:31:0x0033 A[SYNTHETIC] */
    public boolean a(xn.a aVar, i iVar, ArrayList arrayList, boolean z10) {
        Iterator it = ((ConcurrentLinkedQueue) this.f5821d).iterator();
        while (true) {
            if (!it.hasNext()) {
                return false;
            }
            k connection = (k) it.next();
            n.e(connection, "connection");
            synchronized (connection) {
                if (z10) {
                    try {
                        if (!(connection.f5806g != null)) {
                            continue;
                        } else if (connection.h(aVar, arrayList)) {
                            iVar.b(connection);
                            return true;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else if (connection.h(aVar, arrayList)) {
                    iVar.b(connection);
                    return true;
                }
            }
        }
    }

    public int c(k kVar, long j10) {
        byte[] bArr = yn.a.f54560a;
        ArrayList arrayList = kVar.f5814p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String message = "A connection to " + kVar.f5801b.f54095a.f53917h + " was leaked. Did you forget to close a response body?";
                go.m mVar = go.m.f42045a;
                go.m mVar2 = go.m.f42045a;
                Object obj = ((g) reference).f5784a;
                mVar2.getClass();
                n.f(message, "message");
                if (obj == null) {
                    message = message.concat(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
                }
                go.m.g(message, 5, (Throwable) obj);
                arrayList.remove(i10);
                kVar.f5809j = true;
                if (arrayList.isEmpty()) {
                    kVar.f5815q = j10 - this.f5818a;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0100 A[PHI: r6 r16 r17
  0x0100: PHI (r6v3 android.database.Cursor) = (r6v4 android.database.Cursor), (r6v6 android.database.Cursor) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r16v3 com.google.android.gms.internal.measurement.v9) = (r16v5 com.google.android.gms.internal.measurement.v9), (r16v10 com.google.android.gms.internal.measurement.v9) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]
  0x0100: PHI (r17v2 long) = (r17v4 long), (r17v7 long) binds: [B:61:0x012b, B:46:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    public v9 d(v9 v9Var, String str) throws Throwable {
        Cursor cursor;
        v9 v9Var2;
        long j10;
        Cursor cursorRawQuery;
        Pair pair;
        Object obj;
        Pair pair2;
        String strZ = v9Var.z();
        List listW = v9Var.w();
        ea.c cVar = (ea.c) this.f5821d;
        e4 e4Var = cVar.f39807b;
        e4 e4Var2 = cVar.f39807b;
        m1 m1Var = (m1) cVar.f3623a;
        e4Var.k0();
        y9 y9VarQ0 = h4.Q0(v9Var, "_eid");
        Long l = (Long) (y9VarQ0 == null ? null : h4.Y0(y9VarQ0));
        if (l != null) {
            if (strZ.equals("_ep")) {
                e4Var.k0();
                y9 y9VarQ1 = h4.Q0(v9Var, "_en");
                String str2 = (String) (y9VarQ1 == null ? null : h4.Y0(y9VarQ1));
                if (TextUtils.isEmpty(str2)) {
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39754g.c(l, "Extra parameter without an event name. eventId");
                    return null;
                }
                if (((v9) this.f5819b) == null || ((Long) this.f5820c) == null || l.longValue() != ((Long) this.f5820c).longValue()) {
                    ea.m mVar = e4Var.f39373c;
                    e4.T(mVar);
                    m1 m1Var2 = (m1) mVar.f3623a;
                    mVar.G0();
                    mVar.H0();
                    try {
                        cursorRawQuery = mVar.x1().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, l.toString()});
                        try {
                            try {
                                if (cursorRawQuery.moveToFirst()) {
                                    v9Var2 = null;
                                    try {
                                        try {
                                            Pair pairCreate = Pair.create((v9) ((u9) h4.r1(v9.K(), cursorRawQuery.getBlob(0))).f(), Long.valueOf(cursorRawQuery.getLong(1)));
                                            cursorRawQuery.close();
                                            pair2 = pairCreate;
                                        } catch (IOException e10) {
                                            s0 s0Var2 = m1Var2.f39587f;
                                            m1.h(s0Var2);
                                            j10 = 0;
                                            try {
                                                s0Var2.f39753f.e("Failed to merge main event. appId, eventId", s0.O0(str), l, e10);
                                            } catch (SQLiteException e11) {
                                                e = e11;
                                                s0 s0Var3 = m1Var2.f39587f;
                                                m1.h(s0Var3);
                                                s0Var3.f39753f.c(e, "Error selecting main event");
                                                if (cursorRawQuery != null) {
                                                    cursorRawQuery.close();
                                                }
                                                pair = v9Var2;
                                                if (pair != 0) {
                                                }
                                                s0 s0Var4 = m1Var.f39587f;
                                                m1.h(s0Var4);
                                                s0Var4.f39754g.d("Extra parameter without existing main event. eventName, eventId", str2, l);
                                                return v9Var2;
                                            }
                                            cursorRawQuery.close();
                                            pair = v9Var2;
                                        }
                                    } catch (SQLiteException e12) {
                                        e = e12;
                                        j10 = 0;
                                        s0 s0Var5 = m1Var2.f39587f;
                                        m1.h(s0Var5);
                                        s0Var5.f39753f.c(e, "Error selecting main event");
                                        if (cursorRawQuery != null) {
                                            cursorRawQuery.close();
                                        }
                                        pair = v9Var2;
                                    }
                                } else {
                                    s0 s0Var6 = m1Var2.f39587f;
                                    m1.h(s0Var6);
                                    s0Var6.f39760n.b("Main event not found");
                                    cursorRawQuery.close();
                                    pair2 = null;
                                    v9Var2 = null;
                                }
                                j10 = 0;
                                pair = pair2;
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = cursorRawQuery;
                                if (cursor != null) {
                                    cursor.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e13) {
                            e = e13;
                            v9Var2 = null;
                        }
                    } catch (SQLiteException e14) {
                        e = e14;
                        v9Var2 = null;
                        j10 = 0;
                        cursorRawQuery = null;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                    }
                    if (pair != 0 || (obj = pair.first) == null) {
                        s0 s0Var7 = m1Var.f39587f;
                        m1.h(s0Var7);
                        s0Var7.f39754g.d("Extra parameter without existing main event. eventName, eventId", str2, l);
                        return v9Var2;
                    }
                    this.f5819b = (v9) obj;
                    this.f5818a = ((Long) pair.second).longValue();
                    e4Var2.k0();
                    this.f5820c = (Long) h4.S0((v9) this.f5819b, "_eid");
                } else {
                    j10 = 0;
                }
                long j11 = this.f5818a - 1;
                this.f5818a = j11;
                if (j11 <= j10) {
                    ea.m mVar2 = e4Var2.f39373c;
                    e4.T(mVar2);
                    m1 m1Var3 = (m1) mVar2.f3623a;
                    mVar2.G0();
                    s0 s0Var8 = m1Var3.f39587f;
                    m1.h(s0Var8);
                    s0Var8.f39760n.c(str, "Clearing complex main event info. appId");
                    try {
                        mVar2.x1().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                    } catch (SQLiteException e15) {
                        s0 s0Var9 = m1Var3.f39587f;
                        m1.h(s0Var9);
                        s0Var9.f39753f.c(e15, "Error clearing complex main event");
                    }
                } else {
                    ea.m mVar3 = e4Var2.f39373c;
                    e4.T(mVar3);
                    mVar3.Y0(str, l, this.f5818a, (v9) this.f5819b);
                }
                ArrayList arrayList = new ArrayList();
                for (y9 y9Var : ((v9) this.f5819b).w()) {
                    e4Var2.k0();
                    if (h4.Q0(v9Var, y9Var.v()) == null) {
                        arrayList.add(y9Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    s0 s0Var10 = m1Var.f39587f;
                    m1.h(s0Var10);
                    s0Var10.f39754g.c(str2, "No unique parameters in main event. eventName");
                } else {
                    arrayList.addAll(listW);
                    listW = arrayList;
                }
                strZ = str2;
            } else {
                this.f5820c = l;
                this.f5819b = v9Var;
                e4Var.k0();
                y9 y9VarQ2 = h4.Q0(v9Var, "_epc");
                Serializable serializableY0 = y9VarQ2 == null ? null : h4.Y0(y9VarQ2);
                long jLongValue = ((Long) (serializableY0 != null ? serializableY0 : 0L)).longValue();
                this.f5818a = jLongValue;
                if (jLongValue <= 0) {
                    s0 s0Var11 = m1Var.f39587f;
                    m1.h(s0Var11);
                    s0Var11.f39754g.c(strZ, "Complex event with zero extra param count. eventName");
                } else {
                    ea.m mVar4 = e4Var.f39373c;
                    e4.T(mVar4);
                    mVar4.Y0(str, l, this.f5818a, v9Var);
                }
            }
        }
        u9 u9Var = (u9) v9Var.l();
        u9Var.p(strZ);
        u9Var.b();
        ((v9) u9Var.f23489b).O();
        u9Var.b();
        ((v9) u9Var.f23489b).N(listW);
        return (v9) u9Var.f();
    }

    @Override // xn.e
    public void onFailure(xn.d dVar, IOException iOException) {
        gd.f fVar = (gd.f) this.f5820c;
        s sVar = ((i) dVar).f5787b;
        xn.m mVar = sVar.f54060a;
        if (mVar != null) {
            fVar.j(mVar.h().toString());
        }
        String str = sVar.f54061b;
        if (str != null) {
            fVar.c(str);
        }
        fVar.f(this.f5818a);
        u.s((md.h) this.f5821d, fVar, fVar);
        ((xn.e) this.f5819b).onFailure(dVar, iOException);
    }

    @Override // xn.e
    public void onResponse(xn.d dVar, w wVar) {
        FirebasePerfOkHttpClient.a(wVar, (gd.f) this.f5820c, this.f5818a, ((md.h) this.f5821d).b());
        ((xn.e) this.f5819b).onResponse(dVar, wVar);
    }

    public l(ao.d taskRunner) {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        n.f(taskRunner, "taskRunner");
        n.f(timeUnit, "timeUnit");
        this.f5818a = timeUnit.toNanos(5L);
        this.f5819b = taskRunner.e();
        this.f5820c = new ao.b(this, defpackage.e.q(yn.a.f54565f, " ConnectionPool", new StringBuilder()));
        this.f5821d = new ConcurrentLinkedQueue();
    }

    public l(xn.e eVar, ld.g gVar, md.h hVar, long j10) {
        this.f5819b = eVar;
        this.f5820c = new gd.f(gVar);
        this.f5818a = j10;
        this.f5821d = hVar;
    }

    public l(FlutterJNI flutterJNI) {
        this.f5818a = -1L;
        this.f5820c = new q(this, 0L);
        this.f5821d = new io.flutter.view.a(this);
        this.f5819b = flutterJNI;
    }
}
