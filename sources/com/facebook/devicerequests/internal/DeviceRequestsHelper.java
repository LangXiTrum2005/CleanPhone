package com.facebook.devicerequests.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import android.os.Build;
import com.facebook.FacebookSdk;
import com.facebook.internal.FetchedAppSettings;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.SmartLoginOption;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.p004ironsource.d9;
import java.util.HashMap;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class DeviceRequestsHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap f16232a = new HashMap();

    public static void a(String str) {
        if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
            return;
        }
        try {
            if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
                return;
            }
            HashMap map = f16232a;
            try {
                NsdManager.RegistrationListener registrationListener = (NsdManager.RegistrationListener) map.get(str);
                if (registrationListener != null) {
                    try {
                        ((NsdManager) FacebookSdk.b().getSystemService("servicediscovery")).unregisterService(registrationListener);
                    } catch (IllegalArgumentException unused) {
                        HashSet hashSet = FacebookSdk.f15915a;
                    }
                    map.remove(str);
                }
            } catch (Throwable th) {
                CrashShieldHandler.a(DeviceRequestsHelper.class, th);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.a(DeviceRequestsHelper.class, th2);
        }
    }

    public static String b() {
        if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            map.put(d9.h.G, Build.DEVICE);
            map.put("model", Build.MODEL);
            return new JSONObject(map).toString();
        } catch (Throwable th) {
            CrashShieldHandler.a(DeviceRequestsHelper.class, th);
            return null;
        }
    }

    public static boolean c() {
        if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            FetchedAppSettings fetchedAppSettingsB = FetchedAppSettingsManager.b(FacebookSdk.c());
            return fetchedAppSettingsB != null && fetchedAppSettingsB.f16297e.contains(SmartLoginOption.Enabled);
        } catch (Throwable th) {
            CrashShieldHandler.a(DeviceRequestsHelper.class, th);
            return false;
        }
    }

    public static boolean d(final String str) {
        if (CrashShieldHandler.b(DeviceRequestsHelper.class)) {
            return false;
        }
        try {
            HashMap map = f16232a;
            if (map.containsKey(str)) {
                return true;
            }
            HashSet hashSet = FacebookSdk.f15915a;
            final String str2 = "fbsdk_" + ("android-" + "12.1.0".replace('.', '|')) + "_" + str;
            NsdServiceInfo nsdServiceInfo = new NsdServiceInfo();
            nsdServiceInfo.setServiceType("_fb._tcp.");
            nsdServiceInfo.setServiceName(str2);
            nsdServiceInfo.setPort(80);
            NsdManager nsdManager = (NsdManager) FacebookSdk.b().getSystemService("servicediscovery");
            NsdManager.RegistrationListener registrationListener = new NsdManager.RegistrationListener() { // from class: com.facebook.devicerequests.internal.DeviceRequestsHelper.1
                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onRegistrationFailed(NsdServiceInfo nsdServiceInfo2, int i2) {
                    DeviceRequestsHelper.a(str);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onServiceRegistered(NsdServiceInfo nsdServiceInfo2) {
                    if (str2.equals(nsdServiceInfo2.getServiceName())) {
                        return;
                    }
                    DeviceRequestsHelper.a(str);
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onServiceUnregistered(NsdServiceInfo nsdServiceInfo2) {
                }

                @Override // android.net.nsd.NsdManager.RegistrationListener
                public final void onUnregistrationFailed(NsdServiceInfo nsdServiceInfo2, int i2) {
                }
            };
            map.put(str, registrationListener);
            nsdManager.registerService(nsdServiceInfo, 1, registrationListener);
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.a(DeviceRequestsHelper.class, th);
            return false;
        }
    }
}
