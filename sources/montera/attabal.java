package montera;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: AppInitializer.java */
/* JADX INFO: loaded from: classes.dex */
public final class attabal {

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public static final Object f33608marial = new Object();

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public static volatile attabal f33609wireman;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Context f33611dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final Set<Class<? extends saneness<?>>> f33612saneness = new HashSet();

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Map<Class<?>, Object> f33610attabal = new HashMap();

    public attabal(Context context) {
        this.f33611dern = context.getApplicationContext();
    }

    public static attabal marial(Context context) {
        if (f33609wireman == null) {
            synchronized (f33608marial) {
                try {
                    if (f33609wireman == null) {
                        f33609wireman = new attabal(context);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f33609wireman;
    }

    public void attabal() {
        try {
            try {
                ferrovanadium.attabal.attabal("Startup");
                saneness(this.f33611dern.getPackageManager().getProviderInfo(new ComponentName(this.f33611dern.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
                ferrovanadium.attabal.saneness();
            } catch (PackageManager.NameNotFoundException e) {
                throw new StartupException(e);
            }
        } catch (Throwable th) {
            ferrovanadium.attabal.saneness();
            throw th;
        }
    }

    public <T> T beachfront(Class<? extends saneness<T>> cls) {
        return (T) dern(cls);
    }

    public boolean competently(Class<? extends saneness<?>> cls) {
        return this.f33612saneness.contains(cls);
    }

    public <T> T dern(Class<? extends saneness<?>> cls) {
        T t;
        synchronized (f33608marial) {
            try {
                t = (T) this.f33610attabal.get(cls);
                if (t == null) {
                    t = (T) wireman(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return t;
    }

    public void saneness(Bundle bundle) {
        String string = this.f33611dern.getString(dern.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (saneness.class.isAssignableFrom(cls)) {
                            this.f33612saneness.add((Class<? extends saneness<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends saneness<?>>> it = this.f33612saneness.iterator();
                while (it.hasNext()) {
                    wireman(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    public final <T> T wireman(Class<? extends saneness<?>> cls, Set<Class<?>> set) {
        T t;
        if (ferrovanadium.attabal.wireman()) {
            try {
                ferrovanadium.attabal.attabal(cls.getSimpleName());
            } catch (Throwable th) {
                ferrovanadium.attabal.saneness();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f33610attabal.containsKey(cls)) {
            t = (T) this.f33610attabal.get(cls);
        } else {
            set.add(cls);
            try {
                saneness<?> sanenessVarNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                List<Class<? extends saneness<?>>> listDependencies = sanenessVarNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends saneness<?>> cls2 : listDependencies) {
                        if (!this.f33610attabal.containsKey(cls2)) {
                            wireman(cls2, set);
                        }
                    }
                }
                t = (T) sanenessVarNewInstance.create(this.f33611dern);
                set.remove(cls);
                this.f33610attabal.put(cls, t);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        ferrovanadium.attabal.saneness();
        return t;
    }
}
