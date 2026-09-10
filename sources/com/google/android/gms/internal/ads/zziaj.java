package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zziaj {
    public static zziab zzb(Class cls) {
        ClassLoader classLoader = zziaj.class.getClassLoader();
        if (cls.equals(zziab.class)) {
            try {
                try {
                    return (zziab) cls.cast(((zziaj) Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).zza());
                } catch (ReflectiveOperationException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(zziaj.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                arrayList.add((zziab) cls.cast(((zziaj) it.next()).zza()));
            } catch (ServiceConfigurationError e3) {
                Logger.getLogger(zzhzw.class.getName()).logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat(cls.getSimpleName()), (Throwable) e3);
            }
        }
        if (arrayList.size() == 1) {
            return (zziab) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (zziab) cls.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    public abstract zziab zza();
}
