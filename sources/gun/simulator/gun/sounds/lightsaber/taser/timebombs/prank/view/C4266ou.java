package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ou, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4266ou {
    public static final Object j = new Object();
    public static final ArrayMap k = new ArrayMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f4812a;
    public final String b;
    public final C2323Bu c;
    public final C4069mh d;
    public final C3157cH g;
    public final AW h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.ArrayList] */
    public C4266ou(Context context, C2323Bu c2323Bu, String str) {
        ?? arrayList;
        int i = 0;
        new CopyOnWriteArrayList();
        this.f4812a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.c = (C2323Bu) Preconditions.checkNotNull(c2323Bu);
        C4025m8 c4025m8 = FirebaseInitProvider.f846a;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Objects.toString(ComponentDiscoveryService.class);
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (bundle == null) {
            arrayList = Collections.emptyList();
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
            arrayList2.add(new C3631hh((String) it.next(), i));
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC3802jf0 enumC3802jf0 = EnumC3802jf0.f4563a;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        int i2 = 1;
        arrayList3.add(new C3631hh(new FirebaseCommonRegistrar(), i2));
        arrayList3.add(new C3631hh(new ExecutorsRegistrar(), i2));
        arrayList4.add(C3190ch.b(context, Context.class, new Class[0]));
        arrayList4.add(C3190ch.b(this, C4266ou.class, new Class[0]));
        arrayList4.add(C3190ch.b(c2323Bu, C2323Bu.class, new Class[0]));
        C2498In c2498In = new C2498In(5);
        if (UserManagerCompat.isUserUnlocked(context) && FirebaseInitProvider.b.get()) {
            arrayList4.add(C3190ch.b(c4025m8, C4025m8.class, new Class[0]));
        }
        C4069mh c4069mh = new C4069mh(enumC3802jf0, arrayList3, arrayList4, c2498In);
        this.d = c4069mh;
        Trace.endSection();
        this.g = new C3157cH(new C3914ku(i, this, context));
        this.h = c4069mh.c(C3379en.class);
        C4002lu c4002lu = new C4002lu(this);
        a();
        if (this.e.get()) {
            BackgroundDetector.getInstance().isInBackground();
        }
        this.i.add(c4002lu);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C4266ou b() {
        C4266ou c4266ou;
        synchronized (j) {
            try {
                c4266ou = (C4266ou) k.get("[DEFAULT]");
                if (c4266ou == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((C3379en) c4266ou.h.get()).c();
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4266ou;
    }

    public static C4266ou e(Context context, C2323Bu c2323Bu) {
        C4266ou c4266ou;
        AtomicReference atomicReference = C4090mu.f4721a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = C4090mu.f4721a;
            if (atomicReference2.get() == null) {
                C4090mu c4090mu = new C4090mu();
                do {
                    if (atomicReference2.compareAndSet(null, c4090mu)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(c4090mu);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            ArrayMap arrayMap = k;
            Preconditions.checkState(!arrayMap.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c4266ou = new C4266ou(context, c2323Bu, "[DEFAULT]");
            arrayMap.put("[DEFAULT]", c4266ou);
        }
        c4266ou.d();
        return c4266ou;
    }

    public static void f(Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    b();
                    return;
                }
                C2323Bu c2323BuA = C2323Bu.a(context);
                if (c2323BuA == null) {
                    return;
                }
                e(context, c2323BuA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final String c() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void d() {
        HashMap map;
        if (!UserManagerCompat.isUserUnlocked(this.f4812a)) {
            a();
            Context context = this.f4812a;
            AtomicReference atomicReference = C4178nu.b;
            if (atomicReference.get() == null) {
                C4178nu c4178nu = new C4178nu(context);
                while (!atomicReference.compareAndSet(null, c4178nu)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(c4178nu, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        C4069mh c4069mh = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference atomicReference2 = c4069mh.e;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((C3379en) this.h.get()).c();
            }
        }
        synchronized (c4069mh) {
            map = new HashMap(c4069mh.f4707a);
        }
        c4069mh.f(map, zEquals);
        ((C3379en) this.h.get()).c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C4266ou)) {
            return false;
        }
        C4266ou c4266ou = (C4266ou) obj;
        c4266ou.a();
        return this.b.equals(c4266ou.b);
    }

    public final boolean g() {
        boolean z;
        a();
        C3287dl c3287dl = (C3287dl) this.g.get();
        synchronized (c3287dl) {
            z = c3287dl.b;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.b).add("options", this.c).toString();
    }
}
