package com.google.android.datatransport.runtime.backends;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.thinkup.core.common.n.mo;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Singleton;

/* JADX INFO: loaded from: classes3.dex */
@Singleton
class MetadataBackendRegistry implements BackendRegistry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BackendFactoryProvider f16864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CreationContextFactory f16865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f16866c;

    public static class BackendFactoryProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f16867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f16868b = null;

        public BackendFactoryProvider(Context context) {
            this.f16867a = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003b  */
        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
        public final BackendFactory a(String str) {
            Bundle bundle;
            Map map;
            Object obj;
            if (this.f16868b == null) {
                Context context = this.f16867a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        Log.w("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                        if (serviceInfo == null) {
                            Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            map = Collections.EMPTY_MAP;
                        } else {
                            HashMap map2 = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map2.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            map = map2;
                        }
                        this.f16868b = map;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.w("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map3 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    map = map3;
                }
                this.f16868b = map;
            }
            String str4 = (String) this.f16868b.get(str);
            if (str4 == null) {
                return null;
            }
            try {
                return (BackendFactory) Class.forName(str4).asSubclass(BackendFactory.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (ClassNotFoundException e2) {
                Log.w("BackendRegistry", "Class " + str4 + " is not found.", e2);
                return null;
            } catch (IllegalAccessException e3) {
                Log.w("BackendRegistry", "Could not instantiate " + str4 + mo.ono, e3);
                return null;
            } catch (InstantiationException e4) {
                Log.w("BackendRegistry", "Could not instantiate " + str4 + mo.ono, e4);
                return null;
            } catch (NoSuchMethodException e5) {
                Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e5);
                return null;
            } catch (InvocationTargetException e6) {
                Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e6);
                return null;
            }
        }
    }

    public MetadataBackendRegistry(Context context, CreationContextFactory creationContextFactory) {
        BackendFactoryProvider backendFactoryProvider = new BackendFactoryProvider(context);
        this.f16866c = new HashMap();
        this.f16864a = backendFactoryProvider;
        this.f16865b = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public final synchronized TransportBackend get(String str) {
        if (this.f16866c.containsKey(str)) {
            return (TransportBackend) this.f16866c.get(str);
        }
        BackendFactory backendFactoryA = this.f16864a.a(str);
        if (backendFactoryA == null) {
            return null;
        }
        CreationContextFactory creationContextFactory = this.f16865b;
        TransportBackend transportBackendCreate = backendFactoryA.create(new AutoValue_CreationContext(creationContextFactory.f16860a, creationContextFactory.f16861b, creationContextFactory.f16862c, str));
        this.f16866c.put(str, transportBackendCreate);
        return transportBackendCreate;
    }
}
