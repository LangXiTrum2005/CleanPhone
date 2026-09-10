package com.google.android.gms.internal.measurement;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 implements se {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final eb.d0 f23405a = new eb.d0("Phenotype.API", new com.google.android.gms.internal.auth.j2(1), new j9.d());

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static z0 c() {
        ClassLoader classLoader = e1.class.getClassLoader();
        if (z0.class.equals(z0.class)) {
            try {
                try {
                    if (Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null) == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ReflectiveOperationException e10) {
                    throw new IllegalStateException(e10);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        try {
            Iterator it = Arrays.asList(new e1[0]).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                } catch (ServiceConfigurationError e11) {
                    Logger.getLogger(x0.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(z0.class.getSimpleName()), (Throwable) e11);
                }
            }
            if (arrayList.size() == 1) {
                return (z0) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (z0) z0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (ReflectiveOperationException e12) {
                throw new IllegalStateException(e12);
            }
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }

    public static final InputStream d(re reVar) {
        bf bfVarA = reVar.f23935a.a(reVar.f23938d);
        ArrayList arrayList = new ArrayList();
        arrayList.add(bfVarA);
        ArrayList arrayList2 = reVar.f23937c;
        if (!arrayList2.isEmpty()) {
            int i10 = pe.f23859b;
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            if (it.hasNext()) {
                throw f2.j(it);
            }
            pe peVar = !arrayList3.isEmpty() ? new pe(bfVarA, arrayList3) : null;
            if (peVar != null) {
                arrayList.add(peVar);
            }
        }
        Iterator it2 = reVar.f23936b.iterator();
        if (!it2.hasNext()) {
            Collections.reverse(arrayList);
            return (InputStream) arrayList.get(0);
        }
        if (it2.next() != null) {
            throw new ClassCastException();
        }
        throw null;
    }

    public static boolean e(byte b10) {
        return b10 > -65;
    }
}
