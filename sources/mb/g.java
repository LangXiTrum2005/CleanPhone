package mb;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.os.UserManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import eb.d0;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import k9.c0;
import tb.l;
import ud.n;
import ud.w0;
import v1.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Object f45927k = new Object();
    public static final x.e l = new x.e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f45928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f45930c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tb.e f45931d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l f45934g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tc.b f45935h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f45932e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f45933f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f45936i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArrayList f45937j = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public g(Context context, String str, i iVar) {
        ?? arrayList;
        int i10 = 0;
        this.f45928a = context;
        c0.e(str);
        this.f45929b = str;
        this.f45930c = iVar;
        a aVar = FirebaseInitProvider.f24725a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new tb.c((String) it.next(), i10));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        ub.l lVar = ub.l.f51976a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i11 = 1;
        arrayList3.add(new tb.c(new FirebaseCommonRegistrar(), i11));
        arrayList3.add(new tb.c(new ExecutorsRegistrar(), i11));
        arrayList4.add(tb.a.c(context, Context.class, new Class[0]));
        arrayList4.add(tb.a.c(this, g.class, new Class[0]));
        arrayList4.add(tb.a.c(iVar, i.class, new Class[0]));
        j jVar = new j(14);
        if (((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked() && FirebaseInitProvider.f24726b.get()) {
            arrayList4.add(tb.a.c(aVar, a.class, new Class[0]));
        }
        tb.e eVar = new tb.e(arrayList3, arrayList4, jVar);
        this.f45931d = eVar;
        Trace.endSection();
        this.f45934g = new l(new c(i10, this, context));
        this.f45935h = eVar.d(rc.c.class);
        d dVar = new d(this);
        a();
        if (this.f45932e.get()) {
            com.google.android.gms.common.api.internal.c.f11675e.f11676a.get();
        }
        this.f45936i.add(dVar);
        Trace.endSection();
    }

    public static ArrayList d() {
        ArrayList arrayList = new ArrayList();
        synchronized (f45927k) {
            try {
                for (g gVar : (x.d) l.values()) {
                    gVar.a();
                    arrayList.add(gVar.f45929b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static g e() {
        g gVar;
        synchronized (f45927k) {
            try {
                gVar = (g) l.get("[DEFAULT]");
                if (gVar == null) {
                    StringBuilder sb2 = new StringBuilder("Default FirebaseApp is not initialized in this process ");
                    if (p9.c.f48287i == null) {
                        p9.c.f48287i = Application.getProcessName();
                    }
                    sb2.append(p9.c.f48287i);
                    sb2.append(". Make sure to call FirebaseApp.initializeApp(Context) first.");
                    throw new IllegalStateException(sb2.toString());
                }
                ((rc.c) gVar.f45935h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g f(String str) {
        g gVar;
        String str2;
        synchronized (f45927k) {
            try {
                gVar = (g) l.get(str.trim());
                if (gVar == null) {
                    ArrayList arrayListD = d();
                    if (arrayListD.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", arrayListD);
                    }
                    throw new IllegalStateException("FirebaseApp with name " + str + " doesn't exist. " + str2);
                }
                ((rc.c) gVar.f45935h.get()).b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return gVar;
    }

    public static g i(Context context) {
        synchronized (f45927k) {
            try {
                if (l.containsKey("[DEFAULT]")) {
                    return e();
                }
                i iVarA = i.a(context);
                if (iVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return j(context, "[DEFAULT]", iVarA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static g j(Context context, String str, i iVar) {
        g gVar;
        AtomicReference atomicReference = e.f45924a;
        if (context.getApplicationContext() instanceof Application) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = e.f45924a;
            if (atomicReference2.get() == null) {
                e eVar = new e();
                do {
                    if (atomicReference2.compareAndSet(null, eVar)) {
                        com.google.android.gms.common.api.internal.c.b(application);
                        com.google.android.gms.common.api.internal.c.f11675e.a(eVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f45927k) {
            x.e eVar2 = l;
            c0.j("FirebaseApp name " + strTrim + " already exists!", !eVar2.containsKey(strTrim));
            c0.i(context, "Application context cannot be null.");
            gVar = new g(context, strTrim, iVar);
            eVar2.put(strTrim, gVar);
        }
        gVar.h();
        return gVar;
    }

    public final void a() {
        c0.j("FirebaseApp was deleted", !this.f45933f.get());
    }

    public final void b() {
        if (this.f45933f.compareAndSet(false, true)) {
            synchronized (f45927k) {
                l.remove(this.f45929b);
            }
            Iterator it = this.f45937j.iterator();
            while (it.hasNext()) {
                w0 w0Var = ((n) it.next()).f52127a;
                Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will stop collecting data.");
                w0Var.f52178b = false;
            }
        }
    }

    public final Object c(Class cls) {
        a();
        return this.f45931d.a(cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        gVar.a();
        return this.f45929b.equals(gVar.f45929b);
    }

    public final String g() {
        StringBuilder sb2 = new StringBuilder();
        a();
        byte[] bytes = this.f45929b.getBytes(Charset.defaultCharset());
        sb2.append(bytes == null ? null : Base64.encodeToString(bytes, 11));
        sb2.append("+");
        a();
        byte[] bytes2 = this.f45930c.f45944b.getBytes(Charset.defaultCharset());
        sb2.append(bytes2 != null ? Base64.encodeToString(bytes2, 11) : null);
        return sb2.toString();
    }

    public final void h() {
        HashMap map;
        if (!((UserManager) this.f45928a.getSystemService(UserManager.class)).isUserUnlocked()) {
            StringBuilder sb2 = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb2.append(this.f45929b);
            Log.i("FirebaseApp", sb2.toString());
            Context context = this.f45928a;
            AtomicReference atomicReference = f.f45925b;
            if (atomicReference.get() == null) {
                f fVar = new f(context);
                while (!atomicReference.compareAndSet(null, fVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(fVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb3.append(this.f45929b);
        Log.i("FirebaseApp", sb3.toString());
        tb.e eVar = this.f45931d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f45929b);
        AtomicReference atomicReference2 = eVar.f50688f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((rc.c) this.f45935h.get()).b();
            }
        }
        synchronized (eVar) {
            map = new HashMap(eVar.f50683a);
        }
        eVar.h(map, zEquals);
        ((rc.c) this.f45935h.get()).b();
    }

    public final int hashCode() {
        return this.f45929b.hashCode();
    }

    public final boolean k() {
        boolean z10;
        a();
        yc.a aVar = (yc.a) this.f45934g.get();
        synchronized (aVar) {
            z10 = aVar.f54356c;
        }
        return z10;
    }

    public final void l(boolean z10) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f45936i.iterator();
        while (it.hasNext()) {
            g gVar = ((d) it.next()).f45923a;
            if (!z10) {
                ((rc.c) gVar.f45935h.get()).b();
            }
        }
    }

    public final void m(boolean z10) {
        Boolean boolValueOf = Boolean.valueOf(z10);
        a();
        yc.a aVar = (yc.a) this.f45934g.get();
        synchronized (aVar) {
            boolean zEquals = Boolean.TRUE.equals(boolValueOf);
            aVar.f54354a.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
            synchronized (aVar) {
                if (aVar.f54356c != zEquals) {
                    aVar.f54356c = zEquals;
                    aVar.f54355b.a(new qc.a(new b(zEquals)));
                }
            }
        }
    }

    public final String toString() {
        d0 d0Var = new d0(this);
        d0Var.P0(this.f45929b, "name");
        d0Var.P0(this.f45930c, "options");
        return d0Var.toString();
    }
}
