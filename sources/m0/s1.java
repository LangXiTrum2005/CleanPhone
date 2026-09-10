package m0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.graphics.drawable.BitmapDrawable;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.MediaCodec;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.work.impl.WorkDatabase_Impl;
import com.adjust.sdk.AdjustThirdPartySharingResult;
import com.adjust.sdk.OnThirdPartySharingSettingsReadListener;
import com.adjust.sdk.flutter.AdjustSdk;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.applovin.impl.z8;
import com.applovin.shadow.okio.Segment;
import com.facebook.appevents.AppEventsLoggerImpl;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.ads.f6;
import com.google.android.gms.internal.ads.g7;
import com.google.android.gms.internal.ads.p12;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.util.concurrent.ListenableFuture;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import ea.f4;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class s1 implements n1.g, e6.l, InstallReferrerStateListener, n2.f, OnThirdPartySharingSettingsReadListener, wd.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static s1 f45749d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f45751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f45752c;

    public /* synthetic */ s1(int i10, Object obj, Object obj2) {
        this.f45750a = i10;
        this.f45751b = obj;
        this.f45752c = obj2;
    }

    public static pm.j0 g(List list) {
        return list.isEmpty() ? pm.j0.f48444c : new pm.j0(list);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    @Override // n2.f
    public n2.e a(n2.l lVar, long j10) {
        int iG;
        long position = lVar.getPosition();
        int iMin = (int) Math.min(20000L, lVar.getLength() - position);
        l1.q qVar = (l1.q) this.f45752c;
        qVar.J(iMin);
        lVar.peekFully(qVar.f44813a, 0, iMin);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (qVar.a() >= 4) {
            if (s2.b.g(qVar.f44814b, qVar.f44813a) != 442) {
                qVar.N(1);
            } else {
                qVar.N(4);
                long jC = u3.o.c(qVar);
                if (jC != C.TIME_UNSET) {
                    long jB = ((l1.x) this.f45751b).b(jC);
                    if (jB > j10) {
                        return j11 == C.TIME_UNSET ? new n2.e(-1, jB, position) : new n2.e(0, C.TIME_UNSET, position + ((long) i11));
                    }
                    j11 = jB;
                    if (100000 + j11 > j10) {
                        return new n2.e(0, C.TIME_UNSET, position + ((long) qVar.f44814b));
                    }
                    i11 = qVar.f44814b;
                }
                int i12 = qVar.f44815c;
                if (qVar.a() >= 10) {
                    qVar.N(9);
                    int iZ = qVar.z() & 7;
                    if (qVar.a() >= iZ) {
                        qVar.N(iZ);
                        if (qVar.a() >= 4) {
                            if (s2.b.g(qVar.f44814b, qVar.f44813a) != 443) {
                                while (qVar.a() >= 4) {
                                    iG = s2.b.g(qVar.f44814b, qVar.f44813a);
                                    if (iG == 442) {
                                        break;
                                    }
                                    break;
                                }
                            }
                            qVar.N(4);
                            int iG2 = qVar.G();
                            if (qVar.a() < iG2) {
                                qVar.M(i12);
                            } else {
                                qVar.N(iG2);
                                while (qVar.a() >= 4) {
                                    iG = s2.b.g(qVar.f44814b, qVar.f44813a);
                                    if (iG == 442 || iG == 441 || (iG >>> 8) != 1) {
                                        break;
                                    }
                                    qVar.N(4);
                                    if (qVar.a() < 2) {
                                        qVar.M(i12);
                                        break;
                                    }
                                    qVar.M(Math.min(qVar.f44815c, qVar.f44814b + qVar.G()));
                                }
                            }
                        } else {
                            qVar.M(i12);
                        }
                    } else {
                        qVar.M(i12);
                    }
                } else {
                    qVar.M(i12);
                }
                i10 = qVar.f44814b;
            }
        }
        return j11 != C.TIME_UNSET ? new n2.e(-2, j11, position + ((long) i10)) : n2.e.f46453d;
    }

    @Override // n2.f
    public void b() {
        l1.q qVar = (l1.q) this.f45752c;
        byte[] bArr = l1.y.f44831b;
        qVar.getClass();
        qVar.K(bArr, bArr.length);
    }

    public void c() {
        this.f45751b = null;
        this.f45752c = null;
    }

    @Override // n1.g
    public n1.h createDataSource() {
        return new n1.l((Context) this.f45751b, ((g7) this.f45752c).createDataSource());
    }

    @Override // e6.b
    public boolean d(Object obj, File file, e6.i iVar) {
        return ((n6.b) this.f45752c).d(new n6.d(((BitmapDrawable) ((g6.a0) obj).get()).getBitmap(), (h6.a) this.f45751b), file, iVar);
    }

    @Override // e6.l
    public int e(e6.i iVar) {
        return 2;
    }

    public boolean f(int i10) {
        return ((i1.n) this.f45751b).f42581a.get(i10);
    }

    @Override // vj.a
    public Object get() {
        Context appContext = (Context) ((rb.c) this.f45751b).f49529b;
        ak.k blockingDispatcher = (ak.k) ((wd.c) this.f45752c).get();
        kotlin.jvm.internal.n.f(appContext, "appContext");
        kotlin.jvm.internal.n.f(blockingDispatcher, "blockingDispatcher");
        return ud.q.b(xd.h.f53753a, new na.g(new bh.a(28)), cn.d0.b(blockingDispatcher), new ud.p(appContext, 0));
    }

    public p1.a[] h(Handler handler, p1.v vVar, p1.v vVar2, p1.v vVar3, p1.v vVar4) {
        ArrayList arrayList = new ArrayList();
        Context context = (Context) this.f45751b;
        l2.g gVar = new l2.g(context);
        f4 f4Var = (f4) this.f45752c;
        gVar.f44862c = f4Var;
        gVar.f44863d = 5000L;
        gVar.f44864e = handler;
        gVar.f44865f = vVar;
        gVar.f44866g = 50;
        go.k.t(!gVar.f44861b);
        Handler handler2 = gVar.f44864e;
        go.k.t((handler2 == null && gVar.f44865f == null) || !(handler2 == null || gVar.f44865f == null));
        gVar.f44861b = true;
        arrayList.add(new l2.h(gVar));
        p12 p12Var = new p12(context, 2);
        go.k.t(!p12Var.f18437a);
        p12Var.f18437a = true;
        if (((qd.i) p12Var.f18440d) == null) {
            p12Var.f18440d = new qd.i(new j1.k[0]);
        }
        if (((r1.u) p12Var.f18442f) == null) {
            if (((s1) p12Var.f18443g) == null) {
                p12Var.f18443g = new s1(context, 19);
            }
            if (((r1.b0) p12Var.f18441e) == null) {
                p12Var.f18441e = r1.b0.f49255a;
            }
            zc.u uVar = new zc.u(context);
            r1.b bVar = context != null ? null : (r1.b) p12Var.f18439c;
            Context context2 = (Context) uVar.f54879b;
            if (context2 == null) {
                uVar.f54882e = bVar;
            }
            s1 s1Var = (s1) p12Var.f18443g;
            uVar.f54880c = s1Var;
            uVar.f54881d = (r1.b0) p12Var.f18441e;
            if (s1Var == null) {
                uVar.f54880c = new s1(context2, 19);
            }
            p12Var.f18442f = new r1.u(uVar);
        } else {
            go.k.t(((s1) p12Var.f18443g) == null);
            go.k.t(((r1.b0) p12Var.f18441e) == null);
        }
        arrayList.add(new r1.c0((Context) this.f45751b, f4Var, handler, vVar2, new r1.a0(p12Var)));
        arrayList.add(new h2.f(vVar3, handler.getLooper()));
        Looper looper = handler.getLooper();
        arrayList.add(new z1.b(vVar4, looper));
        arrayList.add(new z1.b(vVar4, looper));
        arrayList.add(new m2.a());
        arrayList.add(new x1.f(new e5.f(context)));
        return (p1.a[]) arrayList.toArray(new p1.a[0]);
    }

    public void i(String str, jk.b bVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((od.c) this.f45752c).f47386b;
        ql.n nVar = new ql.n(this, str);
        bVar.invoke(nVar);
        String internalName = (String) this.f45751b;
        ArrayList arrayList = nVar.f49165a;
        ArrayList arrayList2 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add((String) ((wj.f) it.next()).f53283a);
        }
        String ret = (String) nVar.f49166b.f53283a;
        kotlin.jvm.internal.n.f(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('(');
        sb2.append(xj.n.u0(arrayList2, "", null, null, rl.p.f49645e, 30));
        sb2.append(')');
        if (ret.length() > 1) {
            ret = defpackage.e.f(';', "L", ret);
        }
        sb2.append(ret);
        String jvmDescriptor = sb2.toString();
        kotlin.jvm.internal.n.f(internalName, "internalName");
        kotlin.jvm.internal.n.f(jvmDescriptor, "jvmDescriptor");
        String str2 = internalName + '.' + jvmDescriptor;
        ql.o oVar = (ql.o) nVar.f49166b.f53284b;
        ArrayList arrayList3 = new ArrayList(xj.p.W(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add((ql.o) ((wj.f) it2.next()).f53284b);
        }
        linkedHashMap.put(str2, new ql.l(oVar, arrayList3));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x003e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0046  */
    /* JADX WARN: Code duplicated, block: B:20:0x0059  */
    public CctBackendFactory j(String str) {
        Bundle bundle;
        Map map;
        Object obj;
        if (((Map) this.f45752c) == null) {
            Context context = (Context) this.f45751b;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("BackendRegistry", "Context has no PackageManager.");
                } else {
                    ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                    if (serviceInfo == null) {
                        Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                    } else {
                        bundle = serviceInfo.metaData;
                    }
                    if (bundle == null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap map2 = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            obj = bundle.get(str2);
                            if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String strTrim = str3.trim();
                                    if (!strTrim.isEmpty()) {
                                        map2.put(strTrim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = map2;
                    }
                    this.f45752c = map;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            bundle = null;
            if (bundle == null) {
                Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                map = Collections.EMPTY_MAP;
            } else {
                HashMap map3 = new HashMap();
                while (r6.hasNext()) {
                    obj = bundle.get(str2);
                    if (!(obj instanceof String)) {
                    }
                }
                map = map3;
            }
            this.f45752c = map;
        }
        String str4 = (String) ((Map) this.f45752c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e10) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e10);
            return null;
        } catch (IllegalAccessException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (InstantiationException e12) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e12);
            return null;
        } catch (NoSuchMethodException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        } catch (InvocationTargetException e14) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e14);
            return null;
        }
    }

    public r1.c k(i1.e eVar, i1.p pVar) {
        boolean zBooleanValue;
        pVar.getClass();
        eVar.getClass();
        int i10 = Build.VERSION.SDK_INT;
        int i11 = pVar.G;
        if (i11 == -1) {
            return r1.c.f49256d;
        }
        Context context = (Context) this.f45751b;
        Boolean bool = (Boolean) this.f45752c;
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            if (context != null) {
                String parameters = j1.f.u(context).getParameters("offloadVariableRateSupported");
                this.f45752c = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f45752c = Boolean.FALSE;
            }
            zBooleanValue = ((Boolean) this.f45752c).booleanValue();
        }
        String str = pVar.f42643n;
        str.getClass();
        int iC = i1.d0.c(str, pVar.f42641k);
        if (iC == 0 || i10 < l1.y.r(iC)) {
            return r1.c.f49256d;
        }
        int iS = l1.y.s(pVar.F);
        if (iS == 0) {
            return r1.c.f49256d;
        }
        try {
            AudioFormat audioFormatBuild = new AudioFormat.Builder().setSampleRate(i11).setChannelMask(iS).setEncoding(iC).build();
            if (i10 >= 31) {
                return i.a(audioFormatBuild, eVar.a(), zBooleanValue);
            }
            if (!AudioManager.isOffloadedPlaybackSupported(audioFormatBuild, eVar.a())) {
                return r1.c.f49256d;
            }
            f6 f6Var = new f6();
            f6Var.f14258a = true;
            f6Var.f14260c = zBooleanValue;
            return f6Var.a();
        } catch (IllegalArgumentException unused) {
            return r1.c.f49256d;
        }
    }

    public ArrayList l(String str) {
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.f45751b;
        g4.h hVarB = g4.h.b(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            hVarB.h(1);
        } else {
            hVarB.j(1, str);
        }
        workDatabase_Impl.b();
        Cursor cursorG = workDatabase_Impl.g(hVarB);
        try {
            ArrayList arrayList = new ArrayList(cursorG.getCount());
            while (cursorG.moveToNext()) {
                arrayList.add(cursorG.getString(0));
            }
            cursorG.close();
            hVarB.k();
            return arrayList;
        } catch (Throwable th2) {
            cursorG.close();
            hVarB.k();
            throw th2;
        }
    }

    public n2.k m(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.f45752c)) {
            try {
                if (!((AtomicBoolean) this.f45752c).get()) {
                    try {
                        constructorA = ((i0.a) this.f45751b).a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.f45752c).set(true);
                        constructorA = null;
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating extension", e10);
                    }
                }
                constructorA = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (n2.k) constructorA.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    public int n(qk.d kClass) {
        int iIntValue;
        kotlin.jvm.internal.n.f(kClass, "kClass");
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f45751b;
        String strD = kClass.d();
        kotlin.jvm.internal.n.c(strD);
        al.f fVar = new al.f(this, 28);
        kotlin.jvm.internal.n.f(concurrentHashMap, "<this>");
        Integer num = (Integer) concurrentHashMap.get(strD);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(strD);
                if (num2 == null) {
                    Object objInvoke = fVar.invoke(strD);
                    concurrentHashMap.putIfAbsent(strD, Integer.valueOf(((Number) objInvoke).intValue()));
                    num2 = (Integer) objInvoke;
                }
                iIntValue = num2.intValue();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iIntValue;
    }

    public MotionEvent o(mi.e0 e0Var) {
        long j10 = e0Var.f45995a;
        LongSparseArray longSparseArray = (LongSparseArray) this.f45751b;
        PriorityQueue priorityQueue = (PriorityQueue) this.f45752c;
        while (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() < j10) {
            longSparseArray.remove(((Long) priorityQueue.poll()).longValue());
        }
        if (!priorityQueue.isEmpty() && ((Long) priorityQueue.peek()).longValue() == j10) {
            priorityQueue.poll();
        }
        MotionEvent motionEvent = (MotionEvent) longSparseArray.get(j10);
        longSparseArray.remove(j10);
        return motionEvent;
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        CountDownLatch countDownLatch = (CountDownLatch) this.f45752c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i10) {
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f45751b;
        CountDownLatch countDownLatch = (CountDownLatch) this.f45752c;
        if (v7.a.b(this)) {
            return;
        }
        try {
            try {
                if (i10 == 0) {
                    try {
                        ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                        kotlin.jvm.internal.n.e(installReferrer, "{\n                      …r\n                      }");
                        String installReferrer2 = installReferrer.getInstallReferrer();
                        if (installReferrer2 != null && (an.h.q0(installReferrer2, "fb", false) || an.h.q0(installReferrer2, "facebook", false))) {
                            AppEventsLoggerImpl.installReferrerCallback$lambda$0(installReferrer2);
                        }
                        l7.s.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                    } catch (RemoteException unused) {
                        if (countDownLatch == null) {
                            return;
                        }
                    }
                } else if (i10 == 2) {
                    l7.s.b().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
                }
                try {
                    installReferrerClient.endConnection();
                } catch (Exception unused2) {
                }
                if (countDownLatch == null) {
                    return;
                }
                countDownLatch.countDown();
            } catch (Throwable th2) {
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            v7.a.a(this, th3);
        }
    }

    @Override // com.adjust.sdk.OnThirdPartySharingSettingsReadListener
    public void onThirdPartySharingSettingsRead(AdjustThirdPartySharingResult adjustThirdPartySharingResult) {
        xi.o oVar = (xi.o) this.f45751b;
        if (adjustThirdPartySharingResult == null) {
            oVar.a(null);
        } else {
            oVar.a(((AdjustSdk) this.f45752c).getThirdPartySharingResultMap(adjustThirdPartySharingResult));
        }
    }

    public void p(int i10, int i11, boolean z10) {
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.f45751b;
        Window window = (Window) this.f45752c;
        if (window == null) {
            if (z10) {
                windowInsetsController.setSystemBarsAppearance(i11, i11);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i11);
                return;
            }
        }
        if (z10) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i10 | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i10) & decorView2.getSystemUiVisibility());
        }
    }

    public void q(boolean z10) {
        p(16, 16, z10);
    }

    public void r(boolean z10) {
        p(Segment.SIZE, 8, z10);
    }

    public ListenableFuture s(ta.y yVar, Executor executor) {
        executor.getClass();
        ta.e0 e0Var = new ta.e0(ta.d0.f50598a);
        e0Var.f50606b = executor;
        e0Var.f50605a = this;
        m5.k kVar = new m5.k(19, e0Var, yVar);
        ta.v0 v0Var = new ta.v0();
        ListenableFuture listenableFuture = (ListenableFuture) ((AtomicReference) this.f45751b).getAndSet(v0Var);
        ta.x0 x0Var = new ta.x0();
        x0Var.f50672i = new ta.w0(x0Var, kVar);
        listenableFuture.addListener(x0Var, e0Var);
        ListenableFuture listenableFutureE = ta.k0.e(x0Var);
        z8 z8Var = new z8(x0Var, v0Var, listenableFuture, listenableFutureE, e0Var, 8);
        ta.c0 c0Var = ta.c0.f50592a;
        listenableFutureE.addListener(z8Var, c0Var);
        x0Var.addListener(z8Var, c0Var);
        return listenableFutureE;
    }

    public zc.u t(yl.f name, String str) {
        kotlin.jvm.internal.n.f(name, "name");
        String strB = name.b();
        kotlin.jvm.internal.n.e(strB, "name.asString()");
        return new zc.u(this, new rl.o(strB.concat(str)));
    }

    public String toString() {
        switch (this.f45750a) {
            case 24:
                return ((String) this.f45751b) + ", " + ((String) this.f45752c);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ s1(int i10, boolean z10) {
        this.f45750a = i10;
    }

    public s1(AppMeasurementSdk appMeasurementSdk, v6.c cVar) {
        this.f45750a = 20;
        this.f45752c = cVar;
        appMeasurementSdk.a(new rb.b(this, 0));
        this.f45751b = new HashSet();
    }

    public s1(WorkDatabase_Impl workDatabase_Impl, int i10) {
        this.f45750a = i10;
        switch (i10) {
            case 3:
                this.f45751b = workDatabase_Impl;
                this.f45752c = new m5.b(workDatabase_Impl, 3);
                break;
            default:
                this.f45751b = workDatabase_Impl;
                this.f45752c = new m5.b(workDatabase_Impl, 0);
                break;
        }
    }

    public s1(ne.c cVar) {
        this.f45750a = 25;
        this.f45751b = new HashMap();
        this.f45752c = cVar;
    }

    public s1(InstallReferrerClient installReferrerClient, q7.w wVar, CountDownLatch countDownLatch) {
        this.f45750a = 15;
        this.f45751b = installReferrerClient;
        this.f45752c = countDownLatch;
    }

    public s1(tc.b bVar) {
        this.f45750a = 16;
        this.f45752c = defpackage.e.w();
        this.f45751b = bVar;
    }

    public s1(int i10) {
        this.f45750a = i10;
        switch (i10) {
            case 13:
                this.f45751b = new ConcurrentHashMap();
                this.f45752c = new AtomicInteger(0);
                break;
            case 17:
                this.f45751b = new HashMap();
                this.f45752c = null;
                break;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                this.f45751b = new AtomicReference(ta.n0.f50627b);
                this.f45752c = new r1.s(3);
                break;
            default:
                this.f45751b = new LongSparseArray();
                this.f45752c = new PriorityQueue();
                break;
        }
    }

    public s1(l1.x xVar) {
        this.f45750a = 27;
        this.f45751b = xVar;
        this.f45752c = new l1.q();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s1(Context context, int i10) {
        this(context, new g7(2));
        this.f45750a = i10;
        switch (i10) {
            case 11:
                this.f45751b = context;
                this.f45752c = new f4(context, 7, false);
                break;
            case 19:
                this.f45751b = context == null ? null : context.getApplicationContext();
                break;
            case 22:
                this.f45752c = null;
                this.f45751b = context;
                break;
            default:
                break;
        }
    }

    public s1(Context context, g7 g7Var) {
        this.f45750a = 6;
        this.f45751b = context.getApplicationContext();
        this.f45752c = g7Var;
    }

    public s1(t.r rVar) {
        this.f45750a = 23;
        this.f45752c = rVar;
    }

    public s1(com.google.android.gms.internal.consent_sdk.x xVar, HashMap map, HashMap map2) {
        this.f45750a = 21;
        this.f45751b = xVar;
        this.f45752c = map;
    }

    public s1(i1.n nVar, SparseArray sparseArray) {
        this.f45750a = 14;
        this.f45751b = nVar;
        SparseBooleanArray sparseBooleanArray = nVar.f42581a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            go.k.m(i10, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i10);
            q1.a aVar = (q1.a) sparseArray.get(iKeyAt);
            aVar.getClass();
            sparseArray2.append(iKeyAt, aVar);
        }
        this.f45752c = sparseArray2;
    }

    public s1(MediaCodec.CryptoInfo cryptoInfo) {
        this.f45750a = 10;
        this.f45751b = cryptoInfo;
        this.f45752c = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public s1(od.c cVar, String className) {
        this.f45750a = 18;
        kotlin.jvm.internal.n.f(className, "className");
        this.f45752c = cVar;
        this.f45751b = className;
    }

    public s1(oa.n1 n1Var, int[] iArr) {
        this.f45750a = 1;
        this.f45751b = oa.j0.x(n1Var);
        this.f45752c = iArr;
    }

    public s1(Window window) {
        this.f45750a = 0;
        this.f45751b = window.getInsetsController();
        this.f45752c = window;
    }

    public s1(i0.a aVar) {
        this.f45750a = 7;
        this.f45751b = aVar;
        this.f45752c = new AtomicBoolean(false);
    }

    public s1(AdjustSdk adjustSdk, xi.o oVar) {
        this.f45750a = 28;
        this.f45752c = adjustSdk;
        this.f45751b = oVar;
    }
}
