package m4;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.google.android.gms.internal.auth.o;
import com.storage.androidcleaner.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f45864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f45865e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f45868c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet f45867b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f45866a = new HashMap();

    public a(Context context) {
        this.f45868c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f45864d == null) {
            synchronized (f45865e) {
                try {
                    if (f45864d == null) {
                        f45864d = new a(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f45864d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f45868c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f45867b;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e10) {
                throw new aa.b(e10, 14);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object objCreate;
        HashMap map = this.f45866a;
        if (n4.a.a()) {
            try {
                Trace.beginSection(o.z(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listDependencies = bVar.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                objCreate = bVar.create(this.f45868c);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th3) {
                throw new aa.b(th3, 14);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
