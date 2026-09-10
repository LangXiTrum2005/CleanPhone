package saneness;

import ads_mobile_sdk.mr;
import ads_mobile_sdk.vf0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public abstract class riometer {
    public static vf0 attabal() {
        ClassLoader classLoader = riometer.class.getClassLoader();
        if (vf0.class.equals(vf0.class)) {
            try {
                try {
                    maluku.attabal(Class.forName("com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader", true, classLoader).getConstructor(null).newInstance(null));
                    throw null;
                } catch (ReflectiveOperationException e) {
                    throw new IllegalStateException(e);
                }
            } catch (ClassNotFoundException unused) {
            }
        }
        Iterator it = ServiceLoader.load(riometer.class, classLoader).iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            try {
                maluku.attabal(it.next());
                throw null;
            } catch (ServiceConfigurationError e2) {
                Logger.getLogger(mr.class.getName()).log(Level.SEVERE, "Unable to load " + vf0.class.getSimpleName(), (Throwable) e2);
            }
        }
        if (arrayList.size() == 1) {
            return (vf0) arrayList.get(0);
        }
        if (arrayList.size() == 0) {
            return null;
        }
        try {
            return (vf0) vf0.class.getMethod("combine", Collection.class).invoke(null, arrayList);
        } catch (ReflectiveOperationException e3) {
            throw new IllegalStateException(e3);
        }
    }
}
