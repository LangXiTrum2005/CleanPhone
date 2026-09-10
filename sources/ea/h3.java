package ea;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.ads.hy1;
import com.google.android.gms.internal.ads.ts;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class h3 extends f0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g3 f39457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public g0 f39458d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Boolean f39459e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d3 f39460f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ScheduledExecutorService f39461g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.c f39462h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f39463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d3 f39464j;

    public h3(m1 m1Var) {
        super(m1Var);
        this.f39463i = new ArrayList();
        this.f39462h = new androidx.recyclerview.widget.c(m1Var.f39592k);
        this.f39457c = new g3(this);
        this.f39460f = new d3(this, m1Var, 0);
        this.f39464j = new d3(this, m1Var, 1);
    }

    @Override // ea.f0
    public final boolean J0() {
        return false;
    }

    public final void K0(AtomicReference atomicReference) {
        G0();
        H0();
        U0(new com.google.android.gms.common.api.internal.m0(this, atomicReference, W0(false)));
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
    /* JADX WARN: Code duplicated, block: B:14:0x0059  */
    public final void L0(Bundle bundle) {
        boolean z10;
        boolean zN0;
        G0();
        H0();
        t tVar = new t(bundle);
        S0();
        m1 m1Var = (m1) this.f3623a;
        if (m1Var.f39585d.R0(null, d0.W0)) {
            n0 n0VarJ = m1Var.j();
            m1 m1Var2 = (m1) n0VarJ.f3623a;
            l4 l4Var = m1Var2.f39590i;
            s0 s0Var = m1Var2.f39587f;
            m1.f(l4Var);
            byte[] bArrO1 = l4.o1(tVar);
            if (bArrO1 == null) {
                m1.h(s0Var);
                s0Var.f39754g.b("Null default event parameters; not writing to database");
            } else {
                if (bArrO1.length > 131072) {
                    m1.h(s0Var);
                    s0Var.f39754g.b("Default event parameters too long for local database. Sending directly to service");
                } else {
                    zN0 = n0VarJ.N0(4, bArrO1);
                }
                if (zN0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            zN0 = false;
            if (zN0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        U0(new g2(this, W0(false), z10, tVar, bundle));
    }

    public final void M0() {
        G0();
        H0();
        if (X0()) {
            return;
        }
        if (N0()) {
            g3 g3Var = this.f39457c;
            h3 h3Var = g3Var.f39429c;
            h3Var.G0();
            Context context = ((m1) h3Var.f3623a).f39582a;
            synchronized (g3Var) {
                try {
                    if (g3Var.f39427a) {
                        s0 s0Var = ((m1) g3Var.f39429c.f3623a).f39587f;
                        m1.h(s0Var);
                        s0Var.f39760n.b("Connection attempt already in progress");
                        return;
                    } else {
                        if (g3Var.f39428b != null && (g3Var.f39428b.isConnecting() || g3Var.f39428b.isConnected())) {
                            s0 s0Var2 = ((m1) g3Var.f39429c.f3623a).f39587f;
                            m1.h(s0Var2);
                            s0Var2.f39760n.b("Already awaiting connection attempt");
                            return;
                        }
                        g3Var.f39428b = new p0(context, Looper.getMainLooper(), 93, g3Var, g3Var);
                        s0 s0Var3 = ((m1) g3Var.f39429c.f3623a).f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39760n.b("Connecting to remote service");
                        g3Var.f39427a = true;
                        k9.c0.h(g3Var.f39428b);
                        g3Var.f39428b.checkAvailabilityAndConnect();
                        return;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        m1 m1Var = (m1) this.f3623a;
        if (m1Var.f39585d.J0()) {
            return;
        }
        List<ResolveInfo> listQueryIntentServices = m1Var.f39582a.getPackageManager().queryIntentServices(new Intent().setClassName(m1Var.f39582a, "com.google.android.gms.measurement.AppMeasurementService"), C.DEFAULT_BUFFER_SEGMENT_SIZE);
        if (listQueryIntentServices == null || listQueryIntentServices.isEmpty()) {
            s0 s0Var4 = m1Var.f39587f;
            m1.h(s0Var4);
            s0Var4.f39753f.b("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(m1Var.f39582a, "com.google.android.gms.measurement.AppMeasurementService"));
        g3 g3Var2 = this.f39457c;
        h3 h3Var2 = g3Var2.f39429c;
        h3Var2.G0();
        Context context2 = ((m1) h3Var2.f3623a).f39582a;
        o9.a aVarB = o9.a.b();
        synchronized (g3Var2) {
            try {
                if (g3Var2.f39427a) {
                    s0 s0Var5 = ((m1) g3Var2.f39429c.f3623a).f39587f;
                    m1.h(s0Var5);
                    s0Var5.f39760n.b("Connection attempt already in progress");
                } else {
                    h3 h3Var3 = g3Var2.f39429c;
                    s0 s0Var6 = ((m1) h3Var3.f3623a).f39587f;
                    m1.h(s0Var6);
                    s0Var6.f39760n.b("Using local app measurement service");
                    g3Var2.f39427a = true;
                    aVarB.a(context2, intent, h3Var3.f39457c, TsExtractor.TS_STREAM_TYPE_AC3);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final boolean N0() {
        G0();
        H0();
        if (this.f39459e == null) {
            G0();
            H0();
            m1 m1Var = (m1) this.f3623a;
            a1 a1Var = m1Var.f39586e;
            m1.f(a1Var);
            a1Var.G0();
            boolean z10 = false;
            Boolean boolValueOf = !a1Var.K0().contains("use_service") ? null : Boolean.valueOf(a1Var.K0().getBoolean("use_service", false));
            boolean z11 = true;
            if (boolValueOf == null || !boolValueOf.booleanValue()) {
                l0 l0VarM = ((m1) this.f3623a).m();
                l0VarM.H0();
                if (l0VarM.f39544n == 1) {
                    z10 = true;
                } else {
                    s0 s0Var = m1Var.f39587f;
                    m1.h(s0Var);
                    s0Var.f39760n.b("Checking service availability");
                    l4 l4Var = m1Var.f39590i;
                    m1.f(l4Var);
                    int iC = i9.e.f42929b.c(((m1) l4Var.f3623a).f39582a, 12451000);
                    if (iC == 0) {
                        s0 s0Var2 = m1Var.f39587f;
                        m1.h(s0Var2);
                        s0Var2.f39760n.b("Service available");
                    } else if (iC == 1) {
                        s0 s0Var3 = m1Var.f39587f;
                        m1.h(s0Var3);
                        s0Var3.f39760n.b("Service missing");
                    } else if (iC != 2) {
                        if (iC == 3) {
                            s0 s0Var4 = m1Var.f39587f;
                            m1.h(s0Var4);
                            s0Var4.f39756i.b("Service disabled");
                        } else if (iC == 9) {
                            s0 s0Var5 = m1Var.f39587f;
                            m1.h(s0Var5);
                            s0Var5.f39756i.b("Service invalid");
                        } else if (iC != 18) {
                            s0 s0Var6 = m1Var.f39587f;
                            m1.h(s0Var6);
                            s0Var6.f39756i.c(Integer.valueOf(iC), "Unexpected service status");
                        } else {
                            s0 s0Var7 = m1Var.f39587f;
                            m1.h(s0Var7);
                            s0Var7.f39756i.b("Service updating");
                        }
                        z11 = false;
                    } else {
                        s0 s0Var8 = m1Var.f39587f;
                        m1.h(s0Var8);
                        s0Var8.f39759m.b("Service container out of date");
                        l4 l4Var2 = m1Var.f39590i;
                        m1.f(l4Var2);
                        if (l4Var2.q1() >= 17443) {
                            z10 = boolValueOf == null;
                            z11 = false;
                        }
                    }
                    z10 = true;
                }
                if (!z10 && m1Var.f39585d.J0()) {
                    s0 s0Var9 = m1Var.f39587f;
                    m1.h(s0Var9);
                    s0Var9.f39753f.b("No way to upload. Consider using the full version of Analytics");
                } else if (z11) {
                    a1 a1Var2 = m1Var.f39586e;
                    m1.f(a1Var2);
                    a1Var2.G0();
                    SharedPreferences.Editor editorEdit = a1Var2.K0().edit();
                    editorEdit.putBoolean("use_service", z10);
                    editorEdit.apply();
                }
                z11 = z10;
            }
            this.f39459e = Boolean.valueOf(z11);
        }
        return this.f39459e.booleanValue();
    }

    public final void O0() {
        G0();
        H0();
        g3 g3Var = this.f39457c;
        if (g3Var.f39428b != null && (g3Var.f39428b.isConnected() || g3Var.f39428b.isConnecting())) {
            g3Var.f39428b.disconnect();
        }
        g3Var.f39428b = null;
        try {
            o9.a.b().c(((m1) this.f3623a).f39582a, g3Var);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f39458d = null;
    }

    public final boolean P0() {
        G0();
        H0();
        if (!N0()) {
            return true;
        }
        l4 l4Var = ((m1) this.f3623a).f39590i;
        m1.f(l4Var);
        return l4Var.q1() >= ((Integer) d0.J0.a(null)).intValue();
    }

    public final boolean Q0() {
        G0();
        H0();
        if (!N0()) {
            return true;
        }
        l4 l4Var = ((m1) this.f3623a).f39590i;
        m1.f(l4Var);
        return l4Var.q1() >= 241200;
    }

    public final void R0(ComponentName componentName) {
        G0();
        if (this.f39458d != null) {
            this.f39458d = null;
            s0 s0Var = ((m1) this.f3623a).f39587f;
            m1.h(s0Var);
            s0Var.f39760n.c(componentName, "Disconnected from device MeasurementService");
            G0();
            M0();
        }
    }

    public final void S0() {
        ((m1) this.f3623a).getClass();
    }

    public final void T0() {
        G0();
        androidx.recyclerview.widget.c cVar = this.f39462h;
        ((p9.b) ((p9.a) cVar.f4729c)).getClass();
        cVar.f4728b = SystemClock.elapsedRealtime();
        ((m1) this.f3623a).getClass();
        this.f39460f.b(((Long) d0.Y.a(null)).longValue());
    }

    public final void U0(Runnable runnable) {
        G0();
        if (X0()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f39463i;
        long size = arrayList.size();
        m1 m1Var = (m1) this.f3623a;
        m1Var.getClass();
        if (size >= 1000) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            s0Var.f39753f.b("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f39464j.b(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            M0();
        }
    }

    public final void V0() {
        G0();
        m1 m1Var = (m1) this.f3623a;
        s0 s0Var = m1Var.f39587f;
        m1.h(s0Var);
        bo.b bVar = s0Var.f39760n;
        ArrayList arrayList = this.f39463i;
        bVar.c(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e10) {
                s0 s0Var2 = m1Var.f39587f;
                m1.h(s0Var2);
                s0Var2.f39753f.c(e10, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f39464j.c();
    }

    public final n4 W0(boolean z10) {
        long jAbs;
        Pair pair;
        m1 m1Var = (m1) this.f3623a;
        m1Var.getClass();
        l0 l0VarM = m1Var.m();
        String strJ = null;
        if (z10) {
            s0 s0Var = m1Var.f39587f;
            m1.h(s0Var);
            m1 m1Var2 = (m1) s0Var.f3623a;
            a1 a1Var = m1Var2.f39586e;
            m1.f(a1Var);
            if (a1Var.f39206e != null) {
                a1 a1Var2 = m1Var2.f39586e;
                m1.f(a1Var2);
                ts tsVar = a1Var2.f39206e;
                a1 a1Var3 = (a1) tsVar.f20478e;
                a1Var3.G0();
                a1Var3.G0();
                long j10 = ((a1) tsVar.f20478e).K0().getLong((String) tsVar.f20475b, 0L);
                if (j10 == 0) {
                    tsVar.c();
                    jAbs = 0;
                } else {
                    ((m1) a1Var3.f3623a).f39592k.getClass();
                    jAbs = Math.abs(j10 - System.currentTimeMillis());
                }
                long j11 = tsVar.f20474a;
                if (jAbs < j11) {
                    pair = null;
                } else if (jAbs > j11 + j11) {
                    tsVar.c();
                    pair = null;
                } else {
                    String string = a1Var3.K0().getString((String) tsVar.f20477d, null);
                    long j12 = a1Var3.K0().getLong((String) tsVar.f20476c, 0L);
                    tsVar.c();
                    pair = (string == null || j12 <= 0) ? a1.f39203z : new Pair(string, Long.valueOf(j12));
                }
                if (pair != null && pair != a1.f39203z) {
                    String strValueOf = String.valueOf(pair.second);
                    String str = (String) pair.first;
                    strJ = q4.a.j(new StringBuilder(strValueOf.length() + 1 + String.valueOf(str).length()), strValueOf, ":", str);
                }
            }
        }
        return l0VarM.K0(strJ);
    }

    public final boolean X0() {
        G0();
        H0();
        return this.f39458d != null;
    }

    /* JADX WARN: Code duplicated, block: B:258:0x043c A[Catch: all -> 0x0478, TRY_ENTER, TryCatch #49 {all -> 0x0478, blocks: (B:268:0x0468, B:258:0x043c, B:260:0x0442, B:261:0x0445, B:278:0x0489, B:207:0x0373, B:209:0x037d, B:214:0x038e), top: B:395:0x0468 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0454  */
    /* JADX WARN: Code duplicated, block: B:271:0x046f  */
    /* JADX WARN: Code duplicated, block: B:273:0x0474 A[PHI: r4 r6 r23 r24 r26 r36 r37
  0x0474: PHI (r4v15 android.database.sqlite.SQLiteDatabase) = 
  (r4v12 android.database.sqlite.SQLiteDatabase)
  (r4v13 android.database.sqlite.SQLiteDatabase)
  (r4v16 android.database.sqlite.SQLiteDatabase)
 binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]
  0x0474: PHI (r6v5 int) = (r6v3 int), (r6v3 int), (r6v6 int) binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]
  0x0474: PHI (r23v9 int) = (r23v6 int), (r23v7 int), (r23v10 int) binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]
  0x0474: PHI (r24v9 java.lang.String) = (r24v6 java.lang.String), (r24v7 java.lang.String), (r24v10 java.lang.String) binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]
  0x0474: PHI (r26v9 java.lang.String) = (r26v6 java.lang.String), (r26v7 java.lang.String), (r26v10 java.lang.String) binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]
  0x0474: PHI (r36v9 int) = (r36v6 int), (r36v7 int), (r36v10 int) binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]
  0x0474: PHI (r37v9 java.lang.String) = (r37v6 java.lang.String), (r37v7 java.lang.String), (r37v10 java.lang.String) binds: [B:264:0x0457, B:281:0x049b, B:272:0x0472] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:280:0x0498  */
    /* JADX WARN: Code duplicated, block: B:285:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:287:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:292:0x04cb  */
    /* JADX WARN: Code duplicated, block: B:293:0x04d4  */
    /* JADX WARN: Code duplicated, block: B:300:0x04ee  */
    /* JADX WARN: Code duplicated, block: B:302:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:304:0x0507  */
    /* JADX WARN: Code duplicated, block: B:305:0x0591  */
    /* JADX WARN: Code duplicated, block: B:316:0x05be A[Catch: RemoteException -> 0x05ec, TRY_LEAVE, TryCatch #47 {RemoteException -> 0x05ec, blocks: (B:314:0x05b3, B:316:0x05be), top: B:393:0x05b3 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:337:0x0628  */
    /* JADX WARN: Code duplicated, block: B:339:0x062c  */
    /* JADX WARN: Code duplicated, block: B:341:0x064d  */
    /* JADX WARN: Code duplicated, block: B:347:0x066c  */
    /* JADX WARN: Code duplicated, block: B:353:0x0684  */
    /* JADX WARN: Code duplicated, block: B:361:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:383:0x0659 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:404:0x0670 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:412:0x0599 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:456:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:457:0x049e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:459:0x049e A[SYNTHETIC] */
    public final void Y0(g0 g0Var, l9.a aVar, n4 n4Var) throws Throwable {
        ArrayList arrayList;
        m1 m1Var;
        Context context;
        s0 s0Var;
        int i10;
        SQLiteDatabase sQLiteDatabaseM0;
        int i11;
        int i12;
        Cursor cursor;
        Cursor cursorQuery;
        Cursor cursorQuery2;
        long j10;
        String str;
        String[] strArr;
        int i13;
        long j11;
        String string;
        t tVarCreateFromParcel;
        int i14;
        e eVarCreateFromParcel;
        i4 i4VarCreateFromParcel;
        int size;
        int size2;
        int i15;
        m0 m0Var;
        l9.a aVar2;
        c0 c0Var;
        m1 m1Var2;
        Context context2;
        s0 s0Var2;
        long jElapsedRealtime;
        long j12;
        long jCurrentTimeMillis;
        String str2;
        G0();
        H0();
        S0();
        m1 m1Var3 = (m1) this.f3623a;
        m1Var3.getClass();
        Context context3 = m1Var3.f39582a;
        g gVar = m1Var3.f39585d;
        s0 s0Var3 = m1Var3.f39587f;
        p9.b bVar = m1Var3.f39592k;
        int i16 = 100;
        n4 n4Var2 = n4Var;
        int i17 = 0;
        for (int i18 = 100; i17 < 1001 && i18 == i16; i18 = size) {
            ArrayList arrayList2 = new ArrayList();
            n0 n0VarJ = m1Var3.j();
            String str3 = "entry";
            int i19 = i16;
            String str4 = "type";
            String str5 = "rowid";
            p9.b bVar2 = bVar;
            m1 m1Var4 = (m1) n0VarJ.f3623a;
            n0VarJ.G0();
            int i20 = i17;
            if (n0VarJ.f39620d) {
                m1Var = m1Var3;
                context = context3;
                s0Var = s0Var3;
            } else {
                arrayList = new ArrayList();
                m1Var = m1Var3;
                if (((m1) n0VarJ.f3623a).f39582a.getDatabasePath("google_app_measurement_local.db").exists()) {
                    int i21 = 5;
                    context = context3;
                    s0Var = s0Var3;
                    int i22 = 0;
                    int i23 = 5;
                    while (true) {
                        if (i22 < i21) {
                            try {
                                sQLiteDatabaseM0 = n0VarJ.M0();
                                if (sQLiteDatabaseM0 == null) {
                                    try {
                                        try {
                                            n0VarJ.f39620d = true;
                                        } catch (SQLiteDatabaseLockedException unused) {
                                            i11 = i22;
                                            str5 = str5;
                                            i12 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            try {
                                                SystemClock.sleep(i23);
                                                i23 += 20;
                                                if (cursorQuery != null) {
                                                    cursorQuery.close();
                                                }
                                                if (sQLiteDatabaseM0 != null) {
                                                    sQLiteDatabaseM0.close();
                                                }
                                                i22 = i11 + 1;
                                                i21 = i12;
                                                str4 = str4;
                                                str3 = str3;
                                                str5 = str5;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                cursor = cursorQuery;
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                if (sQLiteDatabaseM0 != null) {
                                                    sQLiteDatabaseM0.close();
                                                }
                                                throw th;
                                            }
                                        } catch (SQLiteFullException e10) {
                                            e = e10;
                                            i11 = i22;
                                            str5 = str5;
                                            i12 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            s0 s0Var4 = m1Var4.f39587f;
                                            m1.h(s0Var4);
                                            s0Var4.f39753f.c(e, "Error reading entries from local database");
                                            n0VarJ.f39620d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM0 != null) {
                                                sQLiteDatabaseM0.close();
                                            }
                                            i22 = i11 + 1;
                                            i21 = i12;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                            i11 = i22;
                                            str5 = str5;
                                            i12 = 5;
                                            str4 = str4;
                                            cursorQuery = null;
                                            if (sQLiteDatabaseM0 != null) {
                                                sQLiteDatabaseM0.endTransaction();
                                            }
                                            s0 s0Var5 = m1Var4.f39587f;
                                            m1.h(s0Var5);
                                            s0Var5.f39753f.c(e, "Error reading entries from local database");
                                            n0VarJ.f39620d = true;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            if (sQLiteDatabaseM0 != null) {
                                                sQLiteDatabaseM0.close();
                                            }
                                            i22 = i11 + 1;
                                            i21 = i12;
                                            str4 = str4;
                                            str3 = str3;
                                            str5 = str5;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                        cursor = null;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabaseM0 != null) {
                                            sQLiteDatabaseM0.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    sQLiteDatabaseM0.beginTransaction();
                                    try {
                                        cursorQuery2 = sQLiteDatabaseM0.query("messages", new String[]{str5}, "type=?", new String[]{"3"}, null, null, "rowid desc", "1");
                                        try {
                                            long j13 = -1;
                                            if (cursorQuery2.moveToFirst()) {
                                                i11 = i22;
                                                try {
                                                    j10 = cursorQuery2.getLong(0);
                                                    try {
                                                        cursorQuery2.close();
                                                    } catch (SQLiteDatabaseLockedException unused2) {
                                                        str5 = str5;
                                                        i12 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        SystemClock.sleep(i23);
                                                        i23 += 20;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM0 != null) {
                                                            sQLiteDatabaseM0.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteFullException e12) {
                                                        e = e12;
                                                        str5 = str5;
                                                        i12 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        s0 s0Var6 = m1Var4.f39587f;
                                                        m1.h(s0Var6);
                                                        s0Var6.f39753f.c(e, "Error reading entries from local database");
                                                        n0VarJ.f39620d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM0 != null) {
                                                            sQLiteDatabaseM0.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        str5 = str5;
                                                        i12 = 5;
                                                        str4 = str4;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM0 != null && sQLiteDatabaseM0.inTransaction()) {
                                                            sQLiteDatabaseM0.endTransaction();
                                                        }
                                                        s0 s0Var7 = m1Var4.f39587f;
                                                        m1.h(s0Var7);
                                                        s0Var7.f39753f.c(e, "Error reading entries from local database");
                                                        n0VarJ.f39620d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM0 != null) {
                                                            sQLiteDatabaseM0.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    i12 = 5;
                                                    if (cursorQuery2 != null) {
                                                        try {
                                                            cursorQuery2.close();
                                                        } catch (SQLiteDatabaseLockedException unused3) {
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i23);
                                                            i23 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM0 != null) {
                                                                sQLiteDatabaseM0.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteFullException e14) {
                                                            e = e14;
                                                            cursorQuery = null;
                                                            s0 s0Var8 = m1Var4.f39587f;
                                                            m1.h(s0Var8);
                                                            s0Var8.f39753f.c(e, "Error reading entries from local database");
                                                            n0VarJ.f39620d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM0 != null) {
                                                                sQLiteDatabaseM0.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (SQLiteException e15) {
                                                            e = e15;
                                                            cursorQuery = null;
                                                            if (sQLiteDatabaseM0 != null) {
                                                                sQLiteDatabaseM0.endTransaction();
                                                            }
                                                            s0 s0Var9 = m1Var4.f39587f;
                                                            m1.h(s0Var9);
                                                            s0Var9.f39753f.c(e, "Error reading entries from local database");
                                                            n0VarJ.f39620d = true;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM0 != null) {
                                                                sQLiteDatabaseM0.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        } catch (Throwable th5) {
                                                            th = th5;
                                                            cursor = null;
                                                            if (cursor != null) {
                                                                cursor.close();
                                                            }
                                                            if (sQLiteDatabaseM0 != null) {
                                                                sQLiteDatabaseM0.close();
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    throw th;
                                                }
                                            } else {
                                                i11 = i22;
                                                cursorQuery2.close();
                                                j10 = -1;
                                            }
                                            if (j10 != -1) {
                                                str = "rowid<?";
                                                strArr = new String[]{String.valueOf(j10)};
                                            } else {
                                                str = null;
                                                strArr = null;
                                            }
                                            try {
                                                String[] strArr2 = {str5, str4, str3};
                                                g gVar2 = m1Var4.f39585d;
                                                c0 c0Var2 = d0.W0;
                                                str5 = str5;
                                                try {
                                                    try {
                                                        int i24 = 4;
                                                        int i25 = 3;
                                                        if (gVar2.R0(null, c0Var2)) {
                                                            i13 = 5;
                                                            try {
                                                                strArr2 = new String[]{str5, str4, str3, "app_version", "app_version_int"};
                                                            } catch (SQLiteDatabaseLockedException unused4) {
                                                                i12 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                SystemClock.sleep(i23);
                                                                i23 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e16) {
                                                                e = e16;
                                                                i12 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                s0 s0Var10 = m1Var4.f39587f;
                                                                m1.h(s0Var10);
                                                                s0Var10.f39753f.c(e, "Error reading entries from local database");
                                                                n0VarJ.f39620d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e17) {
                                                                e = e17;
                                                                i12 = 5;
                                                                str4 = str4;
                                                                cursorQuery = null;
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.endTransaction();
                                                                }
                                                                s0 s0Var11 = m1Var4.f39587f;
                                                                m1.h(s0Var11);
                                                                s0Var11.f39753f.c(e, "Error reading entries from local database");
                                                                n0VarJ.f39620d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } else {
                                                            i13 = 5;
                                                        }
                                                        try {
                                                            cursorQuery = sQLiteDatabaseM0.query("messages", strArr2, str, strArr, null, null, "rowid asc", Integer.toString(i19));
                                                            while (cursorQuery.moveToNext()) {
                                                                try {
                                                                    try {
                                                                        try {
                                                                            j13 = cursorQuery.getLong(0);
                                                                            try {
                                                                                int i26 = cursorQuery.getInt(1);
                                                                                str4 = str4;
                                                                                try {
                                                                                    byte[] blob = cursorQuery.getBlob(2);
                                                                                    str3 = str3;
                                                                                    try {
                                                                                        if (m1Var4.f39585d.R0(null, c0Var2)) {
                                                                                            try {
                                                                                                string = cursorQuery.getString(i25);
                                                                                                j11 = cursorQuery.getLong(i24);
                                                                                            } catch (SQLiteDatabaseLockedException unused5) {
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                i12 = 5;
                                                                                                SystemClock.sleep(i23);
                                                                                                i23 += 20;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM0 != null) {
                                                                                                    sQLiteDatabaseM0.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteFullException e18) {
                                                                                                e = e18;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                i12 = 5;
                                                                                                s0 s0Var12 = m1Var4.f39587f;
                                                                                                m1.h(s0Var12);
                                                                                                s0Var12.f39753f.c(e, "Error reading entries from local database");
                                                                                                n0VarJ.f39620d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM0 != null) {
                                                                                                    sQLiteDatabaseM0.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            } catch (SQLiteException e19) {
                                                                                                e = e19;
                                                                                                cursorQuery = cursorQuery;
                                                                                                sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                i12 = 5;
                                                                                                if (sQLiteDatabaseM0 != null) {
                                                                                                    sQLiteDatabaseM0.endTransaction();
                                                                                                }
                                                                                                s0 s0Var13 = m1Var4.f39587f;
                                                                                                m1.h(s0Var13);
                                                                                                s0Var13.f39753f.c(e, "Error reading entries from local database");
                                                                                                n0VarJ.f39620d = true;
                                                                                                if (cursorQuery != null) {
                                                                                                    cursorQuery.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM0 != null) {
                                                                                                    sQLiteDatabaseM0.close();
                                                                                                }
                                                                                                i22 = i11 + 1;
                                                                                                i21 = i12;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                str5 = str5;
                                                                                            }
                                                                                        } else {
                                                                                            j11 = 0;
                                                                                            string = null;
                                                                                        }
                                                                                        if (i26 == 0) {
                                                                                            cursorQuery = cursorQuery;
                                                                                            try {
                                                                                                try {
                                                                                                    Parcel parcelObtain = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain.setDataPosition(0);
                                                                                                            u uVarCreateFromParcel = u.CREATOR.createFromParcel(parcelObtain);
                                                                                                            parcelObtain.recycle();
                                                                                                            if (uVarCreateFromParcel != null) {
                                                                                                                arrayList.add(new m0(uVarCreateFromParcel, string, j11));
                                                                                                            }
                                                                                                        } catch (Throwable th6) {
                                                                                                            parcelObtain.recycle();
                                                                                                            throw th6;
                                                                                                        }
                                                                                                    } catch (l9.b unused6) {
                                                                                                        s0 s0Var14 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var14);
                                                                                                        s0Var14.f39753f.b("Failed to load event from local database");
                                                                                                        parcelObtain.recycle();
                                                                                                    }
                                                                                                } catch (SQLiteDatabaseLockedException unused7) {
                                                                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                    i12 = 5;
                                                                                                    SystemClock.sleep(i23);
                                                                                                    i23 += 20;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                                        sQLiteDatabaseM0.close();
                                                                                                    }
                                                                                                    i22 = i11 + 1;
                                                                                                    i21 = i12;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteFullException e20) {
                                                                                                    e = e20;
                                                                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                    i12 = 5;
                                                                                                    s0 s0Var15 = m1Var4.f39587f;
                                                                                                    m1.h(s0Var15);
                                                                                                    s0Var15.f39753f.c(e, "Error reading entries from local database");
                                                                                                    n0VarJ.f39620d = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                                        sQLiteDatabaseM0.close();
                                                                                                    }
                                                                                                    i22 = i11 + 1;
                                                                                                    i21 = i12;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                } catch (SQLiteException e21) {
                                                                                                    e = e21;
                                                                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                    i12 = 5;
                                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                                        sQLiteDatabaseM0.endTransaction();
                                                                                                    }
                                                                                                    s0 s0Var16 = m1Var4.f39587f;
                                                                                                    m1.h(s0Var16);
                                                                                                    s0Var16.f39753f.c(e, "Error reading entries from local database");
                                                                                                    n0VarJ.f39620d = true;
                                                                                                    if (cursorQuery != null) {
                                                                                                        cursorQuery.close();
                                                                                                    }
                                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                                        sQLiteDatabaseM0.close();
                                                                                                    }
                                                                                                    i22 = i11 + 1;
                                                                                                    i21 = i12;
                                                                                                    str4 = str4;
                                                                                                    str3 = str3;
                                                                                                    str5 = str5;
                                                                                                }
                                                                                            } catch (Throwable th7) {
                                                                                                th = th7;
                                                                                                sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                cursor = cursorQuery;
                                                                                                if (cursor != null) {
                                                                                                    cursor.close();
                                                                                                }
                                                                                                if (sQLiteDatabaseM0 != null) {
                                                                                                    sQLiteDatabaseM0.close();
                                                                                                }
                                                                                                throw th;
                                                                                            }
                                                                                        } else {
                                                                                            cursorQuery = cursorQuery;
                                                                                            if (i26 == 1) {
                                                                                                Parcel parcelObtain2 = Parcel.obtain();
                                                                                                try {
                                                                                                    try {
                                                                                                        parcelObtain2.unmarshall(blob, 0, blob.length);
                                                                                                        parcelObtain2.setDataPosition(0);
                                                                                                        i4VarCreateFromParcel = i4.CREATOR.createFromParcel(parcelObtain2);
                                                                                                        parcelObtain2.recycle();
                                                                                                    } catch (l9.b unused8) {
                                                                                                        s0 s0Var17 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var17);
                                                                                                        s0Var17.f39753f.b("Failed to load user property from local database");
                                                                                                        parcelObtain2.recycle();
                                                                                                        i4VarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (i4VarCreateFromParcel != null) {
                                                                                                        arrayList.add(new m0(i4VarCreateFromParcel, string, j11));
                                                                                                    }
                                                                                                } catch (Throwable th8) {
                                                                                                    parcelObtain2.recycle();
                                                                                                    throw th8;
                                                                                                }
                                                                                            } else {
                                                                                                if (i26 == 2) {
                                                                                                    Parcel parcelObtain3 = Parcel.obtain();
                                                                                                    try {
                                                                                                        try {
                                                                                                            parcelObtain3.unmarshall(blob, 0, blob.length);
                                                                                                            parcelObtain3.setDataPosition(0);
                                                                                                            eVarCreateFromParcel = e.CREATOR.createFromParcel(parcelObtain3);
                                                                                                            parcelObtain3.recycle();
                                                                                                        } catch (Throwable th9) {
                                                                                                            parcelObtain3.recycle();
                                                                                                            throw th9;
                                                                                                        }
                                                                                                    } catch (l9.b unused9) {
                                                                                                        s0 s0Var18 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var18);
                                                                                                        s0Var18.f39753f.b("Failed to load conditional user property from local database");
                                                                                                        parcelObtain3.recycle();
                                                                                                        eVarCreateFromParcel = null;
                                                                                                    }
                                                                                                    if (eVarCreateFromParcel != null) {
                                                                                                        arrayList.add(new m0(eVarCreateFromParcel, string, j11));
                                                                                                    }
                                                                                                } else if (i26 == 4) {
                                                                                                    try {
                                                                                                        Parcel parcelObtain4 = Parcel.obtain();
                                                                                                        try {
                                                                                                            try {
                                                                                                                try {
                                                                                                                    parcelObtain4.unmarshall(blob, 0, blob.length);
                                                                                                                    parcelObtain4.setDataPosition(0);
                                                                                                                    tVarCreateFromParcel = t.CREATOR.createFromParcel(parcelObtain4);
                                                                                                                    try {
                                                                                                                        parcelObtain4.recycle();
                                                                                                                    } catch (SQLiteDatabaseLockedException unused10) {
                                                                                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                                        i12 = 5;
                                                                                                                        SystemClock.sleep(i23);
                                                                                                                        i23 += 20;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                                            sQLiteDatabaseM0.close();
                                                                                                                        }
                                                                                                                        i22 = i11 + 1;
                                                                                                                        i21 = i12;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteFullException e22) {
                                                                                                                        e = e22;
                                                                                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                                        i12 = 5;
                                                                                                                        s0 s0Var19 = m1Var4.f39587f;
                                                                                                                        m1.h(s0Var19);
                                                                                                                        s0Var19.f39753f.c(e, "Error reading entries from local database");
                                                                                                                        n0VarJ.f39620d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                                            sQLiteDatabaseM0.close();
                                                                                                                        }
                                                                                                                        i22 = i11 + 1;
                                                                                                                        i21 = i12;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    } catch (SQLiteException e23) {
                                                                                                                        e = e23;
                                                                                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                                        i12 = 5;
                                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                                            sQLiteDatabaseM0.endTransaction();
                                                                                                                        }
                                                                                                                        s0 s0Var110 = m1Var4.f39587f;
                                                                                                                        m1.h(s0Var110);
                                                                                                                        s0Var110.f39753f.c(e, "Error reading entries from local database");
                                                                                                                        n0VarJ.f39620d = true;
                                                                                                                        if (cursorQuery != null) {
                                                                                                                            cursorQuery.close();
                                                                                                                        }
                                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                                            sQLiteDatabaseM0.close();
                                                                                                                        }
                                                                                                                        i22 = i11 + 1;
                                                                                                                        i21 = i12;
                                                                                                                        str4 = str4;
                                                                                                                        str3 = str3;
                                                                                                                        str5 = str5;
                                                                                                                    }
                                                                                                                } catch (l9.b unused11) {
                                                                                                                    s0 s0Var20 = m1Var4.f39587f;
                                                                                                                    m1.h(s0Var20);
                                                                                                                    s0Var20.f39753f.b("Failed to load default event parameters from local database");
                                                                                                                    parcelObtain4.recycle();
                                                                                                                    tVarCreateFromParcel = null;
                                                                                                                }
                                                                                                                if (tVarCreateFromParcel != null) {
                                                                                                                    arrayList.add(new m0(tVarCreateFromParcel, string, j11));
                                                                                                                }
                                                                                                                i14 = 3;
                                                                                                            } catch (Throwable th10) {
                                                                                                                th = th10;
                                                                                                                parcelObtain4.recycle();
                                                                                                                throw th;
                                                                                                            }
                                                                                                        } catch (l9.b unused12) {
                                                                                                        } catch (Throwable th11) {
                                                                                                            th = th11;
                                                                                                        }
                                                                                                    } catch (SQLiteDatabaseLockedException unused13) {
                                                                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                        i12 = 5;
                                                                                                        SystemClock.sleep(i23);
                                                                                                        i23 += 20;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                            sQLiteDatabaseM0.close();
                                                                                                        }
                                                                                                        i22 = i11 + 1;
                                                                                                        i21 = i12;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteFullException e24) {
                                                                                                        e = e24;
                                                                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                        i12 = 5;
                                                                                                        s0 s0Var111 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var111);
                                                                                                        s0Var111.f39753f.c(e, "Error reading entries from local database");
                                                                                                        n0VarJ.f39620d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                            sQLiteDatabaseM0.close();
                                                                                                        }
                                                                                                        i22 = i11 + 1;
                                                                                                        i21 = i12;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    } catch (SQLiteException e25) {
                                                                                                        e = e25;
                                                                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                                        i12 = 5;
                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                            sQLiteDatabaseM0.endTransaction();
                                                                                                        }
                                                                                                        s0 s0Var112 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var112);
                                                                                                        s0Var112.f39753f.c(e, "Error reading entries from local database");
                                                                                                        n0VarJ.f39620d = true;
                                                                                                        if (cursorQuery != null) {
                                                                                                            cursorQuery.close();
                                                                                                        }
                                                                                                        if (sQLiteDatabaseM0 != null) {
                                                                                                            sQLiteDatabaseM0.close();
                                                                                                        }
                                                                                                        i22 = i11 + 1;
                                                                                                        i21 = i12;
                                                                                                        str4 = str4;
                                                                                                        str3 = str3;
                                                                                                        str5 = str5;
                                                                                                    }
                                                                                                } else {
                                                                                                    i14 = 3;
                                                                                                    if (i26 == 3) {
                                                                                                        s0 s0Var21 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var21);
                                                                                                        s0Var21.f39760n.b("Skipping app launch break");
                                                                                                    } else {
                                                                                                        s0 s0Var22 = m1Var4.f39587f;
                                                                                                        m1.h(s0Var22);
                                                                                                        s0Var22.f39753f.b("Unknown record type in local database");
                                                                                                    }
                                                                                                }
                                                                                                i25 = i14;
                                                                                                str4 = str4;
                                                                                                str3 = str3;
                                                                                                c0Var2 = c0Var2;
                                                                                                cursorQuery = cursorQuery;
                                                                                                i24 = 4;
                                                                                            }
                                                                                        }
                                                                                        i14 = 3;
                                                                                        i25 = i14;
                                                                                        str4 = str4;
                                                                                        str3 = str3;
                                                                                        c0Var2 = c0Var2;
                                                                                        cursorQuery = cursorQuery;
                                                                                        i24 = 4;
                                                                                    } catch (SQLiteDatabaseLockedException unused14) {
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteFullException e26) {
                                                                                        e = e26;
                                                                                        cursorQuery = cursorQuery;
                                                                                    } catch (SQLiteException e27) {
                                                                                        e = e27;
                                                                                        cursorQuery = cursorQuery;
                                                                                    }
                                                                                } catch (SQLiteDatabaseLockedException unused15) {
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                    i12 = 5;
                                                                                    SystemClock.sleep(i23);
                                                                                    i23 += 20;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                        sQLiteDatabaseM0.close();
                                                                                    }
                                                                                    i22 = i11 + 1;
                                                                                    i21 = i12;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteFullException e28) {
                                                                                    e = e28;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                    i12 = 5;
                                                                                    s0 s0Var113 = m1Var4.f39587f;
                                                                                    m1.h(s0Var113);
                                                                                    s0Var113.f39753f.c(e, "Error reading entries from local database");
                                                                                    n0VarJ.f39620d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                        sQLiteDatabaseM0.close();
                                                                                    }
                                                                                    i22 = i11 + 1;
                                                                                    i21 = i12;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                } catch (SQLiteException e29) {
                                                                                    e = e29;
                                                                                    str3 = str3;
                                                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                                                    i12 = 5;
                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                        sQLiteDatabaseM0.endTransaction();
                                                                                    }
                                                                                    s0 s0Var114 = m1Var4.f39587f;
                                                                                    m1.h(s0Var114);
                                                                                    s0Var114.f39753f.c(e, "Error reading entries from local database");
                                                                                    n0VarJ.f39620d = true;
                                                                                    if (cursorQuery != null) {
                                                                                        cursorQuery.close();
                                                                                    }
                                                                                    if (sQLiteDatabaseM0 != null) {
                                                                                        sQLiteDatabaseM0.close();
                                                                                    }
                                                                                    i22 = i11 + 1;
                                                                                    i21 = i12;
                                                                                    str4 = str4;
                                                                                    str3 = str3;
                                                                                    str5 = str5;
                                                                                }
                                                                            } catch (SQLiteDatabaseLockedException unused16) {
                                                                                str4 = str4;
                                                                            } catch (SQLiteFullException e30) {
                                                                                e = e30;
                                                                                str4 = str4;
                                                                            } catch (SQLiteException e31) {
                                                                                e = e31;
                                                                                str4 = str4;
                                                                            }
                                                                        } catch (SQLiteDatabaseLockedException unused17) {
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteFullException e32) {
                                                                            e = e32;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        } catch (SQLiteException e33) {
                                                                            e = e33;
                                                                            cursorQuery = cursorQuery;
                                                                            str4 = str4;
                                                                            str3 = str3;
                                                                        }
                                                                    } catch (SQLiteDatabaseLockedException unused18) {
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteFullException e34) {
                                                                        e = e34;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    } catch (SQLiteException e35) {
                                                                        e = e35;
                                                                        cursorQuery = cursorQuery;
                                                                        str4 = str4;
                                                                        str3 = str3;
                                                                    }
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                    cursorQuery = cursorQuery;
                                                                }
                                                            }
                                                            cursorQuery = cursorQuery;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            i10 = 0;
                                                            sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                            try {
                                                                if (sQLiteDatabaseM0.delete("messages", "rowid <= ?", new String[]{Long.toString(j13)}) < arrayList.size()) {
                                                                    s0 s0Var23 = m1Var4.f39587f;
                                                                    m1.h(s0Var23);
                                                                    s0Var23.f39753f.b("Fewer entries removed from local database than expected");
                                                                }
                                                                sQLiteDatabaseM0.setTransactionSuccessful();
                                                                sQLiteDatabaseM0.endTransaction();
                                                                cursorQuery.close();
                                                                sQLiteDatabaseM0.close();
                                                            } catch (SQLiteDatabaseLockedException unused19) {
                                                                i12 = 5;
                                                                SystemClock.sleep(i23);
                                                                i23 += 20;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteFullException e36) {
                                                                e = e36;
                                                                i12 = 5;
                                                                s0 s0Var115 = m1Var4.f39587f;
                                                                m1.h(s0Var115);
                                                                s0Var115.f39753f.c(e, "Error reading entries from local database");
                                                                n0VarJ.f39620d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            } catch (SQLiteException e37) {
                                                                e = e37;
                                                                i12 = 5;
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.endTransaction();
                                                                }
                                                                s0 s0Var116 = m1Var4.f39587f;
                                                                m1.h(s0Var116);
                                                                s0Var116.f39753f.c(e, "Error reading entries from local database");
                                                                n0VarJ.f39620d = true;
                                                                if (cursorQuery != null) {
                                                                    cursorQuery.close();
                                                                }
                                                                if (sQLiteDatabaseM0 != null) {
                                                                    sQLiteDatabaseM0.close();
                                                                }
                                                                i22 = i11 + 1;
                                                                i21 = i12;
                                                                str4 = str4;
                                                                str3 = str3;
                                                                str5 = str5;
                                                            }
                                                        } catch (SQLiteDatabaseLockedException unused20) {
                                                            str3 = str3;
                                                            sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                            str4 = str4;
                                                            i12 = i13;
                                                            cursorQuery = null;
                                                            SystemClock.sleep(i23);
                                                            i23 += 20;
                                                            if (cursorQuery != null) {
                                                                cursorQuery.close();
                                                            }
                                                            if (sQLiteDatabaseM0 != null) {
                                                                sQLiteDatabaseM0.close();
                                                            }
                                                            i22 = i11 + 1;
                                                            i21 = i12;
                                                            str4 = str4;
                                                            str3 = str3;
                                                            str5 = str5;
                                                        }
                                                    } catch (SQLiteFullException e38) {
                                                        e = e38;
                                                        str3 = str3;
                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                        str4 = str4;
                                                        i12 = 5;
                                                        cursorQuery = null;
                                                        s0 s0Var117 = m1Var4.f39587f;
                                                        m1.h(s0Var117);
                                                        s0Var117.f39753f.c(e, "Error reading entries from local database");
                                                        n0VarJ.f39620d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM0 != null) {
                                                            sQLiteDatabaseM0.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    } catch (SQLiteException e39) {
                                                        e = e39;
                                                        str3 = str3;
                                                        sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                        str4 = str4;
                                                        i12 = 5;
                                                        cursorQuery = null;
                                                        if (sQLiteDatabaseM0 != null) {
                                                            sQLiteDatabaseM0.endTransaction();
                                                        }
                                                        s0 s0Var118 = m1Var4.f39587f;
                                                        m1.h(s0Var118);
                                                        s0Var118.f39753f.c(e, "Error reading entries from local database");
                                                        n0VarJ.f39620d = true;
                                                        if (cursorQuery != null) {
                                                            cursorQuery.close();
                                                        }
                                                        if (sQLiteDatabaseM0 != null) {
                                                            sQLiteDatabaseM0.close();
                                                        }
                                                        i22 = i11 + 1;
                                                        i21 = i12;
                                                        str4 = str4;
                                                        str3 = str3;
                                                        str5 = str5;
                                                    }
                                                } catch (SQLiteDatabaseLockedException unused21) {
                                                    str3 = str3;
                                                    sQLiteDatabaseM0 = sQLiteDatabaseM0;
                                                    str4 = str4;
                                                    i12 = 5;
                                                    cursorQuery = null;
                                                    SystemClock.sleep(i23);
                                                    i23 += 20;
                                                    if (cursorQuery != null) {
                                                        cursorQuery.close();
                                                    }
                                                    if (sQLiteDatabaseM0 != null) {
                                                        sQLiteDatabaseM0.close();
                                                    }
                                                    i22 = i11 + 1;
                                                    i21 = i12;
                                                    str4 = str4;
                                                    str3 = str3;
                                                    str5 = str5;
                                                }
                                            } catch (SQLiteDatabaseLockedException unused22) {
                                                str5 = str5;
                                            } catch (SQLiteFullException e40) {
                                                e = e40;
                                                str5 = str5;
                                            } catch (SQLiteException e41) {
                                                e = e41;
                                                str5 = str5;
                                            }
                                        } catch (Throwable th13) {
                                            th = th13;
                                            i11 = i22;
                                        }
                                    } catch (Throwable th14) {
                                        th = th14;
                                        i11 = i22;
                                        i12 = 5;
                                        cursorQuery2 = null;
                                    }
                                }
                            } catch (SQLiteDatabaseLockedException unused23) {
                                i11 = i22;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i12 = 5;
                                sQLiteDatabaseM0 = null;
                            } catch (SQLiteFullException e42) {
                                e = e42;
                                i11 = i22;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i12 = 5;
                                sQLiteDatabaseM0 = null;
                            } catch (SQLiteException e43) {
                                e = e43;
                                i11 = i22;
                                str5 = str5;
                                str4 = str4;
                                str3 = str3;
                                i12 = 5;
                                sQLiteDatabaseM0 = null;
                            } catch (Throwable th15) {
                                th = th15;
                                sQLiteDatabaseM0 = null;
                            }
                        } else {
                            i10 = 0;
                            s0 s0Var24 = m1Var4.f39587f;
                            m1.h(s0Var24);
                            s0Var24.f39756i.b("Failed to read events from database in reasonable time");
                            arrayList = null;
                        }
                        i22 = i11 + 1;
                        i21 = i12;
                        str4 = str4;
                        str3 = str3;
                        str5 = str5;
                    }
                } else {
                    context = context3;
                    s0Var = s0Var3;
                    i10 = 0;
                }
                if (arrayList != null) {
                    arrayList2.addAll(arrayList);
                    size = arrayList.size();
                } else {
                    size = i10;
                }
                if (aVar != null && size < i19) {
                    arrayList2.add(new m0(aVar, n4Var2.f39630c, n4Var2.f39637j));
                }
                size2 = arrayList2.size();
                i15 = i10;
                while (i15 < size2) {
                    m0Var = (m0) arrayList2.get(i15);
                    aVar2 = m0Var.f39579a;
                    c0Var = d0.W0;
                    if (gVar.R0(null, c0Var)) {
                        str2 = m0Var.f39580b;
                        if (!TextUtils.isEmpty(str2)) {
                            n4Var2 = new n4(n4Var2.f39628a, n4Var2.f39629b, str2, m0Var.f39581c, n4Var2.f39631d, n4Var2.f39632e, n4Var2.f39633f, n4Var2.f39634g, n4Var2.f39635h, n4Var2.f39636i, n4Var2.f39638k, n4Var2.l, n4Var2.f39639m, n4Var2.f39640n, n4Var2.f39641o, n4Var2.f39642p, n4Var2.f39643q, n4Var2.f39644r, n4Var2.f39645s, n4Var2.f39646t, n4Var2.f39647u, n4Var2.f39648v, n4Var2.f39649w, n4Var2.f39650x, n4Var2.f39651y, n4Var2.f39652z, n4Var2.A, n4Var2.B, n4Var2.C, n4Var2.D, n4Var2.E, n4Var2.F);
                        }
                    }
                    if (aVar2 instanceof u) {
                        try {
                            bVar2.getClass();
                            jCurrentTimeMillis = System.currentTimeMillis();
                            try {
                                bVar2.getClass();
                                jElapsedRealtime = SystemClock.elapsedRealtime();
                                try {
                                    try {
                                        g0Var.r1((u) aVar2, n4Var2);
                                        m1.h(s0Var);
                                        s0Var2 = s0Var;
                                        try {
                                            s0Var2.f39760n.b("Logging telemetry for logEvent from database");
                                            if (v9.e.f52499f == null) {
                                                m1Var2 = m1Var;
                                                context2 = context;
                                                try {
                                                    v9.e.f52499f = new v9.e(context2, m1Var2);
                                                } catch (RemoteException e44) {
                                                    e = e44;
                                                    j12 = jCurrentTimeMillis;
                                                    m1.h(s0Var2);
                                                    s0Var2.f39753f.c(e, "Failed to send event to the service");
                                                    if (j12 != 0) {
                                                        if (v9.e.f52499f == null) {
                                                            v9.e.f52499f = new v9.e(context2, m1Var2);
                                                        }
                                                        v9.e eVar = v9.e.f52499f;
                                                        bVar2.getClass();
                                                        long jCurrentTimeMillis2 = System.currentTimeMillis();
                                                        bVar2.getClass();
                                                        eVar.N(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis2);
                                                    }
                                                }
                                            } else {
                                                m1Var2 = m1Var;
                                                context2 = context;
                                            }
                                            v9.e eVar2 = v9.e.f52499f;
                                            bVar2.getClass();
                                            long jCurrentTimeMillis3 = System.currentTimeMillis();
                                            bVar2.getClass();
                                            eVar2.N(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis3);
                                        } catch (RemoteException e45) {
                                            e = e45;
                                            m1Var2 = m1Var;
                                            context2 = context;
                                        }
                                    } catch (RemoteException e46) {
                                        e = e46;
                                        m1Var2 = m1Var;
                                        context2 = context;
                                        s0Var2 = s0Var;
                                        j12 = jCurrentTimeMillis;
                                        m1.h(s0Var2);
                                        s0Var2.f39753f.c(e, "Failed to send event to the service");
                                        if (j12 != 0) {
                                            if (v9.e.f52499f == null) {
                                                v9.e.f52499f = new v9.e(context2, m1Var2);
                                            }
                                            v9.e eVar3 = v9.e.f52499f;
                                            bVar2.getClass();
                                            long jCurrentTimeMillis4 = System.currentTimeMillis();
                                            bVar2.getClass();
                                            eVar3.N(13, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), j12, jCurrentTimeMillis4);
                                        }
                                        i15++;
                                        s0Var = s0Var2;
                                        m1Var = m1Var2;
                                        context = context2;
                                        size = size;
                                    }
                                } catch (RemoteException e47) {
                                    e = e47;
                                }
                            } catch (RemoteException e48) {
                                e = e48;
                                m1Var2 = m1Var;
                                context2 = context;
                                s0Var2 = s0Var;
                                jElapsedRealtime = 0;
                            }
                        } catch (RemoteException e49) {
                            e = e49;
                            m1Var2 = m1Var;
                            context2 = context;
                            s0Var2 = s0Var;
                            jElapsedRealtime = 0;
                            j12 = 0;
                        }
                    } else {
                        m1Var2 = m1Var;
                        context2 = context;
                        s0Var2 = s0Var;
                        if (aVar2 instanceof i4) {
                            try {
                                g0Var.v0((i4) aVar2, n4Var2);
                            } catch (RemoteException e50) {
                                m1.h(s0Var2);
                                s0Var2.f39753f.c(e50, "Failed to send user property to the service");
                            }
                        } else {
                            if (aVar2 instanceof e) {
                                try {
                                    g0Var.A((e) aVar2, n4Var2);
                                } catch (RemoteException e51) {
                                    m1.h(s0Var2);
                                    s0Var2.f39753f.c(e51, "Failed to send conditional user property to the service");
                                }
                            } else if (gVar.R0(null, c0Var) || !(aVar2 instanceof t)) {
                                m1.h(s0Var2);
                                s0Var2.f39753f.b("Discarding data. Unrecognized parcel type.");
                            } else {
                                try {
                                    g0Var.h1(((t) aVar2).n(), n4Var2);
                                } catch (RemoteException e52) {
                                    m1.h(s0Var2);
                                    s0Var2.f39753f.c(e52, "Failed to send default event parameters to the service");
                                }
                            }
                            i15++;
                            s0Var = s0Var2;
                            m1Var = m1Var2;
                            context = context2;
                            size = size;
                        }
                    }
                    i15++;
                    s0Var = s0Var2;
                    m1Var = m1Var2;
                    context = context2;
                    size = size;
                }
                s0Var3 = s0Var;
                m1Var3 = m1Var;
                context3 = context;
                bVar = bVar2;
                i16 = 100;
                i17 = i20 + 1;
            }
            i10 = 0;
            arrayList = null;
            if (arrayList != null) {
                arrayList2.addAll(arrayList);
                size = arrayList.size();
            } else {
                size = i10;
            }
            if (aVar != null) {
                arrayList2.add(new m0(aVar, n4Var2.f39630c, n4Var2.f39637j));
            }
            size2 = arrayList2.size();
            i15 = i10;
            while (i15 < size2) {
                m0Var = (m0) arrayList2.get(i15);
                aVar2 = m0Var.f39579a;
                c0Var = d0.W0;
                if (gVar.R0(null, c0Var)) {
                    str2 = m0Var.f39580b;
                    if (!TextUtils.isEmpty(str2)) {
                        n4Var2 = new n4(n4Var2.f39628a, n4Var2.f39629b, str2, m0Var.f39581c, n4Var2.f39631d, n4Var2.f39632e, n4Var2.f39633f, n4Var2.f39634g, n4Var2.f39635h, n4Var2.f39636i, n4Var2.f39638k, n4Var2.l, n4Var2.f39639m, n4Var2.f39640n, n4Var2.f39641o, n4Var2.f39642p, n4Var2.f39643q, n4Var2.f39644r, n4Var2.f39645s, n4Var2.f39646t, n4Var2.f39647u, n4Var2.f39648v, n4Var2.f39649w, n4Var2.f39650x, n4Var2.f39651y, n4Var2.f39652z, n4Var2.A, n4Var2.B, n4Var2.C, n4Var2.D, n4Var2.E, n4Var2.F);
                    }
                }
                if (aVar2 instanceof u) {
                    bVar2.getClass();
                    jCurrentTimeMillis = System.currentTimeMillis();
                    bVar2.getClass();
                    jElapsedRealtime = SystemClock.elapsedRealtime();
                    g0Var.r1((u) aVar2, n4Var2);
                    m1.h(s0Var);
                    s0Var2 = s0Var;
                    s0Var2.f39760n.b("Logging telemetry for logEvent from database");
                    if (v9.e.f52499f == null) {
                        m1Var2 = m1Var;
                        context2 = context;
                        v9.e.f52499f = new v9.e(context2, m1Var2);
                    } else {
                        m1Var2 = m1Var;
                        context2 = context;
                    }
                    v9.e eVar4 = v9.e.f52499f;
                    bVar2.getClass();
                    long jCurrentTimeMillis5 = System.currentTimeMillis();
                    bVar2.getClass();
                    eVar4.N(0, (int) (SystemClock.elapsedRealtime() - jElapsedRealtime), jCurrentTimeMillis, jCurrentTimeMillis5);
                } else {
                    m1Var2 = m1Var;
                    context2 = context;
                    s0Var2 = s0Var;
                    if (aVar2 instanceof i4) {
                        g0Var.v0((i4) aVar2, n4Var2);
                    } else {
                        if (aVar2 instanceof e) {
                            g0Var.A((e) aVar2, n4Var2);
                        } else if (gVar.R0(null, c0Var)) {
                            m1.h(s0Var2);
                            s0Var2.f39753f.b("Discarding data. Unrecognized parcel type.");
                        } else {
                            m1.h(s0Var2);
                            s0Var2.f39753f.b("Discarding data. Unrecognized parcel type.");
                        }
                        i15++;
                        s0Var = s0Var2;
                        m1Var = m1Var2;
                        context = context2;
                        size = size;
                    }
                }
                i15++;
                s0Var = s0Var2;
                m1Var = m1Var2;
                context = context2;
                size = size;
            }
            s0Var3 = s0Var;
            m1Var3 = m1Var;
            context3 = context;
            bVar = bVar2;
            i16 = 100;
            i17 = i20 + 1;
        }
    }

    public final void Z0(e eVar) {
        boolean zN0;
        G0();
        H0();
        m1 m1Var = (m1) this.f3623a;
        m1Var.getClass();
        n0 n0VarJ = m1Var.j();
        m1 m1Var2 = (m1) n0VarJ.f3623a;
        m1.f(m1Var2.f39590i);
        byte[] bArrO1 = l4.o1(eVar);
        if (bArrO1.length > 131072) {
            s0 s0Var = m1Var2.f39587f;
            m1.h(s0Var);
            s0Var.f39754g.b("Conditional user property too long for local database. Sending directly to service");
            zN0 = false;
        } else {
            zN0 = n0VarJ.N0(2, bArrO1);
        }
        U0(new hy1(this, W0(true), zN0, new e(eVar)));
    }
}
