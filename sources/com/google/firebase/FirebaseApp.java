package com.google.firebase;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Log;
import androidx.collection.ArrayMap;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.events.Publisher;
import com.google.firebase.heartbeatinfo.DefaultHeartBeatController;
import com.google.firebase.inject.Provider;
import com.google.firebase.internal.DataCollectionConfigStorage;
import com.google.firebase.provider.FirebaseInitProvider;
import com.google.firebase.tracing.ComponentMonitor;
import com.thinkup.core.common.n.mo;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseApp {
    public static final Object k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ArrayMap f20144l = new ArrayMap(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseOptions f20147c;
    public final ComponentRuntime d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f20148e;
    public final AtomicBoolean f;
    public final Lazy g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Provider f20149h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList f20150i;
    public final CopyOnWriteArrayList j;

    public interface BackgroundStateChangeListener {
        void onBackgroundStateChanged(boolean z2);
    }

    public static class GlobalBackgroundStateListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference f20151a = new AtomicReference();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z2) {
            synchronized (FirebaseApp.k) {
                try {
                    for (FirebaseApp firebaseApp : new ArrayList(FirebaseApp.f20144l.values())) {
                        if (firebaseApp.f20148e.get()) {
                            Log.d("FirebaseApp", "Notifying background state change listeners.");
                            Iterator it = firebaseApp.f20150i.iterator();
                            while (it.hasNext()) {
                                ((BackgroundStateChangeListener) it.next()).onBackgroundStateChanged(z2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static class UserUnlockReceiver extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final AtomicReference f20152b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f20153a;

        public UserUnlockReceiver(Context context) {
            this.f20153a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (FirebaseApp.k) {
                try {
                    Iterator it = FirebaseApp.f20144l.values().iterator();
                    while (it.hasNext()) {
                        ((FirebaseApp) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f20153a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    public FirebaseApp(final Context context, FirebaseOptions firebaseOptions, String str) {
        ?? arrayList;
        final int i2 = 1;
        final int i3 = 0;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.f20148e = atomicBoolean;
        this.f = new AtomicBoolean();
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.f20150i = copyOnWriteArrayList;
        this.j = new CopyOnWriteArrayList();
        this.f20145a = (Context) Preconditions.checkNotNull(context);
        this.f20146b = Preconditions.checkNotEmpty(str);
        this.f20147c = (FirebaseOptions) Preconditions.checkNotNull(firebaseOptions);
        StartupTime startupTime = FirebaseInitProvider.X;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ComponentDiscovery componentDiscoveryA = ComponentDiscovery.a(context);
        ArrayList arrayList2 = new ArrayList();
        Context context2 = componentDiscoveryA.f20206a;
        Bundle bundle = null;
        try {
            PackageManager packageManager = context2.getPackageManager();
            if (packageManager == null) {
                Log.w("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context2, (Class<?>) ComponentDiscoveryService.class), 128);
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
        for (final String str3 : arrayList) {
            arrayList2.add(new Provider() { // from class: com.google.firebase.components.a
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    switch (i3) {
                        case 0:
                            String str4 = (String) str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                            } catch (ClassNotFoundException unused2) {
                                Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                                return null;
                            } catch (IllegalAccessException e2) {
                                throw new InvalidRegistrarException(android.support.v4.media.a.n("Could not instantiate ", str4, mo.ono), e2);
                            } catch (InstantiationException e3) {
                                throw new InvalidRegistrarException(android.support.v4.media.a.n("Could not instantiate ", str4, mo.ono), e3);
                            } catch (NoSuchMethodException e4) {
                                throw new InvalidRegistrarException(android.support.v4.media.a.C("Could not instantiate ", str4), e4);
                            } catch (InvocationTargetException e5) {
                                throw new InvalidRegistrarException(android.support.v4.media.a.C("Could not instantiate ", str4), e5);
                            }
                        default:
                            return (ComponentRegistrar) str3;
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        UiExecutor uiExecutor = UiExecutor.X;
        ComponentRuntime.Builder builder = new ComponentRuntime.Builder();
        ArrayList arrayList3 = builder.f20213b;
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new Provider() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i2) {
                    case 0:
                        String str4 = (String) firebaseCommonRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            }
                            throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e2) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.n("Could not instantiate ", str4, mo.ono), e2);
                        } catch (InstantiationException e3) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.n("Could not instantiate ", str4, mo.ono), e3);
                        } catch (NoSuchMethodException e4) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.C("Could not instantiate ", str4), e4);
                        } catch (InvocationTargetException e5) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.C("Could not instantiate ", str4), e5);
                        }
                    default:
                        return (ComponentRegistrar) firebaseCommonRegistrar;
                }
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new Provider() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                switch (i2) {
                    case 0:
                        String str4 = (String) executorsRegistrar;
                        try {
                            Class<?> cls = Class.forName(str4);
                            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                            }
                            throw new InvalidRegistrarException("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                        } catch (ClassNotFoundException unused2) {
                            Log.w("ComponentDiscovery", "Class " + str4 + " is not an found.");
                            return null;
                        } catch (IllegalAccessException e2) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.n("Could not instantiate ", str4, mo.ono), e2);
                        } catch (InstantiationException e3) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.n("Could not instantiate ", str4, mo.ono), e3);
                        } catch (NoSuchMethodException e4) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.C("Could not instantiate ", str4), e4);
                        } catch (InvocationTargetException e5) {
                            throw new InvalidRegistrarException(android.support.v4.media.a.C("Could not instantiate ", str4), e5);
                        }
                    default:
                        return (ComponentRegistrar) executorsRegistrar;
                }
            }
        });
        Component componentC = Component.c(context, Context.class, new Class[0]);
        ArrayList arrayList4 = builder.f20214c;
        arrayList4.add(componentC);
        arrayList4.add(Component.c(this, FirebaseApp.class, new Class[0]));
        arrayList4.add(Component.c(firebaseOptions, FirebaseOptions.class, new Class[0]));
        builder.d = new ComponentMonitor();
        if (UserManagerCompat.a(context) && FirebaseInitProvider.f20909Y.get()) {
            arrayList4.add(Component.c(startupTime, StartupTime.class, new Class[0]));
        }
        ComponentRuntime componentRuntime = new ComponentRuntime(builder.f20212a, arrayList3, arrayList4, builder.d);
        this.d = componentRuntime;
        Trace.endSection();
        this.g = new Lazy(new Provider() { // from class: com.google.firebase.a
            @Override // com.google.firebase.inject.Provider
            public final Object get() {
                Object obj = FirebaseApp.k;
                FirebaseApp firebaseApp = this.f20161a;
                return new DataCollectionConfigStorage(context, firebaseApp.d(), (Publisher) firebaseApp.d.a(Publisher.class));
            }
        });
        this.f20149h = componentRuntime.g(DefaultHeartBeatController.class);
        BackgroundStateChangeListener backgroundStateChangeListener = new BackgroundStateChangeListener() { // from class: com.google.firebase.b
            @Override // com.google.firebase.FirebaseApp.BackgroundStateChangeListener
            public final void onBackgroundStateChanged(boolean z2) {
                FirebaseApp firebaseApp = this.f20197a;
                if (!z2) {
                    ((DefaultHeartBeatController) firebaseApp.f20149h.get()).b();
                } else {
                    Object obj = FirebaseApp.k;
                    firebaseApp.getClass();
                }
            }
        };
        a();
        if (atomicBoolean.get() && BackgroundDetector.getInstance().isInBackground()) {
            backgroundStateChangeListener.onBackgroundStateChanged(true);
        }
        copyOnWriteArrayList.add(backgroundStateChangeListener);
        Trace.endSection();
    }

    public static ArrayList b() {
        ArrayList arrayList = new ArrayList();
        synchronized (k) {
            try {
                for (FirebaseApp firebaseApp : f20144l.values()) {
                    firebaseApp.a();
                    arrayList.add(firebaseApp.f20146b);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static FirebaseApp c() {
        FirebaseApp firebaseApp;
        synchronized (k) {
            try {
                firebaseApp = (FirebaseApp) f20144l.get("[DEFAULT]");
                if (firebaseApp == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((DefaultHeartBeatController) firebaseApp.f20149h.get()).b();
            } catch (Throwable th) {
                throw th;
            }
        }
        return firebaseApp;
    }

    public static FirebaseApp f(Context context) {
        synchronized (k) {
            try {
                if (f20144l.containsKey("[DEFAULT]")) {
                    return c();
                }
                FirebaseOptions firebaseOptionsA = FirebaseOptions.a(context);
                if (firebaseOptionsA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return g(context, firebaseOptionsA, "[DEFAULT]");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static FirebaseApp g(Context context, FirebaseOptions firebaseOptions, String str) {
        FirebaseApp firebaseApp;
        AtomicReference atomicReference = GlobalBackgroundStateListener.f20151a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference atomicReference2 = GlobalBackgroundStateListener.f20151a;
            if (atomicReference2.get() == null) {
                GlobalBackgroundStateListener globalBackgroundStateListener = new GlobalBackgroundStateListener();
                do {
                    if (atomicReference2.compareAndSet(null, globalBackgroundStateListener)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(globalBackgroundStateListener);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (k) {
            ArrayMap arrayMap = f20144l;
            Preconditions.checkState(!arrayMap.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            firebaseApp = new FirebaseApp(context, firebaseOptions, strTrim);
            arrayMap.put(strTrim, firebaseApp);
        }
        firebaseApp.e();
        return firebaseApp;
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f20146b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f20147c.f20155b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!UserManagerCompat.a(this.f20145a)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            a();
            sb.append(this.f20146b);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f20145a;
            AtomicReference atomicReference = UserUnlockReceiver.f20152b;
            if (atomicReference.get() == null) {
                UserUnlockReceiver userUnlockReceiver = new UserUnlockReceiver(context);
                while (!atomicReference.compareAndSet(null, userUnlockReceiver)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(userUnlockReceiver, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        a();
        sb2.append(this.f20146b);
        Log.i("FirebaseApp", sb2.toString());
        ComponentRuntime componentRuntime = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.f20146b);
        AtomicReference atomicReference2 = componentRuntime.f;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                ((DefaultHeartBeatController) this.f20149h.get()).b();
            }
        }
        synchronized (componentRuntime) {
            map = new HashMap(componentRuntime.f20208a);
        }
        componentRuntime.j(map, zEquals);
        ((DefaultHeartBeatController) this.f20149h.get()).b();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof FirebaseApp)) {
            return false;
        }
        FirebaseApp firebaseApp = (FirebaseApp) obj;
        firebaseApp.a();
        return this.f20146b.equals(firebaseApp.f20146b);
    }

    public final int hashCode() {
        return this.f20146b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f20146b).add("options", this.f20147c).toString();
    }
}
