package fc;

import ac.g;
import android.app.Activity;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.opengl.EGL14;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.Surface;
import bc.q;
import bc.s;
import cc.c0;
import cc.e1;
import cc.h0;
import cc.h1;
import cc.i1;
import cc.j2;
import cc.k1;
import cc.l1;
import cc.q2;
import cc.s0;
import cc.t0;
import cc.u0;
import cc.v0;
import cc.w0;
import cc.z0;
import cn.n0;
import cn.z1;
import com.applovin.impl.sdk.v;
import com.applovin.shadow.okio.Segment;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.internal.ads.j30;
import com.google.android.gms.internal.consent_sdk.g6;
import com.google.android.gms.internal.consent_sdk.j7;
import com.google.android.gms.internal.consent_sdk.k7;
import com.google.android.gms.internal.consent_sdk.l7;
import com.google.android.gms.internal.consent_sdk.m;
import com.google.android.gms.internal.measurement.nf;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import com.ironsource.X3;
import ea.a0;
import ea.b0;
import ea.f2;
import eb.d0;
import eb.e0;
import eb.o;
import io.flutter.embedding.engine.plugins.lifecycle.HiddenLifecycleReference;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.CharConversionException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.function.Predicate;
import jb.a1;
import jb.c1;
import jb.f1;
import jb.y0;
import kotlin.jvm.internal.n;
import qk.i0;
import rl.k;
import rl.l;
import s4.i;
import ud.g1;
import ud.p0;
import wi.j;
import xi.r;
import xi.t;
import zb.h;
import zb.w;
import zb.x;
import zc.u;
import zk.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements vj.a, k7, ui.b, k, wd.b, t8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f40780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f40781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f40782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f40783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f40784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f40785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f40786h;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f40779a = i10;
        this.f40780b = obj;
        this.f40781c = obj2;
        this.f40782d = obj3;
        this.f40783e = obj4;
        this.f40784f = obj5;
        this.f40785g = obj6;
        this.f40786h = obj7;
    }

    public static synchronized void A(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                String str = "Unexpected non-directory file: " + file + "; deleting file and creating new directory.";
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", str, null);
                }
                file.delete();
            }
            if (!file.mkdirs()) {
                Log.e("FirebaseCrashlytics", "Could not create Crashlytics-specific directory: " + file, null);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static byte[] B(Context context, String str, String str2) throws CharConversionException {
        if (str == null) {
            throw new IllegalArgumentException("keysetName cannot be null");
        }
        Context applicationContext = context.getApplicationContext();
        try {
            String string = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).getString(str, null);
            if (string == null) {
                return null;
            }
            return a.a.k(string);
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(defpackage.e.o("can't read keyset; the pref value ", str, " is not a valid hex string"));
        }
    }

    public static va.c C(byte[] bArr) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            return new va.c((c1) m5.k.o(f1.F(byteArrayInputStream, p.a())).u().x(), 3);
        } finally {
            byteArrayInputStream.close();
        }
    }

    public static boolean F(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                F(file2);
            }
        }
        return file.delete();
    }

    public static List I(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public static final void a(f fVar, Intent intent) {
        j jVar;
        Activity activity = (Activity) fVar.f40781c;
        if (activity != null) {
            activity.startActivityForResult(intent, 22643);
            return;
        }
        intent.addFlags(268435456);
        hi.b bVar = (hi.b) fVar.f40782d;
        if (bVar.f42358b.compareAndSet(false, true) && (jVar = bVar.f42357a) != null) {
            jVar.a("dev.fluttercommunity.plus/share/unavailable");
            bVar.f42357a = null;
        }
        ((Context) fVar.f40780b).startActivity(intent);
    }

    public static t0 c(t0 t0Var, bc.f fVar, f fVar2, Map map) {
        Map mapUnmodifiableMap;
        Map mapUnmodifiableMap2;
        Map mapUnmodifiableMap3;
        s0 s0VarA = t0Var.a();
        String strG = ((bc.d) fVar.f5548b).g();
        if (strG != null) {
            s0VarA.f6273e = new h1(strG);
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "No log data to include with this event.", null);
        }
        s sVar = (s) fVar2.f40783e;
        if (map.isEmpty()) {
            bc.e eVar = (bc.e) ((AtomicMarkableReference) sVar.f5581b).getReference();
            synchronized (eVar) {
                mapUnmodifiableMap2 = Collections.unmodifiableMap(new HashMap(eVar.f5543a));
            }
        } else {
            bc.e eVar2 = (bc.e) ((AtomicMarkableReference) sVar.f5581b).getReference();
            synchronized (eVar2) {
                mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(eVar2.f5543a));
            }
            HashMap map2 = new HashMap(mapUnmodifiableMap);
            int i10 = 0;
            for (Map.Entry entry : map.entrySet()) {
                String strA = bc.e.a(1024, (String) entry.getKey());
                if (map2.size() < 64 || map2.containsKey(strA)) {
                    map2.put(strA, bc.e.a(1024, (String) entry.getValue()));
                } else {
                    i10++;
                }
            }
            if (i10 > 0) {
                Log.w("FirebaseCrashlytics", "Ignored " + i10 + " keys when adding event specific keys. Maximum allowable: 1024", null);
            }
            mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        }
        List listT = t(mapUnmodifiableMap2);
        bc.e eVar3 = (bc.e) ((AtomicMarkableReference) ((s) fVar2.f40784f).f5581b).getReference();
        synchronized (eVar3) {
            mapUnmodifiableMap3 = Collections.unmodifiableMap(new HashMap(eVar3.f5543a));
        }
        List listT2 = t(mapUnmodifiableMap3);
        if (!listT.isEmpty() || !listT2.isEmpty()) {
            u0 u0VarA = t0Var.f6284c.a();
            u0VarA.f6296b = listT;
            u0VarA.f6297c = listT2;
            s0VarA.f6271c = u0VarA.a();
        }
        return s0VarA.a();
    }

    public static q2 f(t0 t0Var, f fVar) {
        List listA = ((q) fVar.f40785g).a();
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < listA.size(); i10++) {
            bc.p pVar = (bc.p) listA.get(i10);
            pVar.getClass();
            i1 i1Var = new i1();
            bc.b bVar = (bc.b) pVar;
            String str = bVar.f5538e;
            if (str == null) {
                throw new NullPointerException("Null variantId");
            }
            String str2 = bVar.f5535b;
            if (str2 == null) {
                throw new NullPointerException("Null rolloutId");
            }
            i1Var.f6117a = new k1(str2, str);
            String str3 = bVar.f5536c;
            if (str3 == null) {
                throw new NullPointerException("Null parameterKey");
            }
            i1Var.f6118b = str3;
            String str4 = bVar.f5537d;
            if (str4 == null) {
                throw new NullPointerException("Null parameterValue");
            }
            i1Var.f6119c = str4;
            i1Var.f6120d = bVar.f5539f;
            i1Var.f6121e = (byte) (i1Var.f6121e | 1);
            arrayList.add(i1Var.a());
        }
        if (arrayList.isEmpty()) {
            return t0Var;
        }
        s0 s0VarA = t0Var.a();
        s0VarA.f6274f = new l1(arrayList);
        return s0VarA.a();
    }

    public static String i(InputStream inputStream) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                byte[] bArr = new byte[Segment.SIZE];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 == -1) {
                        String string = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                        byteArrayOutputStream.close();
                        bufferedInputStream.close();
                        return string;
                    }
                    byteArrayOutputStream.write(bArr, 0, i10);
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            bufferedInputStream.close();
            throw th5;
        }
    }

    public static f j(Context context, x xVar, f fVar, j30 j30Var, bc.f fVar2, f fVar3, d0 d0Var, com.google.android.gms.internal.consent_sdk.d dVar, v6.c cVar, h hVar, g gVar) {
        zb.s sVar = new zb.s(context, xVar, j30Var, d0Var, dVar);
        d dVar2 = new d(fVar, dVar, hVar);
        dc.a aVar = gc.a.f41820b;
        r8.p.b(context);
        return new f(sVar, dVar2, new gc.a(new gc.c(r8.p.a().c(new p8.a(gc.a.f41821c, gc.a.f41822d)).a("FIREBASE_CRASHLYTICS_REPORT", new o8.c("json"), gc.a.f41823e), dVar.h(), cVar)), fVar2, fVar3, xVar, gVar, 14);
    }

    public static String q(String str) {
        if (str == null || !an.h.q0(str, "/", false)) {
            return "*";
        }
        String strSubstring = str.substring(0, an.h.w0(str, "/", 0, false, 6));
        n.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static List t(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str == null) {
                throw new NullPointerException("Null key");
            }
            String str2 = (String) entry.getValue();
            if (str2 == null) {
                throw new NullPointerException("Null value");
            }
            arrayList.add(new h0(str, str2));
        }
        Collections.sort(arrayList, new b2.j(24));
        return Collections.unmodifiableList(arrayList);
    }

    public va.c D(byte[] bArr) {
        try {
            this.f40784f = new db.c().b((String) this.f40783e);
            try {
                return new va.c((c1) t9.e.n(new va.c(new ByteArrayInputStream(bArr), 1), (db.b) this.f40784f, new byte[0]).u().x(), 3);
            } catch (IOException | GeneralSecurityException e10) {
                try {
                    return C(bArr);
                } catch (IOException unused) {
                    throw e10;
                }
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            try {
                va.c cVarC = C(bArr);
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
                return cVarC;
            } catch (IOException unused2) {
                throw e11;
            }
        }
    }

    public db.b E() throws KeyStoreException {
        db.c cVar = new db.c();
        try {
            boolean zA = db.c.a((String) this.f40783e);
            try {
                return cVar.b((String) this.f40783e);
            } catch (GeneralSecurityException | ProviderException e10) {
                if (!zA) {
                    throw new KeyStoreException(defpackage.e.o("the master key ", (String) this.f40783e, " exists but is unusable"), e10);
                }
                Log.w("a", "cannot use Android Keystore, it'll be disabled", e10);
                return null;
            }
        } catch (GeneralSecurityException | ProviderException e11) {
            Log.w("a", "cannot use Android Keystore, it'll be disabled", e11);
            return null;
        }
    }

    public void G() {
        wf.d dVar = (wf.d) this.f40784f;
        dVar.getClass();
        Iterator itB = eg.a.b(dVar);
        while (itB.hasNext()) {
            m5.k kVar = ((wf.b) itB.next()).f53180b;
            if (kVar != null) {
                rf.a aVar = (rf.a) kVar.f45903c;
                g9.k kVar2 = aVar.f49570a;
                pf.e eglSurface = aVar.f49571b;
                kVar2.getClass();
                n.f(eglSurface, "eglSurface");
                EGL14.eglDestroySurface(((pf.c) kVar2.f41770b).f48351a, eglSurface.f48368a);
                aVar.f49571b = pf.d.f48354c;
                aVar.f49573d = -1;
                aVar.f49572c = -1;
                Surface surface = aVar.f49574e;
                if (surface != null) {
                    surface.release();
                }
                aVar.f49574e = null;
                ((g9.k) kVar.f45902b).release();
            }
        }
    }

    public void H(r rVar) {
        ((HashSet) this.f40783e).remove(rVar);
    }

    public Task J(String str, Executor executor) {
        TaskCompletionSource taskCompletionSource;
        ArrayList<File> arrayListC = ((d) this.f40781c).c();
        ArrayList<zb.a> arrayList = new ArrayList();
        for (File file : arrayListC) {
            try {
                dc.a aVar = d.f40771g;
                String strF = d.f(file);
                aVar.getClass();
                arrayList.add(new zb.a(dc.a.j(strF), file.getName(), file));
            } catch (IOException e10) {
                Log.w("FirebaseCrashlytics", "Could not load report file " + file + "; deleting", e10);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (zb.a aVar2 : arrayList) {
            if (str == null || str.equals(aVar2.f54670b)) {
                gc.a aVar3 = (gc.a) this.f40782d;
                cc.d0 d0Var = aVar2.f54669a;
                if (d0Var.f6043f == null || d0Var.f6044g == null) {
                    w wVarB = ((x) this.f40785g).b(true);
                    cc.d0 d0Var2 = aVar2.f54669a;
                    String str2 = wVarB.f54773a;
                    c0 c0VarA = d0Var2.a();
                    c0VarA.f6014e = str2;
                    cc.d0 d0VarA = c0VarA.a();
                    String str3 = wVarB.f54774b;
                    c0 c0VarA2 = d0VarA.a();
                    c0VarA2.f6015f = str3;
                    aVar2 = new zb.a(c0VarA2.a(), aVar2.f54670b, aVar2.f54671c);
                }
                boolean z10 = str != null;
                gc.c cVar = aVar3.f41824a;
                synchronized (cVar.f41834f) {
                    try {
                        taskCompletionSource = new TaskCompletionSource();
                        if (z10) {
                            ((AtomicInteger) cVar.f41837i.f52487a).getAndIncrement();
                            if (cVar.f41834f.size() < cVar.f41833e) {
                                wb.c cVar2 = wb.c.f53149a;
                                cVar2.b("Enqueueing report: " + aVar2.f54670b);
                                cVar2.b("Queue size: " + cVar.f41834f.size());
                                cVar.f41835g.execute(new m0(cVar, aVar2, taskCompletionSource, 18));
                                cVar2.b("Closing task for report: " + aVar2.f54670b);
                                taskCompletionSource.trySetResult(aVar2);
                            } else {
                                cVar.a();
                                String str4 = "Dropping report due to queue being full: " + aVar2.f54670b;
                                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                                    Log.d("FirebaseCrashlytics", str4, null);
                                }
                                ((AtomicInteger) cVar.f41837i.f52488b).getAndIncrement();
                                taskCompletionSource.trySetResult(aVar2);
                            }
                        } else {
                            cVar.b(aVar2, taskCompletionSource);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new xa.b(this)));
            }
        }
        return Tasks.whenAll(arrayList2);
    }

    public void b(r rVar) {
        ((HashSet) this.f40783e).add(rVar);
    }

    public void d(xi.s sVar) {
        ((HashSet) this.f40784f).add(sVar);
    }

    public void e(t tVar) {
        ((HashSet) this.f40782d).add(tVar);
    }

    public synchronized db.a g() {
        db.a aVar;
        try {
            if (((String) this.f40780b) == null) {
                throw new IllegalArgumentException("keysetName cannot be null");
            }
            synchronized (db.a.f38798b) {
                try {
                    byte[] bArrB = B((Context) this.f40781c, (String) this.f40780b, (String) this.f40782d);
                    if (bArrB == null) {
                        if (((String) this.f40783e) != null) {
                            this.f40784f = E();
                        }
                        this.f40786h = o();
                    } else if (((String) this.f40783e) != null) {
                        this.f40786h = D(bArrB);
                    } else {
                        this.f40786h = C(bArrB);
                    }
                    aVar = new db.a(this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return aVar;
    }

    @Override // vj.a
    public Object get() {
        switch (this.f40779a) {
            case 2:
                return new bd.c((mb.g) ((od.c) this.f40780b).get(), (tc.b) ((n5.f) this.f40781c).get(), (uc.d) ((i) this.f40782d).get(), (tc.b) ((am.e) this.f40783e).get(), (RemoteConfigManager) ((a0) this.f40784f).get(), (dd.a) ((b0) this.f40785g).get(), (SessionManager) ((b0) this.f40786h).get());
            case 10:
                return new ud.c1((xd.j) ((wd.c) this.f40780b).get(), (ud.t0) ((wd.c) this.f40781c).get(), (p0) ((wd.c) this.f40782d).get(), (g1) ((wd.c) this.f40783e).get(), (s0.i) ((wd.c) this.f40784f).get(), (ud.c0) ((wd.c) this.f40785g).get(), (ak.k) ((wd.c) this.f40786h).get());
            default:
                Context context = (Context) ((vj.a) this.f40780b).get();
                s8.d dVar = (s8.d) ((vj.a) this.f40781c).get();
                y8.d dVar2 = (y8.d) ((vj.a) this.f40782d).get();
                r1.s sVar = (r1.s) ((qd.i) this.f40783e).get();
                Executor executor = (Executor) ((vj.a) this.f40784f).get();
                z8.c cVar = (z8.c) ((vj.a) this.f40785g).get();
                rc.d dVar3 = new rc.d(1);
                fd.b bVar = new fd.b(1);
                y8.c cVar2 = (y8.c) ((vj.a) this.f40786h).get();
                com.google.android.gms.internal.consent_sdk.d dVar4 = new com.google.android.gms.internal.consent_sdk.d();
                dVar4.f22981a = context;
                dVar4.f22982b = dVar;
                dVar4.f22983c = dVar2;
                dVar4.f22984d = sVar;
                dVar4.f22985e = executor;
                dVar4.f22986f = cVar;
                dVar4.f22987g = dVar3;
                dVar4.f22988h = bVar;
                dVar4.f22989i = cVar2;
                return dVar4;
        }
    }

    public void h(String str) {
        File file = new File((File) this.f40781c, str);
        if (file.exists() && F(file)) {
            String str2 = "Deleted previous Crashlytics file system: " + file.getPath();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
        }
    }

    @Override // rl.k
    public void k() {
        com.google.android.gms.internal.consent_sdk.x xVar = (com.google.android.gms.internal.consent_sdk.x) this.f40782d;
        yl.b bVar = (yl.b) this.f40784f;
        HashMap arguments = (HashMap) this.f40781c;
        n.f(arguments, "arguments");
        boolean zN = false;
        if (bVar.equals(vk.a.f52621b)) {
            Object obj = arguments.get(yl.f.e(X3.i.X));
            dm.s sVar = obj instanceof dm.s ? (dm.s) obj : null;
            if (sVar != null) {
                Object obj2 = sVar.f38953a;
                dm.q qVar = obj2 instanceof dm.q ? (dm.q) obj2 : null;
                if (qVar != null) {
                    zN = xVar.n(qVar.f38961a.f38951a);
                }
            }
        }
        if (zN || xVar.n(bVar)) {
            return;
        }
        ((List) this.f40785g).add(new al.d(((zk.e) this.f40783e).g(), arguments, (j0) this.f40786h));
    }

    @Override // rl.k
    public l l(yl.f fVar) {
        return new u((com.google.android.gms.internal.consent_sdk.x) this.f40780b, fVar, this);
    }

    public void m(wf.g gVar) {
        cg.e eVar = gVar.f53198c;
        int i10 = gVar.f53197b;
        vf.c cVar = gVar.f53196a;
        Iterator it = eVar.f6385a.iterator();
        while (it.hasNext()) {
            ((cg.f) it.next()).f6387a.g();
        }
        jg.b bVar = (jg.b) ((wf.f) this.f40780b).l(cVar).get(i10);
        if (((wf.e) ((u) this.f40781c).f54882e).k(cVar)) {
            bVar.c(cVar);
        }
        ((wf.e) this.f40786h).b(cVar, Integer.valueOf(i10 + 1));
    }

    public ApplicationExitInfo n(String str, List list, Predicate predicate) {
        long jLastModified = ((d) this.f40781c).f40775b.r(str, "start-time").lastModified();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) it.next();
            if (applicationExitInfo.getTimestamp() >= jLastModified && predicate.test(applicationExitInfo)) {
                return applicationExitInfo;
            }
        }
        return null;
    }

    public va.c o() throws GeneralSecurityException {
        int i10;
        y0 y0Var;
        va.c cVar = (va.c) this.f40785g;
        if (cVar == null) {
            throw new GeneralSecurityException("cannot read or generate keyset");
        }
        va.i iVarI = (va.i) cVar.f52514b;
        if (iVarI == null) {
            try {
                iVarI = x7.a.I((iVarI instanceof eb.i ? (a1) ((eb.i) iVarI).f39989a.f39977c : (a1) ((d0) o.f40004b.h(iVarI)).f39977c).d());
            } catch (GeneralSecurityException e10) {
                throw new aa.b(11, "Parsing parameters failed in getProto(). You probably want to call some Tink register function for " + iVarI, e10);
            }
        }
        ArrayList<va.d> arrayList = new ArrayList();
        HashMap map = new HashMap();
        va.d dVar = new va.d(iVarI);
        va.e eVar = va.e.f52518a;
        dVar.f52517c = eVar;
        dVar.f52515a = true;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((va.d) it.next()).f52515a = false;
        }
        arrayList.add(dVar);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i11 = 0; i11 < arrayList.size() - 1; i11++) {
            if (((va.d) arrayList.get(i11)).f52517c == eVar && ((va.d) arrayList.get(i11 + 1)).f52517c != eVar) {
                throw new GeneralSecurityException("Entries with 'withRandomId()' may only be followed by other entries with 'withRandomId()'.");
            }
        }
        HashSet hashSet = new HashSet();
        Integer numValueOf = null;
        for (va.d dVar2 : arrayList) {
            dVar2.getClass();
            va.i iVar = dVar2.f52516b;
            va.e eVar2 = dVar2.f52517c;
            if (eVar2 == null) {
                throw new GeneralSecurityException("No ID was set (with withFixedId or withRandomId)");
            }
            if (eVar2 == eVar) {
                int i12 = 0;
                while (true) {
                    if (i12 != 0 && !hashSet.contains(Integer.valueOf(i12))) {
                        break;
                    }
                    int i13 = eb.j0.f39995a;
                    i12 = 0;
                    while (i12 == 0) {
                        byte[] bArrA = e0.a(4);
                        i12 = (bArrA[3] & 255) | ((bArrA[0] & 255) << 24) | ((bArrA[1] & 255) << 16) | ((bArrA[2] & 255) << 8);
                    }
                }
                i10 = i12;
            } else {
                i10 = 0;
            }
            if (hashSet.contains(Integer.valueOf(i10))) {
                throw new GeneralSecurityException(defpackage.e.h(i10, "Id ", " is used twice in the keyset"));
            }
            hashSet.add(Integer.valueOf(i10));
            i0 i0VarB = eb.k.f39996b.b(iVar, iVar.a() ? Integer.valueOf(i10) : null);
            Object obj = va.c.f52510c;
            if (obj.equals(obj)) {
                y0Var = y0.ENABLED;
            } else if (va.c.f52511d.equals(obj)) {
                y0Var = y0.DISABLED;
            } else {
                if (!va.c.f52512e.equals(obj)) {
                    throw new IllegalStateException("Unknown key status");
                }
                y0Var = y0.DESTROYED;
            }
            va.f fVar = new va.f(i0VarB, y0Var, i10, dVar2.f52515a, false);
            int i14 = i10;
            if (dVar2.f52515a) {
                if (numValueOf != null) {
                    throw new GeneralSecurityException("Two primaries were set");
                }
                numValueOf = Integer.valueOf(i14);
            }
            arrayList2.add(fVar);
        }
        if (numValueOf == null) {
            throw new GeneralSecurityException("No primary was set");
        }
        m5.k kVar = new m5.k(map, arrayList2);
        if (map.get(eb.j.class) != null) {
            throw new ClassCastException();
        }
        Context context = (Context) this.f40781c;
        String str = (String) this.f40780b;
        f2 f2Var = new f2(context, str, (String) this.f40782d);
        db.b bVar = (db.b) this.f40784f;
        try {
            if (bVar != null) {
                t9.e.u(kVar, f2Var, bVar, new byte[0]);
            } else if (!((SharedPreferences.Editor) f2Var.f39409b).putString(str, a.a.m(kVar.u().d())).commit()) {
                throw new IOException("Failed to write to SharedPreferences");
            }
            return new va.c((c1) kVar.u().x(), 3);
        } catch (IOException e11) {
            throw new GeneralSecurityException(e11);
        }
    }

    @Override // rl.k
    public void p(yl.f fVar, Object obj) {
        ((HashMap) this.f40781c).put(fVar, com.google.android.gms.internal.consent_sdk.x.a((com.google.android.gms.internal.consent_sdk.x) this.f40780b, fVar, obj));
    }

    public File r(String str, String str2) {
        File file = new File((File) this.f40783e, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public File s() {
        Context context = (Activity) this.f40781c;
        if (context == null) {
            context = (Context) this.f40780b;
        }
        return new File(context.getCacheDir(), "share_plus");
    }

    @Override // rl.k
    public void u(yl.f fVar, dm.f fVar2) {
        ((HashMap) this.f40781c).put(fVar, new dm.s(new dm.q(fVar2)));
    }

    public boolean v(vf.c cVar) {
        wf.f fVar = (wf.f) this.f40780b;
        if (!fVar.k(cVar)) {
            return false;
        }
        wf.e eVar = (wf.e) this.f40784f;
        eVar.getClass();
        wf.g gVar = (wf.g) eg.a.a(eVar, cVar);
        if (gVar != null) {
            List list = (List) eg.a.a(fVar, cVar);
            if (list == null) {
                return false;
            }
            int iP = xj.o.P(list);
            cg.p pVar = gVar.f53199d;
            if (pVar != null && (pVar instanceof cg.l) && gVar.f53197b >= iP) {
                return false;
            }
        }
        return true;
    }

    @Override // rl.k
    public void w(yl.f fVar, yl.b bVar, yl.f fVar2) {
        ((HashMap) this.f40781c).put(fVar, new dm.i(bVar, fVar2));
    }

    public wf.g x(vf.c cVar) {
        vf.c cVar2;
        wf.e eVar = (wf.e) this.f40784f;
        wf.e eVar2 = (wf.e) this.f40785g;
        int iIntValue = ((Number) eVar2.l(cVar)).intValue();
        int iIntValue2 = ((Number) ((wf.e) this.f40786h).l(cVar)).intValue();
        if (iIntValue2 < iIntValue) {
            throw new IllegalStateException(("Requested index " + iIntValue2 + " smaller than " + iIntValue + ".").toString());
        }
        if (iIntValue2 <= iIntValue) {
            cg.p pVar = ((wf.g) eVar.l(cVar)).f53199d;
            if (pVar == null || !(pVar instanceof cg.l)) {
                return (wf.g) eVar.l(cVar);
            }
            m((wf.g) eVar.l(cVar));
            return x(cVar);
        }
        u uVar = (u) this.f40781c;
        wf.e eVar3 = (wf.e) uVar.f54882e;
        wf.f fVar = (wf.f) this.f40780b;
        jg.b bVar = (jg.b) xj.n.r0(iIntValue2, fVar.l(cVar));
        if (bVar == null) {
            return null;
        }
        ((ec.a) this.f40783e).a("tryCreateSegment(" + cVar + ", " + iIntValue2 + "): created!");
        if (eVar3.k(cVar)) {
            bVar.b(cVar);
            int iOrdinal = cVar.ordinal();
            if (iOrdinal == 0) {
                cVar2 = vf.c.VIDEO;
            } else {
                if (iOrdinal != 1) {
                    throw new aa.b((byte) 0, 20);
                }
                cVar2 = vf.c.AUDIO;
            }
            if (eVar3.k(cVar2)) {
                List listH = fVar.l(cVar2);
                if (!(listH instanceof Collection) || !listH.isEmpty()) {
                    Iterator it = listH.iterator();
                    while (it.hasNext()) {
                        if (((jg.b) it.next()) == bVar) {
                            bVar.b(cVar2);
                            break;
                        }
                    }
                }
            }
        }
        eVar2.b(cVar, Integer.valueOf(iIntValue2));
        wf.g gVar = new wf.g(cVar, iIntValue2, (cg.e) ((dg.c) this.f40782d).a(cVar, Integer.valueOf(iIntValue2), Integer.valueOf(fVar.l(cVar).size()), ((wf.e) uVar.f54880c).l(cVar), ((wf.e) uVar.f54881d).l(cVar)));
        eVar.b(cVar, gVar);
        return gVar;
    }

    public void y(Throwable th2, Thread thread, String str, bc.c cVar, boolean z10) {
        boolean zEquals = str.equals("crash");
        zb.s sVar = (zb.s) this.f40780b;
        long j10 = cVar.f5541b;
        Context context = sVar.f54753a;
        int i10 = context.getResources().getConfiguration().orientation;
        d0 d0Var = sVar.f54756d;
        Stack stack = new Stack();
        for (Throwable cause = th2; cause != null; cause = cause.getCause()) {
            stack.push(cause);
        }
        u uVar = null;
        while (!stack.isEmpty()) {
            Throwable th3 = (Throwable) stack.pop();
            uVar = new u(th3.getLocalizedMessage(), th3.getClass().getName(), d0Var.j0(th3.getStackTrace()), uVar, 7);
        }
        u uVar2 = uVar;
        s0 s0Var = new s0();
        s0Var.f6270b = str;
        s0Var.f6269a = j10;
        s0Var.f6275g = (byte) (s0Var.f6275g | 1);
        j2 j2VarB = wb.d.f53150a.b(context);
        int i11 = ((e1) j2VarB).f6070c;
        Boolean boolValueOf = i11 > 0 ? Boolean.valueOf(i11 != 100) : null;
        ArrayList arrayListA = wb.d.a(context);
        byte b10 = (byte) 1;
        ArrayList arrayList = new ArrayList();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) uVar2.f54881d;
        String name = thread.getName();
        if (name == null) {
            throw new NullPointerException("Null name");
        }
        byte b11 = (byte) 1;
        List listD = zb.s.d(stackTraceElementArr, 4);
        if (listD == null) {
            throw new NullPointerException("Null frames");
        }
        if (b11 != 1) {
            StringBuilder sb2 = new StringBuilder();
            if (b11 == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException(wi.d.j(sb2, "Missing required properties:"));
        }
        arrayList.add(new cc.a1(4, name, listD));
        if (z10) {
            Iterator<Map.Entry<Thread, StackTraceElement[]>> it = Thread.getAllStackTraces().entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Thread, StackTraceElement[]> next = it.next();
                Thread key = next.getKey();
                if (!key.equals(thread)) {
                    StackTraceElement[] stackTraceElementArrJ0 = d0Var.j0(next.getValue());
                    String name2 = key.getName();
                    if (name2 == null) {
                        throw new NullPointerException("Null name");
                    }
                    List listD2 = zb.s.d(stackTraceElementArrJ0, 0);
                    if (listD2 == null) {
                        throw new NullPointerException("Null frames");
                    }
                    if (b11 != 1) {
                        byte b12 = b11;
                        StringBuilder sb3 = new StringBuilder();
                        if (b12 == 0) {
                            sb3.append(" importance");
                        }
                        throw new IllegalStateException(wi.d.j(sb3, "Missing required properties:"));
                    }
                    arrayList.add(new cc.a1(0, name2, listD2));
                }
                it = it;
                b11 = b11;
            }
        }
        List listUnmodifiableList = Collections.unmodifiableList(arrayList);
        cc.y0 y0VarC = zb.s.c(uVar2, 0);
        z0 z0VarE = zb.s.e();
        List listA = sVar.a();
        if (listA == null) {
            throw new NullPointerException("Null binaries");
        }
        w0 w0Var = new w0(listUnmodifiableList, y0VarC, null, null, z0VarE, listA);
        if (b10 != 1) {
            StringBuilder sb4 = new StringBuilder();
            if (b10 == 0) {
                sb4.append(" uiOrientation");
            }
            throw new IllegalStateException(wi.d.j(sb4, "Missing required properties:"));
        }
        s0Var.f6271c = new v0(w0Var, null, null, boolValueOf, j2VarB, arrayListA, i10);
        s0Var.f6272d = sVar.b(i10);
        t0 t0VarA = s0Var.a();
        Map map = cVar.f5542c;
        bc.f fVar = (bc.f) this.f40783e;
        f fVar2 = (f) this.f40784f;
        q2 q2VarF = f(c(t0VarA, fVar, fVar2, map), fVar2);
        if (z10) {
            ((d) this.f40781c).e(q2VarF, cVar.f5540a, zEquals);
        } else {
            ((g) this.f40786h).f3463b.a(new v(this, q2VarF, cVar, zEquals, 10));
        }
    }

    @Override // rl.k
    public k z(yl.b bVar, yl.f fVar) {
        ArrayList arrayList = new ArrayList();
        return new nf(((com.google.android.gms.internal.consent_sdk.x) this.f40780b).p(bVar, j0.C9, arrayList), this, fVar, arrayList);
    }

    @Override // com.google.android.gms.internal.consent_sdk.l7
    public Object zzb() {
        Application application = (Application) ((l7) this.f40780b).zzb();
        return new m(application, (com.google.android.gms.internal.consent_sdk.u) ((j7) this.f40782d).zzb(), (com.google.android.gms.internal.consent_sdk.h) ((l7) this.f40783e).zzb(), (com.google.android.gms.internal.consent_sdk.r) ((g6) this.f40784f).f23023b, (com.google.android.gms.internal.consent_sdk.p) this.f40785g, (com.google.android.gms.internal.consent_sdk.c0) ((l7) this.f40786h).zzb());
    }

    public f(wf.f fVar, u uVar, dg.c cVar) {
        this.f40779a = 12;
        this.f40780b = fVar;
        this.f40781c = uVar;
        this.f40782d = cVar;
        this.f40783e = new ec.a("Segments");
        this.f40784f = new wf.e((Object) null, (Object) null);
        this.f40785g = new wf.e((Object) (-1), (Object) (-1));
        this.f40786h = new wf.e((Object) 0, (Object) 0);
    }

    public f(wf.f fVar, u uVar, wf.e current) {
        this.f40779a = 11;
        n.f(current, "current");
        this.f40780b = fVar;
        this.f40781c = uVar;
        this.f40782d = current;
        this.f40783e = new ec.a("Codecs");
        this.f40784f = new wf.d(this);
        this.f40785g = new wf.e(this, 0);
        this.f40786h = new wf.e(this, 1);
    }

    public f(Context context, hi.b manager) {
        this.f40779a = 6;
        n.f(context, "context");
        n.f(manager, "manager");
        this.f40780b = context;
        this.f40781c = null;
        this.f40782d = manager;
        z1 z1VarE = cn.d0.e();
        jn.e eVar = n0.f6748a;
        this.f40783e = cn.d0.b(com.google.android.gms.internal.auth.i.D(z1VarE, hn.o.f42451a.f38972d));
        this.f40784f = jn.d.f44017b.s(1);
        this.f40785g = r9.b.u(new f.q(this, 2));
        this.f40786h = r9.b.u(new defpackage.c(9));
    }

    public f(Context context) {
        String string;
        String strReplaceAll;
        this.f40779a = 0;
        String str = ((e1) wb.d.f53150a.b(context)).f6068a;
        this.f40780b = str;
        File filesDir = context.getFilesDir();
        this.f40781c = filesDir;
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            if (str.length() > 40) {
                strReplaceAll = zb.f.i(str);
            } else {
                strReplaceAll = str.replaceAll("[^a-zA-Z0-9.]", "_");
            }
            sb2.append(strReplaceAll);
            string = sb2.toString();
        } else {
            string = ".com.google.firebase.crashlytics.files.v1";
        }
        File file = new File(filesDir, string);
        A(file);
        this.f40782d = file;
        File file2 = new File(file, "open-sessions");
        A(file2);
        this.f40783e = file2;
        File file3 = new File(file, "reports");
        A(file3);
        this.f40784f = file3;
        File file4 = new File(file, "priority-reports");
        A(file4);
        this.f40785g = file4;
        File file5 = new File(file, "native-reports");
        A(file5);
        this.f40786h = file5;
    }

    public f(String str, f fVar, g gVar) {
        this.f40779a = 1;
        this.f40783e = new s(this, false);
        this.f40784f = new s(this, true);
        this.f40785g = new q(0);
        this.f40786h = new AtomicMarkableReference(null, false);
        this.f40780b = str;
        this.f40781c = new bc.h(fVar);
        this.f40782d = gVar;
    }

    public f(com.google.android.gms.internal.consent_sdk.x xVar, zk.e eVar, yl.b bVar, List list, j0 j0Var) {
        this.f40779a = 9;
        this.f40782d = xVar;
        this.f40783e = eVar;
        this.f40784f = bVar;
        this.f40785g = list;
        this.f40786h = j0Var;
        this.f40780b = xVar;
        this.f40781c = new HashMap();
    }

    public f(int i10) {
        this.f40779a = i10;
        switch (i10) {
            case 7:
                break;
            default:
                this.f40781c = null;
                this.f40780b = null;
                this.f40782d = null;
                this.f40783e = null;
                this.f40784f = null;
                this.f40785g = null;
                break;
        }
    }

    public f(j6.e eVar, j6.e eVar2, j6.e eVar3, j6.e eVar4, g6.m mVar, g6.m mVar2) {
        this.f40779a = 5;
        this.f40786h = b7.d.a(150, new n5.f(this, 12));
        this.f40780b = eVar;
        this.f40781c = eVar2;
        this.f40782d = eVar3;
        this.f40783e = eVar4;
        this.f40784f = mVar;
        this.f40785g = mVar2;
    }

    public f(Activity activity, androidx.lifecycle.o oVar) {
        this.f40779a = 8;
        this.f40782d = new HashSet();
        this.f40783e = new HashSet();
        this.f40784f = new HashSet();
        this.f40785g = new HashSet();
        new HashSet();
        this.f40786h = new HashSet();
        this.f40780b = activity;
        this.f40781c = new HiddenLifecycleReference(oVar);
    }
}
