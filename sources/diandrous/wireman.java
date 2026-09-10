package diandrous;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: ManifestParser.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final Context f25239attabal;

    public wireman(Context context) {
        this.f25239attabal = context;
    }

    public static saneness dern(String str) {
        try {
            Class<?> cls = Class.forName(str);
            Object objNewInstance = null;
            try {
                objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
            } catch (IllegalAccessException e) {
                wireman(cls, e);
            } catch (InstantiationException e2) {
                wireman(cls, e2);
            } catch (NoSuchMethodException e3) {
                wireman(cls, e3);
            } catch (InvocationTargetException e4) {
                wireman(cls, e4);
            }
            if (objNewInstance instanceof saneness) {
                return (saneness) objNewInstance;
            }
            throw new RuntimeException("Expected instanceof GlideModule, but found: " + objNewInstance);
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    public static void wireman(Class<?> cls, Exception exc) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + cls, exc);
    }

    public final ApplicationInfo attabal() throws PackageManager.NameNotFoundException {
        return this.f25239attabal.getPackageManager().getApplicationInfo(this.f25239attabal.getPackageName(), 128);
    }

    public List<saneness> saneness() {
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfoAttabal = attabal();
            if (applicationInfoAttabal != null && applicationInfoAttabal.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfoAttabal.metaData);
                }
                for (String str : applicationInfoAttabal.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfoAttabal.metaData.get(str))) {
                        arrayList.add(dern(str));
                        Log.isLoggable("ManifestParser", 3);
                    }
                }
                Log.isLoggable("ManifestParser", 3);
                return arrayList;
            }
            Log.isLoggable("ManifestParser", 3);
            return arrayList;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
            return arrayList;
        }
    }
}
