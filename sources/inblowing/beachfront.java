package inblowing;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: ComponentDiscovery.java */
/* JADX INFO: loaded from: classes3.dex */
public final class beachfront<T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final T f28526attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final dern<T> f28527saneness;

    /* JADX INFO: compiled from: ComponentDiscovery.java */
    public interface dern<T> {
        List<String> attabal(T t);
    }

    /* JADX INFO: compiled from: ComponentDiscovery.java */
    public static class saneness implements dern<Context> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Class<? extends Service> f28528attabal;

        @Override // inblowing.beachfront.dern
        /* JADX INFO: renamed from: dern, reason: merged with bridge method [inline-methods] */
        public List<String> attabal(Context context) {
            Bundle bundleSaneness = saneness(context);
            if (bundleSaneness == null) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleSaneness.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleSaneness.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        public final Bundle saneness(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f28528attabal), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Objects.toString(this.f28528attabal);
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public saneness(Class<? extends Service> cls) {
            this.f28528attabal = cls;
        }
    }

    public beachfront(T t, dern<T> dernVar) {
        this.f28526attabal = t;
        this.f28527saneness = dernVar;
    }

    public static beachfront<Context> dern(Context context, Class<? extends Service> cls) {
        return new beachfront<>(context, new saneness(cls));
    }

    public static ComponentRegistrar wireman(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            String.format("Class %s is not an found.", str);
            return null;
        } catch (IllegalAccessException e) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e);
        } catch (InstantiationException e2) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str), e2);
        } catch (NoSuchMethodException e3) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e3);
        } catch (InvocationTargetException e4) {
            throw new InvalidRegistrarException(String.format("Could not instantiate %s", str), e4);
        }
    }

    public List<friedmanite.saneness<ComponentRegistrar>> saneness() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f28527saneness.attabal(this.f28526attabal)) {
            arrayList.add(new friedmanite.saneness() { // from class: inblowing.marial
                @Override // friedmanite.saneness
                public final Object get() {
                    return beachfront.wireman(str);
                }
            });
        }
        return arrayList;
    }
}
