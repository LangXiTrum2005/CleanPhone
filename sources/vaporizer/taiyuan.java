package vaporizer;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Singleton;

/* JADX INFO: compiled from: MetadataBackendRegistry.java */
/* JADX INFO: loaded from: classes2.dex */
@Singleton
public class taiyuan implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final attabal f39293attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final Map<String, apical> f39294dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final competently f39295saneness;

    /* JADX INFO: compiled from: MetadataBackendRegistry.java */
    public static class attabal {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final Context f39296attabal;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name */
        public Map<String, String> f39297saneness = null;

        public attabal(Context context) {
            this.f39296attabal = context;
        }

        public static Bundle wireman(Context context) {
            ServiceInfo serviceInfo;
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null || (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128)) == null) {
                    return null;
                }
                return serviceInfo.metaData;
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public final Map<String, String> attabal(Context context) {
            Bundle bundleWireman = wireman(context);
            if (bundleWireman == null) {
                return Collections.EMPTY_MAP;
            }
            HashMap map = new HashMap();
            for (String str : bundleWireman.keySet()) {
                Object obj = bundleWireman.get(str);
                if ((obj instanceof String) && str.startsWith("backend:")) {
                    for (String str2 : ((String) obj).split(",", -1)) {
                        String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        public final Map<String, String> dern() {
            if (this.f39297saneness == null) {
                this.f39297saneness = attabal(this.f39296attabal);
            }
            return this.f39297saneness;
        }

        public dern saneness(String str) {
            String str2 = dern().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (dern) Class.forName(str2).asSubclass(dern.class).getDeclaredConstructor(null).newInstance(null);
            } catch (ClassNotFoundException unused) {
                String.format("Class %s is not found.", str2);
                return null;
            } catch (IllegalAccessException unused2) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (InstantiationException unused3) {
                String.format("Could not instantiate %s.", str2);
                return null;
            } catch (NoSuchMethodException unused4) {
                String.format("Could not instantiate %s", str2);
                return null;
            } catch (InvocationTargetException unused5) {
                String.format("Could not instantiate %s", str2);
                return null;
            }
        }
    }

    @Inject
    public taiyuan(Context context, competently competentlyVar) {
        this(new attabal(context), competentlyVar);
    }

    @Override // vaporizer.wireman
    public synchronized apical get(String str) {
        if (this.f39294dern.containsKey(str)) {
            return this.f39294dern.get(str);
        }
        dern dernVarSaneness = this.f39293attabal.saneness(str);
        if (dernVarSaneness == null) {
            return null;
        }
        apical apicalVarCreate = dernVarSaneness.create(this.f39295saneness.attabal(str));
        this.f39294dern.put(str, apicalVarCreate);
        return apicalVarCreate;
    }

    public taiyuan(attabal attabalVar, competently competentlyVar) {
        this.f39294dern = new HashMap();
        this.f39293attabal = attabalVar;
        this.f39295saneness = competentlyVar;
    }
}
