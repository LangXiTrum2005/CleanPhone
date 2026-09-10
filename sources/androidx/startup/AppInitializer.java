package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import androidx.tracing.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AppInitializer {
    public static volatile AppInitializer d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f8390e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f8393c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f8392b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f8391a = new HashMap();

    public AppInitializer(Context context) {
        this.f8393c = context.getApplicationContext();
    }

    public static AppInitializer c(Context context) {
        if (d == null) {
            synchronized (f8390e) {
                try {
                    if (d == null) {
                        d = new AppInitializer(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f8393c.getString(com.charging.screenshow.battery.animations.themes.R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f8392b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        if (Trace.a()) {
            try {
                android.os.Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap map = this.f8391a;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                Initializer initializer = (Initializer) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> listDependencies = initializer.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = initializer.create(this.f8393c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        android.os.Trace.endSection();
        return objCreate;
    }
}
