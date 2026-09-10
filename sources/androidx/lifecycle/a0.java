package androidx.lifecycle;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.MotionEvent;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.work.CoroutineWorker;
import androidx.work.Worker;
import androidx.work.impl.WorkDatabase_Impl;
import cn.q1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.ads.c7;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.mbridge.msdk.nativex.view.RollingBCView;
import com.unity3d.services.UnityAdsConstants;
import ea.c2;
import ea.c3;
import ea.d2;
import ea.e4;
import ea.f1;
import ea.f3;
import ea.f4;
import ea.g3;
import ea.h3;
import ea.j1;
import ea.j3;
import ea.l4;
import ea.m1;
import ea.n3;
import ea.o3;
import ea.p2;
import ea.p3;
import ea.u3;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.logging.Level;
import p.n1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f4524b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.f4523a = i10;
        this.f4524b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f A[Catch: all -> 0x005a, TryCatch #4 {all -> 0x005a, blocks: (B:26:0x0047, B:28:0x004f, B:29:0x0058, B:33:0x005d), top: B:68:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x005d A[Catch: all -> 0x005a, DONT_GENERATE, TRY_LEAVE, TryCatch #4 {all -> 0x005a, blocks: (B:26:0x0047, B:28:0x004f, B:29:0x0058, B:33:0x005d), top: B:68:0x0047 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final void b() {
        gj.l lVar;
        while (true) {
            io.flutter.plugins.firebase.messaging.a aVar = (io.flutter.plugins.firebase.messaging.a) ((v9.e) this.f4524b).f52504c;
            gj.m mVar = aVar.f43406a;
            gj.k kVar = null;
            if (mVar != null) {
                synchronized (mVar.f41952b) {
                    JobParameters jobParameters = mVar.f41953c;
                    if (jobParameters != null) {
                        try {
                            JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                            if (jobWorkItemDequeueWork != null) {
                                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(mVar.f41951a.getClassLoader());
                                lVar = new gj.l(mVar, jobWorkItemDequeueWork);
                            }
                        } catch (SecurityException e10) {
                            Log.e("JobServiceEngineImpl", "Failed to run mParams.dequeueWork()!", e10);
                        }
                        if (lVar != null) {
                            kVar = lVar;
                        } else {
                            synchronized (aVar.f43410e) {
                                try {
                                    if (aVar.f43410e.size() > 0) {
                                        kVar = (gj.k) aVar.f43410e.remove(0);
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                }
                lVar = null;
                if (lVar != null) {
                    kVar = lVar;
                } else {
                    synchronized (aVar.f43410e) {
                        if (aVar.f43410e.size() > 0) {
                            kVar = (gj.k) aVar.f43410e.remove(0);
                        }
                    }
                }
            } else {
                synchronized (aVar.f43410e) {
                    if (aVar.f43410e.size() > 0) {
                        kVar = (gj.k) aVar.f43410e.remove(0);
                    }
                }
            }
            if (kVar == null) {
                ((Handler) ((v9.e) this.f4524b).f52503b).post(new a0(this, 20));
                return;
            }
            io.flutter.plugins.firebase.messaging.a aVar2 = (io.flutter.plugins.firebase.messaging.a) ((v9.e) this.f4524b).f52504c;
            Intent intent = kVar.getIntent();
            FlutterFirebaseMessagingBackgroundService flutterFirebaseMessagingBackgroundService = (FlutterFirebaseMessagingBackgroundService) aVar2;
            FlutterFirebaseMessagingBackgroundService.f43401i.getClass();
            if (a.a.f3311a.getSharedPreferences("io.flutter.firebase.messaging.callback", 0).getLong("callback_handle", 0L) != 0) {
                List list = FlutterFirebaseMessagingBackgroundService.f43400h;
                synchronized (list) {
                    try {
                        if (((AtomicBoolean) FlutterFirebaseMessagingBackgroundService.f43401i.f41770b).get()) {
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            new Handler(flutterFirebaseMessagingBackgroundService.getMainLooper()).post(new com.unity3d.services.ads.operation.show.b(19, intent, countDownLatch));
                            try {
                                countDownLatch.await();
                            } catch (InterruptedException e11) {
                                Log.i("FLTFireMsgService", "Exception waiting to execute Dart callback", e11);
                            }
                        } else {
                            Log.i("FLTFireMsgService", "Service has not yet started, messages will be queued.");
                            list.add(intent);
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            } else {
                Log.w("FLTFireMsgService", "A background message could not be handled in Dart as no onBackgroundMessage handler has been registered.");
            }
            kVar.a();
        }
    }

    public HashSet a() {
        HashSet hashSet = new HashSet();
        Cursor cursorG = ((g4.c) this.f4524b).f41476c.g(new hn.u("SELECT * FROM room_table_modification_log WHERE invalidated = 1;", 1));
        while (cursorG.moveToNext()) {
            try {
                hashSet.add(Integer.valueOf(cursorG.getInt(0)));
            } catch (Throwable th2) {
                cursorG.close();
                throw th2;
            }
        }
        cursorG.close();
        if (!hashSet.isEmpty()) {
            ((g4.c) this.f4524b).f41479f.t();
        }
        return hashSet;
    }

    /* JADX INFO: Infinite loop detected, blocks: 8, insns: 0 */
    /* JADX WARN: Code duplicated, block: B:160:0x0427  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        ao.a aVarC;
        long jNanoTime;
        p.j jVar;
        ?? A = 0;
        int i10 = 1;
        int i11 = 0;
        switch (this.f4523a) {
            case 0:
                synchronized (((e0) this.f4524b).f4542a) {
                    obj = ((e0) this.f4524b).f4547f;
                    ((e0) this.f4524b).f4547f = e0.f4541k;
                    break;
                }
                ((e0) this.f4524b).j(obj);
                return;
            case 1:
                RollingBCView rollingBCView = (RollingBCView) this.f4524b;
                rollingBCView.setScrollState(0);
                rollingBCView.populate();
                return;
            case 2:
                break;
            case 3:
                com.bumptech.glide.k kVar = (com.bumptech.glide.k) this.f4524b;
                kVar.f10505c.c(kVar);
                return;
            case 4:
                ((com.google.android.gms.common.api.internal.r) this.f4524b).a();
                return;
            case 5:
                com.google.android.gms.common.api.internal.r rVar = (com.google.android.gms.common.api.internal.r) ((s4.i) this.f4524b).f50111a;
                rVar.f11752b.disconnect(rVar.f11752b.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 6:
                ((com.google.android.gms.common.api.internal.c0) this.f4524b).f11687h.g(new ConnectionResult(4, null, null));
                return;
            case 7:
                if (((CoroutineWorker) this.f4524b).getFuture$work_runtime_ktx_release().f47201a instanceof o5.a) {
                    ((q1) ((CoroutineWorker) this.f4524b).getJob$work_runtime_ktx_release()).a(null);
                    return;
                }
                return;
            case 8:
                Worker worker = (Worker) this.f4524b;
                try {
                    worker.f5009a.h(worker.doWork());
                    return;
                } catch (Throwable th2) {
                    worker.f5009a.i(th2);
                    return;
                }
            case 9:
                ea.m mVar = (ea.m) this.f4524b;
                try {
                    SQLiteDatabase sQLiteDatabaseX1 = mVar.x1();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("elapsed_time", (Long) 0L);
                    sQLiteDatabaseX1.update("raw_events", contentValues, null, null);
                    return;
                } catch (SQLiteException e10) {
                    ea.s0 s0Var = ((m1) mVar.f3623a).f39587f;
                    m1.h(s0Var);
                    s0Var.f39753f.c(e10, "Failed to remove elapsed times from raw events table");
                    return;
                }
            case 10:
                ((e4) ((ea.x0) this.f4524b).f39904d).K();
                return;
            case 11:
                h3 h3Var = ((g3) this.f4524b).f39429c;
                h3Var.R0(new ComponentName(((m1) h3Var.f3623a).f39582a, "com.google.android.gms.measurement.AppMeasurementService"));
                return;
            case 12:
                h3 h3Var2 = ((g3) ((ta.i0) this.f4524b).f50624c).f39429c;
                j1 j1Var = ((m1) h3Var2.f3623a).f39588g;
                m1.h(j1Var);
                j1Var.P0(new f3(h3Var2, i11));
                return;
            case 13:
                n3 n3Var = (n3) this.f4524b;
                p3 p3Var = (p3) n3Var.f39627c.f39410c;
                p3Var.G0();
                m1 m1Var = (m1) p3Var.f3623a;
                ea.s0 s0Var2 = m1Var.f39587f;
                Context context = m1Var.f39582a;
                m1.h(s0Var2);
                s0Var2.f39759m.b("Application going to the background");
                ea.a1 a1Var = m1Var.f39586e;
                m1.f(a1Var);
                a1Var.f39219s.b(true);
                p3Var.G0();
                p3Var.f39705d = true;
                ea.g gVar = m1Var.f39585d;
                if (!gVar.V0()) {
                    long j10 = n3Var.f39626b;
                    c7 c7Var = p3Var.f39707f;
                    c7Var.c(j10, false, false);
                    ((o3) c7Var.f13072c).c();
                }
                long j11 = n3Var.f39625a;
                m1.h(s0Var2);
                s0Var2.l.c(Long.valueOf(j11), "Application backgrounded at: timestamp_millis");
                p2 p2Var = m1Var.f39593m;
                m1.g(p2Var);
                p2Var.G0();
                m1 m1Var2 = (m1) p2Var.f3623a;
                p2Var.H0();
                h3 h3VarK = m1Var2.k();
                h3VarK.G0();
                h3VarK.H0();
                if (h3VarK.N0()) {
                    l4 l4Var = ((m1) h3VarK.f3623a).f39590i;
                    m1.f(l4Var);
                    if (l4Var.q1() >= 242600) {
                        h3 h3VarK2 = m1Var2.k();
                        h3VarK2.G0();
                        h3VarK2.H0();
                        h3VarK2.U0(new c3(h3VarK2, h3VarK2.W0(true), 2));
                    }
                } else {
                    h3 h3VarK3 = m1Var2.k();
                    h3VarK3.G0();
                    h3VarK3.H0();
                    h3VarK3.U0(new c3(h3VarK3, h3VarK3.W0(true), 2));
                }
                if (gVar.R0(null, ea.d0.N0)) {
                    l4 l4Var2 = m1Var.f39590i;
                    m1.f(l4Var2);
                    long jO0 = l4Var2.k1(context.getPackageName(), gVar.f39416c) ? 1000L : gVar.O0(context.getPackageName(), ea.d0.E);
                    m1.h(s0Var2);
                    s0Var2.f39760n.c(Long.valueOf(jO0), "[sgtm] Scheduling batch upload with minimum latency in millis");
                    m1.e(m1Var.f39601u);
                    m1Var.f39601u.K0(jO0);
                    return;
                }
                return;
            case 14:
                e4 e4Var = (e4) this.f4524b;
                e4Var.P().G0();
                e4Var.f39381k = new ea.c1(e4Var);
                ea.m mVar2 = new ea.m(e4Var);
                mVar2.I0();
                e4Var.f39373c = mVar2;
                f1 f1Var = e4Var.f39371a;
                ea.g gVarE0 = e4Var.e0();
                k9.c0.h(f1Var);
                gVarE0.f39417d = f1Var;
                j3 j3Var = new j3(e4Var);
                j3Var.I0();
                e4Var.f39379i = j3Var;
                ea.c cVar = new ea.c(e4Var);
                cVar.I0();
                e4Var.f39376f = cVar;
                ea.v0 v0Var = new ea.v0(e4Var, i10);
                v0Var.I0();
                e4Var.f39378h = v0Var;
                u3 u3Var = new u3(e4Var);
                u3Var.I0();
                e4Var.f39375e = u3Var;
                e4Var.f39374d = new ea.x0(e4Var);
                if (e4Var.f39387r != e4Var.f39388s) {
                    e4Var.t().f39753f.d("Not all upload components initialized", Integer.valueOf(e4Var.f39387r), Integer.valueOf(e4Var.f39388s));
                }
                e4Var.f39382m.set(true);
                e4Var.t().f39760n.b("UploadController is now fully initialized");
                e4Var.P().G0();
                ea.m mVar3 = e4Var.f39373c;
                e4.T(mVar3);
                mVar3.Q0();
                ea.m mVar4 = e4Var.f39373c;
                e4.T(mVar4);
                mVar4.G0();
                mVar4.H0();
                if (mVar4.r1()) {
                    ea.c0 c0Var = ea.d0.f39333u0;
                    if (((Long) c0Var.a(null)).longValue() != 0) {
                        SQLiteDatabase sQLiteDatabaseX2 = mVar4.x1();
                        m1 m1Var3 = (m1) mVar4.f3623a;
                        m1Var3.f39592k.getClass();
                        int iDelete = sQLiteDatabaseX2.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(c0Var.a(null))});
                        if (iDelete > 0) {
                            ea.s0 s0Var3 = m1Var3.f39587f;
                            m1.h(s0Var3);
                            s0Var3.f39760n.c(Integer.valueOf(iDelete), "Deleted stale trigger uris. rowsDeleted");
                        }
                    }
                }
                if (e4Var.f39379i.f39514h.e() == 0) {
                    ea.z0 z0Var = e4Var.f39379i.f39514h;
                    ((p9.b) e4Var.i0()).getClass();
                    z0Var.f(System.currentTimeMillis());
                }
                e4Var.K();
                return;
            case 15:
                m1 m1Var4 = (m1) ((q7.c) this.f4524b).f48672b;
                m1.e(m1Var4.f39601u);
                m1Var4.f39601u.K0(((Long) ea.d0.D.a(null)).longValue());
                return;
            case 16:
                m1 m1Var5 = (m1) this.f4524b;
                l4 l4Var3 = m1Var5.f39590i;
                p2 p2Var2 = m1Var5.f39593m;
                m1.f(l4Var3);
                l4Var3.G0();
                if (l4Var3.c1() != 1) {
                    ea.s0 s0Var4 = m1Var5.f39587f;
                    m1.h(s0Var4);
                    s0Var4.f39756i.b("registerTrigger called but app not eligible");
                    return;
                }
                m1.g(p2Var2);
                p2Var2.G0();
                d2 d2Var = p2Var2.l;
                if (d2Var != null) {
                    d2Var.c();
                }
                m1.g(p2Var2);
                new Thread(new c2(p2Var2, 3)).start();
                return;
            case 17:
                ReentrantReadWriteLock.ReadLock lock = ((g4.c) this.f4524b).f41476c.f41502h.readLock();
                try {
                    try {
                        lock.lock();
                        if (((g4.c) this.f4524b).a() && ((g4.c) this.f4524b).f41477d.compareAndSet(true, false) && !((SQLiteDatabase) ((g4.c) this.f4524b).f41476c.f41497c.getWritableDatabase().f45023b).inTransaction()) {
                            WorkDatabase_Impl workDatabase_Impl = ((g4.c) this.f4524b).f41476c;
                            if (workDatabase_Impl.f41500f) {
                                try {
                                    l4.b writableDatabase = workDatabase_Impl.f41497c.getWritableDatabase();
                                    writableDatabase.d();
                                    try {
                                        HashSet hashSetA = a();
                                        try {
                                            writableDatabase.s();
                                            writableDatabase.o();
                                            A = hashSetA;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            writableDatabase.o();
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (SQLiteException | IllegalStateException e11) {
                                    e = e11;
                                    Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
                                }
                            } else {
                                A = a();
                            }
                            lock.unlock();
                            if (A == 0 || A.isEmpty()) {
                                return;
                            }
                            synchronized (((g4.c) this.f4524b).f41481h) {
                                try {
                                    r.b bVar = (r.b) ((g4.c) this.f4524b).f41481h.iterator();
                                    if (bVar.hasNext()) {
                                        ((g4.b) ((Map.Entry) bVar.next()).getValue()).getClass();
                                        throw null;
                                    }
                                } catch (Throwable th5) {
                                    throw th5;
                                }
                            }
                            return;
                        }
                        lock.unlock();
                        return;
                    } catch (Throwable th6) {
                        lock.unlock();
                        throw th6;
                    }
                } catch (SQLiteException | IllegalStateException e12) {
                    e = e12;
                    A = 0;
                }
                break;
            case 18:
                k5.g gVar2 = (k5.g) this.f4524b;
                gVar2.getClass();
                while (true) {
                    try {
                        gVar2.n((g6.c) ((ReferenceQueue) gVar2.f44327c).remove());
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
                break;
            case 19:
                AppStartTrace appStartTrace = (AppStartTrace) this.f4524b;
                if (appStartTrace.f24699i == null) {
                    appStartTrace.f24700j = new md.h();
                    return;
                }
                return;
            case 20:
                ((io.flutter.plugins.firebase.messaging.a) ((v9.e) ((a0) this.f4524b).f4524b).f52504c).c();
                return;
            case 21:
                b();
                return;
            case 22:
                if (((TaskCompletionSource) this.f4524b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 23:
                Object obj2 = ((od.c) this.f4524b).f47386b;
                return;
            case 24:
                ((j2.k) this.f4524b).onLoaderReleased();
                return;
            case 25:
                ja.a aVar = (ja.a) this.f4524b;
                synchronized (aVar.f43759a) {
                    try {
                        if (aVar.b()) {
                            Log.e("WakeLock", String.valueOf(aVar.f43768j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                            aVar.d();
                            if (aVar.b()) {
                                aVar.f43761c = 1;
                                aVar.e();
                                return;
                            }
                            return;
                        }
                        return;
                    } catch (Throwable th7) {
                        throw th7;
                    }
                }
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                n1 n1Var = (n1) this.f4524b;
                n1Var.l = null;
                n1Var.drawableStateChanged();
                return;
            case 27:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f4524b;
                if (searchView$SearchAutoComplete.f3943f) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f3943f = false;
                    return;
                }
                return;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                ActionMenuView actionMenuView = ((Toolbar) this.f4524b).f3970a;
                if (actionMenuView == null || (jVar = actionMenuView.f3923t) == null) {
                    return;
                }
                jVar.l();
                return;
            default:
                p0.c cVar2 = (p0.c) this.f4524b;
                n1 n1Var2 = cVar2.f47890c;
                p0.a aVar2 = cVar2.f47888a;
                if (cVar2.f47901o) {
                    if (cVar2.f47899m) {
                        cVar2.f47899m = false;
                        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar2.f47882e = jCurrentAnimationTimeMillis;
                        aVar2.f47884g = -1L;
                        aVar2.f47883f = jCurrentAnimationTimeMillis;
                        aVar2.f47885h = 0.5f;
                    }
                    if ((aVar2.f47884g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.f47884g + ((long) aVar2.f47886i)) || !cVar2.e()) {
                        cVar2.f47901o = false;
                        return;
                    }
                    if (cVar2.f47900n) {
                        cVar2.f47900n = false;
                        long jUptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
                        n1Var2.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                    }
                    if (aVar2.f47883f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long jCurrentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float fA = aVar2.a(jCurrentAnimationTimeMillis2);
                    long j12 = jCurrentAnimationTimeMillis2 - aVar2.f47883f;
                    aVar2.f47883f = jCurrentAnimationTimeMillis2;
                    cVar2.f47903q.scrollListBy((int) (j12 * ((fA * 4.0f) + ((-4.0f) * fA * fA)) * aVar2.f47881d));
                    WeakHashMap weakHashMap = m0.s0.f45746a;
                    n1Var2.postOnAnimation(this);
                    return;
                }
                return;
        }
        while (true) {
            ao.d dVar = (ao.d) this.f4524b;
            synchronized (dVar) {
                aVarC = dVar.c();
            }
            if (aVarC == null) {
                return;
            }
            ao.c cVar3 = aVarC.f5053c;
            kotlin.jvm.internal.n.c(cVar3);
            ao.d dVar2 = (ao.d) this.f4524b;
            boolean zIsLoggable = ao.d.f5065j.isLoggable(Level.FINE);
            if (zIsLoggable) {
                jNanoTime = System.nanoTime();
                a.a.a(aVarC, cVar3, "starting");
            } else {
                jNanoTime = -1;
            }
            try {
                ao.d.a(dVar2, aVarC);
                if (zIsLoggable) {
                    a.a.a(aVarC, cVar3, "finished run in ".concat(a.a.p(System.nanoTime() - jNanoTime)));
                }
            } catch (Throwable th8) {
                try {
                    ((ThreadPoolExecutor) dVar2.f5066a.f47386b).execute(this);
                    throw th8;
                } catch (Throwable th9) {
                    if (zIsLoggable) {
                        a.a.a(aVarC, cVar3, "failed a run in ".concat(a.a.p(System.nanoTime() - jNanoTime)));
                    }
                    throw th9;
                }
            }
        }
    }

    public a0(com.google.android.gms.common.api.internal.c0 c0Var) {
        this.f4523a = 6;
        Objects.requireNonNull(c0Var);
        this.f4524b = c0Var;
    }

    public a0(ea.x0 x0Var, boolean z10) {
        this.f4523a = 10;
        this.f4524b = x0Var;
    }

    public a0(e4 e4Var, f4 f4Var) {
        this.f4523a = 14;
        this.f4524b = e4Var;
    }

    public a0(s4.i iVar) {
        this.f4523a = 5;
        Objects.requireNonNull(iVar);
        this.f4524b = iVar;
    }

    public a0(od.c cVar, int i10) {
        this.f4523a = 23;
        this.f4524b = cVar;
    }
}
